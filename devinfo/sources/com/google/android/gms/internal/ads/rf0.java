package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rf0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15648a;

    /* renamed from: b, reason: collision with root package name */
    public p9 f15649b;

    public rf0(Context context) {
        this.f15648a = context;
    }

    public final void a(ne0 ne0Var) {
        ServiceInfo serviceInfo;
        p9 p9Var = this.f15649b;
        Context context = p9Var.I;
        if (p9Var.Z()) {
            jz.i("Service connection is valid. No need to re-initialize.");
            ne0Var.p(0);
            return;
        }
        int i4 = p9Var.H;
        if (i4 == 1) {
            jz.l("Client is already in the process of connecting to the service.");
            ne0Var.p(3);
            return;
        }
        if (i4 == 3) {
            jz.l("Client was already closed and can't be reused. Please create another instance.");
            ne0Var.p(3);
            return;
        }
        jz.i("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            p9Var.H = 0;
            jz.i("Install Referrer service unavailable on device.");
            ne0Var.p(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    o9 o9Var = new o9(p9Var, ne0Var);
                    p9Var.L = o9Var;
                    try {
                        if (context.bindService(intent2, o9Var, 1)) {
                            jz.i("Service was bonded successfully.");
                            return;
                        }
                        jz.l("Connection to service is blocked.");
                        p9Var.H = 0;
                        ne0Var.p(1);
                        return;
                    } catch (SecurityException unused) {
                        jz.l("No permission to connect to service.");
                        p9Var.H = 0;
                        ne0Var.p(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        jz.l("Play Store missing or incompatible. Version 8.3.73 or later required.");
        p9Var.H = 0;
        ne0Var.p(2);
    }
}
