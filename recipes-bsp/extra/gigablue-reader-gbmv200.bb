SUMMARY = "libreader for Gigablue Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "libsdl"

COMPATIBLE_MACHINE = "^(gbtrio4k|gbip4k)$"

SRCDATE = "20190907"

PV = "${SRCDATE}"

SRC_URI = "http://source.mynonpublic.com/gigablue/mv200/gbmv200-libreader-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "ed55ac214c7f4f294db1a15c0a2612d6"
SRC_URI[sha256sum] = "48d357a723674a1c72f5870f57bea3c9399dde51bf869ad1a553fc53300b1b67"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/libreader ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/libreader"
