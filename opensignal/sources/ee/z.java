package ee;

import java.util.List;

/* loaded from: classes.dex */
public final class z implements u8.b, w.q {

    /* renamed from: a, reason: collision with root package name */
    public float f8181a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8182d;

    public z(float f10) {
        this.f8181a = f10;
        w.w wVar = new w.w();
        wVar.f24150a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        wVar.f24151b = dSqrt;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            w.v.a("Spring stiffness constant must be positive.");
        }
        wVar.f24151b = Math.sqrt(1500.0f);
        this.f8182d = wVar;
    }

    @Override // w.q
    public float b(long j, float f10, float f11, float f12) {
        w.w wVar = (w.w) this.f8182d;
        wVar.f24150a = f11;
        return Float.intBitsToFloat((int) (wVar.a(f10, f12, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    @Override // w.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c(float r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.z.c(float, float, float):long");
    }

    @Override // w.q
    public float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // w.q
    public float e(long j, float f10, float f11, float f12) {
        w.w wVar = (w.w) this.f8182d;
        wVar.f24150a = f11;
        return Float.intBitsToFloat((int) (wVar.a(f10, f12, j / 1000000) >> 32));
    }

    @Override // u8.b
    public boolean i(float f10) {
        if (this.f8181a == f10) {
            return true;
        }
        this.f8181a = f10;
        return false;
    }

    @Override // u8.b
    public boolean isEmpty() {
        return false;
    }

    @Override // u8.b
    public f9.a j() {
        return (f9.a) this.f8182d;
    }

    @Override // u8.b
    public boolean m(float f10) {
        return !((f9.a) this.f8182d).c();
    }

    @Override // u8.b
    public float v() {
        return ((f9.a) this.f8182d).a();
    }

    @Override // u8.b
    public float y() {
        return ((f9.a) this.f8182d).b();
    }

    public z(a0 a0Var, float f10) {
        this.f8182d = a0Var;
        this.f8181a = f10;
    }

    public z(List list) {
        this.f8181a = -1.0f;
        this.f8182d = (f9.a) list.get(0);
    }
}
