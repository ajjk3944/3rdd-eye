package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544Hl implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8992a;

    /* renamed from: b, reason: collision with root package name */
    public final C0697Ql f8993b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f8994c;

    public /* synthetic */ C0544Hl(C0697Ql c0697Ql, C1799rN c1799rN, int i) {
        this.f8992a = i;
        this.f8993b = c0697Ql;
        this.f8994c = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f8992a) {
            case 0:
                Set setT = this.f8993b.t((C0695Qj) this.f8994c.c());
                Cr.v(setT);
                return setT;
            default:
                return new C1922tl(new C0894aj(1, (InterfaceC0828Yg) this.f8993b.f10692c), (Executor) this.f8994c.c());
        }
    }
}
