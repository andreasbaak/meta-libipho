SUMMARY = "Installs the gpio-notify tool, a tool like inotify but for gpio files"
DESCRIPTION = "Get notified about a change in a gpio-value file by using this tool. Inotify does not work for gpio files."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRC_URI = "git://github.com/andreasbaak/gpio-notify.git"
SRCREV = "7a1d6eb83e79efa637f5b9fa647d452626f68dd6"

DEPENDS = "glib-2.0"
S = "${WORKDIR}/git/src"
inherit cmake

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"


