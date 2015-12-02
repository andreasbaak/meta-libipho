SUMMARY = "Installs Libipho scripts"
require libipho-core.inc

PR = "r0"

DEPENDS_${PN} += "useradd-libipho"
RDEPENDS_${PN} += "bash lighttpd useradd-libipho"

S = "${WORKDIR}/git"

do_install() {
	install -o libipho -m 0755 -d ${D}/home/libipho
	install -o libipho -m 0755 -d ${D}/home/libipho/libipho
        cp -r ${S}/libipho-scripts/* ${D}/home/libipho/libipho/
        chown -R libipho ${D}/home/libipho/libipho/
	install -o libipho -m 0755 -d ${D}/home/libipho/www
        cp -r ${S}/html/* ${D}/home/libipho/www
        chown -R libipho ${D}/home/libipho/www
}

FILES_${PN} = "/home/libipho/libipho/* /home/libipho/www/*"

