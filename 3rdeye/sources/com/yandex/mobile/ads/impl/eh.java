package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.dh;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class eh {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f26844a = s82.c("OpusHead");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26845b = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f26846a;

        /* renamed from: b, reason: collision with root package name */
        public int f26847b;

        /* renamed from: c, reason: collision with root package name */
        public int f26848c;

        /* renamed from: d, reason: collision with root package name */
        public long f26849d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26850e;

        /* renamed from: f, reason: collision with root package name */
        private final uf1 f26851f;

        /* renamed from: g, reason: collision with root package name */
        private final uf1 f26852g;

        /* renamed from: h, reason: collision with root package name */
        private int f26853h;
        private int i;

        public a(uf1 uf1Var, uf1 uf1Var2, boolean z10) throws yf1 {
            this.f26852g = uf1Var;
            this.f26851f = uf1Var2;
            this.f26850e = z10;
            uf1Var2.e(12);
            this.f26846a = uf1Var2.x();
            uf1Var.e(12);
            this.i = uf1Var.x();
            x70.a(uf1Var.h() == 1);
            this.f26847b = -1;
        }

        public final boolean a() {
            int i = this.f26847b + 1;
            this.f26847b = i;
            if (i == this.f26846a) {
                return false;
            }
            this.f26849d = this.f26850e ? this.f26851f.y() : this.f26851f.v();
            if (this.f26847b == this.f26853h) {
                this.f26848c = this.f26852g.x();
                this.f26852g.f(4);
                int i10 = this.i - 1;
                this.i = i10;
                this.f26853h = i10 > 0 ? this.f26852g.x() - 1 : -1;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f26854a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f26855b;

        /* renamed from: c, reason: collision with root package name */
        private final long f26856c;

        /* renamed from: d, reason: collision with root package name */
        private final long f26857d;

        public b(String str, byte[] bArr, long j4, long j10) {
            this.f26854a = str;
            this.f26855b = bArr;
            this.f26856c = j4;
            this.f26857d = j10;
        }
    }

    public interface c {
        int a();

        int b();

        int c();
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f26858a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26859b;

        /* renamed from: c, reason: collision with root package name */
        private final uf1 f26860c;

        public d(dh.b bVar, dc0 dc0Var) {
            uf1 uf1Var = bVar.f26173b;
            this.f26860c = uf1Var;
            uf1Var.e(12);
            int iX = uf1Var.x();
            if ("audio/raw".equals(dc0Var.f26083m)) {
                int iB = s82.b(dc0Var.f26067B, dc0Var.f26096z);
                if (iX == 0 || iX % iB != 0) {
                    rs0.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iX);
                    iX = iB;
                }
            }
            this.f26858a = iX == 0 ? -1 : iX;
            this.f26859b = uf1Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.eh.c
        public final int a() {
            return this.f26858a;
        }

        @Override // com.yandex.mobile.ads.impl.eh.c
        public final int b() {
            return this.f26859b;
        }

        @Override // com.yandex.mobile.ads.impl.eh.c
        public final int c() {
            int i = this.f26858a;
            return i == -1 ? this.f26860c.x() : i;
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final uf1 f26861a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26862b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26863c;

        /* renamed from: d, reason: collision with root package name */
        private int f26864d;

        /* renamed from: e, reason: collision with root package name */
        private int f26865e;

        public e(dh.b bVar) {
            uf1 uf1Var = bVar.f26173b;
            this.f26861a = uf1Var;
            uf1Var.e(12);
            this.f26863c = uf1Var.x() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f26862b = uf1Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.eh.c
        public final int a() {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.eh.c
        public final int b() {
            return this.f26862b;
        }

        @Override // com.yandex.mobile.ads.impl.eh.c
        public final int c() {
            int i = this.f26863c;
            if (i == 8) {
                return this.f26861a.t();
            }
            if (i == 16) {
                return this.f26861a.z();
            }
            int i10 = this.f26864d;
            this.f26864d = i10 + 1;
            if (i10 % 2 != 0) {
                return this.f26865e & 15;
            }
            int iT = this.f26861a.t();
            this.f26865e = iT;
            return (iT & 240) >> 4;
        }
    }

    private static b a(int i, uf1 uf1Var) {
        uf1Var.e(i + 12);
        uf1Var.f(1);
        a(uf1Var);
        uf1Var.f(2);
        int iT = uf1Var.t();
        if ((iT & 128) != 0) {
            uf1Var.f(2);
        }
        if ((iT & 64) != 0) {
            uf1Var.f(uf1Var.t());
        }
        if ((iT & 32) != 0) {
            uf1Var.f(2);
        }
        uf1Var.f(1);
        a(uf1Var);
        String strA = k01.a(uf1Var.t());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return new b(strA, null, -1L, -1L);
        }
        uf1Var.f(4);
        long jV = uf1Var.v();
        long jV2 = uf1Var.v();
        uf1Var.f(1);
        int iA = a(uf1Var);
        long j4 = jV2;
        byte[] bArr = new byte[iA];
        uf1Var.a(bArr, 0, iA);
        if (j4 <= 0) {
            j4 = -1;
        }
        return new b(strA, bArr, j4, jV > 0 ? jV : -1L);
    }

    private static int a(uf1 uf1Var) {
        int iT = uf1Var.t();
        int i = iT & 127;
        while ((iT & 128) == 128) {
            iT = uf1Var.t();
            i = (i << 7) | (iT & 127);
        }
        return i;
    }

    private static Pair a(int i, int i10, uf1 uf1Var) throws yf1 {
        Integer num;
        j52 j52Var;
        Pair pairCreate;
        int i11;
        int i12;
        Integer num2;
        boolean z10;
        byte[] bArr;
        int iD = uf1Var.d();
        while (iD - i < i10) {
            uf1Var.e(iD);
            int iH = uf1Var.h();
            if (iH > 0) {
                if (uf1Var.h() == 1936289382) {
                    int i13 = iD + 8;
                    int i14 = 0;
                    int i15 = -1;
                    Integer numValueOf = null;
                    String strA = null;
                    while (i13 - iD < iH) {
                        uf1Var.e(i13);
                        int iH2 = uf1Var.h();
                        int iH3 = uf1Var.h();
                        if (iH3 == 1718775137) {
                            numValueOf = Integer.valueOf(uf1Var.h());
                        } else if (iH3 == 1935894637) {
                            uf1Var.f(4);
                            strA = uf1Var.a(4, fo.f27410c);
                        } else if (iH3 == 1935894633) {
                            i15 = i13;
                            i14 = iH2;
                        }
                        i13 += iH2;
                    }
                    if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                        if (!(numValueOf != null)) {
                            throw yf1.a("frma atom is mandatory", (Exception) null);
                        }
                        if (!(i15 != -1)) {
                            throw yf1.a("schi atom is mandatory", (Exception) null);
                        }
                        int i16 = i15 + 8;
                        while (true) {
                            if (i16 - i15 >= i14) {
                                num = numValueOf;
                                j52Var = null;
                                break;
                            }
                            uf1Var.e(i16);
                            int iH4 = uf1Var.h();
                            if (uf1Var.h() == 1952804451) {
                                int iH5 = (uf1Var.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                uf1Var.f(1);
                                if (iH5 == 0) {
                                    uf1Var.f(1);
                                    i12 = 0;
                                    i11 = 0;
                                } else {
                                    int iT = uf1Var.t();
                                    i11 = iT & 15;
                                    i12 = (iT & 240) >> 4;
                                }
                                if (uf1Var.t() == 1) {
                                    num2 = numValueOf;
                                    z10 = true;
                                } else {
                                    num2 = numValueOf;
                                    z10 = false;
                                }
                                int iT2 = uf1Var.t();
                                byte[] bArr2 = new byte[16];
                                uf1Var.a(bArr2, 0, 16);
                                if (z10 && iT2 == 0) {
                                    int iT3 = uf1Var.t();
                                    byte[] bArr3 = new byte[iT3];
                                    uf1Var.a(bArr3, 0, iT3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                j52Var = new j52(z10, strA, iT2, bArr2, i12, i11, bArr);
                            } else {
                                i16 += iH4;
                            }
                        }
                        if (j52Var != null) {
                            int i17 = s82.f32899a;
                            pairCreate = Pair.create(num, j52Var);
                        } else {
                            throw yf1.a("tenc atom is mandatory", (Exception) null);
                        }
                    } else {
                        pairCreate = null;
                    }
                    if (pairCreate != null) {
                        return pairCreate;
                    }
                }
                iD += iH;
            } else {
                throw yf1.a("childAtomSize must be positive", (Exception) null);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.o52 a(com.yandex.mobile.ads.impl.i52 r36, com.yandex.mobile.ads.impl.dh.a r37, com.yandex.mobile.ads.impl.ce0 r38) throws com.yandex.mobile.ads.impl.yf1 {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eh.a(com.yandex.mobile.ads.impl.i52, com.yandex.mobile.ads.impl.dh$a, com.yandex.mobile.ads.impl.ce0):com.yandex.mobile.ads.impl.o52");
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x08a6, code lost:
    
        r67 = r1;
        r62 = r2;
        r58 = r5;
        r55 = r7;
        r61 = r10;
        r59 = r12;
        r60 = r13;
        r10 = r16;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0c04, code lost:
    
        if (r14 != null) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0c06, code lost:
    
        r1 = r49;
        r28 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0c0d, code lost:
    
        r1 = r49;
        r0 = new com.yandex.mobile.ads.impl.dc0.a().g(r3).e(r14).a(r9).o(r67).f(r62).b(r61).k(r1).a(r60).n(r59).a(r58).a(r56);
        r2 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0c51, code lost:
    
        if (r2 != (-1)) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0c53, code lost:
    
        r6 = r51;
        r9 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0c57, code lost:
    
        if (r6 != (-1)) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0c59, code lost:
    
        if (r9 != (-1)) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0c5b, code lost:
    
        if (r39 == null) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0c5e, code lost:
    
        r9 = r40;
        r6 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0c64, code lost:
    
        if (r39 == null) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0c66, code lost:
    
        r13 = r39.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0c6b, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0c6c, code lost:
    
        r0.a(new com.yandex.mobile.ads.impl.lq(r2, r6, r9, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0c72, code lost:
    
        if (r28 == null) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0c74, code lost:
    
        r0.b(com.yandex.mobile.ads.impl.up0.b(r28.f26856c)).j(com.yandex.mobile.ads.impl.up0.b(r28.f26857d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0c8b, code lost:
    
        r25 = r0.a();
        r28 = r52;
     */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0715 A[PHI: r38 r39
  0x0715: PHI (r38v8 java.util.List<byte[]>) = (r38v6 java.util.List<byte[]>), (r38v9 java.util.List<byte[]>) binds: [B:389:0x0747, B:370:0x06c9] A[DONT_GENERATE, DONT_INLINE]
  0x0715: PHI (r39v12 int) = (r39v10 int), (r39v13 int) binds: [B:389:0x0747, B:370:0x06c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0d6b  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(com.yandex.mobile.ads.impl.dh.a r69, com.yandex.mobile.ads.impl.ce0 r70, long r71, com.yandex.mobile.ads.impl.a40 r73, boolean r74, boolean r75, com.yandex.mobile.ads.impl.zd0 r76) throws com.yandex.mobile.ads.impl.yf1 {
        /*
            Method dump skipped, instructions count: 3490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.eh.a(com.yandex.mobile.ads.impl.dh$a, com.yandex.mobile.ads.impl.ce0, long, com.yandex.mobile.ads.impl.a40, boolean, boolean, com.yandex.mobile.ads.impl.zd0):java.util.ArrayList");
    }
}
