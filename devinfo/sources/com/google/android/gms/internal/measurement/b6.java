package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.vm1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b6 implements i6 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f19622k = r6.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19623a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19625c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19626d;

    /* renamed from: e, reason: collision with root package name */
    public final s4 f19627e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f19628f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19629h;

    /* renamed from: i, reason: collision with root package name */
    public final e5 f19630i;

    public b6(int[] iArr, Object[] objArr, int i4, int i10, s4 s4Var, int[] iArr2, int i11, int i12, e5 e5Var, e5 e5Var2) {
        this.f19623a = iArr;
        this.f19624b = objArr;
        this.f19625c = i4;
        this.f19626d = i10;
        this.f19628f = iArr2;
        this.g = i11;
        this.f19629h = i12;
        this.f19630i = e5Var;
        this.f19627e = s4Var;
    }

    public static int F(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof g5) {
            return ((g5) obj).e();
        }
        return true;
    }

    public static int k(Object obj, long j8) {
        return ((Integer) r6.j(obj, j8)).intValue();
    }

    public static long l(Object obj, long j8) {
        return ((Long) r6.j(obj, j8)).longValue();
    }

    public static final int s(byte[] bArr, int i4, int i10, u6 u6Var, Class cls, vm1 vm1Var) throws p5 {
        u6 u6Var2 = u6.f19952c;
        switch (u6Var.ordinal()) {
            case 0:
                int i11 = i4 + 8;
                vm1Var.f17658c = Double.valueOf(Double.longBitsToDouble(com.bumptech.glide.e.a0(i4, bArr)));
                return i11;
            case 1:
                int i12 = i4 + 4;
                vm1Var.f17658c = Float.valueOf(Float.intBitsToFloat(com.bumptech.glide.e.Z(i4, bArr)));
                return i12;
            case 2:
            case 3:
                int iY = com.bumptech.glide.e.Y(bArr, i4, vm1Var);
                vm1Var.f17658c = Long.valueOf(vm1Var.f17657b);
                return iY;
            case 4:
            case 12:
            case 13:
                int iU = com.bumptech.glide.e.U(bArr, i4, vm1Var);
                vm1Var.f17658c = Integer.valueOf(vm1Var.f17656a);
                return iU;
            case 5:
            case 15:
                int i13 = i4 + 8;
                vm1Var.f17658c = Long.valueOf(com.bumptech.glide.e.a0(i4, bArr));
                return i13;
            case 6:
            case 14:
                int i14 = i4 + 4;
                vm1Var.f17658c = Integer.valueOf(com.bumptech.glide.e.Z(i4, bArr));
                return i14;
            case 7:
                int iY2 = com.bumptech.glide.e.Y(bArr, i4, vm1Var);
                vm1Var.f17658c = Boolean.valueOf(vm1Var.f17657b != 0);
                return iY2;
            case 8:
                return com.bumptech.glide.e.b0(bArr, i4, vm1Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                i6 i6VarA = f6.f19741c.a(cls);
                g5 g5VarB = i6VarA.b();
                int iD0 = com.bumptech.glide.e.d0(g5VarB, i6VarA, bArr, i4, i10, vm1Var);
                i6VarA.g(g5VarB);
                vm1Var.f17658c = g5VarB;
                return iD0;
            case 11:
                return com.bumptech.glide.e.c0(bArr, i4, vm1Var);
            case 16:
                int iU2 = com.bumptech.glide.e.U(bArr, i4, vm1Var);
                vm1Var.f17658c = Integer.valueOf(z3.z(vm1Var.f17656a));
                return iU2;
            case 17:
                int iY3 = com.bumptech.glide.e.Y(bArr, i4, vm1Var);
                vm1Var.f17658c = Long.valueOf(z3.A(vm1Var.f17657b));
                return iY3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.b6 u(com.google.android.gms.internal.measurement.h6 r36, com.google.android.gms.internal.measurement.e5 r37, com.google.android.gms.internal.measurement.e5 r38) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.u(com.google.android.gms.internal.measurement.h6, com.google.android.gms.internal.measurement.e5, com.google.android.gms.internal.measurement.e5):com.google.android.gms.internal.measurement.b6");
    }

    public static Field v(Class cls, String str) {
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

    public final Object A(int i4, Object obj) {
        i6 i6VarY = y(i4);
        int iE = E(i4) & 1048575;
        if (!o(i4, obj)) {
            return i6VarY.b();
        }
        Object object = f19622k.getObject(obj, iE);
        if (j(object)) {
            return object;
        }
        g5 g5VarB = i6VarY.b();
        if (object != null) {
            i6VarY.c(g5VarB, object);
        }
        return g5VarB;
    }

    public final void B(int i4, Object obj, Object obj2) {
        f19622k.putObject(obj, E(i4) & 1048575, obj2);
        p(i4, obj);
    }

    public final Object C(int i4, int i10, Object obj) {
        i6 i6VarY = y(i10);
        if (!q(i4, i10, obj)) {
            return i6VarY.b();
        }
        Object object = f19622k.getObject(obj, E(i10) & 1048575);
        if (j(object)) {
            return object;
        }
        g5 g5VarB = i6VarY.b();
        if (object != null) {
            i6VarY.c(g5VarB, object);
        }
        return g5VarB;
    }

    public final void D(Object obj, int i4, Object obj2, int i10) {
        f19622k.putObject(obj, E(i10) & 1048575, obj2);
        r6.g(this.f19623a[i10 + 2] & 1048575, obj, i4);
    }

    public final int E(int i4) {
        return this.f19623a[i4 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final boolean a(Object obj) {
        int i4;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.g) {
            int i15 = this.f19628f[i13];
            int[] iArr = this.f19623a;
            int i16 = iArr[i15];
            int iE = E(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f19622k.getInt(obj, i18);
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
            if ((268435456 & iE) == 0 || n(obj, i10, i4, i11, i19)) {
                int iF = F(iE);
                if (iF != 9 && iF != 17) {
                    if (iF != 27) {
                        if (iF == 60 || iF == 68) {
                            if (!q(i16, i10, obj) || y(i10).a(r6.j(obj, iE & 1048575))) {
                                i13++;
                                i14 = i4;
                                i12 = i11;
                            }
                        } else if (iF != 49) {
                            if (iF != 50) {
                                continue;
                            } else {
                                x5 x5Var = (x5) r6.j(obj, iE & 1048575);
                                if (x5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i10 / 3;
                                    if (((u6) ((w5) this.f19624b[i21 + i21]).f20022a.f19930b).f19955a == v6.f19978i) {
                                        i6 i6VarA = null;
                                        for (Object obj2 : x5Var.values()) {
                                            if (i6VarA == null) {
                                                i6VarA = f6.f19741c.a(obj2.getClass());
                                            }
                                            if (!i6VarA.a(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i13++;
                            i14 = i4;
                            i12 = i11;
                        }
                    }
                    List list = (List) r6.j(obj, iE & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        i6 i6VarY = y(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (i6VarY.a(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i4;
                    i12 = i11;
                } else if (!n(obj, i10, i4, i11, i19) || y(i10).a(r6.j(obj, iE & 1048575))) {
                    i13++;
                    i14 = i4;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final g5 b() {
        return (g5) ((g5) this.f19627e).o(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.measurement.i6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f7  */
    @Override // com.google.android.gms.internal.measurement.i6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.measurement.s4 r17) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.d(com.google.android.gms.internal.measurement.s4):int");
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final void e(Object obj, v5 v5Var) {
        int i4;
        b6 b6Var = this;
        Unsafe unsafe = f19622k;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = b6Var.f19623a;
            if (i11 >= iArr.length) {
                ((g5) obj).zzc.b(v5Var);
                return;
            }
            int iE = b6Var.E(i11);
            int iF = F(iE);
            int i14 = iArr[i11];
            if (iF <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i10;
                if (i16 != i13) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i13 = i16;
                }
                i4 = 1 << (i15 >>> 20);
            } else {
                i4 = 0;
            }
            long j8 = iE & i10;
            switch (iF) {
                case 0:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).X(i14, Double.doubleToRawLongBits(r6.f19897c.f(obj, j8)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).V(i14, Float.floatToRawIntBits(r6.f19897c.d(obj, j8)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).W(i14, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).W(i14, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).T(i14, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).X(i14, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).V(i14, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        boolean zB = r6.f19897c.b(obj, j8);
                        y4 y4Var = (y4) v5Var.f19970a;
                        y4Var.b0(i14 << 3);
                        y4Var.Z(zB ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof String) {
                            y4 y4Var2 = (y4) v5Var.f19970a;
                            y4Var2.b0((i14 << 3) | 2);
                            y4Var2.g0((String) object);
                            break;
                        } else {
                            y4 y4Var3 = (y4) v5Var.f19970a;
                            y4Var3.b0((i14 << 3) | 2);
                            y4Var3.Y((x4) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        v5Var.b(i14, unsafe.getObject(obj, j8), b6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        x4 x4Var = (x4) unsafe.getObject(obj, j8);
                        y4 y4Var4 = (y4) v5Var.f19970a;
                        y4Var4.b0((i14 << 3) | 2);
                        y4Var4.Y(x4Var);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).U(i14, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).T(i14, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).V(i14, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        ((y4) v5Var.f19970a).X(i14, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        int i17 = unsafe.getInt(obj, j8);
                        ((y4) v5Var.f19970a).U(i14, (i17 >> 31) ^ (i17 + i17));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        long j9 = unsafe.getLong(obj, j8);
                        ((y4) v5Var.f19970a).W(i14, (j9 >> 63) ^ (j9 + j9));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (b6Var.n(obj, i11, i13, i12, i4)) {
                        v5Var.c(i14, unsafe.getObject(obj, j8), b6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j6.c(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 19:
                    j6.d(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 20:
                    j6.e(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 21:
                    j6.f(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 22:
                    j6.j(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 23:
                    j6.h(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 24:
                    j6.m(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 25:
                    j6.p(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 26:
                    int i18 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j8);
                    e5 e5Var = j6.f19789a;
                    if (list != null && !list.isEmpty()) {
                        v5Var.getClass();
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            y4 y4Var5 = (y4) v5Var.f19970a;
                            String str = (String) list.get(i19);
                            y4Var5.b0((i18 << 3) | 2);
                            y4Var5.g0(str);
                        }
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i20 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    i6 i6VarY = b6Var.y(i11);
                    e5 e5Var2 = j6.f19789a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            v5Var.b(i20, list2.get(i21), i6VarY);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i22 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    e5 e5Var3 = j6.f19789a;
                    if (list3 != null && !list3.isEmpty()) {
                        v5Var.getClass();
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            y4 y4Var6 = (y4) v5Var.f19970a;
                            x4 x4Var2 = (x4) list3.get(i23);
                            y4Var6.b0((i22 << 3) | 2);
                            y4Var6.Y(x4Var2);
                        }
                        break;
                    } else {
                        break;
                    }
                case 29:
                    j6.k(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 30:
                    j6.o(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 31:
                    j6.n(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 32:
                    j6.i(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 33:
                    j6.l(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 34:
                    j6.g(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, false);
                    break;
                case 35:
                    j6.c(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    j6.d(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 37:
                    j6.e(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    j6.f(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                    j6.j(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                    j6.h(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                    j6.m(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 42:
                    j6.p(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                    j6.k(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                    j6.o(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 45:
                    j6.n(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 46:
                    j6.i(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 47:
                    j6.l(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 48:
                    j6.g(iArr[i11], (List) unsafe.getObject(obj, j8), v5Var, true);
                    break;
                case 49:
                    int i24 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    i6 i6VarY2 = b6Var.y(i11);
                    e5 e5Var4 = j6.f19789a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i25 = 0; i25 < list4.size(); i25++) {
                            v5Var.c(i24, list4.get(i25), i6VarY2);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j8);
                    if (object2 != null) {
                        int i26 = i11 / 3;
                        t tVar = ((w5) b6Var.f19624b[i26 + i26]).f20022a;
                        v5Var.getClass();
                        for (Map.Entry entry : ((x5) object2).entrySet()) {
                            y4 y4Var7 = (y4) v5Var.f19970a;
                            y4Var7.S(i14, 2);
                            y4Var7.b0(w5.b(tVar, entry.getKey(), entry.getValue()));
                            w5.a(y4Var7, tVar, entry.getKey(), entry.getValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).X(i14, Double.doubleToRawLongBits(((Double) r6.j(obj, j8)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).V(i14, Float.floatToRawIntBits(((Float) r6.j(obj, j8)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).W(i14, l(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).W(i14, l(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).T(i14, k(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).X(i14, l(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).V(i14, k(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (b6Var.q(i14, i11, obj)) {
                        boolean zBooleanValue = ((Boolean) r6.j(obj, j8)).booleanValue();
                        y4 y4Var8 = (y4) v5Var.f19970a;
                        y4Var8.b0(i14 << 3);
                        y4Var8.Z(zBooleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (b6Var.q(i14, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j8);
                        if (object3 instanceof String) {
                            y4 y4Var9 = (y4) v5Var.f19970a;
                            y4Var9.b0((i14 << 3) | 2);
                            y4Var9.g0((String) object3);
                            break;
                        } else {
                            y4 y4Var10 = (y4) v5Var.f19970a;
                            y4Var10.b0((i14 << 3) | 2);
                            y4Var10.Y((x4) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (b6Var.q(i14, i11, obj)) {
                        v5Var.b(i14, unsafe.getObject(obj, j8), b6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (b6Var.q(i14, i11, obj)) {
                        x4 x4Var3 = (x4) unsafe.getObject(obj, j8);
                        y4 y4Var11 = (y4) v5Var.f19970a;
                        y4Var11.b0((i14 << 3) | 2);
                        y4Var11.Y(x4Var3);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).U(i14, k(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).T(i14, k(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).V(i14, k(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (b6Var.q(i14, i11, obj)) {
                        ((y4) v5Var.f19970a).X(i14, l(obj, j8));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (b6Var.q(i14, i11, obj)) {
                        int iK = k(obj, j8);
                        ((y4) v5Var.f19970a).U(i14, (iK >> 31) ^ (iK + iK));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (b6Var.q(i14, i11, obj)) {
                        long jL = l(obj, j8);
                        ((y4) v5Var.f19970a).W(i14, (jL >> 63) ^ (jL + jL));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (b6Var.q(i14, i11, obj)) {
                        v5Var.c(i14, unsafe.getObject(obj, j8), b6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
            }
            i11 += 3;
            i10 = 1048575;
            b6Var = this;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final boolean f(g5 g5Var, g5 g5Var2) {
        boolean zA;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f19623a;
            if (i4 < iArr.length) {
                int iE = E(i4);
                long j8 = iE & 1048575;
                switch (F(iE)) {
                    case 0:
                        if (!m(g5Var, g5Var2, i4)) {
                            break;
                        } else {
                            q6 q6Var = r6.f19897c;
                            if (Double.doubleToLongBits(q6Var.f(g5Var, j8)) != Double.doubleToLongBits(q6Var.f(g5Var2, j8))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!m(g5Var, g5Var2, i4)) {
                            break;
                        } else {
                            q6 q6Var2 = r6.f19897c;
                            if (Float.floatToIntBits(q6Var2.d(g5Var, j8)) != Float.floatToIntBits(q6Var2.d(g5Var2, j8))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (!m(g5Var, g5Var2, i4) || r6.h(g5Var, j8) != r6.h(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (!m(g5Var, g5Var2, i4) || r6.h(g5Var, j8) != r6.h(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (!m(g5Var, g5Var2, i4) || r6.f(g5Var, j8) != r6.f(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (!m(g5Var, g5Var2, i4) || r6.h(g5Var, j8) != r6.h(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (!m(g5Var, g5Var2, i4) || r6.f(g5Var, j8) != r6.f(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!m(g5Var, g5Var2, i4)) {
                            break;
                        } else {
                            q6 q6Var3 = r6.f19897c;
                            if (q6Var3.b(g5Var, j8) != q6Var3.b(g5Var2, j8)) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (!m(g5Var, g5Var2, i4) || !j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (!m(g5Var, g5Var2, i4) || !j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (!m(g5Var, g5Var2, i4) || !j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (!m(g5Var, g5Var2, i4) || r6.f(g5Var, j8) != r6.f(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (!m(g5Var, g5Var2, i4) || r6.f(g5Var, j8) != r6.f(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (!m(g5Var, g5Var2, i4) || r6.f(g5Var, j8) != r6.f(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (!m(g5Var, g5Var2, i4) || r6.h(g5Var, j8) != r6.h(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (!m(g5Var, g5Var2, i4) || r6.f(g5Var, j8) != r6.f(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (!m(g5Var, g5Var2, i4) || r6.h(g5Var, j8) != r6.h(g5Var2, j8)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (!m(g5Var, g5Var2, i4) || !j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8))) {
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
                        zA = j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        zA = j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8));
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
                        if (r6.f(g5Var, j9) != r6.f(g5Var2, j9) || !j6.a(r6.j(g5Var, j8), r6.j(g5Var2, j8))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    default:
                        i4 += 3;
                }
                if (zA) {
                    i4 += 3;
                }
            } else if (g5Var.zzc.equals(g5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.measurement.i6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = j(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.g5
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.measurement.g5 r0 = (com.google.android.gms.internal.measurement.g5) r0
            r0.j()
            r0.zza = r1
            r0.f()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f19623a
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.E(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = F(r3)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.b6.f19622k
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.measurement.x5 r6 = (com.google.android.gms.internal.measurement.x5) r6
            r6.f20035a = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.r6.j(r8, r4)
            com.google.android.gms.internal.measurement.m5 r2 = (com.google.android.gms.internal.measurement.m5) r2
            com.google.android.gms.internal.measurement.t4 r2 = (com.google.android.gms.internal.measurement.t4) r2
            boolean r3 = r2.f19936a
            if (r3 == 0) goto L84
            r2.f19936a = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.q(r2, r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.i6 r2 = r7.y(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.b6.f19622k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.g(r3)
            goto L84
        L71:
            boolean r2 = r7.o(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.i6 r2 = r7.y(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.b6.f19622k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.g(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.measurement.e5 r0 = r7.f19630i
            r0.getClass()
            com.google.android.gms.internal.measurement.g5 r8 = (com.google.android.gms.internal.measurement.g5) r8
            com.google.android.gms.internal.measurement.m6 r8 = r8.zzc
            boolean r0 = r8.f19830e
            if (r0 == 0) goto L96
            r8.f19830e = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.g(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final void h(Object obj, byte[] bArr, int i4, int i10, vm1 vm1Var) {
        t(obj, bArr, i4, i10, 0, vm1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.i6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.google.android.gms.internal.measurement.g5 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.i(com.google.android.gms.internal.measurement.g5):int");
    }

    public final boolean m(g5 g5Var, g5 g5Var2, int i4) {
        return o(i4, g5Var) == o(i4, g5Var2);
    }

    public final boolean n(Object obj, int i4, int i10, int i11, int i12) {
        return i10 == 1048575 ? o(i4, obj) : (i11 & i12) != 0;
    }

    public final boolean o(int i4, Object obj) {
        int i10 = this.f19623a[i4 + 2];
        long j8 = i10 & 1048575;
        if (j8 == 1048575) {
            int iE = E(i4);
            long j9 = iE & 1048575;
            switch (F(iE)) {
                case 0:
                    if (Double.doubleToRawLongBits(r6.f19897c.f(obj, j9)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(r6.f19897c.d(obj, j9)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (r6.h(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r6.h(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r6.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r6.h(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r6.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return r6.f19897c.b(obj, j9);
                case 8:
                    Object objJ = r6.j(obj, j9);
                    if (objJ instanceof String) {
                        if (((String) objJ).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objJ instanceof x4)) {
                            throw new IllegalArgumentException();
                        }
                        if (x4.f20031c.equals(objJ)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (r6.j(obj, j9) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (x4.f20031c.equals(r6.j(obj, j9))) {
                        return false;
                    }
                    break;
                case 11:
                    if (r6.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r6.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r6.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r6.h(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (r6.f(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r6.h(obj, j9) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r6.j(obj, j9) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & r6.f(obj, j8)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i4, Object obj) {
        int i10 = this.f19623a[i4 + 2];
        long j8 = 1048575 & i10;
        if (j8 == 1048575) {
            return;
        }
        r6.g(j8, obj, (1 << (i10 >>> 20)) | r6.f(obj, j8));
    }

    public final boolean q(int i4, int i10, Object obj) {
        return r6.f(obj, (long) (this.f19623a[i10 + 2] & 1048575)) == i4;
    }

    public final int r(int i4, int i10) {
        int[] iArr = this.f19623a;
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

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0374, code lost:
    
        r4 = r13;
        r7 = r15;
        r8 = r12;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03da, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r6 = r43;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        r4 = r10;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        r10 = r13;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0c88, code lost:
    
        throw new com.google.android.gms.internal.measurement.p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0f68 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0f7c  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0b3e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0f4a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0b51 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0f5f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.ads.vm1 r45) {
        /*
            Method dump skipped, instructions count: 4420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.vm1):int");
    }

    public final void w(int i4, Object obj, Object obj2) {
        if (o(i4, obj2)) {
            int iE = E(i4) & 1048575;
            Unsafe unsafe = f19622k;
            long j8 = iE;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                int i10 = this.f19623a[i4];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(r5.c.e(i10, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            i6 i6VarY = y(i4);
            if (!o(i4, obj)) {
                if (j(object)) {
                    g5 g5VarB = i6VarY.b();
                    i6VarY.c(g5VarB, object);
                    unsafe.putObject(obj, j8, g5VarB);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                p(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!j(object2)) {
                g5 g5VarB2 = i6VarY.b();
                i6VarY.c(g5VarB2, object2);
                unsafe.putObject(obj, j8, g5VarB2);
                object2 = g5VarB2;
            }
            i6VarY.c(object2, object);
        }
    }

    public final void x(int i4, Object obj, Object obj2) {
        int[] iArr = this.f19623a;
        int i10 = iArr[i4];
        if (q(i10, i4, obj2)) {
            int iE = E(i4) & 1048575;
            Unsafe unsafe = f19622k;
            long j8 = iE;
            Object object = unsafe.getObject(obj2, j8);
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
            i6 i6VarY = y(i4);
            if (!q(i10, i4, obj)) {
                if (j(object)) {
                    g5 g5VarB = i6VarY.b();
                    i6VarY.c(g5VarB, object);
                    unsafe.putObject(obj, j8, g5VarB);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                r6.g(iArr[i4 + 2] & 1048575, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!j(object2)) {
                g5 g5VarB2 = i6VarY.b();
                i6VarY.c(g5VarB2, object2);
                unsafe.putObject(obj, j8, g5VarB2);
                object2 = g5VarB2;
            }
            i6VarY.c(object2, object);
        }
    }

    public final i6 y(int i4) {
        int i10 = i4 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f19624b;
        i6 i6Var = (i6) objArr[i11];
        if (i6Var != null) {
            return i6Var;
        }
        i6 i6VarA = f6.f19741c.a((Class) objArr[i11 + 1]);
        objArr[i11] = i6VarA;
        return i6VarA;
    }

    public final j5 z(int i4) {
        int i10 = i4 / 3;
        return (j5) this.f19624b[i10 + i10 + 1];
    }
}
