package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeev extends zzbpt implements zzcxb {
    private zzbpu zza;
    private zzcxa zzb;

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zza(zzcxa zzcxaVar) {
        this.zzb = zzcxaVar;
    }

    public final synchronized void zzc(zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zze() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzf() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzg(int i) throws RemoteException {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzi(int i, String str) throws RemoteException {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzj(int i) throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzl(String str) throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzm() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzn() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzo() throws RemoteException {
        try {
            zzbpu zzbpuVar = this.zza;
            if (zzbpuVar != null) {
                zzbpuVar.zzo();
            }
            zzcxa zzcxaVar = this.zzb;
            if (zzcxaVar != null) {
                zzcxaVar.zzd();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzp() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzr(zzbhh zzbhhVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzs(zzbwm zzbwmVar) throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzs(zzbwmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzt(zzbwq zzbwqVar) throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzt(zzbwqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzu() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzv() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzw() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzx() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzy() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final synchronized void zzz() throws RemoteException {
        zzbpu zzbpuVar = this.zza;
        if (zzbpuVar != null) {
            zzbpuVar.zzz();
        }
    }
}
