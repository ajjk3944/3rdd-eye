package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfks implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ zzfkv zzb;

    public zzfks(zzfkv zzfkvVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        this.zzb = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ(this.zza);
    }
}
