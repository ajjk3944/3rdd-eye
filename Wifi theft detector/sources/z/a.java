package z;

import a0.n;
import v.k;
import v.m;

/* loaded from: classes.dex */
public class a extends n {

    /* renamed from: a, reason: collision with root package name */
    public v.n f25200a;

    /* renamed from: b, reason: collision with root package name */
    public k f25201b;

    /* renamed from: c, reason: collision with root package name */
    public m f25202c;

    public a() {
        v.n nVar = new v.n();
        this.f25200a = nVar;
        this.f25202c = nVar;
    }

    @Override // a0.n
    public float a() {
        return this.f25202c.a();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        v.n nVar = this.f25200a;
        this.f25202c = nVar;
        nVar.d(f10, f11, f12, f13, f14, f15);
    }

    public boolean c() {
        return this.f25202c.b();
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f25201b == null) {
            this.f25201b = new k();
        }
        k kVar = this.f25201b;
        this.f25202c = kVar;
        kVar.d(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f25202c.getInterpolation(f10);
    }
}
