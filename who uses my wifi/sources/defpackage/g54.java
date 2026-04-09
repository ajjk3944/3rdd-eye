package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class g54 extends yb {
    public static final Logger t = Logger.getLogger(g54.class.getName());
    public static final boolean u = g74.e;
    public it3 s;

    public static int D(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int E(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int F(String str) {
        int length;
        try {
            length = i74.b(str);
        } catch (h74 unused) {
            length = str.getBytes(y54.a).length;
        }
        return D(length) + length;
    }

    public final void G() {
        if (N() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void H(String str, h74 h74Var) throws h40 {
        t.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h74Var);
        byte[] bytes = str.getBytes(y54.a);
        try {
            int length = bytes.length;
            X(length);
            w(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new h40(e);
        }
    }

    public abstract void I(int i, int i2);

    public abstract void J(int i, int i2);

    public abstract void K(int i, int i2);

    public abstract void L(int i, int i2);

    public abstract void M(int i, long j);

    public abstract int N();

    public abstract void O(int i, long j);

    public abstract void P(int i, boolean z);

    public abstract void Q(String str, int i);

    public abstract void R(int i, a54 a54Var);

    public abstract void S(a54 a54Var);

    public abstract void T(int i, byte[] bArr);

    public abstract void U(s44 s44Var);

    public abstract void V(byte b);

    public abstract void W(int i);

    public abstract void X(int i);

    public abstract void Y(int i);

    public abstract void Z(long j);

    public abstract void a0(long j);

    public abstract void b0(String str);
}
