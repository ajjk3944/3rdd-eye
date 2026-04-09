package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeew extends zzbwk implements zzcxb {
    private zzbwl zza;
    private zzcxa zzb;
    private zzdeh zzc;

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zza(zzcxa zzcxaVar) {
        this.zzb = zzcxaVar;
    }

    public final synchronized void zzc(zzbwl zzbwlVar) {
        this.zza = zzbwlVar;
    }

    public final synchronized void zzd(zzdeh zzdehVar) {
        this.zzc = zzdehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            zzbwlVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zza.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdeh zzdehVar = this.zzc;
        if (zzdehVar != null) {
            zzedh zzedhVar = ((zzehz) zzdehVar).zzc;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(zzedhVar.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdeh zzdehVar = this.zzc;
        if (zzdehVar != null) {
            Executor executor = ((zzehz) zzdehVar).zzd.zzb;
            final zzedh zzedhVar = ((zzehz) zzdehVar).zzc;
            final zzfbt zzfbtVar = ((zzehz) zzdehVar).zzb;
            final zzfcf zzfcfVar = ((zzehz) zzdehVar).zza;
            final zzehz zzehzVar = (zzehz) zzdehVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehy
                @Override // java.lang.Runnable
                public final void run() {
                    zzeic zzeicVar = zzehzVar.zzd;
                    zzeic.zze(zzfcfVar, zzfbtVar, zzedhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwm zzbwmVar) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzd.zza(zzbwmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzd.zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzd.zzc();
        }
    }
}
