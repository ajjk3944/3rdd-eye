package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpx {
    final /* synthetic */ zzfpz zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfpx(zzfpz zzfpzVar, byte[] bArr, zzfpy zzfpyVar) {
        this.zza = zzfpzVar;
        this.zzb = bArr;
    }

    public final zzfpx zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfpx zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfpz zzfpzVar = this.zza;
            if (zzfpzVar.zzb) {
                zzfqc zzfqcVar = zzfpzVar.zza;
                zzfqcVar.zzj(this.zzb);
                zzfqcVar.zzi(this.zzc);
                zzfqcVar.zzg(this.zzd);
                zzfqcVar.zzh(null);
                zzfqcVar.zzf();
            }
        } catch (RemoteException e4) {
            Log.d("GASS", "Clearcut log failed", e4);
        }
    }
}
