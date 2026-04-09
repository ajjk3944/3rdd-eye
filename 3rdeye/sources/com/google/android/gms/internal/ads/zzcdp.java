package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcdp extends zzcdl {
    public zzcdp(zzcbz zzcbzVar) {
        super(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) {
        String strZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(str);
        zzcbz zzcbzVar = (zzcbz) this.zzc.get();
        if (zzcbzVar != null && strZzk != null) {
            zzcbzVar.zzt(strZzk, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZzk, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
    }
}
