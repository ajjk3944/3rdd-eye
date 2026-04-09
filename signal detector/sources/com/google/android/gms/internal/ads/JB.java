package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class JB extends AbstractC1141fB {

    /* renamed from: d, reason: collision with root package name */
    public final LB f9265d;

    public JB(LB lb, int i) {
        super(lb.size(), i);
        this.f9265d = lb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141fB
    public final Object b(int i) {
        return this.f9265d.get(i);
    }
}
