package v5;

import a5.d0;
import androidx.media3.common.k0;
import java.nio.charset.Charset;
import java.util.Arrays;
import ne.g;
import u5.a0;
import u5.k;
import u5.l;
import u5.m;
import u5.x;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f23844n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f23845o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f23846p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f23847q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f23848r;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23850b;

    /* renamed from: c, reason: collision with root package name */
    public long f23851c;

    /* renamed from: d, reason: collision with root package name */
    public int f23852d;

    /* renamed from: e, reason: collision with root package name */
    public int f23853e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23854f;

    /* renamed from: h, reason: collision with root package name */
    public int f23856h;

    /* renamed from: i, reason: collision with root package name */
    public long f23857i;
    public m j;
    public a0 k;

    /* renamed from: l, reason: collision with root package name */
    public x f23858l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23859m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23849a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f23855g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f23845o = iArr;
        int i10 = d0.f105a;
        Charset charset = g.f17524c;
        f23846p = "#!AMR\n".getBytes(charset);
        f23847q = "#!AMR-WB\n".getBytes(charset);
        f23848r = iArr[8];
    }

    public final int a(l lVar) throws k0 {
        boolean z10;
        lVar.l();
        byte[] bArr = this.f23849a;
        lVar.p(bArr, 0, 1);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            throw k0.a(null, "Invalid padding bits for frame header " + ((int) b2));
        }
        int i10 = (b2 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f23850b) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f23845o[i10] : f23844n[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f23850b ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw k0.a(null, sb2.toString());
    }

    public final boolean b(l lVar) {
        lVar.l();
        byte[] bArr = f23846p;
        byte[] bArr2 = new byte[bArr.length];
        lVar.p(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f23850b = false;
            lVar.m(bArr.length);
            return true;
        }
        lVar.l();
        byte[] bArr3 = f23847q;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.p(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f23850b = true;
        lVar.m(bArr3.length);
        return true;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        this.f23851c = 0L;
        this.f23852d = 0;
        this.f23853e = 0;
        if (j != 0) {
            x xVar = this.f23858l;
            if (xVar instanceof k6.a) {
                this.f23857i = (Math.max(0L, j - ((k6.a) xVar).f14132b) * 8000000) / r0.f14135e;
                return;
            }
        }
        this.f23857i = 0L;
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.j = mVar;
        this.k = mVar.mo36n(0, 1);
        mVar.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r10, ca.n r11) throws androidx.media3.common.k0 {
        /*
            r9 = this;
            u5.a0 r11 = r9.k
            a5.a.j(r11)
            int r11 = a5.d0.f105a
            r11 = r10
            u5.h r11 = (u5.h) r11
            long r0 = r11.f23288r
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L21
            boolean r11 = r9.b(r10)
            if (r11 == 0) goto L19
            goto L21
        L19:
            java.lang.String r10 = "Could not find AMR header."
            r11 = 0
            androidx.media3.common.k0 r10 = androidx.media3.common.k0.a(r11, r10)
            throw r10
        L21:
            boolean r11 = r9.f23859m
            r0 = 1
            if (r11 != 0) goto L51
            r9.f23859m = r0
            boolean r11 = r9.f23850b
            if (r11 == 0) goto L2f
            java.lang.String r1 = "audio/amr-wb"
            goto L31
        L2f:
            java.lang.String r1 = "audio/3gpp"
        L31:
            if (r11 == 0) goto L36
            r11 = 16000(0x3e80, float:2.2421E-41)
            goto L38
        L36:
            r11 = 8000(0x1f40, float:1.121E-41)
        L38:
            u5.a0 r2 = r9.k
            androidx.media3.common.q r3 = new androidx.media3.common.q
            r3.<init>()
            r3.k = r1
            int r1 = v5.a.f23848r
            r3.f1743l = r1
            r3.f1755x = r0
            r3.f1756y = r11
            androidx.media3.common.r r11 = new androidx.media3.common.r
            r11.<init>(r3)
            r2.c(r11)
        L51:
            int r11 = r9.f23853e
            r1 = -1
            if (r11 != 0) goto L72
            int r11 = r9.a(r10)     // Catch: java.io.EOFException -> L9c
            r9.f23852d = r11     // Catch: java.io.EOFException -> L9c
            r9.f23853e = r11
            int r2 = r9.f23855g
            if (r2 != r1) goto L69
            r2 = r10
            u5.h r2 = (u5.h) r2
            long r2 = r2.f23288r
            r9.f23855g = r11
        L69:
            int r2 = r9.f23855g
            if (r2 != r11) goto L72
            int r11 = r9.f23856h
            int r11 = r11 + r0
            r9.f23856h = r11
        L72:
            u5.a0 r11 = r9.k
            int r2 = r9.f23853e
            int r10 = r11.b(r10, r2, r0)
            if (r10 != r1) goto L7d
            goto L9c
        L7d:
            int r11 = r9.f23853e
            int r11 = r11 - r10
            r9.f23853e = r11
            r1 = 0
            if (r11 <= 0) goto L86
            goto L9c
        L86:
            u5.a0 r2 = r9.k
            long r10 = r9.f23857i
            long r3 = r9.f23851c
            long r3 = r3 + r10
            int r6 = r9.f23852d
            r7 = 0
            r8 = 0
            r5 = 1
            r2.a(r3, r5, r6, r7, r8)
            long r10 = r9.f23851c
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r2
            r9.f23851c = r10
        L9c:
            boolean r10 = r9.f23854f
            if (r10 == 0) goto La1
            goto Lb4
        La1:
            u5.n r10 = new u5.n
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.<init>(r2)
            r9.f23858l = r10
            u5.m r11 = r9.j
            r11.u(r10)
            r9.f23854f = r0
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.a.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        return b(lVar);
    }

    @Override // u5.k
    public final void release() {
    }
}
