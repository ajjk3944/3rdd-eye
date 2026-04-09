package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.ar.core.ImageFormat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class C2 implements J2 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f35558m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    private static final Unsafe f35559n = AbstractC4539c3.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f35560a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f35561b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35562c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35563d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4790z2 f35564e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35565f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35566g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f35567h;

    /* renamed from: i, reason: collision with root package name */
    private final int f35568i;

    /* renamed from: j, reason: collision with root package name */
    private final int f35569j;

    /* renamed from: k, reason: collision with root package name */
    private final V2 f35570k;

    /* renamed from: l, reason: collision with root package name */
    private final O1 f35571l;

    private C2(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC4790z2 interfaceC4790z2, boolean z10, int[] iArr2, int i12, int i13, E2 e22, C4637l2 c4637l2, V2 v22, O1 o12, C4735u2 c4735u2) {
        this.f35560a = iArr;
        this.f35561b = objArr;
        this.f35562c = i10;
        this.f35563d = i11;
        this.f35566g = interfaceC4790z2 instanceof AbstractC4516a2;
        boolean z11 = false;
        if (o12 != null && (interfaceC4790z2 instanceof Y1)) {
            z11 = true;
        }
        this.f35565f = z11;
        this.f35567h = iArr2;
        this.f35568i = i12;
        this.f35569j = i13;
        this.f35570k = v22;
        this.f35571l = o12;
        this.f35564e = interfaceC4790z2;
    }

    private static float A(Object obj, long j10) {
        return ((Float) AbstractC4539c3.k(obj, j10)).floatValue();
    }

    private static int B(Object obj, long j10) {
        return ((Integer) AbstractC4539c3.k(obj, j10)).intValue();
    }

    private final int C(int i10) {
        if (i10 < this.f35562c || i10 > this.f35563d) {
            return -1;
        }
        return E(i10, 0);
    }

    private final int D(int i10) {
        return this.f35560a[i10 + 2];
    }

    private final int E(int i10, int i11) {
        int length = (this.f35560a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f35560a[i13];
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

    private static int F(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int G(int i10) {
        return this.f35560a[i10 + 1];
    }

    private static long H(Object obj, long j10) {
        return ((Long) AbstractC4539c3.k(obj, j10)).longValue();
    }

    private final InterfaceC4538c2 I(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC4538c2) this.f35561b[i11 + i11 + 1];
    }

    private final J2 J(int i10) {
        Object[] objArr = this.f35561b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        J2 j22 = (J2) objArr[i12];
        if (j22 != null) {
            return j22;
        }
        J2 j2B = G2.a().b((Class) objArr[i12 + 1]);
        this.f35561b[i12] = j2B;
        return j2B;
    }

    private final Object K(Object obj, int i10, Object obj2, V2 v22, Object obj3) {
        InterfaceC4538c2 interfaceC4538c2I;
        int i11 = this.f35560a[i10];
        Object objK = AbstractC4539c3.k(obj, G(i10) & 1048575);
        if (objK == null || (interfaceC4538c2I = I(i10)) == null) {
            return obj2;
        }
        C4702r2 c4702r2C = ((C4713s2) L(i10)).c();
        Iterator it = ((C4724t2) objK).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC4538c2I.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = v22.a(obj3);
                }
                int iB = C4713s2.b(c4702r2C, entry.getKey(), entry.getValue());
                B1 b12 = B1.f35555b;
                byte[] bArr = new byte[iB];
                G1 g12 = new G1(bArr, 0, iB);
                try {
                    C4713s2.e(g12, c4702r2C, entry.getKey(), entry.getValue());
                    v22.b(obj2, i11, AbstractC4767x1.a(g12, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private final Object L(int i10) {
        int i11 = i10 / 3;
        return this.f35561b[i11 + i11];
    }

    private final Object c(Object obj, int i10) {
        J2 j2J = J(i10);
        int iG = G(i10) & 1048575;
        if (!o(obj, i10)) {
            return j2J.zze();
        }
        Object object = f35559n.getObject(obj, iG);
        if (r(object)) {
            return object;
        }
        Object objZze = j2J.zze();
        if (object != null) {
            j2J.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object d(Object obj, int i10, int i11) {
        J2 j2J = J(i11);
        if (!s(obj, i10, i11)) {
            return j2J.zze();
        }
        Object object = f35559n.getObject(obj, G(i11) & 1048575);
        if (r(object)) {
            return object;
        }
        Object objZze = j2J.zze();
        if (object != null) {
            j2J.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field e(Class cls, String str) {
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

    private static void f(Object obj) {
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void g(Object obj, Object obj2, int i10) {
        if (o(obj2, i10)) {
            int iG = G(i10) & 1048575;
            Unsafe unsafe = f35559n;
            long j10 = iG;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f35560a[i10] + " is present but null: " + obj2.toString());
            }
            J2 j2J = J(i10);
            if (!o(obj, i10)) {
                if (r(object)) {
                    Object objZze = j2J.zze();
                    j2J.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                i(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!r(object2)) {
                Object objZze2 = j2J.zze();
                j2J.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            j2J.zzg(object2, object);
        }
    }

    private final void h(Object obj, Object obj2, int i10) {
        int i11 = this.f35560a[i10];
        if (s(obj2, i11, i10)) {
            int iG = G(i10) & 1048575;
            Unsafe unsafe = f35559n;
            long j10 = iG;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f35560a[i10] + " is present but null: " + obj2.toString());
            }
            J2 j2J = J(i10);
            if (!s(obj, i11, i10)) {
                if (r(object)) {
                    Object objZze = j2J.zze();
                    j2J.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                j(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!r(object2)) {
                Object objZze2 = j2J.zze();
                j2J.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            j2J.zzg(object2, object);
        }
    }

    private final void i(Object obj, int i10) {
        int iD = D(i10);
        long j10 = 1048575 & iD;
        if (j10 == 1048575) {
            return;
        }
        AbstractC4539c3.v(obj, j10, (1 << (iD >>> 20)) | AbstractC4539c3.h(obj, j10));
    }

    private final void j(Object obj, int i10, int i11) {
        AbstractC4539c3.v(obj, D(i11) & 1048575, i10);
    }

    private final void k(Object obj, int i10, Object obj2) {
        f35559n.putObject(obj, G(i10) & 1048575, obj2);
        i(obj, i10);
    }

    private final void l(Object obj, int i10, int i11, Object obj2) {
        f35559n.putObject(obj, G(i11) & 1048575, obj2);
        j(obj, i10, i11);
    }

    private final boolean m(Object obj, Object obj2, int i10) {
        return o(obj, i10) == o(obj2, i10);
    }

    private static boolean n(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean o(Object obj, int i10) {
        int iD = D(i10);
        long j10 = iD & 1048575;
        if (j10 != 1048575) {
            return (AbstractC4539c3.h(obj, j10) & (1 << (iD >>> 20))) != 0;
        }
        int iG = G(i10);
        long j11 = iG & 1048575;
        switch (F(iG)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC4539c3.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC4539c3.g(obj, j11)) != 0;
            case 2:
                return AbstractC4539c3.i(obj, j11) != 0;
            case 3:
                return AbstractC4539c3.i(obj, j11) != 0;
            case 4:
                return AbstractC4539c3.h(obj, j11) != 0;
            case 5:
                return AbstractC4539c3.i(obj, j11) != 0;
            case 6:
                return AbstractC4539c3.h(obj, j11) != 0;
            case 7:
                return AbstractC4539c3.B(obj, j11);
            case 8:
                Object objK = AbstractC4539c3.k(obj, j11);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof B1) {
                    return !B1.f35555b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC4539c3.k(obj, j11) != null;
            case 10:
                return !B1.f35555b.equals(AbstractC4539c3.k(obj, j11));
            case 11:
                return AbstractC4539c3.h(obj, j11) != 0;
            case 12:
                return AbstractC4539c3.h(obj, j11) != 0;
            case 13:
                return AbstractC4539c3.h(obj, j11) != 0;
            case 14:
                return AbstractC4539c3.i(obj, j11) != 0;
            case 15:
                return AbstractC4539c3.h(obj, j11) != 0;
            case 16:
                return AbstractC4539c3.i(obj, j11) != 0;
            case 17:
                return AbstractC4539c3.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean p(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? o(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean q(Object obj, int i10, J2 j22) {
        return j22.zzl(AbstractC4539c3.k(obj, i10 & 1048575));
    }

    private static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4516a2) {
            return ((AbstractC4516a2) obj).u();
        }
        return true;
    }

    private final boolean s(Object obj, int i10, int i11) {
        return AbstractC4539c3.h(obj, (long) (D(i11) & 1048575)) == i10;
    }

    private static boolean t(Object obj, long j10) {
        return ((Boolean) AbstractC4539c3.k(obj, j10)).booleanValue();
    }

    private static final int u(byte[] bArr, int i10, int i11, EnumC4605i3 enumC4605i3, Class cls, C4680p1 c4680p1) {
        int i12;
        EnumC4605i3 enumC4605i32 = EnumC4605i3.zza;
        switch (enumC4605i3.ordinal()) {
            case 0:
                i12 = i10 + 8;
                c4680p1.f35709c = Double.valueOf(Double.longBitsToDouble(AbstractC4691q1.q(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                c4680p1.f35709c = Float.valueOf(Float.intBitsToFloat(AbstractC4691q1.b(bArr, i10)));
                break;
            case 2:
            case 3:
                int iM = AbstractC4691q1.m(bArr, i10, c4680p1);
                c4680p1.f35709c = Long.valueOf(c4680p1.f35708b);
                return iM;
            case 4:
            case 12:
            case 13:
                int iJ = AbstractC4691q1.j(bArr, i10, c4680p1);
                c4680p1.f35709c = Integer.valueOf(c4680p1.f35707a);
                return iJ;
            case 5:
            case 15:
                i12 = i10 + 8;
                c4680p1.f35709c = Long.valueOf(AbstractC4691q1.q(bArr, i10));
                break;
            case 6:
            case 14:
                i12 = i10 + 4;
                c4680p1.f35709c = Integer.valueOf(AbstractC4691q1.b(bArr, i10));
                break;
            case 7:
                int iM2 = AbstractC4691q1.m(bArr, i10, c4680p1);
                c4680p1.f35709c = Boolean.valueOf(c4680p1.f35708b != 0);
                return iM2;
            case 8:
                return AbstractC4691q1.h(bArr, i10, c4680p1);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return AbstractC4691q1.d(G2.a().b(cls), bArr, i10, i11, c4680p1);
            case 11:
                return AbstractC4691q1.a(bArr, i10, c4680p1);
            case 16:
                int iJ2 = AbstractC4691q1.j(bArr, i10, c4680p1);
                c4680p1.f35709c = Integer.valueOf(F1.a(c4680p1.f35707a));
                return iJ2;
            case 17:
                int iM3 = AbstractC4691q1.m(bArr, i10, c4680p1);
                c4680p1.f35709c = Long.valueOf(F1.b(c4680p1.f35708b));
                return iM3;
        }
        return i12;
    }

    private static final void v(int i10, Object obj, InterfaceC4627k3 interfaceC4627k3) {
        if (obj instanceof String) {
            interfaceC4627k3.h(i10, (String) obj);
        } else {
            interfaceC4627k3.e(i10, (B1) obj);
        }
    }

    static W2 x(Object obj) {
        AbstractC4516a2 abstractC4516a2 = (AbstractC4516a2) obj;
        W2 w22 = abstractC4516a2.zzc;
        if (w22 != W2.c()) {
            return w22;
        }
        W2 w2F = W2.f();
        abstractC4516a2.zzc = w2F;
        return w2F;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.mlkit_vision_internal_vkp.C2 y(java.lang.Class r34, com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4757w2 r35, com.google.android.gms.internal.mlkit_vision_internal_vkp.E2 r36, com.google.android.gms.internal.mlkit_vision_internal_vkp.C4637l2 r37, com.google.android.gms.internal.mlkit_vision_internal_vkp.V2 r38, com.google.android.gms.internal.mlkit_vision_internal_vkp.O1 r39, com.google.android.gms.internal.mlkit_vision_internal_vkp.C4735u2 r40) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.y(java.lang.Class, com.google.android.gms.internal.mlkit_vision_internal_vkp.w2, com.google.android.gms.internal.mlkit_vision_internal_vkp.E2, com.google.android.gms.internal.mlkit_vision_internal_vkp.l2, com.google.android.gms.internal.mlkit_vision_internal_vkp.V2, com.google.android.gms.internal.mlkit_vision_internal_vkp.O1, com.google.android.gms.internal.mlkit_vision_internal_vkp.u2):com.google.android.gms.internal.mlkit_vision_internal_vkp.C2");
    }

    private static double z(Object obj, long j10) {
        return ((Double) AbstractC4539c3.k(obj, j10)).doubleValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r24, com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3 r25) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.a(java.lang.Object, com.google.android.gms.internal.mlkit_vision_internal_vkp.k3):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final void b(Object obj, byte[] bArr, int i10, int i11, C4680p1 c4680p1) {
        w(obj, bArr, i10, i11, 0, c4680p1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:404:0x0a73, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0d0d A[PHI: r2 r3 r6 r7 r8 r18 r25
  0x0d0d: PHI (r2v146 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1) = 
  (r2v130 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v131 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v132 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v133 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v134 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v135 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v136 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v137 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v140 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v143 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
  (r2v147 com.google.android.gms.internal.mlkit_vision_internal_vkp.p1)
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0d0d: PHI (r3v109 byte[]) = 
  (r3v85 byte[])
  (r3v86 byte[])
  (r3v87 byte[])
  (r3v88 byte[])
  (r3v89 byte[])
  (r3v90 byte[])
  (r3v91 byte[])
  (r3v92 byte[])
  (r3v100 byte[])
  (r3v105 byte[])
  (r3v110 byte[])
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0d0d: PHI (r6v42 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2) = 
  (r6v23 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v24 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v25 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v26 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v27 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v28 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v29 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v30 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v35 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v39 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
  (r6v43 com.google.android.gms.internal.mlkit_vision_internal_vkp.C2)
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0d0d: PHI (r7v68 java.lang.Object) = 
  (r7v49 java.lang.Object)
  (r7v50 java.lang.Object)
  (r7v51 java.lang.Object)
  (r7v52 java.lang.Object)
  (r7v53 java.lang.Object)
  (r7v54 java.lang.Object)
  (r7v55 java.lang.Object)
  (r7v56 java.lang.Object)
  (r7v61 java.lang.Object)
  (r7v65 java.lang.Object)
  (r7v69 java.lang.Object)
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0d0d: PHI (r8v134 int) = 
  (r8v109 int)
  (r8v110 int)
  (r8v111 int)
  (r8v112 int)
  (r8v113 int)
  (r8v114 int)
  (r8v115 int)
  (r8v116 int)
  (r8v123 int)
  (r8v128 int)
  (r8v135 int)
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0d0d: PHI (r18v70 int) = 
  (r18v54 int)
  (r18v55 int)
  (r18v56 int)
  (r18v57 int)
  (r18v58 int)
  (r18v59 int)
  (r18v60 int)
  (r18v61 int)
  (r18v63 int)
  (r18v66 int)
  (r18v71 int)
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0d0d: PHI (r25v27 int) = 
  (r25v8 int)
  (r25v9 int)
  (r25v10 int)
  (r25v11 int)
  (r25v12 int)
  (r25v13 int)
  (r25v14 int)
  (r25v15 int)
  (r25v20 int)
  (r25v24 int)
  (r25v28 int)
 binds: [B:476:0x0cf6, B:473:0x0cd1, B:470:0x0cb0, B:467:0x0c8f, B:464:0x0c6e, B:461:0x0c4c, B:454:0x0c22, B:440:0x0bdd, B:419:0x0b1e, B:413:0x0ae7, B:409:0x0aa3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x092f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0d10 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0946 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0d26 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int w(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.mlkit_vision_internal_vkp.C4680p1 r36) {
        /*
            Method dump skipped, instructions count: 3688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.w(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_internal_vkp.p1):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e9  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f35560a.length; i13 += 3) {
            int iG = G(i13);
            int[] iArr = this.f35560a;
            int i14 = 1048575 & iG;
            int iF = F(iG);
            int i15 = iArr[i13];
            long j10 = i14;
            int iHashCode = 37;
            switch (iF) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC4539c3.f(obj, j10));
                    byte[] bArr = AbstractC4593h2.f35692b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC4539c3.g(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = AbstractC4539c3.i(obj, j10);
                    byte[] bArr2 = AbstractC4593h2.f35692b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = AbstractC4539c3.i(obj, j10);
                    byte[] bArr3 = AbstractC4593h2.f35692b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = AbstractC4539c3.i(obj, j10);
                    byte[] bArr4 = AbstractC4593h2.f35692b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4593h2.a(AbstractC4539c3.B(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) AbstractC4539c3.k(obj, j10)).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objK = AbstractC4539c3.k(obj, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = AbstractC4539c3.i(obj, j10);
                    byte[] bArr5 = AbstractC4593h2.f35692b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = AbstractC4539c3.i(obj, j10);
                    byte[] bArr6 = AbstractC4593h2.f35692b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objK2 = AbstractC4539c3.k(obj, j10);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = AbstractC4539c3.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(z(obj, j10));
                        byte[] bArr7 = AbstractC4593h2.f35692b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(A(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = H(obj, j10);
                        byte[] bArr8 = AbstractC4593h2.f35692b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = H(obj, j10);
                        byte[] bArr9 = AbstractC4593h2.f35692b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = B(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = H(obj, j10);
                        byte[] bArr10 = AbstractC4593h2.f35692b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = B(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = AbstractC4593h2.a(t(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) AbstractC4539c3.k(obj, j10)).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = AbstractC4539c3.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = AbstractC4539c3.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = B(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = B(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = B(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = H(obj, j10);
                        byte[] bArr11 = AbstractC4593h2.f35692b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = B(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = H(obj, j10);
                        byte[] bArr12 = AbstractC4593h2.f35692b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = AbstractC4539c3.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i12 * 53) + ((AbstractC4516a2) obj).zzc.hashCode();
        return this.f35565f ? (iHashCode2 * 53) + ((Y1) obj).zzb.f35633a.hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final Object zze() {
        return ((AbstractC4516a2) this.f35564e).f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_internal_vkp.a2 r0 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.q(r2)
            r0.zza = r1
            r0.o()
        L1b:
            int[] r0 = r7.f35560a
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.G(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = F(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
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
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.f35559n
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.mlkit_vision_internal_vkp.t2 r6 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.C4724t2) r6
            r6.l()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4539c3.k(r8, r3)
            com.google.android.gms.internal.mlkit_vision_internal_vkp.g2 r2 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.f35560a
            r2 = r2[r1]
            boolean r2 = r7.s(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_internal_vkp.J2 r2 = r7.J(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.f35559n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.o(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_internal_vkp.J2 r2 = r7.J(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.f35559n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.V2 r0 = r7.f35570k
            r0.d(r8)
            boolean r0 = r7.f35565f
            if (r0 == 0) goto L95
            com.google.android.gms.internal.mlkit_vision_internal_vkp.O1 r0 = r7.f35571l
            r0.a(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final void zzg(Object obj, Object obj2) {
        f(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f35560a.length; i10 += 3) {
            int iG = G(i10);
            int i11 = 1048575 & iG;
            int[] iArr = this.f35560a;
            int iF = F(iG);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iF) {
                case 0:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.t(obj, j10, AbstractC4539c3.f(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.u(obj, j10, AbstractC4539c3.g(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.w(obj, j10, AbstractC4539c3.i(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.w(obj, j10, AbstractC4539c3.i(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.v(obj, j10, AbstractC4539c3.h(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.w(obj, j10, AbstractC4539c3.i(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.v(obj, j10, AbstractC4539c3.h(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.r(obj, j10, AbstractC4539c3.B(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.x(obj, j10, AbstractC4539c3.k(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    g(obj, obj2, i10);
                    break;
                case 10:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.x(obj, j10, AbstractC4539c3.k(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.v(obj, j10, AbstractC4539c3.h(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.v(obj, j10, AbstractC4539c3.h(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.v(obj, j10, AbstractC4539c3.h(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.w(obj, j10, AbstractC4539c3.i(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.v(obj, j10, AbstractC4539c3.h(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (o(obj2, i10)) {
                        AbstractC4539c3.w(obj, j10, AbstractC4539c3.i(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    g(obj, obj2, i10);
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
                    InterfaceC4582g2 interfaceC4582g2Zzd = (InterfaceC4582g2) AbstractC4539c3.k(obj, j10);
                    InterfaceC4582g2 interfaceC4582g2 = (InterfaceC4582g2) AbstractC4539c3.k(obj2, j10);
                    int size = interfaceC4582g2Zzd.size();
                    int size2 = interfaceC4582g2.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC4582g2Zzd.zzc()) {
                            interfaceC4582g2Zzd = interfaceC4582g2Zzd.zzd(size2 + size);
                        }
                        interfaceC4582g2Zzd.addAll(interfaceC4582g2);
                    }
                    if (size > 0) {
                        interfaceC4582g2 = interfaceC4582g2Zzd;
                    }
                    AbstractC4539c3.x(obj, j10, interfaceC4582g2);
                    break;
                case 50:
                    int i13 = L2.f35610b;
                    AbstractC4539c3.x(obj, j10, C4735u2.b(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10)));
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
                    if (s(obj2, i12, i10)) {
                        AbstractC4539c3.x(obj, j10, AbstractC4539c3.k(obj2, j10));
                        j(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    h(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                case 66:
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (s(obj2, i12, i10)) {
                        AbstractC4539c3.x(obj, j10, AbstractC4539c3.k(obj2, j10));
                        j(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    h(obj, obj2, i10);
                    break;
            }
        }
        L2.w(this.f35570k, obj, obj2);
        if (this.f35565f) {
            L2.v(this.f35571l, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final boolean zzk(Object obj, Object obj2) {
        boolean zF;
        for (int i10 = 0; i10 < this.f35560a.length; i10 += 3) {
            int iG = G(i10);
            long j10 = iG & 1048575;
            switch (F(iG)) {
                case 0:
                    if (!m(obj, obj2, i10) || Double.doubleToLongBits(AbstractC4539c3.f(obj, j10)) != Double.doubleToLongBits(AbstractC4539c3.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!m(obj, obj2, i10) || Float.floatToIntBits(AbstractC4539c3.g(obj, j10)) != Float.floatToIntBits(AbstractC4539c3.g(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.i(obj, j10) != AbstractC4539c3.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.i(obj, j10) != AbstractC4539c3.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.h(obj, j10) != AbstractC4539c3.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.i(obj, j10) != AbstractC4539c3.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.h(obj, j10) != AbstractC4539c3.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.B(obj, j10) != AbstractC4539c3.B(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!m(obj, obj2, i10) || !L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!m(obj, obj2, i10) || !L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!m(obj, obj2, i10) || !L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.h(obj, j10) != AbstractC4539c3.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.h(obj, j10) != AbstractC4539c3.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.h(obj, j10) != AbstractC4539c3.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.i(obj, j10) != AbstractC4539c3.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.h(obj, j10) != AbstractC4539c3.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!m(obj, obj2, i10) || AbstractC4539c3.i(obj, j10) != AbstractC4539c3.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!m(obj, obj2, i10) || !L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10))) {
                        return false;
                    }
                    continue;
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
                    zF = L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10));
                    break;
                case 50:
                    zF = L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10));
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
                    long jD = D(i10) & 1048575;
                    if (AbstractC4539c3.h(obj, jD) != AbstractC4539c3.h(obj2, jD) || !L2.f(AbstractC4539c3.k(obj, j10), AbstractC4539c3.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zF) {
                return false;
            }
        }
        if (!((AbstractC4516a2) obj).zzc.equals(((AbstractC4516a2) obj2).zzc)) {
            return false;
        }
        if (this.f35565f) {
            return ((Y1) obj).zzb.equals(((Y1) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.C2.zzl(java.lang.Object):boolean");
    }
}
