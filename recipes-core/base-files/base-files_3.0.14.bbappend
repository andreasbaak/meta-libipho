FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Also allow bash as login shell
do_install_append() {
	echo "/bin/bash" >> ${D}${sysconfdir}/shells
}


BASEFILESISSUEINSTALL = "do_install_myissuefile"

do_install_myissuefile () {
        install -m 644 ${WORKDIR}/issue*  ${D}${sysconfdir}
        if [ -n "${DISTRO_NAME}" ]; then
                printf "${DISTRO_NAME} " >> ${D}${sysconfdir}/issue
                if [ -n "${DISTRO_VERSION}" ]; then
                        printf "${DISTRO_VERSION} " >> ${D}${sysconfdir}/issue
                fi
                printf "\\\n \\\l\n" >> ${D}${sysconfdir}/issue
                printf "Welcome to Libipho!" >>${D}${sysconfdir}/issue
                echo >> ${D}${sysconfdir}/issue
                echo 
        fi
}
