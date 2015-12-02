FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://dropbear.conf "

do_install_append() {
	install -m 0640 ${WORKDIR}/dropbear.conf ${D}${sysconfdir}/default/dropbear
}

