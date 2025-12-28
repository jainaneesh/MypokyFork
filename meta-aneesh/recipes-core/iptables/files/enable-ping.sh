#!/bin/sh
# Allow all ICMP requests
iptables -A INPUT -p icmp -j ACCEPT
