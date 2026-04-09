package com.wifi.netdiscovery.data;

import com.wifi.netdiscovery.consts.OS_TYPE;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class HostInfo implements Serializable {
    public String ipAddress = null;
    public String hardwareAddress = "00:00:00:00:00:00";
    public String hostName = "Unknow";
    public String vendor = "Unknow";
    public OS_TYPE os = OS_TYPE.UNKNOWN;
    public boolean isGateWay = false;
    public boolean isMine = false;
}
