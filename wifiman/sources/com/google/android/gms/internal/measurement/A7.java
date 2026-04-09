package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class A7 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private final E7 f34934c;

    public A7(E7 e72) {
        super("internal.logger");
        this.f34934c = e72;
        this.f35403b.put("log", new D7(this, false, true));
        this.f35403b.put("silent", new p7(this, "silent"));
        ((AbstractC4410n) this.f35403b.get("silent")).f("log", new D7(this, true, true));
        this.f35403b.put("unmonitored", new C7(this, "unmonitored"));
        ((AbstractC4410n) this.f35403b.get("unmonitored")).f("log", new D7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        return InterfaceC4449s.f35450e0;
    }
}
