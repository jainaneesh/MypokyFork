DESCRIPTION = "Boot-time ASCII banner using figlet"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI +=  "file://banner.sh"

S = "${WORKDIR}"

RDEPENDS:${PN} += "figlet"

do_install() {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0755 ${WORKDIR}/banner.sh ${D}${sysconfdir}/profile.d/banner.sh
}
