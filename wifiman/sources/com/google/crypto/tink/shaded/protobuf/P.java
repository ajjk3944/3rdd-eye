package com.google.crypto.tink.shaded.protobuf;

import com.google.ar.core.ImageFormat;
import com.google.crypto.tink.shaded.protobuf.AbstractC5078e;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.o0;
import f.AbstractC5487d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class P implements c0 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f38449r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f38450s = l0.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f38451a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f38452b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38453c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38454d;

    /* renamed from: e, reason: collision with root package name */
    private final M f38455e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38456f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f38457g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f38458h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f38459i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f38460j;

    /* renamed from: k, reason: collision with root package name */
    private final int f38461k;

    /* renamed from: l, reason: collision with root package name */
    private final int f38462l;

    /* renamed from: m, reason: collision with root package name */
    private final S f38463m;

    /* renamed from: n, reason: collision with root package name */
    private final C f38464n;

    /* renamed from: o, reason: collision with root package name */
    private final h0 f38465o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC5089p f38466p;

    /* renamed from: q, reason: collision with root package name */
    private final H f38467q;

    private P(int[] iArr, Object[] objArr, int i10, int i11, M m10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, S s10, C c10, h0 h0Var, AbstractC5089p abstractC5089p, H h10) {
        this.f38451a = iArr;
        this.f38452b = objArr;
        this.f38453c = i10;
        this.f38454d = i11;
        this.f38457g = m10 instanceof AbstractC5095w;
        this.f38458h = z10;
        this.f38456f = abstractC5089p != null && abstractC5089p.e(m10);
        this.f38459i = z11;
        this.f38460j = iArr2;
        this.f38461k = i12;
        this.f38462l = i13;
        this.f38463m = s10;
        this.f38464n = c10;
        this.f38465o = h0Var;
        this.f38466p = abstractC5089p;
        this.f38455e = m10;
        this.f38467q = h10;
    }

    private static int A(Object obj, long j10) {
        return l0.z(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0(java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.o0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.A0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.o0):void");
    }

    private static boolean B(int i10) {
        return (i10 & 536870912) != 0;
    }

    private void B0(o0 o0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f38467q.c(u(i11));
            o0Var.K(i10, null, this.f38467q.h(obj));
        }
    }

    private boolean C(Object obj, int i10) {
        int iL0 = l0(i10);
        long j10 = 1048575 & iL0;
        if (j10 != 1048575) {
            return (l0.z(obj, j10) & (1 << (iL0 >>> 20))) != 0;
        }
        int iX0 = x0(i10);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                return Double.doubleToRawLongBits(l0.x(obj, jY)) != 0;
            case 1:
                return Float.floatToRawIntBits(l0.y(obj, jY)) != 0;
            case 2:
                return l0.A(obj, jY) != 0;
            case 3:
                return l0.A(obj, jY) != 0;
            case 4:
                return l0.z(obj, jY) != 0;
            case 5:
                return l0.A(obj, jY) != 0;
            case 6:
                return l0.z(obj, jY) != 0;
            case 7:
                return l0.r(obj, jY);
            case 8:
                Object objC = l0.C(obj, jY);
                if (objC instanceof String) {
                    return !((String) objC).isEmpty();
                }
                if (objC instanceof AbstractC5081h) {
                    return !AbstractC5081h.f38499b.equals(objC);
                }
                throw new IllegalArgumentException();
            case 9:
                return l0.C(obj, jY) != null;
            case 10:
                return !AbstractC5081h.f38499b.equals(l0.C(obj, jY));
            case 11:
                return l0.z(obj, jY) != 0;
            case 12:
                return l0.z(obj, jY) != 0;
            case 13:
                return l0.z(obj, jY) != 0;
            case 14:
                return l0.A(obj, jY) != 0;
            case 15:
                return l0.z(obj, jY) != 0;
            case 16:
                return l0.A(obj, jY) != 0;
            case 17:
                return l0.C(obj, jY) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void C0(int i10, Object obj, o0 o0Var) {
        if (obj instanceof String) {
            o0Var.k(i10, (String) obj);
        } else {
            o0Var.O(i10, (AbstractC5081h) obj);
        }
    }

    private boolean D(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? C(obj, i10) : (i12 & i13) != 0;
    }

    private void D0(h0 h0Var, Object obj, o0 o0Var) {
        h0Var.t(h0Var.g(obj), o0Var);
    }

    private static boolean E(Object obj, int i10, c0 c0Var) {
        return c0Var.d(l0.C(obj, Y(i10)));
    }

    private boolean F(Object obj, int i10, int i11) {
        List list = (List) l0.C(obj, Y(i10));
        if (list.isEmpty()) {
            return true;
        }
        c0 c0VarV = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!c0VarV.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(Object obj, int i10, int i11) {
        if (this.f38467q.h(l0.C(obj, Y(i10))).isEmpty()) {
            return true;
        }
        this.f38467q.c(u(i11));
        throw null;
    }

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5095w) {
            return ((AbstractC5095w) obj).C();
        }
        return true;
    }

    private boolean I(Object obj, Object obj2, int i10) {
        long jL0 = l0(i10) & 1048575;
        return l0.z(obj, jL0) == l0.z(obj2, jL0);
    }

    private boolean J(Object obj, int i10, int i11) {
        return l0.z(obj, (long) (l0(i11) & 1048575)) == i10;
    }

    private static boolean K(int i10) {
        return (i10 & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
    }

    private static List L(Object obj, long j10) {
        return (List) l0.C(obj, j10);
    }

    private static long M(Object obj, long j10) {
        return l0.A(obj, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        r12 = r10.f38461k;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r12 >= r10.f38462l) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r3 = q(r13, r10.f38460j[r12], r3, r11, r13);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r3 == null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r11.o(r13, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N(com.google.crypto.tink.shaded.protobuf.h0 r11, com.google.crypto.tink.shaded.protobuf.AbstractC5089p r12, java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.b0 r14, com.google.crypto.tink.shaded.protobuf.C5088o r15) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.N(com.google.crypto.tink.shaded.protobuf.h0, com.google.crypto.tink.shaded.protobuf.p, java.lang.Object, com.google.crypto.tink.shaded.protobuf.b0, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    private final void O(Object obj, int i10, Object obj2, C5088o c5088o, b0 b0Var) {
        long jY = Y(x0(i10));
        Object objC = l0.C(obj, jY);
        if (objC == null) {
            objC = this.f38467q.e(obj2);
            l0.R(obj, jY, objC);
        } else if (this.f38467q.g(objC)) {
            Object objE = this.f38467q.e(obj2);
            this.f38467q.a(objE, objC);
            l0.R(obj, jY, objE);
            objC = objE;
        }
        Map mapD = this.f38467q.d(objC);
        this.f38467q.c(obj2);
        b0Var.M(mapD, null, c5088o);
    }

    private void P(Object obj, Object obj2, int i10) {
        if (C(obj2, i10)) {
            long jY = Y(x0(i10));
            Unsafe unsafe = f38450s;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + obj2);
            }
            c0 c0VarV = v(i10);
            if (!C(obj, i10)) {
                if (H(object)) {
                    Object objB = c0VarV.b();
                    c0VarV.a(objB, object);
                    unsafe.putObject(obj, jY, objB);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                r0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!H(object2)) {
                Object objB2 = c0VarV.b();
                c0VarV.a(objB2, object2);
                unsafe.putObject(obj, jY, objB2);
                object2 = objB2;
            }
            c0VarV.a(object2, object);
        }
    }

    private void Q(Object obj, Object obj2, int i10) {
        int iX = X(i10);
        if (J(obj2, iX, i10)) {
            long jY = Y(x0(i10));
            Unsafe unsafe = f38450s;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + obj2);
            }
            c0 c0VarV = v(i10);
            if (!J(obj, iX, i10)) {
                if (H(object)) {
                    Object objB = c0VarV.b();
                    c0VarV.a(objB, object);
                    unsafe.putObject(obj, jY, objB);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                s0(obj, iX, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!H(object2)) {
                Object objB2 = c0VarV.b();
                c0VarV.a(objB2, object2);
                unsafe.putObject(obj, jY, objB2);
                object2 = objB2;
            }
            c0VarV.a(object2, object);
        }
    }

    private void R(Object obj, Object obj2, int i10) {
        int iX0 = x0(i10);
        long jY = Y(iX0);
        int iX = X(i10);
        switch (w0(iX0)) {
            case 0:
                if (C(obj2, i10)) {
                    l0.N(obj, jY, l0.x(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 1:
                if (C(obj2, i10)) {
                    l0.O(obj, jY, l0.y(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 2:
                if (C(obj2, i10)) {
                    l0.Q(obj, jY, l0.A(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 3:
                if (C(obj2, i10)) {
                    l0.Q(obj, jY, l0.A(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 4:
                if (C(obj2, i10)) {
                    l0.P(obj, jY, l0.z(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 5:
                if (C(obj2, i10)) {
                    l0.Q(obj, jY, l0.A(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 6:
                if (C(obj2, i10)) {
                    l0.P(obj, jY, l0.z(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 7:
                if (C(obj2, i10)) {
                    l0.H(obj, jY, l0.r(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 8:
                if (C(obj2, i10)) {
                    l0.R(obj, jY, l0.C(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 9:
                P(obj, obj2, i10);
                break;
            case 10:
                if (C(obj2, i10)) {
                    l0.R(obj, jY, l0.C(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 11:
                if (C(obj2, i10)) {
                    l0.P(obj, jY, l0.z(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 12:
                if (C(obj2, i10)) {
                    l0.P(obj, jY, l0.z(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 13:
                if (C(obj2, i10)) {
                    l0.P(obj, jY, l0.z(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 14:
                if (C(obj2, i10)) {
                    l0.Q(obj, jY, l0.A(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 15:
                if (C(obj2, i10)) {
                    l0.P(obj, jY, l0.z(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 16:
                if (C(obj2, i10)) {
                    l0.Q(obj, jY, l0.A(obj2, jY));
                    r0(obj, i10);
                    break;
                }
                break;
            case 17:
                P(obj, obj2, i10);
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
                this.f38464n.d(obj, obj2, jY);
                break;
            case 50:
                e0.E(this.f38467q, obj, obj2, jY);
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
                if (J(obj2, iX, i10)) {
                    l0.R(obj, jY, l0.C(obj2, jY));
                    s0(obj, iX, i10);
                    break;
                }
                break;
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                Q(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                if (J(obj2, iX, i10)) {
                    l0.R(obj, jY, l0.C(obj2, jY));
                    s0(obj, iX, i10);
                    break;
                }
                break;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                Q(obj, obj2, i10);
                break;
        }
    }

    private Object S(Object obj, int i10) {
        c0 c0VarV = v(i10);
        long jY = Y(x0(i10));
        if (!C(obj, i10)) {
            return c0VarV.b();
        }
        Object object = f38450s.getObject(obj, jY);
        if (H(object)) {
            return object;
        }
        Object objB = c0VarV.b();
        if (object != null) {
            c0VarV.a(objB, object);
        }
        return objB;
    }

    private Object T(Object obj, int i10, int i11) {
        c0 c0VarV = v(i11);
        if (!J(obj, i10, i11)) {
            return c0VarV.b();
        }
        Object object = f38450s.getObject(obj, Y(x0(i11)));
        if (H(object)) {
            return object;
        }
        Object objB = c0VarV.b();
        if (object != null) {
            c0VarV.a(objB, object);
        }
        return objB;
    }

    static P U(Class cls, K k10, S s10, C c10, h0 h0Var, AbstractC5089p abstractC5089p, H h10) {
        if (k10 instanceof a0) {
            return W((a0) k10, s10, c10, h0Var, abstractC5089p, h10);
        }
        AbstractC5487d.a(k10);
        return V(null, s10, c10, h0Var, abstractC5089p, h10);
    }

    static P V(f0 f0Var, S s10, C c10, h0 h0Var, AbstractC5089p abstractC5089p, H h10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.crypto.tink.shaded.protobuf.P W(com.google.crypto.tink.shaded.protobuf.a0 r33, com.google.crypto.tink.shaded.protobuf.S r34, com.google.crypto.tink.shaded.protobuf.C r35, com.google.crypto.tink.shaded.protobuf.h0 r36, com.google.crypto.tink.shaded.protobuf.AbstractC5089p r37, com.google.crypto.tink.shaded.protobuf.H r38) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.W(com.google.crypto.tink.shaded.protobuf.a0, com.google.crypto.tink.shaded.protobuf.S, com.google.crypto.tink.shaded.protobuf.C, com.google.crypto.tink.shaded.protobuf.h0, com.google.crypto.tink.shaded.protobuf.p, com.google.crypto.tink.shaded.protobuf.H):com.google.crypto.tink.shaded.protobuf.P");
    }

    private int X(int i10) {
        return this.f38451a[i10];
    }

    private static long Y(int i10) {
        return i10 & 1048575;
    }

    private static boolean Z(Object obj, long j10) {
        return ((Boolean) l0.C(obj, j10)).booleanValue();
    }

    private static double a0(Object obj, long j10) {
        return ((Double) l0.C(obj, j10)).doubleValue();
    }

    private static float b0(Object obj, long j10) {
        return ((Float) l0.C(obj, j10)).floatValue();
    }

    private static int c0(Object obj, long j10) {
        return ((Integer) l0.C(obj, j10)).intValue();
    }

    private static long d0(Object obj, long j10) {
        return ((Long) l0.C(obj, j10)).longValue();
    }

    private int e0(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, AbstractC5078e.a aVar) {
        Unsafe unsafe = f38450s;
        Object objU = u(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.f38467q.g(object)) {
            Object objE = this.f38467q.e(objU);
            this.f38467q.a(objE, object);
            unsafe.putObject(obj, j10, objE);
            object = objE;
        }
        this.f38467q.c(objU);
        return n(bArr, i10, i11, null, this.f38467q.d(object), aVar);
    }

    private int f0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, AbstractC5078e.a aVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f38450s;
        long j11 = this.f38451a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(AbstractC5078e.d(bArr, i10)));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(AbstractC5078e.k(bArr, i10)));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int iK = AbstractC5078e.K(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Long.valueOf(aVar.f38491b));
                    unsafe.putInt(obj, j11, i13);
                    return iK;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int iH = AbstractC5078e.H(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(aVar.f38490a));
                    unsafe.putInt(obj, j11, i13);
                    return iH;
                }
                break;
            case 56:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC5078e.i(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC5078e.g(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int iK2 = AbstractC5078e.K(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(aVar.f38491b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return iK2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int iH2 = AbstractC5078e.H(bArr, i10, aVar);
                    int i22 = aVar.f38490a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !m0.n(bArr, iH2, iH2 + i22)) {
                            throw InvalidProtocolBufferException.g();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, iH2, i22, AbstractC5097y.f38598b));
                        iH2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return iH2;
                }
                break;
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                if (i14 == 2) {
                    Object objT = T(obj, i13, i17);
                    int iN = AbstractC5078e.N(objT, v(i17), bArr, i10, i11, aVar);
                    v0(obj, i13, i17, objT);
                    return iN;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int iB = AbstractC5078e.b(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, aVar.f38492c);
                    unsafe.putInt(obj, j11, i13);
                    return iB;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int iH3 = AbstractC5078e.H(bArr, i10, aVar);
                    int i23 = aVar.f38490a;
                    AbstractC5097y.c cVarT = t(i17);
                    if (cVarT == null || cVarT.a(i23)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        w(obj).n(i12, Long.valueOf(i23));
                    }
                    return iH3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int iH4 = AbstractC5078e.H(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC5082i.b(aVar.f38490a)));
                    unsafe.putInt(obj, j11, i13);
                    return iH4;
                }
                break;
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                if (i14 == 0) {
                    int iK3 = AbstractC5078e.K(bArr, i10, aVar);
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC5082i.c(aVar.f38491b)));
                    unsafe.putInt(obj, j11, i13);
                    return iK3;
                }
                break;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                if (i14 == 3) {
                    Object objT2 = T(obj, i13, i17);
                    int iM = AbstractC5078e.M(objT2, v(i17), bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    v0(obj, i13, i17, objT2);
                    return iM;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0307, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0298, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r8 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0089. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int h0(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.AbstractC5078e.a r34) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.h0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    private int i0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, AbstractC5078e.a aVar) throws InvalidProtocolBufferException {
        int I10;
        Unsafe unsafe = f38450s;
        AbstractC5097y.d dVarP = (AbstractC5097y.d) unsafe.getObject(obj, j11);
        if (!dVarP.E()) {
            int size = dVarP.size();
            dVarP = dVarP.p(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, dVarP);
        }
        switch (i16) {
            case 18:
            case ImageFormat.YUV_420_888 /* 35 */:
                if (i14 == 2) {
                    return AbstractC5078e.r(bArr, i10, dVarP, aVar);
                }
                if (i14 == 1) {
                    return AbstractC5078e.e(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return AbstractC5078e.u(bArr, i10, dVarP, aVar);
                }
                if (i14 == 5) {
                    return AbstractC5078e.l(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return AbstractC5078e.y(bArr, i10, dVarP, aVar);
                }
                if (i14 == 0) {
                    return AbstractC5078e.L(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return AbstractC5078e.x(bArr, i10, dVarP, aVar);
                }
                if (i14 == 0) {
                    return AbstractC5078e.I(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return AbstractC5078e.t(bArr, i10, dVarP, aVar);
                }
                if (i14 == 1) {
                    return AbstractC5078e.j(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return AbstractC5078e.s(bArr, i10, dVarP, aVar);
                }
                if (i14 == 5) {
                    return AbstractC5078e.h(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return AbstractC5078e.q(bArr, i10, dVarP, aVar);
                }
                if (i14 == 0) {
                    return AbstractC5078e.a(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? AbstractC5078e.C(i12, bArr, i10, i11, dVarP, aVar) : AbstractC5078e.D(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return AbstractC5078e.p(v(i15), i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return AbstractC5078e.c(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 44:
                if (i14 == 2) {
                    I10 = AbstractC5078e.x(bArr, i10, dVarP, aVar);
                } else if (i14 == 0) {
                    I10 = AbstractC5078e.I(i12, bArr, i10, i11, dVarP, aVar);
                }
                e0.z(obj, i13, dVarP, t(i15), null, this.f38465o);
                return I10;
            case 33:
            case 47:
                if (i14 == 2) {
                    return AbstractC5078e.v(bArr, i10, dVarP, aVar);
                }
                if (i14 == 0) {
                    return AbstractC5078e.z(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return AbstractC5078e.w(bArr, i10, dVarP, aVar);
                }
                if (i14 == 0) {
                    return AbstractC5078e.A(i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return AbstractC5078e.n(v(i15), i12, bArr, i10, i11, dVarP, aVar);
                }
                break;
        }
        return i10;
    }

    private int j0(int i10) {
        if (i10 < this.f38453c || i10 > this.f38454d) {
            return -1;
        }
        return t0(i10, 0);
    }

    private boolean k(Object obj, Object obj2, int i10) {
        return C(obj, i10) == C(obj2, i10);
    }

    private int k0(int i10, int i11) {
        if (i10 < this.f38453c || i10 > this.f38454d) {
            return -1;
        }
        return t0(i10, i11);
    }

    private static boolean l(Object obj, long j10) {
        return l0.r(obj, j10);
    }

    private int l0(int i10) {
        return this.f38451a[i10 + 2];
    }

    private static void m(Object obj) {
        if (H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void m0(Object obj, long j10, b0 b0Var, c0 c0Var, C5088o c5088o) {
        b0Var.N(this.f38464n.e(obj, j10), c0Var, c5088o);
    }

    private int n(byte[] bArr, int i10, int i11, F.a aVar, Map map, AbstractC5078e.a aVar2) throws InvalidProtocolBufferException {
        int iH = AbstractC5078e.H(bArr, i10, aVar2);
        int i12 = aVar2.f38490a;
        if (i12 < 0 || i12 > i11 - iH) {
            throw InvalidProtocolBufferException.s();
        }
        throw null;
    }

    private void n0(Object obj, int i10, b0 b0Var, c0 c0Var, C5088o c5088o) {
        b0Var.K(this.f38464n.e(obj, Y(i10)), c0Var, c5088o);
    }

    private static double o(Object obj, long j10) {
        return l0.x(obj, j10);
    }

    private void o0(Object obj, int i10, b0 b0Var) {
        if (B(i10)) {
            l0.R(obj, Y(i10), b0Var.H());
        } else if (this.f38457g) {
            l0.R(obj, Y(i10), b0Var.v());
        } else {
            l0.R(obj, Y(i10), b0Var.z());
        }
    }

    private boolean p(Object obj, Object obj2, int i10) {
        int iX0 = x0(i10);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                if (k(obj, obj2, i10) && Double.doubleToLongBits(l0.x(obj, jY)) == Double.doubleToLongBits(l0.x(obj2, jY))) {
                    break;
                }
                break;
            case 1:
                if (k(obj, obj2, i10) && Float.floatToIntBits(l0.y(obj, jY)) == Float.floatToIntBits(l0.y(obj2, jY))) {
                    break;
                }
                break;
            case 2:
                if (k(obj, obj2, i10) && l0.A(obj, jY) == l0.A(obj2, jY)) {
                    break;
                }
                break;
            case 3:
                if (k(obj, obj2, i10) && l0.A(obj, jY) == l0.A(obj2, jY)) {
                    break;
                }
                break;
            case 4:
                if (k(obj, obj2, i10) && l0.z(obj, jY) == l0.z(obj2, jY)) {
                    break;
                }
                break;
            case 5:
                if (k(obj, obj2, i10) && l0.A(obj, jY) == l0.A(obj2, jY)) {
                    break;
                }
                break;
            case 6:
                if (k(obj, obj2, i10) && l0.z(obj, jY) == l0.z(obj2, jY)) {
                    break;
                }
                break;
            case 7:
                if (k(obj, obj2, i10) && l0.r(obj, jY) == l0.r(obj2, jY)) {
                    break;
                }
                break;
            case 8:
                if (k(obj, obj2, i10) && e0.J(l0.C(obj, jY), l0.C(obj2, jY))) {
                    break;
                }
                break;
            case 9:
                if (k(obj, obj2, i10) && e0.J(l0.C(obj, jY), l0.C(obj2, jY))) {
                    break;
                }
                break;
            case 10:
                if (k(obj, obj2, i10) && e0.J(l0.C(obj, jY), l0.C(obj2, jY))) {
                    break;
                }
                break;
            case 11:
                if (k(obj, obj2, i10) && l0.z(obj, jY) == l0.z(obj2, jY)) {
                    break;
                }
                break;
            case 12:
                if (k(obj, obj2, i10) && l0.z(obj, jY) == l0.z(obj2, jY)) {
                    break;
                }
                break;
            case 13:
                if (k(obj, obj2, i10) && l0.z(obj, jY) == l0.z(obj2, jY)) {
                    break;
                }
                break;
            case 14:
                if (k(obj, obj2, i10) && l0.A(obj, jY) == l0.A(obj2, jY)) {
                    break;
                }
                break;
            case 15:
                if (k(obj, obj2, i10) && l0.z(obj, jY) == l0.z(obj2, jY)) {
                    break;
                }
                break;
            case 16:
                if (k(obj, obj2, i10) && l0.A(obj, jY) == l0.A(obj2, jY)) {
                    break;
                }
                break;
            case 17:
                if (k(obj, obj2, i10) && e0.J(l0.C(obj, jY), l0.C(obj2, jY))) {
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
                if (I(obj, obj2, i10) && e0.J(l0.C(obj, jY), l0.C(obj2, jY))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void p0(Object obj, int i10, b0 b0Var) {
        if (B(i10)) {
            b0Var.y(this.f38464n.e(obj, Y(i10)));
        } else {
            b0Var.x(this.f38464n.e(obj, Y(i10)));
        }
    }

    private Object q(Object obj, int i10, Object obj2, h0 h0Var, Object obj3) {
        AbstractC5097y.c cVarT;
        int iX = X(i10);
        Object objC = l0.C(obj, Y(x0(i10)));
        return (objC == null || (cVarT = t(i10)) == null) ? obj2 : r(i10, iX, this.f38467q.d(objC), cVarT, obj2, h0Var, obj3);
    }

    private static Field q0(Class cls, String str) {
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

    private Object r(int i10, int i11, Map map, AbstractC5097y.c cVar, Object obj, h0 h0Var, Object obj2) {
        this.f38467q.c(u(i10));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!cVar.a(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = h0Var.f(obj2);
                }
                AbstractC5081h.C1217h c1217hT = AbstractC5081h.T(F.a(null, entry.getKey(), entry.getValue()));
                try {
                    F.b(c1217hT.b(), null, entry.getKey(), entry.getValue());
                    h0Var.d(obj, i11, c1217hT.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj;
    }

    private void r0(Object obj, int i10) {
        int iL0 = l0(i10);
        long j10 = 1048575 & iL0;
        if (j10 == 1048575) {
            return;
        }
        l0.P(obj, j10, (1 << (iL0 >>> 20)) | l0.z(obj, j10));
    }

    private static float s(Object obj, long j10) {
        return l0.y(obj, j10);
    }

    private void s0(Object obj, int i10, int i11) {
        l0.P(obj, l0(i11) & 1048575, i10);
    }

    private AbstractC5097y.c t(int i10) {
        return (AbstractC5097y.c) this.f38452b[((i10 / 3) * 2) + 1];
    }

    private int t0(int i10, int i11) {
        int length = (this.f38451a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iX = X(i13);
            if (i10 == iX) {
                return i13;
            }
            if (i10 < iX) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object u(int i10) {
        return this.f38452b[(i10 / 3) * 2];
    }

    private void u0(Object obj, int i10, Object obj2) {
        f38450s.putObject(obj, Y(x0(i10)), obj2);
        r0(obj, i10);
    }

    private c0 v(int i10) {
        int i11 = (i10 / 3) * 2;
        c0 c0Var = (c0) this.f38452b[i11];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarC = Y.a().c((Class) this.f38452b[i11 + 1]);
        this.f38452b[i11] = c0VarC;
        return c0VarC;
    }

    private void v0(Object obj, int i10, int i11, Object obj2) {
        f38450s.putObject(obj, Y(x0(i11)), obj2);
        s0(obj, i10, i11);
    }

    static i0 w(Object obj) {
        AbstractC5095w abstractC5095w = (AbstractC5095w) obj;
        i0 i0Var = abstractC5095w.unknownFields;
        if (i0Var != i0.c()) {
            return i0Var;
        }
        i0 i0VarK = i0.k();
        abstractC5095w.unknownFields = i0VarK;
        return i0VarK;
    }

    private static int w0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int x(Object obj) {
        int i10;
        int i11;
        int iH;
        int iD;
        int iB;
        boolean z10;
        int iF;
        int i12;
        int iL;
        int iN;
        Unsafe unsafe = f38450s;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.f38451a.length) {
            int iX0 = x0(i15);
            int iX = X(i15);
            int iW0 = w0(iX0);
            if (iW0 <= 17) {
                i10 = this.f38451a[i15 + 2];
                int i18 = i10 & i13;
                i11 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
            } else {
                i10 = (!this.f38459i || iW0 < EnumC5092t.DOUBLE_LIST_PACKED.id() || iW0 > EnumC5092t.SINT64_LIST_PACKED.id()) ? 0 : this.f38451a[i15 + 2] & i13;
                i11 = 0;
            }
            long jY = Y(iX0);
            switch (iW0) {
                case 0:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.h(iX, 0.0d);
                        i16 += iH;
                        break;
                    }
                case 1:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.p(iX, 0.0f);
                        i16 += iH;
                        break;
                    }
                case 2:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.v(iX, unsafe.getLong(obj, jY));
                        i16 += iH;
                        break;
                    }
                case 3:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.O(iX, unsafe.getLong(obj, jY));
                        i16 += iH;
                        break;
                    }
                case 4:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.t(iX, unsafe.getInt(obj, jY));
                        i16 += iH;
                        break;
                    }
                case 5:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        iH = CodedOutputStream.n(iX, 0L);
                        i16 += iH;
                        break;
                    }
                case 6:
                    if ((i17 & i11) != 0) {
                        iH = CodedOutputStream.l(iX, 0);
                        i16 += iH;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.d(iX, true);
                        i16 += iD;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(obj, jY);
                        iD = object instanceof AbstractC5081h ? CodedOutputStream.f(iX, (AbstractC5081h) object) : CodedOutputStream.J(iX, (String) object);
                        i16 += iD;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        iD = e0.o(iX, unsafe.getObject(obj, jY), v(i15));
                        i16 += iD;
                    }
                    break;
                case 10:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.f(iX, (AbstractC5081h) unsafe.getObject(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 11:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.M(iX, unsafe.getInt(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 12:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.j(iX, unsafe.getInt(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 13:
                    if ((i17 & i11) != 0) {
                        iB = CodedOutputStream.B(iX, 0);
                        i16 += iB;
                    }
                    break;
                case 14:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.D(iX, 0L);
                        i16 += iD;
                    }
                    break;
                case 15:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.F(iX, unsafe.getInt(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 16:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.H(iX, unsafe.getLong(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 17:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.r(iX, (M) unsafe.getObject(obj, jY), v(i15));
                        i16 += iD;
                    }
                    break;
                case 18:
                    iD = e0.h(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iD;
                    break;
                case 19:
                    z10 = false;
                    iF = e0.f(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = e0.m(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = e0.x(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    z10 = false;
                    iF = e0.k(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = e0.h(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = e0.f(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = e0.a(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 26:
                    iD = e0.u(iX, (List) unsafe.getObject(obj, jY));
                    i16 += iD;
                    break;
                case 27:
                    iD = e0.p(iX, (List) unsafe.getObject(obj, jY), v(i15));
                    i16 += iD;
                    break;
                case 28:
                    iD = e0.c(iX, (List) unsafe.getObject(obj, jY));
                    i16 += iD;
                    break;
                case 29:
                    iD = e0.v(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iD;
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    z10 = false;
                    iF = e0.d(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = e0.f(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = e0.h(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = e0.q(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = e0.s(iX, (List) unsafe.getObject(obj, jY), false);
                    i16 += iF;
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    i12 = e0.i((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 36:
                    i12 = e0.g((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 37:
                    i12 = e0.n((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 38:
                    i12 = e0.y((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 39:
                    i12 = e0.l((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 40:
                    i12 = e0.i((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 41:
                    i12 = e0.g((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 42:
                    i12 = e0.b((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 43:
                    i12 = e0.w((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 44:
                    i12 = e0.e((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 45:
                    i12 = e0.g((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 46:
                    i12 = e0.i((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 47:
                    i12 = e0.r((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 48:
                    i12 = e0.t((List) unsafe.getObject(obj, jY));
                    if (i12 > 0) {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i12);
                        iB = iL + iN + i12;
                        i16 += iB;
                    }
                    break;
                case 49:
                    iD = e0.j(iX, (List) unsafe.getObject(obj, jY), v(i15));
                    i16 += iD;
                    break;
                case 50:
                    iD = this.f38467q.f(iX, unsafe.getObject(obj, jY), u(i15));
                    i16 += iD;
                    break;
                case 51:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.h(iX, 0.0d);
                        i16 += iD;
                    }
                    break;
                case 52:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.p(iX, 0.0f);
                        i16 += iD;
                    }
                    break;
                case 53:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.v(iX, d0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 54:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.O(iX, d0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 55:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.t(iX, c0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 56:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.n(iX, 0L);
                        i16 += iD;
                    }
                    break;
                case 57:
                    if (J(obj, iX, i15)) {
                        iB = CodedOutputStream.l(iX, 0);
                        i16 += iB;
                    }
                    break;
                case 58:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.d(iX, true);
                        i16 += iD;
                    }
                    break;
                case 59:
                    if (J(obj, iX, i15)) {
                        Object object2 = unsafe.getObject(obj, jY);
                        iD = object2 instanceof AbstractC5081h ? CodedOutputStream.f(iX, (AbstractC5081h) object2) : CodedOutputStream.J(iX, (String) object2);
                        i16 += iD;
                    }
                    break;
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (J(obj, iX, i15)) {
                        iD = e0.o(iX, unsafe.getObject(obj, jY), v(i15));
                        i16 += iD;
                    }
                    break;
                case 61:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.f(iX, (AbstractC5081h) unsafe.getObject(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 62:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.M(iX, c0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 63:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.j(iX, c0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case 64:
                    if (J(obj, iX, i15)) {
                        iB = CodedOutputStream.B(iX, 0);
                        i16 += iB;
                    }
                    break;
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.D(iX, 0L);
                        i16 += iD;
                    }
                    break;
                case 66:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.F(iX, c0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.H(iX, d0(obj, jY));
                        i16 += iD;
                    }
                    break;
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (J(obj, iX, i15)) {
                        iD = CodedOutputStream.r(iX, (M) unsafe.getObject(obj, jY), v(i15));
                        i16 += iD;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int iZ = i16 + z(this.f38465o, obj);
        return this.f38456f ? iZ + this.f38466p.c(obj).c() : iZ;
    }

    private int x0(int i10) {
        return this.f38451a[i10 + 1];
    }

    private int y(Object obj) {
        int iH;
        int i10;
        int iL;
        int iN;
        Unsafe unsafe = f38450s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f38451a.length; i12 += 3) {
            int iX0 = x0(i12);
            int iW0 = w0(iX0);
            int iX = X(i12);
            long jY = Y(iX0);
            int i13 = (iW0 < EnumC5092t.DOUBLE_LIST_PACKED.id() || iW0 > EnumC5092t.SINT64_LIST_PACKED.id()) ? 0 : this.f38451a[i12 + 2] & 1048575;
            switch (iW0) {
                case 0:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.h(iX, 0.0d);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.p(iX, 0.0f);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.v(iX, l0.A(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.O(iX, l0.A(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.t(iX, l0.z(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.n(iX, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.l(iX, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.d(iX, true);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (C(obj, i12)) {
                        Object objC = l0.C(obj, jY);
                        iH = objC instanceof AbstractC5081h ? CodedOutputStream.f(iX, (AbstractC5081h) objC) : CodedOutputStream.J(iX, (String) objC);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (C(obj, i12)) {
                        iH = e0.o(iX, l0.C(obj, jY), v(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.f(iX, (AbstractC5081h) l0.C(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.M(iX, l0.z(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.j(iX, l0.z(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.B(iX, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.D(iX, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.F(iX, l0.z(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.H(iX, l0.A(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (C(obj, i12)) {
                        iH = CodedOutputStream.r(iX, (M) l0.C(obj, jY), v(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iH = e0.h(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 19:
                    iH = e0.f(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 20:
                    iH = e0.m(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 21:
                    iH = e0.x(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    iH = e0.k(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 23:
                    iH = e0.h(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 24:
                    iH = e0.f(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 25:
                    iH = e0.a(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 26:
                    iH = e0.u(iX, L(obj, jY));
                    i11 += iH;
                    break;
                case 27:
                    iH = e0.p(iX, L(obj, jY), v(i12));
                    i11 += iH;
                    break;
                case 28:
                    iH = e0.c(iX, L(obj, jY));
                    i11 += iH;
                    break;
                case 29:
                    iH = e0.v(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    iH = e0.d(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 31:
                    iH = e0.f(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 32:
                    iH = e0.h(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 33:
                    iH = e0.q(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case 34:
                    iH = e0.s(iX, L(obj, jY), false);
                    i11 += iH;
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    i10 = e0.i((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 36:
                    i10 = e0.g((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 37:
                    i10 = e0.n((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 38:
                    i10 = e0.y((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 39:
                    i10 = e0.l((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 40:
                    i10 = e0.i((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 41:
                    i10 = e0.g((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 42:
                    i10 = e0.b((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 43:
                    i10 = e0.w((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 44:
                    i10 = e0.e((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 45:
                    i10 = e0.g((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 46:
                    i10 = e0.i((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 47:
                    i10 = e0.r((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 48:
                    i10 = e0.t((List) unsafe.getObject(obj, jY));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f38459i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iL = CodedOutputStream.L(iX);
                        iN = CodedOutputStream.N(i10);
                        iH = iL + iN + i10;
                        i11 += iH;
                        break;
                    }
                case 49:
                    iH = e0.j(iX, L(obj, jY), v(i12));
                    i11 += iH;
                    break;
                case 50:
                    iH = this.f38467q.f(iX, l0.C(obj, jY), u(i12));
                    i11 += iH;
                    break;
                case 51:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.h(iX, 0.0d);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.p(iX, 0.0f);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.v(iX, d0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.O(iX, d0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.t(iX, c0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.n(iX, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.l(iX, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.d(iX, true);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(obj, iX, i12)) {
                        Object objC2 = l0.C(obj, jY);
                        iH = objC2 instanceof AbstractC5081h ? CodedOutputStream.f(iX, (AbstractC5081h) objC2) : CodedOutputStream.J(iX, (String) objC2);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (J(obj, iX, i12)) {
                        iH = e0.o(iX, l0.C(obj, jY), v(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.f(iX, (AbstractC5081h) l0.C(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.M(iX, c0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.j(iX, c0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.B(iX, 0);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.D(iX, 0L);
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.F(iX, c0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.H(iX, d0(obj, jY));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (J(obj, iX, i12)) {
                        iH = CodedOutputStream.r(iX, (M) l0.C(obj, jY), v(i12));
                        i11 += iH;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i11 + z(this.f38465o, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y0(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.o0 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.o0):void");
    }

    private int z(h0 h0Var, Object obj) {
        return h0Var.h(h0Var.g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void z0(java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.o0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.o0):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void a(Object obj, Object obj2) {
        m(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f38451a.length; i10 += 3) {
            R(obj, obj2, i10);
        }
        e0.F(this.f38465o, obj, obj2);
        if (this.f38456f) {
            e0.D(this.f38466p, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public Object b() {
        return this.f38463m.a(this.f38455e);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = H(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC5095w
            if (r0 == 0) goto L17
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.w r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC5095w) r0
            r0.l()
            r0.k()
            r0.E()
        L17:
            int[] r0 = r7.f38451a
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L5f
            int r2 = r7.x0(r1)
            long r3 = Y(r2)
            int r2 = w0(r2)
            r5 = 9
            if (r2 == r5) goto L49
            switch(r2) {
                case 17: goto L49;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L43;
                case 37: goto L43;
                case 38: goto L43;
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                case 50: goto L31;
                default: goto L30;
            }
        L30:
            goto L5c
        L31:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.P.f38450s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.H r6 = r7.f38467q
            java.lang.Object r5 = r6.b(r5)
            r2.putObject(r8, r3, r5)
            goto L5c
        L43:
            com.google.crypto.tink.shaded.protobuf.C r2 = r7.f38464n
            r2.c(r8, r3)
            goto L5c
        L49:
            boolean r2 = r7.C(r8, r1)
            if (r2 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.c0 r2 = r7.v(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.P.f38450s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.c(r3)
        L5c:
            int r1 = r1 + 3
            goto L1b
        L5f:
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r7.f38465o
            r0.j(r8)
            boolean r0 = r7.f38456f
            if (r0 == 0) goto L6d
            com.google.crypto.tink.shaded.protobuf.p r0 = r7.f38466p
            r0.f(r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.f38461k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f38460j
            r11 = r2[r10]
            int r12 = r6.X(r11)
            int r13 = r6.x0(r11)
            int[] r2 = r6.f38451a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.P.f38450s
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = K(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.D(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = w0(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.J(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r6.v(r11)
            boolean r0 = E(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.F(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.D(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r6.v(r11)
            boolean r0 = E(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f38456f
            if (r0 == 0) goto Lc2
            com.google.crypto.tink.shaded.protobuf.p r0 = r6.f38466p
            com.google.crypto.tink.shaded.protobuf.s r0 = r0.c(r7)
            boolean r0 = r0.e()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.P.d(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public boolean e(Object obj, Object obj2) {
        int length = this.f38451a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f38465o.g(obj).equals(this.f38465o.g(obj2))) {
            return false;
        }
        if (this.f38456f) {
            return this.f38466p.c(obj).equals(this.f38466p.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public int f(Object obj) {
        return this.f38458h ? y(obj) : x(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public int g(Object obj) {
        int i10;
        int iF;
        int length = this.f38451a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iX0 = x0(i12);
            int iX = X(i12);
            long jY = Y(iX0);
            int iHashCode = 37;
            switch (w0(iX0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.f(Double.doubleToLongBits(l0.x(obj, jY)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(l0.y(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.f(l0.A(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.f(l0.A(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = l0.z(obj, jY);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.f(l0.A(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = l0.z(obj, jY);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.c(l0.r(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) l0.C(obj, jY)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objC = l0.C(obj, jY);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = l0.C(obj, jY).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = l0.z(obj, jY);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = l0.z(obj, jY);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = l0.z(obj, jY);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.f(l0.A(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = l0.z(obj, jY);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC5097y.f(l0.A(obj, jY));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objC2 = l0.C(obj, jY);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
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
                    iF = l0.C(obj, jY).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = l0.C(obj, jY).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.f(Double.doubleToLongBits(a0(obj, jY)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(b0(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.f(d0(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.f(d0(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(obj, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.f(d0(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(obj, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.c(Z(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) l0.C(obj, jY)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = l0.C(obj, jY).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = l0.C(obj, jY).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(obj, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(obj, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(obj, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.f(d0(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(obj, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC5097y.f(d0(obj, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (J(obj, iX, i12)) {
                        i10 = i11 * 53;
                        iF = l0.C(obj, jY).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f38465o.g(obj).hashCode();
        return this.f38456f ? (iHashCode2 * 53) + this.f38466p.c(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0090. Please report as an issue. */
    int g0(Object obj, byte[] bArr, int i10, int i11, int i12, AbstractC5078e.a aVar) {
        Unsafe unsafe;
        int i13;
        P p10;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        int iK;
        int i29;
        int i30;
        P p11 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i31 = i11;
        int i32 = i12;
        AbstractC5078e.a aVar2 = aVar;
        m(obj);
        Unsafe unsafe2 = f38450s;
        int iF = i10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (iF < i31) {
                int i38 = iF + 1;
                byte b10 = bArr3[iF];
                if (b10 < 0) {
                    int iG = AbstractC5078e.G(b10, bArr3, i38, aVar2);
                    i18 = aVar2.f38490a;
                    i38 = iG;
                } else {
                    i18 = b10;
                }
                int i39 = i18 >>> 3;
                int i40 = i18 & 7;
                int iK0 = i39 > i36 ? p11.k0(i39, i33 / 3) : p11.j0(i39);
                if (iK0 == -1) {
                    i19 = i39;
                    i20 = i38;
                    i15 = i18;
                    i21 = i35;
                    i22 = i37;
                    unsafe = unsafe2;
                    i13 = i32;
                    i23 = 0;
                } else {
                    int i41 = p11.f38451a[iK0 + 1];
                    int iW0 = w0(i41);
                    long jY = Y(i41);
                    int i42 = i18;
                    if (iW0 <= 17) {
                        int i43 = p11.f38451a[iK0 + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj3, i37, i35);
                            }
                            i25 = i45;
                            i24 = unsafe2.getInt(obj3, i45);
                        } else {
                            i24 = i35;
                            i25 = i37;
                        }
                        switch (iW0) {
                            case 0:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    l0.N(obj3, jY, AbstractC5078e.d(bArr2, i38));
                                    iF = i38 + 8;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 1:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    l0.O(obj3, jY, AbstractC5078e.k(bArr2, i38));
                                    iF = i38 + 4;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iK = AbstractC5078e.K(bArr2, i38, aVar2);
                                    unsafe2.putLong(obj, jY, aVar2.f38491b);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    iF = iK;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iF = AbstractC5078e.H(bArr2, i38, aVar2);
                                    unsafe2.putInt(obj3, jY, aVar2.f38490a);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, jY, AbstractC5078e.i(bArr2, i38));
                                    iF = i38 + 8;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, jY, AbstractC5078e.g(bArr2, i38));
                                    iF = i38 + 4;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 7:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iF = AbstractC5078e.K(bArr2, i38, aVar2);
                                    l0.H(obj3, jY, aVar2.f38491b != 0);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 8:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iF = (536870912 & i41) == 0 ? AbstractC5078e.B(bArr2, i38, aVar2) : AbstractC5078e.E(bArr2, i38, aVar2);
                                    unsafe2.putObject(obj3, jY, aVar2.f38492c);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 9:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object objS = p11.S(obj3, i28);
                                    iF = AbstractC5078e.N(objS, p11.v(i28), bArr, i38, i11, aVar);
                                    p11.u0(obj3, i28, objS);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 10:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iF = AbstractC5078e.b(bArr2, i38, aVar2);
                                    unsafe2.putObject(obj3, jY, aVar2.f38492c);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 12:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iF = AbstractC5078e.H(bArr2, i38, aVar2);
                                    int i46 = aVar2.f38490a;
                                    AbstractC5097y.c cVarT = p11.t(i28);
                                    if (cVarT == null || cVarT.a(i46)) {
                                        unsafe2.putInt(obj3, jY, i46);
                                        i35 = i24 | i44;
                                        i32 = i12;
                                        i33 = i28;
                                        i34 = i27;
                                        i36 = i19;
                                        i37 = i26;
                                        bArr3 = bArr2;
                                    } else {
                                        w(obj).n(i27, Long.valueOf(i46));
                                        i33 = i28;
                                        i35 = i24;
                                        i34 = i27;
                                        i36 = i19;
                                        i37 = i26;
                                        i32 = i12;
                                        bArr3 = bArr2;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iF = AbstractC5078e.H(bArr2, i38, aVar2);
                                    unsafe2.putInt(obj3, jY, AbstractC5082i.b(aVar2.f38490a));
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 16:
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                bArr2 = bArr;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iK = AbstractC5078e.K(bArr2, i38, aVar2);
                                    unsafe2.putLong(obj, jY, AbstractC5082i.c(aVar2.f38491b));
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    iF = iK;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 17:
                                if (i40 != 3) {
                                    i19 = i39;
                                    i26 = i25;
                                    i27 = i42;
                                    i28 = iK0;
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object objS2 = p11.S(obj3, iK0);
                                    iF = AbstractC5078e.M(objS2, p11.v(iK0), bArr, i38, i11, (i39 << 3) | 4, aVar);
                                    p11.u0(obj3, iK0, objS2);
                                    i35 = i24 | i44;
                                    i37 = i25;
                                    i32 = i12;
                                    i33 = iK0;
                                    i34 = i42;
                                    i36 = i39;
                                    bArr3 = bArr;
                                }
                            default:
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                i22 = i26;
                                i13 = i12;
                                i20 = i38;
                                i23 = i28;
                                unsafe = unsafe2;
                                i21 = i24;
                                i15 = i27;
                                break;
                        }
                    } else {
                        i19 = i39;
                        i22 = i37;
                        i21 = i35;
                        if (iW0 == 27) {
                            if (i40 == 2) {
                                AbstractC5097y.d dVarP = (AbstractC5097y.d) unsafe2.getObject(obj3, jY);
                                if (!dVarP.E()) {
                                    int size = dVarP.size();
                                    dVarP = dVarP.p(size == 0 ? 10 : size * 2);
                                    unsafe2.putObject(obj3, jY, dVarP);
                                }
                                iF = AbstractC5078e.p(p11.v(iK0), i42, bArr, i38, i11, dVarP, aVar);
                                i33 = iK0;
                                i34 = i42;
                                i37 = i22;
                                i35 = i21;
                                i36 = i19;
                                bArr3 = bArr;
                                i32 = i12;
                            } else {
                                i29 = i38;
                                unsafe = unsafe2;
                                i23 = iK0;
                                i30 = i42;
                                i13 = i12;
                                i20 = i29;
                            }
                        } else if (iW0 <= 49) {
                            int i47 = i38;
                            unsafe = unsafe2;
                            i23 = iK0;
                            i30 = i42;
                            iF = i0(obj, bArr, i38, i11, i42, i19, i40, iK0, i41, iW0, jY, aVar);
                            if (iF != i47) {
                                p11 = this;
                                obj3 = obj;
                                bArr3 = bArr;
                                i31 = i11;
                                i32 = i12;
                                aVar2 = aVar;
                                i37 = i22;
                                i35 = i21;
                                i33 = i23;
                                i34 = i30;
                                i36 = i19;
                                unsafe2 = unsafe;
                            } else {
                                i13 = i12;
                                i20 = iF;
                            }
                        } else {
                            i29 = i38;
                            unsafe = unsafe2;
                            i23 = iK0;
                            i30 = i42;
                            if (iW0 != 50) {
                                iF = f0(obj, bArr, i29, i11, i30, i19, i40, i41, iW0, jY, i23, aVar);
                                if (iF != i29) {
                                    p11 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    aVar2 = aVar;
                                    i37 = i22;
                                    i35 = i21;
                                    i33 = i23;
                                    i34 = i30;
                                    i36 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = iF;
                                }
                            } else if (i40 == 2) {
                                iF = e0(obj, bArr, i29, i11, i23, jY, aVar);
                                if (iF != i29) {
                                    p11 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    aVar2 = aVar;
                                    i37 = i22;
                                    i35 = i21;
                                    i33 = i23;
                                    i34 = i30;
                                    i36 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = iF;
                                }
                            } else {
                                i13 = i12;
                                i20 = i29;
                            }
                        }
                        i15 = i30;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    iF = (!this.f38456f || aVar.f38493d == C5088o.b()) ? AbstractC5078e.F(i15, bArr, i20, i11, w(obj), aVar) : AbstractC5078e.f(i15, bArr, i20, i11, obj, this.f38455e, this.f38465o, aVar);
                    obj3 = obj;
                    bArr3 = bArr;
                    i31 = i11;
                    i34 = i15;
                    p11 = this;
                    aVar2 = aVar;
                    i37 = i22;
                    i35 = i21;
                    i33 = i23;
                    i36 = i19;
                    unsafe2 = unsafe;
                    i32 = i13;
                } else {
                    i17 = 1048575;
                    p10 = this;
                    i14 = i20;
                    i16 = i22;
                    i35 = i21;
                }
            } else {
                int i48 = i37;
                unsafe = unsafe2;
                i13 = i32;
                p10 = p11;
                i14 = iF;
                i15 = i34;
                i16 = i48;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            obj2 = obj;
            unsafe.putInt(obj2, i16, i35);
        } else {
            obj2 = obj;
        }
        i0 i0Var = null;
        for (int i49 = p10.f38461k; i49 < p10.f38462l; i49++) {
            i0Var = (i0) q(obj, p10.f38460j[i49], i0Var, p10.f38465o, obj);
        }
        if (i0Var != null) {
            p10.f38465o.o(obj2, i0Var);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw InvalidProtocolBufferException.m();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.m();
        }
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void h(Object obj, byte[] bArr, int i10, int i11, AbstractC5078e.a aVar) throws InvalidProtocolBufferException {
        if (this.f38458h) {
            h0(obj, bArr, i10, i11, aVar);
        } else {
            g0(obj, bArr, i10, i11, 0, aVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void i(Object obj, o0 o0Var) {
        if (o0Var.i() == o0.a.DESCENDING) {
            A0(obj, o0Var);
        } else if (this.f38458h) {
            z0(obj, o0Var);
        } else {
            y0(obj, o0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public void j(Object obj, b0 b0Var, C5088o c5088o) {
        c5088o.getClass();
        m(obj);
        N(this.f38465o, this.f38466p, obj, b0Var, c5088o);
    }
}
