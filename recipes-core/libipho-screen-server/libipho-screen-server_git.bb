SUMMARY = "The libipho screen server sends the image data from the embedded board to an Android app."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=4d2bc85d26a6eaa82f98de9241a4048a"

SRC_URI = "git://github.com/andreasbaak/libipho-screen-server.git"
SRCREV = "a28cf4a9d9e516e6f20242f5e846545991e51fe1"

S = "${WORKDIR}/git/src"
inherit cmake

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"

