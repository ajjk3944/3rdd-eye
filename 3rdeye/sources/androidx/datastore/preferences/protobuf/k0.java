package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class k0<T, B> {
    public abstract void a(B b10, int i, int i10);

    public abstract void b(B b10, int i, long j4);

    public abstract void c(B b10, int i, T t10);

    public abstract void d(B b10, int i, AbstractC1730h abstractC1730h);

    public abstract void e(B b10, int i, long j4);

    public abstract l0 f(Object obj);

    public abstract l0 g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract l0 k(Object obj, Object obj2);

    public final boolean l(B b10, e0 e0Var) throws IOException {
        int tag = e0Var.getTag();
        int i = tag >>> 3;
        int i10 = tag & 7;
        if (i10 == 0) {
            e(b10, i, e0Var.readInt64());
            return true;
        }
        if (i10 == 1) {
            b(b10, i, e0Var.readFixed64());
            return true;
        }
        if (i10 == 2) {
            d(b10, i, e0Var.readBytes());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C1747z.b();
            }
            a(b10, i, e0Var.readFixed32());
            return true;
        }
        l0 l0VarM = m();
        int i11 = (i << 3) | 4;
        while (e0Var.getFieldNumber() != Integer.MAX_VALUE && l(l0VarM, e0Var)) {
        }
        if (i11 != e0Var.getTag()) {
            throw new C1747z("Protocol message end-group tag did not match expected tag.");
        }
        c(b10, i, p(l0VarM));
        return true;
    }

    public abstract l0 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(AbstractC1744w abstractC1744w, Object obj);

    public abstract l0 p(Object obj);

    public abstract void q(T t10, t0 t0Var) throws IOException;

    public abstract void r(T t10, t0 t0Var) throws IOException;
}
