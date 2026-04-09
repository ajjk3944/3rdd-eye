package Q9;

import O9.l;
import c9.C2099t;
import g0.C4356c;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: CollectionDescriptors.kt */
/* loaded from: classes3.dex */
public abstract class V implements O9.e {

    /* renamed from: a, reason: collision with root package name */
    public final O9.e f11461a;

    public V(O9.e eVar) {
        this.f11461a = eVar;
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        Integer numQ = y9.m.Q(name);
        if (numQ != null) {
            return numQ.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // O9.e
    public final O9.k e() {
        return l.b.f10524a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return kotlin.jvm.internal.l.b(this.f11461a, v10.f11461a) && kotlin.jvm.internal.l.b(a(), v10.a());
    }

    @Override // O9.e
    public final int f() {
        return 1;
    }

    @Override // O9.e
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return C2099t.f18581b;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        if (i >= 0) {
            return C2099t.f18581b;
        }
        StringBuilder sbJ = C4356c.j(i, "Illegal index ", ", ");
        sbJ.append(a());
        sbJ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f11461a.hashCode() * 31);
    }

    @Override // O9.e
    public final O9.e i(int i) {
        if (i >= 0) {
            return this.f11461a;
        }
        StringBuilder sbJ = C4356c.j(i, "Illegal index ", ", ");
        sbJ.append(a());
        sbJ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    @Override // O9.e
    public final boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbJ = C4356c.j(i, "Illegal index ", ", ");
        sbJ.append(a());
        sbJ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f11461a + ')';
    }
}
