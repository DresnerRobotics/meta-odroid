FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.16.4"
KBRANCH ?= "linux-4.16.y"
SRCREV ?= "b42b71cd28f213cf4688b9891e66b57bdb6eefe8"

require linux-stable.inc

SRC_URI += " file://odroid.scc"
