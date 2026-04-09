package io.sentry;

import java.io.File;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f12850a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f12851b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12852c;

    /* renamed from: d, reason: collision with root package name */
    public final p6 f12853d;

    public w(b1 b1Var, u0 u0Var, long j, int i10) {
        this.f12850a = b1Var;
        this.f12851b = u0Var;
        this.f12852c = j;
        this.f12853d = new p6(new g(i10));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, h0 h0Var);
}
