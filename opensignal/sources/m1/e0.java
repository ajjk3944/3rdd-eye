package m1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends g0 implements Iterable, cr.a {
    public final float B;
    public final float D;
    public final List E;
    public final List F;

    /* renamed from: a, reason: collision with root package name */
    public final String f16172a;

    /* renamed from: d, reason: collision with root package name */
    public final float f16173d;

    /* renamed from: g, reason: collision with root package name */
    public final float f16174g;

    /* renamed from: r, reason: collision with root package name */
    public final float f16175r;

    /* renamed from: x, reason: collision with root package name */
    public final float f16176x;

    /* renamed from: y, reason: collision with root package name */
    public final float f16177y;

    public e0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f16172a = str;
        this.f16173d = f10;
        this.f16174g = f11;
        this.f16175r = f12;
        this.f16176x = f13;
        this.f16177y = f14;
        this.B = f15;
        this.D = f16;
        this.E = list;
        this.F = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e0)) {
            e0 e0Var = (e0) obj;
            return br.l.a(this.f16172a, e0Var.f16172a) && this.f16173d == e0Var.f16173d && this.f16174g == e0Var.f16174g && this.f16175r == e0Var.f16175r && this.f16176x == e0Var.f16176x && this.f16177y == e0Var.f16177y && this.B == e0Var.B && this.D == e0Var.D && br.l.a(this.E, e0Var.E) && br.l.a(this.F, e0Var.F);
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode() + h0.b.c(w.g.a(w.g.a(w.g.a(w.g.a(w.g.a(w.g.a(w.g.a(this.f16172a.hashCode() * 31, this.f16173d, 31), this.f16174g, 31), this.f16175r, 31), this.f16176x, 31), this.f16177y, 31), this.B, 31), this.D, 31), 31, this.E);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d0(this);
    }
}
