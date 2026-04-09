package kotlinx.serialization.internal;

import java.util.List;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public abstract class c1 implements kotlinx.serialization.descriptors.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f22832a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22833b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22834c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22835d;

    public /* synthetic */ c1(String str, kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f fVar2, kotlin.jvm.internal.i iVar) {
        this(str, fVar, fVar2);
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int c(String name) {
        kotlin.jvm.internal.p.e(name, "name");
        Integer numO = s9.q.o(name);
        if (numO != null) {
            return numO.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d() {
        return this.f22835d;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.p.a(h(), c1Var.h()) && kotlin.jvm.internal.p.a(this.f22833b, c1Var.f22833b) && kotlin.jvm.internal.p.a(this.f22834c, c1Var.f22834c);
    }

    @Override // kotlinx.serialization.descriptors.f
    public List f(int i10) {
        if (i10 >= 0) {
            return z8.r.j();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.f g(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f22833b;
            }
            if (i11 == 1) {
                return this.f22834c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.h getKind() {
        return i.c.f22788a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22832a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f22833b.hashCode()) * 31) + this.f22834c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return h() + '(' + this.f22833b + ", " + this.f22834c + ')';
    }

    public c1(String str, kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f fVar2) {
        this.f22832a = str;
        this.f22833b = fVar;
        this.f22834c = fVar2;
        this.f22835d = 2;
    }
}
