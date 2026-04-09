package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2197yq implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17773a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f17774b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f17775c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f17776d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f17777e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f17778f;

    public C2197yq(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1907tN c1907tN, C1799rN c1799rN4) {
        this.f17775c = c1799rN;
        this.f17776d = c1799rN2;
        this.f17777e = c1799rN3;
        this.f17774b = c1907tN;
        this.f17778f = c1799rN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f17773a) {
            case 0:
                return new C2143xq((Context) this.f17775c.c(), (Executor) this.f17776d.c(), (C0893ai) this.f17774b.f16902a, (Pt) this.f17777e.c(), (C0784Vn) this.f17778f.c());
            case 1:
                return new Gt((Context) this.f17774b.f16902a, (Executor) this.f17775c.c(), (C0710Rh) this.f17776d.c(), (C2090wr) this.f17777e.c(), (It) this.f17778f.c(), new C0905au());
            default:
                return new Py(C1799rN.b(this.f17775c), C1799rN.b(this.f17776d), C1799rN.b(this.f17777e), (ExecutorService) this.f17774b.f16902a, (C1948uA) this.f17778f.c());
        }
    }

    public C2197yq(C1799rN c1799rN, C1799rN c1799rN2, C1907tN c1907tN, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f17775c = c1799rN;
        this.f17776d = c1799rN2;
        this.f17774b = c1907tN;
        this.f17777e = c1799rN3;
        this.f17778f = c1799rN4;
    }

    public C2197yq(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1799rN c1799rN2, C1799rN c1799rN3) {
        this.f17774b = c1907tN;
        this.f17775c = c1799rN;
        this.f17776d = c1907tN2;
        this.f17777e = c1799rN2;
        this.f17778f = c1799rN3;
    }
}
