package com.google.android.gms.internal.play_billing;

import N7.B8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzci {
    private static final zzci zzb = new zzci(true);
    final zzfb zza = new zzer(16);
    private boolean zzc;
    private boolean zzd;

    private zzci() {
    }

    public static int zza(zzfv zzfvVar, int i, Object obj) {
        zzby.zzw(i << 3);
        if (zzfv.zzj == null) {
            byte[] bArr = zzda.zzd;
            if (((zzec) obj) instanceof zzaz) {
                throw null;
            }
        }
        zzfw zzfwVar = zzfw.INT;
        throw null;
    }

    public static int zzb(zzch zzchVar, Object obj) {
        zzfv zzfvVarZzd = zzchVar.zzd();
        int iZza = zzchVar.zza();
        if (!zzchVar.zzg()) {
            return zza(zzfvVarZzd, iZza, obj);
        }
        List list = (List) obj;
        int iZza2 = 0;
        if (!zzchVar.zzf()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzfvVarZzd, iZza, it.next());
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return zzby.zzw(0) + zzby.zzw(iZza << 3);
        }
        it2.next();
        zzfv zzfvVar = zzfv.zza;
        zzfw zzfwVar = zzfw.INT;
        throw null;
    }

    public static zzci zzd() {
        return zzb;
    }

    private static Object zzk(Object obj) {
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzl(Map.Entry entry) {
        zzch zzchVar = (zzch) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzdh;
        if (zzchVar.zzg()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZze = zze(zzchVar);
            if (objZze == null) {
                objZze = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZze).add(zzk(it.next()));
            }
            this.zza.put(zzchVar, objZze);
            return;
        }
        if (zzchVar.zze() != zzfw.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzchVar, zzk(value));
            return;
        }
        Object objZze2 = zze(zzchVar);
        if (objZze2 != null) {
            if (z10) {
                throw null;
            }
            this.zza.put(zzchVar, objZze2 instanceof zzeh ? zzchVar.zzc((zzeh) objZze2, (zzeh) value) : zzchVar.zzb(((zzec) objZze2).zzF(), (zzec) value).zzf());
        } else {
            this.zza.put(zzchVar, zzk(value));
            if (z10) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzm(Map.Entry entry) {
        zzch zzchVar = (zzch) entry.getKey();
        if (zzchVar.zze() != zzfw.MESSAGE) {
            return true;
        }
        if (!zzchVar.zzg()) {
            return zzn(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzn(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzn(Object obj) {
        if (obj instanceof zzed) {
            return ((zzed) obj).zzk();
        }
        if (obj instanceof zzdh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int iZzw;
        int iH;
        zzch zzchVar = (zzch) entry.getKey();
        Object value = entry.getValue();
        if (zzchVar.zze() != zzfw.MESSAGE || zzchVar.zzg() || zzchVar.zzf()) {
            return zzb(zzchVar, value);
        }
        if (value instanceof zzdh) {
            int iZza = ((zzch) entry.getKey()).zza();
            int iZzw2 = zzby.zzw(8);
            i = iZzw2 + iZzw2;
            iZzw = zzby.zzw(iZza) + zzby.zzw(16);
            int iZzw3 = zzby.zzw(24);
            int iZza2 = ((zzdh) value).zza();
            iH = B8.h(iZza2, iZza2, iZzw3);
        } else {
            int iZza3 = ((zzch) entry.getKey()).zza();
            int iZzw4 = zzby.zzw(8);
            i = iZzw4 + iZzw4;
            iZzw = zzby.zzw(iZza3) + zzby.zzw(16);
            int iZzw5 = zzby.zzw(24);
            int iZzf = ((zzec) value).zzf();
            iH = B8.h(iZzf, iZzf, iZzw5);
        }
        return i + iZzw + iH;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzp(com.google.android.gms.internal.play_billing.zzch r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.play_billing.zzfv r0 = r4.zzd()
            byte[] r1 = com.google.android.gms.internal.play_billing.zzda.zzd
            r5.getClass()
            com.google.android.gms.internal.play_billing.zzfv r1 = com.google.android.gms.internal.play_billing.zzfv.zza
            com.google.android.gms.internal.play_billing.zzfw r1 = com.google.android.gms.internal.play_billing.zzfw.INT
            com.google.android.gms.internal.play_billing.zzfw r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzec
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzdh
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzcu
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzbq
            if (r0 != 0) goto L33
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.play_billing.zzfv r4 = r4.zzd()
            com.google.android.gms.internal.play_billing.zzfw r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzci.zzp(com.google.android.gms.internal.play_billing.zzch, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzci zzciVar = new zzci();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzciVar.zzi((zzch) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzciVar.zzi((zzch) entry.getKey(), entry.getValue());
        }
        zzciVar.zzd = this.zzd;
        return zzciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzci) {
            return this.zza.equals(((zzci) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzo = 0;
        for (int i = 0; i < this.zza.zzb(); i++) {
            iZzo += zzo(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    public final Object zze(zzch zzchVar) {
        Object obj = this.zza.get(zzchVar);
        if (obj instanceof zzdh) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzdg(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzcs) {
                ((zzcs) entryZzg.getValue()).zzr();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzci zzciVar) {
        for (int i = 0; i < zzciVar.zza.zzb(); i++) {
            zzl(zzciVar.zza.zzg(i));
        }
        Iterator it = zzciVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzl((Map.Entry) it.next());
        }
    }

    public final void zzi(zzch zzchVar, Object obj) {
        if (!zzchVar.zzg()) {
            zzp(zzchVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzp(zzchVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzdh) {
            this.zzd = true;
        }
        this.zza.put(zzchVar, obj);
    }

    public final boolean zzj() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzm(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzm((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzci(boolean z10) {
        zzg();
        zzg();
    }
}
