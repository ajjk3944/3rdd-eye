package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcbk implements Runnable {
    final /* synthetic */ zzcbn zza;

    public zzcbk(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
