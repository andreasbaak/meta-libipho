SUMMARY = "Tools installed on the device "
LICENSE = "CLOSED"

PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
    nano \
    vim \
"
