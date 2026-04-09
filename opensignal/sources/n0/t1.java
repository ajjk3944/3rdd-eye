package n0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class t1 implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f17323a;

    /* renamed from: d, reason: collision with root package name */
    public final int f17324d;

    /* renamed from: g, reason: collision with root package name */
    public final int f17325g;

    public t1(s1 s1Var, int i10, int i11) {
        this.f17323a = s1Var;
        this.f17324d = i10;
        this.f17325g = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s1 s1Var = this.f17323a;
        if (s1Var.D != this.f17325g) {
            u1.f();
        }
        int i10 = this.f17324d;
        s1Var.g(i10);
        return new j0(s1Var, i10 + 1, u1.a(s1Var.f17310a, i10) + i10);
    }
}
