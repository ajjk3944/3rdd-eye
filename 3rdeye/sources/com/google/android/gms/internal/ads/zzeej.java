package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeej implements zzedk {
    private final Context zza;
    private final zzcps zzb;
    private final Executor zzc;

    public zzeej(Context context, zzcps zzcpsVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpsVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, final zzfbt zzfbtVar, zzedh zzedhVar) throws zzegx, zzfcv {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            zzbpx zzbpxVarZzc = ((zzfdm) zzedhVar.zzb).zzc();
            if (zzbpxVarZzc == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbpxVarZzc.zze());
                boolean zZzf = zzbpxVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfcv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeeh
                            @Override // com.google.android.gms.internal.ads.zzgci
                            public final A4.a zza(Object obj) {
                                return zzgdb.zzh(zzcqh.zza(this.zza.zza, viewZza, zzfbtVar));
                            }
                        }, zzcad.zzf).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        throw new zzfcv(e4);
                    }
                }
            } catch (RemoteException e10) {
                throw new zzfcv(e10);
            }
        } else {
            viewZza = ((zzfdm) zzedhVar.zzb).zza();
        }
        zzcps zzcpsVar = this.zzb;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza);
        final zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        Objects.requireNonNull(zzfdmVar);
        zzcoo zzcooVarZza = zzcpsVar.zza(zzcrlVar, new zzcou(viewZza, null, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzcqt
            public final com.google.android.gms.ads.internal.client.zzed zza() {
                return zzfdmVar.zzb();
            }
        }, (zzfbu) zzfbtVar.zzu.get(0)));
        zzcooVarZza.zzh().zza(viewZza);
        zzcooVarZza.zzd().zzo(new zzcmb(zzfdmVar), this.zzc);
        ((zzeev) zzedhVar.zzc).zzc(zzcooVarZza.zzk());
        return zzcooVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfcoVar.zze;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzd(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zze(zzrVar2.zze, zzrVar2.zzb)) : zzfcu.zza(this.zza, zzfbtVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            ((zzfdm) zzedhVar.zzb).zzn(this.zza, zzrVar3, zzfcoVar.zzd, zzfbtVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfbtVar.zzs), (zzbpu) zzedhVar.zzc);
        } else {
            ((zzfdm) zzedhVar.zzb).zzm(this.zza, zzrVar3, zzfcoVar.zzd, zzfbtVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfbtVar.zzs), (zzbpu) zzedhVar.zzc);
        }
    }
}
