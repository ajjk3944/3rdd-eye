package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzur implements zzxb {
    private final zzfyf zza;
    private long zzb;

    public zzur(List list, List list2) {
        int i = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        zzdd.zzd(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfycVar.zzf(new zzuq((zzxb) list.get(i10), (List) list2.get(i10)));
        }
        this.zza = zzfycVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                break;
            }
            zzuq zzuqVar = (zzuq) zzfyfVar.get(i);
            long jZzb = zzuqVar.zzb();
            if ((zzuqVar.zza().contains(1) || zzuqVar.zza().contains(2) || zzuqVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j4 = this.zzb;
        return j4 != -9223372036854775807L ? j4 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                break;
            }
            long jZzc = ((zzuq) zzfyfVar.get(i)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
        int i = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                return;
            }
            ((zzuq) zzfyfVar.get(i)).zzm(j4);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        boolean zZzo;
        boolean z10 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zZzo = false;
            while (true) {
                zzfyf zzfyfVar = this.zza;
                if (i >= zzfyfVar.size()) {
                    break;
                }
                long jZzc2 = ((zzuq) zzfyfVar.get(i)).zzc();
                boolean z11 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzlaVar.zza;
                if (jZzc2 == jZzc || z11) {
                    zZzo |= ((zzuq) zzfyfVar.get(i)).zzo(zzlaVar);
                }
                i++;
            }
            z10 |= zZzo;
        } while (zZzo);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        int i = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                return false;
            }
            if (((zzuq) zzfyfVar.get(i)).zzp()) {
                return true;
            }
            i++;
        }
    }
}
