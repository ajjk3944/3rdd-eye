package com.wifihacker.detector.data;

import com.wifi.netdiscovery.data.HostInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class HistoryInfo implements Serializable {
    public boolean hasWifiPassword;
    public List<HostInfo> offLineList;
    public List<HostInfo> onLineList;
    public long scanTime;
    public String wifiName = "";
    public String Bssid = "";
}
