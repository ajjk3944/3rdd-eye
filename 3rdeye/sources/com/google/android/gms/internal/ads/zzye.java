package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzye extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyi zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzye(int r14, com.google.android.gms.internal.ads.zzbm r15, int r16, com.google.android.gms.internal.ads.zzyi r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzfvf r20, int r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzye.<init>(int, com.google.android.gms.internal.ads.zzbm, int, com.google.android.gms.internal.ads.zzyi, int, boolean, com.google.android.gms.internal.ads.zzfvf, int):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzye zzyeVar) {
        boolean z10 = this.zzf;
        zzfzq zzfzqVarZza = (z10 && this.zzi) ? zzyu.zzc : zzyu.zzc.zza();
        zzfxu zzfxuVarZzc = zzfxu.zzj().zzd(this.zzi, zzyeVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzyeVar.zzk), zzfzq.zzc().zza()).zzb(this.zzj, zzyeVar.zzj).zzb(this.zzl, zzyeVar.zzl).zzd(this.zzp, zzyeVar.zzp).zzd(this.zzm, zzyeVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzyeVar.zzn), zzfzq.zzc().zza()).zzb(this.zzo, zzyeVar.zzo).zzd(z10, zzyeVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzyeVar.zzt), zzfzq.zzc().zza());
        boolean z11 = this.zzh.zzB;
        zzfxu zzfxuVarZzc2 = zzfxuVarZzc.zzd(this.zzu, zzyeVar.zzu).zzd(this.zzv, zzyeVar.zzv).zzd(this.zzw, zzyeVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzyeVar.zzq), zzfzqVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzyeVar.zzr), zzfzqVarZza);
        if (Objects.equals(this.zzg, zzyeVar.zzg)) {
            zzfxuVarZzc2 = zzfxuVarZzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzyeVar.zzs), zzfzqVarZza);
        }
        return zzfxuVarZzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        String str;
        int i;
        zzye zzyeVar = (zzye) zzypVar;
        boolean z10 = this.zzh.zzN;
        zzz zzzVar = this.zzd;
        int i10 = zzzVar.zzG;
        if (i10 == -1) {
            return false;
        }
        zzz zzzVar2 = zzyeVar.zzd;
        return i10 == zzzVar2.zzG && (str = zzzVar.zzo) != null && TextUtils.equals(str, zzzVar2.zzo) && (i = zzzVar.zzH) != -1 && i == zzzVar2.zzH && this.zzu == zzyeVar.zzu && this.zzv == zzyeVar.zzv;
    }
}
