package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcax implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbd zzc;

    public zzcax(zzcbd zzcbdVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbd zzcbdVar = this.zzc;
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzb(this.zza, this.zzb);
        }
    }
}
