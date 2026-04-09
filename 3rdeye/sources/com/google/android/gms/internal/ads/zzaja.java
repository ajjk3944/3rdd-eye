package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaja {
    public final zzaez zza;
    public zzajq zzd;
    public zzaiw zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final String zzj;
    private boolean zzm;
    public final zzajp zzb = new zzajp();
    public final zzen zzc = new zzen();
    private final zzen zzk = new zzen(1);
    private final zzen zzl = new zzen();

    public zzaja(zzaez zzaezVar, zzajq zzajqVar, zzaiw zzaiwVar, String str) {
        this.zza = zzaezVar;
        this.zzd = zzajqVar;
        this.zze = zzaiwVar;
        this.zzj = str;
        zzh(zzajqVar, zzaiwVar);
    }

    public final int zza() {
        int i = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i10) {
        zzen zzenVar;
        zzajo zzajoVarZzf = zzf();
        if (zzajoVarZzf == null) {
            return 0;
        }
        int i11 = zzajoVarZzf.zzd;
        if (i11 != 0) {
            zzenVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzajoVarZzf.zze;
            String str = zzex.zza;
            zzen zzenVar2 = this.zzl;
            int length = bArr.length;
            zzenVar2.zzJ(bArr, length);
            zzenVar = zzenVar2;
            i11 = length;
        }
        zzajp zzajpVar = this.zzb;
        boolean zZzb = zzajpVar.zzb(this.zzf);
        boolean z10 = zZzb || i10 != 0;
        zzen zzenVar3 = this.zzk;
        zzenVar3.zzN()[0] = (byte) ((true != z10 ? 0 : 128) | i11);
        zzenVar3.zzL(0);
        zzaez zzaezVar = this.zza;
        zzaezVar.zzs(zzenVar3, 1, 1);
        zzaezVar.zzs(zzenVar, i11, 1);
        if (!z10) {
            return i11 + 1;
        }
        if (!zZzb) {
            zzen zzenVar4 = this.zzc;
            zzenVar4.zzI(8);
            byte[] bArrZzN = zzenVar4.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 1;
            bArrZzN[2] = 0;
            bArrZzN[3] = (byte) i10;
            bArrZzN[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArrZzN[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArrZzN[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArrZzN[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            zzaezVar.zzs(zzenVar4, 8, 1);
            return i11 + 9;
        }
        int i12 = i11 + 1;
        zzen zzenVar5 = zzajpVar.zzn;
        int iZzq = zzenVar5.zzq();
        zzenVar5.zzM(-2);
        int i13 = (iZzq * 6) + 2;
        if (i10 != 0) {
            zzen zzenVar6 = this.zzc;
            zzenVar6.zzI(i13);
            byte[] bArrZzN2 = zzenVar6.zzN();
            zzenVar5.zzH(bArrZzN2, 0, i13);
            int i14 = (((bArrZzN2[2] & 255) << 8) | (bArrZzN2[3] & 255)) + i10;
            bArrZzN2[2] = (byte) ((i14 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArrZzN2[3] = (byte) (i14 & KotlinVersion.MAX_COMPONENT_VALUE);
            zzenVar5 = zzenVar6;
        }
        zzaezVar.zzs(zzenVar5, i13, 1);
        return i12 + i13;
    }

    public final long zzd() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzajp zzajpVar = this.zzb;
        return zzajpVar.zzi[this.zzf];
    }

    public final zzajo zzf() {
        if (!this.zzm) {
            return null;
        }
        zzajp zzajpVar = this.zzb;
        zzaiw zzaiwVar = zzajpVar.zza;
        String str = zzex.zza;
        int i = zzaiwVar.zza;
        zzajo zzajoVarZzb = zzajpVar.zzm;
        if (zzajoVarZzb == null) {
            zzajoVarZzb = this.zzd.zza.zzb(i);
        }
        if (zzajoVarZzb == null || !zzajoVarZzb.zza) {
            return null;
        }
        return zzajoVarZzb;
    }

    public final void zzh(zzajq zzajqVar, zzaiw zzaiwVar) {
        this.zzd = zzajqVar;
        this.zze = zzaiwVar;
        zzx zzxVarZzb = zzajqVar.zza.zzg.zzb();
        zzxVarZzb.zzG(this.zzj);
        this.zza.zzm(zzxVarZzb.zzan());
        zzi();
    }

    public final void zzi() {
        zzajp zzajpVar = this.zzb;
        zzajpVar.zzd = 0;
        zzajpVar.zzp = 0L;
        zzajpVar.zzq = false;
        zzajpVar.zzk = false;
        zzajpVar.zzo = false;
        zzajpVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final void zzj(zzs zzsVar) {
        zzajn zzajnVar = this.zzd.zza;
        zzaiw zzaiwVar = this.zzb.zza;
        String str = zzex.zza;
        zzajo zzajoVarZzb = zzajnVar.zzb(zzaiwVar.zza);
        zzs zzsVarZzb = zzsVar.zzb(zzajoVarZzb != null ? zzajoVarZzb.zzb : null);
        zzz zzzVar = this.zzd.zza.zzg;
        String str2 = this.zzj;
        zzx zzxVarZzb = zzzVar.zzb();
        zzxVarZzb.zzG(str2);
        zzxVarZzb.zzL(zzsVarZzb);
        this.zza.zzm(zzxVarZzb.zzan());
    }

    public final boolean zzl() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i10 = this.zzh;
        if (i != iArr[i10]) {
            return true;
        }
        this.zzh = i10 + 1;
        this.zzg = 0;
        return false;
    }
}
