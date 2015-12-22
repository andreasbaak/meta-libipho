SUMMARY = "The libipho screen server sends the image data from the embedded board to an Android app."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=4d2bc85d26a6eaa82f98de9241a4048a"

SRC_URI = "git://github.com/andreasbaak/libipho-screen-server.git"
SRCREV = "7e417a96b6a8a272cf44a58590be38efd1c469e9"

S = "${WORKDIR}/git/src"
inherit cmake

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"

