package y9;

import J8.C0692g;
import c9.AbstractC2080a;
import c9.C2097r;
import java.util.Iterator;
import x9.m;

/* compiled from: Regex.kt */
/* renamed from: y9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5824f extends AbstractC2080a<C5822d> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5825g f48377b;

    public C5824f(C5825g c5825g) {
        this.f48377b = c5825g;
    }

    @Override // c9.AbstractC2080a
    public final int c() {
        return this.f48377b.f48378a.groupCount() + 1;
    }

    @Override // c9.AbstractC2080a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C5822d) {
            return super.contains((C5822d) obj);
        }
        return false;
    }

    @Override // c9.AbstractC2080a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C5822d> iterator() {
        return new m.a(x9.l.J(C2097r.j0(new v9.g(0, c() - 1, 1)), new C0692g(this, 4)));
    }
}
