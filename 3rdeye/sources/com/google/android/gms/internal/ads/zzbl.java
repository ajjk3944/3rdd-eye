package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbl {
    public static final zzbl zza = new zzbi();

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        zzbl zzblVar = (zzbl) obj;
        if (zzblVar.zzc() == zzc() && zzblVar.zzb() == zzb()) {
            zzbk zzbkVar = new zzbk();
            zzbj zzbjVar = new zzbj();
            zzbk zzbkVar2 = new zzbk();
            zzbj zzbjVar2 = new zzbj();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzbkVar, 0L).equals(zzblVar.zze(i, zzbkVar2, 0L))) {
                    return false;
                }
            }
            for (int i10 = 0; i10 < zzb(); i10++) {
                if (!zzd(i10, zzbjVar, true).equals(zzblVar.zzd(i10, zzbjVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzblVar.zzg(true) && (iZzh = zzh(true)) == zzblVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzblVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        int iZzc = zzc() + 217;
        int i10 = 0;
        while (true) {
            i = iZzc * 31;
            if (i10 >= zzc()) {
                break;
            }
            iZzc = i + zze(i10, zzbkVar, 0L).hashCode();
            i10++;
        }
        int iZzb = zzb() + i;
        for (int i11 = 0; i11 < zzb(); i11++) {
            iZzb = (iZzb * 31) + zzd(i11, zzbjVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbj zzd(int i, zzbj zzbjVar, boolean z10);

    public abstract zzbk zze(int i, zzbk zzbkVar, long j4);

    public abstract Object zzf(int i);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzbj zzbjVar, zzbk zzbkVar, int i10, boolean z10) {
        int i11 = zzd(i, zzbjVar, false).zzc;
        if (zze(i11, zzbkVar, 0L).zzo != i) {
            return i + 1;
        }
        int iZzj = zzj(i11, i10, z10);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzbkVar, 0L).zzn;
    }

    public int zzj(int i, int i10, boolean z10) {
        if (i10 == 0) {
            if (i == zzh(z10)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == zzh(z10) ? zzg(z10) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i10, boolean z10) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzbk zzbkVar, zzbj zzbjVar, int i, long j4) {
        Pair pairZzm = zzm(zzbkVar, zzbjVar, i, j4, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzbk zzbkVar, zzbj zzbjVar, int i, long j4, long j10) {
        zzdd.zza(i, 0, zzc());
        zze(i, zzbkVar, j10);
        if (j4 == -9223372036854775807L) {
            long j11 = zzbkVar.zzl;
            j4 = 0;
        }
        int i10 = zzbkVar.zzn;
        zzd(i10, zzbjVar, false);
        while (i10 < zzbkVar.zzo) {
            long j12 = zzbjVar.zze;
            if (j4 == 0) {
                break;
            }
            int i11 = i10 + 1;
            long j13 = zzd(i11, zzbjVar, false).zze;
            if (j4 < 0) {
                break;
            }
            i10 = i11;
        }
        zzd(i10, zzbjVar, true);
        long j14 = zzbjVar.zze;
        long j15 = zzbjVar.zzd;
        if (j15 != -9223372036854775807L) {
            j4 = Math.min(j4, j15 - 1);
        }
        long jMax = Math.max(0L, j4);
        Object obj = zzbjVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbj zzn(Object obj, zzbj zzbjVar) {
        return zzd(zza(obj), zzbjVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
