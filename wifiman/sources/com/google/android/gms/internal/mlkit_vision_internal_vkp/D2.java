package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class D2 implements J2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4790z2 f35578a;

    /* renamed from: b, reason: collision with root package name */
    private final V2 f35579b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35580c;

    /* renamed from: d, reason: collision with root package name */
    private final O1 f35581d;

    private D2(V2 v22, O1 o12, InterfaceC4790z2 interfaceC4790z2) {
        this.f35579b = v22;
        this.f35580c = interfaceC4790z2 instanceof Y1;
        this.f35581d = o12;
        this.f35578a = interfaceC4790z2;
    }

    static D2 c(V2 v22, O1 o12, InterfaceC4790z2 interfaceC4790z2) {
        return new D2(v22, o12, interfaceC4790z2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final void a(Object obj, InterfaceC4627k3 interfaceC4627k3) {
        Iterator itF = ((Y1) obj).zzb.f();
        if (itF.hasNext()) {
            AbstractC5487d.a(((Map.Entry) itF.next()).getKey());
            throw null;
        }
        ((AbstractC4516a2) obj).zzc.k(interfaceC4627k3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0077 A[EDGE_INSN: B:50:0x0077->B:28:0x0077 BREAK  A[LOOP:1: B:14:0x0040->B:53:0x0040], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r9, byte[] r10, int r11, int r12, com.google.android.gms.internal.mlkit_vision_internal_vkp.C4680p1 r13) throws com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew {
        /*
            r8 = this;
            r0 = r9
            com.google.android.gms.internal.mlkit_vision_internal_vkp.a2 r0 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2) r0
            com.google.android.gms.internal.mlkit_vision_internal_vkp.W2 r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_internal_vkp.W2 r2 = com.google.android.gms.internal.mlkit_vision_internal_vkp.W2.c()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.mlkit_vision_internal_vkp.W2 r1 = com.google.android.gms.internal.mlkit_vision_internal_vkp.W2.f()
            r0.zzc = r1
        L11:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.Y1 r9 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.Y1) r9
            r9.A()
        L16:
            if (r11 >= r12) goto L81
            int r4 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.j(r10, r11, r13)
            int r2 = r13.f35707a
            r9 = 11
            r11 = 2
            if (r2 == r9) goto L3e
            r9 = r2 & 7
            if (r9 != r11) goto L39
            com.google.android.gms.internal.mlkit_vision_internal_vkp.N1 r9 = r13.f35710d
            com.google.android.gms.internal.mlkit_vision_internal_vkp.z2 r11 = r8.f35578a
            int r0 = r2 >>> 3
            r9.b(r11, r0)
            r3 = r10
            r5 = r12
            r6 = r1
            r7 = r13
            int r11 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.i(r2, r3, r4, r5, r6, r7)
            goto L16
        L39:
            int r11 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.p(r2, r10, r4, r12, r13)
            goto L16
        L3e:
            r9 = 0
            r0 = 0
        L40:
            if (r4 >= r12) goto L76
            int r2 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.j(r10, r4, r13)
            int r3 = r13.f35707a
            int r4 = r3 >>> 3
            r5 = r3 & 7
            if (r4 == r11) goto L5d
            r6 = 3
            if (r4 == r6) goto L52
            goto L6d
        L52:
            if (r5 != r11) goto L6d
            int r4 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.a(r10, r2, r13)
            java.lang.Object r9 = r13.f35709c
            com.google.android.gms.internal.mlkit_vision_internal_vkp.B1 r9 = (com.google.android.gms.internal.mlkit_vision_internal_vkp.B1) r9
            goto L40
        L5d:
            if (r5 != 0) goto L6d
            int r4 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.j(r10, r2, r13)
            int r0 = r13.f35707a
            com.google.android.gms.internal.mlkit_vision_internal_vkp.N1 r2 = r13.f35710d
            com.google.android.gms.internal.mlkit_vision_internal_vkp.z2 r3 = r8.f35578a
            r2.b(r3, r0)
            goto L40
        L6d:
            r4 = 12
            if (r3 == r4) goto L77
            int r4 = com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4691q1.p(r3, r10, r2, r12, r13)
            goto L40
        L76:
            r2 = r4
        L77:
            if (r9 == 0) goto L7f
            int r0 = r0 << 3
            r11 = r11 | r0
            r1.j(r11, r9)
        L7f:
            r11 = r2
            goto L16
        L81:
            if (r11 != r12) goto L84
            return
        L84:
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew r9 = new com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew
            java.lang.String r10 = "Failed to parse the message."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.D2.b(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_internal_vkp.p1):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final int zza(Object obj) {
        int iB = ((AbstractC4516a2) obj).zzc.b();
        return this.f35580c ? iB + ((Y1) obj).zzb.c() : iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final int zzb(Object obj) {
        int iHashCode = ((AbstractC4516a2) obj).zzc.hashCode();
        return this.f35580c ? (iHashCode * 53) + ((Y1) obj).zzb.f35633a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final Object zze() {
        InterfaceC4790z2 interfaceC4790z2 = this.f35578a;
        return interfaceC4790z2 instanceof AbstractC4516a2 ? ((AbstractC4516a2) interfaceC4790z2).f() : interfaceC4790z2.c().s();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final void zzf(Object obj) {
        this.f35579b.d(obj);
        this.f35581d.a(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final void zzg(Object obj, Object obj2) {
        L2.w(this.f35579b, obj, obj2);
        if (this.f35580c) {
            L2.v(this.f35581d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final boolean zzk(Object obj, Object obj2) {
        if (!((AbstractC4516a2) obj).zzc.equals(((AbstractC4516a2) obj2).zzc)) {
            return false;
        }
        if (this.f35580c) {
            return ((Y1) obj).zzb.equals(((Y1) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.J2
    public final boolean zzl(Object obj) {
        return ((Y1) obj).zzb.l();
    }
}
