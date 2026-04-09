package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcdc implements Runnable {
    final /* synthetic */ zzcdd zza;

    public zzcdc(zzcdd zzcddVar) {
        this.zza = zzcddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzA().zzc(this.zza);
    }
}
