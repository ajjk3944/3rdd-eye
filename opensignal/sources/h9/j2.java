package h9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j2 implements s0 {
    public int B;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10381a;

    /* renamed from: d, reason: collision with root package name */
    public float f10382d;

    /* renamed from: g, reason: collision with root package name */
    public float f10383g;

    /* renamed from: r, reason: collision with root package name */
    public k2 f10384r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10385x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10386y;

    public j2(r2 r2Var, b5.m mVar) {
        ArrayList arrayList = new ArrayList();
        this.f10381a = arrayList;
        this.f10384r = null;
        this.f10385x = false;
        this.f10386y = true;
        this.B = -1;
        if (mVar == null) {
            return;
        }
        mVar.w(this);
        if (this.D) {
            this.f10384r.b((k2) arrayList.get(this.B));
            arrayList.set(this.B, this.f10384r);
            this.D = false;
        }
        k2 k2Var = this.f10384r;
        if (k2Var != null) {
            arrayList.add(k2Var);
        }
    }

    @Override // h9.s0
    public final void b(float f10, float f11, float f12, float f13) {
        this.f10384r.a(f10, f11);
        this.f10381a.add(this.f10384r);
        this.f10384r = new k2(f12, f13, f12 - f10, f13 - f11);
        this.D = false;
    }

    @Override // h9.s0
    public final void c(float f10, float f11) {
        boolean z10 = this.D;
        ArrayList arrayList = this.f10381a;
        if (z10) {
            this.f10384r.b((k2) arrayList.get(this.B));
            arrayList.set(this.B, this.f10384r);
            this.D = false;
        }
        k2 k2Var = this.f10384r;
        if (k2Var != null) {
            arrayList.add(k2Var);
        }
        this.f10382d = f10;
        this.f10383g = f11;
        this.f10384r = new k2(f10, f11, 0.0f, 0.0f);
        this.B = arrayList.size();
    }

    @Override // h9.s0
    public final void close() {
        this.f10381a.add(this.f10384r);
        f(this.f10382d, this.f10383g);
        this.D = true;
    }

    @Override // h9.s0
    public final void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f10386y || this.f10385x) {
            this.f10384r.a(f10, f11);
            this.f10381a.add(this.f10384r);
            this.f10385x = false;
        }
        this.f10384r = new k2(f14, f15, f14 - f12, f15 - f13);
        this.D = false;
    }

    @Override // h9.s0
    public final void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        this.f10385x = true;
        this.f10386y = false;
        k2 k2Var = this.f10384r;
        r2.s(k2Var.f10393a, k2Var.f10394b, f10, f11, f12, z10, z11, f13, f14, this);
        this.f10386y = true;
        this.D = false;
    }

    @Override // h9.s0
    public final void f(float f10, float f11) {
        this.f10384r.a(f10, f11);
        this.f10381a.add(this.f10384r);
        k2 k2Var = this.f10384r;
        this.f10384r = new k2(f10, f11, f10 - k2Var.f10393a, f11 - k2Var.f10394b);
        this.D = false;
    }
}
