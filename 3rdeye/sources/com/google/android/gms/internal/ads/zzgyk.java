package com.google.android.gms.internal.ads;

import N7.H7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgyk {
    private static final zzgyk zzb = new zzgyk(true);
    final zzhbh zza = new zzhbc();
    private boolean zzc;
    private boolean zzd;

    private zzgyk() {
    }

    public static int zza(zzhby zzhbyVar, int i, Object obj) {
        int iZzD = zzgya.zzD(i << 3);
        if (zzhbyVar == zzhby.zzj) {
            byte[] bArr = zzgzi.zzb;
            if (((zzhag) obj) instanceof zzgwx) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhbyVar, obj);
    }

    public static int zzb(zzhby zzhbyVar, Object obj) {
        int iZzd;
        int iZzD;
        zzhby zzhbyVar2 = zzhby.zza;
        zzhbz zzhbzVar = zzhbz.INT;
        switch (zzhbyVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i = zzgya.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i10 = zzgya.zzf;
                return 4;
            case 2:
                return zzgya.zzE(((Long) obj).longValue());
            case 3:
                return zzgya.zzE(((Long) obj).longValue());
            case 4:
                return zzgya.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i11 = zzgya.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i12 = zzgya.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i13 = zzgya.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzgxn)) {
                    return zzgya.zzC((String) obj);
                }
                int i14 = zzgya.zzf;
                iZzd = ((zzgxn) obj).zzd();
                iZzD = zzgya.zzD(iZzd);
                break;
            case 9:
                int i15 = zzgya.zzf;
                return ((zzhag) obj).zzaY();
            case 10:
                if (!(obj instanceof zzgzq)) {
                    return zzgya.zzz((zzhag) obj);
                }
                int i16 = zzgya.zzf;
                iZzd = ((zzgzq) obj).zza();
                iZzD = zzgya.zzD(iZzd);
                break;
            case 11:
                if (!(obj instanceof zzgxn)) {
                    int i17 = zzgya.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzgya.zzD(iZzd);
                    break;
                } else {
                    int i18 = zzgya.zzf;
                    iZzd = ((zzgxn) obj).zzd();
                    iZzD = zzgya.zzD(iZzd);
                    break;
                }
            case 12:
                return zzgya.zzD(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgyz ? zzgya.zzE(((zzgyz) obj).zza()) : zzgya.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i19 = zzgya.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i20 = zzgya.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzgya.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzgya.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(zzgyj zzgyjVar, Object obj) {
        zzhby zzhbyVarZzb = zzgyjVar.zzb();
        int iZza = zzgyjVar.zza();
        if (!zzgyjVar.zze()) {
            return zza(zzhbyVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzgyjVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzhbyVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i < size) {
            iZzb += zzb(zzhbyVarZzb, list.get(i));
            i++;
        }
        return zzgya.zzD(iZzb) + zzgya.zzD(iZza << 3) + iZzb;
    }

    public static zzgyk zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgyj zzgyjVar = (zzgyj) entry.getKey();
        if (zzgyjVar.zzc() != zzhbz.MESSAGE) {
            return true;
        }
        if (!zzgyjVar.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzk(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzhah) {
            return ((zzhah) obj).zzbw();
        }
        if (obj instanceof zzgzq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int iZzD;
        int iZzz;
        zzgyj zzgyjVar = (zzgyj) entry.getKey();
        Object value = entry.getValue();
        if (zzgyjVar.zzc() != zzhbz.MESSAGE || zzgyjVar.zze() || zzgyjVar.zzd()) {
            return zzc(zzgyjVar, value);
        }
        if (value instanceof zzgzq) {
            int iZza = ((zzgyj) entry.getKey()).zza();
            int iZzD2 = zzgya.zzD(8);
            i = iZzD2 + iZzD2;
            iZzD = zzgya.zzD(iZza) + zzgya.zzD(16);
            int iZzD3 = zzgya.zzD(24);
            int iZza2 = ((zzgzq) value).zza();
            iZzz = H7.m(iZza2, iZza2, iZzD3);
        } else {
            int iZza3 = ((zzgyj) entry.getKey()).zza();
            int iZzD4 = zzgya.zzD(8);
            i = iZzD4 + iZzD4;
            iZzD = zzgya.zzD(iZza3) + zzgya.zzD(16);
            iZzz = zzgya.zzz((zzhag) value) + zzgya.zzD(24);
        }
        return i + iZzD + iZzz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzm(com.google.android.gms.internal.ads.zzgyj r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhby r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzgzi.zzb
            r5.getClass()
            com.google.android.gms.internal.ads.zzhby r1 = com.google.android.gms.internal.ads.zzhby.zza
            com.google.android.gms.internal.ads.zzhbz r1 = com.google.android.gms.internal.ads.zzhbz.INT
            com.google.android.gms.internal.ads.zzhbz r0 = r0.zza()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhag
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzq
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgyz
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgxn
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
            com.google.android.gms.internal.ads.zzhby r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzhbz r4 = r4.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyk.zzm(com.google.android.gms.internal.ads.zzgyj, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgyk zzgykVar = new zzgyk();
        zzhbh zzhbhVar = this.zza;
        int iZzc = zzhbhVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = zzhbhVar.zzg(i);
            zzgykVar.zzh((zzgyj) ((zzhbd) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzhbhVar.zzd()) {
            zzgykVar.zzh((zzgyj) entry.getKey(), entry.getValue());
        }
        zzgykVar.zzd = this.zzd;
        return zzgykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgyk) {
            return this.zza.equals(((zzgyk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzhbh zzhbhVar = this.zza;
        int iZzc = zzhbhVar.zzc();
        int iZzl = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzl += zzl(zzhbhVar.zzg(i));
        }
        Iterator it = zzhbhVar.zzd().iterator();
        while (it.hasNext()) {
            iZzl += zzl((Map.Entry) it.next());
        }
        return iZzl;
    }

    public final Iterator zzf() {
        zzhbh zzhbhVar = this.zza;
        return zzhbhVar.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzgzo(zzhbhVar.entrySet().iterator()) : zzhbhVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        zzhbh zzhbhVar = this.zza;
        int iZzc = zzhbhVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzhbhVar.zzg(i).getValue();
            if (value instanceof zzgyv) {
                ((zzgyv) value).zzbU();
            }
        }
        Iterator it = zzhbhVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgyv) {
                ((zzgyv) value2).zzbU();
            }
        }
        zzhbhVar.zza();
        this.zzc = true;
    }

    public final void zzh(zzgyj zzgyjVar, Object obj) {
        if (!zzgyjVar.zze()) {
            zzm(zzgyjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzm(zzgyjVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgzq) {
            this.zzd = true;
        }
        this.zza.put(zzgyjVar, obj);
    }

    public final boolean zzi() {
        zzhbh zzhbhVar = this.zza;
        int iZzc = zzhbhVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzj(zzhbhVar.zzg(i))) {
                return false;
            }
        }
        Iterator it = zzhbhVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgyk(boolean z10) {
        zzg();
        zzg();
    }
}
