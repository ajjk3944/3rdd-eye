package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class c6 implements j6 {
    public static final int[] j = new int[0];
    public static final Unsafe k = s6.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4933a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4934b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4935c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4936d;

    /* renamed from: e, reason: collision with root package name */
    public final s4 f4937e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4938f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4939g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4940h;

    /* renamed from: i, reason: collision with root package name */
    public final f5 f4941i;

    public c6(int[] iArr, Object[] objArr, int i10, int i11, s4 s4Var, int[] iArr2, int i12, int i13, f5 f5Var, f5 f5Var2) {
        this.f4933a = iArr;
        this.f4934b = objArr;
        this.f4935c = i10;
        this.f4936d = i11;
        this.f4938f = iArr2;
        this.f4939g = i12;
        this.f4940h = i13;
        this.f4941i = f5Var;
        this.f4937e = s4Var;
    }

    public static int E(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof h5) {
            return ((h5) obj).e();
        }
        return true;
    }

    public static int j(Object obj, long j7) {
        return ((Integer) s6.j(obj, j7)).intValue();
    }

    public static long k(Object obj, long j7) {
        return ((Long) s6.j(obj, j7)).longValue();
    }

    public static final int r(byte[] bArr, int i10, int i11, v6 v6Var, Class cls, v4 v4Var) throws q5 {
        v6 v6Var2 = v6.zza;
        switch (v6Var.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                v4Var.f5231c = Double.valueOf(Double.longBitsToDouble(y3.W(i10, bArr)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                v4Var.f5231c = Float.valueOf(Float.intBitsToFloat(y3.V(i10, bArr)));
                return i13;
            case 2:
            case 3:
                int iU = y3.U(bArr, i10, v4Var);
                v4Var.f5231c = Long.valueOf(v4Var.f5230b);
                return iU;
            case 4:
            case 12:
            case 13:
                int iS = y3.S(bArr, i10, v4Var);
                v4Var.f5231c = Integer.valueOf(v4Var.f5229a);
                return iS;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                int i14 = i10 + 8;
                v4Var.f5231c = Long.valueOf(y3.W(i10, bArr));
                return i14;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                int i15 = i10 + 4;
                v4Var.f5231c = Integer.valueOf(y3.V(i10, bArr));
                return i15;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int iU2 = y3.U(bArr, i10, v4Var);
                v4Var.f5231c = Boolean.valueOf(v4Var.f5230b != 0);
                return iU2;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return y3.X(bArr, i10, v4Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                j6 j6VarA = g6.f5043c.a(cls);
                h5 h5VarZza = j6VarA.zza();
                int iZ = y3.Z(h5VarZza, j6VarA, bArr, i10, i11, v4Var);
                j6VarA.f(h5VarZza);
                v4Var.f5231c = h5VarZza;
                return iZ;
            case 11:
                return y3.Y(bArr, i10, v4Var);
            case 16:
                int iS2 = y3.S(bArr, i10, v4Var);
                v4Var.f5231c = Integer.valueOf(i4.T(v4Var.f5229a));
                return iS2;
            case 17:
                int iU3 = y3.U(bArr, i10, v4Var);
                v4Var.f5231c = Long.valueOf(i4.V(v4Var.f5230b));
                return iU3;
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
    public static com.google.android.gms.internal.measurement.c6 t(com.google.android.gms.internal.measurement.i6 r35, com.google.android.gms.internal.measurement.f5 r36, com.google.android.gms.internal.measurement.f5 r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c6.t(com.google.android.gms.internal.measurement.i6, com.google.android.gms.internal.measurement.f5, com.google.android.gms.internal.measurement.f5):com.google.android.gms.internal.measurement.c6");
    }

    public static Field u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(c7.a.d(11, str) + name.length() + 29 + String.valueOf(string).length());
            w.g.q(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(w.g.j(sb2, " not found. Known fields are ", string), e4);
        }
    }

    public final void A(Object obj, int i10, Object obj2) {
        k.putObject(obj, D(i10) & 1048575, obj2);
        o(i10, obj);
    }

    public final Object B(int i10, int i11, Object obj) {
        j6 j6VarX = x(i11);
        if (!p(i10, i11, obj)) {
            return j6VarX.zza();
        }
        Object object = k.getObject(obj, D(i11) & 1048575);
        if (i(object)) {
            return object;
        }
        h5 h5VarZza = j6VarX.zza();
        if (object != null) {
            j6VarX.a(h5VarZza, object);
        }
        return h5VarZza;
    }

    public final void C(int i10, Object obj, Object obj2, int i11) {
        k.putObject(obj, D(i11) & 1048575, obj2);
        s6.g(i10, this.f4933a[i11 + 2] & 1048575, obj);
    }

    public final int D(int i10) {
        return this.f4933a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.measurement.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c6.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    @Override // com.google.android.gms.internal.measurement.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.measurement.s4 r17) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c6.b(com.google.android.gms.internal.measurement.s4):int");
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final void c(Object obj, w5 w5Var) throws androidx.datastore.preferences.protobuf.m {
        int i10;
        c6 c6Var = this;
        Unsafe unsafe = k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = c6Var.f4933a;
            if (i12 >= iArr.length) {
                ((h5) obj).zzc.b(w5Var);
                return;
            }
            int iD = c6Var.D(i12);
            int iE = E(iD);
            int i15 = iArr[i12];
            if (iE <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j7 = iD & i11;
            switch (iE) {
                case 0:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).r0(i15, Double.doubleToRawLongBits(s6.f5191c.f(obj, j7)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).p0(i15, Float.floatToRawIntBits(s6.f5191c.d(obj, j7)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).q0(i15, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).q0(i15, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).n0(i15, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).r0(i15, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).p0(i15, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        boolean zB = s6.f5191c.b(obj, j7);
                        z4 z4Var = (z4) w5Var.f5247a;
                        z4Var.v0(i15 << 3);
                        z4Var.t0(zB ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof String) {
                            z4 z4Var2 = (z4) w5Var.f5247a;
                            z4Var2.v0((i15 << 3) | 2);
                            z4Var2.A0((String) object);
                            break;
                        } else {
                            z4 z4Var3 = (z4) w5Var.f5247a;
                            z4Var3.v0((i15 << 3) | 2);
                            z4Var3.s0((y4) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        w5Var.d(i15, unsafe.getObject(obj, j7), c6Var.x(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        y4 y4Var = (y4) unsafe.getObject(obj, j7);
                        z4 z4Var4 = (z4) w5Var.f5247a;
                        z4Var4.v0((i15 << 3) | 2);
                        z4Var4.s0(y4Var);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).o0(i15, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).n0(i15, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).p0(i15, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        ((z4) w5Var.f5247a).r0(i15, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        int i18 = unsafe.getInt(obj, j7);
                        ((z4) w5Var.f5247a).o0(i15, (i18 >> 31) ^ (i18 + i18));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        long j10 = unsafe.getLong(obj, j7);
                        ((z4) w5Var.f5247a).q0(i15, (j10 >> 63) ^ (j10 + j10));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (c6Var.m(obj, i12, i14, i13, i10)) {
                        w5Var.e(i15, unsafe.getObject(obj, j7), c6Var.x(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    k6.c(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 19:
                    k6.d(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 20:
                    k6.e(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 21:
                    k6.f(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 22:
                    k6.j(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 23:
                    k6.h(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 24:
                    k6.m(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 25:
                    k6.p(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 26:
                    int i19 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j7);
                    f5 f5Var = k6.f5095a;
                    if (list != null && !list.isEmpty()) {
                        w5Var.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            z4 z4Var5 = (z4) w5Var.f5247a;
                            String str = (String) list.get(i20);
                            z4Var5.v0((i19 << 3) | 2);
                            z4Var5.A0(str);
                        }
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i21 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    j6 j6VarX = c6Var.x(i12);
                    f5 f5Var2 = k6.f5095a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            w5Var.d(i21, list2.get(i22), j6VarX);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i23 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    f5 f5Var3 = k6.f5095a;
                    if (list3 != null && !list3.isEmpty()) {
                        w5Var.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            z4 z4Var6 = (z4) w5Var.f5247a;
                            y4 y4Var2 = (y4) list3.get(i24);
                            z4Var6.v0((i23 << 3) | 2);
                            z4Var6.s0(y4Var2);
                        }
                        break;
                    } else {
                        break;
                    }
                case 29:
                    k6.k(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 30:
                    k6.o(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 31:
                    k6.n(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 32:
                    k6.i(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 33:
                    k6.l(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 34:
                    k6.g(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, false);
                    break;
                case 35:
                    k6.c(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 36:
                    k6.d(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 37:
                    k6.e(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 38:
                    k6.f(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 39:
                    k6.j(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 40:
                    k6.h(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 41:
                    k6.m(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 42:
                    k6.p(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 43:
                    k6.k(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 44:
                    k6.o(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 45:
                    k6.n(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 46:
                    k6.i(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 47:
                    k6.l(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 48:
                    k6.g(iArr[i12], (List) unsafe.getObject(obj, j7), w5Var, true);
                    break;
                case 49:
                    int i25 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    j6 j6VarX2 = c6Var.x(i12);
                    f5 f5Var4 = k6.f5095a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            w5Var.e(i25, list4.get(i26), j6VarX2);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j7);
                    if (object2 != null) {
                        int i27 = i12 / 3;
                        t tVar = ((x5) c6Var.f4934b[i27 + i27]).f5259a;
                        w5Var.getClass();
                        for (Map.Entry entry : ((y5) object2).entrySet()) {
                            z4 z4Var7 = (z4) w5Var.f5247a;
                            z4Var7.m0(i15, 2);
                            z4Var7.v0(x5.b(tVar, entry.getKey(), entry.getValue()));
                            x5.a(z4Var7, tVar, entry.getKey(), entry.getValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).r0(i15, Double.doubleToRawLongBits(((Double) s6.j(obj, j7)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).p0(i15, Float.floatToRawIntBits(((Float) s6.j(obj, j7)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).q0(i15, k(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).q0(i15, k(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).n0(i15, j(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).r0(i15, k(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).p0(i15, j(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (c6Var.p(i15, i12, obj)) {
                        boolean zBooleanValue = ((Boolean) s6.j(obj, j7)).booleanValue();
                        z4 z4Var8 = (z4) w5Var.f5247a;
                        z4Var8.v0(i15 << 3);
                        z4Var8.t0(zBooleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (c6Var.p(i15, i12, obj)) {
                        Object object3 = unsafe.getObject(obj, j7);
                        if (object3 instanceof String) {
                            z4 z4Var9 = (z4) w5Var.f5247a;
                            z4Var9.v0((i15 << 3) | 2);
                            z4Var9.A0((String) object3);
                            break;
                        } else {
                            z4 z4Var10 = (z4) w5Var.f5247a;
                            z4Var10.v0((i15 << 3) | 2);
                            z4Var10.s0((y4) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (c6Var.p(i15, i12, obj)) {
                        w5Var.d(i15, unsafe.getObject(obj, j7), c6Var.x(i12));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (c6Var.p(i15, i12, obj)) {
                        y4 y4Var3 = (y4) unsafe.getObject(obj, j7);
                        z4 z4Var11 = (z4) w5Var.f5247a;
                        z4Var11.v0((i15 << 3) | 2);
                        z4Var11.s0(y4Var3);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).o0(i15, j(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).n0(i15, j(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).p0(i15, j(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (c6Var.p(i15, i12, obj)) {
                        ((z4) w5Var.f5247a).r0(i15, k(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (c6Var.p(i15, i12, obj)) {
                        int iJ = j(obj, j7);
                        ((z4) w5Var.f5247a).o0(i15, (iJ >> 31) ^ (iJ + iJ));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (c6Var.p(i15, i12, obj)) {
                        long jK = k(obj, j7);
                        ((z4) w5Var.f5247a).q0(i15, (jK >> 63) ^ (jK + jK));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (c6Var.p(i15, i12, obj)) {
                        w5Var.e(i15, unsafe.getObject(obj, j7), c6Var.x(i12));
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
            i11 = 1048575;
            c6Var = this;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f4939g) {
            int i16 = this.f4938f[i14];
            int[] iArr = this.f4933a;
            int i17 = iArr[i16];
            int iD = D(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = k.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iD) == 0 || m(obj, i11, i10, i12, i20)) {
                int iE = E(iD);
                if (iE != 9 && iE != 17) {
                    if (iE != 27) {
                        if (iE == 60 || iE == 68) {
                            if (!p(i17, i11, obj) || x(i11).d(s6.j(obj, iD & 1048575))) {
                                i14++;
                                i15 = i10;
                                i13 = i12;
                            }
                        } else if (iE != 49) {
                            if (iE != 50) {
                                continue;
                            } else {
                                y5 y5Var = (y5) s6.j(obj, iD & 1048575);
                                if (y5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i22 = i11 / 3;
                                    if (((v6) ((x5) this.f4934b[i22 + i22]).f5259a.f5207b).zza() == w6.MESSAGE) {
                                        j6 j6VarA = null;
                                        for (Object obj2 : y5Var.values()) {
                                            if (j6VarA == null) {
                                                j6VarA = g6.f5043c.a(obj2.getClass());
                                            }
                                            if (!j6VarA.d(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i14++;
                            i15 = i10;
                            i13 = i12;
                        }
                    }
                    List list = (List) s6.j(obj, iD & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        j6 j6VarX = x(i11);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (j6VarX.d(list.get(i23))) {
                            }
                        }
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                } else if (!m(obj, i11, i10, i12, i20) || x(i11).d(s6.j(obj, iD & 1048575))) {
                    i14++;
                    i15 = i10;
                    i13 = i12;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final boolean e(h5 h5Var, h5 h5Var2) {
        boolean zA;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4933a;
            if (i10 < iArr.length) {
                int iD = D(i10);
                long j7 = iD & 1048575;
                switch (E(iD)) {
                    case 0:
                        if (!l(h5Var, h5Var2, i10)) {
                            break;
                        } else {
                            r6 r6Var = s6.f5191c;
                            if (Double.doubleToLongBits(r6Var.f(h5Var, j7)) != Double.doubleToLongBits(r6Var.f(h5Var2, j7))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!l(h5Var, h5Var2, i10)) {
                            break;
                        } else {
                            r6 r6Var2 = s6.f5191c;
                            if (Float.floatToIntBits(r6Var2.d(h5Var, j7)) != Float.floatToIntBits(r6Var2.d(h5Var2, j7))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (!l(h5Var, h5Var2, i10) || s6.h(h5Var, j7) != s6.h(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (!l(h5Var, h5Var2, i10) || s6.h(h5Var, j7) != s6.h(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (!l(h5Var, h5Var2, i10) || s6.f(h5Var, j7) != s6.f(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        if (!l(h5Var, h5Var2, i10) || s6.h(h5Var, j7) != s6.h(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!l(h5Var, h5Var2, i10) || s6.f(h5Var, j7) != s6.f(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!l(h5Var, h5Var2, i10)) {
                            break;
                        } else {
                            r6 r6Var3 = s6.f5191c;
                            if (r6Var3.b(h5Var, j7) != r6Var3.b(h5Var2, j7)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                        if (!l(h5Var, h5Var2, i10) || !k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (!l(h5Var, h5Var2, i10) || !k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (!l(h5Var, h5Var2, i10) || !k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (!l(h5Var, h5Var2, i10) || s6.f(h5Var, j7) != s6.f(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (!l(h5Var, h5Var2, i10) || s6.f(h5Var, j7) != s6.f(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (!l(h5Var, h5Var2, i10) || s6.f(h5Var, j7) != s6.f(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (!l(h5Var, h5Var2, i10) || s6.h(h5Var, j7) != s6.h(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (!l(h5Var, h5Var2, i10) || s6.f(h5Var, j7) != s6.f(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (!l(h5Var, h5Var2, i10) || s6.h(h5Var, j7) != s6.h(h5Var2, j7)) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (!l(h5Var, h5Var2, i10) || !k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
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
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zA = k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7));
                        break;
                    case 50:
                        zA = k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7));
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
                        long j10 = iArr[i10 + 2] & 1048575;
                        if (s6.f(h5Var, j10) != s6.f(h5Var2, j10) || !k6.a(s6.j(h5Var, j7), s6.j(h5Var2, j7))) {
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (zA) {
                    i10 += 3;
                }
            } else if (h5Var.zzc.equals(h5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.measurement.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = i(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.h5
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.measurement.h5 r0 = (com.google.android.gms.internal.measurement.h5) r0
            r0.j()
            r0.zza = r1
            r0.f()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f4933a
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.D(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = E(r3)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.c6.k
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.measurement.y5 r6 = (com.google.android.gms.internal.measurement.y5) r6
            r6.f5272a = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.s6.j(r8, r4)
            com.google.android.gms.internal.measurement.n5 r2 = (com.google.android.gms.internal.measurement.n5) r2
            com.google.android.gms.internal.measurement.t4 r2 = (com.google.android.gms.internal.measurement.t4) r2
            boolean r3 = r2.f5208a
            if (r3 == 0) goto L84
            r2.f5208a = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.p(r2, r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.j6 r2 = r7.x(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.c6.k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.f(r3)
            goto L84
        L71:
            boolean r2 = r7.n(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.j6 r2 = r7.x(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.c6.k
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.f(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.measurement.f5 r0 = r7.f4941i
            r0.getClass()
            com.google.android.gms.internal.measurement.h5 r8 = (com.google.android.gms.internal.measurement.h5) r8
            com.google.android.gms.internal.measurement.n6 r8 = r8.zzc
            boolean r0 = r8.f5141e
            if (r0 == 0) goto L96
            r8.f5141e = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c6.f(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final void g(Object obj, byte[] bArr, int i10, int i11, v4 v4Var) {
        s(obj, bArr, i10, i11, 0, v4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(com.google.android.gms.internal.measurement.h5 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c6.h(com.google.android.gms.internal.measurement.h5):int");
    }

    public final boolean l(h5 h5Var, h5 h5Var2, int i10) {
        return n(i10, h5Var) == n(i10, h5Var2);
    }

    public final boolean m(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? n(i10, obj) : (i12 & i13) != 0;
    }

    public final boolean n(int i10, Object obj) {
        int i11 = this.f4933a[i10 + 2];
        long j7 = i11 & 1048575;
        if (j7 == 1048575) {
            int iD = D(i10);
            long j10 = iD & 1048575;
            switch (E(iD)) {
                case 0:
                    if (Double.doubleToRawLongBits(s6.f5191c.f(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(s6.f5191c.d(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (s6.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s6.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (s6.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return s6.f5191c.b(obj, j10);
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    Object objJ = s6.j(obj, j10);
                    if (objJ instanceof String) {
                        if (((String) objJ).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objJ instanceof y4)) {
                            throw new IllegalArgumentException();
                        }
                        if (y4.f5268g.equals(objJ)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (s6.j(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (y4.f5268g.equals(s6.j(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s6.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s6.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s6.j(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & s6.f(obj, j7)) == 0) {
            return false;
        }
        return true;
    }

    public final void o(int i10, Object obj) {
        int i11 = this.f4933a[i10 + 2];
        long j7 = 1048575 & i11;
        if (j7 == 1048575) {
            return;
        }
        s6.g((1 << (i11 >>> 20)) | s6.f(obj, j7), j7, obj);
    }

    public final boolean p(int i10, int i11, Object obj) {
        return s6.f(obj, (long) (this.f4933a[i11 + 2] & 1048575)) == i10;
    }

    public final int q(int i10, int i11) {
        int[] iArr = this.f4933a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0373, code lost:
    
        r4 = r13;
        r7 = r15;
        r8 = r12;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03d9, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        r6 = r43;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        r4 = r10;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        r10 = r13;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0c95, code lost:
    
        throw new com.google.android.gms.internal.measurement.q5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0f68 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0f7b  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0b3a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0f48 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0b4b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0f5d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.v4 r45) {
        /*
            Method dump skipped, instructions count: 4414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c6.s(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.v4):int");
    }

    public final void v(Object obj, int i10, Object obj2) {
        if (n(i10, obj2)) {
            int iD = D(i10) & 1048575;
            Unsafe unsafe = k;
            long j7 = iD;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i11 = this.f4933a[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            j6 j6VarX = x(i10);
            if (!n(i10, obj)) {
                if (i(object)) {
                    h5 h5VarZza = j6VarX.zza();
                    j6VarX.a(h5VarZza, object);
                    unsafe.putObject(obj, j7, h5VarZza);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                o(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!i(object2)) {
                h5 h5VarZza2 = j6VarX.zza();
                j6VarX.a(h5VarZza2, object2);
                unsafe.putObject(obj, j7, h5VarZza2);
                object2 = h5VarZza2;
            }
            j6VarX.a(object2, object);
        }
    }

    public final void w(Object obj, int i10, Object obj2) {
        int[] iArr = this.f4933a;
        int i11 = iArr[i10];
        if (p(i11, i10, obj2)) {
            int iD = D(i10) & 1048575;
            Unsafe unsafe = k;
            long j7 = iD;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            j6 j6VarX = x(i10);
            if (!p(i11, i10, obj)) {
                if (i(object)) {
                    h5 h5VarZza = j6VarX.zza();
                    j6VarX.a(h5VarZza, object);
                    unsafe.putObject(obj, j7, h5VarZza);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                s6.g(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!i(object2)) {
                h5 h5VarZza2 = j6VarX.zza();
                j6VarX.a(h5VarZza2, object2);
                unsafe.putObject(obj, j7, h5VarZza2);
                object2 = h5VarZza2;
            }
            j6VarX.a(object2, object);
        }
    }

    public final j6 x(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f4934b;
        j6 j6Var = (j6) objArr[i12];
        if (j6Var != null) {
            return j6Var;
        }
        j6 j6VarA = g6.f5043c.a((Class) objArr[i12 + 1]);
        objArr[i12] = j6VarA;
        return j6VarA;
    }

    public final k5 y(int i10) {
        int i11 = i10 / 3;
        return (k5) this.f4934b[i11 + i11 + 1];
    }

    public final Object z(int i10, Object obj) {
        j6 j6VarX = x(i10);
        int iD = D(i10) & 1048575;
        if (!n(i10, obj)) {
            return j6VarX.zza();
        }
        Object object = k.getObject(obj, iD);
        if (i(object)) {
            return object;
        }
        h5 h5VarZza = j6VarX.zza();
        if (object != null) {
            j6VarX.a(h5VarZza, object);
        }
        return h5VarZza;
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final h5 zza() {
        return (h5) ((h5) this.f4937e).o(4);
    }
}
