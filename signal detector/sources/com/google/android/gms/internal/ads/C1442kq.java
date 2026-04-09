package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442kq implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15285a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f15286b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f15287c;

    /* renamed from: d, reason: collision with root package name */
    public final C1113ek f15288d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f15289e;

    /* renamed from: f, reason: collision with root package name */
    public final C1907tN f15290f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f15291g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2069wN f15292h;
    public final InterfaceC2069wN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2069wN f15293j;

    public /* synthetic */ C1442kq(C1799rN c1799rN, C0642Nh c0642Nh, C1113ek c1113ek, C1799rN c1799rN2, C1907tN c1907tN, C1799rN c1799rN3, C1799rN c1799rN4, C1799rN c1799rN5, C1799rN c1799rN6, int i) {
        this.f15285a = i;
        this.f15286b = c1799rN;
        this.f15287c = c0642Nh;
        this.f15288d = c1113ek;
        this.f15289e = c1799rN2;
        this.f15290f = c1907tN;
        this.f15291g = c1799rN3;
        this.f15292h = c1799rN4;
        this.i = c1799rN5;
        this.f15293j = c1799rN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f15285a) {
            case 0:
                C0761Uh c0761Uh = (C0761Uh) this.f15290f.f16902a;
                return new C1388jq(c0761Uh, (Executor) this.f15287c.c(), (C0427An) this.f15289e.c(), this.f15288d.a(), ((C0642Nh) this.f15291g).a(), new C0500Fb(), (BinderC0718Rp) this.f15292h.c(), (C0750Tn) this.i.c(), (C0784Vn) this.f15293j.c());
            case 1:
                return new C0464Cq((Context) this.f15286b.c(), ((C0642Nh) this.f15287c).a(), this.f15288d.a(), (Executor) this.f15289e.c(), (C0893ai) this.f15290f.f16902a, (C0427An) this.f15291g.c(), new C0500Fb(), (BinderC0718Rp) this.f15292h.c(), (C0750Tn) this.i.c(), (C0784Vn) this.f15293j.c());
            default:
                return new C0464Cq((Context) this.f15286b.c(), ((C0642Nh) this.f15287c).a(), this.f15288d.a(), (Executor) this.f15289e.c(), (C1002ci) this.f15290f.f16902a, (C0427An) this.f15291g.c(), new C0500Fb(), (BinderC0718Rp) this.f15292h.c(), (C0750Tn) this.i.c(), (C0784Vn) this.f15293j.c());
        }
    }

    public C1442kq(C1907tN c1907tN, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1113ek c1113ek, C0642Nh c0642Nh, C1799rN c1799rN4, C1799rN c1799rN5, C1799rN c1799rN6) {
        this.f15285a = 0;
        this.f15290f = c1907tN;
        this.f15286b = c1799rN;
        this.f15287c = c1799rN2;
        this.f15289e = c1799rN3;
        this.f15288d = c1113ek;
        this.f15291g = c0642Nh;
        this.f15292h = c1799rN4;
        this.i = c1799rN5;
        this.f15293j = c1799rN6;
    }
}
