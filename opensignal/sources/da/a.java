package da;

import ca.k;
import ca.l;
import ca.m;
import ca.o;
import ca.x;
import com.google.android.exoplayer2.y0;
import java.nio.charset.Charset;
import java.util.Arrays;
import ne.g;
import qb.v;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f7183m = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7184n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f7185o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f7186p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f7187q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7189b;

    /* renamed from: c, reason: collision with root package name */
    public long f7190c;

    /* renamed from: d, reason: collision with root package name */
    public int f7191d;

    /* renamed from: e, reason: collision with root package name */
    public int f7192e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7193f;

    /* renamed from: h, reason: collision with root package name */
    public long f7195h;

    /* renamed from: i, reason: collision with root package name */
    public m f7196i;
    public x j;
    public o k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7197l;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7188a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f7194g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f7184n = iArr;
        int i10 = v.f20828a;
        Charset charset = g.f17524c;
        f7185o = "#!AMR\n".getBytes(charset);
        f7186p = "#!AMR-WB\n".getBytes(charset);
        f7187q = iArr[8];
    }

    public final int a(l lVar) throws y0 {
        boolean z10;
        lVar.l();
        byte[] bArr = this.f7188a;
        lVar.p(bArr, 0, 1);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid padding bits for frame header ");
            sb2.append((int) b2);
            throw y0.a(null, sb2.toString());
        }
        int i10 = (b2 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f7189b) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f7184n[i10] : f7183m[i10];
        }
        String str = this.f7189b ? "WB" : "NB";
        StringBuilder sb3 = new StringBuilder(str.length() + 35);
        sb3.append("Illegal AMR ");
        sb3.append(str);
        sb3.append(" frame type ");
        sb3.append(i10);
        throw y0.a(null, sb3.toString());
    }

    public final boolean b(l lVar) {
        lVar.l();
        byte[] bArr = f7185o;
        byte[] bArr2 = new byte[bArr.length];
        lVar.p(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f7189b = false;
            lVar.m(bArr.length);
            return true;
        }
        lVar.l();
        byte[] bArr3 = f7186p;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.p(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f7189b = true;
        lVar.m(bArr3.length);
        return true;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f7190c = 0L;
        this.f7191d = 0;
        this.f7192e = 0;
        this.f7195h = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r10, ca.n r11) throws com.google.android.exoplayer2.y0 {
        /*
            r9 = this;
            ca.x r11 = r9.j
            qb.b.k(r11)
            int r11 = qb.v.f20828a
            r11 = r10
            ca.h r11 = (ca.h) r11
            long r0 = r11.f3478r
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L21
            boolean r11 = r9.b(r10)
            if (r11 == 0) goto L19
            goto L21
        L19:
            java.lang.String r10 = "Could not find AMR header."
            r11 = 0
            com.google.android.exoplayer2.y0 r10 = com.google.android.exoplayer2.y0.a(r11, r10)
            throw r10
        L21:
            boolean r11 = r9.f7197l
            r0 = 1
            if (r11 != 0) goto L51
            r9.f7197l = r0
            boolean r11 = r9.f7189b
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
            ca.x r2 = r9.j
            com.google.android.exoplayer2.g0 r3 = new com.google.android.exoplayer2.g0
            r3.<init>()
            r3.k = r1
            int r1 = da.a.f7187q
            r3.f4151l = r1
            r3.f4163x = r0
            r3.f4164y = r11
            com.google.android.exoplayer2.Format r11 = new com.google.android.exoplayer2.Format
            r11.<init>(r3)
            r2.e(r11)
        L51:
            int r11 = r9.f7192e
            r1 = -1
            if (r11 != 0) goto L64
            int r11 = r9.a(r10)     // Catch: java.io.EOFException -> L8e
            r9.f7191d = r11     // Catch: java.io.EOFException -> L8e
            r9.f7192e = r11
            int r2 = r9.f7194g
            if (r2 != r1) goto L64
            r9.f7194g = r11
        L64:
            ca.x r11 = r9.j
            int r2 = r9.f7192e
            int r10 = r11.c(r10, r2, r0)
            if (r10 != r1) goto L6f
            goto L8e
        L6f:
            int r11 = r9.f7192e
            int r11 = r11 - r10
            r9.f7192e = r11
            r1 = 0
            if (r11 <= 0) goto L78
            goto L8e
        L78:
            ca.x r2 = r9.j
            long r10 = r9.f7195h
            long r3 = r9.f7190c
            long r3 = r3 + r10
            int r6 = r9.f7191d
            r7 = 0
            r8 = 0
            r5 = 1
            r2.d(r3, r5, r6, r7, r8)
            long r10 = r9.f7190c
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r2
            r9.f7190c = r10
        L8e:
            boolean r10 = r9.f7193f
            if (r10 == 0) goto L93
            goto La6
        L93:
            ca.o r10 = new ca.o
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.<init>(r2)
            r9.k = r10
            ca.m r11 = r9.f7196i
            r11.r(r10)
            r9.f7193f = r0
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: da.a.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        return b(lVar);
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f7196i = mVar;
        this.j = mVar.n(0, 1);
        mVar.j();
    }

    @Override // ca.k
    public final void release() {
    }
}
