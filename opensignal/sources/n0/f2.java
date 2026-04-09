package n0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f2 implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f17172a;

    /* renamed from: d, reason: collision with root package name */
    public final int f17173d;

    /* renamed from: g, reason: collision with root package name */
    public final b f17174g;

    public f2(s1 s1Var, int i10, k0 k0Var, b bVar) {
        this.f17172a = s1Var;
        this.f17173d = i10;
        this.f17174g = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j0(this.f17172a, this.f17173d, null, this.f17174g);
    }
}
