package u0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.ads.lb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f34779a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f34780b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f34781c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f34782d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f34783e;

    /* renamed from: f, reason: collision with root package name */
    public x.u f34784f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f34785h;

    /* renamed from: i, reason: collision with root package name */
    public int f34786i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f34787k;

    /* renamed from: l, reason: collision with root package name */
    public int f34788l;

    /* renamed from: m, reason: collision with root package name */
    public int f34789m;

    /* renamed from: n, reason: collision with root package name */
    public int f34790n;

    /* renamed from: o, reason: collision with root package name */
    public int f34791o;

    /* renamed from: p, reason: collision with root package name */
    public final lb f34792p;

    /* renamed from: q, reason: collision with root package name */
    public final lb f34793q;

    /* renamed from: r, reason: collision with root package name */
    public final lb f34794r;

    /* renamed from: s, reason: collision with root package name */
    public x.u f34795s;

    /* renamed from: t, reason: collision with root package name */
    public int f34796t;

    /* renamed from: u, reason: collision with root package name */
    public int f34797u;

    /* renamed from: v, reason: collision with root package name */
    public int f34798v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34799w;

    /* renamed from: x, reason: collision with root package name */
    public x.t f34800x;

    public e2(b2 b2Var) {
        this.f34779a = b2Var;
        int[] iArr = b2Var.f34743a;
        this.f34780b = iArr;
        Object[] objArr = b2Var.f34745c;
        this.f34781c = objArr;
        this.f34782d = b2Var.f34750i;
        this.f34783e = b2Var.j;
        this.f34784f = b2Var.f34751k;
        int i4 = b2Var.f34744b;
        this.g = i4;
        this.f34785h = (iArr.length / 5) - i4;
        int i10 = b2Var.f34746d;
        this.f34787k = i10;
        this.f34788l = objArr.length - i10;
        this.f34789m = i4;
        this.f34792p = new lb();
        this.f34793q = new lb();
        this.f34794r = new lb();
        this.f34797u = i4;
        this.f34798v = -1;
    }

    public static int i(int i4, int i10, int i11, int i12) {
        return i4 > i10 ? -(((i12 - i11) - i4) + 1) : i4;
    }

    public static void z(e2 e2Var) {
        int i4 = e2Var.f34798v;
        int iR = e2Var.r(i4);
        int[] iArr = e2Var.f34780b;
        int i10 = (iR * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) != 0) {
            return;
        }
        int i12 = (i11 & (-134217729)) | 134217728;
        iArr[i10] = i12;
        if ((67108864 & i12) != 0) {
            return;
        }
        e2Var.T(e2Var.E(i4, iArr));
    }

    public final void A(b2 b2Var, int i4) {
        if (this.f34790n <= 0) {
            r.a("Check failed");
        }
        if (i4 == 0 && this.f34796t == 0 && this.f34779a.f34744b == 0) {
            int[] iArr = b2Var.f34743a;
            int i10 = iArr[(i4 * 5) + 3];
            int i11 = b2Var.f34744b;
            if (i10 == i11) {
                int[] iArr2 = this.f34780b;
                Object[] objArr = this.f34781c;
                ArrayList arrayList = this.f34782d;
                HashMap map = this.f34783e;
                x.u uVar = this.f34784f;
                Object[] objArr2 = b2Var.f34745c;
                int i12 = b2Var.f34746d;
                HashMap map2 = b2Var.j;
                x.u uVar2 = b2Var.f34751k;
                this.f34780b = iArr;
                this.f34781c = objArr2;
                this.f34782d = b2Var.f34750i;
                this.g = i11;
                this.f34785h = (iArr.length / 5) - i11;
                this.f34787k = i12;
                this.f34788l = objArr2.length - i12;
                this.f34789m = i11;
                this.f34783e = map2;
                this.f34784f = uVar2;
                b2Var.f34743a = iArr2;
                b2Var.f34744b = 0;
                b2Var.f34745c = objArr;
                b2Var.f34746d = 0;
                b2Var.f34750i = arrayList;
                b2Var.j = map;
                b2Var.f34751k = uVar;
                return;
            }
        }
        e2 e2VarF = b2Var.f();
        try {
            q.q(e2VarF, i4, this, true, true, false);
            e2VarF.e(true);
        } catch (Throwable th2) {
            e2VarF.e(false);
            throw th2;
        }
    }

    public final void B(int i4) {
        a aVar;
        int i10;
        a aVar2;
        int i11;
        int i12;
        int i13 = this.f34785h;
        int i14 = this.g;
        if (i14 != i4) {
            if (!this.f34782d.isEmpty()) {
                int iO = o() - this.f34785h;
                if (i14 < i4) {
                    for (int iB = d2.b(this.f34782d, i14, iO); iB < this.f34782d.size() && (i11 = (aVar2 = (a) this.f34782d.get(iB)).f34724a) < 0 && (i12 = i11 + iO) < i4; iB++) {
                        aVar2.f34724a = i12;
                    }
                } else {
                    for (int iB2 = d2.b(this.f34782d, i4, iO); iB2 < this.f34782d.size() && (i10 = (aVar = (a) this.f34782d.get(iB2)).f34724a) >= 0; iB2++) {
                        aVar.f34724a = -(iO - i10);
                    }
                }
            }
            if (i13 > 0) {
                int[] iArr = this.f34780b;
                int i15 = i4 * 5;
                int i16 = i13 * 5;
                int i17 = i14 * 5;
                if (i4 < i14) {
                    zj.m.M(i16 + i15, i15, i17, iArr, iArr);
                } else {
                    zj.m.M(i17, i17 + i16, i15 + i16, iArr, iArr);
                }
            }
            if (i4 < i14) {
                i14 = i4 + i13;
            }
            int iO2 = o();
            if (i14 >= iO2) {
                r.a("Check failed");
            }
            while (i14 < iO2) {
                int i18 = (i14 * 5) + 2;
                int i19 = this.f34780b[i18];
                int iP = i19 > -2 ? i19 : (p() + i19) - (-2);
                if (iP >= i4) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i19) {
                    this.f34780b[i18] = iP;
                }
                i14++;
                if (i14 == i4) {
                    i14 += i13;
                }
            }
        }
        this.g = i4;
    }

    public final void C(int i4, int i10) {
        int i11 = this.f34788l;
        int i12 = this.f34787k;
        int i13 = this.f34789m;
        if (i12 != i4) {
            Object[] objArr = this.f34781c;
            if (i4 < i12) {
                System.arraycopy(objArr, i4, objArr, i4 + i11, i12 - i4);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i4 + i11) - i14);
            }
        }
        int iMin = Math.min(i10 + 1, p());
        if (i13 != iMin) {
            int length = this.f34781c.length - i11;
            if (iMin < i13) {
                int iR = r(iMin);
                int iR2 = r(i13);
                int i15 = this.g;
                while (iR < iR2) {
                    int i16 = (iR * 5) + 4;
                    int i17 = this.f34780b[i16];
                    if (!(i17 >= 0)) {
                        r.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f34780b[i16] = -((length - i17) + 1);
                    iR++;
                    if (iR == i15) {
                        iR += this.f34785h;
                    }
                }
            } else {
                int iR3 = r(i13);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i18 = (iR3 * 5) + 4;
                    int i19 = this.f34780b[i18];
                    if (!(i19 < 0)) {
                        r.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f34780b[i18] = i19 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.f34785h;
                    }
                }
            }
            this.f34789m = iMin;
        }
        this.f34787k = i4;
    }

    public final Object D(int i4) {
        int iR = r(i4);
        int[] iArr = this.f34780b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f34781c[h(g(iR, iArr))];
        }
        return null;
    }

    public final int E(int i4, int[] iArr) {
        int i10 = iArr[(r(i4) * 5) + 2];
        return i10 > -2 ? i10 : (p() + i10) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f34790n > 0) {
            x(1, this.f34798v);
        }
        Object[] objArr = this.f34781c;
        int i4 = this.f34786i;
        this.f34786i = i4 + 1;
        Object obj2 = objArr[h(i4)];
        if (this.f34786i > this.j) {
            r.a("Writing to an invalid slot");
        }
        this.f34781c[h(this.f34786i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i4;
        x.t tVar = this.f34800x;
        if (tVar != null) {
            while (tVar.f36945b != 0) {
                int iY = q.y(tVar);
                int iR = r(iY);
                int iU = iY + 1;
                int iU2 = u(iY) + iY;
                while (true) {
                    if (iU >= iU2) {
                        i4 = 0;
                        break;
                    } else {
                        if ((this.f34780b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i4 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f34780b;
                int i10 = (iR * 5) + 1;
                int i11 = iArr[i10];
                if (((67108864 & i11) != 0 ? 1 : 0) != i4) {
                    iArr[i10] = (i4 << 26) | ((-67108865) & i11);
                    int iE = E(iY, iArr);
                    if (iE >= 0) {
                        q.g(tVar, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (!(this.f34790n == 0)) {
            r.a("Cannot remove group while inserting");
        }
        int i4 = this.f34796t;
        int i10 = this.f34786i;
        int iG = g(r(i4), this.f34780b);
        int iL = L();
        O(this.f34798v);
        x.t tVar = this.f34800x;
        if (tVar != null) {
            while (true) {
                int i11 = tVar.f36945b;
                if (i11 == 0) {
                    break;
                }
                if (i11 == 0) {
                    y.a.e("IntList is empty.");
                    throw null;
                }
                if (tVar.f36944a[0] < i4) {
                    break;
                }
                q.y(tVar);
            }
        }
        boolean zI = I(i4, this.f34796t - i4);
        J(iG, this.f34786i - iG, i4 - 1);
        this.f34796t = i4;
        this.f34786i = i10;
        this.f34791o -= iL;
        return zI;
    }

    public final boolean I(int i4, int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f34782d;
            B(i4);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f34783e;
                int i11 = i4 + i10;
                int iB = d2.b(this.f34782d, i11, o() - this.f34785h);
                if (iB >= this.f34782d.size()) {
                    iB--;
                }
                int i12 = iB + 1;
                int i13 = 0;
                while (iB >= 0) {
                    a aVar = (a) this.f34782d.get(iB);
                    int iC = c(aVar);
                    if (iC < i4) {
                        break;
                    }
                    if (iC < i11) {
                        aVar.f34724a = LinearLayoutManager.INVALID_OFFSET;
                        if (map != null) {
                        }
                        if (i13 == 0) {
                            i13 = iB + 1;
                        }
                        i12 = iB;
                    }
                    iB--;
                }
                z = i12 < i13;
                if (z) {
                    this.f34782d.subList(i12, i13).clear();
                }
            }
            this.g = i4;
            this.f34785h += i10;
            int i14 = this.f34789m;
            if (i14 > i4) {
                this.f34789m = Math.max(i4, i14 - i10);
            }
            int i15 = this.f34797u;
            if (i15 >= this.g) {
                this.f34797u = i15 - i10;
            }
            int i16 = this.f34798v;
            if (i16 >= 0 && (this.f34780b[(r(i16) * 5) + 1] & 67108864) != 0) {
                T(i16);
            }
        }
        return z;
    }

    public final void J(int i4, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f34788l;
            int i13 = i4 + i10;
            C(i13, i11);
            this.f34787k = i4;
            this.f34788l = i12 + i10;
            zj.m.U(i4, i13, null, this.f34781c);
            int i14 = this.j;
            if (i14 >= i4) {
                this.j = i14 - i10;
            }
        }
    }

    public final Object K(int i4, int i10, Object obj) {
        int iN = N(r(i4), this.f34780b);
        int iG = g(r(i4 + 1), this.f34780b);
        int i11 = iN + i10;
        if (i11 < iN || i11 >= iG) {
            r.a("Write to an invalid slot index " + i10 + " for group " + i4);
        }
        int iH = h(i11);
        Object[] objArr = this.f34781c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int L() {
        int iR = r(this.f34796t);
        int iA = d2.a(iR, this.f34780b) + this.f34796t;
        this.f34796t = iA;
        this.f34786i = g(r(iA), this.f34780b);
        int i4 = this.f34780b[(iR * 5) + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void M() {
        int i4 = this.f34797u;
        this.f34796t = i4;
        this.f34786i = g(r(i4), this.f34780b);
    }

    public final int N(int i4, int[] iArr) {
        if (i4 >= o()) {
            return this.f34781c.length - this.f34788l;
        }
        int iC = d2.c(i4, iArr);
        return iC < 0 ? (this.f34781c.length - this.f34788l) + iC + 1 : iC;
    }

    public final l0 O(int i4) {
        a aVarR;
        HashMap map = this.f34783e;
        if (map == null || (aVarR = R(i4)) == null) {
            return null;
        }
        return (l0) map.get(aVarR);
    }

    public final void P() {
        if (this.f34790n != 0) {
            r.a("Key must be supplied when inserting");
        }
        e eVar = l.f34851a;
        Q(eVar, false, eVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Object obj, boolean z3, Object obj2, int i4) {
        int i10;
        int i11 = this.f34798v;
        byte b10 = this.f34790n > 0;
        this.f34794r.c(this.f34791o);
        e eVar = l.f34851a;
        if (b10 == true) {
            int i12 = this.f34796t;
            int iG = g(r(i12), this.f34780b);
            w(1);
            this.f34786i = iG;
            this.j = iG;
            int iR = r(i12);
            int i13 = obj != eVar ? 1 : 0;
            int i14 = (z3 || obj2 == eVar) ? 0 : 1;
            int i15 = i(iG, this.f34787k, this.f34788l, this.f34781c.length);
            if (i15 >= 0 && this.f34789m < i12) {
                i15 = -(((this.f34781c.length - this.f34788l) - i15) + 1);
            }
            int[] iArr = this.f34780b;
            int i16 = this.f34798v;
            int i17 = iR * 5;
            iArr[i17] = i4;
            iArr[i17 + 1] = ((z3 ? 1 : 0) << 30) | (i13 << 29) | (i14 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = i15;
            int i18 = (z3 ? 1 : 0) + i13 + i14;
            if (i18 > 0) {
                x(i18, i12);
                Object[] objArr = this.f34781c;
                int i19 = this.f34786i;
                if (z3) {
                    objArr[i19] = obj2;
                    i19++;
                }
                if (i13 != 0) {
                    objArr[i19] = obj;
                    i19++;
                }
                if (i14 != 0) {
                    objArr[i19] = obj2;
                    i19++;
                }
                this.f34786i = i19;
            }
            this.f34791o = 0;
            i10 = i12 + 1;
            this.f34798v = i12;
            this.f34796t = i10;
            if (i11 >= 0) {
                O(i11);
            }
        } else {
            this.f34792p.c(i11);
            this.f34793q.c((o() - this.f34785h) - this.f34797u);
            int i20 = this.f34796t;
            int iR2 = r(i20);
            if (!nk.k.a(obj2, eVar)) {
                if (z3) {
                    U(this.f34796t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f34786i = N(iR2, this.f34780b);
            this.j = g(r(this.f34796t + 1), this.f34780b);
            int[] iArr2 = this.f34780b;
            int i21 = iR2 * 5;
            this.f34791o = iArr2[i21 + 1] & 67108863;
            this.f34798v = i20;
            this.f34796t = i20 + 1;
            i10 = i20 + iArr2[i21 + 3];
        }
        this.f34797u = i10;
    }

    public final a R(int i4) {
        ArrayList arrayList;
        int iE;
        if (i4 < 0 || i4 >= p() || (iE = d2.e((arrayList = this.f34782d), i4, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(iE);
    }

    public final void S(Object obj) {
        int iR = r(this.f34796t);
        int i4 = (iR * 5) + 1;
        if ((this.f34780b[i4] & 268435456) == 0) {
            r.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f34781c;
        int[] iArr = this.f34780b;
        objArr[h(Integer.bitCount(iArr[i4] >> 29) + g(iR, iArr))] = obj;
    }

    public final void T(int i4) {
        if (i4 >= 0) {
            x.t tVar = this.f34800x;
            if (tVar == null) {
                tVar = new x.t();
                this.f34800x = tVar;
            }
            q.g(tVar, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.f34780b
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
            u0.r.a(r5)
        L2e:
            java.lang.Object[] r5 = r4.f34781c
            int[] r1 = r4.f34780b
            int r0 = r4.g(r0, r1)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.e2.U(int, java.lang.Object):void");
    }

    public final void a(int i4) {
        boolean z3 = false;
        if (!(i4 >= 0)) {
            r.a("Cannot seek backwards");
        }
        if (!(this.f34790n <= 0)) {
            j1.b("Cannot call seek() while inserting");
        }
        if (i4 == 0) {
            return;
        }
        int i10 = this.f34796t + i4;
        if (i10 >= this.f34798v && i10 <= this.f34797u) {
            z3 = true;
        }
        if (!z3) {
            r.a("Cannot seek outside the current group (" + this.f34798v + '-' + this.f34797u + ')');
        }
        this.f34796t = i10;
        int iG = g(r(i10), this.f34780b);
        this.f34786i = iG;
        this.j = iG;
    }

    public final a b(int i4) {
        ArrayList arrayList = this.f34782d;
        int iE = d2.e(arrayList, i4, p());
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        if (i4 > this.g) {
            i4 = -(p() - i4);
        }
        a aVar = new a(i4);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i4 = aVar.f34724a;
        return i4 < 0 ? p() + i4 : i4;
    }

    public final void d() {
        int i4 = this.f34790n;
        this.f34790n = i4 + 1;
        if (i4 == 0) {
            this.f34793q.c((o() - this.f34785h) - this.f34797u);
        }
    }

    public final void e(boolean z3) {
        this.f34799w = true;
        if (z3 && this.f34792p.f13441b == 0) {
            B(p());
            C(this.f34781c.length - this.f34788l, this.g);
            int i4 = this.f34787k;
            Arrays.fill(this.f34781c, i4, this.f34788l + i4, (Object) null);
            G();
        }
        int[] iArr = this.f34780b;
        int i10 = this.g;
        Object[] objArr = this.f34781c;
        int i11 = this.f34787k;
        ArrayList arrayList = this.f34782d;
        HashMap map = this.f34783e;
        x.u uVar = this.f34784f;
        b2 b2Var = this.f34779a;
        if (!b2Var.g) {
            j1.a("Unexpected writer close()");
        }
        b2Var.g = false;
        b2Var.f34743a = iArr;
        b2Var.f34744b = i10;
        b2Var.f34745c = objArr;
        b2Var.f34746d = i11;
        b2Var.f34750i = arrayList;
        b2Var.j = map;
        b2Var.f34751k = uVar;
    }

    public final int f(int i4) {
        return g(r(i4), this.f34780b);
    }

    public final int g(int i4, int[] iArr) {
        if (i4 >= o()) {
            return this.f34781c.length - this.f34788l;
        }
        int i10 = iArr[(i4 * 5) + 4];
        return i10 < 0 ? (this.f34781c.length - this.f34788l) + i10 + 1 : i10;
    }

    public final int h(int i4) {
        return (this.f34788l * (i4 < this.f34787k ? 0 : 1)) + i4;
    }

    public final void j() {
        x.a0 a0Var;
        boolean z3 = this.f34790n > 0;
        int i4 = this.f34796t;
        int i10 = this.f34797u;
        int i11 = this.f34798v;
        int iR = r(i11);
        int i12 = this.f34791o;
        int i13 = i4 - i11;
        int i14 = iR * 5;
        int i15 = i14 + 1;
        boolean z10 = (this.f34780b[i15] & 1073741824) != 0;
        lb lbVar = this.f34794r;
        if (z3) {
            x.u uVar = this.f34795s;
            if (uVar != null && (a0Var = (x.a0) uVar.b(i11)) != null) {
                Object[] objArr = a0Var.f36846a;
                int i16 = a0Var.f36847b;
                for (int i17 = 0; i17 < i16; i17++) {
                    F(objArr[i17]);
                }
            }
            int[] iArr = this.f34780b;
            iArr[i14 + 3] = i13;
            d2.d(iArr, iR, i12);
            int iB = lbVar.b();
            if (z10) {
                i12 = 1;
            }
            this.f34791o = iB + i12;
            int iE = E(i11, this.f34780b);
            this.f34798v = iE;
            int iP = iE < 0 ? p() : r(iE + 1);
            int iG = iP >= 0 ? g(iP, this.f34780b) : 0;
            this.f34786i = iG;
            this.j = iG;
            return;
        }
        if (i4 != i10) {
            r.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f34780b;
        int i18 = i14 + 3;
        int i19 = iArr2[i18];
        int i20 = iArr2[i15] & 67108863;
        iArr2[i18] = i13;
        d2.d(iArr2, iR, i12);
        int iB2 = this.f34792p.b();
        this.f34797u = (o() - this.f34785h) - this.f34793q.b();
        this.f34798v = iB2;
        int iE2 = E(i11, this.f34780b);
        int iB3 = lbVar.b();
        this.f34791o = iB3;
        if (iE2 == iB2) {
            this.f34791o = iB3 + (z10 ? 0 : i12 - i20);
            return;
        }
        int i21 = i13 - i19;
        int i22 = z10 ? 0 : i12 - i20;
        if (i21 != 0 || i22 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i22 != 0 || i21 != 0)) {
                int iR2 = r(iE2);
                if (i21 != 0) {
                    int[] iArr3 = this.f34780b;
                    int i23 = (iR2 * 5) + 3;
                    iArr3[i23] = iArr3[i23] + i21;
                }
                if (i22 != 0) {
                    int[] iArr4 = this.f34780b;
                    d2.d(iArr4, iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i22);
                }
                int[] iArr5 = this.f34780b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i22 = 0;
                }
                iE2 = E(iE2, iArr5);
            }
        }
        this.f34791o += i22;
    }

    public final void k() {
        if (this.f34790n <= 0) {
            j1.b("Unbalanced begin/end insert");
        }
        int i4 = this.f34790n - 1;
        this.f34790n = i4;
        if (i4 == 0) {
            if (this.f34794r.f13441b != this.f34792p.f13441b) {
                r.a("startGroup/endGroup mismatch while inserting");
            }
            this.f34797u = (o() - this.f34785h) - this.f34793q.b();
        }
    }

    public final void l(int i4) {
        boolean z3 = false;
        if (!(this.f34790n <= 0)) {
            r.a("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f34798v;
        if (i10 != i4) {
            if (i4 >= i10 && i4 < this.f34797u) {
                z3 = true;
            }
            if (!z3) {
                r.a("Started group at " + i4 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f34796t;
            int i12 = this.f34786i;
            int i13 = this.j;
            this.f34796t = i4;
            P();
            this.f34796t = i11;
            this.f34786i = i12;
            this.j = i13;
        }
    }

    public final void m(int i4, int i10, int i11) {
        if (i4 >= this.g) {
            i4 = -((p() - i4) + 2);
        }
        while (i11 < i10) {
            this.f34780b[(r(i11) * 5) + 2] = i4;
            int i12 = this.f34780b[(r(i11) * 5) + 3] + i11;
            m(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        y.a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r21, mk.e r22) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.e2.n(int, mk.e):void");
    }

    public final int o() {
        return this.f34780b.length / 5;
    }

    public final int p() {
        return o() - this.f34785h;
    }

    public final Object q(int i4) {
        int iR = r(i4);
        int[] iArr = this.f34780b;
        int i10 = (iR * 5) + 1;
        if ((iArr[i10] & 268435456) == 0) {
            return l.f34851a;
        }
        return this.f34781c[Integer.bitCount(iArr[i10] >> 29) + g(iR, iArr)];
    }

    public final int r(int i4) {
        return (this.f34785h * (i4 < this.g ? 0 : 1)) + i4;
    }

    public final int s(int i4) {
        return this.f34780b[r(i4) * 5];
    }

    public final Object t(int i4) {
        int iR = r(i4);
        int[] iArr = this.f34780b;
        int i10 = iR * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f34781c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f34796t + " end=" + this.f34797u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.f34785h) + ')';
    }

    public final int u(int i4) {
        return d2.a(r(i4), this.f34780b);
    }

    public final boolean v(int i4, int i10) {
        int iO;
        int iU;
        if (i10 == this.f34798v) {
            iO = this.f34797u;
        } else {
            lb lbVar = this.f34792p;
            if (i10 > lbVar.a(0)) {
                iU = u(i10);
            } else {
                int[] iArr = lbVar.f13440a;
                int iMin = Math.min(iArr.length, lbVar.f13441b);
                int i11 = 0;
                while (true) {
                    if (i11 >= iMin) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == i10) {
                        break;
                    }
                    i11++;
                }
                if (i11 < 0) {
                    iU = u(i10);
                } else {
                    iO = (o() - this.f34785h) - this.f34793q.f13440a[i11];
                }
            }
            iO = iU + i10;
        }
        return i4 > i10 && i4 < iO;
    }

    public final void w(int i4) {
        if (i4 > 0) {
            int i10 = this.f34796t;
            B(i10);
            int i11 = this.g;
            int i12 = this.f34785h;
            int[] iArr = this.f34780b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i4) {
                int iMax = Math.max(Math.max(length * 2, i13 + i4), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                zj.m.M(0, 0, i11 * 5, iArr, iArr2);
                zj.m.M((i11 + i14) * 5, (i12 + i11) * 5, length * 5, iArr, iArr2);
                this.f34780b = iArr2;
                i12 = i14;
            }
            int i15 = this.f34797u;
            if (i15 >= i11) {
                this.f34797u = i15 + i4;
            }
            int i16 = i11 + i4;
            this.g = i16;
            this.f34785h = i12 - i4;
            int i17 = i(i13 > 0 ? f(i10 + i4) : 0, this.f34789m >= i11 ? this.f34787k : 0, this.f34788l, this.f34781c.length);
            for (int i18 = i11; i18 < i16; i18++) {
                this.f34780b[(i18 * 5) + 4] = i17;
            }
            int i19 = this.f34789m;
            if (i19 >= i11) {
                this.f34789m = i19 + i4;
            }
        }
    }

    public final void x(int i4, int i10) {
        if (i4 > 0) {
            C(this.f34786i, i10);
            int i11 = this.f34787k;
            int i12 = this.f34788l;
            if (i12 < i4) {
                Object[] objArr = this.f34781c;
                int length = objArr.length;
                int i13 = length - i12;
                int iMax = Math.max(Math.max(length * 2, i13 + i4), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i14 = 0; i14 < iMax; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = iMax - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f34781c = objArr2;
                i12 = i15;
            }
            int i17 = this.j;
            if (i17 >= i11) {
                this.j = i17 + i4;
            }
            this.f34787k = i11 + i4;
            this.f34788l = i12 - i4;
        }
    }

    public final boolean y(int i4) {
        return (this.f34780b[(r(i4) * 5) + 1] & 1073741824) != 0;
    }
}
