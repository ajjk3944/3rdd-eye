package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4598f implements A4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40830a;

    /* renamed from: b, reason: collision with root package name */
    public final Mg f40831b;

    public AbstractC4598f(Context context, Mg mg) {
        this.f40830a = context.getApplicationContext();
        this.f40831b = mg;
        mg.a(this);
        Ga.j().m().b(this);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C4683i6 c4683i6, K4 k42) {
        b(c4683i6, k42);
    }

    public final Mg b() {
        return this.f40831b;
    }

    public abstract void b(C4683i6 c4683i6, K4 k42);

    public final Context c() {
        return this.f40830a;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a() {
        this.f40831b.b(this);
        Ga.f39501F.l().a(this);
    }
}
