package kotlinx.serialization.internal;

import java.util.List;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public abstract class y0 implements kotlinx.serialization.descriptors.f {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22932b;

    public /* synthetic */ y0(kotlinx.serialization.descriptors.f fVar, kotlin.jvm.internal.i iVar) {
        this(fVar);
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
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d() {
        return this.f22932b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.p.a(this.f22931a, y0Var.f22931a) && kotlin.jvm.internal.p.a(h(), y0Var.h());
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
            return this.f22931a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.h getKind() {
        return i.b.f22787a;
    }

    public int hashCode() {
        return (this.f22931a.hashCode() * 31) + h().hashCode();
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
        return h() + '(' + this.f22931a + ')';
    }

    public y0(kotlinx.serialization.descriptors.f fVar) {
        this.f22931a = fVar;
        this.f22932b = 1;
    }
}
