SUMMARY = "Sets the LIBIPHO_BASE env variable."
DESCRIPTION = "The LIBIPHO_BASE variable is needed for the all users in the system. Therefore, a script in /etc/profile.d folder is used to set the variable."
PR = "r0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://set-libipho-base"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/${sysconfdir}/profile.d
	install -m 0644 set-libipho-base ${D}/${sysconfdir}/profile.d
}

