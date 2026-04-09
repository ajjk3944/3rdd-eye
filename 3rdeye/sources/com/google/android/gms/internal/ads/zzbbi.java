package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbbi {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbbe(this);
    private final Object zzc = new Object();
    private zzbbl zzd;
    private Context zze;
    private zzbbo zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbbi zzbbiVar) {
        synchronized (zzbbiVar.zzc) {
            try {
                zzbbl zzbblVar = zzbbiVar.zzd;
                if (zzbblVar == null) {
                    return;
                }
                if (zzbblVar.isConnected() || zzbbiVar.zzd.isConnecting()) {
                    zzbbiVar.zzd.disconnect();
                }
                zzbbiVar.zzd = null;
                zzbbiVar.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbbl zzbblVarZzd = zzd(new zzbbg(this), new zzbbh(this));
                    this.zzd = zzbblVarZzd;
                    zzbblVarZzd.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long zza(zzbbm zzbbmVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbbmVar);
                    } catch (RemoteException e4) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e4);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbbj zzb(zzbbm zzbbmVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbbj();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbbmVar);
                }
                return this.zzf.zzf(zzbbmVar);
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e4);
                return new zzbbj();
            }
        }
    }

    public final synchronized zzbbl zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbbl(this.zze, com.google.android.gms.ads.internal.zzv.zzv().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeu)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzet)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzbbf(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzev)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzl();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcad.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzew)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
