package sh;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.view.kv.KvCard;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class k0 extends a {
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public ImageView f33702a0;

    /* renamed from: b0, reason: collision with root package name */
    public TextView f33703b0;

    /* renamed from: c0, reason: collision with root package name */
    public TextView f33704c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextView f33705d0;

    /* renamed from: e0, reason: collision with root package name */
    public KvCard f33706e0;

    /* renamed from: f0, reason: collision with root package name */
    public KvCard f33707f0;

    /* renamed from: g0, reason: collision with root package name */
    public ViewGroup f33708g0;

    /* renamed from: h0, reason: collision with root package name */
    public f0 f33709h0;

    /* renamed from: j0, reason: collision with root package name */
    public b5.t f33711j0;

    /* renamed from: n0, reason: collision with root package name */
    public HandlerThread f33715n0;

    /* renamed from: o0, reason: collision with root package name */
    public Handler f33716o0;

    /* renamed from: i0, reason: collision with root package name */
    public final kf f33710i0 = new kf(7, this, false);

    /* renamed from: k0, reason: collision with root package name */
    public final i0 f33712k0 = new i0(0, this);

    /* renamed from: l0, reason: collision with root package name */
    public final j0 f33713l0 = new j0(0, this);

    /* renamed from: m0, reason: collision with root package name */
    public int f33714m0 = 0;

    public static void h0(k0 k0Var, SignalStrength signalStrength) {
        int asuLevel;
        int dbm;
        if (Build.VERSION.SDK_INT < 29) {
            k0Var.f33705d0.setText(a4.a.n(signalStrength));
            return;
        }
        Iterator<CellSignalStrength> it = signalStrength.getCellSignalStrengths().iterator();
        while (true) {
            if (!it.hasNext()) {
                asuLevel = 0;
                dbm = Integer.MAX_VALUE;
                break;
            }
            CellSignalStrength next = it.next();
            dbm = next.getDbm();
            if (dbm == Integer.MAX_VALUE && (next instanceof CellSignalStrengthNr)) {
                dbm = ((CellSignalStrengthNr) next).getSsRsrp();
            }
            if (dbm != Integer.MAX_VALUE) {
                asuLevel = next.getAsuLevel();
                break;
            }
        }
        if (dbm == Integer.MAX_VALUE) {
            k0Var.f33705d0.setText("- dBm");
            return;
        }
        if (asuLevel == Integer.MAX_VALUE) {
            k0Var.f33705d0.setText(dbm + " dBm");
            return;
        }
        k0Var.f33705d0.setText(dbm + " dBm, " + asuLevel + " asu");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x0157
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.util.ArrayList i0() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.k0.i0():java.util.ArrayList");
    }

    public static ArrayList j0() {
        String strValueOf;
        String strValueOf2;
        ArrayList arrayList = new ArrayList();
        if (!wi.i.a(DeviceInfoApp.f21145f, "android.permission.READ_PHONE_STATE")) {
            arrayList.add(Collections.singletonList(li.b.a(3, DeviceInfoApp.f21145f.getString(R.string.missing_permission), DeviceInfoApp.f21145f.getString(R.string.grant_permission))));
            return arrayList;
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(DeviceInfoApp.f21145f).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null && !activeSubscriptionInfoList.isEmpty()) {
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.name), subscriptionInfo.getDisplayName(), false));
                boolean z3 = wi.h.f36761f;
                if (!z3 || wi.i.a(DeviceInfoApp.f21145f, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.phone_number), subscriptionInfo.getNumber(), false));
                } else {
                    arrayList2.add(li.b.a(2, DeviceInfoApp.f21145f.getString(R.string.phone_number), DeviceInfoApp.f21145f.getString(R.string.grant_permission)));
                }
                arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.country_iso), subscriptionInfo.getCountryIso(), false));
                if (!z3) {
                    arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.iccid), subscriptionInfo.getIccId(), false));
                }
                boolean z10 = wi.h.f36760e;
                if (z10) {
                    strValueOf = subscriptionInfo.getMccString();
                    strValueOf2 = subscriptionInfo.getMncString();
                } else {
                    strValueOf = String.valueOf(subscriptionInfo.getMcc());
                    strValueOf2 = String.valueOf(subscriptionInfo.getMnc());
                }
                arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.mcc), strValueOf, false));
                arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.mnc), strValueOf2, false));
                if (z10) {
                    arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.carrier_id), String.valueOf(subscriptionInfo.getCarrierId()), false));
                }
                arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.carrier_name), subscriptionInfo.getCarrierName(), false));
                arrayList2.add(li.b.b(DeviceInfoApp.f21145f.getString(R.string.data_roaming), DeviceInfoApp.f21145f.getString(subscriptionInfo.getDataRoaming() == 1 ? R.string.yes : R.string.no), false));
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (this.f33715n0 == null) {
            HandlerThread handlerThread = new HandlerThread("network_updater");
            this.f33715n0 = handlerThread;
            handlerThread.start();
        }
        if (this.f33716o0 == null) {
            this.f33716o0 = new Handler(this.f33715n0.getLooper());
        }
        this.f33711j0 = (b5.t) h(new b5.o0(3), new f0(this));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            this.Z = layoutInflater.inflate(R.layout.tab_network, viewGroup, false);
            ((ViewGroup) this.Z.findViewById(R.id.head_card)).setBackgroundTintList(dj.b.c(zh.i.b(W())));
            ScrollView scrollView = (ScrollView) this.Z;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.m(scrollView, com.liuzh.deviceinfo.utilities.f.d());
            this.f33706e0 = (KvCard) this.Z.findViewById(R.id.wifi_card);
            this.f33707f0 = (KvCard) this.Z.findViewById(R.id.mobile_card);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                this.f33707f0.setVisibility(8);
            }
            this.f33708g0 = (ViewGroup) this.Z.findViewById(R.id.sim_container);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                this.f33708g0.setVisibility(8);
            }
            f0 f0Var = new f0(this);
            this.f33709h0 = f0Var;
            this.f33706e0.setPermissionRequester(f0Var);
            this.f33707f0.setPermissionRequester(this.f33709h0);
            bi.d.c(new k1.b(16, this, W()));
            this.f33702a0 = (ImageView) this.Z.findViewById(R.id.iv_network);
            this.f33703b0 = (TextView) this.Z.findViewById(R.id.network_name);
            this.f33704c0 = (TextView) this.Z.findViewById(R.id.network_type);
            this.f33705d0 = (TextView) this.Z.findViewById(R.id.signal_strength);
            m0();
        }
        return this.Z;
    }

    @Override // b5.z
    public final void L() {
        TelephonyManager telephonyManager;
        this.F = true;
        W().unregisterReceiver(this.f33710i0);
        bi.d.f2269a.removeCallbacks(this.f33712k0);
        if (Build.VERSION.SDK_INT >= 28 || (telephonyManager = (TelephonyManager) W().getSystemService("phone")) == null) {
            return;
        }
        telephonyManager.listen(this.f33713l0, 0);
    }

    @Override // b5.z
    public final void N() {
        TelephonyManager telephonyManager;
        this.F = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        W().registerReceiver(this.f33710i0, intentFilter);
        this.f33712k0.run();
        if (Build.VERSION.SDK_INT >= 28 || (telephonyManager = (TelephonyManager) W().getSystemService("phone")) == null) {
            return;
        }
        telephonyManager.listen(this.f33713l0, 256);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ph.d dVar = new ph.d(4, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, dVar);
    }

    public final ArrayList k0() {
        String str;
        String string;
        Enumeration<NetworkInterface> networkInterfaces;
        String string2;
        Enumeration<InetAddress> inetAddresses;
        String string3;
        WifiInfo connectionInfo;
        String bssid;
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        ArrayList arrayList = new ArrayList();
        boolean zW = a4.a.w();
        arrayList.add(li.b.b(deviceInfoApp.getString(R.string.status), deviceInfoApp.getString(zW ? R.string.connected : R.string.not_connected), false));
        if (zW) {
            if (wi.i.a(deviceInfoApp, "android.permission.ACCESS_FINE_LOCATION")) {
                String string4 = deviceInfoApp.getString(R.string.safety);
                DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                if (a.a.a(deviceInfoApp2, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    string3 = DeviceInfoApp.f21145f.getString(R.string.missing_permission);
                } else {
                    string3 = deviceInfoApp2.getString(R.string.unknown);
                    WifiManager wifiManager = (WifiManager) deviceInfoApp2.getSystemService("wifi");
                    if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                        try {
                            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                            if (configuredNetworks != null) {
                                if (!configuredNetworks.isEmpty()) {
                                    for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                                        if (TextUtils.equals(connectionInfo.getSSID(), wifiConfiguration.SSID) && connectionInfo.getNetworkId() == wifiConfiguration.networkId) {
                                            string3 = wifiConfiguration.allowedKeyManagement.get(1) ? "WPA_PSK" : wifiConfiguration.allowedKeyManagement.get(2) ? "WPA_EAP" : wifiConfiguration.allowedKeyManagement.get(3) ? "IEEE8021X" : wifiConfiguration.allowedKeyManagement.get(4) ? "WPA2_PSK" : wifiConfiguration.allowedKeyManagement.get(5) ? "OSEN" : wifiConfiguration.allowedKeyManagement.get(6) ? "FT_PSK" : wifiConfiguration.allowedKeyManagement.get(7) ? "FT_EAP" : (wifiConfiguration.allowedKeyManagement.get(8) || wifiConfiguration.allowedKeyManagement.get(8)) ? "SAE" : wifiConfiguration.allowedKeyManagement.get(9) ? "OWE" : wifiConfiguration.allowedKeyManagement.get(10) ? "SUITE_B_192" : wifiConfiguration.allowedKeyManagement.get(11) ? "WPA_PSK_SHA256" : wifiConfiguration.allowedKeyManagement.get(12) ? "WPA_EAP_SHA256" : (wifiConfiguration.allowedKeyManagement.get(0) || wifiConfiguration.wepKeys[0] == null) ? "NONE" : "WEP";
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                arrayList.add(li.b.b(string4, string3, false));
                String string5 = deviceInfoApp.getString(R.string.bssid);
                WifiInfo wifiInfoQ = a4.a.q();
                if (wifiInfoQ == null) {
                    bssid = DeviceInfoApp.f21145f.getString(R.string.unknown);
                } else {
                    bssid = wifiInfoQ.getBSSID();
                    if (TextUtils.equals(bssid, "02:00:00:00:00:00")) {
                        bssid = DeviceInfoApp.f21145f.getString(R.string.missing_permission);
                    } else if (TextUtils.isEmpty(bssid)) {
                        bssid = DeviceInfoApp.f21145f.getString(R.string.unknown);
                    }
                }
                arrayList.add(li.b.b(string5, bssid, false));
            } else {
                arrayList.add(li.b.a(1, deviceInfoApp.getString(R.string.safety), deviceInfoApp.getString(R.string.grant_permission)));
                arrayList.add(li.b.a(1, deviceInfoApp.getString(R.string.bssid), deviceInfoApp.getString(R.string.grant_permission)));
            }
            String string6 = deviceInfoApp.getString(R.string.dhcp_server);
            DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
            WifiManager wifiManager2 = (WifiManager) deviceInfoApp3.getSystemService("wifi");
            DhcpInfo dhcpInfo = wifiManager2 == null ? null : wifiManager2.getDhcpInfo();
            arrayList.add(li.b.b(string6, dhcpInfo == null ? deviceInfoApp3.getString(R.string.unknown) : a4.a.r(dhcpInfo.serverAddress), false));
            String string7 = deviceInfoApp.getString(R.string.dhcp_lease_duration);
            WifiManager wifiManager3 = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
            DhcpInfo dhcpInfo2 = wifiManager3 == null ? null : wifiManager3.getDhcpInfo();
            if (dhcpInfo2 == null) {
                string = DeviceInfoApp.f21145f.getString(R.string.unknown);
                str = "wifi";
            } else {
                long j = dhcpInfo2.leaseDuration * 1000;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long hours = timeUnit.toHours(j);
                str = "wifi";
                long minutes = timeUnit.toMinutes(j);
                string = String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes - TimeUnit.HOURS.toMinutes(hours)), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(minutes)));
            }
            arrayList.add(li.b.b(string7, string, false));
            WifiManager wifiManager4 = (WifiManager) DeviceInfoApp.f21145f.getSystemService(str);
            DhcpInfo dhcpInfo3 = wifiManager4 == null ? null : wifiManager4.getDhcpInfo();
            if (dhcpInfo3 == null) {
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.gateway), deviceInfoApp.getString(R.string.unknown), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.sub_netmask), deviceInfoApp.getString(R.string.unknown), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.dns1), deviceInfoApp.getString(R.string.unknown), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.dns2), deviceInfoApp.getString(R.string.unknown), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.ip_address), deviceInfoApp.getString(R.string.unknown), false));
            } else {
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.gateway), a4.a.r(dhcpInfo3.gateway), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.sub_netmask), a4.a.r(dhcpInfo3.netmask), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.dns1), a4.a.r(dhcpInfo3.dns1), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.dns2), a4.a.r(dhcpInfo3.dns2), false));
                arrayList.add(li.b.b(deviceInfoApp.getString(R.string.ip_address), a4.a.r(dhcpInfo3.ipAddress), false));
            }
            String strH = a4.a.h();
            String string8 = deviceInfoApp.getString(R.string.ipv6);
            boolean zEquals = TextUtils.equals(strH, DeviceInfoApp.f21145f.getString(R.string.unknown));
            boolean zV = a4.a.v(DeviceInfoApp.f21145f.getResources());
            if (zEquals || mg.d.f29372a) {
                zV = false;
            }
            arrayList.add(li.b.b(string8, strH, zV));
            String string9 = deviceInfoApp.getString(R.string.interface_name);
            try {
                networkInterfaces = NetworkInterface.getNetworkInterfaces();
            } catch (Exception unused2) {
                networkInterfaces = null;
            }
            loop0: while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement != null && (inetAddresses = networkInterfaceNextElement.getInetAddresses()) != null) {
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (inetAddressNextElement != null && !inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                            string2 = networkInterfaceNextElement.getDisplayName();
                            break loop0;
                        }
                    }
                }
            }
            string2 = DeviceInfoApp.f21145f.getString(R.string.unknown);
            arrayList.add(li.b.b(string9, string2, false));
        }
        if (zW) {
            String string10 = deviceInfoApp.getString(R.string.link_speed);
            WifiInfo wifiInfoQ2 = a4.a.q();
            arrayList.add(li.b.b(string10, wifiInfoQ2 == null ? "0 Mbps" : wifiInfoQ2.getLinkSpeed() + " Mbps", false));
            String string11 = deviceInfoApp.getString(R.string.frequency);
            StringBuilder sb2 = new StringBuilder();
            WifiInfo wifiInfoQ3 = a4.a.q();
            sb2.append(wifiInfoQ3 == null ? 0 : wifiInfoQ3.getFrequency());
            sb2.append(" MHz");
            arrayList.add(li.b.b(string11, sb2.toString(), false));
        }
        li.b bVarB = li.b.b(deviceInfoApp.getString(R.string.wifi_feature_supported), deviceInfoApp.getString(R.string.view), false);
        bVarB.f28824e = new aa.j(12, this);
        arrayList.add(bVarB);
        return arrayList;
    }

    public final void l0(Context context) {
        if (c0() || context == null || this.Z == null) {
            return;
        }
        m0();
        this.f33716o0.post(new com.applovin.mediation.nativeAds.adPlacer.a(this, context, this.f33714m0, 10));
    }

    public final void m0() {
        WifiInfo connectionInfo;
        String ssid;
        if (c0() || this.Z == null) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) W().getSystemService("phone");
        boolean zA = wi.i.a(W(), "android.permission.ACCESS_FINE_LOCATION");
        final int i4 = 1;
        final int i10 = 0;
        if (a4.a.w()) {
            this.f33702a0.setImageResource(R.drawable.ic_network_wifi);
            if (zA) {
                this.f33703b0.setClickable(false);
                this.f33703b0.setFocusable(false);
                TextView textView = this.f33703b0;
                WifiManager wifiManager = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
                if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                    ssid = DeviceInfoApp.f21145f.getString(R.string.unknown);
                } else {
                    ssid = connectionInfo.getSSID();
                    if (!TextUtils.isEmpty(ssid) && ssid.length() > 2) {
                        ssid = ssid.substring(1, ssid.length() - 1);
                    }
                }
                textView.setText(ssid);
            } else {
                if (com.liuzh.deviceinfo.utilities.d.k()) {
                    com.liuzh.deviceinfo.utilities.y.j(1.1f, this.f33703b0);
                }
                this.f33703b0.setFocusable(true);
                this.f33703b0.setText(R.string.grant_permission);
                this.f33703b0.setOnClickListener(new View.OnClickListener(this) { // from class: sh.h0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k0 f33690b;

                    {
                        this.f33690b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                k0 k0Var = this.f33690b;
                                Context contextW = k0Var.W();
                                String[] strArr = zg.c.f38280b;
                                if (wi.i.b(contextW, strArr)) {
                                    Context contextP = k0Var.p();
                                    new Intent();
                                    k0Var.l0(contextP);
                                    break;
                                } else {
                                    if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_location_permission", false) ? true : wi.i.d(k0Var, strArr))) {
                                        nh.a.j(k0Var.W(), "com.liuzh.deviceinfo");
                                        break;
                                    } else {
                                        try {
                                            k0Var.f33711j0.a(strArr);
                                            com.liuzh.deviceinfo.utilities.f.k("already_request_location_permission", true);
                                            break;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                }
                            default:
                                k0 k0Var2 = this.f33690b;
                                if (wi.i.a(k0Var2.W(), "android.permission.READ_PHONE_STATE")) {
                                    Context contextP2 = k0Var2.p();
                                    new Intent();
                                    k0Var2.l0(contextP2);
                                    break;
                                } else {
                                    if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_read_phone_state_permission", false) ? true : wi.i.d(k0Var2, "android.permission.READ_PHONE_STATE"))) {
                                        nh.a.j(k0Var2.W(), "com.liuzh.deviceinfo");
                                        break;
                                    } else {
                                        try {
                                            k0Var2.f33711j0.a(new String[]{"android.permission.READ_PHONE_STATE"});
                                            com.liuzh.deviceinfo.utilities.f.k("already_request_read_phone_state_permission", true);
                                            break;
                                        } catch (ActivityNotFoundException unused2) {
                                            return;
                                        }
                                    }
                                }
                        }
                    }
                });
            }
        } else if (a4.a.t()) {
            this.f33702a0.setImageResource(R.drawable.ic_network_cell);
            this.f33703b0.setClickable(false);
            this.f33703b0.setFocusable(false);
            if (telephonyManager == null) {
                this.f33703b0.setText(R.string.unknown);
            } else if (!wi.h.f36761f || wi.i.a(W(), "android.permission.READ_PHONE_STATE")) {
                this.f33703b0.setText(telephonyManager.getNetworkOperatorName() + " " + com.liuzh.deviceinfo.utilities.l.f0(telephonyManager.getNetworkType()));
            } else {
                this.f33703b0.setText(R.string.grant_permission);
                this.f33703b0.setFocusable(true);
                this.f33703b0.setOnClickListener(new View.OnClickListener(this) { // from class: sh.h0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k0 f33690b;

                    {
                        this.f33690b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                k0 k0Var = this.f33690b;
                                Context contextW = k0Var.W();
                                String[] strArr = zg.c.f38280b;
                                if (wi.i.b(contextW, strArr)) {
                                    Context contextP = k0Var.p();
                                    new Intent();
                                    k0Var.l0(contextP);
                                    break;
                                } else {
                                    if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_location_permission", false) ? true : wi.i.d(k0Var, strArr))) {
                                        nh.a.j(k0Var.W(), "com.liuzh.deviceinfo");
                                        break;
                                    } else {
                                        try {
                                            k0Var.f33711j0.a(strArr);
                                            com.liuzh.deviceinfo.utilities.f.k("already_request_location_permission", true);
                                            break;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                }
                            default:
                                k0 k0Var2 = this.f33690b;
                                if (wi.i.a(k0Var2.W(), "android.permission.READ_PHONE_STATE")) {
                                    Context contextP2 = k0Var2.p();
                                    new Intent();
                                    k0Var2.l0(contextP2);
                                    break;
                                } else {
                                    if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_read_phone_state_permission", false) ? true : wi.i.d(k0Var2, "android.permission.READ_PHONE_STATE"))) {
                                        nh.a.j(k0Var2.W(), "com.liuzh.deviceinfo");
                                        break;
                                    } else {
                                        try {
                                            k0Var2.f33711j0.a(new String[]{"android.permission.READ_PHONE_STATE"});
                                            com.liuzh.deviceinfo.utilities.f.k("already_request_read_phone_state_permission", true);
                                            break;
                                        } catch (ActivityNotFoundException unused2) {
                                            return;
                                        }
                                    }
                                }
                        }
                    }
                });
            }
        } else {
            this.f33702a0.setImageResource(R.drawable.ic_signal_cellular_notconnected);
            this.f33703b0.setClickable(false);
            this.f33703b0.setFocusable(false);
            this.f33703b0.setText(R.string.unknown);
        }
        if (a4.a.w()) {
            this.f33704c0.setText(R.string.wifi);
        } else if (a4.a.t()) {
            this.f33704c0.setText(R.string.mobile_data);
        } else {
            this.f33704c0.setText(R.string.no_connect);
        }
    }
}
