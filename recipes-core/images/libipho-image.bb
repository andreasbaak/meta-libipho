DESCRIPTION = "The image that runs the Libipho photo booth."
inherit core-image

IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_INSTALL += "\
  packagegroup-core-boot \
  dropbear \
  epeg \
  gphoto2 \
  gpio-notify \
  lighttpd \
  libipho-core \
  libipho-startup-scripts \
  packagegroup-libipho-debug-tools \
  set-libipho-base \
  useradd-libipho \
"

IMAGE_LINGUAS = " "
LICENSE = "MIT"
IMAGE_ROOTFS_SIZE = "8192"

inherit extrausers
EXTRA_USERS_PARAMS = "\
  usermod -p '\$1\$n/oIbMZG\$g6MxP1QAaFuItW0PB7lO31' root; \
"
