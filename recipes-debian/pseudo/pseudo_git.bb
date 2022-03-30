require pseudo.inc

SRC_URI = "git://git.yoctoproject.org/pseudo \
           file://0001-configure-Prune-PIE-flags.patch \
           file://fallback-passwd \
           file://fallback-group \
           file://moreretries.patch \
           file://toomanyfiles.patch \
           file://0001-Add-statx.patch \
           file://0001-seudo-Use-python3.patch \
           "

SRCREV = "060058bb29f70b244e685b3c704eb0641b736f73"
S = "${WORKDIR}/git"
PV = "1.9.0+git${SRCPV}"

