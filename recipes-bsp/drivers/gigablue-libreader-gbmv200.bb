SUMMARY = "player daemon helper"
MAINTAINER = "gigablue"

require conf/license/license-gplv2.inc

COMPATIBLE_MACHINE = "^(gbtrio4k|gbip4k)$"

PV = "1.0"

SRC_URI = "file://gigablue-libreader-gbmv200.sh"

INITSCRIPT_NAME = "gigablue-libreader"
INITSCRIPT_PARAMS = "start 05 S ."

inherit update-rc.d

S = "${WORKDIR}"

do_compile() {
}

do_install() {
    install -d ${D}${sysconfdir}/init.d/
    install -m 0755 ${WORKDIR}/gigablue-libreader-gbmv200.sh ${D}${sysconfdir}/init.d/gigablue-libreader
}
