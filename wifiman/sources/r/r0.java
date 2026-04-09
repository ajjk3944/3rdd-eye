package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r0 implements D {

    /* renamed from: a, reason: collision with root package name */
    private final int f59857a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59858b;

    /* renamed from: c, reason: collision with root package name */
    private final E f59859c;

    public r0(int i10, int i11, E e10) {
        this.f59857a = i10;
        this.f59858b = i11;
        this.f59859c = e10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return r0Var.f59857a == this.f59857a && r0Var.f59858b == this.f59858b && AbstractC6492s.d(r0Var.f59859c, this.f59859c);
    }

    @Override // r.H, r.InterfaceC7533i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public H0 a(s0 s0Var) {
        return new H0(this.f59857a, this.f59858b, this.f59859c);
    }

    public int hashCode() {
        return (((this.f59857a * 31) + this.f59859c.hashCode()) * 31) + this.f59858b;
    }

    public /* synthetic */ r0(int i10, int i11, E e10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? G.c() : e10);
    }
}
