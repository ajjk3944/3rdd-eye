package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbce {
    final /* synthetic */ zzbcg zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbce(zzbcg zzbcgVar, byte[] bArr, zzbcf zzbcfVar) {
        this.zza = zzbcgVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbcg zzbcgVar = this.zza;
            if (zzbcgVar.zzb) {
                zzbcgVar.zza.zzj(this.zzb);
                zzbcgVar.zza.zzi(0);
                zzbcgVar.zza.zzg(this.zzc);
                zzbcgVar.zza.zzh(null);
                zzbcgVar.zza.zzf();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Clearcut log failed", e4);
        }
    }

    public final zzbce zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
