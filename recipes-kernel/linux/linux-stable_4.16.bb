FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.16.3"
KBRANCH ?= "linux-4.16.y"
SRCREV ?= "9667e83dd0a156f1ad66245ab75a125222a58d7c"

require linux-stable.inc

SRC_URI_append = " file://odroid.scc"
SRC_URI_append_odroid-xu3 = " file://${O_KERNEL_CONFIG}/fb.cfg"
SRC_URI_append_odroid-xu3-lite = " file://${O_KERNEL_CONFIG}/fb.cfg"
SRC_URI_append_odroid-xu4 = " file://${O_KERNEL_CONFIG}/fb.cfg"
