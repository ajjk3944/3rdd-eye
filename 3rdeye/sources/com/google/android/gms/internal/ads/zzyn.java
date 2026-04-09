package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzyn extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzyn(int i, zzbm zzbmVar, int i10, zzyi zzyiVar, int i11, String str, String str2) {
        int iZzc;
        super(i, zzbmVar, i10);
        int i12 = 0;
        this.zzf = zzmb.zza(i11, false);
        int i13 = this.zzd.zze;
        int i14 = zzyiVar.zzy;
        this.zzg = 1 == (i13 & 1);
        this.zzh = (i13 & 2) != 0;
        zzfyf zzfyfVarZzo = str2 != null ? zzfyf.zzo(str2) : zzyiVar.zzv.isEmpty() ? zzfyf.zzo("") : zzyiVar.zzv;
        int i15 = 0;
        while (true) {
            if (i15 >= zzfyfVarZzo.size()) {
                i15 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            } else {
                iZzc = zzyu.zzc(this.zzd, (String) zzfyfVarZzo.get(i15), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzi = i15;
        this.zzj = iZzc;
        int iZzb = zzyu.zzb(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzb;
        this.zzm = (1088 & this.zzd.zzf) != 0;
        int iZzc2 = zzyu.zzc(this.zzd, str, zzyu.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z10 = iZzc > 0 || (zzyiVar.zzv.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzmb.zza(i11, zzyiVar.zzR) && z10) {
            i12 = 1;
        }
        this.zze = i12;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyn zzynVar) {
        zzfxu zzfxuVarZzc = zzfxu.zzj().zzd(this.zzf, zzynVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzynVar.zzi), zzfzq.zzc().zza());
        int i = this.zzj;
        zzfxu zzfxuVarZzb = zzfxuVarZzc.zzb(i, zzynVar.zzj);
        int i10 = this.zzk;
        zzfxu zzfxuVarZzb2 = zzfxuVarZzb.zzb(i10, zzynVar.zzk).zzd(this.zzg, zzynVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzynVar.zzh), i == 0 ? zzfzq.zzc() : zzfzq.zzc().zza()).zzb(this.zzl, zzynVar.zzl);
        if (i10 == 0) {
            zzfxuVarZzb2 = zzfxuVarZzb2.zze(this.zzm, zzynVar.zzm);
        }
        return zzfxuVarZzb2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        return false;
    }
}
