package ku;

import java.util.List;

/* loaded from: classes.dex */
public final class v0 implements iu.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14630a;

    /* renamed from: b, reason: collision with root package name */
    public final iu.d f14631b;

    public v0(String str, iu.d dVar) {
        br.l.e(dVar, "kind");
        this.f14630a = str;
        this.f14631b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return br.l.a(this.f14630a, v0Var.f14630a) && br.l.a(this.f14631b, v0Var.f14631b);
    }

    @Override // iu.e
    public final i3.g f() {
        return this.f14631b;
    }

    @Override // iu.e
    public final boolean g() {
        return false;
    }

    @Override // iu.e
    public final List getAnnotations() {
        return mq.w.f16945a;
    }

    @Override // iu.e
    public final String h() {
        return this.f14630a;
    }

    public final int hashCode() {
        return (this.f14631b.hashCode() * 31) + this.f14630a.hashCode();
    }

    @Override // iu.e
    public final boolean i() {
        return false;
    }

    @Override // iu.e
    public final int j(String str) {
        br.l.e(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // iu.e
    public final int k() {
        return 0;
    }

    @Override // iu.e
    public final String l(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // iu.e
    public final List m(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // iu.e
    public final iu.e n(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // iu.e
    public final boolean o(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("PrimitiveDescriptor("), this.f14630a, ')');
    }
}
