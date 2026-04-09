package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import f.AbstractC5487d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class S1 {

    /* renamed from: d, reason: collision with root package name */
    private static final S1 f35632d = new S1(true);

    /* renamed from: a, reason: collision with root package name */
    final T2 f35633a = new M2();

    /* renamed from: b, reason: collision with root package name */
    private boolean f35634b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35635c;

    private S1() {
    }

    static int a(EnumC4605i3 enumC4605i3, int i10, Object obj) {
        int iM;
        int iF;
        int iF2 = I1.f(i10 << 3);
        if (enumC4605i3 == EnumC4605i3.zzj) {
            AbstractC4593h2.d((InterfaceC4790z2) obj);
            iF2 += iF2;
        }
        EnumC4616j3 enumC4616j3 = EnumC4616j3.INT;
        int iG = 4;
        switch (enumC4605i3.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                iG = 8;
                return iF2 + iG;
            case 1:
                ((Float) obj).floatValue();
                return iF2 + iG;
            case 2:
                iG = I1.g(((Long) obj).longValue());
                return iF2 + iG;
            case 3:
                iG = I1.g(((Long) obj).longValue());
                return iF2 + iG;
            case 4:
                iG = I1.g(((Integer) obj).intValue());
                return iF2 + iG;
            case 5:
                ((Long) obj).longValue();
                iG = 8;
                return iF2 + iG;
            case 6:
                ((Integer) obj).intValue();
                return iF2 + iG;
            case 7:
                ((Boolean) obj).booleanValue();
                iG = 1;
                return iF2 + iG;
            case 8:
                if (!(obj instanceof B1)) {
                    iG = I1.e((String) obj);
                    return iF2 + iG;
                }
                iM = ((B1) obj).m();
                iF = I1.f(iM);
                iG = iF + iM;
                return iF2 + iG;
            case 9:
                iG = ((InterfaceC4790z2) obj).b();
                return iF2 + iG;
            case 10:
                iG = I1.c((InterfaceC4790z2) obj);
                return iF2 + iG;
            case 11:
                if (obj instanceof B1) {
                    iM = ((B1) obj).m();
                    iF = I1.f(iM);
                } else {
                    iM = ((byte[]) obj).length;
                    iF = I1.f(iM);
                }
                iG = iF + iM;
                return iF2 + iG;
            case 12:
                iG = I1.f(((Integer) obj).intValue());
                return iF2 + iG;
            case 13:
                iG = I1.g(((Integer) obj).intValue());
                return iF2 + iG;
            case 14:
                ((Integer) obj).intValue();
                return iF2 + iG;
            case 15:
                ((Long) obj).longValue();
                iG = 8;
                return iF2 + iG;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iG = I1.f((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iF2 + iG;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iG = I1.g((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iF2 + iG;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(R1 r12, Object obj) {
        EnumC4605i3 enumC4605i3Zzd = r12.zzd();
        r12.zza();
        r12.zzg();
        return a(enumC4605i3Zzd, 32149011, obj);
    }

    public static S1 e() {
        return f35632d;
    }

    static void j(I1 i12, EnumC4605i3 enumC4605i3, int i10, Object obj) {
        if (enumC4605i3 == EnumC4605i3.zzj) {
            InterfaceC4790z2 interfaceC4790z2 = (InterfaceC4790z2) obj;
            AbstractC4593h2.d(interfaceC4790z2);
            i12.C(i10, 3);
            interfaceC4790z2.d(i12);
            i12.C(i10, 4);
            return;
        }
        i12.C(i10, enumC4605i3.zza());
        EnumC4616j3 enumC4616j3 = EnumC4616j3.INT;
        switch (enumC4605i3.ordinal()) {
            case 0:
                i12.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                i12.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                i12.G(((Long) obj).longValue());
                break;
            case 3:
                i12.G(((Long) obj).longValue());
                break;
            case 4:
                i12.v(((Integer) obj).intValue());
                break;
            case 5:
                i12.t(((Long) obj).longValue());
                break;
            case 6:
                i12.r(((Integer) obj).intValue());
                break;
            case 7:
                i12.k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof B1)) {
                    i12.B((String) obj);
                    break;
                } else {
                    i12.p((B1) obj);
                    break;
                }
            case 9:
                ((InterfaceC4790z2) obj).d(i12);
                break;
            case 10:
                i12.x((InterfaceC4790z2) obj);
                break;
            case 11:
                if (!(obj instanceof B1)) {
                    byte[] bArr = (byte[]) obj;
                    i12.m(bArr, 0, bArr.length);
                    break;
                } else {
                    i12.p((B1) obj);
                    break;
                }
            case 12:
                i12.E(((Integer) obj).intValue());
                break;
            case 13:
                i12.v(((Integer) obj).intValue());
                break;
            case 14:
                i12.r(((Integer) obj).intValue());
                break;
            case 15:
                i12.t(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                i12.E((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                i12.G((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private final void m(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private static boolean n(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        throw null;
    }

    private static final int o(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final int c() {
        int iE = this.f35633a.e();
        int iO = 0;
        for (int i10 = 0; i10 < iE; i10++) {
            iO += o(this.f35633a.i(i10));
        }
        Iterator it = this.f35633a.f().iterator();
        while (it.hasNext()) {
            iO += o((Map.Entry) it.next());
        }
        return iO;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final S1 clone() {
        S1 s12 = new S1();
        int iE = this.f35633a.e();
        for (int i10 = 0; i10 < iE; i10++) {
            Map.Entry entryI = this.f35633a.i(i10);
            AbstractC5487d.a(((N2) entryI).a());
            s12.i(null, entryI.getValue());
        }
        for (Map.Entry entry : this.f35633a.f()) {
            AbstractC5487d.a(entry.getKey());
            s12.i(null, entry.getValue());
        }
        s12.f35635c = this.f35635c;
        return s12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S1) {
            return this.f35633a.equals(((S1) obj).f35633a);
        }
        return false;
    }

    public final Iterator f() {
        return this.f35633a.isEmpty() ? Collections.emptyIterator() : this.f35635c ? new C4615j2(this.f35633a.entrySet().iterator()) : this.f35633a.entrySet().iterator();
    }

    public final void g() {
        if (this.f35634b) {
            return;
        }
        int iE = this.f35633a.e();
        for (int i10 = 0; i10 < iE; i10++) {
            Map.Entry entryI = this.f35633a.i(i10);
            if (entryI.getValue() instanceof AbstractC4516a2) {
                ((AbstractC4516a2) entryI.getValue()).n();
            }
        }
        this.f35633a.b();
        this.f35634b = true;
    }

    public final void h(S1 s12) {
        int iE = s12.f35633a.e();
        for (int i10 = 0; i10 < iE; i10++) {
            m(s12.f35633a.i(i10));
        }
        Iterator it = s12.f35633a.f().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f35633a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4790z2) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r4 instanceof java.lang.Integer) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.android.gms.internal.mlkit_vision_internal_vkp.R1 r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.i3 r0 = r3.zzd()
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4593h2.f35692b
            r4.getClass()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.i3 r1 = com.google.android.gms.internal.mlkit_vision_internal_vkp.EnumC4605i3.zza
            com.google.android.gms.internal.mlkit_vision_internal_vkp.j3 r1 = com.google.android.gms.internal.mlkit_vision_internal_vkp.EnumC4616j3.INT
            com.google.android.gms.internal.mlkit_vision_internal_vkp.j3 r0 = r0.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L21;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L48
        L1c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4790z2
            if (r0 == 0) goto L48
            goto L42
        L21:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L48
            goto L42
        L26:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L48
            goto L42
        L2f:
            boolean r0 = r4 instanceof java.lang.String
            goto L40
        L32:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r0 = r4 instanceof java.lang.Double
            goto L40
        L38:
            boolean r0 = r4 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r0 = r4 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r0 = r4 instanceof java.lang.Integer
        L40:
            if (r0 == 0) goto L48
        L42:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.T2 r0 = r2.f35633a
            r0.put(r3, r4)
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3.zza()
            r1 = 32149011(0x1ea8e13, float:8.616189E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_vision_internal_vkp.i3 r3 = r3.zzd()
            com.google.android.gms.internal.mlkit_vision_internal_vkp.j3 r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.S1.i(com.google.android.gms.internal.mlkit_vision_internal_vkp.R1, java.lang.Object):void");
    }

    public final boolean k() {
        return this.f35634b;
    }

    public final boolean l() {
        int iE = this.f35633a.e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!n(this.f35633a.i(i10))) {
                return false;
            }
        }
        Iterator it = this.f35633a.f().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private S1(boolean z10) {
        g();
        g();
    }
}
