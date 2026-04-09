package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbbu implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbbm zza;
    final /* synthetic */ zzcai zzb;
    final /* synthetic */ zzbbw zzc;

    public zzbbu(zzbbw zzbbwVar, zzbbm zzbbmVar, zzcai zzcaiVar) {
        this.zza = zzbbmVar;
        this.zzb = zzcaiVar;
        this.zzc = zzbbwVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbbw zzbbwVar = this.zzc;
        synchronized (zzbbwVar.zzd) {
            try {
                if (zzbbwVar.zzb) {
                    return;
                }
                zzbbwVar.zzb = true;
                final zzbbl zzbblVar = zzbbwVar.zza;
                if (zzbblVar == null) {
                    return;
                }
                zzgdm zzgdmVar = zzcad.zza;
                final zzbbm zzbbmVar = this.zza;
                final zzcai zzcaiVar = this.zzb;
                final A4.a aVarZza = zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbr
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        zzbbu zzbbuVar = this.zza;
                        zzbbl zzbblVar2 = zzbblVar;
                        zzcai zzcaiVar2 = zzcaiVar;
                        try {
                            zzbbo zzbboVarZzq = zzbblVar2.zzq();
                            boolean zZzp = zzbblVar2.zzp();
                            zzbbm zzbbmVar2 = zzbbmVar;
                            zzbbj zzbbjVarZzg = zZzp ? zzbboVarZzq.zzg(zzbbmVar2) : zzbboVarZzq.zzf(zzbbmVar2);
                            if (!zzbbjVarZzg.zze()) {
                                zzcaiVar2.zzd(new RuntimeException("No entry contents."));
                                zzbbw.zze(zzbbuVar.zzc);
                                return;
                            }
                            zzbbt zzbbtVar = new zzbbt(zzbbuVar, zzbbjVarZzg.zzc(), 1);
                            int i = zzbbtVar.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbbtVar.unread(i);
                            zzcaiVar2.zzc(zzbby.zzb(zzbbtVar, zzbbjVarZzg.zzd(), zzbbjVarZzg.zzg(), zzbbjVarZzg.zza(), zzbbjVarZzg.zzf()));
                        } catch (RemoteException e4) {
                            e = e4;
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                            zzcaiVar2.zzd(e);
                            zzbbw.zze(zzbbuVar.zzc);
                        } catch (IOException e10) {
                            e = e10;
                            int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                            zzcaiVar2.zzd(e);
                            zzbbw.zze(zzbbuVar.zzc);
                        }
                    }
                });
                zzcaiVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzcaiVar.isCancelled()) {
                            aVarZza.cancel(true);
                        }
                    }
                }, zzcad.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
