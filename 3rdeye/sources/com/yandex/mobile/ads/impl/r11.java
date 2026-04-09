package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.dh;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class r11 implements u70, tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f32404a;

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f32405b;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f32406c;

    /* renamed from: d, reason: collision with root package name */
    private final uf1 f32407d;

    /* renamed from: e, reason: collision with root package name */
    private final uf1 f32408e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<dh.a> f32409f;

    /* renamed from: g, reason: collision with root package name */
    private final xw1 f32410g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f32411h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f32412j;

    /* renamed from: k, reason: collision with root package name */
    private long f32413k;

    /* renamed from: l, reason: collision with root package name */
    private int f32414l;

    /* renamed from: m, reason: collision with root package name */
    private uf1 f32415m;

    /* renamed from: n, reason: collision with root package name */
    private int f32416n;

    /* renamed from: o, reason: collision with root package name */
    private int f32417o;

    /* renamed from: p, reason: collision with root package name */
    private int f32418p;

    /* renamed from: q, reason: collision with root package name */
    private int f32419q;

    /* renamed from: r, reason: collision with root package name */
    private w70 f32420r;

    /* renamed from: s, reason: collision with root package name */
    private a[] f32421s;

    /* renamed from: t, reason: collision with root package name */
    private long[][] f32422t;

    /* renamed from: u, reason: collision with root package name */
    private int f32423u;

    /* renamed from: v, reason: collision with root package name */
    private long f32424v;

    /* renamed from: w, reason: collision with root package name */
    private int f32425w;

    /* renamed from: x, reason: collision with root package name */
    private p11 f32426x;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i52 f32427a;

        /* renamed from: b, reason: collision with root package name */
        public final o52 f32428b;

        /* renamed from: c, reason: collision with root package name */
        public final n52 f32429c;

        /* renamed from: d, reason: collision with root package name */
        public final v62 f32430d;

        /* renamed from: e, reason: collision with root package name */
        public int f32431e;

        public a(i52 i52Var, o52 o52Var, n52 n52Var) {
            this.f32427a = i52Var;
            this.f32428b = o52Var;
            this.f32429c = n52Var;
            this.f32430d = "audio/true-hd".equals(i52Var.f28502f.f26083m) ? new v62() : null;
        }
    }

    public r11() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i52 a(i52 i52Var) {
        return i52Var;
    }

    private static /* synthetic */ u70[] d() {
        return new u70[]{new r11()};
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f32424v;
    }

    public r11(int i) {
        this.f32404a = 0;
        this.i = 0;
        this.f32410g = new xw1();
        this.f32411h = new ArrayList();
        this.f32408e = new uf1(16);
        this.f32409f = new ArrayDeque<>();
        this.f32405b = new uf1(u31.f33899a);
        this.f32406c = new uf1(4);
        this.f32407d = new uf1();
        this.f32416n = -1;
        this.f32420r = w70.f34836a;
        this.f32421s = new a[0];
    }

    private void c(long j4) throws yf1 {
        while (!this.f32409f.isEmpty() && this.f32409f.peek().f26170b == j4) {
            dh.a aVarPop = this.f32409f.pop();
            if (aVarPop.f26169a == 1836019574) {
                a(aVarPop);
                this.f32409f.clear();
                this.i = 2;
            } else if (!this.f32409f.isEmpty()) {
                this.f32409f.peek().f26172d.add(aVarPop);
            }
        }
        if (this.i != 2) {
            this.i = 0;
            this.f32414l = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f32420r = w70Var;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.yandex.mobile.ads.impl.dh.a r31) throws com.yandex.mobile.ads.impl.yf1 {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.r11.a(com.yandex.mobile.ads.impl.dh$a):void");
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long jMin;
        long jMin2;
        long j10;
        boolean z10;
        int i;
        long j11;
        long j12;
        int iA;
        long j13 = j4;
        a[] aVarArr = this.f32421s;
        if (aVarArr.length == 0) {
            vw1 vw1Var = vw1.f34726c;
            return new tw1.a(vw1Var, vw1Var);
        }
        int i10 = this.f32423u;
        boolean z11 = false;
        int i11 = -1;
        if (i10 != -1) {
            o52 o52Var = aVarArr[i10].f32428b;
            int iB = s82.b(o52Var.f31201f, j13, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                }
                if ((o52Var.f31202g[iB] & 1) != 0) {
                    break;
                }
                iB--;
            }
            if (iB == -1) {
                iB = o52Var.a(j13);
            }
            if (iB == -1) {
                vw1 vw1Var2 = vw1.f34726c;
                return new tw1.a(vw1Var2, vw1Var2);
            }
            long j14 = o52Var.f31201f[iB];
            jMin = o52Var.f31198c[iB];
            if (j14 >= j13 || iB >= o52Var.f31197b - 1 || (iA = o52Var.a(j13)) == -1 || iA == iB) {
                j12 = -1;
                j10 = -9223372036854775807L;
            } else {
                j10 = o52Var.f31201f[iA];
                j12 = o52Var.f31198c[iA];
            }
            jMin2 = j12;
            j13 = j14;
        } else {
            jMin = Long.MAX_VALUE;
            jMin2 = -1;
            j10 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            a[] aVarArr2 = this.f32421s;
            if (i12 >= aVarArr2.length) {
                break;
            }
            if (i12 != this.f32423u) {
                o52 o52Var2 = aVarArr2[i12].f32428b;
                int iB2 = s82.b(o52Var2.f31201f, j13, z11);
                while (true) {
                    if (iB2 < 0) {
                        j11 = -9223372036854775807L;
                        iB2 = i11;
                        break;
                    }
                    j11 = -9223372036854775807L;
                    if ((o52Var2.f31202g[iB2] & 1) != 0) {
                        break;
                    }
                    iB2--;
                }
                if (iB2 == i11) {
                    iB2 = o52Var2.a(j13);
                }
                if (iB2 != i11) {
                    jMin = Math.min(o52Var2.f31198c[iB2], jMin);
                }
                if (j10 != j11) {
                    z10 = false;
                    int iB3 = s82.b(o52Var2.f31201f, j10, false);
                    while (true) {
                        if (iB3 < 0) {
                            iB3 = -1;
                            break;
                        }
                        if ((o52Var2.f31202g[iB3] & 1) != 0) {
                            break;
                        }
                        iB3--;
                    }
                    i = -1;
                    if (iB3 == -1) {
                        iB3 = o52Var2.a(j10);
                    }
                    if (iB3 != -1) {
                        jMin2 = Math.min(o52Var2.f31198c[iB3], jMin2);
                    }
                } else {
                    z10 = false;
                    i = -1;
                }
            } else {
                z10 = z11;
                i = i11;
            }
            i12++;
            i11 = i;
            z11 = z10;
        }
        vw1 vw1Var3 = new vw1(j13, jMin);
        if (j10 == -9223372036854775807L) {
            return new tw1.a(vw1Var3, vw1Var3);
        }
        return new tw1.a(vw1Var3, new vw1(j10, jMin2));
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        long j4;
        char c10;
        long j10;
        int i;
        boolean z10;
        dh.a aVarPeek;
        while (true) {
            int i10 = this.i;
            char c11 = 2;
            if (i10 == 0) {
                if (this.f32414l == 0) {
                    if (!v70Var.a(this.f32408e.c(), 0, 8, true)) {
                        if (this.f32425w != 2 || (this.f32404a & 2) == 0) {
                            return -1;
                        }
                        n52 n52VarA = this.f32420r.a(0, 4);
                        p11 p11Var = this.f32426x;
                        n52VarA.a(new dc0.a().a(p11Var != null ? new yz0(p11Var) : null).a());
                        this.f32420r.a();
                        this.f32420r.a(new tw1.b(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.f32414l = 8;
                    this.f32408e.e(0);
                    this.f32413k = this.f32408e.v();
                    this.f32412j = this.f32408e.h();
                }
                long j11 = this.f32413k;
                if (j11 == 1) {
                    v70Var.b(this.f32408e.c(), 8, 8);
                    this.f32414l += 8;
                    this.f32413k = this.f32408e.y();
                } else if (j11 == 0) {
                    long jB = v70Var.b();
                    if (jB == -1 && (aVarPeek = this.f32409f.peek()) != null) {
                        jB = aVarPeek.f26170b;
                    }
                    if (jB != -1) {
                        this.f32413k = (jB - v70Var.a()) + this.f32414l;
                    }
                }
                long j12 = this.f32413k;
                int i11 = this.f32414l;
                if (j12 >= i11) {
                    int i12 = this.f32412j;
                    if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473) {
                        long jA = v70Var.a();
                        long j13 = this.f32413k;
                        long j14 = this.f32414l;
                        long j15 = (jA + j13) - j14;
                        if (j13 != j14 && this.f32412j == 1835365473) {
                            this.f32407d.c(8);
                            v70Var.a(this.f32407d.c(), 0, 8);
                            uf1 uf1Var = this.f32407d;
                            int i13 = eh.f26845b;
                            int iD = uf1Var.d();
                            uf1Var.f(4);
                            if (uf1Var.h() != 1751411826) {
                                iD += 4;
                            }
                            uf1Var.e(iD);
                            v70Var.a(this.f32407d.d());
                            v70Var.c();
                        }
                        this.f32409f.push(new dh.a(this.f32412j, j15));
                        if (this.f32413k == this.f32414l) {
                            c(j15);
                        } else {
                            this.i = 0;
                            this.f32414l = 0;
                        }
                    } else if (i12 != 1835296868 && i12 != 1836476516 && i12 != 1751411826 && i12 != 1937011556 && i12 != 1937011827 && i12 != 1937011571 && i12 != 1668576371 && i12 != 1701606260 && i12 != 1937011555 && i12 != 1937011578 && i12 != 1937013298 && i12 != 1937007471 && i12 != 1668232756 && i12 != 1953196132 && i12 != 1718909296 && i12 != 1969517665 && i12 != 1801812339 && i12 != 1768715124) {
                        long jA2 = v70Var.a();
                        long j16 = this.f32414l;
                        long j17 = jA2 - j16;
                        if (this.f32412j == 1836086884) {
                            this.f32426x = new p11(0L, j17, -9223372036854775807L, j17 + j16, this.f32413k - j16);
                        }
                        this.f32415m = null;
                        this.i = 1;
                    } else {
                        if (i11 != 8) {
                            throw new IllegalStateException();
                        }
                        if (j12 <= 2147483647L) {
                            uf1 uf1Var2 = new uf1((int) j12);
                            System.arraycopy(this.f32408e.c(), 0, uf1Var2.c(), 0, 8);
                            this.f32415m = uf1Var2;
                            this.i = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    throw yf1.a("Atom size less than header length (unsupported).");
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            this.f32410g.a(v70Var, jj1Var, this.f32411h);
                            if (jj1Var.f29169a == 0) {
                                this.i = 0;
                                this.f32414l = 0;
                            }
                            return 1;
                        }
                        throw new IllegalStateException();
                    }
                    long jA3 = v70Var.a();
                    if (this.f32416n == -1) {
                        int i14 = 0;
                        boolean z11 = true;
                        boolean z12 = true;
                        j4 = 0;
                        int i15 = -1;
                        int i16 = -1;
                        long j18 = Long.MAX_VALUE;
                        long j19 = Long.MAX_VALUE;
                        long j20 = Long.MAX_VALUE;
                        j10 = 262144;
                        while (true) {
                            a[] aVarArr = this.f32421s;
                            if (i14 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i14];
                            int i17 = aVar.f32431e;
                            o52 o52Var = aVar.f32428b;
                            char c12 = c11;
                            if (i17 != o52Var.f31197b) {
                                long j21 = o52Var.f31198c[i17];
                                long[][] jArr = this.f32422t;
                                int i18 = s82.f32899a;
                                long j22 = jArr[i14][i17];
                                long j23 = j21 - jA3;
                                boolean z13 = j23 < 0 || j23 >= 262144;
                                if ((!z13 && z11) || (z13 == z11 && j23 < j20)) {
                                    z11 = z13;
                                    i16 = i14;
                                    j20 = j23;
                                    j19 = j22;
                                }
                                if (j22 < j18) {
                                    z12 = z13;
                                    i15 = i14;
                                    j18 = j22;
                                }
                            }
                            i14++;
                            c11 = c12;
                        }
                        c10 = c11;
                        int i19 = (j18 == Long.MAX_VALUE || !z12 || j19 < j18 + 10485760) ? i16 : i15;
                        this.f32416n = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    } else {
                        j4 = 0;
                        c10 = 2;
                        j10 = 262144;
                    }
                    a aVar2 = this.f32421s[this.f32416n];
                    n52 n52Var = aVar2.f32429c;
                    int i20 = aVar2.f32431e;
                    o52 o52Var2 = aVar2.f32428b;
                    long j24 = o52Var2.f31198c[i20];
                    int i21 = o52Var2.f31199d[i20];
                    v62 v62Var = aVar2.f32430d;
                    int i22 = 4;
                    long j25 = (j24 - jA3) + this.f32417o;
                    if (j25 >= j4 && j25 < j10) {
                        if (aVar2.f32427a.f28503g == 1) {
                            j25 += 8;
                            i21 -= 8;
                        }
                        v70Var.a((int) j25);
                        i52 i52Var = aVar2.f32427a;
                        if (i52Var.f28505j != 0) {
                            byte[] bArrC = this.f32406c.c();
                            bArrC[0] = 0;
                            bArrC[1] = 0;
                            bArrC[c10] = 0;
                            int i23 = aVar2.f32427a.f28505j;
                            int i24 = 4 - i23;
                            while (this.f32418p < i21) {
                                int i25 = this.f32419q;
                                if (i25 == 0) {
                                    v70Var.b(bArrC, i24, i23);
                                    this.f32417o += i23;
                                    this.f32406c.e(0);
                                    int iH = this.f32406c.h();
                                    if (iH >= 0) {
                                        this.f32419q = iH;
                                        this.f32405b.e(0);
                                        int i26 = i22;
                                        n52Var.a(i26, this.f32405b);
                                        this.f32418p += i26;
                                        i21 += i24;
                                    } else {
                                        throw yf1.a("Invalid NAL length", (Exception) null);
                                    }
                                } else {
                                    int iB = n52Var.b(v70Var, i25, false);
                                    this.f32417o += iB;
                                    this.f32418p += iB;
                                    this.f32419q -= iB;
                                }
                                i22 = 4;
                            }
                        } else {
                            if ("audio/ac4".equals(i52Var.f28502f.f26083m)) {
                                if (this.f32418p == 0) {
                                    C4193s.a(i21, this.f32407d);
                                    i = 7;
                                    n52Var.a(7, this.f32407d);
                                    this.f32418p += 7;
                                } else {
                                    i = 7;
                                }
                                i21 += i;
                            } else if (v62Var != null) {
                                v62Var.a(v70Var);
                            }
                            while (true) {
                                int i27 = this.f32418p;
                                if (i27 >= i21) {
                                    break;
                                }
                                int iB2 = n52Var.b(v70Var, i21 - i27, false);
                                this.f32417o += iB2;
                                this.f32418p += iB2;
                                this.f32419q -= iB2;
                            }
                        }
                        int i28 = i21;
                        o52 o52Var3 = aVar2.f32428b;
                        long j26 = o52Var3.f31201f[i20];
                        int i29 = o52Var3.f31202g[i20];
                        if (v62Var != null) {
                            v62Var.a(n52Var, j26, i29, i28, 0, null);
                            if (i20 + 1 == aVar2.f32428b.f31197b) {
                                v62Var.a(n52Var, null);
                            }
                        } else {
                            n52Var.a(j26, i29, i28, 0, null);
                        }
                        aVar2.f32431e++;
                        this.f32416n = -1;
                        this.f32417o = 0;
                        this.f32418p = 0;
                        this.f32419q = 0;
                        return 0;
                    }
                    jj1Var.f29169a = j24;
                    return 1;
                }
                long j27 = this.f32413k - this.f32414l;
                long jA4 = v70Var.a() + j27;
                uf1 uf1Var3 = this.f32415m;
                if (uf1Var3 != null) {
                    v70Var.b(uf1Var3.c(), this.f32414l, (int) j27);
                    if (this.f32412j == 1718909296) {
                        uf1Var3.e(8);
                        int iH2 = uf1Var3.h();
                        int i30 = iH2 != 1751476579 ? iH2 != 1903435808 ? 0 : 1 : 2;
                        if (i30 == 0) {
                            uf1Var3.f(4);
                            while (true) {
                                if (uf1Var3.a() <= 0) {
                                    i30 = 0;
                                    break;
                                }
                                int iH3 = uf1Var3.h();
                                i30 = iH3 != 1751476579 ? iH3 != 1903435808 ? 0 : 1 : 2;
                                if (i30 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f32425w = i30;
                    } else if (!this.f32409f.isEmpty()) {
                        this.f32409f.peek().f26171c.add(new dh.b(this.f32412j, uf1Var3));
                    }
                } else if (j27 < 262144) {
                    v70Var.a((int) j27);
                } else {
                    jj1Var.f29169a = v70Var.a() + j27;
                    z10 = true;
                    c(jA4);
                    if (z10 && this.i != 2) {
                        return 1;
                    }
                }
                z10 = false;
                c(jA4);
                if (z10) {
                    continue;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f32409f.clear();
        this.f32414l = 0;
        this.f32416n = -1;
        this.f32417o = 0;
        this.f32418p = 0;
        this.f32419q = 0;
        if (j4 == 0) {
            if (this.i != 3) {
                this.i = 0;
                this.f32414l = 0;
                return;
            } else {
                this.f32410g.a();
                this.f32411h.clear();
                return;
            }
        }
        for (a aVar : this.f32421s) {
            o52 o52Var = aVar.f32428b;
            int iB = s82.b(o52Var.f31201f, j10, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                } else if ((o52Var.f31202g[iB] & 1) != 0) {
                    break;
                } else {
                    iB--;
                }
            }
            if (iB == -1) {
                iB = o52Var.a(j10);
            }
            aVar.f32431e = iB;
            v62 v62Var = aVar.f32430d;
            if (v62Var != null) {
                v62Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        return i02.a(v70Var, (this.f32404a & 2) != 0);
    }
}
