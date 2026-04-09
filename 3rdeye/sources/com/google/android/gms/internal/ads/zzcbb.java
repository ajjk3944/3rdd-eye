package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcbb implements Runnable {
    final /* synthetic */ zzcbd zza;

    public zzcbb(zzcbd zzcbdVar) {
        this.zza = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbd zzcbdVar = this.zza;
        if (zzcbdVar.zzr != null) {
            if (!zzcbdVar.zzs) {
                zzcbdVar.zzr.zzg();
                zzcbdVar.zzs = true;
            }
            zzcbdVar.zzr.zze();
        }
    }
}
