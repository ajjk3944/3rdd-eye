package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4079b3 {

    /* renamed from: a, reason: collision with root package name */
    private final in2 f25071a;

    private C4079b3(in2 in2Var) {
        this.f25071a = in2Var;
    }

    public static C4079b3 a(in2 in2Var) {
        if (in2Var.j().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (in2Var.k()) {
            throw new IllegalStateException("AdSession is finished");
        }
        C4079b3 c4079b3 = new C4079b3(in2Var);
        in2Var.j().a(c4079b3);
        return c4079b3;
    }

    public final void a() {
        if (!this.f25071a.k()) {
            if (this.f25071a.l()) {
                if (!this.f25071a.g()) {
                    try {
                        this.f25071a.b();
                    } catch (Exception unused) {
                    }
                }
                if (this.f25071a.g()) {
                    this.f25071a.e();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public final void a(t92 t92Var) {
        ko2.a(this.f25071a);
        if (this.f25071a.l()) {
            this.f25071a.a(t92Var.a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
