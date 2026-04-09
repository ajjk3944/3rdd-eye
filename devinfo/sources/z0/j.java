package z0;

import java.util.Arrays;
import u0.j1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f37821e = new j(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f37822a;

    /* renamed from: b, reason: collision with root package name */
    public int f37823b;

    /* renamed from: c, reason: collision with root package name */
    public final b1.b f37824c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f37825d;

    public j(int i4, int i10, Object[] objArr, b1.b bVar) {
        this.f37822a = i4;
        this.f37823b = i10;
        this.f37824c = bVar;
        this.f37825d = objArr;
    }

    public static j j(int i4, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, b1.b bVar) {
        if (i11 > 30) {
            return new j(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iP = com.bumptech.glide.c.p(i4, i11);
        int iP2 = com.bumptech.glide.c.p(i10, i11);
        if (iP != iP2) {
            return new j((1 << iP) | (1 << iP2), 0, iP < iP2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new j(0, 1 << iP, new Object[]{j(i4, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i4, int i10, int i11, Object obj, Object obj2, int i12, b1.b bVar) {
        Object obj3 = this.f37825d[i4];
        j jVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i4), i11, obj, obj2, i12 + 5, bVar);
        int iT = t(i10);
        int i13 = iT + 1;
        Object[] objArr = this.f37825d;
        Object[] objArr2 = new Object[objArr.length - 1];
        zj.m.R(0, i4, 6, objArr, objArr2);
        zj.m.N(i4, i4 + 2, i13, objArr, objArr2);
        objArr2[iT - 1] = jVarJ;
        zj.m.N(iT, i13, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f37823b == 0) {
            return this.f37825d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f37822a);
        int length = this.f37825d.length;
        for (int i4 = iBitCount * 2; i4 < length; i4++) {
            iBitCount += s(i4).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        sk.b bVarC = ci.b.C(ci.b.E(0, this.f37825d.length), 2);
        int i4 = bVarC.f33817a;
        int i10 = bVarC.f33818b;
        int i11 = bVarC.f33819c;
        if ((i11 > 0 && i4 <= i10) || (i11 < 0 && i10 <= i4)) {
            while (!nk.k.a(obj, this.f37825d[i4])) {
                if (i4 != i10) {
                    i4 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i4, int i10, Object obj) {
        int iP = 1 << com.bumptech.glide.c.p(i4, i10);
        if (h(iP)) {
            return nk.k.a(obj, this.f37825d[f(iP)]);
        }
        if (!i(iP)) {
            return false;
        }
        j jVarS = s(t(iP));
        return i10 == 30 ? jVarS.c(obj) : jVarS.d(i4, i10 + 5, obj);
    }

    public final boolean e(j jVar) {
        if (this == jVar) {
            return true;
        }
        if (this.f37823b == jVar.f37823b && this.f37822a == jVar.f37822a) {
            int length = this.f37825d.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f37825d[i4] == jVar.f37825d[i4]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i4) {
        return Integer.bitCount((i4 - 1) & this.f37822a) * 2;
    }

    public final Object g(int i4, int i10, Object obj) {
        int iP = 1 << com.bumptech.glide.c.p(i4, i10);
        if (h(iP)) {
            int iF = f(iP);
            if (nk.k.a(obj, this.f37825d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iP)) {
            return null;
        }
        j jVarS = s(t(iP));
        if (i10 != 30) {
            return jVarS.g(i4, i10 + 5, obj);
        }
        sk.b bVarC = ci.b.C(ci.b.E(0, jVarS.f37825d.length), 2);
        int i11 = bVarC.f33817a;
        int i12 = bVarC.f33818b;
        int i13 = bVarC.f33819c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return null;
        }
        while (!nk.k.a(obj, jVarS.f37825d[i11])) {
            if (i11 == i12) {
                return null;
            }
            i11 += i13;
        }
        return jVarS.x(i11);
    }

    public final boolean h(int i4) {
        return (i4 & this.f37822a) != 0;
    }

    public final boolean i(int i4) {
        return (i4 & this.f37823b) != 0;
    }

    public final j k(int i4, d dVar) {
        dVar.b(dVar.f37813f - 1);
        dVar.f37811d = x(i4);
        Object[] objArr = this.f37825d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f37824c != dVar.f37809b) {
            return new j(0, 0, com.bumptech.glide.c.d(objArr, i4), dVar.f37809b);
        }
        this.f37825d = com.bumptech.glide.c.d(objArr, i4);
        return this;
    }

    public final j l(int i4, Object obj, Object obj2, int i10, d dVar) {
        d dVar2;
        j jVarL;
        int iP = 1 << com.bumptech.glide.c.p(i4, i10);
        boolean zH = h(iP);
        b1.b bVar = this.f37824c;
        if (zH) {
            int iF = f(iP);
            if (!nk.k.a(obj, this.f37825d[iF])) {
                dVar.b(dVar.f37813f + 1);
                b1.b bVar2 = dVar.f37809b;
                if (bVar != bVar2) {
                    return new j(this.f37822a ^ iP, this.f37823b | iP, a(iF, iP, i4, obj, obj2, i10, bVar2), bVar2);
                }
                this.f37825d = a(iF, iP, i4, obj, obj2, i10, bVar2);
                this.f37822a ^= iP;
                this.f37823b |= iP;
                return this;
            }
            dVar.f37811d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == dVar.f37809b) {
                this.f37825d[iF + 1] = obj2;
                return this;
            }
            dVar.f37812e++;
            Object[] objArr = this.f37825d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new j(this.f37822a, this.f37823b, objArrCopyOf, dVar.f37809b);
        }
        if (!i(iP)) {
            dVar.b(dVar.f37813f + 1);
            b1.b bVar3 = dVar.f37809b;
            int iF2 = f(iP);
            if (bVar != bVar3) {
                return new j(this.f37822a | iP, this.f37823b, com.bumptech.glide.c.c(this.f37825d, iF2, obj, obj2), bVar3);
            }
            this.f37825d = com.bumptech.glide.c.c(this.f37825d, iF2, obj, obj2);
            this.f37822a |= iP;
            return this;
        }
        int iT = t(iP);
        j jVarS = s(iT);
        if (i10 == 30) {
            sk.b bVarC = ci.b.C(ci.b.E(0, jVarS.f37825d.length), 2);
            int i11 = bVarC.f33817a;
            int i12 = bVarC.f33818b;
            int i13 = bVarC.f33819c;
            if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                dVar.b(dVar.f37813f + 1);
                jVarL = new j(0, 0, com.bumptech.glide.c.c(jVarS.f37825d, 0, obj, obj2), dVar.f37809b);
                dVar2 = dVar;
            } else {
                while (!nk.k.a(obj, jVarS.f37825d[i11])) {
                    if (i11 == i12) {
                        dVar.b(dVar.f37813f + 1);
                        jVarL = new j(0, 0, com.bumptech.glide.c.c(jVarS.f37825d, 0, obj, obj2), dVar.f37809b);
                        break;
                    }
                    i11 += i13;
                }
                dVar.f37811d = jVarS.x(i11);
                if (jVarS.f37824c == dVar.f37809b) {
                    jVarS.f37825d[i11 + 1] = obj2;
                    jVarL = jVarS;
                } else {
                    dVar.f37812e++;
                    Object[] objArr2 = jVarS.f37825d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    nk.k.d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i11 + 1] = obj2;
                    jVarL = new j(0, 0, objArrCopyOf2, dVar.f37809b);
                }
                dVar2 = dVar;
            }
        } else {
            dVar2 = dVar;
            jVarL = jVarS.l(i4, obj, obj2, i10 + 5, dVar2);
        }
        return jVarS == jVarL ? this : r(iT, jVarL, dVar2.f37809b);
    }

    public final j m(j jVar, int i4, b1.a aVar, d dVar) {
        Object[] objArr;
        j jVarJ;
        if (this == jVar) {
            aVar.f1631a += b();
            return this;
        }
        int i10 = 0;
        if (i4 > 30) {
            b1.b bVar = dVar.f37809b;
            int i11 = jVar.f37823b;
            Object[] objArr2 = this.f37825d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + jVar.f37825d.length);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            int length = this.f37825d.length;
            sk.b bVarC = ci.b.C(ci.b.E(0, jVar.f37825d.length), 2);
            int i12 = bVarC.f33817a;
            int i13 = bVarC.f33818b;
            int i14 = bVarC.f33819c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (c(jVar.f37825d[i12])) {
                        aVar.f1631a++;
                    } else {
                        Object[] objArr3 = jVar.f37825d;
                        objArrCopyOf[length] = objArr3[i12];
                        objArrCopyOf[length + 1] = objArr3[i12 + 1];
                        length += 2;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
            if (length != this.f37825d.length) {
                if (length == jVar.f37825d.length) {
                    return jVar;
                }
                if (length == objArrCopyOf.length) {
                    return new j(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                nk.k.d(objArrCopyOf2, "copyOf(...)");
                return new j(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i15 = this.f37823b | jVar.f37823b;
            int i16 = this.f37822a;
            int i17 = jVar.f37822a;
            int i18 = (i16 ^ i17) & (~i15);
            int i19 = i16 & i17;
            int i20 = i18;
            while (i19 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i19);
                if (nk.k.a(this.f37825d[f(iLowestOneBit)], jVar.f37825d[jVar.f(iLowestOneBit)])) {
                    i20 |= iLowestOneBit;
                } else {
                    i15 |= iLowestOneBit;
                }
                i19 ^= iLowestOneBit;
            }
            if ((i15 & i20) != 0) {
                j1.b("Check failed.");
            }
            j jVar2 = (nk.k.a(this.f37824c, dVar.f37809b) && this.f37822a == i20 && this.f37823b == i15) ? this : new j(i20, i15, new Object[Integer.bitCount(i15) + (Integer.bitCount(i20) * 2)], null);
            int i21 = i15;
            int i22 = 0;
            while (i21 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i21);
                Object[] objArr4 = jVar2.f37825d;
                int length2 = (objArr4.length - 1) - i22;
                if (i(iLowestOneBit2)) {
                    jVarJ = s(t(iLowestOneBit2));
                    if (jVar.i(iLowestOneBit2)) {
                        jVarJ = jVarJ.m(jVar.s(jVar.t(iLowestOneBit2)), i4 + 5, aVar, dVar);
                        objArr = objArr4;
                    } else if (jVar.h(iLowestOneBit2)) {
                        int iF = jVar.f(iLowestOneBit2);
                        Object obj = jVar.f37825d[iF];
                        Object objX = jVar.x(iF);
                        int i23 = dVar.f37813f;
                        objArr = objArr4;
                        jVarJ = jVarJ.l(obj != null ? obj.hashCode() : i10, obj, objX, i4 + 5, dVar);
                        if (dVar.f37813f == i23) {
                            aVar.f1631a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (jVar.i(iLowestOneBit2)) {
                        j jVarS = jVar.s(jVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f37825d[iF2];
                            int i24 = i4 + 5;
                            if (jVarS.d(obj2 != null ? obj2.hashCode() : 0, i24, obj2)) {
                                aVar.f1631a++;
                                jVarJ = jVarS;
                            } else {
                                jVarJ = jVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i24, dVar);
                            }
                        } else {
                            jVarJ = jVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f37825d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = jVar.f(iLowestOneBit2);
                        Object obj4 = jVar.f37825d[iF4];
                        jVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, jVar.x(iF4), i4 + 5, dVar.f37809b);
                    }
                }
                objArr[length2] = jVarJ;
                i22++;
                i21 ^= iLowestOneBit2;
                i10 = 0;
            }
            int i25 = 0;
            while (i20 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i20);
                int i26 = i25 * 2;
                if (jVar.h(iLowestOneBit3)) {
                    int iF5 = jVar.f(iLowestOneBit3);
                    Object[] objArr5 = jVar2.f37825d;
                    objArr5[i26] = jVar.f37825d[iF5];
                    objArr5[i26 + 1] = jVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f1631a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = jVar2.f37825d;
                    objArr6[i26] = this.f37825d[iF6];
                    objArr6[i26 + 1] = x(iF6);
                }
                i25++;
                i20 ^= iLowestOneBit3;
            }
            if (!e(jVar2)) {
                return jVar.e(jVar2) ? jVar : jVar2;
            }
        }
        return this;
    }

    public final j n(int i4, Object obj, int i10, d dVar) {
        j jVarN;
        int iP = 1 << com.bumptech.glide.c.p(i4, i10);
        if (h(iP)) {
            int iF = f(iP);
            if (nk.k.a(obj, this.f37825d[iF])) {
                return p(iF, iP, dVar);
            }
        } else if (i(iP)) {
            int iT = t(iP);
            j jVarS = s(iT);
            if (i10 == 30) {
                sk.b bVarC = ci.b.C(ci.b.E(0, jVarS.f37825d.length), 2);
                int i11 = bVarC.f33817a;
                int i12 = bVarC.f33818b;
                int i13 = bVarC.f33819c;
                if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                    jVarN = jVarS;
                    break;
                }
                while (!nk.k.a(obj, jVarS.f37825d[i11])) {
                    if (i11 == i12) {
                        jVarN = jVarS;
                        break;
                    }
                    i11 += i13;
                }
                jVarN = jVarS.k(i11, dVar);
            } else {
                jVarN = jVarS.n(i4, obj, i10 + 5, dVar);
            }
            return q(jVarS, jVarN, iT, iP, dVar.f37809b);
        }
        return this;
    }

    public final j o(int i4, Object obj, Object obj2, int i10, d dVar) {
        j jVar;
        j jVarO;
        int iP = 1 << com.bumptech.glide.c.p(i4, i10);
        if (h(iP)) {
            int iF = f(iP);
            if (nk.k.a(obj, this.f37825d[iF]) && nk.k.a(obj2, x(iF))) {
                return p(iF, iP, dVar);
            }
        } else if (i(iP)) {
            int iT = t(iP);
            j jVarS = s(iT);
            if (i10 == 30) {
                sk.b bVarC = ci.b.C(ci.b.E(0, jVarS.f37825d.length), 2);
                int i11 = bVarC.f33817a;
                int i12 = bVarC.f33818b;
                int i13 = bVarC.f33819c;
                if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                    jVarO = jVarS;
                    jVar = jVarS;
                } else {
                    while (true) {
                        if (!nk.k.a(obj, jVarS.f37825d[i11]) || !nk.k.a(obj2, jVarS.x(i11))) {
                            if (i11 == i12) {
                                break;
                            }
                            i11 += i13;
                        } else {
                            jVarO = jVarS.k(i11, dVar);
                            break;
                        }
                    }
                    jVarO = jVarS;
                    jVar = jVarS;
                }
            } else {
                jVar = jVarS;
                jVarO = jVar.o(i4, obj, obj2, i10 + 5, dVar);
            }
            return q(jVar, jVarO, iT, iP, dVar.f37809b);
        }
        return this;
    }

    public final j p(int i4, int i10, d dVar) {
        dVar.b(dVar.f37813f - 1);
        dVar.f37811d = x(i4);
        Object[] objArr = this.f37825d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f37824c != dVar.f37809b) {
            return new j(i10 ^ this.f37822a, this.f37823b, com.bumptech.glide.c.d(objArr, i4), dVar.f37809b);
        }
        this.f37825d = com.bumptech.glide.c.d(objArr, i4);
        this.f37822a ^= i10;
        return this;
    }

    public final j q(j jVar, j jVar2, int i4, int i10, b1.b bVar) {
        b1.b bVar2 = this.f37824c;
        if (jVar2 != null) {
            return (bVar2 == bVar || jVar != jVar2) ? r(i4, jVar2, bVar) : this;
        }
        Object[] objArr = this.f37825d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new j(this.f37822a, i10 ^ this.f37823b, com.bumptech.glide.c.e(objArr, i4), bVar);
        }
        this.f37825d = com.bumptech.glide.c.e(objArr, i4);
        this.f37823b ^= i10;
        return this;
    }

    public final j r(int i4, j jVar, b1.b bVar) {
        Object[] objArr = this.f37825d;
        if (objArr.length == 1 && jVar.f37825d.length == 2 && jVar.f37823b == 0) {
            jVar.f37822a = this.f37823b;
            return jVar;
        }
        if (this.f37824c == bVar) {
            objArr[i4] = jVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        nk.k.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i4] = jVar;
        return new j(this.f37822a, this.f37823b, objArrCopyOf, bVar);
    }

    public final j s(int i4) {
        Object obj = this.f37825d[i4];
        nk.k.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (j) obj;
    }

    public final int t(int i4) {
        return (this.f37825d.length - 1) - Integer.bitCount((i4 - 1) & this.f37823b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.f34474c = w(r12, r4, (z0.j) r14.f34474c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t7.m u(java.lang.Object r12, int r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.j.u(java.lang.Object, int, java.lang.Object, int):t7.m");
    }

    public final j v(int i4, int i10, Object obj) {
        j jVarV;
        int iP = 1 << com.bumptech.glide.c.p(i4, i10);
        if (h(iP)) {
            int iF = f(iP);
            if (nk.k.a(obj, this.f37825d[iF])) {
                Object[] objArr = this.f37825d;
                if (objArr.length != 2) {
                    return new j(this.f37822a ^ iP, this.f37823b, com.bumptech.glide.c.d(objArr, iF), null);
                }
                return null;
            }
            return this;
        }
        if (i(iP)) {
            int iT = t(iP);
            j jVarS = s(iT);
            if (i10 == 30) {
                sk.b bVarC = ci.b.C(ci.b.E(0, jVarS.f37825d.length), 2);
                int i11 = bVarC.f33817a;
                int i12 = bVarC.f33818b;
                int i13 = bVarC.f33819c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!nk.k.a(obj, jVarS.f37825d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    Object[] objArr2 = jVarS.f37825d;
                    jVarV = objArr2.length == 2 ? null : new j(0, 0, com.bumptech.glide.c.d(objArr2, i11), null);
                }
                jVarV = jVarS;
                break;
            }
            jVarV = jVarS.v(i4, i10 + 5, obj);
            if (jVarV == null) {
                Object[] objArr3 = this.f37825d;
                if (objArr3.length != 1) {
                    return new j(this.f37822a, iP ^ this.f37823b, com.bumptech.glide.c.e(objArr3, iT), null);
                }
                return null;
            }
            if (jVarS != jVarV) {
                return w(iT, iP, jVarV);
            }
        }
        return this;
    }

    public final j w(int i4, int i10, j jVar) {
        Object[] objArr = jVar.f37825d;
        if (objArr.length != 2 || jVar.f37823b != 0) {
            Object[] objArr2 = this.f37825d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i4] = jVar;
            return new j(this.f37822a, this.f37823b, objArrCopyOf, null);
        }
        if (this.f37825d.length == 1) {
            jVar.f37822a = this.f37823b;
            return jVar;
        }
        int iF = f(i10);
        Object[] objArr3 = this.f37825d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        nk.k.d(objArrCopyOf2, "copyOf(...)");
        zj.m.N(i4 + 2, i4 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        zj.m.N(iF + 2, iF, i4, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new j(this.f37822a ^ i10, i10 ^ this.f37823b, objArrCopyOf2, null);
    }

    public final Object x(int i4) {
        return this.f37825d[i4 + 1];
    }
}
