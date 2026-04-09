package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3987x;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p0;
import com.google.ar.core.ImageFormat;
import f.AbstractC5487d;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class P implements c0 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f30793r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f30794s = m0.B();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f30795a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f30796b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30797c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30798d;

    /* renamed from: e, reason: collision with root package name */
    private final M f30799e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30800f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f30801g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f30802h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f30803i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f30804j;

    /* renamed from: k, reason: collision with root package name */
    private final int f30805k;

    /* renamed from: l, reason: collision with root package name */
    private final int f30806l;

    /* renamed from: m, reason: collision with root package name */
    private final S f30807m;

    /* renamed from: n, reason: collision with root package name */
    private final C f30808n;

    /* renamed from: o, reason: collision with root package name */
    private final i0 f30809o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC3979o f30810p;

    /* renamed from: q, reason: collision with root package name */
    private final H f30811q;

    private P(int[] iArr, Object[] objArr, int i10, int i11, M m10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, S s10, C c10, i0 i0Var, AbstractC3979o abstractC3979o, H h10) {
        this.f30795a = iArr;
        this.f30796b = objArr;
        this.f30797c = i10;
        this.f30798d = i11;
        this.f30801g = m10 instanceof AbstractC3985v;
        this.f30802h = z10;
        this.f30800f = abstractC3979o != null && abstractC3979o.e(m10);
        this.f30803i = z11;
        this.f30804j = iArr2;
        this.f30805k = i12;
        this.f30806l = i13;
        this.f30807m = s10;
        this.f30808n = c10;
        this.f30809o = i0Var;
        this.f30810p = abstractC3979o;
        this.f30799e = m10;
        this.f30811q = h10;
    }

    private boolean A(Object obj, int i10, int i11) {
        List list = (List) m0.A(obj, Q(i10));
        if (list.isEmpty()) {
            return true;
        }
        c0 c0VarR = r(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!c0VarR.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean B(Object obj, int i10, int i11) {
        Map mapH = this.f30811q.h(m0.A(obj, Q(i10)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f30811q.c(q(i11)).f30786c.getJavaType() != o0.c.MESSAGE) {
            return true;
        }
        c0 c0VarC = null;
        for (Object obj2 : mapH.values()) {
            if (c0VarC == null) {
                c0VarC = Y.a().c(obj2.getClass());
            }
            if (!c0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i10) {
        long jX = X(i10) & 1048575;
        return m0.x(obj, jX) == m0.x(obj2, jX);
    }

    private boolean D(Object obj, int i10, int i11) {
        return m0.x(obj, (long) (X(i11) & 1048575)) == i10;
    }

    private static boolean E(int i10) {
        return (i10 & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
    }

    private static List F(Object obj, long j10) {
        return (List) m0.A(obj, j10);
    }

    private static long G(Object obj, long j10) {
        return m0.y(obj, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0 = r16.f30805k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r0 >= r16.f30806l) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r13 = n(r19, r16.f30804j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r13 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(androidx.datastore.preferences.protobuf.i0 r17, androidx.datastore.preferences.protobuf.AbstractC3979o r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.b0 r20, androidx.datastore.preferences.protobuf.C3978n r21) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.H(androidx.datastore.preferences.protobuf.i0, androidx.datastore.preferences.protobuf.o, java.lang.Object, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.n):void");
    }

    private final void I(Object obj, int i10, Object obj2, C3978n c3978n, b0 b0Var) {
        long jQ = Q(h0(i10));
        Object objA = m0.A(obj, jQ);
        if (objA == null) {
            objA = this.f30811q.e(obj2);
            m0.O(obj, jQ, objA);
        } else if (this.f30811q.g(objA)) {
            Object objE = this.f30811q.e(obj2);
            this.f30811q.a(objE, objA);
            m0.O(obj, jQ, objE);
            objA = objE;
        }
        b0Var.K(this.f30811q.d(objA), this.f30811q.c(obj2), c3978n);
    }

    private void J(Object obj, Object obj2, int i10) {
        long jQ = Q(h0(i10));
        if (x(obj2, i10)) {
            Object objA = m0.A(obj, jQ);
            Object objA2 = m0.A(obj2, jQ);
            if (objA != null && objA2 != null) {
                m0.O(obj, jQ, AbstractC3987x.h(objA, objA2));
                d0(obj, i10);
            } else if (objA2 != null) {
                m0.O(obj, jQ, objA2);
                d0(obj, i10);
            }
        }
    }

    private void K(Object obj, Object obj2, int i10) {
        int iH0 = h0(i10);
        int iP = P(i10);
        long jQ = Q(iH0);
        if (D(obj2, iP, i10)) {
            Object objA = m0.A(obj, jQ);
            Object objA2 = m0.A(obj2, jQ);
            if (objA != null && objA2 != null) {
                m0.O(obj, jQ, AbstractC3987x.h(objA, objA2));
                e0(obj, iP, i10);
            } else if (objA2 != null) {
                m0.O(obj, jQ, objA2);
                e0(obj, iP, i10);
            }
        }
    }

    private void L(Object obj, Object obj2, int i10) {
        int iH0 = h0(i10);
        long jQ = Q(iH0);
        int iP = P(i10);
        switch (g0(iH0)) {
            case 0:
                if (x(obj2, i10)) {
                    m0.K(obj, jQ, m0.v(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 1:
                if (x(obj2, i10)) {
                    m0.L(obj, jQ, m0.w(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 2:
                if (x(obj2, i10)) {
                    m0.N(obj, jQ, m0.y(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 3:
                if (x(obj2, i10)) {
                    m0.N(obj, jQ, m0.y(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 4:
                if (x(obj2, i10)) {
                    m0.M(obj, jQ, m0.x(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 5:
                if (x(obj2, i10)) {
                    m0.N(obj, jQ, m0.y(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 6:
                if (x(obj2, i10)) {
                    m0.M(obj, jQ, m0.x(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 7:
                if (x(obj2, i10)) {
                    m0.E(obj, jQ, m0.p(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 8:
                if (x(obj2, i10)) {
                    m0.O(obj, jQ, m0.A(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 9:
                J(obj, obj2, i10);
                break;
            case 10:
                if (x(obj2, i10)) {
                    m0.O(obj, jQ, m0.A(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 11:
                if (x(obj2, i10)) {
                    m0.M(obj, jQ, m0.x(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 12:
                if (x(obj2, i10)) {
                    m0.M(obj, jQ, m0.x(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 13:
                if (x(obj2, i10)) {
                    m0.M(obj, jQ, m0.x(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 14:
                if (x(obj2, i10)) {
                    m0.N(obj, jQ, m0.y(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 15:
                if (x(obj2, i10)) {
                    m0.M(obj, jQ, m0.x(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 16:
                if (x(obj2, i10)) {
                    m0.N(obj, jQ, m0.y(obj2, jQ));
                    d0(obj, i10);
                    break;
                }
                break;
            case 17:
                J(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
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
                this.f30808n.d(obj, obj2, jQ);
                break;
            case 50:
                e0.E(this.f30811q, obj, obj2, jQ);
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
                if (D(obj2, iP, i10)) {
                    m0.O(obj, jQ, m0.A(obj2, jQ));
                    e0(obj, iP, i10);
                    break;
                }
                break;
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                K(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                if (D(obj2, iP, i10)) {
                    m0.O(obj, jQ, m0.A(obj2, jQ));
                    e0(obj, iP, i10);
                    break;
                }
                break;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                K(obj, obj2, i10);
                break;
        }
    }

    static P M(Class cls, K k10, S s10, C c10, i0 i0Var, AbstractC3979o abstractC3979o, H h10) {
        if (k10 instanceof a0) {
            return O((a0) k10, s10, c10, i0Var, abstractC3979o, h10);
        }
        AbstractC5487d.a(k10);
        return N(null, s10, c10, i0Var, abstractC3979o, h10);
    }

    static P N(g0 g0Var, S s10, C c10, i0 i0Var, AbstractC3979o abstractC3979o, H h10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.datastore.preferences.protobuf.P O(androidx.datastore.preferences.protobuf.a0 r35, androidx.datastore.preferences.protobuf.S r36, androidx.datastore.preferences.protobuf.C r37, androidx.datastore.preferences.protobuf.i0 r38, androidx.datastore.preferences.protobuf.AbstractC3979o r39, androidx.datastore.preferences.protobuf.H r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.O(androidx.datastore.preferences.protobuf.a0, androidx.datastore.preferences.protobuf.S, androidx.datastore.preferences.protobuf.C, androidx.datastore.preferences.protobuf.i0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.H):androidx.datastore.preferences.protobuf.P");
    }

    private int P(int i10) {
        return this.f30795a[i10];
    }

    private static long Q(int i10) {
        return i10 & 1048575;
    }

    private static boolean R(Object obj, long j10) {
        return ((Boolean) m0.A(obj, j10)).booleanValue();
    }

    private static double S(Object obj, long j10) {
        return ((Double) m0.A(obj, j10)).doubleValue();
    }

    private static float T(Object obj, long j10) {
        return ((Float) m0.A(obj, j10)).floatValue();
    }

    private static int U(Object obj, long j10) {
        return ((Integer) m0.A(obj, j10)).intValue();
    }

    private static long V(Object obj, long j10) {
        return ((Long) m0.A(obj, j10)).longValue();
    }

    private int W(int i10) {
        if (i10 < this.f30797c || i10 > this.f30798d) {
            return -1;
        }
        return f0(i10, 0);
    }

    private int X(int i10) {
        return this.f30795a[i10 + 2];
    }

    private void Y(Object obj, long j10, b0 b0Var, c0 c0Var, C3978n c3978n) {
        b0Var.L(this.f30808n.e(obj, j10), c0Var, c3978n);
    }

    private void Z(Object obj, int i10, b0 b0Var, c0 c0Var, C3978n c3978n) {
        b0Var.M(this.f30808n.e(obj, Q(i10)), c0Var, c3978n);
    }

    private void a0(Object obj, int i10, b0 b0Var) {
        if (w(i10)) {
            m0.O(obj, Q(i10), b0Var.H());
        } else if (this.f30801g) {
            m0.O(obj, Q(i10), b0Var.v());
        } else {
            m0.O(obj, Q(i10), b0Var.z());
        }
    }

    private void b0(Object obj, int i10, b0 b0Var) {
        if (w(i10)) {
            b0Var.y(this.f30808n.e(obj, Q(i10)));
        } else {
            b0Var.x(this.f30808n.e(obj, Q(i10)));
        }
    }

    private static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void d0(Object obj, int i10) {
        if (this.f30802h) {
            return;
        }
        int iX = X(i10);
        long j10 = iX & 1048575;
        m0.M(obj, j10, m0.x(obj, j10) | (1 << (iX >>> 20)));
    }

    private void e0(Object obj, int i10, int i11) {
        m0.M(obj, X(i11) & 1048575, i10);
    }

    private int f0(int i10, int i11) {
        int length = (this.f30795a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iP = P(i13);
            if (i10 == iP) {
                return i13;
            }
            if (i10 < iP) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int g0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int h0(int i10) {
        return this.f30795a[i10 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i0(java.lang.Object r18, androidx.datastore.preferences.protobuf.p0 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.i0(java.lang.Object, androidx.datastore.preferences.protobuf.p0):void");
    }

    private boolean j(Object obj, Object obj2, int i10) {
        return x(obj, i10) == x(obj2, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.p0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.j0(java.lang.Object, androidx.datastore.preferences.protobuf.p0):void");
    }

    private static boolean k(Object obj, long j10) {
        return m0.p(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.p0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.k0(java.lang.Object, androidx.datastore.preferences.protobuf.p0):void");
    }

    private static double l(Object obj, long j10) {
        return m0.v(obj, j10);
    }

    private void l0(p0 p0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            p0Var.N(i10, this.f30811q.c(q(i11)), this.f30811q.h(obj));
        }
    }

    private boolean m(Object obj, Object obj2, int i10) {
        int iH0 = h0(i10);
        long jQ = Q(iH0);
        switch (g0(iH0)) {
            case 0:
                if (j(obj, obj2, i10) && Double.doubleToLongBits(m0.v(obj, jQ)) == Double.doubleToLongBits(m0.v(obj2, jQ))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i10) && Float.floatToIntBits(m0.w(obj, jQ)) == Float.floatToIntBits(m0.w(obj2, jQ))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i10) && m0.y(obj, jQ) == m0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i10) && m0.y(obj, jQ) == m0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i10) && m0.x(obj, jQ) == m0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i10) && m0.y(obj, jQ) == m0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i10) && m0.x(obj, jQ) == m0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i10) && m0.p(obj, jQ) == m0.p(obj2, jQ)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i10) && e0.J(m0.A(obj, jQ), m0.A(obj2, jQ))) {
                    break;
                }
                break;
            case 9:
                if (j(obj, obj2, i10) && e0.J(m0.A(obj, jQ), m0.A(obj2, jQ))) {
                    break;
                }
                break;
            case 10:
                if (j(obj, obj2, i10) && e0.J(m0.A(obj, jQ), m0.A(obj2, jQ))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i10) && m0.x(obj, jQ) == m0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 12:
                if (j(obj, obj2, i10) && m0.x(obj, jQ) == m0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i10) && m0.x(obj, jQ) == m0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 14:
                if (j(obj, obj2, i10) && m0.y(obj, jQ) == m0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 15:
                if (j(obj, obj2, i10) && m0.x(obj, jQ) == m0.x(obj2, jQ)) {
                    break;
                }
                break;
            case 16:
                if (j(obj, obj2, i10) && m0.y(obj, jQ) == m0.y(obj2, jQ)) {
                    break;
                }
                break;
            case 17:
                if (j(obj, obj2, i10) && e0.J(m0.A(obj, jQ), m0.A(obj2, jQ))) {
                    break;
                }
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
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                if (C(obj, obj2, i10) && e0.J(m0.A(obj, jQ), m0.A(obj2, jQ))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void m0(int i10, Object obj, p0 p0Var) {
        if (obj instanceof String) {
            p0Var.k(i10, (String) obj);
        } else {
            p0Var.L(i10, (AbstractC3971g) obj);
        }
    }

    private final Object n(Object obj, int i10, Object obj2, i0 i0Var) {
        P(i10);
        if (m0.A(obj, Q(h0(i10))) == null) {
            return obj2;
        }
        p(i10);
        return obj2;
    }

    private void n0(i0 i0Var, Object obj, p0 p0Var) {
        i0Var.t(i0Var.g(obj), p0Var);
    }

    private static float o(Object obj, long j10) {
        return m0.w(obj, j10);
    }

    private AbstractC3987x.a p(int i10) {
        AbstractC5487d.a(this.f30796b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object q(int i10) {
        return this.f30796b[(i10 / 3) * 2];
    }

    private c0 r(int i10) {
        int i11 = (i10 / 3) * 2;
        c0 c0Var = (c0) this.f30796b[i11];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarC = Y.a().c((Class) this.f30796b[i11 + 1]);
        this.f30796b[i11] = c0VarC;
        return c0VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int s(Object obj) {
        int i10;
        int i11;
        int iH;
        int iC;
        int iF;
        boolean z10;
        int iF2;
        int i12;
        int iP;
        int iR;
        Unsafe unsafe = f30794s;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.f30795a.length) {
            int iH0 = h0(i14);
            int iP2 = P(i14);
            int iG0 = g0(iH0);
            if (iG0 <= 17) {
                i10 = this.f30795a[i14 + 2];
                int i17 = 1048575 & i10;
                int i18 = 1 << (i10 >>> 20);
                if (i17 != i13) {
                    i16 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i11 = i18;
            } else {
                i10 = (!this.f30803i || iG0 < EnumC3982s.DOUBLE_LIST_PACKED.id() || iG0 > EnumC3982s.SINT64_LIST_PACKED.id()) ? 0 : this.f30795a[i14 + 2] & 1048575;
                i11 = 0;
            }
            long jQ = Q(iH0);
            int i19 = i13;
            switch (iG0) {
                case 0:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.h(iP2, 0.0d);
                        i15 += iH;
                        break;
                    }
                case 1:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.p(iP2, 0.0f);
                        i15 += iH;
                        break;
                    }
                case 2:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.w(iP2, unsafe.getLong(obj, jQ));
                        i15 += iH;
                        break;
                    }
                case 3:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.S(iP2, unsafe.getLong(obj, jQ));
                        i15 += iH;
                        break;
                    }
                case 4:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.u(iP2, unsafe.getInt(obj, jQ));
                        i15 += iH;
                        break;
                    }
                case 5:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.n(iP2, 0L);
                        i15 += iH;
                        break;
                    }
                case 6:
                    if ((i16 & i11) != 0) {
                        iH = CodedOutputStream.l(iP2, 0);
                        i15 += iH;
                        break;
                    }
                    break;
                case 7:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.c(iP2, true);
                        i15 += iC;
                    }
                    break;
                case 8:
                    if ((i16 & i11) != 0) {
                        Object object = unsafe.getObject(obj, jQ);
                        iC = object instanceof AbstractC3971g ? CodedOutputStream.f(iP2, (AbstractC3971g) object) : CodedOutputStream.N(iP2, (String) object);
                        i15 += iC;
                    }
                    break;
                case 9:
                    if ((i16 & i11) != 0) {
                        iC = e0.o(iP2, unsafe.getObject(obj, jQ), r(i14));
                        i15 += iC;
                    }
                    break;
                case 10:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.f(iP2, (AbstractC3971g) unsafe.getObject(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 11:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.Q(iP2, unsafe.getInt(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 12:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.j(iP2, unsafe.getInt(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 13:
                    if ((i16 & i11) != 0) {
                        iF = CodedOutputStream.F(iP2, 0);
                        i15 += iF;
                    }
                    break;
                case 14:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.H(iP2, 0L);
                        i15 += iC;
                    }
                    break;
                case 15:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.J(iP2, unsafe.getInt(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 16:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.L(iP2, unsafe.getLong(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 17:
                    if ((i16 & i11) != 0) {
                        iC = CodedOutputStream.r(iP2, (M) unsafe.getObject(obj, jQ), r(i14));
                        i15 += iC;
                    }
                    break;
                case 18:
                    iC = e0.h(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iC;
                    break;
                case 19:
                    z10 = false;
                    iF2 = e0.f(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 20:
                    z10 = false;
                    iF2 = e0.m(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 21:
                    z10 = false;
                    iF2 = e0.x(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    z10 = false;
                    iF2 = e0.k(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 23:
                    z10 = false;
                    iF2 = e0.h(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 24:
                    z10 = false;
                    iF2 = e0.f(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 25:
                    z10 = false;
                    iF2 = e0.a(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 26:
                    iC = e0.u(iP2, (List) unsafe.getObject(obj, jQ));
                    i15 += iC;
                    break;
                case 27:
                    iC = e0.p(iP2, (List) unsafe.getObject(obj, jQ), r(i14));
                    i15 += iC;
                    break;
                case 28:
                    iC = e0.c(iP2, (List) unsafe.getObject(obj, jQ));
                    i15 += iC;
                    break;
                case 29:
                    iC = e0.v(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iC;
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    z10 = false;
                    iF2 = e0.d(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 31:
                    z10 = false;
                    iF2 = e0.f(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 32:
                    z10 = false;
                    iF2 = e0.h(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 33:
                    z10 = false;
                    iF2 = e0.q(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case 34:
                    z10 = false;
                    iF2 = e0.s(iP2, (List) unsafe.getObject(obj, jQ), false);
                    i15 += iF2;
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    i12 = e0.i((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 36:
                    i12 = e0.g((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 37:
                    i12 = e0.n((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 38:
                    i12 = e0.y((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 39:
                    i12 = e0.l((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 40:
                    i12 = e0.i((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 41:
                    i12 = e0.g((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 42:
                    i12 = e0.b((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 43:
                    i12 = e0.w((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 44:
                    i12 = e0.e((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 45:
                    i12 = e0.g((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 46:
                    i12 = e0.i((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 47:
                    i12 = e0.r((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 48:
                    i12 = e0.t((List) unsafe.getObject(obj, jQ));
                    if (i12 > 0) {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i12);
                        iF = iP + iR + i12;
                        i15 += iF;
                    }
                    break;
                case 49:
                    iC = e0.j(iP2, (List) unsafe.getObject(obj, jQ), r(i14));
                    i15 += iC;
                    break;
                case 50:
                    iC = this.f30811q.f(iP2, unsafe.getObject(obj, jQ), q(i14));
                    i15 += iC;
                    break;
                case 51:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.h(iP2, 0.0d);
                        i15 += iC;
                    }
                    break;
                case 52:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.p(iP2, 0.0f);
                        i15 += iC;
                    }
                    break;
                case 53:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.w(iP2, V(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 54:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.S(iP2, V(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 55:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.u(iP2, U(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 56:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.n(iP2, 0L);
                        i15 += iC;
                    }
                    break;
                case 57:
                    if (D(obj, iP2, i14)) {
                        iF = CodedOutputStream.l(iP2, 0);
                        i15 += iF;
                    }
                    break;
                case 58:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.c(iP2, true);
                        i15 += iC;
                    }
                    break;
                case 59:
                    if (D(obj, iP2, i14)) {
                        Object object2 = unsafe.getObject(obj, jQ);
                        iC = object2 instanceof AbstractC3971g ? CodedOutputStream.f(iP2, (AbstractC3971g) object2) : CodedOutputStream.N(iP2, (String) object2);
                        i15 += iC;
                    }
                    break;
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (D(obj, iP2, i14)) {
                        iC = e0.o(iP2, unsafe.getObject(obj, jQ), r(i14));
                        i15 += iC;
                    }
                    break;
                case 61:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.f(iP2, (AbstractC3971g) unsafe.getObject(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 62:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.Q(iP2, U(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 63:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.j(iP2, U(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case 64:
                    if (D(obj, iP2, i14)) {
                        iF = CodedOutputStream.F(iP2, 0);
                        i15 += iF;
                    }
                    break;
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.H(iP2, 0L);
                        i15 += iC;
                    }
                    break;
                case 66:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.J(iP2, U(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.L(iP2, V(obj, jQ));
                        i15 += iC;
                    }
                    break;
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (D(obj, iP2, i14)) {
                        iC = CodedOutputStream.r(iP2, (M) unsafe.getObject(obj, jQ), r(i14));
                        i15 += iC;
                    }
                    break;
            }
            i14 += 3;
            i13 = i19;
        }
        int iU = i15 + u(this.f30809o, obj);
        return this.f30800f ? iU + this.f30810p.c(obj).h() : iU;
    }

    private int t(Object obj) {
        int iH;
        int i10;
        int iP;
        int iR;
        Unsafe unsafe = f30794s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30795a.length; i12 += 3) {
            int iH0 = h0(i12);
            int iG0 = g0(iH0);
            int iP2 = P(i12);
            long jQ = Q(iH0);
            int i13 = (iG0 < EnumC3982s.DOUBLE_LIST_PACKED.id() || iG0 > EnumC3982s.SINT64_LIST_PACKED.id()) ? 0 : this.f30795a[i12 + 2] & 1048575;
            switch (iG0) {
                case 0:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.h(iP2, 0.0d);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.p(iP2, 0.0f);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.w(iP2, m0.y(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.S(iP2, m0.y(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.u(iP2, m0.x(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.n(iP2, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.l(iP2, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.c(iP2, true);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(obj, i12)) {
                        Object objA = m0.A(obj, jQ);
                        iH = objA instanceof AbstractC3971g ? CodedOutputStream.f(iP2, (AbstractC3971g) objA) : CodedOutputStream.N(iP2, (String) objA);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (x(obj, i12)) {
                        iH = e0.o(iP2, m0.A(obj, jQ), r(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.f(iP2, (AbstractC3971g) m0.A(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.Q(iP2, m0.x(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.j(iP2, m0.x(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.F(iP2, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.H(iP2, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.J(iP2, m0.x(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.L(iP2, m0.y(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(obj, i12)) {
                        iH = CodedOutputStream.r(iP2, (M) m0.A(obj, jQ), r(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iH = e0.h(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 19:
                    iH = e0.f(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 20:
                    iH = e0.m(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 21:
                    iH = e0.x(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    iH = e0.k(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 23:
                    iH = e0.h(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 24:
                    iH = e0.f(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 25:
                    iH = e0.a(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 26:
                    iH = e0.u(iP2, F(obj, jQ));
                    i11 += iH;
                    break;
                case 27:
                    iH = e0.p(iP2, F(obj, jQ), r(i12));
                    i11 += iH;
                    break;
                case 28:
                    iH = e0.c(iP2, F(obj, jQ));
                    i11 += iH;
                    break;
                case 29:
                    iH = e0.v(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    iH = e0.d(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 31:
                    iH = e0.f(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 32:
                    iH = e0.h(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 33:
                    iH = e0.q(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case 34:
                    iH = e0.s(iP2, F(obj, jQ), false);
                    i11 += iH;
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    i10 = e0.i((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 36:
                    i10 = e0.g((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 37:
                    i10 = e0.n((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 38:
                    i10 = e0.y((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 39:
                    i10 = e0.l((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 40:
                    i10 = e0.i((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 41:
                    i10 = e0.g((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 42:
                    i10 = e0.b((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 43:
                    i10 = e0.w((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 44:
                    i10 = e0.e((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 45:
                    i10 = e0.g((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 46:
                    i10 = e0.i((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 47:
                    i10 = e0.r((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 48:
                    i10 = e0.t((List) unsafe.getObject(obj, jQ));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f30803i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iP = CodedOutputStream.P(iP2);
                        iR = CodedOutputStream.R(i10);
                        iH = iP + iR + i10;
                        i11 += iH;
                        break;
                    }
                case 49:
                    iH = e0.j(iP2, F(obj, jQ), r(i12));
                    i11 += iH;
                    break;
                case 50:
                    iH = this.f30811q.f(iP2, m0.A(obj, jQ), q(i12));
                    i11 += iH;
                    break;
                case 51:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.h(iP2, 0.0d);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.p(iP2, 0.0f);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.w(iP2, V(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.S(iP2, V(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.u(iP2, U(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.n(iP2, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.l(iP2, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.c(iP2, true);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, iP2, i12)) {
                        Object objA2 = m0.A(obj, jQ);
                        iH = objA2 instanceof AbstractC3971g ? CodedOutputStream.f(iP2, (AbstractC3971g) objA2) : CodedOutputStream.N(iP2, (String) objA2);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (D(obj, iP2, i12)) {
                        iH = e0.o(iP2, m0.A(obj, jQ), r(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.f(iP2, (AbstractC3971g) m0.A(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.Q(iP2, U(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.j(iP2, U(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.F(iP2, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.H(iP2, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.J(iP2, U(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.L(iP2, V(obj, jQ));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (D(obj, iP2, i12)) {
                        iH = CodedOutputStream.r(iP2, (M) m0.A(obj, jQ), r(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i11 + u(this.f30809o, obj);
    }

    private int u(i0 i0Var, Object obj) {
        return i0Var.h(i0Var.g(obj));
    }

    private static int v(Object obj, long j10) {
        return m0.x(obj, j10);
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean x(Object obj, int i10) {
        if (!this.f30802h) {
            int iX = X(i10);
            return (m0.x(obj, (long) (iX & 1048575)) & (1 << (iX >>> 20))) != 0;
        }
        int iH0 = h0(i10);
        long jQ = Q(iH0);
        switch (g0(iH0)) {
            case 0:
                return m0.v(obj, jQ) != 0.0d;
            case 1:
                return m0.w(obj, jQ) != 0.0f;
            case 2:
                return m0.y(obj, jQ) != 0;
            case 3:
                return m0.y(obj, jQ) != 0;
            case 4:
                return m0.x(obj, jQ) != 0;
            case 5:
                return m0.y(obj, jQ) != 0;
            case 6:
                return m0.x(obj, jQ) != 0;
            case 7:
                return m0.p(obj, jQ);
            case 8:
                Object objA = m0.A(obj, jQ);
                if (objA instanceof String) {
                    return !((String) objA).isEmpty();
                }
                if (objA instanceof AbstractC3971g) {
                    return !AbstractC3971g.f30858b.equals(objA);
                }
                throw new IllegalArgumentException();
            case 9:
                return m0.A(obj, jQ) != null;
            case 10:
                return !AbstractC3971g.f30858b.equals(m0.A(obj, jQ));
            case 11:
                return m0.x(obj, jQ) != 0;
            case 12:
                return m0.x(obj, jQ) != 0;
            case 13:
                return m0.x(obj, jQ) != 0;
            case 14:
                return m0.y(obj, jQ) != 0;
            case 15:
                return m0.x(obj, jQ) != 0;
            case 16:
                return m0.y(obj, jQ) != 0;
            case 17:
                return m0.A(obj, jQ) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean y(Object obj, int i10, int i11, int i12) {
        return this.f30802h ? x(obj, i10) : (i11 & i12) != 0;
    }

    private static boolean z(Object obj, int i10, c0 c0Var) {
        return c0Var.d(m0.A(obj, Q(i10)));
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f30795a.length; i10 += 3) {
            L(obj, obj2, i10);
        }
        if (this.f30802h) {
            return;
        }
        e0.F(this.f30809o, obj, obj2);
        if (this.f30800f) {
            e0.D(this.f30810p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public Object b() {
        return this.f30807m.a(this.f30799e);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void c(Object obj) {
        int i10;
        int i11 = this.f30805k;
        while (true) {
            i10 = this.f30806l;
            if (i11 >= i10) {
                break;
            }
            long jQ = Q(h0(this.f30804j[i11]));
            Object objA = m0.A(obj, jQ);
            if (objA != null) {
                m0.O(obj, jQ, this.f30811q.b(objA));
            }
            i11++;
        }
        int length = this.f30804j.length;
        while (i10 < length) {
            this.f30808n.c(obj, this.f30804j[i10]);
            i10++;
        }
        this.f30809o.j(obj);
        if (this.f30800f) {
            this.f30810p.f(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r12.f30805k
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f30804j
            r4 = r4[r2]
            int r6 = r12.P(r4)
            int r7 = r12.h0(r4)
            boolean r8 = r12.f30802h
            if (r8 != 0) goto L31
            int[] r8 = r12.f30795a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r0) goto L32
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.P.f30794s
            long r10 = (long) r9
            int r3 = r0.getInt(r13, r10)
            r0 = r9
            goto L32
        L31:
            r5 = r1
        L32:
            boolean r8 = E(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.y(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r1
        L3f:
            int r8 = g0(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.B(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L67:
            boolean r5 = r12.D(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.c0 r4 = r12.r(r4)
            boolean r4 = z(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L78:
            boolean r4 = r12.A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L7f:
            boolean r5 = r12.y(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.c0 r4 = r12.r(r4)
            boolean r4 = z(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r0 = r12.f30800f
            if (r0 == 0) goto La5
            androidx.datastore.preferences.protobuf.o r0 = r12.f30810p
            androidx.datastore.preferences.protobuf.r r13 = r0.c(r13)
            boolean r13 = r13.k()
            if (r13 != 0) goto La5
            return r1
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.d(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean e(Object obj, Object obj2) {
        int length = this.f30795a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f30809o.g(obj).equals(this.f30809o.g(obj2))) {
            return false;
        }
        if (this.f30800f) {
            return this.f30810p.c(obj).equals(this.f30810p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int f(Object obj) {
        return this.f30802h ? t(obj) : s(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int g(Object obj) {
        int i10;
        int iF;
        int length = this.f30795a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iH0 = h0(i12);
            int iP = P(i12);
            long jQ = Q(iH0);
            int iHashCode = 37;
            switch (g0(iH0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.f(Double.doubleToLongBits(m0.v(obj, jQ)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(m0.w(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.f(m0.y(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.f(m0.y(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = m0.x(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.f(m0.y(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = m0.x(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.c(m0.p(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) m0.A(obj, jQ)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objA = m0.A(obj, jQ);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = m0.A(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = m0.x(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = m0.x(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = m0.x(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.f(m0.y(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = m0.x(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC3987x.f(m0.y(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objA2 = m0.A(obj, jQ);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
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
                    i10 = i11 * 53;
                    iF = m0.A(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = m0.A(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.f(Double.doubleToLongBits(S(obj, jQ)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(T(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.f(V(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.f(V(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.f(V(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.c(R(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) m0.A(obj, jQ)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = m0.A(obj, jQ).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = m0.A(obj, jQ).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.f(V(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC3987x.f(V(obj, jQ));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (D(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = m0.A(obj, jQ).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f30809o.g(obj).hashCode();
        return this.f30800f ? (iHashCode2 * 53) + this.f30810p.c(obj).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void h(Object obj, b0 b0Var, C3978n c3978n) {
        c3978n.getClass();
        H(this.f30809o, this.f30810p, obj, b0Var, c3978n);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void i(Object obj, p0 p0Var) {
        if (p0Var.i() == p0.a.DESCENDING) {
            k0(obj, p0Var);
        } else if (this.f30802h) {
            j0(obj, p0Var);
        } else {
            i0(obj, p0Var);
        }
    }
}
