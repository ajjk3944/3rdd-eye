package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785Vo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12086a;

    /* renamed from: b, reason: collision with root package name */
    public C1184g f12087b;

    public C0785Vo(Context context) {
        this.f12086a = context;
    }

    public final void a(C1283hr c1283hr) {
        ServiceInfo serviceInfo;
        C1184g c1184g = this.f12087b;
        Context context = (Context) c1184g.f14180b;
        if (c1184g.b()) {
            AbstractC0709Rg.h("Service connection is valid. No need to re-initialize.");
            c1283hr.c(0);
            return;
        }
        int i = c1184g.f14179a;
        if (i == 1) {
            AbstractC0709Rg.j("Client is already in the process of connecting to the service.");
            c1283hr.c(3);
            return;
        }
        if (i == 3) {
            AbstractC0709Rg.j("Client was already closed and can't be reused. Please create another instance.");
            c1283hr.c(3);
            return;
        }
        AbstractC0709Rg.h("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            c1184g.f14179a = 0;
            AbstractC0709Rg.h("Install Referrer service unavailable on device.");
            c1283hr.c(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC1565n4 serviceConnectionC1565n4 = new ServiceConnectionC1565n4(c1184g, c1283hr);
                    c1184g.f14183e = serviceConnectionC1565n4;
                    try {
                        if (context.bindService(intent2, serviceConnectionC1565n4, 1)) {
                            AbstractC0709Rg.h("Service was bonded successfully.");
                            return;
                        }
                        AbstractC0709Rg.j("Connection to service is blocked.");
                        c1184g.f14179a = 0;
                        c1283hr.c(1);
                        return;
                    } catch (SecurityException unused) {
                        AbstractC0709Rg.j("No permission to connect to service.");
                        c1184g.f14179a = 0;
                        c1283hr.c(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        AbstractC0709Rg.j("Play Store missing or incompatible. Version 8.3.73 or later required.");
        c1184g.f14179a = 0;
        c1283hr.c(2);
    }
}
