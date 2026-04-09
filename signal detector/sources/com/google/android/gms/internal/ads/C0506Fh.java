package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506Fh implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8157a;

    /* renamed from: b, reason: collision with root package name */
    public final C0472Dh f8158b;

    public /* synthetic */ C0506Fh(C0472Dh c0472Dh, int i) {
        this.f8157a = i;
        this.f8158b = c0472Dh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f8157a) {
            case 0:
                C0472Dh c0472Dh = this.f8158b;
                return new C0438Bh(c0472Dh.f7822b, c0472Dh.f7821a);
            case 1:
                Context context = this.f8158b.f7822b;
                Cr.v(context);
                return context;
            case 2:
                WeakReference weakReference = this.f8158b.f7824d;
                Cr.v(weakReference);
                return weakReference;
            case 3:
                return new C2181ya(this.f8158b.f7822b);
            case 4:
                C0472Dh c0472Dh2 = this.f8158b;
                return new p2.e(c0472Dh2.f7822b, c0472Dh2.f7821a);
            case 5:
                C2911G c2911g = p2.j.f22785C.f22790c;
                C0472Dh c0472Dh3 = this.f8158b;
                String strF = c2911g.F(c0472Dh3.f7822b, c0472Dh3.f7821a.f23784a);
                Cr.v(strF);
                return strF;
            default:
                return Long.valueOf(this.f8158b.f7823c);
        }
    }
}
