FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS_${PN} += "useradd-libipho "
RDEPENDS_${PN} += "useradd-libipho "

FILES_${PN} += "/home/libipho/www"
FILES_${PN} += "/home/libipho/www-logs"

# configure lighthttpd to run as user "libipho"
# --owner=libipho --group=libipho
do_install_prepend() {
	install -o libipho -m 0750 -d ${D}/home/libipho
	install -o libipho -m 0750 -d ${D}/home/libipho/www
	install -o libipho -m 0750 -d ${D}/home/libipho/www-logs
	sed -i 's|^server\.document-root.*$|server.document-root = "/home/libipho/www"|g' ${WORKDIR}/lighttpd.conf
	sed -i 's|^server\.errorlog.*$|server.errorlog = "/home/libipho/www-logs/lighttpd.error.log"|g' ${WORKDIR}/lighttpd.conf
	sed -i 's|^#server\.username.*$|server.username = "libipho"|g' ${WORKDIR}/lighttpd.conf
	sed -i 's|^#server\.groupname.*$|server.groupname = "libipho"|g' ${WORKDIR}/lighttpd.conf
	sed -i 's|^accesslog\.filename.*$|accesslog.filename = "/home/libipho/www-logs/access.log"|g' ${WORKDIR}/lighttpd.conf
	sed -i 's|^debug\.log-request-handling.*$|debug.log-request-handling = "disable"|g' ${WORKDIR}/lighttpd.conf
}

