package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfkq implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza;
    final /* synthetic */ zzfkv zzb;

    public zzfkq(zzfkv zzfkvVar, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = zzeaVar;
        this.zzb = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzH(this.zza);
    }
}
