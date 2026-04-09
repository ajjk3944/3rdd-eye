package androidx.datastore.preferences.protobuf;

import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class Q implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private final M f30812a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f30813b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30814c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3979o f30815d;

    private Q(i0 i0Var, AbstractC3979o abstractC3979o, M m10) {
        this.f30813b = i0Var;
        this.f30814c = abstractC3979o.e(m10);
        this.f30815d = abstractC3979o;
        this.f30812a = m10;
    }

    private int j(i0 i0Var, Object obj) {
        return i0Var.i(i0Var.g(obj));
    }

    private void k(i0 i0Var, AbstractC3979o abstractC3979o, Object obj, b0 b0Var, C3978n c3978n) {
        Object objF = i0Var.f(obj);
        r rVarD = abstractC3979o.d(obj);
        while (b0Var.w() != Integer.MAX_VALUE) {
            try {
                if (!m(b0Var, c3978n, abstractC3979o, rVarD, i0Var, objF)) {
                    return;
                }
            } finally {
                i0Var.o(obj, objF);
            }
        }
    }

    static Q l(i0 i0Var, AbstractC3979o abstractC3979o, M m10) {
        return new Q(i0Var, abstractC3979o, m10);
    }

    private boolean m(b0 b0Var, C3978n c3978n, AbstractC3979o abstractC3979o, r rVar, i0 i0Var, Object obj) throws InvalidProtocolBufferException {
        int iA = b0Var.a();
        if (iA != o0.f30944a) {
            if (o0.b(iA) != 2) {
                return b0Var.C();
            }
            Object objB = abstractC3979o.b(c3978n, this.f30812a, o0.a(iA));
            if (objB == null) {
                return i0Var.m(obj, b0Var);
            }
            abstractC3979o.h(b0Var, objB, c3978n, rVar);
            return true;
        }
        Object objB2 = null;
        int iL = 0;
        AbstractC3971g abstractC3971gZ = null;
        while (b0Var.w() != Integer.MAX_VALUE) {
            int iA2 = b0Var.a();
            if (iA2 == o0.f30946c) {
                iL = b0Var.l();
                objB2 = abstractC3979o.b(c3978n, this.f30812a, iL);
            } else if (iA2 == o0.f30947d) {
                if (objB2 != null) {
                    abstractC3979o.h(b0Var, objB2, c3978n, rVar);
                } else {
                    abstractC3971gZ = b0Var.z();
                }
            } else if (!b0Var.C()) {
                break;
            }
        }
        if (b0Var.a() != o0.f30945b) {
            throw InvalidProtocolBufferException.a();
        }
        if (abstractC3971gZ != null) {
            if (objB2 != null) {
                abstractC3979o.i(abstractC3971gZ, objB2, c3978n, rVar);
            } else {
                i0Var.d(obj, iL, abstractC3971gZ);
            }
        }
        return true;
    }

    private void n(i0 i0Var, Object obj, p0 p0Var) {
        i0Var.s(i0Var.g(obj), p0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void a(Object obj, Object obj2) {
        e0.F(this.f30813b, obj, obj2);
        if (this.f30814c) {
            e0.D(this.f30815d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public Object b() {
        return this.f30812a.h().y();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void c(Object obj) {
        this.f30813b.j(obj);
        this.f30815d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean d(Object obj) {
        return this.f30815d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean e(Object obj, Object obj2) {
        if (!this.f30813b.g(obj).equals(this.f30813b.g(obj2))) {
            return false;
        }
        if (this.f30814c) {
            return this.f30815d.c(obj).equals(this.f30815d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int f(Object obj) {
        int iJ = j(this.f30813b, obj);
        return this.f30814c ? iJ + this.f30815d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int g(Object obj) {
        int iHashCode = this.f30813b.g(obj).hashCode();
        return this.f30814c ? (iHashCode * 53) + this.f30815d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void h(Object obj, b0 b0Var, C3978n c3978n) {
        k(this.f30813b, this.f30815d, obj, b0Var, c3978n);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void i(Object obj, p0 p0Var) {
        Iterator itN = this.f30815d.c(obj).n();
        if (itN.hasNext()) {
            AbstractC5487d.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f30813b, obj, p0Var);
    }
}
