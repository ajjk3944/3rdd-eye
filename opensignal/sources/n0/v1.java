package n0;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f17333a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f17334b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f17335c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f17336d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f17337e;

    /* renamed from: f, reason: collision with root package name */
    public u.t f17338f;

    /* renamed from: g, reason: collision with root package name */
    public int f17339g;

    /* renamed from: h, reason: collision with root package name */
    public int f17340h;

    /* renamed from: i, reason: collision with root package name */
    public int f17341i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f17342l;

    /* renamed from: m, reason: collision with root package name */
    public int f17343m;

    /* renamed from: n, reason: collision with root package name */
    public int f17344n;

    /* renamed from: o, reason: collision with root package name */
    public int f17345o;

    /* renamed from: p, reason: collision with root package name */
    public final l0 f17346p;

    /* renamed from: q, reason: collision with root package name */
    public final l0 f17347q;

    /* renamed from: r, reason: collision with root package name */
    public final l0 f17348r;

    /* renamed from: s, reason: collision with root package name */
    public u.t f17349s;

    /* renamed from: t, reason: collision with root package name */
    public int f17350t;

    /* renamed from: u, reason: collision with root package name */
    public int f17351u;

    /* renamed from: v, reason: collision with root package name */
    public int f17352v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17353w;

    /* renamed from: x, reason: collision with root package name */
    public u.s f17354x;

    public v1(s1 s1Var) {
        this.f17333a = s1Var;
        int[] iArr = s1Var.f17310a;
        this.f17334b = iArr;
        Object[] objArr = s1Var.f17312g;
        this.f17335c = objArr;
        this.f17336d = s1Var.E;
        this.f17337e = s1Var.F;
        this.f17338f = s1Var.G;
        int i10 = s1Var.f17311d;
        this.f17339g = i10;
        this.f17340h = (iArr.length / 5) - i10;
        int i11 = s1Var.f17313r;
        this.k = i11;
        this.f17342l = objArr.length - i11;
        this.f17343m = i10;
        this.f17346p = new l0();
        this.f17347q = new l0();
        this.f17348r = new l0();
        this.f17351u = i10;
        this.f17352v = -1;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public final void A(int i10, int i11) {
        int i12 = this.f17342l;
        int i13 = this.k;
        int i14 = this.f17343m;
        if (i13 != i10) {
            Object[] objArr = this.f17335c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, p());
        if (i14 != iMin) {
            int length = this.f17335c.length - i12;
            if (iMin < i14) {
                int iR = r(iMin);
                int iR2 = r(i14);
                int i16 = this.f17339g;
                while (iR < iR2) {
                    int i17 = (iR * 5) + 4;
                    int i18 = this.f17334b[i17];
                    if (!(i18 >= 0)) {
                        q.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f17334b[i17] = -((length - i18) + 1);
                    iR++;
                    if (iR == i16) {
                        iR += this.f17340h;
                    }
                }
            } else {
                int iR3 = r(i14);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i19 = (iR3 * 5) + 4;
                    int i20 = this.f17334b[i19];
                    if (!(i20 < 0)) {
                        q.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f17334b[i19] = i20 + length + 1;
                    iR3++;
                    if (iR3 == this.f17339g) {
                        iR3 += this.f17340h;
                    }
                }
            }
            this.f17343m = iMin;
        }
        this.k = i10;
    }

    public final Object B(int i10) {
        int iR = r(i10);
        int[] iArr = this.f17334b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f17335c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int C(int[] iArr, int i10) {
        int i11 = iArr[(r(i10) * 5) + 2];
        return i11 > -2 ? i11 : (p() + i11) - (-2);
    }

    public final Object D(Object obj) {
        if (this.f17344n > 0) {
            w(1, this.f17352v);
        }
        Object[] objArr = this.f17335c;
        int i10 = this.f17341i;
        this.f17341i = i10 + 1;
        Object obj2 = objArr[h(i10)];
        if (this.f17341i > this.j) {
            q.c("Writing to an invalid slot");
        }
        this.f17335c[h(this.f17341i - 1)] = obj;
        return obj2;
    }

    public final void E() {
        int i10;
        u.s sVar = this.f17354x;
        if (sVar != null) {
            while (sVar.f23108b != 0) {
                int iL = w.l(sVar);
                int iR = r(iL);
                int iT = iL + 1;
                int iT2 = t(iL) + iL;
                while (true) {
                    if (iT >= iT2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f17334b[(r(iT) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.f17334b;
                int i11 = (iR * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iC = C(iArr, iL);
                    if (iC >= 0) {
                        w.e(sVar, iC);
                    }
                }
            }
        }
    }

    public final boolean F() {
        if (!(this.f17344n == 0)) {
            q.c("Cannot remove group while inserting");
        }
        int i10 = this.f17350t;
        int i11 = this.f17341i;
        int iG = g(this.f17334b, r(i10));
        int iJ = J();
        M(this.f17352v);
        u.s sVar = this.f17354x;
        if (sVar != null) {
            while (true) {
                int i12 = sVar.f23108b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    v.a.e("IntList is empty.");
                    throw null;
                }
                if (sVar.f23107a[0] < i10) {
                    break;
                }
                w.l(sVar);
            }
        }
        boolean zG = G(i10, this.f17350t - i10);
        H(iG, this.f17341i - iG, i10 - 1);
        this.f17350t = i10;
        this.f17341i = i11;
        this.f17345o -= iJ;
        return zG;
    }

    public final boolean G(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f17336d;
            z(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f17337e;
                int i12 = i10 + i11;
                int iB = u1.b(this.f17336d, i12, o() - this.f17340h);
                if (iB >= this.f17336d.size()) {
                    iB--;
                }
                int i13 = iB + 1;
                int i14 = 0;
                while (iB >= 0) {
                    a aVar = (a) this.f17336d.get(iB);
                    int iC = c(aVar);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        aVar.f17127a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iB + 1;
                        }
                        i13 = iB;
                    }
                    iB--;
                }
                z = i13 < i14;
                if (z) {
                    this.f17336d.subList(i13, i14).clear();
                }
            }
            this.f17339g = i10;
            this.f17340h += i11;
            int i15 = this.f17343m;
            if (i15 > i10) {
                this.f17343m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f17351u;
            if (i16 >= this.f17339g) {
                this.f17351u = i16 - i11;
            }
            int i17 = this.f17352v;
            if (i17 >= 0 && (this.f17334b[(r(i17) * 5) + 1] & 67108864) != 0) {
                R(i17);
            }
        }
        return z;
    }

    public final void H(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f17342l;
            int i14 = i10 + i11;
            A(i14, i12);
            this.k = i10;
            this.f17342l = i13 + i11;
            mq.l.i0(this.f17335c, i10, i14);
            int i15 = this.j;
            if (i15 >= i10) {
                this.j = i15 - i11;
            }
        }
    }

    public final Object I(int i10, int i11, Object obj) {
        int iL = L(this.f17334b, r(i10));
        int iG = g(this.f17334b, r(i10 + 1));
        int i12 = iL + i11;
        if (i12 < iL || i12 >= iG) {
            q.c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        int iH = h(i12);
        Object[] objArr = this.f17335c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int J() {
        int iR = r(this.f17350t);
        int iA = u1.a(this.f17334b, iR) + this.f17350t;
        this.f17350t = iA;
        this.f17341i = g(this.f17334b, r(iA));
        int i10 = this.f17334b[(iR * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void K() {
        int i10 = this.f17351u;
        this.f17350t = i10;
        this.f17341i = g(this.f17334b, r(i10));
    }

    public final int L(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f17335c.length - this.f17342l;
        }
        int iC = u1.c(iArr, i10);
        return iC < 0 ? (this.f17335c.length - this.f17342l) + iC + 1 : iC;
    }

    public final k0 M(int i10) {
        a aVarP;
        HashMap map = this.f17337e;
        if (map == null || (aVarP = P(i10)) == null) {
            return null;
        }
        return (k0) map.get(aVarP);
    }

    public final void N() {
        if (this.f17344n != 0) {
            q.c("Key must be supplied when inserting");
        }
        t0 t0Var = j.f17190a;
        O(0, t0Var, t0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        int i12 = this.f17352v;
        byte b2 = this.f17344n > 0;
        this.f17348r.c(this.f17345o);
        t0 t0Var = j.f17190a;
        if (b2 == true) {
            int i13 = this.f17350t;
            int iG = g(this.f17334b, r(i13));
            v(1);
            this.f17341i = iG;
            this.j = iG;
            int iR = r(i13);
            int i14 = obj != t0Var ? 1 : 0;
            int i15 = (z10 || obj2 == t0Var) ? 0 : 1;
            int i16 = i(iG, this.k, this.f17342l, this.f17335c.length);
            if (i16 >= 0 && this.f17343m < i13) {
                i16 = -(((this.f17335c.length - this.f17342l) - i16) + 1);
            }
            int[] iArr = this.f17334b;
            int i17 = this.f17352v;
            int i18 = iR * 5;
            iArr[i18] = i10;
            iArr[i18 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i18 + 2] = i17;
            iArr[i18 + 3] = 0;
            iArr[i18 + 4] = i16;
            int i19 = (z10 ? 1 : 0) + i14 + i15;
            if (i19 > 0) {
                w(i19, i13);
                Object[] objArr = this.f17335c;
                int i20 = this.f17341i;
                if (z10) {
                    objArr[i20] = obj2;
                    i20++;
                }
                if (i14 != 0) {
                    objArr[i20] = obj;
                    i20++;
                }
                if (i15 != 0) {
                    objArr[i20] = obj2;
                    i20++;
                }
                this.f17341i = i20;
            }
            this.f17345o = 0;
            i11 = i13 + 1;
            this.f17352v = i13;
            this.f17350t = i11;
            if (i12 >= 0) {
                M(i12);
            }
        } else {
            this.f17346p.c(i12);
            this.f17347q.c((o() - this.f17340h) - this.f17351u);
            int i21 = this.f17350t;
            int iR2 = r(i21);
            if (!br.l.a(obj2, t0Var)) {
                if (z10) {
                    S(this.f17350t, obj2);
                } else {
                    Q(obj2);
                }
            }
            this.f17341i = L(this.f17334b, iR2);
            this.j = g(this.f17334b, r(this.f17350t + 1));
            int[] iArr2 = this.f17334b;
            int i22 = iR2 * 5;
            this.f17345o = iArr2[i22 + 1] & 67108863;
            this.f17352v = i21;
            this.f17350t = i21 + 1;
            i11 = i21 + iArr2[i22 + 3];
        }
        this.f17351u = i11;
    }

    public final a P(int i10) {
        ArrayList arrayList;
        int iE;
        if (i10 < 0 || i10 >= p() || (iE = u1.e((arrayList = this.f17336d), i10, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(iE);
    }

    public final void Q(Object obj) {
        int iR = r(this.f17350t);
        int i10 = (iR * 5) + 1;
        if ((this.f17334b[i10] & 268435456) == 0) {
            q.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f17335c;
        int[] iArr = this.f17334b;
        objArr[h(Integer.bitCount(iArr[i10] >> 29) + g(iArr, iR))] = obj;
    }

    public final void R(int i10) {
        if (i10 >= 0) {
            u.s sVar = this.f17354x;
            if (sVar == null) {
                sVar = new u.s();
                this.f17354x = sVar;
            }
            w.e(sVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.f17334b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            n0.q.c(r5)
        L2e:
            java.lang.Object[] r5 = r4.f17335c
            int[] r1 = r4.f17334b
            int r0 = r4.g(r1, r0)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v1.S(int, java.lang.Object):void");
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            q.c("Cannot seek backwards");
        }
        if (!(this.f17344n <= 0)) {
            g1.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f17350t + i10;
        if (i11 >= this.f17352v && i11 <= this.f17351u) {
            z10 = true;
        }
        if (!z10) {
            q.c("Cannot seek outside the current group (" + this.f17352v + '-' + this.f17351u + ')');
        }
        this.f17350t = i11;
        int iG = g(this.f17334b, r(i11));
        this.f17341i = iG;
        this.j = iG;
    }

    public final a b(int i10) {
        ArrayList arrayList = this.f17336d;
        int iE = u1.e(arrayList, i10, p());
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        if (i10 > this.f17339g) {
            i10 = -(p() - i10);
        }
        a aVar = new a(i10);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i10 = aVar.f17127a;
        return i10 < 0 ? p() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f17344n;
        this.f17344n = i10 + 1;
        if (i10 == 0) {
            this.f17347q.c((o() - this.f17340h) - this.f17351u);
        }
    }

    public final void e(boolean z10) {
        this.f17353w = true;
        if (z10 && this.f17346p.f17214b == 0) {
            z(p());
            A(this.f17335c.length - this.f17342l, this.f17339g);
            int i10 = this.k;
            mq.l.i0(this.f17335c, i10, this.f17342l + i10);
            E();
        }
        int[] iArr = this.f17334b;
        int i11 = this.f17339g;
        Object[] objArr = this.f17335c;
        int i12 = this.k;
        ArrayList arrayList = this.f17336d;
        HashMap map = this.f17337e;
        u.t tVar = this.f17338f;
        s1 s1Var = this.f17333a;
        if (!s1Var.B) {
            g1.a("Unexpected writer close()");
        }
        s1Var.B = false;
        s1Var.f17310a = iArr;
        s1Var.f17311d = i11;
        s1Var.f17312g = objArr;
        s1Var.f17313r = i12;
        s1Var.E = arrayList;
        s1Var.F = map;
        s1Var.G = tVar;
    }

    public final int f(int i10) {
        return g(this.f17334b, r(i10));
    }

    public final int g(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f17335c.length - this.f17342l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f17335c.length - this.f17342l) + i11 + 1 : i11;
    }

    public final int h(int i10) {
        return (this.f17342l * (i10 < this.k ? 0 : 1)) + i10;
    }

    public final void j() {
        u.z zVar;
        boolean z10 = this.f17344n > 0;
        int i10 = this.f17350t;
        int i11 = this.f17351u;
        int i12 = this.f17352v;
        int iR = r(i12);
        int i13 = this.f17345o;
        int i14 = i10 - i12;
        int i15 = iR * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f17334b[i16] & 1073741824) != 0;
        l0 l0Var = this.f17348r;
        if (z10) {
            u.t tVar = this.f17349s;
            if (tVar != null && (zVar = (u.z) tVar.b(i12)) != null) {
                Object[] objArr = zVar.f23134a;
                int i17 = zVar.f23135b;
                for (int i18 = 0; i18 < i17; i18++) {
                    D(objArr[i18]);
                }
            }
            int[] iArr = this.f17334b;
            iArr[i15 + 3] = i14;
            u1.d(iR, i13, iArr);
            int iB = l0Var.b();
            if (z11) {
                i13 = 1;
            }
            this.f17345o = iB + i13;
            int iC = C(this.f17334b, i12);
            this.f17352v = iC;
            int iP = iC < 0 ? p() : r(iC + 1);
            int iG = iP >= 0 ? g(this.f17334b, iP) : 0;
            this.f17341i = iG;
            this.j = iG;
            return;
        }
        if (i10 != i11) {
            q.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f17334b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        u1.d(iR, i13, iArr2);
        int iB2 = this.f17346p.b();
        this.f17351u = (o() - this.f17340h) - this.f17347q.b();
        this.f17352v = iB2;
        int iC2 = C(this.f17334b, i12);
        int iB3 = l0Var.b();
        this.f17345o = iB3;
        if (iC2 == iB2) {
            this.f17345o = iB3 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iC2 != 0 && iC2 != iB2 && (i23 != 0 || i22 != 0)) {
                int iR2 = r(iC2);
                if (i22 != 0) {
                    int[] iArr3 = this.f17334b;
                    int i24 = (iR2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f17334b;
                    u1.d(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i23, iArr4);
                }
                int[] iArr5 = this.f17334b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iC2 = C(iArr5, iC2);
            }
        }
        this.f17345o += i23;
    }

    public final void k() {
        if (this.f17344n <= 0) {
            g1.b("Unbalanced begin/end insert");
        }
        int i10 = this.f17344n - 1;
        this.f17344n = i10;
        if (i10 == 0) {
            if (this.f17348r.f17214b != this.f17346p.f17214b) {
                q.c("startGroup/endGroup mismatch while inserting");
            }
            this.f17351u = (o() - this.f17340h) - this.f17347q.b();
        }
    }

    public final void l(int i10) {
        boolean z10 = false;
        if (!(this.f17344n <= 0)) {
            q.c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f17352v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f17351u) {
                z10 = true;
            }
            if (!z10) {
                q.c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f17350t;
            int i13 = this.f17341i;
            int i14 = this.j;
            this.f17350t = i10;
            N();
            this.f17350t = i12;
            this.f17341i = i13;
            this.j = i14;
        }
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= this.f17339g) {
            i10 = -((p() - i10) + 2);
        }
        while (i12 < i11) {
            this.f17334b[(r(i12) * 5) + 2] = i10;
            int i13 = this.f17334b[(r(i12) * 5) + 3] + i12;
            m(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        v.a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r20, ar.n r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v1.n(int, ar.n):void");
    }

    public final int o() {
        return this.f17334b.length / 5;
    }

    public final int p() {
        return o() - this.f17340h;
    }

    public final Object q(int i10) {
        int iR = r(i10);
        int[] iArr = this.f17334b;
        int i11 = (iR * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return j.f17190a;
        }
        return this.f17335c[Integer.bitCount(iArr[i11] >> 29) + g(iArr, iR)];
    }

    public final int r(int i10) {
        return (this.f17340h * (i10 < this.f17339g ? 0 : 1)) + i10;
    }

    public final Object s(int i10) {
        int iR = r(i10);
        int[] iArr = this.f17334b;
        int i11 = iR * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f17335c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int t(int i10) {
        return u1.a(this.f17334b, r(i10));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f17350t + " end=" + this.f17351u + " size = " + p() + " gap=" + this.f17339g + '-' + (this.f17339g + this.f17340h) + ')';
    }

    public final boolean u(int i10, int i11) {
        int iO;
        int iT;
        if (i11 == this.f17352v) {
            iO = this.f17351u;
        } else {
            l0 l0Var = this.f17346p;
            if (i11 > l0Var.a(0)) {
                iT = t(i11);
            } else {
                int[] iArr = l0Var.f17213a;
                int iMin = Math.min(iArr.length, l0Var.f17214b);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iT = t(i11);
                } else {
                    iO = (o() - this.f17340h) - this.f17347q.f17213a[i12];
                }
            }
            iO = iT + i11;
        }
        return i10 > i11 && i10 < iO;
    }

    public final void v(int i10) {
        if (i10 > 0) {
            int i11 = this.f17350t;
            z(i11);
            int i12 = this.f17339g;
            int i13 = this.f17340h;
            int[] iArr = this.f17334b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                mq.l.b0(0, 0, i12 * 5, iArr, iArr2);
                mq.l.b0((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f17334b = iArr2;
                i13 = i15;
            }
            int i16 = this.f17351u;
            if (i16 >= i12) {
                this.f17351u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f17339g = i17;
            this.f17340h = i13 - i10;
            int i18 = i(i14 > 0 ? f(i11 + i10) : 0, this.f17343m >= i12 ? this.k : 0, this.f17342l, this.f17335c.length);
            for (int i19 = i12; i19 < i17; i19++) {
                this.f17334b[(i19 * 5) + 4] = i18;
            }
            int i20 = this.f17343m;
            if (i20 >= i12) {
                this.f17343m = i20 + i10;
            }
        }
    }

    public final void w(int i10, int i11) {
        if (i10 > 0) {
            A(this.f17341i, i11);
            int i12 = this.k;
            int i13 = this.f17342l;
            if (i13 < i10) {
                Object[] objArr = this.f17335c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f17335c = objArr2;
                i13 = i16;
            }
            int i18 = this.j;
            if (i18 >= i12) {
                this.j = i18 + i10;
            }
            this.k = i12 + i10;
            this.f17342l = i13 - i10;
        }
    }

    public final boolean x(int i10) {
        return (this.f17334b[(r(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(s1 s1Var, int i10) {
        if (this.f17344n <= 0) {
            q.c("Check failed");
        }
        if (i10 == 0 && this.f17350t == 0 && this.f17333a.f17311d == 0) {
            int[] iArr = s1Var.f17310a;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = s1Var.f17311d;
            if (i11 == i12) {
                int[] iArr2 = this.f17334b;
                Object[] objArr = this.f17335c;
                ArrayList arrayList = this.f17336d;
                HashMap map = this.f17337e;
                u.t tVar = this.f17338f;
                Object[] objArr2 = s1Var.f17312g;
                int i13 = s1Var.f17313r;
                HashMap map2 = s1Var.F;
                u.t tVar2 = s1Var.G;
                this.f17334b = iArr;
                this.f17335c = objArr2;
                this.f17336d = s1Var.E;
                this.f17339g = i12;
                this.f17340h = (iArr.length / 5) - i12;
                this.k = i13;
                this.f17342l = objArr2.length - i13;
                this.f17343m = i12;
                this.f17337e = map2;
                this.f17338f = tVar2;
                s1Var.f17310a = iArr2;
                s1Var.f17311d = 0;
                s1Var.f17312g = objArr;
                s1Var.f17313r = 0;
                s1Var.E = arrayList;
                s1Var.F = map;
                s1Var.G = tVar;
                return;
            }
        }
        v1 v1VarD = s1Var.d();
        try {
            w.i(v1VarD, i10, this, true, true, false);
            v1VarD.e(true);
        } catch (Throwable th2) {
            v1VarD.e(false);
            throw th2;
        }
    }

    public final void z(int i10) {
        a aVar;
        int i11;
        a aVar2;
        int i12;
        int i13;
        int i14 = this.f17340h;
        int i15 = this.f17339g;
        if (i15 != i10) {
            if (!this.f17336d.isEmpty()) {
                int iO = o() - this.f17340h;
                if (i15 < i10) {
                    for (int iB = u1.b(this.f17336d, i15, iO); iB < this.f17336d.size() && (i12 = (aVar2 = (a) this.f17336d.get(iB)).f17127a) < 0 && (i13 = i12 + iO) < i10; iB++) {
                        aVar2.f17127a = i13;
                    }
                } else {
                    for (int iB2 = u1.b(this.f17336d, i10, iO); iB2 < this.f17336d.size() && (i11 = (aVar = (a) this.f17336d.get(iB2)).f17127a) >= 0; iB2++) {
                        aVar.f17127a = -(iO - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f17334b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    mq.l.b0(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    mq.l.b0(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iO2 = o();
            if (i15 >= iO2) {
                q.c("Check failed");
            }
            while (i15 < iO2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f17334b[i19];
                int iP = i20 > -2 ? i20 : (p() + i20) - (-2);
                if (iP >= i10) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i20) {
                    this.f17334b[i19] = iP;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f17339g = i10;
    }
}
