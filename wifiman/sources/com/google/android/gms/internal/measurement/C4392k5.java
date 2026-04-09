package com.google.android.gms.internal.measurement;

import com.google.ar.core.ImageFormat;
import f.AbstractC5487d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4392k5 implements InterfaceC4495x5 {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f35283q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f35284r = N5.p();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f35285a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f35286b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35287c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35288d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4366h5 f35289e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35290f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35291g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35292h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f35293i;

    /* renamed from: j, reason: collision with root package name */
    private final int f35294j;

    /* renamed from: k, reason: collision with root package name */
    private final int f35295k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC4416n5 f35296l;

    /* renamed from: m, reason: collision with root package name */
    private final R4 f35297m;

    /* renamed from: n, reason: collision with root package name */
    private final L5 f35298n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC4446r4 f35299o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC4303a5 f35300p;

    private C4392k5(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC4366h5 interfaceC4366h5, boolean z10, int[] iArr2, int i12, int i13, InterfaceC4416n5 interfaceC4416n5, R4 r42, L5 l52, AbstractC4446r4 abstractC4446r4, InterfaceC4303a5 interfaceC4303a5) {
        this.f35285a = iArr;
        this.f35286b = objArr;
        this.f35287c = i10;
        this.f35288d = i11;
        this.f35291g = interfaceC4366h5 instanceof D4;
        this.f35290f = abstractC4446r4 != null && abstractC4446r4.d(interfaceC4366h5);
        this.f35292h = false;
        this.f35293i = iArr2;
        this.f35294j = i12;
        this.f35295k = i13;
        this.f35296l = interfaceC4416n5;
        this.f35297m = r42;
        this.f35298n = l52;
        this.f35299o = abstractC4446r4;
        this.f35289e = interfaceC4366h5;
        this.f35300p = interfaceC4303a5;
    }

    private final void A(Object obj, int i10) {
        int iZ = z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            return;
        }
        N5.h(obj, j10, (1 << (iZ >>> 20)) | N5.t(obj, j10));
    }

    private final void B(Object obj, int i10, int i11) {
        N5.h(obj, z(i11) & 1048575, i10);
    }

    private final void C(Object obj, Object obj2, int i10) {
        int i11 = this.f35285a[i10];
        if (H(obj2, i11, i10)) {
            long jD = D(i10) & 1048575;
            Unsafe unsafe = f35284r;
            Object object = unsafe.getObject(obj2, jD);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f35285a[i10] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC4495x5 interfaceC4495x5L = L(i10);
            if (!H(obj, i11, i10)) {
                if (Q(object)) {
                    Object objZza = interfaceC4495x5L.zza();
                    interfaceC4495x5L.c(objZza, object);
                    unsafe.putObject(obj, jD, objZza);
                } else {
                    unsafe.putObject(obj, jD, object);
                }
                B(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jD);
            if (!Q(object2)) {
                Object objZza2 = interfaceC4495x5L.zza();
                interfaceC4495x5L.c(objZza2, object2);
                unsafe.putObject(obj, jD, objZza2);
                object2 = objZza2;
            }
            interfaceC4495x5L.c(object2, object);
        }
    }

    private final int D(int i10) {
        return this.f35285a[i10 + 1];
    }

    private static int E(Object obj, long j10) {
        return ((Integer) N5.B(obj, j10)).intValue();
    }

    static K5 F(Object obj) {
        D4 d42 = (D4) obj;
        K5 k52 = d42.zzb;
        if (k52 != K5.k()) {
            return k52;
        }
        K5 k5L = K5.l();
        d42.zzb = k5L;
        return k5L;
    }

    private final boolean G(Object obj, int i10) {
        int iZ = z(i10);
        long j10 = iZ & 1048575;
        if (j10 != 1048575) {
            return (N5.t(obj, j10) & (1 << (iZ >>> 20))) != 0;
        }
        int iD = D(i10);
        long j11 = iD & 1048575;
        switch ((iD & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(N5.a(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(N5.n(obj, j11)) != 0;
            case 2:
                return N5.x(obj, j11) != 0;
            case 3:
                return N5.x(obj, j11) != 0;
            case 4:
                return N5.t(obj, j11) != 0;
            case 5:
                return N5.x(obj, j11) != 0;
            case 6:
                return N5.t(obj, j11) != 0;
            case 7:
                return N5.F(obj, j11);
            case 8:
                Object objB = N5.B(obj, j11);
                if (objB instanceof String) {
                    return !((String) objB).isEmpty();
                }
                if (objB instanceof V3) {
                    return !V3.f35128b.equals(objB);
                }
                throw new IllegalArgumentException();
            case 9:
                return N5.B(obj, j11) != null;
            case 10:
                return !V3.f35128b.equals(N5.B(obj, j11));
            case 11:
                return N5.t(obj, j11) != 0;
            case 12:
                return N5.t(obj, j11) != 0;
            case 13:
                return N5.t(obj, j11) != 0;
            case 14:
                return N5.x(obj, j11) != 0;
            case 15:
                return N5.t(obj, j11) != 0;
            case 16:
                return N5.x(obj, j11) != 0;
            case 17:
                return N5.B(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean H(Object obj, int i10, int i11) {
        return N5.t(obj, (long) (z(i11) & 1048575)) == i10;
    }

    private final boolean I(Object obj, Object obj2, int i10) {
        return G(obj, i10) == G(obj2, i10);
    }

    private static long J(Object obj, long j10) {
        return ((Long) N5.B(obj, j10)).longValue();
    }

    private final H4 K(int i10) {
        return (H4) this.f35286b[((i10 / 3) << 1) + 1];
    }

    private final InterfaceC4495x5 L(int i10) {
        int i11 = (i10 / 3) << 1;
        InterfaceC4495x5 interfaceC4495x5 = (InterfaceC4495x5) this.f35286b[i11];
        if (interfaceC4495x5 != null) {
            return interfaceC4495x5;
        }
        InterfaceC4495x5 interfaceC4495x5B = C4471u5.a().b((Class) this.f35286b[i11 + 1]);
        this.f35286b[i11] = interfaceC4495x5B;
        return interfaceC4495x5B;
    }

    private static boolean M(Object obj, long j10) {
        return ((Boolean) N5.B(obj, j10)).booleanValue();
    }

    private final Object N(int i10) {
        return this.f35286b[(i10 / 3) << 1];
    }

    private static void O(Object obj) {
        if (Q(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean P(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof D4) {
            return ((D4) obj).E();
        }
        return true;
    }

    private static double g(Object obj, long j10) {
        return ((Double) N5.B(obj, j10)).doubleValue();
    }

    private final int h(int i10) {
        if (i10 < this.f35287c || i10 > this.f35288d) {
            return -1;
        }
        return i(i10, 0);
    }

    private final int i(int i10, int i11) {
        int length = (this.f35285a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f35285a[i13];
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.measurement.C4392k5 k(java.lang.Class r32, com.google.android.gms.internal.measurement.InterfaceC4348f5 r33, com.google.android.gms.internal.measurement.InterfaceC4416n5 r34, com.google.android.gms.internal.measurement.R4 r35, com.google.android.gms.internal.measurement.L5 r36, com.google.android.gms.internal.measurement.AbstractC4446r4 r37, com.google.android.gms.internal.measurement.InterfaceC4303a5 r38) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4392k5.k(java.lang.Class, com.google.android.gms.internal.measurement.f5, com.google.android.gms.internal.measurement.n5, com.google.android.gms.internal.measurement.R4, com.google.android.gms.internal.measurement.L5, com.google.android.gms.internal.measurement.r4, com.google.android.gms.internal.measurement.a5):com.google.android.gms.internal.measurement.k5");
    }

    private final Object l(int i10, int i11, Map map, H4 h42, Object obj, L5 l52, Object obj2) {
        this.f35300p.zza(N(i10));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!h42.zza(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = l52.i(obj2);
                }
                C4347f4 c4347f4B0 = V3.b0(Z4.a(null, entry.getKey(), entry.getValue()));
                try {
                    Z4.b(c4347f4B0.b(), null, entry.getKey(), entry.getValue());
                    l52.c(obj, i11, c4347f4B0.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj;
    }

    private final Object m(Object obj, int i10) {
        InterfaceC4495x5 interfaceC4495x5L = L(i10);
        long jD = D(i10) & 1048575;
        if (!G(obj, i10)) {
            return interfaceC4495x5L.zza();
        }
        Object object = f35284r.getObject(obj, jD);
        if (Q(object)) {
            return object;
        }
        Object objZza = interfaceC4495x5L.zza();
        if (object != null) {
            interfaceC4495x5L.c(objZza, object);
        }
        return objZza;
    }

    private final Object n(Object obj, int i10, int i11) {
        InterfaceC4495x5 interfaceC4495x5L = L(i11);
        if (!H(obj, i10, i11)) {
            return interfaceC4495x5L.zza();
        }
        Object object = f35284r.getObject(obj, D(i11) & 1048575);
        if (Q(object)) {
            return object;
        }
        Object objZza = interfaceC4495x5L.zza();
        if (object != null) {
            interfaceC4495x5L.c(objZza, object);
        }
        return objZza;
    }

    private final Object o(Object obj, int i10, Object obj2, L5 l52, Object obj3) {
        H4 h4K;
        int i11 = this.f35285a[i10];
        Object objB = N5.B(obj, D(i10) & 1048575);
        return (objB == null || (h4K = K(i10)) == null) ? obj2 : l(i10, i11, this.f35300p.a(objB), h4K, obj2, l52, obj3);
    }

    private static Field p(Class cls, String str) {
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

    private static void q(int i10, Object obj, InterfaceC4331d6 interfaceC4331d6) {
        if (obj instanceof String) {
            interfaceC4331d6.n(i10, (String) obj);
        } else {
            interfaceC4331d6.D(i10, (V3) obj);
        }
    }

    private static void r(L5 l52, Object obj, InterfaceC4331d6 interfaceC4331d6) {
        l52.g(l52.k(obj), interfaceC4331d6);
    }

    private final void s(InterfaceC4331d6 interfaceC4331d6, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f35300p.zza(N(i11));
            interfaceC4331d6.m(i10, null, this.f35300p.b(obj));
        }
    }

    private final void t(Object obj, int i10, int i11, Object obj2) {
        f35284r.putObject(obj, D(i11) & 1048575, obj2);
        B(obj, i10, i11);
    }

    private final void u(Object obj, int i10, Object obj2) {
        f35284r.putObject(obj, D(i10) & 1048575, obj2);
        A(obj, i10);
    }

    private final void v(Object obj, Object obj2, int i10) {
        if (G(obj2, i10)) {
            long jD = D(i10) & 1048575;
            Unsafe unsafe = f35284r;
            Object object = unsafe.getObject(obj2, jD);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f35285a[i10] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC4495x5 interfaceC4495x5L = L(i10);
            if (!G(obj, i10)) {
                if (Q(object)) {
                    Object objZza = interfaceC4495x5L.zza();
                    interfaceC4495x5L.c(objZza, object);
                    unsafe.putObject(obj, jD, objZza);
                } else {
                    unsafe.putObject(obj, jD, object);
                }
                A(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jD);
            if (!Q(object2)) {
                Object objZza2 = interfaceC4495x5L.zza();
                interfaceC4495x5L.c(objZza2, object2);
                unsafe.putObject(obj, jD, objZza2);
                object2 = objZza2;
            }
            interfaceC4495x5L.c(object2, object);
        }
    }

    private final boolean w(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? G(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean x(Object obj, int i10, InterfaceC4495x5 interfaceC4495x5) {
        return interfaceC4495x5.a(N5.B(obj, i10 & 1048575));
    }

    private static float y(Object obj, long j10) {
        return ((Float) N5.B(obj, j10)).floatValue();
    }

    private final int z(int i10) {
        return this.f35285a[i10 + 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4392k5.a(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = Q(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.D4
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.measurement.D4 r0 = (com.google.android.gms.internal.measurement.D4) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.g(r2)
            r0.zza = r1
            r0.B()
        L1a:
            int[] r0 = r7.f35285a
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.D(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
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
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.C4392k5.f35284r
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.measurement.a5 r6 = r7.f35300p
            java.lang.Object r5 = r6.d(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.measurement.R4 r2 = r7.f35297m
            r2.a(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.f35285a
            r2 = r2[r1]
            boolean r2 = r7.H(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.x5 r2 = r7.L(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.C4392k5.f35284r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
            goto L80
        L6d:
            boolean r2 = r7.G(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.x5 r2 = r7.L(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.C4392k5.f35284r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.measurement.L5 r0 = r7.f35298n
            r0.l(r8)
            boolean r0 = r7.f35290f
            if (r0 == 0) goto L91
            com.google.android.gms.internal.measurement.r4 r0 = r7.f35299o
            r0.f(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4392k5.b(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final void c(Object obj, Object obj2) {
        O(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f35285a.length; i10 += 3) {
            int iD = D(i10);
            long j10 = 1048575 & iD;
            int i11 = this.f35285a[i10];
            switch ((iD & 267386880) >>> 20) {
                case 0:
                    if (G(obj2, i10)) {
                        N5.f(obj, j10, N5.a(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (G(obj2, i10)) {
                        N5.g(obj, j10, N5.n(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (G(obj2, i10)) {
                        N5.i(obj, j10, N5.x(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (G(obj2, i10)) {
                        N5.i(obj, j10, N5.x(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (G(obj2, i10)) {
                        N5.h(obj, j10, N5.t(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (G(obj2, i10)) {
                        N5.i(obj, j10, N5.x(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (G(obj2, i10)) {
                        N5.h(obj, j10, N5.t(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (G(obj2, i10)) {
                        N5.v(obj, j10, N5.F(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (G(obj2, i10)) {
                        N5.j(obj, j10, N5.B(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    v(obj, obj2, i10);
                    break;
                case 10:
                    if (G(obj2, i10)) {
                        N5.j(obj, j10, N5.B(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (G(obj2, i10)) {
                        N5.h(obj, j10, N5.t(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (G(obj2, i10)) {
                        N5.h(obj, j10, N5.t(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (G(obj2, i10)) {
                        N5.h(obj, j10, N5.t(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (G(obj2, i10)) {
                        N5.i(obj, j10, N5.x(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (G(obj2, i10)) {
                        N5.h(obj, j10, N5.t(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (G(obj2, i10)) {
                        N5.i(obj, j10, N5.x(obj2, j10));
                        A(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    v(obj, obj2, i10);
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
                    this.f35297m.b(obj, obj2, j10);
                    break;
                case 50:
                    AbstractC4511z5.m(this.f35300p, obj, obj2, j10);
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
                    if (H(obj2, i11, i10)) {
                        N5.j(obj, j10, N5.B(obj2, j10));
                        B(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    C(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                case 66:
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (H(obj2, i11, i10)) {
                        N5.j(obj, j10, N5.B(obj2, j10));
                        B(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    C(obj, obj2, i10);
                    break;
            }
        }
        AbstractC4511z5.n(this.f35298n, obj, obj2);
        if (this.f35290f) {
            AbstractC4511z5.l(this.f35299o, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r24, com.google.android.gms.internal.measurement.InterfaceC4331d6 r25) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4392k5.d(java.lang.Object, com.google.android.gms.internal.measurement.d6):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final void e(Object obj, byte[] bArr, int i10, int i11, U3 u32) throws zzkq {
        j(obj, bArr, i10, i11, 0, u32);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4392k5.f(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:457:0x0b50 A[PHI: r4 r8 r9 r20 r27
  0x0b50: PHI (r4v78 com.google.android.gms.internal.measurement.U3) = 
  (r4v51 com.google.android.gms.internal.measurement.U3)
  (r4v52 com.google.android.gms.internal.measurement.U3)
  (r4v53 com.google.android.gms.internal.measurement.U3)
  (r4v54 com.google.android.gms.internal.measurement.U3)
  (r4v55 com.google.android.gms.internal.measurement.U3)
  (r4v57 com.google.android.gms.internal.measurement.U3)
  (r4v58 com.google.android.gms.internal.measurement.U3)
  (r4v59 com.google.android.gms.internal.measurement.U3)
  (r4v68 com.google.android.gms.internal.measurement.U3)
  (r4v73 com.google.android.gms.internal.measurement.U3)
  (r4v79 com.google.android.gms.internal.measurement.U3)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r8v78 int) = 
  (r8v56 int)
  (r8v57 int)
  (r8v58 int)
  (r8v59 int)
  (r8v60 int)
  (r8v62 int)
  (r8v63 int)
  (r8v64 int)
  (r8v70 int)
  (r8v73 int)
  (r8v79 int)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r9v84 int) = 
  (r9v59 int)
  (r9v60 int)
  (r9v61 int)
  (r9v62 int)
  (r9v63 int)
  (r9v65 int)
  (r9v66 int)
  (r9v67 int)
  (r9v76 int)
  (r9v78 int)
  (r9v85 int)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r20v52 int) = 
  (r20v31 int)
  (r20v32 int)
  (r20v33 int)
  (r20v34 int)
  (r20v35 int)
  (r20v37 int)
  (r20v38 int)
  (r20v39 int)
  (r20v44 int)
  (r20v47 int)
  (r20v53 int)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r27v13 sun.misc.Unsafe) = 
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v8 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0bd4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x089e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int j(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.U3 r36) throws com.google.android.gms.internal.measurement.zzkq {
        /*
            Method dump skipped, instructions count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4392k5.j(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.U3):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int iE;
        int iZ;
        int iP0;
        boolean z10;
        int iX;
        int iB;
        int iS0;
        int iV0;
        Unsafe unsafe = f35284r;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < this.f35285a.length) {
            int iD = D(i16);
            int i18 = (267386880 & iD) >>> 20;
            int[] iArr = this.f35285a;
            int i19 = iArr[i16];
            int i20 = iArr[i16 + 2];
            int i21 = i20 & i13;
            if (i18 <= 17) {
                if (i21 != i14) {
                    i15 = i21 == i13 ? 0 : unsafe.getInt(obj, i21);
                    i14 = i21;
                }
                i10 = i14;
                i11 = i15;
                i12 = 1 << (i20 >>> 20);
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            long j10 = iD & i13;
            if (i18 >= EnumC4494x4.zza.zza()) {
                EnumC4494x4.zzb.zza();
            }
            switch (i18) {
                case 0:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.e(i19, 0.0d);
                        i17 += iE;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.f(i19, 0.0f);
                        i17 += iE;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.Y(i19, unsafe.getLong(obj, j10));
                        i17 += iE;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.m0(i19, unsafe.getLong(obj, j10));
                        i17 += iE;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.l0(i19, unsafe.getInt(obj, j10));
                        i17 += iE;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.P(i19, 0L);
                        i17 += iE;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (w(obj, i16, i10, i11, i12)) {
                        iE = zzjr.h0(i19, 0);
                        i17 += iE;
                        break;
                    }
                    break;
                case 7:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.z(i19, true);
                        i17 += iZ;
                    }
                    break;
                case 8:
                    if (w(obj, i16, i10, i11, i12)) {
                        Object object = unsafe.getObject(obj, j10);
                        iZ = object instanceof V3 ? zzjr.Q(i19, (V3) object) : zzjr.y(i19, (String) object);
                        i17 += iZ;
                    }
                    break;
                case 9:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = AbstractC4511z5.a(i19, unsafe.getObject(obj, j10), L(i16));
                        i17 += iZ;
                    }
                    break;
                case 10:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.Q(i19, (V3) unsafe.getObject(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 11:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.w0(i19, unsafe.getInt(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 12:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.d0(i19, unsafe.getInt(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 13:
                    if (w(obj, i16, i10, i11, i12)) {
                        iP0 = zzjr.p0(i19, 0);
                        i17 += iP0;
                    }
                    break;
                case 14:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.e0(i19, 0L);
                        i17 += iZ;
                    }
                    break;
                case 15:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.t0(i19, unsafe.getInt(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 16:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.i0(i19, unsafe.getLong(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 17:
                    if (w(obj, i16, i10, i11, i12)) {
                        iZ = zzjr.x(i19, (InterfaceC4366h5) unsafe.getObject(obj, j10), L(i16));
                        i17 += iZ;
                    }
                    break;
                case 18:
                    iZ = AbstractC4511z5.A(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iZ;
                    break;
                case 19:
                    z10 = false;
                    iX = AbstractC4511z5.x(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 20:
                    z10 = false;
                    iX = AbstractC4511z5.G(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 21:
                    z10 = false;
                    iX = AbstractC4511z5.S(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    z10 = false;
                    iX = AbstractC4511z5.D(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 23:
                    z10 = false;
                    iX = AbstractC4511z5.A(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 24:
                    z10 = false;
                    iX = AbstractC4511z5.x(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 25:
                    z10 = false;
                    iX = AbstractC4511z5.d(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 26:
                    iZ = AbstractC4511z5.q(i19, (List) unsafe.getObject(obj, j10));
                    i17 += iZ;
                    break;
                case 27:
                    iZ = AbstractC4511z5.r(i19, (List) unsafe.getObject(obj, j10), L(i16));
                    i17 += iZ;
                    break;
                case 28:
                    iZ = AbstractC4511z5.b(i19, (List) unsafe.getObject(obj, j10));
                    i17 += iZ;
                    break;
                case 29:
                    iZ = AbstractC4511z5.P(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iZ;
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    z10 = false;
                    iX = AbstractC4511z5.s(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 31:
                    z10 = false;
                    iX = AbstractC4511z5.x(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 32:
                    z10 = false;
                    iX = AbstractC4511z5.A(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 33:
                    z10 = false;
                    iX = AbstractC4511z5.J(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case 34:
                    z10 = false;
                    iX = AbstractC4511z5.M(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += iX;
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    iB = AbstractC4511z5.B((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 36:
                    iB = AbstractC4511z5.y((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 37:
                    iB = AbstractC4511z5.H((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 38:
                    iB = AbstractC4511z5.T((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 39:
                    iB = AbstractC4511z5.E((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 40:
                    iB = AbstractC4511z5.B((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 41:
                    iB = AbstractC4511z5.y((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 42:
                    iB = AbstractC4511z5.e((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 43:
                    iB = AbstractC4511z5.Q((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 44:
                    iB = AbstractC4511z5.t((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 45:
                    iB = AbstractC4511z5.y((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 46:
                    iB = AbstractC4511z5.B((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 47:
                    iB = AbstractC4511z5.K((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 48:
                    iB = AbstractC4511z5.N((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iS0 = zzjr.s0(i19);
                        iV0 = zzjr.v0(iB);
                        iP0 = iS0 + iV0 + iB;
                        i17 += iP0;
                    }
                    break;
                case 49:
                    iZ = AbstractC4511z5.c(i19, (List) unsafe.getObject(obj, j10), L(i16));
                    i17 += iZ;
                    break;
                case 50:
                    iZ = this.f35300p.e(i19, unsafe.getObject(obj, j10), N(i16));
                    i17 += iZ;
                    break;
                case 51:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.e(i19, 0.0d);
                        i17 += iZ;
                    }
                    break;
                case 52:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.f(i19, 0.0f);
                        i17 += iZ;
                    }
                    break;
                case 53:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.Y(i19, J(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 54:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.m0(i19, J(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 55:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.l0(i19, E(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 56:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.P(i19, 0L);
                        i17 += iZ;
                    }
                    break;
                case 57:
                    if (H(obj, i19, i16)) {
                        iP0 = zzjr.h0(i19, 0);
                        i17 += iP0;
                    }
                    break;
                case 58:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.z(i19, true);
                        i17 += iZ;
                    }
                    break;
                case 59:
                    if (H(obj, i19, i16)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        iZ = object2 instanceof V3 ? zzjr.Q(i19, (V3) object2) : zzjr.y(i19, (String) object2);
                        i17 += iZ;
                    }
                    break;
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (H(obj, i19, i16)) {
                        iZ = AbstractC4511z5.a(i19, unsafe.getObject(obj, j10), L(i16));
                        i17 += iZ;
                    }
                    break;
                case 61:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.Q(i19, (V3) unsafe.getObject(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 62:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.w0(i19, E(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 63:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.d0(i19, E(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case 64:
                    if (H(obj, i19, i16)) {
                        iP0 = zzjr.p0(i19, 0);
                        i17 += iP0;
                    }
                    break;
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.e0(i19, 0L);
                        i17 += iZ;
                    }
                    break;
                case 66:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.t0(i19, E(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.i0(i19, J(obj, j10));
                        i17 += iZ;
                    }
                    break;
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (H(obj, i19, i16)) {
                        iZ = zzjr.x(i19, (InterfaceC4366h5) unsafe.getObject(obj, j10), L(i16));
                        i17 += iZ;
                    }
                    break;
            }
            i16 += 3;
            i14 = i10;
            i15 = i11;
            i13 = 1048575;
        }
        int iB2 = 0;
        L5 l52 = this.f35298n;
        int iA = i17 + l52.a(l52.k(obj));
        if (!this.f35290f) {
            return iA;
        }
        C4486w4 c4486w4B = this.f35299o.b(obj);
        int iB3 = c4486w4B.f35517a.b();
        for (int i22 = 0; i22 < iB3; i22++) {
            Map.Entry entryH = c4486w4B.f35517a.h(i22);
            AbstractC5487d.a(entryH.getKey());
            iB2 += C4486w4.b(null, entryH.getValue());
        }
        for (Map.Entry entry : c4486w4B.f35517a.i()) {
            AbstractC5487d.a(entry.getKey());
            iB2 += C4486w4.b(null, entry.getValue());
        }
        return iA + iB2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final int zzb(Object obj) {
        int i10;
        int iB;
        int length = this.f35285a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iD = D(i12);
            int i13 = this.f35285a[i12];
            long j10 = 1048575 & iD;
            int iHashCode = 37;
            switch ((iD & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    iB = F4.b(Double.doubleToLongBits(N5.a(obj, j10)));
                    i11 = i10 + iB;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iB = Float.floatToIntBits(N5.n(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iB = F4.b(N5.x(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iB = F4.b(N5.x(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iB = N5.t(obj, j10);
                    i11 = i10 + iB;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iB = F4.b(N5.x(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iB = N5.t(obj, j10);
                    i11 = i10 + iB;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iB = F4.c(N5.F(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iB = ((String) N5.B(obj, j10)).hashCode();
                    i11 = i10 + iB;
                    break;
                case 9:
                    Object objB = N5.B(obj, j10);
                    if (objB != null) {
                        iHashCode = objB.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iB = N5.B(obj, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iB = N5.t(obj, j10);
                    i11 = i10 + iB;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iB = N5.t(obj, j10);
                    i11 = i10 + iB;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iB = N5.t(obj, j10);
                    i11 = i10 + iB;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iB = F4.b(N5.x(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iB = N5.t(obj, j10);
                    i11 = i10 + iB;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iB = F4.b(N5.x(obj, j10));
                    i11 = i10 + iB;
                    break;
                case 17:
                    Object objB2 = N5.B(obj, j10);
                    if (objB2 != null) {
                        iHashCode = objB2.hashCode();
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
                    iB = N5.B(obj, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iB = N5.B(obj, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 51:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.b(Double.doubleToLongBits(g(obj, j10)));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = Float.floatToIntBits(y(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.b(J(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.b(J(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = E(obj, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.b(J(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = E(obj, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.c(M(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = ((String) N5.B(obj, j10)).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = N5.B(obj, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = N5.B(obj, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = E(obj, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = E(obj, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = E(obj, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.b(J(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = E(obj, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = F4.b(J(obj, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (H(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iB = N5.B(obj, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f35298n.k(obj).hashCode();
        return this.f35290f ? (iHashCode2 * 53) + this.f35299o.b(obj).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4495x5
    public final Object zza() {
        return this.f35296l.zza(this.f35289e);
    }
}
