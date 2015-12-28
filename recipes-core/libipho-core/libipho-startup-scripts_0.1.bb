SUMMARY = "Install Libipho system startup scripts"
require libipho-core.inc

PR = "r0"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    install -d ${D}${sysconfdir}/rc1.d
    install -d ${D}${sysconfdir}/rc2.d
    install -d ${D}${sysconfdir}/rc3.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc5.d

    install -m 0755 ${S}/init-scripts/libipho               ${D}${sysconfdir}/init.d/
    install -m 0755 ${S}/init-scripts/libipho-gpio-button   ${D}${sysconfdir}/init.d/
    install -m 0755 ${S}/init-scripts/libipho-gpio-trigger  ${D}${sysconfdir}/init.d/
    install -m 0755 ${S}/init-scripts/libipho-screen-server ${D}${sysconfdir}/init.d/

    ln -sf ../init.d/libipho      ${D}${sysconfdir}/rc1.d/K90libipho
    ln -sf ../init.d/libipho      ${D}${sysconfdir}/rc2.d/K90libipho
    ln -sf ../init.d/libipho      ${D}${sysconfdir}/rc3.d/K90libipho
    ln -sf ../init.d/libipho      ${D}${sysconfdir}/rc4.d/K90libipho
    ln -sf ../init.d/libipho      ${D}${sysconfdir}/rc5.d/S90libipho

    ln -sf ../init.d/libipho-gpio-button      ${D}${sysconfdir}/rc1.d/K90libipho-gpio-button
    ln -sf ../init.d/libipho-gpio-button      ${D}${sysconfdir}/rc2.d/K90libipho-gpio-button
    ln -sf ../init.d/libipho-gpio-button      ${D}${sysconfdir}/rc3.d/K90libipho-gpio-button
    ln -sf ../init.d/libipho-gpio-button      ${D}${sysconfdir}/rc4.d/K90libipho-gpio-button
    ln -sf ../init.d/libipho-gpio-button      ${D}${sysconfdir}/rc5.d/S90libipho-gpio-button

    ln -sf ../init.d/libipho-gpio-trigger      ${D}${sysconfdir}/rc1.d/K90libipho-gpio-trigger
    ln -sf ../init.d/libipho-gpio-trigger      ${D}${sysconfdir}/rc2.d/K90libipho-gpio-trigger
    ln -sf ../init.d/libipho-gpio-trigger      ${D}${sysconfdir}/rc3.d/K90libipho-gpio-trigger
    ln -sf ../init.d/libipho-gpio-trigger      ${D}${sysconfdir}/rc4.d/K90libipho-gpio-trigger
    ln -sf ../init.d/libipho-gpio-trigger      ${D}${sysconfdir}/rc5.d/S90libipho-gpio-trigger

    ln -sf ../init.d/libipho-screen-server    ${D}${sysconfdir}/rc1.d/K90libipho-screen-server
    ln -sf ../init.d/libipho-screen-server    ${D}${sysconfdir}/rc2.d/K90libipho-screen-server
    ln -sf ../init.d/libipho-screen-server    ${D}${sysconfdir}/rc3.d/K90libipho-screen-server
    ln -sf ../init.d/libipho-screen-server    ${D}${sysconfdir}/rc4.d/K90libipho-screen-server
    ln -sf ../init.d/libipho-screen-server    ${D}${sysconfdir}/rc5.d/S90libipho-screen-server
}

