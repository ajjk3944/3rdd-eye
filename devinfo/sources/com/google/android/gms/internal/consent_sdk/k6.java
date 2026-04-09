package com.google.android.gms.internal.consent_sdk;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k6 implements q6 {
    public static final int[] g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f19392h = b7.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19393a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19394b;

    /* renamed from: c, reason: collision with root package name */
    public final l5 f19395c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f19396d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19397e;

    /* renamed from: f, reason: collision with root package name */
    public final w6 f19398f;

    public k6(int[] iArr, Object[] objArr, l5 l5Var, int[] iArr2, int i4, w6 w6Var, q4 q4Var) {
        this.f19393a = iArr;
        this.f19394b = objArr;
        this.f19396d = iArr2;
        this.f19397e = i4;
        this.f19398f = w6Var;
        this.f19395c = l5Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w5) {
            return ((w5) obj).e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.consent_sdk.k6 j(com.google.android.gms.internal.consent_sdk.p6 r32, com.google.android.gms.internal.consent_sdk.w6 r33, com.google.android.gms.internal.consent_sdk.q4 r34) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.k6.j(com.google.android.gms.internal.consent_sdk.p6, com.google.android.gms.internal.consent_sdk.w6, com.google.android.gms.internal.consent_sdk.q4):com.google.android.gms.internal.consent_sdk.k6");
    }

    public static int k(Object obj, long j) {
        return ((Integer) b7.h(obj, j)).intValue();
    }

    public static int l(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static long n(Object obj, long j) {
        return ((Long) b7.h(obj, j)).longValue();
    }

    public static Field p(Class cls, String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.consent_sdk.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = h(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.consent_sdk.w5
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.consent_sdk.w5 r0 = (com.google.android.gms.internal.consent_sdk.w5) r0
            r0.d()
            r0.zza = r1
            r0.k()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f19393a
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.m(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = l(r3)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.consent_sdk.k6.f19392h
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.consent_sdk.g6 r6 = (com.google.android.gms.internal.consent_sdk.g6) r6
            r6.f19364a = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.consent_sdk.b7.h(r8, r4)
            com.google.android.gms.internal.consent_sdk.z5 r2 = (com.google.android.gms.internal.consent_sdk.z5) r2
            com.google.android.gms.internal.consent_sdk.m5 r2 = (com.google.android.gms.internal.consent_sdk.m5) r2
            boolean r3 = r2.f19438a
            if (r3 == 0) goto L84
            r2.f19438a = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.i(r2, r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.consent_sdk.q6 r2 = r7.o(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.consent_sdk.k6.f19392h
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.a(r3)
            goto L84
        L71:
            boolean r2 = r7.u(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.consent_sdk.q6 r2 = r7.o(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.consent_sdk.k6.f19392h
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.a(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.consent_sdk.w6 r0 = r7.f19398f
            r0.getClass()
            com.google.android.gms.internal.consent_sdk.w5 r8 = (com.google.android.gms.internal.consent_sdk.w5) r8
            com.google.android.gms.internal.consent_sdk.v6 r8 = r8.zzc
            boolean r0 = r8.f19551d
            if (r0 == 0) goto L96
            r8.f19551d = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.k6.a(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.consent_sdk.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.consent_sdk.w5 r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.k6.b(com.google.android.gms.internal.consent_sdk.w5):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final boolean c(w5 w5Var, w5 w5Var2) {
        boolean zE;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f19393a;
            if (i4 < iArr.length) {
                int iM = m(i4);
                long j = iM & 1048575;
                switch (l(iM)) {
                    case 0:
                        if (!t(w5Var, w5Var2, i4)) {
                            break;
                        } else {
                            a7 a7Var = b7.f19280c;
                            if (Double.doubleToLongBits(a7Var.a(w5Var, j)) != Double.doubleToLongBits(a7Var.a(w5Var2, j))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!t(w5Var, w5Var2, i4)) {
                            break;
                        } else {
                            a7 a7Var2 = b7.f19280c;
                            if (Float.floatToIntBits(a7Var2.b(w5Var, j)) != Float.floatToIntBits(a7Var2.b(w5Var2, j))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (!t(w5Var, w5Var2, i4) || b7.f(w5Var, j) != b7.f(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (!t(w5Var, w5Var2, i4) || b7.f(w5Var, j) != b7.f(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (!t(w5Var, w5Var2, i4) || b7.e(w5Var, j) != b7.e(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (!t(w5Var, w5Var2, i4) || b7.f(w5Var, j) != b7.f(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (!t(w5Var, w5Var2, i4) || b7.e(w5Var, j) != b7.e(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!t(w5Var, w5Var2, i4)) {
                            break;
                        } else {
                            a7 a7Var3 = b7.f19280c;
                            if (a7Var3.g(w5Var, j) != a7Var3.g(w5Var2, j)) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (!t(w5Var, w5Var2, i4) || !r6.e(b7.h(w5Var, j), b7.h(w5Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (!t(w5Var, w5Var2, i4) || !r6.e(b7.h(w5Var, j), b7.h(w5Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (!t(w5Var, w5Var2, i4) || !r6.e(b7.h(w5Var, j), b7.h(w5Var2, j))) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (!t(w5Var, w5Var2, i4) || b7.e(w5Var, j) != b7.e(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (!t(w5Var, w5Var2, i4) || b7.e(w5Var, j) != b7.e(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (!t(w5Var, w5Var2, i4) || b7.e(w5Var, j) != b7.e(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (!t(w5Var, w5Var2, i4) || b7.f(w5Var, j) != b7.f(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (!t(w5Var, w5Var2, i4) || b7.e(w5Var, j) != b7.e(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (!t(w5Var, w5Var2, i4) || b7.f(w5Var, j) != b7.f(w5Var2, j)) {
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (!t(w5Var, w5Var2, i4) || !r6.e(b7.h(w5Var, j), b7.h(w5Var2, j))) {
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
                        zE = r6.e(b7.h(w5Var, j), b7.h(w5Var2, j));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        zE = r6.e(b7.h(w5Var, j), b7.h(w5Var2, j));
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
                        if (b7.e(w5Var, j8) != b7.e(w5Var2, j8) || !r6.e(b7.h(w5Var, j), b7.h(w5Var2, j))) {
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
            } else if (w5Var.zzc.equals(w5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x034a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r29, com.google.android.gms.internal.consent_sdk.e6 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.k6.d(java.lang.Object, com.google.android.gms.internal.consent_sdk.e6):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.consent_sdk.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.k6.e(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0642 A[PHI: r21 r22
  0x0642: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:264:0x07e8, B:260:0x07c8, B:243:0x074a, B:229:0x06e1, B:225:0x06c1, B:221:0x06a3, B:214:0x0663, B:208:0x0640] A[DONT_GENERATE, DONT_INLINE]
  0x0642: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:264:0x07e8, B:260:0x07c8, B:243:0x074a, B:229:0x06e1, B:225:0x06c1, B:221:0x06a3, B:214:0x0663, B:208:0x0640] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x078a A[PHI: r21 r22
  0x078a: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:268:0x0808, B:253:0x0788] A[DONT_GENERATE, DONT_INLINE]
  0x078a: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:268:0x0808, B:253:0x0788] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x035d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.consent_sdk.l5 r28) {
        /*
            Method dump skipped, instructions count: 2778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.k6.f(com.google.android.gms.internal.consent_sdk.l5):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final boolean g(Object obj) {
        int i4;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f19397e) {
            int i15 = this.f19396d[i13];
            int[] iArr = this.f19393a;
            int i16 = iArr[i15];
            int iM = m(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f19392h.getInt(obj, i18);
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
            if ((268435456 & iM) == 0 || v(obj, i10, i4, i11, i19)) {
                int iL = l(iM);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!i(i16, i10, obj) || o(i10).g(b7.h(obj, iM & 1048575))) {
                                i13++;
                                i14 = i4;
                                i12 = i11;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                g6 g6Var = (g6) b7.h(obj, iM & 1048575);
                                if (g6Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i10 / 3;
                                    if (((e7) ((f6) this.f19394b[i21 + i21]).f19346a.f19458b).f19340a == f7.f19354i) {
                                        q6 q6VarA = null;
                                        for (Object obj2 : g6Var.values()) {
                                            if (q6VarA == null) {
                                                q6VarA = n6.f19445c.a(obj2.getClass());
                                            }
                                            if (!q6VarA.g(obj2)) {
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
                    List list = (List) b7.h(obj, iM & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        q6 q6VarO = o(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (q6VarO.g(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i4;
                    i12 = i11;
                } else if (!v(obj, i10, i4, i11, i19) || o(i10).g(b7.h(obj, iM & 1048575))) {
                    i13++;
                    i14 = i4;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean i(int i4, int i10, Object obj) {
        return b7.e(obj, (long) (this.f19393a[i10 + 2] & 1048575)) == i4;
    }

    public final int m(int i4) {
        return this.f19393a[i4 + 1];
    }

    public final q6 o(int i4) {
        int i10 = i4 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f19394b;
        q6 q6Var = (q6) objArr[i11];
        if (q6Var != null) {
            return q6Var;
        }
        q6 q6VarA = n6.f19445c.a((Class) objArr[i11 + 1]);
        objArr[i11] = q6VarA;
        return q6VarA;
    }

    public final void q(int i4, Object obj, Object obj2) {
        if (u(i4, obj2)) {
            int iM = m(i4) & 1048575;
            Unsafe unsafe = f19392h;
            long j = iM;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19393a[i4] + " is present but null: " + obj2.toString());
            }
            q6 q6VarO = o(i4);
            if (!u(i4, obj)) {
                if (h(object)) {
                    w5 w5VarZzc = q6VarO.zzc();
                    q6VarO.e(w5VarZzc, object);
                    unsafe.putObject(obj, j, w5VarZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                s(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!h(object2)) {
                w5 w5VarZzc2 = q6VarO.zzc();
                q6VarO.e(w5VarZzc2, object2);
                unsafe.putObject(obj, j, w5VarZzc2);
                object2 = w5VarZzc2;
            }
            q6VarO.e(object2, object);
        }
    }

    public final void r(int i4, Object obj, Object obj2) {
        int[] iArr = this.f19393a;
        int i10 = iArr[i4];
        if (i(i10, i4, obj2)) {
            int iM = m(i4) & 1048575;
            Unsafe unsafe = f19392h;
            long j = iM;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
            }
            q6 q6VarO = o(i4);
            if (!i(i10, i4, obj)) {
                if (h(object)) {
                    w5 w5VarZzc = q6VarO.zzc();
                    q6VarO.e(w5VarZzc, object);
                    unsafe.putObject(obj, j, w5VarZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                b7.j(iArr[i4 + 2] & 1048575, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!h(object2)) {
                w5 w5VarZzc2 = q6VarO.zzc();
                q6VarO.e(w5VarZzc2, object2);
                unsafe.putObject(obj, j, w5VarZzc2);
                object2 = w5VarZzc2;
            }
            q6VarO.e(object2, object);
        }
    }

    public final void s(int i4, Object obj) {
        int i10 = this.f19393a[i4 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        b7.j(j, obj, (1 << (i10 >>> 20)) | b7.e(obj, j));
    }

    public final boolean t(w5 w5Var, w5 w5Var2, int i4) {
        return u(i4, w5Var) == u(i4, w5Var2);
    }

    public final boolean u(int i4, Object obj) {
        int i10 = this.f19393a[i4 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int iM = m(i4);
            long j8 = iM & 1048575;
            switch (l(iM)) {
                case 0:
                    if (Double.doubleToRawLongBits(b7.f19280c.a(obj, j8)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(b7.f19280c.b(obj, j8)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (b7.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (b7.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (b7.e(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (b7.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (b7.e(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return b7.f19280c.g(obj, j8);
                case 8:
                    Object objH = b7.h(obj, j8);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof p5)) {
                            throw new IllegalArgumentException();
                        }
                        if (p5.f19462c.equals(objH)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (b7.h(obj, j8) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (p5.f19462c.equals(b7.h(obj, j8))) {
                        return false;
                    }
                    break;
                case 11:
                    if (b7.e(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (b7.e(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (b7.e(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (b7.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (b7.e(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (b7.f(obj, j8) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (b7.h(obj, j8) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & b7.e(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i4, int i10, int i11, int i12) {
        return i10 == 1048575 ? u(i4, obj) : (i11 & i12) != 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final w5 zzc() {
        return (w5) ((w5) this.f19395c).f(4);
    }
}
