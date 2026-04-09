package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Pz implements Lz {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1195gA f10546a;

    /* renamed from: b, reason: collision with root package name */
    public final C1140fA f10547b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f10548c;

    /* renamed from: d, reason: collision with root package name */
    public final C1355jA f10549d;

    /* renamed from: e, reason: collision with root package name */
    public final C1948uA f10550e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10551f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final String f10552g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10553h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public C1187g2 f10554j;

    public Pz(InterfaceC1195gA interfaceC1195gA, C1140fA c1140fA, C1355jA c1355jA, C1948uA c1948uA, Xx xx, ExecutorService executorService) {
        this.f10546a = interfaceC1195gA;
        this.f10547b = c1140fA;
        this.f10548c = executorService;
        this.f10549d = c1355jA;
        this.f10550e = c1948uA;
        this.f10552g = xx.G();
        this.f10553h = xx.O();
        this.i = xx.N();
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final String a() {
        synchronized (this.f10551f) {
            try {
                C1187g2 c1187g2 = this.f10554j;
                if (c1187g2 == null) {
                    return "3.825731049.-1";
                }
                return (String) c1187g2.f14188c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final TD b(Context context, View view, Activity activity) {
        return AbstractC1984ut.z(new CallableC0647Nm(this, context, view, activity, 4), this.f10548c);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final AbstractC2221zD c() {
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(this.f10547b.c());
        Oz oz = Oz.f10287b;
        ExecutorService executorService = this.f10548c;
        return AbstractC1984ut.F(AbstractC1984ut.C(abstractC2221zDR, Throwable.class, oz, executorService), new C0738Tb(17, this), executorService);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final void d(InputEvent inputEvent) {
        try {
            synchronized (this.f10551f) {
                try {
                    C1187g2 c1187g2 = this.f10554j;
                    if (c1187g2 != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        ((P.g) c1187g2.f14189d).m(c1187g2.f14187b, Optional.of(map));
                    } else {
                        this.f10550e.b(20105);
                    }
                } finally {
                }
            }
        } catch (Z4 | C0971c5 e6) {
            this.f10550e.d(20104, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final int e() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final TD f(Context context) {
        return AbstractC1984ut.z(new CallableC1890t6(this, 13, context), this.f10548c);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final TD g(Context context, View view, String str) {
        return AbstractC1984ut.z(new CallableC0647Nm(this, context, str, view, 5), this.f10548c);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Pz.h(java.util.HashMap):void");
    }

    public final String i(HashMap map) {
        String strG;
        C1948uA c1948uA = this.f10550e;
        try {
            c1948uA.a(20110).a();
            synchronized (this.f10551f) {
                try {
                    C1187g2 c1187g2 = this.f10554j;
                    if (c1187g2 == null) {
                        c1948uA.b(20109);
                        strG = "";
                    } else {
                        byte[] bArr = (byte[]) ((P.g) c1187g2.f14189d).m(c1187g2.f14186a, Optional.of(map));
                        C2058wC c2058wC = C2166yC.f17692e;
                        if (c2058wC.f17695b != null) {
                            c2058wC = new C2058wC(c2058wC.f17694a, (Character) null);
                        }
                        strG = c2058wC.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return strG;
        } finally {
        }
    }
}
