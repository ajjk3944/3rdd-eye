package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 implements x0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1024n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1025o = k1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1026a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1027b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1029d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1030e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1031f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1032h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1033i;
    public final q0 j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f1034k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f1035l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f1036m;

    public o0(int[] iArr, Object[] objArr, int i4, int i10, a aVar, int[] iArr2, int i11, int i12, q0 q0Var, d0 d0Var, f1 f1Var, p pVar, k0 k0Var) {
        this.f1026a = iArr;
        this.f1027b = objArr;
        this.f1028c = i4;
        this.f1029d = i10;
        this.f1031f = aVar instanceof w;
        this.g = iArr2;
        this.f1032h = i11;
        this.f1033i = i12;
        this.j = q0Var;
        this.f1034k = d0Var;
        this.f1035l = f1Var;
        this.f1030e = aVar;
        this.f1036m = k0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = d.h.A("Field ", str, " for ");
            sbA.append(cls.getName());
            sbA.append(" not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int K(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.o0 w(androidx.datastore.preferences.protobuf.w0 r34, androidx.datastore.preferences.protobuf.q0 r35, androidx.datastore.preferences.protobuf.d0 r36, androidx.datastore.preferences.protobuf.f1 r37, androidx.datastore.preferences.protobuf.p r38, androidx.datastore.preferences.protobuf.k0 r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.w(androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.k0):androidx.datastore.preferences.protobuf.o0");
    }

    public static long x(int i4) {
        return i4 & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) k1.f1006c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) k1.f1006c.h(obj, j)).longValue();
    }

    public final int A(int i4) {
        if (i4 >= this.f1028c && i4 <= this.f1029d) {
            int[] iArr = this.f1026a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
            while (i10 <= length) {
                int i11 = (length + i10) >>> 1;
                int i12 = i11 * 3;
                int i13 = iArr[i12];
                if (i4 == i13) {
                    return i12;
                }
                if (i4 < i13) {
                    length = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, k kVar, x0 x0Var, o oVar) throws z {
        int iZ;
        this.f1034k.getClass();
        x xVarA = d0.a(obj, j);
        j jVar = (j) kVar.f1003d;
        int i4 = kVar.f1000a;
        if ((i4 & 7) != 3) {
            throw a0.b();
        }
        do {
            w wVarI = x0Var.i();
            kVar.k(wVarI, x0Var, oVar);
            x0Var.c(wVarI);
            ((v0) xVarA).add(wVarI);
            if (jVar.c() || kVar.f1002c != 0) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == i4);
        kVar.f1002c = iZ;
    }

    public final void C(Object obj, int i4, k kVar, x0 x0Var, o oVar) throws a0 {
        int iZ;
        this.f1034k.getClass();
        x xVarA = d0.a(obj, i4 & 1048575);
        j jVar = (j) kVar.f1003d;
        int i10 = kVar.f1000a;
        if ((i10 & 7) != 2) {
            throw a0.b();
        }
        do {
            w wVarI = x0Var.i();
            kVar.l(wVarI, x0Var, oVar);
            x0Var.c(wVarI);
            ((v0) xVarA).add(wVarI);
            if (jVar.c() || kVar.f1002c != 0) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == i10);
        kVar.f1002c = iZ;
    }

    public final void D(int i4, k kVar, Object obj) throws z {
        if ((536870912 & i4) != 0) {
            kVar.F(2);
            k1.o(obj, i4 & 1048575, ((j) kVar.f1003d).y());
        } else if (!this.f1031f) {
            k1.o(obj, i4 & 1048575, kVar.n());
        } else {
            kVar.F(2);
            k1.o(obj, i4 & 1048575, ((j) kVar.f1003d).x());
        }
    }

    public final void E(int i4, k kVar, Object obj) throws z {
        int i10 = 536870912 & i4;
        d0 d0Var = this.f1034k;
        if (i10 != 0) {
            d0Var.getClass();
            kVar.B(d0.a(obj, i4 & 1048575), true);
        } else {
            d0Var.getClass();
            kVar.B(d0.a(obj, i4 & 1048575), false);
        }
    }

    public final void G(int i4, Object obj) {
        int i10 = this.f1026a[i4 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        k1.m(j, obj, (1 << (i10 >>> 20)) | k1.f1006c.f(obj, j));
    }

    public final void H(int i4, int i10, Object obj) {
        k1.m(this.f1026a[i10 + 2] & 1048575, obj, i4);
    }

    public final void I(Object obj, int i4, a aVar) {
        f1025o.putObject(obj, L(i4) & 1048575, aVar);
        G(i4, obj);
    }

    public final void J(Object obj, int i4, int i10, a aVar) {
        f1025o.putObject(obj, L(i10) & 1048575, aVar);
        H(i4, i10, obj);
    }

    public final int L(int i4) {
        return this.f1026a[i4 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0340 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.Object r34, androidx.datastore.preferences.protobuf.g0 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.M(java.lang.Object, androidx.datastore.preferences.protobuf.g0):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.a(java.lang.Object, java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj, g0 g0Var) throws IOException {
        g0Var.getClass();
        M(obj, g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = p(r10)
            if (r0 != 0) goto L8
            goto La5
        L8:
            boolean r0 = r10 instanceof androidx.datastore.preferences.protobuf.w
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r10
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.w) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.k(r2)
            r0.memoizedHashCode = r1
            r0.h()
        L1b:
            int[] r0 = r9.f1026a
            int r2 = r0.length
            r3 = r1
        L1f:
            if (r3 >= r2) goto L96
            int r4 = r9.L(r3)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r4
            long r5 = (long) r5
            int r4 = K(r4)
            r7 = 9
            if (r4 == r7) goto L80
            r7 = 60
            if (r4 == r7) goto L6a
            r7 = 68
            if (r4 == r7) goto L6a
            switch(r4) {
                case 17: goto L80;
                case 18: goto L54;
                case 19: goto L54;
                case 20: goto L54;
                case 21: goto L54;
                case 22: goto L54;
                case 23: goto L54;
                case 24: goto L54;
                case 25: goto L54;
                case 26: goto L54;
                case 27: goto L54;
                case 28: goto L54;
                case 29: goto L54;
                case 30: goto L54;
                case 31: goto L54;
                case 32: goto L54;
                case 33: goto L54;
                case 34: goto L54;
                case 35: goto L54;
                case 36: goto L54;
                case 37: goto L54;
                case 38: goto L54;
                case 39: goto L54;
                case 40: goto L54;
                case 41: goto L54;
                case 42: goto L54;
                case 43: goto L54;
                case 44: goto L54;
                case 45: goto L54;
                case 46: goto L54;
                case 47: goto L54;
                case 48: goto L54;
                case 49: goto L54;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L93
        L3e:
            sun.misc.Unsafe r4 = androidx.datastore.preferences.protobuf.o0.f1025o
            java.lang.Object r7 = r4.getObject(r10, r5)
            if (r7 == 0) goto L93
            androidx.datastore.preferences.protobuf.k0 r8 = r9.f1036m
            r8.getClass()
            r8 = r7
            androidx.datastore.preferences.protobuf.j0 r8 = (androidx.datastore.preferences.protobuf.j0) r8
            r8.f998a = r1
            r4.putObject(r10, r5, r7)
            goto L93
        L54:
            androidx.datastore.preferences.protobuf.d0 r4 = r9.f1034k
            r4.getClass()
            androidx.datastore.preferences.protobuf.j1 r4 = androidx.datastore.preferences.protobuf.k1.f1006c
            java.lang.Object r4 = r4.h(r10, r5)
            androidx.datastore.preferences.protobuf.x r4 = (androidx.datastore.preferences.protobuf.x) r4
            androidx.datastore.preferences.protobuf.b r4 = (androidx.datastore.preferences.protobuf.b) r4
            boolean r5 = r4.f936a
            if (r5 == 0) goto L93
            r4.f936a = r1
            goto L93
        L6a:
            r4 = r0[r3]
            boolean r4 = r9.q(r4, r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.x0 r4 = r9.m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.o0.f1025o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.c(r5)
            goto L93
        L80:
            boolean r4 = r9.n(r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.x0 r4 = r9.m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.o0.f1025o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.c(r5)
        L93:
            int r3 = r3 + 3
            goto L1f
        L96:
            androidx.datastore.preferences.protobuf.f1 r0 = r9.f1035l
            r0.getClass()
            androidx.datastore.preferences.protobuf.w r10 = (androidx.datastore.preferences.protobuf.w) r10
            androidx.datastore.preferences.protobuf.e1 r10 = r10.unknownFields
            boolean r0 = r10.f968e
            if (r0 == 0) goto La5
            r10.f968e = r1
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.c(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean d(Object obj) {
        int i4;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f1032h) {
            int i15 = this.g[i14];
            int[] iArr = this.f1026a;
            int i16 = iArr[i15];
            int iL = L(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f1025o.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i4 = i18;
            } else {
                int i20 = i13;
                i4 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & iL) == 0 || o(obj, i10, i4, i11, i19)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i10, i4, i11, i19)) {
                        if (!m(i10).d(k1.f1006c.h(obj, iL & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i4;
                    i13 = i11;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i16, i10, obj)) {
                                if (!m(i10).d(k1.f1006c.h(obj, iL & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i4;
                            i13 = i11;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = k1.f1006c.h(obj, iL & 1048575);
                                this.f1036m.getClass();
                                j0 j0Var = (j0) objH;
                                if (j0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((i0) this.f1027b[(i10 / 3) * 2]).f994a.f985b.f1056a != t1.MESSAGE) {
                                        continue;
                                    } else {
                                        x0 x0VarA = null;
                                        for (Object obj2 : j0Var.values()) {
                                            if (x0VarA == null) {
                                                x0VarA = u0.f1071c.a(obj2.getClass());
                                            }
                                            if (!x0VarA.d(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i4;
                            i13 = i11;
                        }
                    }
                    List list = (List) k1.f1006c.h(obj, iL & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x0 x0VarM = m(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (x0VarM.d(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i4;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05ec A[PHI: r23 r24
  0x05ec: PHI (r23v19 int) = 
  (r23v2 int)
  (r23v3 int)
  (r23v4 int)
  (r23v8 int)
  (r23v10 int)
  (r23v11 int)
  (r23v12 int)
  (r23v16 int)
  (r23v20 int)
 binds: [B:274:0x07a3, B:270:0x0785, B:266:0x0767, B:249:0x06ea, B:235:0x0681, B:231:0x0665, B:227:0x0649, B:220:0x060b, B:214:0x05ea] A[DONT_GENERATE, DONT_INLINE]
  0x05ec: PHI (r24v18 int) = 
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v8 int)
  (r24v10 int)
  (r24v11 int)
  (r24v12 int)
  (r24v15 int)
  (r24v19 int)
 binds: [B:274:0x07a3, B:270:0x0785, B:266:0x0767, B:249:0x06ea, B:235:0x0681, B:231:0x0665, B:227:0x0649, B:220:0x060b, B:214:0x05ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0325 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.datastore.preferences.protobuf.w r30) {
        /*
            Method dump skipped, instructions count: 2622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.e(androidx.datastore.preferences.protobuf.w):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.datastore.preferences.protobuf.w r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.f(androidx.datastore.preferences.protobuf.w):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.datastore.preferences.protobuf.w r12, androidx.datastore.preferences.protobuf.w r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.g(androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.w):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.x0
    public final void h(java.lang.Object r19, androidx.datastore.preferences.protobuf.k r20, androidx.datastore.preferences.protobuf.o r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.h(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final w i() {
        this.j.getClass();
        return ((w) this.f1030e).i();
    }

    public final boolean j(w wVar, w wVar2, int i4) {
        return n(i4, wVar) == n(i4, wVar2);
    }

    public final void k(int i4, Object obj, Object obj2) {
        int i10 = this.f1026a[i4];
        if (k1.f1006c.h(obj, L(i4) & 1048575) == null) {
            return;
        }
        l(i4);
    }

    public final void l(int i4) {
        if (this.f1027b[((i4 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final x0 m(int i4) {
        int i10 = (i4 / 3) * 2;
        Object[] objArr = this.f1027b;
        x0 x0Var = (x0) objArr[i10];
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0VarA = u0.f1071c.a((Class) objArr[i10 + 1]);
        objArr[i10] = x0VarA;
        return x0VarA;
    }

    public final boolean n(int i4, Object obj) {
        int i10 = this.f1026a[i4 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int iL = L(i4);
            long j8 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(k1.f1006c.d(obj, j8)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(k1.f1006c.e(obj, j8)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (k1.f1006c.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (k1.f1006c.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (k1.f1006c.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (k1.f1006c.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (k1.f1006c.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return k1.f1006c.c(obj, j8);
                case 8:
                    Object objH = k1.f1006c.h(obj, j8);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof g) {
                        return !g.f972c.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (k1.f1006c.h(obj, j8) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.f972c.equals(k1.f1006c.h(obj, j8));
                case 11:
                    if (k1.f1006c.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (k1.f1006c.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (k1.f1006c.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (k1.f1006c.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (k1.f1006c.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (k1.f1006c.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (k1.f1006c.h(obj, j8) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & k1.f1006c.f(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i4, int i10, int i11, int i12) {
        return i10 == 1048575 ? n(i4, obj) : (i11 & i12) != 0;
    }

    public final boolean q(int i4, int i10, Object obj) {
        return k1.f1006c.f(obj, (long) (this.f1026a[i10 + 2] & 1048575)) == i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.o r12, androidx.datastore.preferences.protobuf.k r13) throws androidx.datastore.preferences.protobuf.z {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.j1 r10 = androidx.datastore.preferences.protobuf.k1.f1006c
            java.lang.Object r10 = r10.h(r9, r0)
            androidx.datastore.preferences.protobuf.k0 r2 = r8.f1036m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.j0 r10 = androidx.datastore.preferences.protobuf.j0.f997b
            androidx.datastore.preferences.protobuf.j0 r10 = r10.b()
            androidx.datastore.preferences.protobuf.k1.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.j0 r3 = (androidx.datastore.preferences.protobuf.j0) r3
            boolean r3 = r3.f998a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.j0 r3 = androidx.datastore.preferences.protobuf.j0.f997b
            androidx.datastore.preferences.protobuf.j0 r3 = r3.b()
            androidx.datastore.preferences.protobuf.k0.a(r3, r10)
            androidx.datastore.preferences.protobuf.k1.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.j0 r10 = (androidx.datastore.preferences.protobuf.j0) r10
            androidx.datastore.preferences.protobuf.i0 r11 = (androidx.datastore.preferences.protobuf.i0) r11
            androidx.datastore.preferences.protobuf.h0 r9 = r11.f994a
            r11 = 2
            r13.F(r11)
            java.lang.Object r0 = r13.f1003d
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.j) r0
            int r1 = r0.A()
            int r1 = r0.i(r1)
            java.lang.Object r2 = r9.f986c
            java.lang.String r3 = ""
            r4 = r2
        L55:
            int r5 = r13.e()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.H()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.a0 r5 = new androidx.datastore.preferences.protobuf.a0     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.s1 r5 = r9.f985b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            java.lang.Object r4 = r13.r(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.s1 r5 = r9.f984a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            r6 = 0
            java.lang.Object r3 = r13.r(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            goto L55
        L8e:
            boolean r5 = r13.H()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.a0 r9 = new androidx.datastore.preferences.protobuf.a0     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L79
            r0.h(r1)
            return
        La2:
            r0.h(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.r(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void s(int i4, Object obj, Object obj2) {
        if (n(i4, obj2)) {
            long jL = L(i4) & 1048575;
            Unsafe unsafe = f1025o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1026a[i4] + " is present but null: " + obj2);
            }
            x0 x0VarM = m(i4);
            if (!n(i4, obj)) {
                if (p(object)) {
                    w wVarI = x0VarM.i();
                    x0VarM.a(wVarI, object);
                    unsafe.putObject(obj, jL, wVarI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                w wVarI2 = x0VarM.i();
                x0VarM.a(wVarI2, object2);
                unsafe.putObject(obj, jL, wVarI2);
                object2 = wVarI2;
            }
            x0VarM.a(object2, object);
        }
    }

    public final void t(int i4, Object obj, Object obj2) {
        int[] iArr = this.f1026a;
        int i10 = iArr[i4];
        if (q(i10, i4, obj2)) {
            long jL = L(i4) & 1048575;
            Unsafe unsafe = f1025o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
            }
            x0 x0VarM = m(i4);
            if (!q(i10, i4, obj)) {
                if (p(object)) {
                    w wVarI = x0VarM.i();
                    x0VarM.a(wVarI, object);
                    unsafe.putObject(obj, jL, wVarI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i10, i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                w wVarI2 = x0VarM.i();
                x0VarM.a(wVarI2, object2);
                unsafe.putObject(obj, jL, wVarI2);
                object2 = wVarI2;
            }
            x0VarM.a(object2, object);
        }
    }

    public final Object u(int i4, Object obj) {
        x0 x0VarM = m(i4);
        long jL = L(i4) & 1048575;
        if (!n(i4, obj)) {
            return x0VarM.i();
        }
        Object object = f1025o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        w wVarI = x0VarM.i();
        if (object != null) {
            x0VarM.a(wVarI, object);
        }
        return wVarI;
    }

    public final Object v(int i4, int i10, Object obj) {
        x0 x0VarM = m(i10);
        if (!q(i4, i10, obj)) {
            return x0VarM.i();
        }
        Object object = f1025o.getObject(obj, L(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        w wVarI = x0VarM.i();
        if (object != null) {
            x0VarM.a(wVarI, object);
        }
        return wVarI;
    }
}
