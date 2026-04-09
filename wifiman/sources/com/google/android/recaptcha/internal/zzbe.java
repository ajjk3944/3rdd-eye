package com.google.android.recaptcha.internal;

import Yg.z;
import Zg.U;
import Zg.d0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return d0.e();
        }
    }

    private static final Map zzb() {
        Map mapL = U.l(z.a(0, zzqi.NET_CAPABILITY_MMS), z.a(1, zzqi.NET_CAPABILITY_SUPL), z.a(2, zzqi.NET_CAPABILITY_DUN), z.a(3, zzqi.NET_CAPABILITY_FOTA), z.a(4, zzqi.NET_CAPABILITY_IMS), z.a(5, zzqi.NET_CAPABILITY_CBS), z.a(6, zzqi.NET_CAPABILITY_WIFI_P2P), z.a(7, zzqi.NET_CAPABILITY_IA), z.a(8, zzqi.NET_CAPABILITY_RCS), z.a(9, zzqi.NET_CAPABILITY_XCAP), z.a(10, zzqi.NET_CAPABILITY_EIMS), z.a(11, zzqi.NET_CAPABILITY_NOT_METERED), z.a(12, zzqi.NET_CAPABILITY_INTERNET), z.a(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), z.a(14, zzqi.NET_CAPABILITY_TRUSTED), z.a(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i10 = Build.VERSION.SDK_INT;
        mapL.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        mapL.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i10 >= 28) {
            mapL.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            mapL.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            mapL.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            mapL.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i10 >= 29) {
            mapL.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i10 >= 30) {
            mapL.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i10 >= 31) {
            mapL.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            mapL.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i10 >= 33) {
            mapL.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            mapL.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            mapL.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return mapL;
    }
}
