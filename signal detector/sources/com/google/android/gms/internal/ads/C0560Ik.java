package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560Ik extends VL implements InterfaceC1921tk, InterfaceC0526Gk {

    /* renamed from: c, reason: collision with root package name */
    public final Qt f9145c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f9146d;

    /* renamed from: e, reason: collision with root package name */
    public final Xt f9147e;

    public C0560Ik(Set set, Qt qt, Xt xt) {
        super(set);
        this.f9146d = new AtomicBoolean();
        this.f9145c = qt;
        this.f9147e = xt;
    }

    public final void H1() {
        q2.e1 e1Var;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.S8)).booleanValue() && this.f9146d.compareAndSet(false, true) && (e1Var = this.f9145c.f10765e0) != null && e1Var.f23203a == 3) {
            C1(new Rx(16, e1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.VL, com.google.android.gms.internal.ads.InterfaceC0526Gk
    public final void i() {
        if (this.f9145c.f10759b == 1) {
            H1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        int i = this.f9145c.f10759b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            H1();
        }
    }
}
