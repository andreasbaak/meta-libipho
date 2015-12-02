SUMMARY = "Adds user libipho and group camera"
DESCRIPTION = "In the Libipho image, the web server and all scripts and tools \
 should run as a non-root user. Therefore, this recipe adds a suitable user."
SECTION = "examples"
PR = "r3"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
inherit useradd

S = "${WORKDIR}"

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "camera"
USERADD_PARAM_${PN} = "-u 1000 -G camera -d /home/libipho -r -s /bin/bash -P 'bootylicious' libipho;"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

