require gnutls.inc

SRC_URI += " \
    file://configure.ac-fix-sed-command.patch \
    file://use-pkg-config-to-locate-zlib.patch \
    file://correct_rpl_gettimeofday_signature.patch \
    file://x509-optimize-subject-alternative-name-access.patch \
"
SRC_URI[md5sum] = "de7a58232d42b1d71baf38a06dc34412"
SRC_URI[sha256sum] = "fa9d13f1bc35b81fac85152906b8d4950f4f5a90d76d5b406c1167728770c94a"

PACKAGECONFIG[padlock] = "--enable-padlock,--disable-padlock,"
