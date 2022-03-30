SUMMARY = "Ninja is a small build system with a focus on speed."
HOMEPAGE = "http://martine.github.com/ninja/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=a81586a64ad4e476c791cda7e2f2c52e"

inherit debian-package
DEBIAN_QUILT_PATCHES = ""
require recipes-debian/sources/ninja-build.inc

DEPENDS = "re2c-native ninja-native"

SRC_URI_append = "file://0001-recipes-debian-ninja-Change-to-use-python3.patch"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>.*)"

do_configure[noexec] = "1"

do_compile_class-native() {
	./configure.py --bootstrap
}

do_compile() {
	./configure.py
	ninja
}

do_install() {
	install -D -m 0755  ${S}/ninja ${D}${bindir}/ninja
}

BBCLASSEXTEND = "native nativesdk"
