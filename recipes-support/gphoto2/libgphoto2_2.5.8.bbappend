FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# The gphoto2 rules file allows only root to write to the camera device.
# The rule file supplied in this recipe allows the group "camera" to write
# to the camera as well.
#
# The rule file has been generated with the following command:
# /usr/lib/libgphoto2/print-camera-list udev-rules version 175 group camera > /etc/udev/rules.d/40-libgphoto2.rules

SRC_URI += "file://40-libgphoto2-camera-group.rules"

# Delete the original rule file, replace it with our version.
do_install_append() {
    install -d ${D}${sysconfdir}/udev/rules.d/
    rm ${WORKDIR}/40-libgphoto2.rules
    install -m 0755 ${WORKDIR}/40-libgphoto2-camera-group.rules ${D}${sysconfdir}/udev/rules.d/
}
