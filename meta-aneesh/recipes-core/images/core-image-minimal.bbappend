IMAGE_INSTALL:append = " figlet banner"

IMAGE_INSTALL:append = " packagegroup-core-buildessential"

IMAGE_INSTALL:append = " iptables"

IMAGE_INSTALL:append = " iptables-ping"

IMAGE_INSTALL:append = " openssh openssh-sftp-server openssh-keygen openssh-scp"

IMAGE_INSTALL:append = " packagegroup-aneesh-essentials"

ROOTFS_POSTPROCESS_COMMAND:append = " create_external_mount_point; append_fstab_entry; append_interfaces; "

create_external_mount_point() {
	mkdir -p ${IMAGE_ROOTFS}/mnt/external
}
append_fstab_entry() {
	echo '/dev/vdb1 /mnt/external ext4 defaults 0 0' >> ${IMAGE_ROOTFS}/etc/fstab
}
append_interfaces() {
	cat <<EOF >> ${IMAGE_ROOTFS}/etc/network/interfaces

auto eth0
iface eth0 inet static
    address 10.10.0.100
    netmask 255.255.255.0
    gateway 10.10.0.1
    dns-nameservers 8.8.8.8 1.1.1.1

EOF
}
