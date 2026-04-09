package com.google.android.gms.internal.ads;

import android.os.Bundle;
import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0900ap implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1807re f13228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13230d;

    public /* synthetic */ C0900ap(Object obj, C1807re c1807re, int i, int i3) {
        this.f13227a = i3;
        this.f13230d = obj;
        this.f13228b = c1807re;
        this.f13229c = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final /* synthetic */ InterfaceFutureC2326a b(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f13227a) {
            case 0:
                C1431kf c1431kf = (C1431kf) this.f13230d;
                C1807re c1807re = this.f13228b;
                if (c1807re != null && (bundle = c1807re.f16587m) != null) {
                    bundle.putBoolean("ls", true);
                }
                return AbstractC1984ut.F(((BinderC2196yp) ((InterfaceC1692pN) c1431kf.f15176e).c()).K3(c1807re, this.f13229c), new C0955bp(c1807re, 0), (ID) c1431kf.f15174c);
            default:
                C1726q3 c1726q3 = (C1726q3) this.f13230d;
                C1807re c1807re2 = this.f13228b;
                if (c1807re2 != null && (bundle2 = c1807re2.f16587m) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return AbstractC1984ut.F(((BinderC2196yp) ((InterfaceC1692pN) c1726q3.f16316f).c()).N3(c1807re2, this.f13229c), new C0955bp(c1807re2, 1), (ID) c1726q3.f16313c);
        }
    }
}
