package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k64 implements v64 {
    public static final int[] k = new int[0];
    public static final Unsafe l = g74.o();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final s44 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final pz j;

    public k64(int[] iArr, Object[] objArr, int i, int i2, s44 s44Var, int[] iArr2, int i3, int i4, pz pzVar, t24 t24Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = s44Var instanceof p54;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = pzVar;
        this.e = s44Var;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            ex0.q(sb, "Field ", str, " for ", name);
            throw new RuntimeException(ex0.k(sb, " not found. Known fields are ", string), e);
        }
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof p54) {
            return ((p54) obj).h();
        }
        return true;
    }

    public static void n(Object obj) {
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int o(long j, Object obj) {
        return ((Integer) g74.k(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) g74.k(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i2, j74 j74Var, Class cls, v44 v44Var) throws a64 {
        j74 j74Var2 = j74.h;
        switch (j74Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                v44Var.c = Double.valueOf(Double.longBitsToDouble(m54.W(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                v44Var.c = Float.valueOf(Float.intBitsToFloat(m54.Q(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iO = m54.O(bArr, i, v44Var);
                v44Var.c = Long.valueOf(v44Var.b);
                return iO;
            case 4:
            case 12:
            case 13:
                int iC = m54.C(bArr, i, v44Var);
                v44Var.c = Integer.valueOf(v44Var.a);
                return iC;
            case 5:
            case 15:
                int i5 = i + 8;
                v44Var.c = Long.valueOf(m54.W(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                v44Var.c = Integer.valueOf(m54.Q(i, bArr));
                return i6;
            case 7:
                int iO2 = m54.O(bArr, i, v44Var);
                v44Var.c = Boolean.valueOf(v44Var.b != 0);
                return iO2;
            case 8:
                return m54.Y(bArr, i, v44Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                v64 v64VarA = p64.c.a(cls);
                p54 p54VarA = v64VarA.a();
                int iB0 = m54.b0(p54VarA, v64VarA, bArr, i, i2, v44Var);
                v64VarA.h(p54VarA);
                v44Var.c = p54VarA;
                return iB0;
            case 11:
                return m54.a0(bArr, i, v44Var);
            case 16:
                int iC2 = m54.C(bArr, i, v44Var);
                v44Var.c = Integer.valueOf(m0.h(v44Var.a));
                return iC2;
            case 17:
                int iO3 = m54.O(bArr, i, v44Var);
                v44Var.c = Long.valueOf(m0.i(v44Var.b));
                return iO3;
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
    public static defpackage.k64 z(defpackage.r64 r35, defpackage.pz r36, defpackage.t24 r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.z(r64, pz, t24):k64");
    }

    public final void B(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(ga1.f(i2, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            v64 v64VarD = D(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    p54 p54VarA = v64VarD.a();
                    v64VarD.d(p54VarA, object);
                    unsafe.putObject(obj, j, p54VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                p54 p54VarA2 = v64VarD.a();
                v64VarD.d(p54VarA2, object2);
                unsafe.putObject(obj, j, p54VarA2);
                object2 = p54VarA2;
            }
            v64VarD.d(object2, object);
        }
    }

    public final void C(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, obj2, i)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(ga1.f(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            v64 v64VarD = D(i);
            if (!u(i2, obj, i)) {
                if (m(object)) {
                    p54 p54VarA = v64VarD.a();
                    v64VarD.d(p54VarA, object);
                    unsafe.putObject(obj, j, p54VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                v(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                p54 p54VarA2 = v64VarD.a();
                v64VarD.d(p54VarA2, object2);
                unsafe.putObject(obj, j, p54VarA2);
                object2 = p54VarA2;
            }
            v64VarD.d(object2, object);
        }
    }

    public final v64 D(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        v64 v64Var = (v64) objArr[i3];
        if (v64Var != null) {
            return v64Var;
        }
        v64 v64VarA = p64.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = v64VarA;
        return v64VarA;
    }

    public final Object E(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final s54 F(int i) {
        int i2 = i / 3;
        return (s54) this.b[i2 + i2 + 1];
    }

    public final Object G(int i, Object obj) {
        v64 v64VarD = D(i);
        int iK = k(i) & 1048575;
        if (!s(i, obj)) {
            return v64VarD.a();
        }
        Object object = l.getObject(obj, iK);
        if (m(object)) {
            return object;
        }
        p54 p54VarA = v64VarD.a();
        if (object != null) {
            v64VarD.d(p54VarA, object);
        }
        return p54VarA;
    }

    public final void H(int i, Object obj, Object obj2) {
        l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, Object obj, int i2) {
        v64 v64VarD = D(i2);
        if (!u(i, obj, i2)) {
            return v64VarD.a();
        }
        Object object = l.getObject(obj, k(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        p54 p54VarA = v64VarD.a();
        if (object != null) {
            v64VarD.d(p54VarA, object);
        }
        return p54VarA;
    }

    public final void J(Object obj, int i, Object obj2, int i2) {
        l.putObject(obj, k(i2) & 1048575, obj2);
        v(i, obj, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(java.lang.Object r22, int r23, java.lang.Object r24, defpackage.pz r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.K(java.lang.Object, int, java.lang.Object, pz, java.lang.Object):java.lang.Object");
    }

    public final void L(int i, o9 o9Var, Object obj) {
        m0 m0Var = (m0) o9Var.d;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            o9Var.t(2);
            g74.l(obj, j, m0Var.v());
        } else if (!this.f) {
            g74.l(obj, j, o9Var.B());
        } else {
            o9Var.t(2);
            g74.l(obj, j, m0Var.u());
        }
    }

    @Override // defpackage.v64
    public final p54 a() {
        return ((p54) this.e).p();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.v64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.p54 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.b(p54):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07f3 A[LOOP:1: B:217:0x07f1->B:218:0x07f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.v64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r22, defpackage.o9 r23, defpackage.h54 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.c(java.lang.Object, o9, h54):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // defpackage.v64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.d(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x02f6 A[SYNTHETIC] */
    @Override // defpackage.v64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r28, defpackage.it3 r29) {
        /*
            Method dump skipped, instructions count: 2342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.e(java.lang.Object, it3):void");
    }

    @Override // defpackage.v64
    public final boolean f(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.h) {
            int i7 = this.g[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int iK = k(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = l.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iK) == 0 || r(obj, i2, i, i3, i11)) {
                int iL = l(iK);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!u(i8, obj, i2) || D(i2).f(g74.k(iK & 1048575, obj))) {
                                i5++;
                                i6 = i;
                                i4 = i3;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                g64 g64Var = (g64) g74.k(iK & 1048575, obj);
                                if (!g64Var.isEmpty() && ((j74) ((f64) E(i2)).a.h).f == k74.n) {
                                    v64 v64VarA = null;
                                    for (Object obj2 : g64Var.values()) {
                                        if (v64VarA == null) {
                                            v64VarA = p64.c.a(obj2.getClass());
                                        }
                                        if (!v64VarA.f(obj2)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        }
                    }
                    List list = (List) g74.k(iK & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        v64 v64VarD = D(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (v64VarD.f(list.get(i13))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else if (!r(obj, i2, i, i3, i11) || D(i2).f(g74.k(iK & 1048575, obj))) {
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:0x093b, code lost:
    
        if (r0.r(r1, r2, r3, r4, r5) != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x093d, code lost:
    
        r0 = r12 << 3;
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0995, code lost:
    
        if (r0.r(r1, r2, r3, r4, r5) != false) goto L328;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x062c A[PHI: r21 r22
  0x062c: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:276:0x07d2, B:272:0x07b2, B:255:0x0734, B:241:0x06cb, B:237:0x06ab, B:233:0x068d, B:226:0x064d, B:220:0x062a] A[DONT_GENERATE, DONT_INLINE]
  0x062c: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:276:0x07d2, B:272:0x07b2, B:255:0x0734, B:241:0x06cb, B:237:0x06ab, B:233:0x068d, B:226:0x064d, B:220:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0774 A[PHI: r21 r22
  0x0774: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:280:0x07f2, B:265:0x0772] A[DONT_GENERATE, DONT_INLINE]
  0x0774: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:280:0x07f2, B:265:0x0772] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    @Override // defpackage.v64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.p54 r29) {
        /*
            Method dump skipped, instructions count: 2710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.g(p54):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // defpackage.v64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m(r8)
            if (r0 != 0) goto L8
            goto L99
        L8:
            boolean r0 = r8 instanceof defpackage.p54
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            p54 r0 = (defpackage.p54) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.g(r2)
            r0.zzq = r1
            r0.i()
        L1b:
            r0 = r1
        L1c:
            int[] r2 = r7.a
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
            sun.misc.Unsafe r2 = defpackage.k64.l
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L87
            r6 = r3
            g64 r6 = (defpackage.g64) r6
            r6.f = r1
            r2.putObject(r8, r4, r3)
            goto L87
        L4f:
            java.lang.Object r2 = defpackage.g74.k(r4, r8)
            x54 r2 = (defpackage.x54) r2
            t44 r2 = (defpackage.t44) r2
            boolean r3 = r2.f
            if (r3 == 0) goto L87
            r2.f = r1
            goto L87
        L5e:
            r2 = r2[r0]
            boolean r2 = r7.u(r2, r8, r0)
            if (r2 == 0) goto L87
            v64 r2 = r7.D(r0)
            sun.misc.Unsafe r3 = defpackage.k64.l
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.h(r3)
            goto L87
        L74:
            boolean r2 = r7.s(r0, r8)
            if (r2 == 0) goto L87
            v64 r2 = r7.D(r0)
            sun.misc.Unsafe r3 = defpackage.k64.l
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.h(r3)
        L87:
            int r0 = r0 + 3
            goto L1c
        L8a:
            pz r0 = r7.j
            r0.getClass()
            p54 r8 = (defpackage.p54) r8
            b74 r8 = r8.zzt
            boolean r0 = r8.e
            if (r0 == 0) goto L99
            r8.e = r1
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.h(java.lang.Object):void");
    }

    @Override // defpackage.v64
    public final void i(Object obj, byte[] bArr, int i, int i2, v44 v44Var) {
        y(obj, bArr, i, i2, 0, v44Var);
    }

    @Override // defpackage.v64
    public final boolean j(p54 p54Var, p54 p54Var2) {
        boolean zC;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iK = k(i);
                long j = iK & 1048575;
                switch (l(iK)) {
                    case 0:
                        if (!q(p54Var, p54Var2, i)) {
                            break;
                        } else {
                            f74 f74Var = g74.c;
                            if (Double.doubleToLongBits(f74Var.y1(j, p54Var)) != Double.doubleToLongBits(f74Var.y1(j, p54Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!q(p54Var, p54Var2, i)) {
                            break;
                        } else {
                            f74 f74Var2 = g74.c;
                            if (Float.floatToIntBits(f74Var2.w1(j, p54Var)) != Float.floatToIntBits(f74Var2.w1(j, p54Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (!q(p54Var, p54Var2, i) || g74.i(j, p54Var) != g74.i(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (!q(p54Var, p54Var2, i) || g74.i(j, p54Var) != g74.i(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (!q(p54Var, p54Var2, i) || g74.g(j, p54Var) != g74.g(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (!q(p54Var, p54Var2, i) || g74.i(j, p54Var) != g74.i(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (!q(p54Var, p54Var2, i) || g74.g(j, p54Var) != g74.g(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!q(p54Var, p54Var2, i)) {
                            break;
                        } else {
                            f74 f74Var3 = g74.c;
                            if (f74Var3.t1(j, p54Var) != f74Var3.t1(j, p54Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (!q(p54Var, p54Var2, i) || !w64.c(g74.k(j, p54Var), g74.k(j, p54Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (!q(p54Var, p54Var2, i) || !w64.c(g74.k(j, p54Var), g74.k(j, p54Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (!q(p54Var, p54Var2, i) || !w64.c(g74.k(j, p54Var), g74.k(j, p54Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (!q(p54Var, p54Var2, i) || g74.g(j, p54Var) != g74.g(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (!q(p54Var, p54Var2, i) || g74.g(j, p54Var) != g74.g(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (!q(p54Var, p54Var2, i) || g74.g(j, p54Var) != g74.g(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (!q(p54Var, p54Var2, i) || g74.i(j, p54Var) != g74.i(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (!q(p54Var, p54Var2, i) || g74.g(j, p54Var) != g74.g(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (!q(p54Var, p54Var2, i) || g74.i(j, p54Var) != g74.i(j, p54Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (!q(p54Var, p54Var2, i) || !w64.c(g74.k(j, p54Var), g74.k(j, p54Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case zy1.zzm /* 21 */:
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
                        zC = w64.c(g74.k(j, p54Var), g74.k(j, p54Var2));
                        break;
                    case 50:
                        zC = w64.c(g74.k(j, p54Var), g74.k(j, p54Var2));
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
                        long j2 = iArr[i + 2] & 1048575;
                        if (g74.g(j2, p54Var) != g74.g(j2, p54Var2) || !w64.c(g74.k(j, p54Var), g74.k(j, p54Var2))) {
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
            } else if (p54Var.zzt.equals(p54Var2.zzt)) {
                return true;
            }
        }
        return false;
    }

    public final int k(int i) {
        return this.a[i + 1];
    }

    public final boolean q(p54 p54Var, p54 p54Var2, int i) {
        return s(i, p54Var) == s(i, p54Var2);
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? s(i, obj) : (i3 & i4) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iK = k(i);
            long j2 = iK & 1048575;
            switch (l(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(g74.c.y1(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(g74.c.w1(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (g74.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (g74.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (g74.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (g74.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (g74.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return g74.c.t1(j2, obj);
                case 8:
                    Object objK = g74.k(j2, obj);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objK instanceof a54)) {
                            throw new IllegalArgumentException();
                        }
                        if (a54.g.equals(objK)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (g74.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (a54.g.equals(g74.k(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (g74.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (g74.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (g74.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (g74.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (g74.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (g74.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (g74.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & g74.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        g74.h(j, obj, (1 << (i2 >>> 20)) | g74.g(j, obj));
    }

    public final boolean u(int i, Object obj, int i2) {
        return g74.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, Object obj, int i2) {
        g74.h(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
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
    public final int y(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.v44 r40) {
        /*
            Method dump skipped, instructions count: 3802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k64.y(java.lang.Object, byte[], int, int, int, v44):int");
    }
}
