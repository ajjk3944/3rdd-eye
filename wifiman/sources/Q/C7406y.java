package q;

import r.J;

/* renamed from: q.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7406y implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C7395n f58327a;

    public C7406y(Y0.d dVar) {
        this.f58327a = new C7395n(AbstractC7407z.a(), dVar);
    }

    private final float f(float f10) {
        return this.f58327a.b(f10) * Math.signum(f10);
    }

    @Override // r.J
    public float a() {
        return 0.0f;
    }

    @Override // r.J
    public float b(long j10, float f10, float f11) {
        return this.f58327a.d(f11).b(j10 / 1000000);
    }

    @Override // r.J
    public long c(float f10, float f11) {
        return this.f58327a.c(f11) * 1000000;
    }

    @Override // r.J
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // r.J
    public float e(long j10, float f10, float f11) {
        return f10 + this.f58327a.d(f11).a(j10 / 1000000);
    }
}
