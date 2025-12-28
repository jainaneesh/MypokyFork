SUMMARY = "Aneesh essentials: common Linux utilities for debugging and day-to-day use"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
    bash \
    coreutils \
    findutils \
    grep \
    sed \
    gawk \
    diffutils \
    less \
    file \
    which \
    procps \
    util-linux \
    iproute2 \
    net-tools \
    iputils \
    ethtool \
    curl \
    wget \
    ca-certificates \
    nano \
    vim \
"

