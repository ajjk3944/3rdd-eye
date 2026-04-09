package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1744w;
import androidx.datastore.preferences.protobuf.C1740s;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
public final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final P f15575a;

    /* renamed from: b, reason: collision with root package name */
    public final k0<?, ?> f15576b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15577c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1738p<?> f15578d;

    public U(k0<?, ?> k0Var, AbstractC1738p<?> abstractC1738p, P p10) {
        this.f15576b = k0Var;
        this.f15577c = abstractC1738p.e(p10);
        this.f15578d = abstractC1738p;
        this.f15575a = p10;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void a(T t10, e0 e0Var, C1737o c1737o) throws IOException {
        k0 k0Var = this.f15576b;
        l0 l0VarF = k0Var.f(t10);
        AbstractC1738p abstractC1738p = this.f15578d;
        C1740s<ET> c1740sD = abstractC1738p.d(t10);
        while (e0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                e0 e0Var2 = e0Var;
                C1737o c1737o2 = c1737o;
                if (!g(e0Var2, c1737o2, abstractC1738p, c1740sD, k0Var, l0VarF)) {
                    return;
                }
                e0Var = e0Var2;
                c1737o = c1737o2;
            } finally {
                k0Var.n(t10, l0VarF);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final int b(AbstractC1723a abstractC1723a) {
        k0<?, ?> k0Var = this.f15576b;
        int i = k0Var.i(k0Var.g(abstractC1723a));
        if (this.f15577c) {
            h0 h0Var = this.f15578d.c(abstractC1723a).f15692a;
            if (h0Var.f15625c.size() > 0) {
                C1740s.d(h0Var.d(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = h0Var.e().iterator();
            if (it.hasNext()) {
                C1740s.d(it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void c(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2) {
        Class<?> cls = g0.f15599a;
        k0<?, ?> k0Var = this.f15576b;
        k0Var.o(abstractC1744w, k0Var.k(k0Var.g(abstractC1744w), k0Var.g(abstractC1744w2)));
        if (this.f15577c) {
            g0.y(this.f15578d, abstractC1744w, abstractC1744w2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final int d(AbstractC1744w abstractC1744w) {
        int iHashCode = this.f15576b.g(abstractC1744w).hashCode();
        if (!this.f15577c) {
            return iHashCode;
        }
        return this.f15578d.c(abstractC1744w).f15692a.hashCode() + (iHashCode * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void e(T t10, t0 t0Var) throws IOException {
        Iterator itG = this.f15578d.c(t10).g();
        if (itG.hasNext()) {
            ((C1740s.b) ((Map.Entry) itG.next()).getKey()).getLiteJavaType();
            throw null;
        }
        k0<?, ?> k0Var = this.f15576b;
        k0Var.q(k0Var.g(t10), t0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean f(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2) {
        k0<?, ?> k0Var = this.f15576b;
        if (!k0Var.g(abstractC1744w).equals(k0Var.g(abstractC1744w2))) {
            return false;
        }
        if (!this.f15577c) {
            return true;
        }
        AbstractC1738p<?> abstractC1738p = this.f15578d;
        return abstractC1738p.c(abstractC1744w).equals(abstractC1738p.c(abstractC1744w2));
    }

    public final <UT, UB, ET extends C1740s.b<ET>> boolean g(e0 e0Var, C1737o c1737o, AbstractC1738p<ET> abstractC1738p, C1740s<ET> c1740s, k0<UT, UB> k0Var, UB ub) throws IOException {
        int tag = e0Var.getTag();
        P p10 = this.f15575a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return e0Var.skipField();
            }
            AbstractC1744w.e eVarB = abstractC1738p.b(c1737o, p10, tag >>> 3);
            if (eVarB == null) {
                return k0Var.l(ub, e0Var);
            }
            abstractC1738p.h(eVarB);
            throw null;
        }
        int uInt32 = 0;
        AbstractC1744w.e eVarB2 = null;
        AbstractC1730h bytes = null;
        while (e0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = e0Var.getTag();
            if (tag2 == 16) {
                uInt32 = e0Var.readUInt32();
                eVarB2 = abstractC1738p.b(c1737o, p10, uInt32);
            } else if (tag2 == 26) {
                if (eVarB2 != null) {
                    abstractC1738p.h(eVarB2);
                    throw null;
                }
                bytes = e0Var.readBytes();
            } else if (!e0Var.skipField()) {
                break;
            }
        }
        if (e0Var.getTag() != 12) {
            throw new C1747z("Protocol message end-group tag did not match expected tag.");
        }
        if (bytes == null) {
            return true;
        }
        if (eVarB2 == null) {
            k0Var.d(ub, uInt32, bytes);
            return true;
        }
        abstractC1738p.i(eVarB2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean isInitialized(T t10) {
        this.f15578d.c(t10).e();
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void makeImmutable(T t10) {
        this.f15576b.j(t10);
        this.f15578d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final T newInstance() {
        return (T) this.f15575a.newBuilderForType().e();
    }
}
