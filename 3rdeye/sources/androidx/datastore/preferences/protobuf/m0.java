package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class m0 extends k0<l0, l0> {
    @Override // androidx.datastore.preferences.protobuf.k0
    public final void a(l0 l0Var, int i, int i10) {
        l0Var.b((i << 3) | 5, Integer.valueOf(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void b(l0 l0Var, int i, long j4) {
        l0Var.b((i << 3) | 1, Long.valueOf(j4));
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void c(l0 l0Var, int i, l0 l0Var2) {
        l0Var.b((i << 3) | 3, l0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void d(l0 l0Var, int i, AbstractC1730h abstractC1730h) {
        l0Var.b((i << 3) | 2, abstractC1730h);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void e(l0 l0Var, int i, long j4) {
        l0Var.b(i << 3, Long.valueOf(j4));
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final l0 f(Object obj) {
        AbstractC1744w abstractC1744w = (AbstractC1744w) obj;
        l0 l0Var = abstractC1744w.unknownFields;
        if (l0Var != l0.f15661f) {
            return l0Var;
        }
        l0 l0Var2 = new l0();
        abstractC1744w.unknownFields = l0Var2;
        return l0Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final l0 g(Object obj) {
        return ((AbstractC1744w) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final int h(l0 l0Var) {
        return l0Var.a();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final int i(l0 l0Var) {
        l0 l0Var2 = l0Var;
        int i = l0Var2.f15665d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i10 = 0; i10 < l0Var2.f15662a; i10++) {
            int i11 = l0Var2.f15663b[i10] >>> 3;
            iB += AbstractC1733k.b(3, (AbstractC1730h) l0Var2.f15664c[i10]) + AbstractC1733k.k(2, i11) + (AbstractC1733k.j(1) * 2);
        }
        l0Var2.f15665d = iB;
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void j(Object obj) {
        ((AbstractC1744w) obj).unknownFields.f15666e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final l0 k(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (l0Var2.equals(l0.f15661f)) {
            return l0Var;
        }
        int i = l0Var.f15662a + l0Var2.f15662a;
        int[] iArrCopyOf = Arrays.copyOf(l0Var.f15663b, i);
        System.arraycopy(l0Var2.f15663b, 0, iArrCopyOf, l0Var.f15662a, l0Var2.f15662a);
        Object[] objArrCopyOf = Arrays.copyOf(l0Var.f15664c, i);
        System.arraycopy(l0Var2.f15664c, 0, objArrCopyOf, l0Var.f15662a, l0Var2.f15662a);
        return new l0(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final l0 m() {
        return new l0();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void n(Object obj, l0 l0Var) {
        ((AbstractC1744w) obj).unknownFields = l0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void o(AbstractC1744w abstractC1744w, Object obj) {
        abstractC1744w.unknownFields = (l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final l0 p(Object obj) {
        l0 l0Var = (l0) obj;
        l0Var.f15666e = false;
        return l0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void q(l0 l0Var, t0 t0Var) throws IOException {
        l0 l0Var2 = l0Var;
        l0Var2.getClass();
        C1734l c1734l = (C1734l) t0Var;
        c1734l.getClass();
        if (t0.a.ASCENDING == t0.a.DESCENDING) {
            for (int i = l0Var2.f15662a - 1; i >= 0; i--) {
                c1734l.l(l0Var2.f15663b[i] >>> 3, l0Var2.f15664c[i]);
            }
            return;
        }
        for (int i10 = 0; i10 < l0Var2.f15662a; i10++) {
            c1734l.l(l0Var2.f15663b[i10] >>> 3, l0Var2.f15664c[i10]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void r(l0 l0Var, t0 t0Var) throws IOException {
        l0Var.c(t0Var);
    }
}
