package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeik implements zzcxa {
    boolean zza = false;
    final /* synthetic */ zzedh zzb;
    final /* synthetic */ zzcai zzc;

    public zzeik(zzeil zzeilVar, zzedh zzedhVar, zzcai zzcaiVar) {
        this.zzb = zzedhVar;
        this.zzc = zzcaiVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfJ)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzedi(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzeil.zze(this.zzb.zza, i), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzc(int i, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzeil.zze(this.zzb.zza, i);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
