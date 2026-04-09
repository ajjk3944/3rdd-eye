package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdqr implements zzcyt, zzcxf, zzcvu, zzcwl, com.google.android.gms.ads.internal.client.zza, zzdbf {
    private final zzbca zza;
    private boolean zzb = false;

    public zzdqr(zzbca zzbcaVar, zzezo zzezoVar) {
        this.zza = zzbcaVar;
        zzbcaVar.zzc(2);
        if (zzezoVar != null) {
            zzbcaVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(final zzfcf zzfcfVar) {
        this.zza.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                zzbch.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbch.zzi.zza zzaVarZzbM = zzaVar.zze().zzad().zzbM();
                zzaVarZzbM.zzo(zzfcfVar.zzb.zzb.zzb);
                zzbVarZzbM.zzT(zzaVarZzbM);
                zzaVar.zzG(zzbVarZzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzi(final zzbch.zzb zzbVar) {
        zzbbz zzbbzVar = new zzbbz() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        };
        zzbca zzbcaVar = this.zza;
        zzbcaVar.zzb(zzbbzVar);
        zzbcaVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzj(final zzbch.zzb zzbVar) {
        zzbbz zzbbzVar = new zzbbz() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        };
        zzbca zzbcaVar = this.zza;
        zzbcaVar.zzb(zzbbzVar);
        zzbcaVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzl(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(final zzbch.zzb zzbVar) {
        zzbbz zzbbzVar = new zzbbz() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        };
        zzbca zzbcaVar = this.zza;
        zzbcaVar.zzb(zzbbzVar);
        zzbcaVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final synchronized void zzs() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }
}
