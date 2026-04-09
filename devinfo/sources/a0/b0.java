package a0;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 implements a0, i7.c {

    /* renamed from: a, reason: collision with root package name */
    public float f16a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17b;

    public b0(float f10, float f11, float f12) {
        this.f16a = f12;
        k0 k0Var = new k0();
        k0Var.f74a = 1.0f;
        k0Var.f75b = Math.sqrt(50.0d);
        k0Var.f76c = 1.0f;
        if (f10 < 0.0f) {
            i0.a("Damping ratio must be non-negative");
        }
        k0Var.f76c = f10;
        double d10 = k0Var.f75b;
        if (((float) (d10 * d10)) <= 0.0f) {
            i0.a("Spring stiffness constant must be positive.");
        }
        k0Var.f75b = Math.sqrt(f11);
        this.f17b = k0Var;
    }

    @Override // a0.a0
    public float a(long j, float f10, float f11, float f12) {
        k0 k0Var = (k0) this.f17b;
        k0Var.f74a = f11;
        return Float.intBitsToFloat((int) (k0Var.a(f10, f12, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    @Override // a0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long b(float r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b0.b(float, float, float):long");
    }

    @Override // a0.l
    public v0 c(y4.a aVar) {
        return new x0(this);
    }

    @Override // a0.a0
    public float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // a0.a0
    public float e(long j, float f10, float f11, float f12) {
        k0 k0Var = (k0) this.f17b;
        k0Var.f74a = f11;
        return Float.intBitsToFloat((int) (k0Var.a(f10, f12, j / 1000000) >> 32));
    }

    @Override // i7.c
    public boolean g(float f10) {
        if (this.f16a == f10) {
            return true;
        }
        this.f16a = f10;
        return false;
    }

    @Override // i7.c
    public boolean isEmpty() {
        return false;
    }

    @Override // i7.c
    public s7.a k() {
        return (s7.a) this.f17b;
    }

    @Override // i7.c
    public boolean o(float f10) {
        return !((s7.a) this.f17b).c();
    }

    @Override // i7.c
    public float t() {
        return ((s7.a) this.f17b).a();
    }

    @Override // i7.c
    public float v() {
        return ((s7.a) this.f17b).b();
    }

    public b0(List list) {
        this.f16a = -1.0f;
        this.f17b = (s7.a) list.get(0);
    }
}
