package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Result;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final c INSTANCE = new c();

    private c() {
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !p.a(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final int getSensorCount(@NotNull Context context) {
        p.e(context, "context");
        Object systemService = context.getSystemService("sensor");
        p.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(@NotNull Context context) {
        p.e(context, "context");
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isEmulator() {
        /*
            r16 = this;
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = ""
            java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r0 == 0) goto L13
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r3)
            kotlin.jvm.internal.p.d(r0, r2)
            if (r0 != 0) goto L14
        L13:
            r0 = r1
        L14:
            java.lang.String r3 = android.os.Build.MODEL
            if (r3 == 0) goto L23
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            kotlin.jvm.internal.p.d(r3, r2)
            if (r3 != 0) goto L24
        L23:
            r3 = r1
        L24:
            java.lang.String r4 = android.os.Build.PRODUCT
            if (r4 == 0) goto L33
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            kotlin.jvm.internal.p.d(r4, r2)
            if (r4 != 0) goto L34
        L33:
            r4 = r1
        L34:
            java.lang.String r5 = android.os.Build.BRAND
            if (r5 == 0) goto L43
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            kotlin.jvm.internal.p.d(r5, r2)
            if (r5 != 0) goto L44
        L43:
            r5 = r1
        L44:
            java.lang.String r6 = android.os.Build.MANUFACTURER
            if (r6 == 0) goto L53
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            kotlin.jvm.internal.p.d(r6, r2)
            if (r6 != 0) goto L54
        L53:
            r6 = r1
        L54:
            java.lang.String r7 = android.os.Build.BOARD
            if (r7 == 0) goto L65
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            kotlin.jvm.internal.p.d(r7, r2)
            if (r7 != 0) goto L64
            goto L65
        L64:
            r1 = r7
        L65:
            java.lang.String[] r7 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r8 = "SUPPORTED_ABIS"
            kotlin.jvm.internal.p.d(r7, r8)
            r14 = 63
            r15 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r7 = z8.o.N(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            kotlin.jvm.internal.p.d(r7, r2)
            java.lang.String r2 = "generic"
            r8 = 0
            r9 = 2
            boolean r11 = s9.u.P(r0, r2, r8, r9, r10)
            if (r11 != 0) goto Ld2
            java.lang.String r11 = "emulator"
            boolean r0 = s9.u.P(r0, r11, r8, r9, r10)
            if (r0 != 0) goto Ld2
            java.lang.String r0 = "google_sdk"
            boolean r0 = s9.u.P(r3, r0, r8, r9, r10)
            if (r0 != 0) goto Ld2
            boolean r0 = s9.u.P(r3, r11, r8, r9, r10)
            if (r0 != 0) goto Ld2
            java.lang.String r0 = "sdk"
            boolean r0 = s9.u.P(r4, r0, r8, r9, r10)
            if (r0 != 0) goto Ld2
            java.lang.String r0 = "vbox"
            boolean r0 = s9.u.P(r4, r0, r8, r9, r10)
            if (r0 != 0) goto Ld2
            boolean r0 = s9.u.P(r5, r2, r8, r9, r10)
            if (r0 != 0) goto Ld2
            java.lang.String r0 = "genymotion"
            boolean r0 = s9.u.P(r6, r0, r8, r9, r10)
            if (r0 != 0) goto Ld2
            java.lang.String r0 = "nox"
            boolean r0 = s9.u.P(r1, r0, r8, r9, r10)
            if (r0 != 0) goto Ld2
            java.lang.String r0 = "x86"
            boolean r0 = s9.u.P(r7, r0, r8, r9, r10)
            if (r0 == 0) goto Ld1
            goto Ld2
        Ld1:
            return r8
        Ld2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.platform.c.isEmulator():boolean");
    }

    public final boolean isProxyEnabled(@NotNull Context context) {
        Object objB;
        boolean zIsEnabled;
        p.e(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            p.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                p.d(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objB = Result.b(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final boolean isVpnConnected(@NotNull Context context) {
        Object objB;
        p.e(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            p.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            p.d(allNetworks, "cm.allNetworks");
            int length = allNetworks.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i10]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            objB = Result.b(Boolean.valueOf(z10));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
