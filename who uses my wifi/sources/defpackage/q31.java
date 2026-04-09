package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q31 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final mc2 b;
    public volatile int c = 0;

    public q31(mc2 mc2Var, int i) {
        this.b = mc2Var;
        this.a = i;
    }

    public final int a(int i) {
        oe0 oe0VarB = b();
        int iA = oe0VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) oe0VarB.i;
        int i2 = iA + oe0VarB.f;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final oe0 b() {
        ThreadLocal threadLocal = d;
        oe0 oe0Var = (oe0) threadLocal.get();
        if (oe0Var == null) {
            oe0Var = new oe0();
            threadLocal.set(oe0Var);
        }
        pe0 pe0Var = (pe0) this.b.g;
        int iA = pe0Var.a(6);
        if (iA != 0) {
            int i = iA + pe0Var.f;
            int i2 = (this.a * 4) + ((ByteBuffer) pe0Var.i).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) pe0Var.i).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) pe0Var.i;
            oe0Var.i = byteBuffer;
            if (byteBuffer != null) {
                oe0Var.f = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                oe0Var.g = i4;
                oe0Var.h = ((ByteBuffer) oe0Var.i).getShort(i4);
                return oe0Var;
            }
            oe0Var.f = 0;
            oe0Var.g = 0;
            oe0Var.h = 0;
        }
        return oe0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        oe0 oe0VarB = b();
        int iA = oe0VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) oe0VarB.i).getInt(iA + oe0VarB.f) : 0));
        sb.append(", codepoints:");
        oe0 oe0VarB2 = b();
        int iA2 = oe0VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + oe0VarB2.f;
            i = ((ByteBuffer) oe0VarB2.i).getInt(((ByteBuffer) oe0VarB2.i).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
