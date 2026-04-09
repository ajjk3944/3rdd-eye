package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcba implements Runnable {
    final /* synthetic */ zzcbd zza;

    public zzcba(zzcbd zzcbdVar) {
        this.zza = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbd zzcbdVar = this.zza;
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzd();
            zzcbdVar.zzr.zzi();
        }
    }
}
