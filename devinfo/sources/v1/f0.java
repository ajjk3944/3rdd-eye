package v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 extends h0 implements Iterable, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35668a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35669b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35670c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35671d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35672e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35673f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35674h;

    /* renamed from: i, reason: collision with root package name */
    public final List f35675i;
    public final List j;

    public f0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f35668a = str;
        this.f35669b = f10;
        this.f35670c = f11;
        this.f35671d = f12;
        this.f35672e = f13;
        this.f35673f = f14;
        this.g = f15;
        this.f35674h = f16;
        this.f35675i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            return nk.k.a(this.f35668a, f0Var.f35668a) && this.f35669b == f0Var.f35669b && this.f35670c == f0Var.f35670c && this.f35671d == f0Var.f35671d && this.f35672e == f0Var.f35672e && this.f35673f == f0Var.f35673f && this.g == f0Var.g && this.f35674h == f0Var.f35674h && nk.k.a(this.f35675i, f0Var.f35675i) && nk.k.a(this.j, f0Var.j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f35675i.hashCode() + r5.c.d(this.f35674h, r5.c.d(this.g, r5.c.d(this.f35673f, r5.c.d(this.f35672e, r5.c.d(this.f35671d, r5.c.d(this.f35670c, r5.c.d(this.f35669b, this.f35668a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e0(this);
    }
}
