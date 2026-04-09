package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435kj implements InterfaceC0441Bk, M7, InterfaceC0832Yk {

    /* renamed from: a, reason: collision with root package name */
    public final Qt f15233a;

    /* renamed from: b, reason: collision with root package name */
    public final C1867sk f15234b;

    /* renamed from: c, reason: collision with root package name */
    public final C0509Fk f15235c;

    /* renamed from: f, reason: collision with root package name */
    public final C0594Kk f15238f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15236d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15237e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15239g = new AtomicBoolean();

    public C1435kj(Qt qt, C1867sk c1867sk, C0509Fk c0509Fk, C0594Kk c0594Kk) {
        this.f15233a = qt;
        this.f15234b = c1867sk;
        this.f15235c = c0509Fk;
        this.f15238f = c0594Kk;
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        int i = this.f15233a.f10764e;
        if (i == 1) {
            if (l7.f9629j && this.f15236d.compareAndSet(false, true)) {
                this.f15234b.a();
            }
        } else if (i == 4 && l7.f9629j && this.f15239g.compareAndSet(false, true)) {
            this.f15238f.a();
        }
        if (l7.f9629j && this.f15237e.compareAndSet(false, true)) {
            C0509Fk c0509Fk = this.f15235c;
            synchronized (c0509Fk) {
                c0509Fk.C1(C1652ok.f16048l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void c() {
        if (this.f15233a.f10764e == 4 && this.f15236d.compareAndSet(false, true)) {
            this.f15234b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final synchronized void e() {
        int i = this.f15233a.f10764e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.f15236d.compareAndSet(false, true)) {
            this.f15234b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void s() {
    }
}
