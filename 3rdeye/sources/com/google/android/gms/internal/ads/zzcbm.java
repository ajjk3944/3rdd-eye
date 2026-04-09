package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcbm implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbn zzb;

    public zzcbm(zzcbn zzcbnVar, boolean z10) {
        this.zza = z10;
        this.zzb = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
