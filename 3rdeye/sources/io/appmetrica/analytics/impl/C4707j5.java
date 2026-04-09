package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4707j5 implements J9 {

    /* renamed from: a, reason: collision with root package name */
    public final D5 f41110a;

    public C4707j5(N9 n9, C4555d7 c4555d7, C4513bh c4513bh, C4759l5 c4759l5) {
        C4682i5 c4682i5 = new C4682i5(c4555d7, c4513bh);
        this.f41110a = new D5(n9, c4682i5.a(), c4682i5.b(), c4759l5);
    }

    @Override // io.appmetrica.analytics.impl.J9
    public final I9 a() {
        return this.f41110a;
    }

    public final D5 b() {
        return this.f41110a;
    }
}
