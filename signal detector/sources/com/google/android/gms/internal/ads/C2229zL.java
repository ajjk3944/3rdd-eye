package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import o4.AbstractC2763b;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.zL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2229zL implements JL {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f17860k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f17861l = WL.o();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f17862a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f17863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17865d;

    /* renamed from: e, reason: collision with root package name */
    public final FK f17866e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17867f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f17868g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17869h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C1994v2 f17870j;

    public C2229zL(int[] iArr, Object[] objArr, int i, int i3, FK fk, int[] iArr2, int i6, int i7, C1994v2 c1994v2, ZJ zj) {
        this.f17862a = iArr;
        this.f17863b = objArr;
        this.f17864c = i;
        this.f17865d = i3;
        this.f17867f = fk instanceof AbstractC1096eL;
        this.f17868g = iArr2;
        this.f17869h = i6;
        this.i = i7;
        this.f17870j = c1994v2;
        this.f17866e = fk;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e6) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            A.f.w(sb, "Field ", str, " for ", name);
            throw new RuntimeException(A.f.p(sb, " not found. Known fields are ", string), e6);
        }
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1096eL) {
            return ((AbstractC1096eL) obj).h();
        }
        return true;
    }

    public static void n(Object obj) {
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int o(long j6, Object obj) {
        return ((Integer) WL.k(j6, obj)).intValue();
    }

    public static long p(long j6, Object obj) {
        return ((Long) WL.k(j6, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i3, ZL zl, Class cls, KK kk) throws C1636oL {
        ZL zl2 = ZL.f12823c;
        switch (zl.ordinal()) {
            case 0:
                int i6 = i + 8;
                kk.f9481c = Double.valueOf(Double.longBitsToDouble(Cr.H(i, bArr)));
                return i6;
            case 1:
                int i7 = i + 4;
                kk.f9481c = Float.valueOf(Float.intBitsToFloat(Cr.D(i, bArr)));
                return i7;
            case 2:
            case 3:
                int iY = Cr.y(bArr, i, kk);
                kk.f9481c = Long.valueOf(kk.f9480b);
                return iY;
            case 4:
            case 12:
            case 13:
                int iC = Cr.c(bArr, i, kk);
                kk.f9481c = Integer.valueOf(kk.f9479a);
                return iC;
            case 5:
            case 15:
                int i8 = i + 8;
                kk.f9481c = Long.valueOf(Cr.H(i, bArr));
                return i8;
            case 6:
            case 14:
                int i9 = i + 4;
                kk.f9481c = Integer.valueOf(Cr.D(i, bArr));
                return i9;
            case 7:
                int iY2 = Cr.y(bArr, i, kk);
                kk.f9481c = Boolean.valueOf(kk.f9480b != 0);
                return iY2;
            case 8:
                return Cr.K(bArr, i, kk);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                JL jlA = EL.f7942c.a(cls);
                AbstractC1096eL abstractC1096eLA = jlA.a();
                int iP = Cr.P(abstractC1096eLA, jlA, bArr, i, i3, kk);
                jlA.e(abstractC1096eLA);
                kk.f9481c = abstractC1096eLA;
                return iP;
            case 11:
                return Cr.M(bArr, i, kk);
            case 16:
                int iC2 = Cr.c(bArr, i, kk);
                kk.f9481c = Integer.valueOf(D5.b.l(kk.f9479a));
                return iC2;
            case 17:
                int iY3 = Cr.y(bArr, i, kk);
                kk.f9481c = Long.valueOf(D5.b.m(kk.f9480b));
                return iY3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C2229zL z(com.google.android.gms.internal.ads.GL r35, com.google.android.gms.internal.ads.C1994v2 r36, com.google.android.gms.internal.ads.ZJ r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.z(com.google.android.gms.internal.ads.GL, com.google.android.gms.internal.ads.v2, com.google.android.gms.internal.ads.ZJ):com.google.android.gms.internal.ads.zL");
    }

    public final void B(Object obj, int i, Object obj2) {
        if (s(i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = f17861l;
            long j6 = iK;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i3 = this.f17862a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC2763b.a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            JL jlD = D(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    AbstractC1096eL abstractC1096eLA = jlD.a();
                    jlD.b(abstractC1096eLA, object);
                    unsafe.putObject(obj, j6, abstractC1096eLA);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m(object2)) {
                AbstractC1096eL abstractC1096eLA2 = jlD.a();
                jlD.b(abstractC1096eLA2, object2);
                unsafe.putObject(obj, j6, abstractC1096eLA2);
                object2 = abstractC1096eLA2;
            }
            jlD.b(object2, object);
        }
    }

    public final void C(Object obj, int i, Object obj2) {
        int[] iArr = this.f17862a;
        int i3 = iArr[i];
        if (u(i3, i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = f17861l;
            long j6 = iK;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i6 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC2763b.a(i6, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i6);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            JL jlD = D(i);
            if (!u(i3, i, obj)) {
                if (m(object)) {
                    AbstractC1096eL abstractC1096eLA = jlD.a();
                    jlD.b(abstractC1096eLA, object);
                    unsafe.putObject(obj, j6, abstractC1096eLA);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                v(i3, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!m(object2)) {
                AbstractC1096eL abstractC1096eLA2 = jlD.a();
                jlD.b(abstractC1096eLA2, object2);
                unsafe.putObject(obj, j6, abstractC1096eLA2);
                object2 = abstractC1096eLA2;
            }
            jlD.b(object2, object);
        }
    }

    public final JL D(int i) {
        int i3 = i / 3;
        int i6 = i3 + i3;
        Object[] objArr = this.f17863b;
        JL jl = (JL) objArr[i6];
        if (jl != null) {
            return jl;
        }
        JL jlA = EL.f7942c.a((Class) objArr[i6 + 1]);
        objArr[i6] = jlA;
        return jlA;
    }

    public final Object E(int i) {
        int i3 = i / 3;
        return this.f17863b[i3 + i3];
    }

    public final InterfaceC1260hL F(int i) {
        int i3 = i / 3;
        return (InterfaceC1260hL) this.f17863b[i3 + i3 + 1];
    }

    public final Object G(int i, Object obj) {
        JL jlD = D(i);
        int iK = k(i) & 1048575;
        if (!s(i, obj)) {
            return jlD.a();
        }
        Object object = f17861l.getObject(obj, iK);
        if (m(object)) {
            return object;
        }
        AbstractC1096eL abstractC1096eLA = jlD.a();
        if (object != null) {
            jlD.b(abstractC1096eLA, object);
        }
        return abstractC1096eLA;
    }

    public final void H(Object obj, int i, Object obj2) {
        f17861l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, int i3, Object obj) {
        JL jlD = D(i3);
        if (!u(i, i3, obj)) {
            return jlD.a();
        }
        Object object = f17861l.getObject(obj, k(i3) & 1048575);
        if (m(object)) {
            return object;
        }
        AbstractC1096eL abstractC1096eLA = jlD.a();
        if (object != null) {
            jlD.b(abstractC1096eLA, object);
        }
        return abstractC1096eLA;
    }

    public final void J(int i, int i3, Object obj, Object obj2) {
        f17861l.putObject(obj, k(i3) & 1048575, obj2);
        v(i, i3, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(java.lang.Object r22, int r23, java.lang.Object r24, com.google.android.gms.internal.ads.C1994v2 r25, java.lang.Object r26) throws com.google.android.gms.internal.ads.XL {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.K(java.lang.Object, int, java.lang.Object, com.google.android.gms.internal.ads.v2, java.lang.Object):java.lang.Object");
    }

    public final void L(int i, C1506m c1506m, Object obj) {
        D5.b bVar = (D5.b) c1506m.f15505d;
        long j6 = i & 1048575;
        if ((536870912 & i) != 0) {
            c1506m.v(2);
            WL.l(obj, j6, bVar.z());
        } else if (!this.f17867f) {
            WL.l(obj, j6, c1506m.E());
        } else {
            c1506m.v(2);
            WL.l(obj, j6, bVar.y());
        }
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final AbstractC1096eL a() {
        return ((AbstractC1096eL) this.f17866e).p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.ads.JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.b(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final boolean c(AbstractC1096eL abstractC1096eL, AbstractC1096eL abstractC1096eL2) {
        boolean zC;
        int i = 0;
        while (true) {
            int[] iArr = this.f17862a;
            if (i < iArr.length) {
                int iK = k(i);
                long j6 = iK & 1048575;
                switch (l(iK)) {
                    case 0:
                        if (!q(abstractC1096eL, abstractC1096eL2, i)) {
                            break;
                        } else {
                            VL vl = WL.f12214c;
                            if (Double.doubleToLongBits(vl.o1(j6, abstractC1096eL)) != Double.doubleToLongBits(vl.o1(j6, abstractC1096eL2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!q(abstractC1096eL, abstractC1096eL2, i)) {
                            break;
                        } else {
                            VL vl2 = WL.f12214c;
                            if (Float.floatToIntBits(vl2.Z(j6, abstractC1096eL)) != Float.floatToIntBits(vl2.Z(j6, abstractC1096eL2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.i(j6, abstractC1096eL) != WL.i(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.i(j6, abstractC1096eL) != WL.i(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.g(j6, abstractC1096eL) != WL.g(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.i(j6, abstractC1096eL) != WL.i(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.g(j6, abstractC1096eL) != WL.g(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!q(abstractC1096eL, abstractC1096eL2, i)) {
                            break;
                        } else {
                            VL vl3 = WL.f12214c;
                            if (vl3.U(j6, abstractC1096eL) != vl3.U(j6, abstractC1096eL2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || !KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || !KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || !KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.g(j6, abstractC1096eL) != WL.g(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.g(j6, abstractC1096eL) != WL.g(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.g(j6, abstractC1096eL) != WL.g(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.i(j6, abstractC1096eL) != WL.i(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.g(j6, abstractC1096eL) != WL.g(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || WL.i(j6, abstractC1096eL) != WL.i(j6, abstractC1096eL2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (!q(abstractC1096eL, abstractC1096eL2, i) || !KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
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
                        zC = KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        zC = KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2));
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
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j7 = iArr[i + 2] & 1048575;
                        if (WL.g(j7, abstractC1096eL) != WL.g(j7, abstractC1096eL2) || !KL.c(WL.k(j6, abstractC1096eL), WL.k(j6, abstractC1096eL2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (zC) {
                    i += 3;
                }
            } else if (abstractC1096eL.zzt.equals(abstractC1096eL2.zzt)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final boolean d(Object obj) {
        int i;
        int i3;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.f17869h) {
            int i10 = this.f17868g[i8];
            int[] iArr = this.f17862a;
            int i11 = iArr[i10];
            int iK = k(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = f17861l.getInt(obj, i13);
                }
                i3 = i10;
                i6 = i7;
                i = i13;
            } else {
                int i15 = i7;
                i = i9;
                i3 = i10;
                i6 = i15;
            }
            if ((268435456 & iK) == 0 || r(obj, i3, i, i6, i14)) {
                int iL = l(iK);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!u(i11, i3, obj) || D(i3).d(WL.k(iK & 1048575, obj))) {
                                i8++;
                                i9 = i;
                                i7 = i6;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                C1959uL c1959uL = (C1959uL) WL.k(iK & 1048575, obj);
                                if (!c1959uL.isEmpty() && ((ZL) ((C1905tL) E(i3)).f16900a.f17370c).f12827a == EnumC0879aM.i) {
                                    JL jlA = null;
                                    for (Object obj2 : c1959uL.values()) {
                                        if (jlA == null) {
                                            jlA = EL.f7942c.a(obj2.getClass());
                                        }
                                        if (!jlA.d(obj2)) {
                                        }
                                    }
                                }
                            }
                            i8++;
                            i9 = i;
                            i7 = i6;
                        }
                    }
                    List list = (List) WL.k(iK & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        JL jlD = D(i3);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (jlD.d(list.get(i16))) {
                            }
                        }
                    }
                    i8++;
                    i9 = i;
                    i7 = i6;
                } else if (!r(obj, i3, i, i6, i14) || D(i3).d(WL.k(iK & 1048575, obj))) {
                    i8++;
                    i9 = i;
                    i7 = i6;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // com.google.android.gms.internal.ads.JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m(r8)
            if (r0 != 0) goto L8
            goto L99
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.AbstractC1096eL
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.ads.eL r0 = (com.google.android.gms.internal.ads.AbstractC1096eL) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.g(r2)
            r0.zzq = r1
            r0.i()
        L1b:
            r0 = r1
        L1c:
            int[] r2 = r7.f17862a
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.C2229zL.f17861l
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L87
            r6 = r3
            com.google.android.gms.internal.ads.uL r6 = (com.google.android.gms.internal.ads.C1959uL) r6
            r6.f17114a = r1
            r2.putObject(r8, r4, r3)
            goto L87
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.ads.WL.k(r4, r8)
            com.google.android.gms.internal.ads.lL r2 = (com.google.android.gms.internal.ads.InterfaceC1474lL) r2
            com.google.android.gms.internal.ads.GK r2 = (com.google.android.gms.internal.ads.GK) r2
            boolean r3 = r2.f8358a
            if (r3 == 0) goto L87
            r2.f8358a = r1
            goto L87
        L5e:
            r2 = r2[r0]
            boolean r2 = r7.u(r2, r0, r8)
            if (r2 == 0) goto L87
            com.google.android.gms.internal.ads.JL r2 = r7.D(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.ads.C2229zL.f17861l
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.e(r3)
            goto L87
        L74:
            boolean r2 = r7.s(r0, r8)
            if (r2 == 0) goto L87
            com.google.android.gms.internal.ads.JL r2 = r7.D(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.ads.C2229zL.f17861l
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.e(r3)
        L87:
            int r0 = r0 + 3
            goto L1c
        L8a:
            com.google.android.gms.internal.ads.v2 r0 = r7.f17870j
            r0.getClass()
            com.google.android.gms.internal.ads.eL r8 = (com.google.android.gms.internal.ads.AbstractC1096eL) r8
            com.google.android.gms.internal.ads.RL r8 = r8.zzt
            boolean r0 = r8.f10903e
            if (r0 == 0) goto L99
            r8.f10903e = r1
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.e(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x02fa A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r28, com.google.android.gms.internal.ads.C1014cu r29) throws com.google.android.gms.internal.ads.XL {
        /*
            Method dump skipped, instructions count: 2350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.f(java.lang.Object, com.google.android.gms.internal.ads.cu):void");
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
    @Override // com.google.android.gms.internal.ads.JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.AbstractC1096eL r29) throws com.google.android.gms.internal.ads.XL {
        /*
            Method dump skipped, instructions count: 2852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.g(com.google.android.gms.internal.ads.eL):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07f3 A[LOOP:1: B:217:0x07f1->B:218:0x07f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r22, com.google.android.gms.internal.ads.C1506m r23, com.google.android.gms.internal.ads.XK r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.h(java.lang.Object, com.google.android.gms.internal.ads.m, com.google.android.gms.internal.ads.XK):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.google.android.gms.internal.ads.AbstractC1096eL r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.i(com.google.android.gms.internal.ads.eL):int");
    }

    @Override // com.google.android.gms.internal.ads.JL
    public final void j(Object obj, byte[] bArr, int i, int i3, KK kk) {
        y(obj, bArr, i, i3, 0, kk);
    }

    public final int k(int i) {
        return this.f17862a[i + 1];
    }

    public final boolean q(AbstractC1096eL abstractC1096eL, AbstractC1096eL abstractC1096eL2, int i) {
        return s(i, abstractC1096eL) == s(i, abstractC1096eL2);
    }

    public final boolean r(Object obj, int i, int i3, int i6, int i7) {
        return i3 == 1048575 ? s(i, obj) : (i6 & i7) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i3 = this.f17862a[i + 2];
        long j6 = i3 & 1048575;
        if (j6 == 1048575) {
            int iK = k(i);
            long j7 = iK & 1048575;
            switch (l(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(WL.f12214c.o1(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(WL.f12214c.Z(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (WL.i(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (WL.i(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (WL.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (WL.i(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (WL.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return WL.f12214c.U(j7, obj);
                case 8:
                    Object objK = WL.k(j7, obj);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objK instanceof QK)) {
                            throw new IllegalArgumentException();
                        }
                        if (QK.f10609b.equals(objK)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (WL.k(j7, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (QK.f10609b.equals(WL.k(j7, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (WL.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (WL.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (WL.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (WL.i(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (WL.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (WL.i(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (WL.k(j7, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & WL.g(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i3 = this.f17862a[i + 2];
        long j6 = 1048575 & i3;
        if (j6 == 1048575) {
            return;
        }
        WL.h(j6, obj, (1 << (i3 >>> 20)) | WL.g(j6, obj));
    }

    public final boolean u(int i, int i3, Object obj) {
        return WL.g((long) (this.f17862a[i3 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i3, Object obj) {
        WL.h(this.f17862a[i3 + 2] & 1048575, obj, i);
    }

    public final int w(int i, int i3) {
        int[] iArr = this.f17862a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i6 = (length + i3) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i3 = i6 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int y(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.KK r40) {
        /*
            Method dump skipped, instructions count: 3802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2229zL.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.KK):int");
    }
}
