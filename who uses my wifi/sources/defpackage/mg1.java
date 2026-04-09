package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mg1 implements lf1 {
    public static final int[] l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] n;
    public static final byte[] o;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public nf1 g;
    public jg1 h;
    public qf1 j;
    public boolean k;
    public final byte[] a = new byte[1];
    public int f = -1;
    public jg1 i = new gf1();

    static {
        String str = v23.a;
        Charset charset = StandardCharsets.UTF_8;
        n = "#!AMR\n".getBytes(charset);
        o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(mf1 mf1Var) {
        mf1Var.i();
        byte[] bArr = n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        mf1Var.u(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            mf1Var.t(bArr.length);
            return true;
        }
        mf1Var.i();
        byte[] bArr3 = o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        mf1Var.u(bArr4, 0, length2);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        mf1Var.t(bArr3.length);
        return true;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        return a(mf1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: EOFException -> 0x0105, TryCatch #0 {EOFException -> 0x0105, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e6, B:53:0x00e7, B:54:0x0104), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: EOFException -> 0x0105, TryCatch #0 {EOFException -> 0x0105, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e6, B:53:0x00e7, B:54:0x0104), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r19, defpackage.pf1 r20) throws defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.g = nf1Var;
        jg1 jg1VarZ = nf1Var.z(0, 1);
        this.h = jg1VarZ;
        this.i = jg1VarZ;
        nf1Var.s();
    }
}
