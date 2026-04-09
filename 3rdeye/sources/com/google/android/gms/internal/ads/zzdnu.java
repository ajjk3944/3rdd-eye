package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdnu extends zzdne implements zzddw {
    private zzddw zza;

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzdf() {
        zzddw zzddwVar = this.zza;
        if (zzddwVar != null) {
            zzddwVar.zzdf();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbit zzbitVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzddw zzddwVar) throws Throwable {
        try {
            try {
                zzh(zzaVar, zzbitVar, zzrVar, zzbivVar, zzadVar);
                this.zza = zzddwVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzu() {
        zzddw zzddwVar = this.zza;
        if (zzddwVar != null) {
            zzddwVar.zzu();
        }
    }
}
