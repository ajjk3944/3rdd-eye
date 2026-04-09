package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mo1 implements xo1 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f13975k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f13976l = ip1.o();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f13977a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13980d;

    /* renamed from: e, reason: collision with root package name */
    public final qm1 f13981e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13982f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13983h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13984i;
    public final w5 j;

    public mo1(int[] iArr, Object[] objArr, int i4, int i10, qm1 qm1Var, int[] iArr2, int i11, int i12, w5 w5Var, cl1 cl1Var) {
        this.f13977a = iArr;
        this.f13978b = objArr;
        this.f13979c = i4;
        this.f13980d = i10;
        this.f13982f = qm1Var instanceof qn1;
        this.g = iArr2;
        this.f13983h = i11;
        this.f13984i = i12;
        this.j = w5Var;
        this.f13981e = qm1Var;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            je.u.B(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(d.h.w(sb2, " not found. Known fields are ", string), e2);
        }
    }

    public static int l(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof qn1) {
            return ((qn1) obj).h();
        }
        return true;
    }

    public static void n(Object obj) {
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int o(Object obj, long j) {
        return ((Integer) ip1.k(obj, j)).intValue();
    }

    public static long p(Object obj, long j) {
        return ((Long) ip1.k(obj, j)).longValue();
    }

    public static final int x(byte[] bArr, int i4, int i10, lp1 lp1Var, Class cls, vm1 vm1Var) throws ao1 {
        lp1 lp1Var2 = lp1.f13574c;
        switch (lp1Var.ordinal()) {
            case 0:
                int i11 = i4 + 8;
                vm1Var.f17658c = Double.valueOf(Double.longBitsToDouble(al0.K(i4, bArr)));
                return i11;
            case 1:
                int i12 = i4 + 4;
                vm1Var.f17658c = Float.valueOf(Float.intBitsToFloat(al0.G(i4, bArr)));
                return i12;
            case 2:
            case 3:
                int iC = al0.C(bArr, i4, vm1Var);
                vm1Var.f17658c = Long.valueOf(vm1Var.f17657b);
                return iC;
            case 4:
            case 12:
            case 13:
                int iF = al0.f(bArr, i4, vm1Var);
                vm1Var.f17658c = Integer.valueOf(vm1Var.f17656a);
                return iF;
            case 5:
            case 15:
                int i13 = i4 + 8;
                vm1Var.f17658c = Long.valueOf(al0.K(i4, bArr));
                return i13;
            case 6:
            case 14:
                int i14 = i4 + 4;
                vm1Var.f17658c = Integer.valueOf(al0.G(i4, bArr));
                return i14;
            case 7:
                int iC2 = al0.C(bArr, i4, vm1Var);
                vm1Var.f17658c = Boolean.valueOf(vm1Var.f17657b != 0);
                return iC2;
            case 8:
                return al0.N(bArr, i4, vm1Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                xo1 xo1VarA = ro1.f15723c.a(cls);
                qn1 qn1VarB = xo1VarA.b();
                int iS = al0.S(qn1VarB, xo1VarA, bArr, i4, i10, vm1Var);
                xo1VarA.a(qn1VarB);
                vm1Var.f17658c = qn1VarB;
                return iS;
            case 11:
                return al0.P(bArr, i4, vm1Var);
            case 16:
                int iF2 = al0.f(bArr, i4, vm1Var);
                vm1Var.f17658c = Integer.valueOf(en1.f(vm1Var.f17656a));
                return iF2;
            case 17:
                int iC3 = al0.C(bArr, i4, vm1Var);
                vm1Var.f17658c = Long.valueOf(en1.g(vm1Var.f17657b));
                return iC3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.mo1 z(com.google.android.gms.internal.ads.to1 r36, com.google.android.gms.internal.ads.w5 r37, com.google.android.gms.internal.ads.cl1 r38) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.z(com.google.android.gms.internal.ads.to1, com.google.android.gms.internal.ads.w5, com.google.android.gms.internal.ads.cl1):com.google.android.gms.internal.ads.mo1");
    }

    public final void B(int i4, Object obj, Object obj2) {
        if (s(i4, obj2)) {
            int iK = k(i4) & 1048575;
            Unsafe unsafe = f13976l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i10 = this.f13977a[i4];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(r5.c.e(i10, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            xo1 xo1VarD = D(i4);
            if (!s(i4, obj)) {
                if (m(object)) {
                    qn1 qn1VarB = xo1VarD.b();
                    xo1VarD.c(qn1VarB, object);
                    unsafe.putObject(obj, j, qn1VarB);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                qn1 qn1VarB2 = xo1VarD.b();
                xo1VarD.c(qn1VarB2, object2);
                unsafe.putObject(obj, j, qn1VarB2);
                object2 = qn1VarB2;
            }
            xo1VarD.c(object2, object);
        }
    }

    public final void C(int i4, Object obj, Object obj2) {
        int[] iArr = this.f13977a;
        int i10 = iArr[i4];
        if (u(i10, i4, obj2)) {
            int iK = k(i4) & 1048575;
            Unsafe unsafe = f13976l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i11 = iArr[i4];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(r5.c.e(i11, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            xo1 xo1VarD = D(i4);
            if (!u(i10, i4, obj)) {
                if (m(object)) {
                    qn1 qn1VarB = xo1VarD.b();
                    xo1VarD.c(qn1VarB, object);
                    unsafe.putObject(obj, j, qn1VarB);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                v(i10, i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                qn1 qn1VarB2 = xo1VarD.b();
                xo1VarD.c(qn1VarB2, object2);
                unsafe.putObject(obj, j, qn1VarB2);
                object2 = qn1VarB2;
            }
            xo1VarD.c(object2, object);
        }
    }

    public final xo1 D(int i4) {
        int i10 = i4 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f13978b;
        xo1 xo1Var = (xo1) objArr[i11];
        if (xo1Var != null) {
            return xo1Var;
        }
        xo1 xo1VarA = ro1.f15723c.a((Class) objArr[i11 + 1]);
        objArr[i11] = xo1VarA;
        return xo1VarA;
    }

    public final Object E(int i4) {
        int i10 = i4 / 3;
        return this.f13978b[i10 + i10];
    }

    public final tn1 F(int i4) {
        int i10 = i4 / 3;
        return (tn1) this.f13978b[i10 + i10 + 1];
    }

    public final Object G(int i4, Object obj) {
        xo1 xo1VarD = D(i4);
        int iK = k(i4) & 1048575;
        if (!s(i4, obj)) {
            return xo1VarD.b();
        }
        Object object = f13976l.getObject(obj, iK);
        if (m(object)) {
            return object;
        }
        qn1 qn1VarB = xo1VarD.b();
        if (object != null) {
            xo1VarD.c(qn1VarB, object);
        }
        return qn1VarB;
    }

    public final void H(int i4, Object obj, Object obj2) {
        f13976l.putObject(obj, k(i4) & 1048575, obj2);
        t(i4, obj);
    }

    public final Object I(int i4, int i10, Object obj) {
        xo1 xo1VarD = D(i10);
        if (!u(i4, i10, obj)) {
            return xo1VarD.b();
        }
        Object object = f13976l.getObject(obj, k(i10) & 1048575);
        if (m(object)) {
            return object;
        }
        qn1 qn1VarB = xo1VarD.b();
        if (object != null) {
            xo1VarD.c(qn1VarB, object);
        }
        return qn1VarB;
    }

    public final void J(Object obj, int i4, Object obj2, int i10) {
        f13976l.putObject(obj, k(i10) & 1048575, obj2);
        v(i4, i10, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(java.lang.Object r22, int r23, java.lang.Object r24, com.google.android.gms.internal.ads.w5 r25, java.lang.Object r26) throws com.google.android.gms.internal.ads.jp1 {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.K(java.lang.Object, int, java.lang.Object, com.google.android.gms.internal.ads.w5, java.lang.Object):java.lang.Object");
    }

    public final void L(int i4, androidx.datastore.preferences.protobuf.k kVar, Object obj) {
        en1 en1Var = (en1) kVar.f1003d;
        long j = i4 & 1048575;
        if ((536870912 & i4) != 0) {
            kVar.Y(2);
            ip1.l(obj, j, en1Var.t());
        } else if (!this.f13982f) {
            ip1.l(obj, j, kVar.h0());
        } else {
            kVar.Y(2);
            ip1.l(obj, j, en1Var.s());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // com.google.android.gms.internal.ads.xo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m(r8)
            if (r0 != 0) goto L8
            goto L99
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.qn1
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.ads.qn1 r0 = (com.google.android.gms.internal.ads.qn1) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.g(r2)
            r0.zzq = r1
            r0.i()
        L1b:
            r0 = r1
        L1c:
            int[] r2 = r7.f13977a
            int r3 = r2.length
            if (r0 >= r3) goto L8a
            int r3 = r7.k(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = l(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L74
            r6 = 60
            if (r3 == r6) goto L5e
            r6 = 68
            if (r3 == r6) goto L5e
            switch(r3) {
                case 17: goto L74;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L87
        L3e:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.mo1.f13976l
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L87
            r6 = r3
            com.google.android.gms.internal.ads.ho1 r6 = (com.google.android.gms.internal.ads.ho1) r6
            r6.f11933a = r1
            r2.putObject(r8, r4, r3)
            goto L87
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.ads.ip1.k(r8, r4)
            com.google.android.gms.internal.ads.xn1 r2 = (com.google.android.gms.internal.ads.xn1) r2
            com.google.android.gms.internal.ads.rm1 r2 = (com.google.android.gms.internal.ads.rm1) r2
            boolean r3 = r2.f15707a
            if (r3 == 0) goto L87
            r2.f15707a = r1
            goto L87
        L5e:
            r2 = r2[r0]
            boolean r2 = r7.u(r2, r0, r8)
            if (r2 == 0) goto L87
            com.google.android.gms.internal.ads.xo1 r2 = r7.D(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.ads.mo1.f13976l
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.a(r3)
            goto L87
        L74:
            boolean r2 = r7.s(r0, r8)
            if (r2 == 0) goto L87
            com.google.android.gms.internal.ads.xo1 r2 = r7.D(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.ads.mo1.f13976l
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.a(r3)
        L87:
            int r0 = r0 + 3
            goto L1c
        L8a:
            com.google.android.gms.internal.ads.w5 r0 = r7.j
            r0.getClass()
            com.google.android.gms.internal.ads.qn1 r8 = (com.google.android.gms.internal.ads.qn1) r8
            com.google.android.gms.internal.ads.dp1 r8 = r8.zzt
            boolean r0 = r8.f10540e
            if (r0 == 0) goto L99
            r8.f10540e = r1
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.a(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final qn1 b() {
        return ((qn1) this.f13981e).p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.ads.xo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07f3 A[LOOP:1: B:217:0x07f1->B:218:0x07f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.xo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r22, androidx.datastore.preferences.protobuf.k r23, com.google.android.gms.internal.ads.jn1 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.d(java.lang.Object, androidx.datastore.preferences.protobuf.k, com.google.android.gms.internal.ads.jn1):void");
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final boolean e(qn1 qn1Var, qn1 qn1Var2) {
        boolean zC;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f13977a;
            if (i4 < iArr.length) {
                int iK = k(i4);
                long j = iK & 1048575;
                switch (l(iK)) {
                    case 0:
                        if (!q(qn1Var, qn1Var2, i4)) {
                            break;
                        } else {
                            hp1 hp1Var = ip1.f12412c;
                            if (Double.doubleToLongBits(hp1Var.b1(qn1Var, j)) != Double.doubleToLongBits(hp1Var.b1(qn1Var2, j))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!q(qn1Var, qn1Var2, i4)) {
                            break;
                        } else {
                            hp1 hp1Var2 = ip1.f12412c;
                            if (Float.floatToIntBits(hp1Var2.Z0(qn1Var, j)) != Float.floatToIntBits(hp1Var2.Z0(qn1Var2, j))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.i(qn1Var, j) != ip1.i(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.i(qn1Var, j) != ip1.i(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.g(qn1Var, j) != ip1.g(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.i(qn1Var, j) != ip1.i(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.g(qn1Var, j) != ip1.g(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!q(qn1Var, qn1Var2, i4)) {
                            break;
                        } else {
                            hp1 hp1Var3 = ip1.f12412c;
                            if (hp1Var3.I(qn1Var, j) != hp1Var3.I(qn1Var2, j)) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (!q(qn1Var, qn1Var2, i4) || !yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (!q(qn1Var, qn1Var2, i4) || !yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (!q(qn1Var, qn1Var2, i4) || !yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.g(qn1Var, j) != ip1.g(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.g(qn1Var, j) != ip1.g(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.g(qn1Var, j) != ip1.g(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.i(qn1Var, j) != ip1.i(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.g(qn1Var, j) != ip1.g(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (!q(qn1Var, qn1Var2, i4) || ip1.i(qn1Var, j) != ip1.i(qn1Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (!q(qn1Var, qn1Var2, i4) || !yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    case 37:
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                    case 42:
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zC = yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        zC = yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j8 = iArr[i4 + 2] & 1048575;
                        if (ip1.g(qn1Var, j8) != ip1.g(qn1Var2, j8) || !yo1.c(ip1.k(qn1Var, j), ip1.k(qn1Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    default:
                        i4 += 3;
                }
                if (zC) {
                    i4 += 3;
                }
            } else if (qn1Var.zzt.equals(qn1Var2.zzt)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final boolean f(Object obj) {
        int i4;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f13983h) {
            int i15 = this.g[i13];
            int[] iArr = this.f13977a;
            int i16 = iArr[i15];
            int iK = k(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f13976l.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i4 = i18;
            } else {
                int i20 = i12;
                i4 = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & iK) == 0 || r(obj, i10, i4, i11, i19)) {
                int iL = l(iK);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!u(i16, i10, obj) || D(i10).f(ip1.k(obj, iK & 1048575))) {
                                i13++;
                                i14 = i4;
                                i12 = i11;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                ho1 ho1Var = (ho1) ip1.k(obj, iK & 1048575);
                                if (!ho1Var.isEmpty() && ((lp1) ((go1) E(i10)).f11569a.f9423c).f13578a == mp1.f13992i) {
                                    xo1 xo1VarA = null;
                                    for (Object obj2 : ho1Var.values()) {
                                        if (xo1VarA == null) {
                                            xo1VarA = ro1.f15723c.a(obj2.getClass());
                                        }
                                        if (!xo1VarA.f(obj2)) {
                                        }
                                    }
                                }
                            }
                            i13++;
                            i14 = i4;
                            i12 = i11;
                        }
                    }
                    List list = (List) ip1.k(obj, iK & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        xo1 xo1VarD = D(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (xo1VarD.f(list.get(i21))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i4;
                    i12 = i11;
                } else if (!r(obj, i10, i4, i11, i19) || D(i10).f(ip1.k(obj, iK & 1048575))) {
                    i13++;
                    i14 = i4;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x068f A[PHI: r21 r22
  0x068f: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:272:0x0837, B:268:0x0817, B:251:0x0797, B:237:0x072e, B:233:0x070e, B:229:0x06f0, B:222:0x06b0, B:216:0x068d] A[DONT_GENERATE, DONT_INLINE]
  0x068f: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:272:0x0837, B:268:0x0817, B:251:0x0797, B:237:0x072e, B:233:0x070e, B:229:0x06f0, B:222:0x06b0, B:216:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07d9 A[PHI: r21 r22
  0x07d9: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:276:0x0857, B:261:0x07d7] A[DONT_GENERATE, DONT_INLINE]
  0x07d9: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:276:0x0857, B:261:0x07d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0384 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.xo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.qn1 r29) throws com.google.android.gms.internal.ads.jp1 {
        /*
            Method dump skipped, instructions count: 2852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.g(com.google.android.gms.internal.ads.qn1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x031f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.xo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r28, com.google.android.gms.internal.ads.rg0 r29) throws com.google.android.gms.internal.ads.jp1 {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.h(java.lang.Object, com.google.android.gms.internal.ads.rg0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.xo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.google.android.gms.internal.ads.qn1 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.i(com.google.android.gms.internal.ads.qn1):int");
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final void j(Object obj, byte[] bArr, int i4, int i10, vm1 vm1Var) {
        y(obj, bArr, i4, i10, 0, vm1Var);
    }

    public final int k(int i4) {
        return this.f13977a[i4 + 1];
    }

    public final boolean q(qn1 qn1Var, qn1 qn1Var2, int i4) {
        return s(i4, qn1Var) == s(i4, qn1Var2);
    }

    public final boolean r(Object obj, int i4, int i10, int i11, int i12) {
        return i10 == 1048575 ? s(i4, obj) : (i11 & i12) != 0;
    }

    public final boolean s(int i4, Object obj) {
        int i10 = this.f13977a[i4 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int iK = k(i4);
            long j8 = iK & 1048575;
            switch (l(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(ip1.f12412c.b1(obj, j8)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(ip1.f12412c.Z0(obj, j8)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (ip1.i(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (ip1.i(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (ip1.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (ip1.i(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (ip1.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return ip1.f12412c.I(obj, j8);
                case 8:
                    Object objK = ip1.k(obj, j8);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objK instanceof bn1)) {
                            throw new IllegalArgumentException();
                        }
                        if (bn1.f9729b.equals(objK)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (ip1.k(obj, j8) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (bn1.f9729b.equals(ip1.k(obj, j8))) {
                        return false;
                    }
                    break;
                case 11:
                    if (ip1.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (ip1.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (ip1.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (ip1.i(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (ip1.g(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (ip1.i(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (ip1.k(obj, j8) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & ip1.g(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i4, Object obj) {
        int i10 = this.f13977a[i4 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        ip1.h(j, obj, (1 << (i10 >>> 20)) | ip1.g(obj, j));
    }

    public final boolean u(int i4, int i10, Object obj) {
        return ip1.g(obj, (long) (this.f13977a[i10 + 2] & 1048575)) == i4;
    }

    public final void v(int i4, int i10, Object obj) {
        ip1.h(this.f13977a[i10 + 2] & 1048575, obj, i4);
    }

    public final int w(int i4, int i10) {
        int[] iArr = this.f13977a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        r5 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        r3 = r9;
        r8 = r10;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        r9 = r12;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0b26, code lost:
    
        throw new com.google.android.gms.internal.ads.ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0dbc A[PHI: r0 r4 r8 r10 r11 r19 r26
  0x0dbc: PHI (r0v32 int) = 
  (r0v11 int)
  (r0v12 int)
  (r0v13 int)
  (r0v14 int)
  (r0v15 int)
  (r0v16 int)
  (r0v17 int)
  (r0v18 int)
  (r0v24 int)
  (r0v33 int)
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
  0x0dbc: PHI (r4v185 byte[]) = 
  (r4v159 byte[])
  (r4v160 byte[])
  (r4v161 byte[])
  (r4v162 byte[])
  (r4v163 byte[])
  (r4v164 byte[])
  (r4v165 byte[])
  (r4v166 byte[])
  (r4v175 byte[])
  (r4v186 byte[])
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
  0x0dbc: PHI (r8v96 com.google.android.gms.internal.ads.dp1) = 
  (r8v71 com.google.android.gms.internal.ads.dp1)
  (r8v72 com.google.android.gms.internal.ads.dp1)
  (r8v73 com.google.android.gms.internal.ads.dp1)
  (r8v74 com.google.android.gms.internal.ads.dp1)
  (r8v75 com.google.android.gms.internal.ads.dp1)
  (r8v76 com.google.android.gms.internal.ads.dp1)
  (r8v77 com.google.android.gms.internal.ads.dp1)
  (r8v78 com.google.android.gms.internal.ads.dp1)
  (r8v88 com.google.android.gms.internal.ads.dp1)
  (r8v97 com.google.android.gms.internal.ads.dp1)
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
  0x0dbc: PHI (r10v50 com.google.android.gms.internal.ads.vm1) = 
  (r10v38 com.google.android.gms.internal.ads.vm1)
  (r10v39 com.google.android.gms.internal.ads.vm1)
  (r10v40 com.google.android.gms.internal.ads.vm1)
  (r10v41 com.google.android.gms.internal.ads.vm1)
  (r10v42 com.google.android.gms.internal.ads.vm1)
  (r10v43 com.google.android.gms.internal.ads.vm1)
  (r10v44 com.google.android.gms.internal.ads.vm1)
  (r10v45 com.google.android.gms.internal.ads.vm1)
  (r10v47 com.google.android.gms.internal.ads.vm1)
  (r10v51 com.google.android.gms.internal.ads.vm1)
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
  0x0dbc: PHI (r11v104 int) = 
  (r11v82 int)
  (r11v83 int)
  (r11v84 int)
  (r11v85 int)
  (r11v86 int)
  (r11v87 int)
  (r11v88 int)
  (r11v89 int)
  (r11v96 int)
  (r11v105 int)
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
  0x0dbc: PHI (r19v44 int) = 
  (r19v25 int)
  (r19v26 int)
  (r19v27 int)
  (r19v28 int)
  (r19v29 int)
  (r19v30 int)
  (r19v31 int)
  (r19v32 int)
  (r19v37 int)
  (r19v45 int)
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
  0x0dbc: PHI (r26v67 java.lang.String) = 
  (r26v44 java.lang.String)
  (r26v45 java.lang.String)
  (r26v46 java.lang.String)
  (r26v47 java.lang.String)
  (r26v48 java.lang.String)
  (r26v49 java.lang.String)
  (r26v50 java.lang.String)
  (r26v51 java.lang.String)
  (r26v58 java.lang.String)
  (r26v68 java.lang.String)
 binds: [B:544:0x0da5, B:541:0x0d80, B:538:0x0d5f, B:535:0x0d3e, B:532:0x0d1d, B:529:0x0cfb, B:522:0x0cd0, B:508:0x0c8e, B:481:0x0bc1, B:469:0x0b5f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0dbf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:661:0x09e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0dd3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.vm1 r40) {
        /*
            Method dump skipped, instructions count: 3836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mo1.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.vm1):int");
    }
}
