package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2241zg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17889a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17893e;

    public /* synthetic */ RunnableC2241zg(C1649oh c1649oh, View view, InterfaceC1054df interfaceC1054df, int i) {
        this.f17891c = c1649oh;
        this.f17892d = view;
        this.f17893e = interfaceC1054df;
        this.f17890b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17889a;
        Object obj = this.f17893e;
        int i3 = this.f17890b;
        Object obj2 = this.f17892d;
        Object obj3 = this.f17891c;
        switch (i) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) obj3);
                map.put("cachedSrc", (String) obj2);
                map.put("totalBytes", Integer.toString(i3));
                ((AbstractC0454Cg) obj).n(map);
                return;
            case 1:
                ((C1649oh) obj3).v((View) obj2, (InterfaceC1054df) obj, i3 - 1);
                return;
            default:
                GA ga = (GA) obj3;
                DA da = (DA) obj2;
                h2.d dVar = (h2.d) obj;
                String str = ga.f8330b;
                try {
                    C0447Bq c0447Bq = ga.f8329a;
                    if (c0447Bq == null) {
                        throw null;
                    }
                    InterfaceC2164yA interfaceC2164yA = (InterfaceC2164yA) c0447Bq.f7453j;
                    if (interfaceC2164yA == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i3);
                    String str2 = da.f7731a;
                    if (!GA.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = da.f7732b;
                    if (!GA.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    FA fa = new FA(ga, dVar);
                    C2056wA c2056wA = (C2056wA) interfaceC2164yA;
                    Parcel parcelH0 = c2056wA.h0();
                    C7.c(parcelH0, bundle);
                    C7.e(parcelH0, fa);
                    c2056wA.d1(parcelH0, 3);
                    return;
                } catch (RemoteException e6) {
                    GA.f8327c.g(e6, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i3), str);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2241zg(GA ga, DA da, int i, h2.d dVar) {
        this.f17891c = ga;
        this.f17892d = da;
        this.f17890b = i;
        this.f17893e = dVar;
    }

    public RunnableC2241zg(AbstractC0454Cg abstractC0454Cg, String str, String str2, int i) {
        this.f17891c = str;
        this.f17892d = str2;
        this.f17890b = i;
        this.f17893e = abstractC0454Cg;
    }
}
