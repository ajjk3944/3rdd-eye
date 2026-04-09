package s0;

import java.util.Arrays;
import n0.g1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f21840e = new k(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f21841a;

    /* renamed from: b, reason: collision with root package name */
    public int f21842b;

    /* renamed from: c, reason: collision with root package name */
    public final u0.b f21843c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f21844d;

    public k(int i10, int i11, Object[] objArr, u0.b bVar) {
        this.f21841a = i10;
        this.f21842b = i11;
        this.f21843c = bVar;
        this.f21844d = objArr;
    }

    public static k j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, u0.b bVar) {
        if (i12 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iH = se.b.H(i10, i12);
        int iH2 = se.b.H(i11, i12);
        if (iH != iH2) {
            return new k((1 << iH) | (1 << iH2), 0, iH < iH2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new k(0, 1 << iH, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, u0.b bVar) {
        Object obj3 = this.f21844d[i10];
        k kVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f21844d;
        Object[] objArr2 = new Object[objArr.length - 1];
        mq.l.f0(0, i10, 6, objArr, objArr2);
        mq.l.c0(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iT - 1] = kVarJ;
        mq.l.c0(iT, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f21842b == 0) {
            return this.f21844d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f21841a);
        int length = this.f21844d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        hr.b bVarR = vc.e.R(vc.e.T(0, this.f21844d.length), 2);
        int i10 = bVarR.f10863a;
        int i11 = bVarR.f10864d;
        int i12 = bVarR.f10865g;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!br.l.a(obj, this.f21844d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int iH = 1 << se.b.H(i10, i11);
        if (h(iH)) {
            return br.l.a(obj, this.f21844d[f(iH)]);
        }
        if (!i(iH)) {
            return false;
        }
        k kVarS = s(t(iH));
        return i11 == 30 ? kVarS.c(obj) : kVarS.d(i10, i11 + 5, obj);
    }

    public final boolean e(k kVar) {
        if (this == kVar) {
            return true;
        }
        if (this.f21842b == kVar.f21842b && this.f21841a == kVar.f21841a) {
            int length = this.f21844d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f21844d[i10] == kVar.f21844d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f21841a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int iH = 1 << se.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (br.l.a(obj, this.f21844d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iH)) {
            return null;
        }
        k kVarS = s(t(iH));
        if (i11 != 30) {
            return kVarS.g(i10, i11 + 5, obj);
        }
        hr.b bVarR = vc.e.R(vc.e.T(0, kVarS.f21844d.length), 2);
        int i12 = bVarR.f10863a;
        int i13 = bVarR.f10864d;
        int i14 = bVarR.f10865g;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!br.l.a(obj, kVarS.f21844d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return kVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f21841a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f21842b) != 0;
    }

    public final k k(int i10, v0.g gVar) {
        gVar.i(gVar.f23746x - 1);
        gVar.f23744g = x(i10);
        Object[] objArr = this.f21844d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f21843c != gVar.f23742a) {
            return new k(0, 0, se.b.f(i10, objArr), gVar.f23742a);
        }
        this.f21844d = se.b.f(i10, objArr);
        return this;
    }

    public final k l(int i10, Object obj, Object obj2, int i11, v0.g gVar) {
        v0.g gVar2;
        k kVarL;
        int iH = 1 << se.b.H(i10, i11);
        boolean zH = h(iH);
        u0.b bVar = this.f21843c;
        if (zH) {
            int iF = f(iH);
            if (!br.l.a(obj, this.f21844d[iF])) {
                gVar.i(gVar.f23746x + 1);
                u0.b bVar2 = gVar.f23742a;
                if (bVar != bVar2) {
                    return new k(this.f21841a ^ iH, this.f21842b | iH, a(iF, iH, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f21844d = a(iF, iH, i10, obj, obj2, i11, bVar2);
                this.f21841a ^= iH;
                this.f21842b |= iH;
                return this;
            }
            gVar.f23744g = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == gVar.f23742a) {
                this.f21844d[iF + 1] = obj2;
                return this;
            }
            gVar.f23745r++;
            Object[] objArr = this.f21844d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            br.l.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new k(this.f21841a, this.f21842b, objArrCopyOf, gVar.f23742a);
        }
        if (!i(iH)) {
            gVar.i(gVar.f23746x + 1);
            u0.b bVar3 = gVar.f23742a;
            int iF2 = f(iH);
            if (bVar != bVar3) {
                return new k(this.f21841a | iH, this.f21842b, se.b.d(this.f21844d, iF2, obj, obj2), bVar3);
            }
            this.f21844d = se.b.d(this.f21844d, iF2, obj, obj2);
            this.f21841a |= iH;
            return this;
        }
        int iT = t(iH);
        k kVarS = s(iT);
        if (i11 == 30) {
            hr.b bVarR = vc.e.R(vc.e.T(0, kVarS.f21844d.length), 2);
            int i12 = bVarR.f10863a;
            int i13 = bVarR.f10864d;
            int i14 = bVarR.f10865g;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                gVar.i(gVar.f23746x + 1);
                kVarL = new k(0, 0, se.b.d(kVarS.f21844d, 0, obj, obj2), gVar.f23742a);
                gVar2 = gVar;
            } else {
                while (!br.l.a(obj, kVarS.f21844d[i12])) {
                    if (i12 == i13) {
                        gVar.i(gVar.f23746x + 1);
                        kVarL = new k(0, 0, se.b.d(kVarS.f21844d, 0, obj, obj2), gVar.f23742a);
                        break;
                    }
                    i12 += i14;
                }
                gVar.f23744g = kVarS.x(i12);
                if (kVarS.f21843c == gVar.f23742a) {
                    kVarS.f21844d[i12 + 1] = obj2;
                    kVarL = kVarS;
                } else {
                    gVar.f23745r++;
                    Object[] objArr2 = kVarS.f21844d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    br.l.d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i12 + 1] = obj2;
                    kVarL = new k(0, 0, objArrCopyOf2, gVar.f23742a);
                }
                gVar2 = gVar;
            }
        } else {
            gVar2 = gVar;
            kVarL = kVarS.l(i10, obj, obj2, i11 + 5, gVar2);
        }
        return kVarS == kVarL ? this : r(iT, kVarL, gVar2.f23742a);
    }

    public final k m(k kVar, int i10, u0.a aVar, v0.g gVar) {
        Object[] objArr;
        k kVarJ;
        if (this == kVar) {
            aVar.f23136a += b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            u0.b bVar = gVar.f23742a;
            int i12 = kVar.f21842b;
            Object[] objArr2 = this.f21844d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + kVar.f21844d.length);
            br.l.d(objArrCopyOf, "copyOf(...)");
            int length = this.f21844d.length;
            hr.b bVarR = vc.e.R(vc.e.T(0, kVar.f21844d.length), 2);
            int i13 = bVarR.f10863a;
            int i14 = bVarR.f10864d;
            int i15 = bVarR.f10865g;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(kVar.f21844d[i13])) {
                        aVar.f23136a++;
                    } else {
                        Object[] objArr3 = kVar.f21844d;
                        objArrCopyOf[length] = objArr3[i13];
                        objArrCopyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f21844d.length) {
                if (length == kVar.f21844d.length) {
                    return kVar;
                }
                if (length == objArrCopyOf.length) {
                    return new k(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                br.l.d(objArrCopyOf2, "copyOf(...)");
                return new k(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i16 = this.f21842b | kVar.f21842b;
            int i17 = this.f21841a;
            int i18 = kVar.f21841a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (br.l.a(this.f21844d[f(iLowestOneBit)], kVar.f21844d[kVar.f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if ((i16 & i21) != 0) {
                g1.b("Check failed.");
            }
            k kVar2 = (br.l.a(this.f21843c, gVar.f23742a) && this.f21841a == i21 && this.f21842b == i16) ? this : new k(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = kVar2.f21844d;
                int length2 = (objArr4.length - 1) - i23;
                if (i(iLowestOneBit2)) {
                    kVarJ = s(t(iLowestOneBit2));
                    if (kVar.i(iLowestOneBit2)) {
                        kVarJ = kVarJ.m(kVar.s(kVar.t(iLowestOneBit2)), i10 + 5, aVar, gVar);
                        objArr = objArr4;
                    } else if (kVar.h(iLowestOneBit2)) {
                        int iF = kVar.f(iLowestOneBit2);
                        Object obj = kVar.f21844d[iF];
                        Object objX = kVar.x(iF);
                        int i24 = gVar.f23746x;
                        objArr = objArr4;
                        kVarJ = kVarJ.l(obj != null ? obj.hashCode() : i11, obj, objX, i10 + 5, gVar);
                        if (gVar.f23746x == i24) {
                            aVar.f23136a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(iLowestOneBit2)) {
                        k kVarS = kVar.s(kVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f21844d[iF2];
                            int i25 = i10 + 5;
                            if (kVarS.d(obj2 != null ? obj2.hashCode() : 0, i25, obj2)) {
                                aVar.f23136a++;
                                kVarJ = kVarS;
                            } else {
                                kVarJ = kVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i25, gVar);
                            }
                        } else {
                            kVarJ = kVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f21844d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = kVar.f(iLowestOneBit2);
                        Object obj4 = kVar.f21844d[iF4];
                        kVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, kVar.x(iF4), i10 + 5, gVar.f23742a);
                    }
                }
                objArr[length2] = kVarJ;
                i23++;
                i22 ^= iLowestOneBit2;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (kVar.h(iLowestOneBit3)) {
                    int iF5 = kVar.f(iLowestOneBit3);
                    Object[] objArr5 = kVar2.f21844d;
                    objArr5[i27] = kVar.f21844d[iF5];
                    objArr5[i27 + 1] = kVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f23136a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = kVar2.f21844d;
                    objArr6[i27] = this.f21844d[iF6];
                    objArr6[i27 + 1] = x(iF6);
                }
                i26++;
                i21 ^= iLowestOneBit3;
            }
            if (!e(kVar2)) {
                return kVar.e(kVar2) ? kVar : kVar2;
            }
        }
        return this;
    }

    public final k n(int i10, Object obj, int i11, v0.g gVar) {
        k kVarN;
        int iH = 1 << se.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (br.l.a(obj, this.f21844d[iF])) {
                return p(iF, iH, gVar);
            }
        } else if (i(iH)) {
            int iT = t(iH);
            k kVarS = s(iT);
            if (i11 == 30) {
                hr.b bVarR = vc.e.R(vc.e.T(0, kVarS.f21844d.length), 2);
                int i12 = bVarR.f10863a;
                int i13 = bVarR.f10864d;
                int i14 = bVarR.f10865g;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    kVarN = kVarS;
                    break;
                }
                while (!br.l.a(obj, kVarS.f21844d[i12])) {
                    if (i12 == i13) {
                        kVarN = kVarS;
                        break;
                    }
                    i12 += i14;
                }
                kVarN = kVarS.k(i12, gVar);
            } else {
                kVarN = kVarS.n(i10, obj, i11 + 5, gVar);
            }
            return q(kVarS, kVarN, iT, iH, gVar.f23742a);
        }
        return this;
    }

    public final k o(int i10, Object obj, Object obj2, int i11, v0.g gVar) {
        k kVar;
        k kVarO;
        int iH = 1 << se.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (br.l.a(obj, this.f21844d[iF]) && br.l.a(obj2, x(iF))) {
                return p(iF, iH, gVar);
            }
        } else if (i(iH)) {
            int iT = t(iH);
            k kVarS = s(iT);
            if (i11 == 30) {
                hr.b bVarR = vc.e.R(vc.e.T(0, kVarS.f21844d.length), 2);
                int i12 = bVarR.f10863a;
                int i13 = bVarR.f10864d;
                int i14 = bVarR.f10865g;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    kVarO = kVarS;
                    kVar = kVarS;
                } else {
                    while (true) {
                        if (!br.l.a(obj, kVarS.f21844d[i12]) || !br.l.a(obj2, kVarS.x(i12))) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            kVarO = kVarS.k(i12, gVar);
                            break;
                        }
                    }
                    kVarO = kVarS;
                    kVar = kVarS;
                }
            } else {
                kVar = kVarS;
                kVarO = kVar.o(i10, obj, obj2, i11 + 5, gVar);
            }
            return q(kVar, kVarO, iT, iH, gVar.f23742a);
        }
        return this;
    }

    public final k p(int i10, int i11, v0.g gVar) {
        gVar.i(gVar.f23746x - 1);
        gVar.f23744g = x(i10);
        Object[] objArr = this.f21844d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f21843c != gVar.f23742a) {
            return new k(i11 ^ this.f21841a, this.f21842b, se.b.f(i10, objArr), gVar.f23742a);
        }
        this.f21844d = se.b.f(i10, objArr);
        this.f21841a ^= i11;
        return this;
    }

    public final k q(k kVar, k kVar2, int i10, int i11, u0.b bVar) {
        u0.b bVar2 = this.f21843c;
        if (kVar2 != null) {
            return (bVar2 == bVar || kVar != kVar2) ? r(i10, kVar2, bVar) : this;
        }
        Object[] objArr = this.f21844d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new k(this.f21841a, i11 ^ this.f21842b, se.b.g(i10, objArr), bVar);
        }
        this.f21844d = se.b.g(i10, objArr);
        this.f21842b ^= i11;
        return this;
    }

    public final k r(int i10, k kVar, u0.b bVar) {
        Object[] objArr = this.f21844d;
        if (objArr.length == 1 && kVar.f21844d.length == 2 && kVar.f21842b == 0) {
            kVar.f21841a = this.f21842b;
            return kVar;
        }
        if (this.f21843c == bVar) {
            objArr[i10] = kVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        br.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = kVar;
        return new k(this.f21841a, this.f21842b, objArrCopyOf, bVar);
    }

    public final k s(int i10) {
        Object obj = this.f21844d[i10];
        br.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (k) obj;
    }

    public final int t(int i10) {
        return (this.f21844d.length - 1) - Integer.bitCount((i10 - 1) & this.f21842b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.f346g = w(r12, r4, (s0.k) r14.f346g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ag.b u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.k.u(int, java.lang.Object, java.lang.Object, int):ag.b");
    }

    public final k v(int i10, int i11, Object obj) {
        k kVarV;
        int iH = 1 << se.b.H(i10, i11);
        if (h(iH)) {
            int iF = f(iH);
            if (br.l.a(obj, this.f21844d[iF])) {
                Object[] objArr = this.f21844d;
                if (objArr.length != 2) {
                    return new k(this.f21841a ^ iH, this.f21842b, se.b.f(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iH)) {
            int iT = t(iH);
            k kVarS = s(iT);
            if (i11 == 30) {
                hr.b bVarR = vc.e.R(vc.e.T(0, kVarS.f21844d.length), 2);
                int i12 = bVarR.f10863a;
                int i13 = bVarR.f10864d;
                int i14 = bVarR.f10865g;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!br.l.a(obj, kVarS.f21844d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = kVarS.f21844d;
                    kVarV = objArr2.length == 2 ? null : new k(0, 0, se.b.f(i12, objArr2), null);
                }
                kVarV = kVarS;
                break;
            }
            kVarV = kVarS.v(i10, i11 + 5, obj);
            if (kVarV == null) {
                Object[] objArr3 = this.f21844d;
                if (objArr3.length != 1) {
                    return new k(this.f21841a, iH ^ this.f21842b, se.b.g(iT, objArr3), null);
                }
                return null;
            }
            if (kVarS != kVarV) {
                return w(iT, iH, kVarV);
            }
        }
        return this;
    }

    public final k w(int i10, int i11, k kVar) {
        Object[] objArr = kVar.f21844d;
        if (objArr.length != 2 || kVar.f21842b != 0) {
            Object[] objArr2 = this.f21844d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            br.l.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = kVar;
            return new k(this.f21841a, this.f21842b, objArrCopyOf, null);
        }
        if (this.f21844d.length == 1) {
            kVar.f21841a = this.f21842b;
            return kVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f21844d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        br.l.d(objArrCopyOf2, "copyOf(...)");
        mq.l.c0(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        mq.l.c0(iF + 2, iF, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new k(this.f21841a ^ i11, i11 ^ this.f21842b, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f21844d[i10 + 1];
    }
}
