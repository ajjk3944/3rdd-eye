package Q9;

import O9.l;
import c9.C2099t;
import g0.C4356c;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: CollectionDescriptors.kt */
/* renamed from: Q9.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1519a0 implements O9.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f11472a;

    /* renamed from: b, reason: collision with root package name */
    public final O9.e f11473b;

    /* renamed from: c, reason: collision with root package name */
    public final O9.e f11474c;

    public AbstractC1519a0(String str, O9.e eVar, O9.e eVar2) {
        this.f11472a = str;
        this.f11473b = eVar;
        this.f11474c = eVar2;
    }

    @Override // O9.e
    public final String a() {
        return this.f11472a;
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
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // O9.e
    public final O9.k e() {
        return l.c.f10525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1519a0)) {
            return false;
        }
        AbstractC1519a0 abstractC1519a0 = (AbstractC1519a0) obj;
        return kotlin.jvm.internal.l.b(this.f11472a, abstractC1519a0.f11472a) && kotlin.jvm.internal.l.b(this.f11473b, abstractC1519a0.f11473b) && kotlin.jvm.internal.l.b(this.f11474c, abstractC1519a0.f11474c);
    }

    @Override // O9.e
    public final int f() {
        return 2;
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
        throw new IllegalArgumentException(B4.f.c(C4356c.j(i, "Illegal index ", ", "), this.f11472a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f11474c.hashCode() + ((this.f11473b.hashCode() + (this.f11472a.hashCode() * 31)) * 31);
    }

    @Override // O9.e
    public final O9.e i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(B4.f.c(C4356c.j(i, "Illegal index ", ", "), this.f11472a, " expects only non-negative indices").toString());
        }
        int i10 = i % 2;
        if (i10 == 0) {
            return this.f11473b;
        }
        if (i10 == 1) {
            return this.f11474c;
        }
        throw new IllegalStateException("Unreached");
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
        throw new IllegalArgumentException(B4.f.c(C4356c.j(i, "Illegal index ", ", "), this.f11472a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f11472a + '(' + this.f11473b + ", " + this.f11474c + ')';
    }
}
