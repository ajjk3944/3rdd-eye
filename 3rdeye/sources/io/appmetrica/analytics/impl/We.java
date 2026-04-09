package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class We implements Nc {

    /* renamed from: a, reason: collision with root package name */
    public final Mc f40338a;

    /* renamed from: b, reason: collision with root package name */
    public final Mc f40339b;

    public We(J9 j92, C4513bh c4513bh, J4 j4, Cif cif) {
        Mc mc = new Mc(c4513bh, j4, cif);
        this.f40338a = mc;
        this.f40339b = mc;
        if (mc.b()) {
            return;
        }
        Ga.j().a().subscribe(TimeUnit.SECONDS.toMillis(Z7.f40463a.longValue()), Ga.j().w().a(), new C.e0(17, this, j92));
    }

    @Override // io.appmetrica.analytics.impl.Nc
    public final V8 a() {
        return this.f40339b;
    }

    public static final void a(We we, J9 j92) {
        we.f40338a.a();
        ((D5) j92.a()).e();
    }
}
