package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes3.dex */
public abstract class C6 implements Ya {

    /* renamed from: a, reason: collision with root package name */
    public final B6 f39226a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f39227b;

    /* renamed from: c, reason: collision with root package name */
    public final C4609fa f39228c;

    public C6(B6 b62, ICrashTransformer iCrashTransformer, C4609fa c4609fa) {
        this.f39226a = b62;
        this.f39227b = iCrashTransformer;
        this.f39228c = c4609fa;
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final void a(Throwable th, U u8) {
        if (this.f39226a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f39227b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Kn knA = Nn.a(th, u8, null, (String) this.f39228c.f40848b.a(), (Boolean) this.f39228c.f40849c.a());
                C5098yc c5098yc = (C5098yc) ((Mh) this).f39871d;
                c5098yc.f40032a.a().a(c5098yc.f42134b).a(knA);
            }
        }
    }

    public final B6 b() {
        return this.f39226a;
    }

    public final ICrashTransformer a() {
        return this.f39227b;
    }
}
