package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtn extends zzdsy implements zzdjm {
    private zzdjm zza;

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final synchronized void zzdQ() {
        zzdjm zzdjmVar = this.zza;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final synchronized void zzdu() {
        zzdjm zzdjmVar = this.zza;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbmx zzbmxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbmz zzbmzVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdjm zzdjmVar) throws Throwable {
        try {
            try {
                super.zzm(zzaVar, zzbmxVar, zzrVar, zzbmzVar, zzadVar);
                this.zza = zzdjmVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
