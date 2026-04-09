package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5048wc implements J9 {

    /* renamed from: a, reason: collision with root package name */
    public final D5 f41967a;

    public C5048wc(N9 n9, C4555d7 c4555d7, C4513bh c4513bh, J4 j4, C4759l5 c4759l5, Cif cif) {
        C5023vc c5023vc = new C5023vc(c4555d7, c4513bh, this, j4, cif);
        this.f41967a = new D5(n9, c5023vc.a(), c5023vc.b(), c4759l5);
    }

    @Override // io.appmetrica.analytics.impl.J9
    public final I9 a() {
        return this.f41967a;
    }

    public final D5 b() {
        return this.f41967a;
    }
}
