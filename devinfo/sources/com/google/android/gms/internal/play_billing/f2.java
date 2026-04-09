package com.google.android.gms.internal.play_billing;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.vm1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f2 implements l2 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f20118k = u2.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f20119a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f20120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20121c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20122d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f20123e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f20124f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20125h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f20126i;

    public f2(int[] iArr, Object[] objArr, int i4, int i10, b1 b1Var, int[] iArr2, int i11, int i12, n1 n1Var, n1 n1Var2) {
        this.f20119a = iArr;
        this.f20120b = objArr;
        this.f20121c = i4;
        this.f20122d = i10;
        this.f20124f = iArr2;
        this.g = i11;
        this.f20125h = i12;
        this.f20126i = n1Var;
        this.f20123e = b1Var;
    }

    public static Field E(Class cls, String str) {
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
            StringBuilder sbO = r5.c.o("Field ", str, " for ", name, " not found. Known fields are ");
            sbO.append(string);
            throw new RuntimeException(sbO.toString(), e2);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof p1) {
            return ((p1) obj).m();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.f2 u(com.google.android.gms.internal.play_billing.k2 r36, com.google.android.gms.internal.play_billing.n1 r37, com.google.android.gms.internal.play_billing.n1 r38) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f2.u(com.google.android.gms.internal.play_billing.k2, com.google.android.gms.internal.play_billing.n1, com.google.android.gms.internal.play_billing.n1):com.google.android.gms.internal.play_billing.f2");
    }

    public static int v(Object obj, long j8) {
        return ((Integer) u2.h(obj, j8)).intValue();
    }

    public static int x(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static long z(Object obj, long j8) {
        return ((Long) u2.h(obj, j8)).longValue();
    }

    public final r1 A(int i4) {
        int i10 = i4 / 3;
        return (r1) this.f20120b[i10 + i10 + 1];
    }

    public final l2 B(int i4) {
        int i10 = i4 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f20120b;
        l2 l2Var = (l2) objArr[i11];
        if (l2Var != null) {
            return l2Var;
        }
        l2 l2VarA = i2.f20149c.a((Class) objArr[i11 + 1]);
        objArr[i11] = l2VarA;
        return l2VarA;
    }

    public final Object C(int i4, Object obj) {
        l2 l2VarB = B(i4);
        int iY = y(i4) & 1048575;
        if (!p(i4, obj)) {
            return l2VarB.c();
        }
        Object object = f20118k.getObject(obj, iY);
        if (r(object)) {
            return object;
        }
        p1 p1VarC = l2VarB.c();
        if (object != null) {
            l2VarB.e(p1VarC, object);
        }
        return p1VarC;
    }

    public final Object D(int i4, int i10, Object obj) {
        l2 l2VarB = B(i10);
        if (!s(i4, i10, obj)) {
            return l2VarB.c();
        }
        Object object = f20118k.getObject(obj, y(i10) & 1048575);
        if (r(object)) {
            return object;
        }
        p1 p1VarC = l2VarB.c();
        if (object != null) {
            l2VarB.e(p1VarC, object);
        }
        return p1VarC;
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final boolean a(Object obj) {
        int i4;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.g) {
            int i15 = this.f20124f[i13];
            int[] iArr = this.f20119a;
            int i16 = iArr[i15];
            int iY = y(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f20118k.getInt(obj, i18);
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
            if ((268435456 & iY) == 0 || q(obj, i10, i4, i11, i19)) {
                int iX = x(iY);
                if (iX != 9 && iX != 17) {
                    if (iX != 27) {
                        if (iX == 60 || iX == 68) {
                            if (!s(i16, i10, obj) || B(i10).a(u2.h(obj, iY & 1048575))) {
                            }
                        } else if (iX != 49) {
                            if (iX == 50 && !((b2) u2.h(obj, iY & 1048575)).isEmpty()) {
                                int i21 = i10 / 3;
                                throw a0.g.h(this.f20120b[i21 + i21]);
                            }
                        }
                        i13++;
                        i14 = i4;
                        i12 = i11;
                    }
                    List list = (List) u2.h(obj, iY & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        l2 l2VarB = B(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (l2VarB.a(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i4;
                    i12 = i11;
                } else if (!q(obj, i10, i4, i11, i19) || B(i10).a(u2.h(obj, iY & 1048575))) {
                    i13++;
                    i14 = i4;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.play_billing.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.p1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.play_billing.p1 r0 = (com.google.android.gms.internal.play_billing.p1) r0
            r0.l()
            r0.zza = r1
            r0.j()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f20119a
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.y(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = x(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L71
            r6 = 60
            if (r3 == r6) goto L5b
            r6 = 68
            if (r3 == r6) goto L5b
            switch(r3) {
                case 17: goto L71;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L84
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.f2.f20118k
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.play_billing.b2 r6 = (com.google.android.gms.internal.play_billing.b2) r6
            r6.f20090a = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.u2.h(r8, r4)
            com.google.android.gms.internal.play_billing.t1 r2 = (com.google.android.gms.internal.play_billing.t1) r2
            com.google.android.gms.internal.play_billing.c1 r2 = (com.google.android.gms.internal.play_billing.c1) r2
            boolean r3 = r2.f20095a
            if (r3 == 0) goto L84
            r2.f20095a = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.s(r2, r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.play_billing.l2 r2 = r7.B(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.play_billing.f2.f20118k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.b(r3)
            goto L84
        L71:
            boolean r2 = r7.p(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.play_billing.l2 r2 = r7.B(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.play_billing.f2.f20118k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.b(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.play_billing.n1 r0 = r7.f20126i
            r0.getClass()
            com.google.android.gms.internal.play_billing.p1 r8 = (com.google.android.gms.internal.play_billing.p1) r8
            com.google.android.gms.internal.play_billing.p2 r8 = r8.zzc
            boolean r0 = r8.f20212e
            if (r0 == 0) goto L96
            r8.f20212e = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f2.b(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final p1 c() {
        return (p1) ((p1) this.f20123e).d(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.play_billing.p1 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f2.d(com.google.android.gms.internal.play_billing.p1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f2.e(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final void f(Object obj, a2 a2Var) throws androidx.datastore.preferences.protobuf.l {
        int i4;
        int i10;
        f2 f2Var = this;
        Unsafe unsafe = f20118k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = f2Var.f20119a;
            if (i12 >= iArr.length) {
                ((p1) obj).zzc.d(a2Var);
                return;
            }
            int iY = f2Var.y(i12);
            int iX = x(iY);
            int i15 = iArr[i12];
            if (iX <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i4 = 1 << (i16 >>> 20);
            } else {
                i4 = 0;
            }
            long j8 = iY & i11;
            switch (iX) {
                case 0:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).c0(i15, Double.doubleToRawLongBits(u2.f20237c.a(obj, j8)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).a0(i15, Float.floatToRawIntBits(u2.f20237c.b(obj, j8)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).k0(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).k0(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).e0(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).c0(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).a0(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        byte bG = u2.f20237c.g(obj, j8);
                        h1 h1Var = (h1) a2Var.f20082a;
                        h1Var.j0(i15 << 3);
                        int i18 = h1Var.f20141e;
                        try {
                            i10 = i18 + 1;
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                        try {
                            h1Var.f20139c[i18] = bG;
                            h1Var.f20141e = i10;
                            break;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                            i18 = i10;
                            throw new androidx.datastore.preferences.protobuf.l(i18, h1Var.f20140d, 1, e, 6);
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof String) {
                            ((h1) a2Var.f20082a).g0(i15, (String) object);
                            break;
                        } else {
                            ((h1) a2Var.f20082a).Z(i15, (g1) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        a2Var.b(i15, unsafe.getObject(obj, j8), f2Var.B(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).Z(i15, (g1) unsafe.getObject(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).i0(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).e0(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).a0(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        ((h1) a2Var.f20082a).c0(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        int i19 = unsafe.getInt(obj, j8);
                        ((h1) a2Var.f20082a).i0(i15, (i19 >> 31) ^ (i19 + i19));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        long j9 = unsafe.getLong(obj, j8);
                        ((h1) a2Var.f20082a).k0(i15, (j9 >> 63) ^ (j9 + j9));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (f2Var.q(obj, i12, i14, i13, i4)) {
                        a2Var.a(i15, unsafe.getObject(obj, j8), f2Var.B(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m2.r(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 19:
                    m2.v(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 20:
                    m2.x(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 21:
                    m2.d(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 22:
                    m2.w(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 23:
                    m2.u(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 24:
                    m2.t(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 25:
                    m2.q(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 26:
                    int i20 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j8);
                    n1 n1Var = m2.f20187a;
                    if (list != null && !list.isEmpty()) {
                        a2Var.getClass();
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            ((h1) a2Var.f20082a).g0(i20, (String) list.get(i21));
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 27:
                    int i22 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    l2 l2VarB = f2Var.B(i12);
                    n1 n1Var2 = m2.f20187a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            a2Var.b(i22, list2.get(i23), l2VarB);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i24 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    n1 n1Var3 = m2.f20187a;
                    if (list3 != null && !list3.isEmpty()) {
                        a2Var.getClass();
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            ((h1) a2Var.f20082a).Z(i24, (g1) list3.get(i25));
                        }
                        break;
                    } else {
                        break;
                    }
                case 29:
                    m2.c(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 30:
                    m2.s(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 31:
                    m2.y(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 32:
                    m2.z(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 33:
                    m2.a(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 34:
                    m2.b(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, false);
                    break;
                case 35:
                    m2.r(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    m2.v(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 37:
                    m2.x(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    m2.d(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                    m2.w(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                    m2.u(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                    m2.t(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 42:
                    m2.q(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                    m2.c(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                    m2.s(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 45:
                    m2.y(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 46:
                    m2.z(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 47:
                    m2.a(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 48:
                    m2.b(iArr[i12], (List) unsafe.getObject(obj, j8), a2Var, true);
                    break;
                case 49:
                    int i26 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    l2 l2VarB2 = f2Var.B(i12);
                    n1 n1Var4 = m2.f20187a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            a2Var.a(i26, list4.get(i27), l2VarB2);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    if (unsafe.getObject(obj, j8) != null) {
                        int i28 = i12 / 3;
                        throw a0.g.h(f2Var.f20120b[i28 + i28]);
                    }
                    break;
                case 51:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).c0(i15, Double.doubleToRawLongBits(((Double) u2.h(obj, j8)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).a0(i15, Float.floatToRawIntBits(((Float) u2.h(obj, j8)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).k0(i15, z(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).k0(i15, z(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).e0(i15, v(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).c0(i15, z(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).a0(i15, v(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (f2Var.s(i15, i12, obj)) {
                        byte bBooleanValue = ((Boolean) u2.h(obj, j8)).booleanValue();
                        h1 h1Var2 = (h1) a2Var.f20082a;
                        h1Var2.j0(i15 << 3);
                        int i29 = h1Var2.f20141e;
                        try {
                            int i30 = i29 + 1;
                            try {
                                h1Var2.f20139c[i29] = bBooleanValue;
                                h1Var2.f20141e = i30;
                                break;
                            } catch (IndexOutOfBoundsException e11) {
                                e = e11;
                                i29 = i30;
                                throw new androidx.datastore.preferences.protobuf.l(i29, h1Var2.f20140d, 1, e, 6);
                            }
                        } catch (IndexOutOfBoundsException e12) {
                            e = e12;
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (f2Var.s(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof String) {
                            ((h1) a2Var.f20082a).g0(i15, (String) object2);
                            break;
                        } else {
                            ((h1) a2Var.f20082a).Z(i15, (g1) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (f2Var.s(i15, i12, obj)) {
                        a2Var.b(i15, unsafe.getObject(obj, j8), f2Var.B(i12));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).Z(i15, (g1) unsafe.getObject(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).i0(i15, v(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).e0(i15, v(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).a0(i15, v(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (f2Var.s(i15, i12, obj)) {
                        ((h1) a2Var.f20082a).c0(i15, z(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (f2Var.s(i15, i12, obj)) {
                        int iV = v(obj, j8);
                        ((h1) a2Var.f20082a).i0(i15, (iV >> 31) ^ (iV + iV));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (f2Var.s(i15, i12, obj)) {
                        long jZ = z(obj, j8);
                        ((h1) a2Var.f20082a).k0(i15, (jZ >> 63) ^ (jZ + jZ));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (f2Var.s(i15, i12, obj)) {
                        a2Var.a(i15, unsafe.getObject(obj, j8), f2Var.B(i12));
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
            i11 = 1048575;
            f2Var = this;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final void g(Object obj, byte[] bArr, int i4, int i10, vm1 vm1Var) {
        t(obj, bArr, i4, i10, 0, vm1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04dc  */
    @Override // com.google.android.gms.internal.play_billing.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(com.google.android.gms.internal.play_billing.b1 r17) {
        /*
            Method dump skipped, instructions count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f2.h(com.google.android.gms.internal.play_billing.b1):int");
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final boolean i(p1 p1Var, p1 p1Var2) {
        boolean zE;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f20119a;
            if (i4 < iArr.length) {
                int iY = y(i4);
                long j8 = iY & 1048575;
                switch (x(iY)) {
                    case 0:
                        if (!o(p1Var, p1Var2, i4)) {
                            break;
                        } else {
                            t2 t2Var = u2.f20237c;
                            if (Double.doubleToLongBits(t2Var.a(p1Var, j8)) != Double.doubleToLongBits(t2Var.a(p1Var2, j8))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!o(p1Var, p1Var2, i4)) {
                            break;
                        } else {
                            t2 t2Var2 = u2.f20237c;
                            if (Float.floatToIntBits(t2Var2.b(p1Var, j8)) != Float.floatToIntBits(t2Var2.b(p1Var2, j8))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (!o(p1Var, p1Var2, i4) || u2.f(p1Var, j8) != u2.f(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (!o(p1Var, p1Var2, i4) || u2.f(p1Var, j8) != u2.f(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (!o(p1Var, p1Var2, i4) || u2.e(p1Var, j8) != u2.e(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (!o(p1Var, p1Var2, i4) || u2.f(p1Var, j8) != u2.f(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (!o(p1Var, p1Var2, i4) || u2.e(p1Var, j8) != u2.e(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!o(p1Var, p1Var2, i4)) {
                            break;
                        } else {
                            t2 t2Var3 = u2.f20237c;
                            if (t2Var3.g(p1Var, j8) != t2Var3.g(p1Var2, j8)) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (!o(p1Var, p1Var2, i4) || !m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (!o(p1Var, p1Var2, i4) || !m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (!o(p1Var, p1Var2, i4) || !m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (!o(p1Var, p1Var2, i4) || u2.e(p1Var, j8) != u2.e(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (!o(p1Var, p1Var2, i4) || u2.e(p1Var, j8) != u2.e(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (!o(p1Var, p1Var2, i4) || u2.e(p1Var, j8) != u2.e(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (!o(p1Var, p1Var2, i4) || u2.f(p1Var, j8) != u2.f(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (!o(p1Var, p1Var2, i4) || u2.e(p1Var, j8) != u2.e(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (!o(p1Var, p1Var2, i4) || u2.f(p1Var, j8) != u2.f(p1Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (!o(p1Var, p1Var2, i4) || !m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8))) {
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
                        zE = m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        zE = m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8));
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
                        long j9 = iArr[i4 + 2] & 1048575;
                        if (u2.e(p1Var, j9) != u2.e(p1Var2, j9) || !m2.e(u2.h(p1Var, j8), u2.h(p1Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    default:
                        i4 += 3;
                }
                if (zE) {
                    i4 += 3;
                }
            } else if (p1Var.zzc.equals(p1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i4, Object obj, Object obj2) {
        if (p(i4, obj2)) {
            int iY = y(i4) & 1048575;
            Unsafe unsafe = f20118k;
            long j8 = iY;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f20119a[i4] + " is present but null: " + obj2.toString());
            }
            l2 l2VarB = B(i4);
            if (!p(i4, obj)) {
                if (r(object)) {
                    p1 p1VarC = l2VarB.c();
                    l2VarB.e(p1VarC, object);
                    unsafe.putObject(obj, j8, p1VarC);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                l(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!r(object2)) {
                p1 p1VarC2 = l2VarB.c();
                l2VarB.e(p1VarC2, object2);
                unsafe.putObject(obj, j8, p1VarC2);
                object2 = p1VarC2;
            }
            l2VarB.e(object2, object);
        }
    }

    public final void k(int i4, Object obj, Object obj2) {
        int[] iArr = this.f20119a;
        int i10 = iArr[i4];
        if (s(i10, i4, obj2)) {
            int iY = y(i4) & 1048575;
            Unsafe unsafe = f20118k;
            long j8 = iY;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
            }
            l2 l2VarB = B(i4);
            if (!s(i10, i4, obj)) {
                if (r(object)) {
                    p1 p1VarC = l2VarB.c();
                    l2VarB.e(p1VarC, object);
                    unsafe.putObject(obj, j8, p1VarC);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                u2.j(iArr[i4 + 2] & 1048575, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!r(object2)) {
                p1 p1VarC2 = l2VarB.c();
                l2VarB.e(p1VarC2, object2);
                unsafe.putObject(obj, j8, p1VarC2);
                object2 = p1VarC2;
            }
            l2VarB.e(object2, object);
        }
    }

    public final void l(int i4, Object obj) {
        int i10 = this.f20119a[i4 + 2];
        long j8 = 1048575 & i10;
        if (j8 == 1048575) {
            return;
        }
        u2.j(j8, obj, (1 << (i10 >>> 20)) | u2.e(obj, j8));
    }

    public final void m(int i4, Object obj, Object obj2) {
        f20118k.putObject(obj, y(i4) & 1048575, obj2);
        l(i4, obj);
    }

    public final void n(Object obj, int i4, Object obj2, int i10) {
        f20118k.putObject(obj, y(i10) & 1048575, obj2);
        u2.j(this.f20119a[i10 + 2] & 1048575, obj, i4);
    }

    public final boolean o(p1 p1Var, p1 p1Var2, int i4) {
        return p(i4, p1Var) == p(i4, p1Var2);
    }

    public final boolean p(int i4, Object obj) {
        int i10 = this.f20119a[i4 + 2];
        long j8 = i10 & 1048575;
        if (j8 == 1048575) {
            int iY = y(i4);
            long j9 = iY & 1048575;
            switch (x(iY)) {
                case 0:
                    if (Double.doubleToRawLongBits(u2.f20237c.a(obj, j9)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(u2.f20237c.b(obj, j9)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (u2.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (u2.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (u2.e(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (u2.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (u2.e(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return u2.f20237c.g(obj, j9);
                case 8:
                    Object objH = u2.h(obj, j9);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof g1)) {
                            throw new IllegalArgumentException();
                        }
                        if (g1.f20131c.equals(objH)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (u2.h(obj, j9) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (g1.f20131c.equals(u2.h(obj, j9))) {
                        return false;
                    }
                    break;
                case 11:
                    if (u2.e(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (u2.e(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (u2.e(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (u2.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (u2.e(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (u2.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (u2.h(obj, j9) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & u2.e(obj, j8)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i4, int i10, int i11, int i12) {
        return i10 == 1048575 ? p(i4, obj) : (i11 & i12) != 0;
    }

    public final boolean s(int i4, int i10, Object obj) {
        return u2.e(obj, (long) (this.f20119a[i10 + 2] & 1048575)) == i4;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.ads.vm1 r43) {
        /*
            Method dump skipped, instructions count: 4004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f2.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.vm1):int");
    }

    public final int w(int i4, int i10) {
        int[] iArr = this.f20119a;
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

    public final int y(int i4) {
        return this.f20119a[i4 + 1];
    }
}
