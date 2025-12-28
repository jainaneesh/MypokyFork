SUMMARY = "Enable ICMP ping in iptables"
LICENSE = "CLOSED"

SRC_URI = "file://enable-ping.sh"

S = "${WORKDIR}"

do_install() {
     install -d ${D}${sysconfdir}/init.d
     install -m 0755 ${WORKDIR}/enable-ping.sh ${D}${sysconfdir}/init.d/enable-ping
}

inherit update-rc.d
INITSCRIPT_NAME = "enable-ping"
INITSCRIPT_PARAMS = "defaults"
