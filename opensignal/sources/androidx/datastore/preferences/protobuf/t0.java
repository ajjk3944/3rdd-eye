package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class t0 implements d1 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1353n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1354o = q1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1355a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1357c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1358d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1359e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1360f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1361g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1362h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1363i;
    public final v0 j;
    public final h0 k;

    /* renamed from: l, reason: collision with root package name */
    public final l1 f1364l;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f1365m;

    public t0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, v0 v0Var, h0 h0Var, l1 l1Var, q qVar, p0 p0Var) {
        this.f1355a = iArr;
        this.f1356b = objArr;
        this.f1357c = i10;
        this.f1358d = i11;
        this.f1360f = aVar instanceof a0;
        this.f1361g = iArr2;
        this.f1362h = i12;
        this.f1363i = i13;
        this.j = v0Var;
        this.k = h0Var;
        this.f1364l = l1Var;
        this.f1359e = aVar;
        this.f1365m = p0Var;
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
            StringBuilder sbU = c7.a.u("Field ", str, " for ");
            sbU.append(cls.getName());
            sbU.append(" not found. Known fields are ");
            sbU.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbU.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void O(int i10, Object obj, l0 l0Var) throws IOException {
        if (!(obj instanceof String)) {
            l0Var.a(i10, (g) obj);
        } else {
            ((n) l0Var.f1316a).m0(i10, (String) obj);
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof a0) {
            return ((a0) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.t0 w(androidx.datastore.preferences.protobuf.c1 r33, androidx.datastore.preferences.protobuf.v0 r34, androidx.datastore.preferences.protobuf.h0 r35, androidx.datastore.preferences.protobuf.l1 r36, androidx.datastore.preferences.protobuf.q r37, androidx.datastore.preferences.protobuf.p0 r38) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.w(androidx.datastore.preferences.protobuf.c1, androidx.datastore.preferences.protobuf.v0, androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.q, androidx.datastore.preferences.protobuf.p0):androidx.datastore.preferences.protobuf.t0");
    }

    public static long x(int i10) {
        return i10 & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) q1.f1339c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) q1.f1339c.h(obj, j)).longValue();
    }

    public final int A(int i10) {
        if (i10 >= this.f1357c && i10 <= this.f1358d) {
            int[] iArr = this.f1355a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
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
        }
        return -1;
    }

    public final void B(Object obj, long j, l lVar, d1 d1Var, p pVar) throws d0 {
        int iY;
        this.k.getClass();
        b0 b0VarA = h0.a(obj, j);
        j jVar = (j) lVar.f1314d;
        int i10 = lVar.f1311a;
        if ((i10 & 7) != 3) {
            throw e0.b();
        }
        do {
            a0 a0VarI = d1Var.i();
            lVar.h(a0VarI, d1Var, pVar);
            d1Var.c(a0VarI);
            ((b1) b0VarA).add(a0VarI);
            if (jVar.c() || lVar.f1313c != 0) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == i10);
        lVar.f1313c = iY;
    }

    public final void C(Object obj, int i10, l lVar, d1 d1Var, p pVar) throws e0 {
        int iY;
        this.k.getClass();
        b0 b0VarA = h0.a(obj, i10 & 1048575);
        j jVar = (j) lVar.f1314d;
        int i11 = lVar.f1311a;
        if ((i11 & 7) != 2) {
            throw e0.b();
        }
        do {
            a0 a0VarI = d1Var.i();
            lVar.i(a0VarI, d1Var, pVar);
            d1Var.c(a0VarI);
            ((b1) b0VarA).add(a0VarI);
            if (jVar.c() || lVar.f1313c != 0) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == i11);
        lVar.f1313c = iY;
    }

    public final void D(int i10, l lVar, Object obj) throws d0 {
        j jVar = (j) lVar.f1314d;
        if ((536870912 & i10) != 0) {
            lVar.C(2);
            q1.o(obj, i10 & 1048575, jVar.x());
        } else if (!this.f1360f) {
            q1.o(obj, i10 & 1048575, lVar.k());
        } else {
            lVar.C(2);
            q1.o(obj, i10 & 1048575, jVar.w());
        }
    }

    public final void E(int i10, l lVar, Object obj) throws d0 {
        int i11 = 536870912 & i10;
        h0 h0Var = this.k;
        if (i11 != 0) {
            h0Var.getClass();
            lVar.y(h0.a(obj, i10 & 1048575), true);
        } else {
            h0Var.getClass();
            lVar.y(h0.a(obj, i10 & 1048575), false);
        }
    }

    public final void G(int i10, Object obj) {
        int i11 = this.f1355a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        q1.m((1 << (i11 >>> 20)) | q1.f1339c.f(obj, j), j, obj);
    }

    public final void H(int i10, int i11, Object obj) {
        q1.m(i10, this.f1355a[i11 + 2] & 1048575, obj);
    }

    public final void I(Object obj, int i10, a aVar) {
        f1354o.putObject(obj, L(i10) & 1048575, aVar);
        G(i10, obj);
    }

    public final void J(Object obj, int i10, int i11, a aVar) {
        f1354o.putObject(obj, L(i11) & 1048575, aVar);
        H(i10, i11, obj);
    }

    public final int L(int i10) {
        return this.f1355a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, l0 l0Var) throws IOException {
        int i10;
        int i11;
        boolean z10;
        t0 t0Var = this;
        int[] iArr = t0Var.f1355a;
        int length = iArr.length;
        Unsafe unsafe = f1354o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iL = t0Var.L(i14);
            int i16 = iArr[i14];
            int iK = K(iL);
            if (iK <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = iL;
                i11 = 1 << (i17 >>> 20);
            } else {
                i10 = iL;
                i11 = 0;
            }
            long j = i10 & i12;
            switch (iK) {
                case 0:
                    if (!t0Var.o(obj, i14, i13, i15, i11)) {
                        break;
                    } else {
                        double d6 = q1.f1339c.d(obj, j);
                        n nVar = (n) l0Var.f1316a;
                        nVar.getClass();
                        nVar.h0(i16, Double.doubleToRawLongBits(d6));
                        break;
                    }
                case 1:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        float fE = q1.f1339c.e(obj, j);
                        n nVar2 = (n) l0Var.f1316a;
                        nVar2.getClass();
                        nVar2.f0(i16, Float.floatToRawIntBits(fE));
                    }
                    t0Var = this;
                    break;
                case 2:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).r0(i16, unsafe.getLong(obj, j));
                    }
                    t0Var = this;
                    break;
                case 3:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).r0(i16, unsafe.getLong(obj, j));
                    }
                    t0Var = this;
                    break;
                case 4:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).j0(i16, unsafe.getInt(obj, j));
                    }
                    t0Var = this;
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).h0(i16, unsafe.getLong(obj, j));
                    }
                    t0Var = this;
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).f0(i16, unsafe.getInt(obj, j));
                    }
                    t0Var = this;
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).c0(i16, q1.f1339c.c(obj, j));
                    }
                    t0Var = this;
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        O(i16, unsafe.getObject(obj, j), l0Var);
                    }
                    t0Var = this;
                    break;
                case 9:
                    if (!t0Var.o(obj, i14, i13, i15, i11)) {
                        break;
                    } else {
                        ((n) l0Var.f1316a).l0(i16, (a) unsafe.getObject(obj, j), t0Var.m(i14));
                        break;
                    }
                case 10:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        l0Var.a(i16, (g) unsafe.getObject(obj, j));
                    }
                    t0Var = this;
                    break;
                case 11:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).p0(i16, unsafe.getInt(obj, j));
                    }
                    t0Var = this;
                    break;
                case 12:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).j0(i16, unsafe.getInt(obj, j));
                    }
                    t0Var = this;
                    break;
                case 13:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).f0(i16, unsafe.getInt(obj, j));
                    }
                    t0Var = this;
                    break;
                case 14:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((n) l0Var.f1316a).h0(i16, unsafe.getLong(obj, j));
                    }
                    t0Var = this;
                    break;
                case 15:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        int i19 = unsafe.getInt(obj, j);
                        ((n) l0Var.f1316a).p0(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    t0Var = this;
                    break;
                case 16:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        long j7 = unsafe.getLong(obj, j);
                        ((n) l0Var.f1316a).r0(i16, (j7 >> 63) ^ (j7 << 1));
                    }
                    t0Var = this;
                    break;
                case 17:
                    if (!t0Var.o(obj, i14, i13, i15, i11)) {
                        break;
                    } else {
                        l0Var.b(i16, unsafe.getObject(obj, j), t0Var.m(i14));
                        break;
                    }
                case 18:
                    e1.o(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 19:
                    e1.s(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 20:
                    e1.v(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 21:
                    e1.D(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 22:
                    e1.u(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 23:
                    e1.r(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 24:
                    e1.q(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 25:
                    e1.m(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 26:
                    e1.B(iArr[i14], (List) unsafe.getObject(obj, j), l0Var);
                    break;
                case 27:
                    e1.w(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, t0Var.m(i14));
                    break;
                case 28:
                    e1.n(iArr[i14], (List) unsafe.getObject(obj, j), l0Var);
                    break;
                case 29:
                    z10 = false;
                    e1.C(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 30:
                    z10 = false;
                    e1.p(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 31:
                    z10 = false;
                    e1.x(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 32:
                    z10 = false;
                    e1.y(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 33:
                    z10 = false;
                    e1.z(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 34:
                    z10 = false;
                    e1.A(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 35:
                    e1.o(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 36:
                    e1.s(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 37:
                    e1.v(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 38:
                    e1.D(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 39:
                    e1.u(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 40:
                    e1.r(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 41:
                    e1.q(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 42:
                    e1.m(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 43:
                    e1.C(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 44:
                    e1.p(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 45:
                    e1.x(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 46:
                    e1.y(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 47:
                    e1.z(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 48:
                    e1.A(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 49:
                    e1.t(iArr[i14], (List) unsafe.getObject(obj, j), l0Var, t0Var.m(i14));
                    break;
                case 50:
                    t0Var.N(l0Var, i16, unsafe.getObject(obj, j), i14);
                    break;
                case 51:
                    if (t0Var.q(i16, i14, obj)) {
                        double dDoubleValue = ((Double) q1.f1339c.h(obj, j)).doubleValue();
                        n nVar3 = (n) l0Var.f1316a;
                        nVar3.getClass();
                        nVar3.h0(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (t0Var.q(i16, i14, obj)) {
                        float fFloatValue = ((Float) q1.f1339c.h(obj, j)).floatValue();
                        n nVar4 = (n) l0Var.f1316a;
                        nVar4.getClass();
                        nVar4.f0(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).r0(i16, z(obj, j));
                    }
                    break;
                case 54:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).r0(i16, z(obj, j));
                    }
                    break;
                case 55:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).j0(i16, y(obj, j));
                    }
                    break;
                case 56:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).h0(i16, z(obj, j));
                    }
                    break;
                case 57:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).f0(i16, y(obj, j));
                    }
                    break;
                case 58:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).c0(i16, ((Boolean) q1.f1339c.h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (t0Var.q(i16, i14, obj)) {
                        O(i16, unsafe.getObject(obj, j), l0Var);
                    }
                    break;
                case 60:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).l0(i16, (a) unsafe.getObject(obj, j), t0Var.m(i14));
                    }
                    break;
                case 61:
                    if (t0Var.q(i16, i14, obj)) {
                        l0Var.a(i16, (g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).p0(i16, y(obj, j));
                    }
                    break;
                case 63:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).j0(i16, y(obj, j));
                    }
                    break;
                case 64:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).f0(i16, y(obj, j));
                    }
                    break;
                case 65:
                    if (t0Var.q(i16, i14, obj)) {
                        ((n) l0Var.f1316a).h0(i16, z(obj, j));
                    }
                    break;
                case 66:
                    if (t0Var.q(i16, i14, obj)) {
                        int iY = y(obj, j);
                        ((n) l0Var.f1316a).p0(i16, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (t0Var.q(i16, i14, obj)) {
                        long jZ = z(obj, j);
                        ((n) l0Var.f1316a).r0(i16, (jZ << 1) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (t0Var.q(i16, i14, obj)) {
                        l0Var.b(i16, unsafe.getObject(obj, j), t0Var.m(i14));
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        t0Var.f1364l.getClass();
        ((a0) obj).unknownFields.d(l0Var);
    }

    public final void N(l0 l0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object obj2 = this.f1356b[(i11 / 3) * 2];
            this.f1365m.getClass();
            m0 m0Var = ((n0) obj2).f1327a;
            n nVar = (n) l0Var.f1316a;
            nVar.getClass();
            for (Map.Entry entry : ((o0) obj).entrySet()) {
                nVar.o0(i10, 2);
                nVar.q0(n0.a(m0Var, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                t.b(nVar, m0Var.f1317a, 1, key);
                t.b(nVar, m0Var.f1318b, 2, value);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.a(java.lang.Object, java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void b(Object obj, l0 l0Var) throws IOException {
        l0Var.getClass();
        n nVar = (n) l0Var.f1316a;
        if (x1.ASCENDING != x1.DESCENDING) {
            M(obj, l0Var);
            return;
        }
        this.f1364l.getClass();
        ((a0) obj).unknownFields.d(l0Var);
        int[] iArr = this.f1355a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iL = L(length);
            int i10 = iArr[length];
            switch (K(iL)) {
                case 0:
                    if (n(length, obj)) {
                        double d6 = q1.f1339c.d(obj, iL & 1048575);
                        nVar.getClass();
                        nVar.h0(i10, Double.doubleToRawLongBits(d6));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n(length, obj)) {
                        float fE = q1.f1339c.e(obj, iL & 1048575);
                        nVar.getClass();
                        nVar.f0(i10, Float.floatToRawIntBits(fE));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n(length, obj)) {
                        nVar.r0(i10, q1.f1339c.g(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n(length, obj)) {
                        nVar.r0(i10, q1.f1339c.g(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n(length, obj)) {
                        nVar.j0(i10, q1.f1339c.f(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (n(length, obj)) {
                        nVar.h0(i10, q1.f1339c.g(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(length, obj)) {
                        nVar.f0(i10, q1.f1339c.f(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(length, obj)) {
                        nVar.c0(i10, q1.f1339c.c(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(length, obj)) {
                        O(i10, q1.f1339c.h(obj, iL & 1048575), l0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (n(length, obj)) {
                        nVar.l0(i10, (a) q1.f1339c.h(obj, iL & 1048575), m(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n(length, obj)) {
                        l0Var.a(i10, (g) q1.f1339c.h(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n(length, obj)) {
                        nVar.p0(i10, q1.f1339c.f(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n(length, obj)) {
                        nVar.j0(i10, q1.f1339c.f(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n(length, obj)) {
                        nVar.f0(i10, q1.f1339c.f(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n(length, obj)) {
                        nVar.h0(i10, q1.f1339c.g(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n(length, obj)) {
                        int iF = q1.f1339c.f(obj, iL & 1048575);
                        nVar.p0(i10, (iF >> 31) ^ (iF << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n(length, obj)) {
                        long jG = q1.f1339c.g(obj, iL & 1048575);
                        nVar.r0(i10, (jG >> 63) ^ (jG << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (n(length, obj)) {
                        l0Var.b(i10, q1.f1339c.h(obj, iL & 1048575), m(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    e1.o(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 19:
                    e1.s(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 20:
                    e1.v(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 21:
                    e1.D(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 22:
                    e1.u(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 23:
                    e1.r(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 24:
                    e1.q(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 25:
                    e1.m(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 26:
                    e1.B(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var);
                    break;
                case 27:
                    e1.w(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, m(length));
                    break;
                case 28:
                    e1.n(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var);
                    break;
                case 29:
                    e1.C(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 30:
                    e1.p(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 31:
                    e1.x(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 32:
                    e1.y(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 33:
                    e1.z(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 34:
                    e1.A(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, false);
                    break;
                case 35:
                    e1.o(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 36:
                    e1.s(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 37:
                    e1.v(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 38:
                    e1.D(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 39:
                    e1.u(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 40:
                    e1.r(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 41:
                    e1.q(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 42:
                    e1.m(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 43:
                    e1.C(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 44:
                    e1.p(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 45:
                    e1.x(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 46:
                    e1.y(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 47:
                    e1.z(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 48:
                    e1.A(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, true);
                    break;
                case 49:
                    e1.t(iArr[length], (List) q1.f1339c.h(obj, iL & 1048575), l0Var, m(length));
                    break;
                case 50:
                    N(l0Var, i10, q1.f1339c.h(obj, iL & 1048575), length);
                    break;
                case 51:
                    if (q(i10, length, obj)) {
                        double dDoubleValue = ((Double) q1.f1339c.h(obj, iL & 1048575)).doubleValue();
                        nVar.getClass();
                        nVar.h0(i10, Double.doubleToRawLongBits(dDoubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i10, length, obj)) {
                        float fFloatValue = ((Float) q1.f1339c.h(obj, iL & 1048575)).floatValue();
                        nVar.getClass();
                        nVar.f0(i10, Float.floatToRawIntBits(fFloatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i10, length, obj)) {
                        nVar.r0(i10, z(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i10, length, obj)) {
                        nVar.r0(i10, z(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i10, length, obj)) {
                        nVar.j0(i10, y(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i10, length, obj)) {
                        nVar.h0(i10, z(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i10, length, obj)) {
                        nVar.f0(i10, y(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i10, length, obj)) {
                        nVar.c0(i10, ((Boolean) q1.f1339c.h(obj, iL & 1048575)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i10, length, obj)) {
                        O(i10, q1.f1339c.h(obj, iL & 1048575), l0Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i10, length, obj)) {
                        nVar.l0(i10, (a) q1.f1339c.h(obj, iL & 1048575), m(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i10, length, obj)) {
                        l0Var.a(i10, (g) q1.f1339c.h(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i10, length, obj)) {
                        nVar.p0(i10, y(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i10, length, obj)) {
                        nVar.j0(i10, y(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i10, length, obj)) {
                        nVar.f0(i10, y(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i10, length, obj)) {
                        nVar.h0(i10, z(obj, iL & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i10, length, obj)) {
                        int iY = y(obj, iL & 1048575);
                        nVar.p0(i10, (iY >> 31) ^ (iY << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i10, length, obj)) {
                        long jZ = z(obj, iL & 1048575);
                        nVar.r0(i10, (jZ >> 63) ^ (jZ << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i10, length, obj)) {
                        l0Var.b(i10, q1.f1339c.h(obj, iL & 1048575), m(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // androidx.datastore.preferences.protobuf.d1
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
            boolean r0 = r10 instanceof androidx.datastore.preferences.protobuf.a0
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r10
            androidx.datastore.preferences.protobuf.a0 r0 = (androidx.datastore.preferences.protobuf.a0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.k(r2)
            r0.memoizedHashCode = r1
            r0.h()
        L1b:
            int[] r0 = r9.f1355a
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
            sun.misc.Unsafe r4 = androidx.datastore.preferences.protobuf.t0.f1354o
            java.lang.Object r7 = r4.getObject(r10, r5)
            if (r7 == 0) goto L93
            androidx.datastore.preferences.protobuf.p0 r8 = r9.f1365m
            r8.getClass()
            r8 = r7
            androidx.datastore.preferences.protobuf.o0 r8 = (androidx.datastore.preferences.protobuf.o0) r8
            r8.f1331a = r1
            r4.putObject(r10, r5, r7)
            goto L93
        L54:
            androidx.datastore.preferences.protobuf.h0 r4 = r9.k
            r4.getClass()
            androidx.datastore.preferences.protobuf.p1 r4 = androidx.datastore.preferences.protobuf.q1.f1339c
            java.lang.Object r4 = r4.h(r10, r5)
            androidx.datastore.preferences.protobuf.b0 r4 = (androidx.datastore.preferences.protobuf.b0) r4
            androidx.datastore.preferences.protobuf.b r4 = (androidx.datastore.preferences.protobuf.b) r4
            boolean r5 = r4.f1247a
            if (r5 == 0) goto L93
            r4.f1247a = r1
            goto L93
        L6a:
            r4 = r0[r3]
            boolean r4 = r9.q(r4, r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.d1 r4 = r9.m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.t0.f1354o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.c(r5)
            goto L93
        L80:
            boolean r4 = r9.n(r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.d1 r4 = r9.m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.t0.f1354o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.c(r5)
        L93:
            int r3 = r3 + 3
            goto L1f
        L96:
            androidx.datastore.preferences.protobuf.l1 r0 = r9.f1364l
            r0.getClass()
            androidx.datastore.preferences.protobuf.a0 r10 = (androidx.datastore.preferences.protobuf.a0) r10
            androidx.datastore.preferences.protobuf.k1 r10 = r10.unknownFields
            boolean r0 = r10.f1310e
            if (r0 == 0) goto La5
            r10.f1310e = r1
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.c(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f1362h) {
            int i16 = this.f1361g[i15];
            int[] iArr = this.f1355a;
            int i17 = iArr[i16];
            int iL = L(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f1354o.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iL) == 0 || o(obj, i11, i10, i12, i20)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i11, i10, i12, i20)) {
                        if (!m(i11).d(q1.f1339c.h(obj, iL & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i17, i11, obj)) {
                                if (!m(i11).d(q1.f1339c.h(obj, iL & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = q1.f1339c.h(obj, iL & 1048575);
                                this.f1365m.getClass();
                                o0 o0Var = (o0) objH;
                                if (o0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((n0) this.f1356b[(i11 / 3) * 2]).f1327a.f1318b.getJavaType() != w1.MESSAGE) {
                                        continue;
                                    } else {
                                        d1 d1VarA = null;
                                        for (Object obj2 : o0Var.values()) {
                                            if (d1VarA == null) {
                                                d1VarA = a1.f1244c.a(obj2.getClass());
                                            }
                                            if (!d1VarA.d(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        }
                    }
                    List list = (List) q1.f1339c.h(obj, iL & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        d1 d1VarM = m(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (d1VarM.d(list.get(i22))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    @Override // androidx.datastore.preferences.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.datastore.preferences.protobuf.a0 r17) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.e(androidx.datastore.preferences.protobuf.a0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.datastore.preferences.protobuf.a0 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.f(androidx.datastore.preferences.protobuf.a0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.datastore.preferences.protobuf.a0 r12, androidx.datastore.preferences.protobuf.a0 r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.g(androidx.datastore.preferences.protobuf.a0, androidx.datastore.preferences.protobuf.a0):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void h(java.lang.Object r19, androidx.datastore.preferences.protobuf.l r20, androidx.datastore.preferences.protobuf.p r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.h(java.lang.Object, androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.p):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final a0 i() {
        this.j.getClass();
        return ((a0) this.f1359e).i();
    }

    public final boolean j(a0 a0Var, a0 a0Var2, int i10) {
        return n(i10, a0Var) == n(i10, a0Var2);
    }

    public final void k(Object obj, int i10, Object obj2) {
        int i11 = this.f1355a[i10];
        if (q1.f1339c.h(obj, L(i10) & 1048575) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.f1356b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final d1 m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f1356b;
        d1 d1Var = (d1) objArr[i11];
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = a1.f1244c.a((Class) objArr[i11 + 1]);
        objArr[i11] = d1VarA;
        return d1VarA;
    }

    public final boolean n(int i10, Object obj) {
        int i11 = this.f1355a[i10 + 2];
        long j = i11 & 1048575;
        if (j == 1048575) {
            int iL = L(i10);
            long j7 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(q1.f1339c.d(obj, j7)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q1.f1339c.e(obj, j7)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q1.f1339c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q1.f1339c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q1.f1339c.f(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (q1.f1339c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (q1.f1339c.f(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return q1.f1339c.c(obj, j7);
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    Object objH = q1.f1339c.h(obj, j7);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof g) {
                        return !g.f1276g.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (q1.f1339c.h(obj, j7) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.f1276g.equals(q1.f1339c.h(obj, j7));
                case 11:
                    if (q1.f1339c.f(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q1.f1339c.f(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q1.f1339c.f(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q1.f1339c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q1.f1339c.f(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q1.f1339c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q1.f1339c.h(obj, j7) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & q1.f1339c.f(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? n(i10, obj) : (i12 & i13) != 0;
    }

    public final boolean q(int i10, int i11, Object obj) {
        return q1.f1339c.f(obj, (long) (this.f1355a[i11 + 2] & 1048575)) == i10;
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
    public final void r(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.p r12, androidx.datastore.preferences.protobuf.l r13) throws androidx.datastore.preferences.protobuf.d0 {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.p1 r10 = androidx.datastore.preferences.protobuf.q1.f1339c
            java.lang.Object r10 = r10.h(r9, r0)
            androidx.datastore.preferences.protobuf.p0 r2 = r8.f1365m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.o0 r10 = androidx.datastore.preferences.protobuf.o0.f1330d
            androidx.datastore.preferences.protobuf.o0 r10 = r10.b()
            androidx.datastore.preferences.protobuf.q1.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.o0 r3 = (androidx.datastore.preferences.protobuf.o0) r3
            boolean r3 = r3.f1331a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.o0 r3 = androidx.datastore.preferences.protobuf.o0.f1330d
            androidx.datastore.preferences.protobuf.o0 r3 = r3.b()
            androidx.datastore.preferences.protobuf.p0.a(r3, r10)
            androidx.datastore.preferences.protobuf.q1.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.o0 r10 = (androidx.datastore.preferences.protobuf.o0) r10
            androidx.datastore.preferences.protobuf.n0 r11 = (androidx.datastore.preferences.protobuf.n0) r11
            androidx.datastore.preferences.protobuf.m0 r9 = r11.f1327a
            r11 = 2
            r13.C(r11)
            java.lang.Object r0 = r13.f1314d
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.j) r0
            int r1 = r0.z()
            int r1 = r0.i(r1)
            java.lang.Object r2 = r9.f1319c
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
            boolean r5 = r13.D()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.e0 r5 = new androidx.datastore.preferences.protobuf.e0     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.v1 r5 = r9.f1318b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            java.lang.Object r4 = r13.o(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.v1 r5 = r9.f1317a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            r6 = 0
            java.lang.Object r3 = r13.o(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.d0 -> L8e
            goto L55
        L8e:
            boolean r5 = r13.D()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.e0 r9 = new androidx.datastore.preferences.protobuf.e0     // Catch: java.lang.Throwable -> L79
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.r(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.l):void");
    }

    public final void s(Object obj, int i10, Object obj2) {
        if (n(i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f1354o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1355a[i10] + " is present but null: " + obj2);
            }
            d1 d1VarM = m(i10);
            if (!n(i10, obj)) {
                if (p(object)) {
                    a0 a0VarI = d1VarM.i();
                    d1VarM.a(a0VarI, object);
                    unsafe.putObject(obj, jL, a0VarI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                a0 a0VarI2 = d1VarM.i();
                d1VarM.a(a0VarI2, object2);
                unsafe.putObject(obj, jL, a0VarI2);
                object2 = a0VarI2;
            }
            d1VarM.a(object2, object);
        }
    }

    public final void t(Object obj, int i10, Object obj2) {
        int[] iArr = this.f1355a;
        int i11 = iArr[i10];
        if (q(i11, i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f1354o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            d1 d1VarM = m(i10);
            if (!q(i11, i10, obj)) {
                if (p(object)) {
                    a0 a0VarI = d1VarM.i();
                    d1VarM.a(a0VarI, object);
                    unsafe.putObject(obj, jL, a0VarI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                a0 a0VarI2 = d1VarM.i();
                d1VarM.a(a0VarI2, object2);
                unsafe.putObject(obj, jL, a0VarI2);
                object2 = a0VarI2;
            }
            d1VarM.a(object2, object);
        }
    }

    public final Object u(int i10, Object obj) {
        d1 d1VarM = m(i10);
        long jL = L(i10) & 1048575;
        if (!n(i10, obj)) {
            return d1VarM.i();
        }
        Object object = f1354o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        a0 a0VarI = d1VarM.i();
        if (object != null) {
            d1VarM.a(a0VarI, object);
        }
        return a0VarI;
    }

    public final Object v(int i10, int i11, Object obj) {
        d1 d1VarM = m(i11);
        if (!q(i10, i11, obj)) {
            return d1VarM.i();
        }
        Object object = f1354o.getObject(obj, L(i11) & 1048575);
        if (p(object)) {
            return object;
        }
        a0 a0VarI = d1VarM.i();
        if (object != null) {
            d1VarM.a(a0VarI, object);
        }
        return a0VarI;
    }
}
