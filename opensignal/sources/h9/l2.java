package h9;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class l2 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f10404a = new Path();

    /* renamed from: d, reason: collision with root package name */
    public float f10405d;

    /* renamed from: g, reason: collision with root package name */
    public float f10406g;

    public l2(b5.m mVar) {
        if (mVar == null) {
            return;
        }
        mVar.w(this);
    }

    @Override // h9.s0
    public final void b(float f10, float f11, float f12, float f13) {
        this.f10404a.quadTo(f10, f11, f12, f13);
        this.f10405d = f12;
        this.f10406g = f13;
    }

    @Override // h9.s0
    public final void c(float f10, float f11) {
        this.f10404a.moveTo(f10, f11);
        this.f10405d = f10;
        this.f10406g = f11;
    }

    @Override // h9.s0
    public final void close() {
        this.f10404a.close();
    }

    @Override // h9.s0
    public final void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f10404a.cubicTo(f10, f11, f12, f13, f14, f15);
        this.f10405d = f14;
        this.f10406g = f15;
    }

    @Override // h9.s0
    public final void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        r2.s(this.f10405d, this.f10406g, f10, f11, f12, z10, z11, f13, f14, this);
        this.f10405d = f13;
        this.f10406g = f14;
    }

    @Override // h9.s0
    public final void f(float f10, float f11) {
        this.f10404a.lineTo(f10, f11);
        this.f10405d = f10;
        this.f10406g = f11;
    }
}
