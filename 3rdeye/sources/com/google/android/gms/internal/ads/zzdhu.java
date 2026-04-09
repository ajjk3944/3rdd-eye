package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdhu extends zzbgj {
    private final zzdim zza;
    private IObjectWrapper zzb;

    public zzdhu(zzdim zzdimVar) {
        this.zza = zzdimVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zze() throws RemoteException {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzb() != 0.0f) {
            return zzdimVar.zzb();
        }
        if (zzdimVar.zzj() != null) {
            try {
                return zzdimVar.zzj().zze();
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Remote exception getting video controller aspect ratio.", e4);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbgn zzbgnVarZzm = zzdimVar.zzm();
        if (zzbgnVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbgnVarZzm.zzd() == -1 || zzbgnVarZzm.zzc() == -1) ? 0.0f : zzbgnVarZzm.zzd() / zzbgnVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbgnVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzf() throws RemoteException {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzj() != null) {
            return zzdimVar.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzg() throws RemoteException {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzj() != null) {
            return zzdimVar.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbgn zzbgnVarZzm = this.zza.zzm();
        if (zzbgnVarZzm == null) {
            return null;
        }
        return zzbgnVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzk() throws RemoteException {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzl() throws RemoteException {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzm(zzbhv zzbhvVar) {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzj() instanceof zzcgg) {
            ((zzcgg) zzdimVar.zzj()).zzv(zzbhvVar);
        }
    }
}
