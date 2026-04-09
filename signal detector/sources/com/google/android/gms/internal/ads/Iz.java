package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import f4.InterfaceFutureC2326a;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class Iz implements InterfaceC0908ax {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9198a;

    /* renamed from: b, reason: collision with root package name */
    public final C1355jA f9199b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9200c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9201d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9202e;

    public Iz(Context context, Xx xx, C1355jA c1355jA) {
        this.f9198a = context;
        this.f9200c = xx.G();
        this.f9201d = xx.N();
        this.f9202e = xx.O();
        this.f9199b = c1355jA;
    }

    public final void a(HashMap map) {
        InterfaceFutureC2326a interfaceFutureC2326a;
        C1136f6 c1136f6;
        map.put("v", this.f9200c);
        map.put("t", new Throwable());
        try {
            interfaceFutureC2326a = (InterfaceFutureC2326a) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strV0 = (interfaceFutureC2326a == null || (Build.VERSION.SDK_INT >= 31 && !interfaceFutureC2326a.isDone()) || (c1136f6 = (C1136f6) interfaceFutureC2326a.get(this.f9201d, TimeUnit.MILLISECONDS)) == null || c1136f6.v0().length() <= 1) ? "E" : c1136f6.v0();
        if (strV0.equals("E")) {
            try {
                InterfaceFutureC2326a interfaceFutureC2326a2 = (InterfaceFutureC2326a) map.get("ai");
                if (interfaceFutureC2326a2 != null) {
                    String str = (String) interfaceFutureC2326a2.get(this.f9202e, TimeUnit.MILLISECONDS);
                    if (!C1476lN.k(str)) {
                        strV0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strV0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap c() {
        HashMap mapA = this.f9199b.a();
        a(mapA);
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap f() {
        HashMap mapB = this.f9199b.b(this.f9198a, null);
        a(mapB);
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap m() {
        HashMap mapC = this.f9199b.c();
        a(mapC);
        return mapC;
    }
}
