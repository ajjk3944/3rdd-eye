package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfdk {
    private static zzfdk zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfdk(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static com.google.android.gms.ads.internal.client.zzcy zza(Context context) {
        try {
            try {
                return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
            } catch (ClassNotFoundException e4) {
                e = e4;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (IllegalAccessException e10) {
                e = e10;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (InstantiationException e11) {
                e = e11;
                int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                int i1022 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (InvocationTargetException e13) {
                e = e13;
                int i10222 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e14) {
            e = e14;
        }
    }

    public static zzfdk zzd(Context context) {
        synchronized (zzfdk.class) {
            try {
                zzfdk zzfdkVar = zza;
                if (zzfdkVar != null) {
                    return zzfdkVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbfd.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcy zzcyVarZza = null;
                if (jLongValue > 0 && jLongValue <= 252130000) {
                    zzcyVarZza = zza(applicationContext);
                }
                zzfdk zzfdkVar2 = new zzfdk(applicationContext, zzcyVarZza);
                zza = zzfdkVar2;
                return zzfdkVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfd zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpo zzb() {
        return (zzbpo) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i, boolean z10, int i10) {
        com.google.android.gms.ads.internal.client.zzfd zzfdVarZzg;
        com.google.android.gms.ads.internal.zzv.zzr();
        boolean zZzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i10, true, zZzF);
        return (((Boolean) zzbfd.zzc.zze()).booleanValue() && (zzfdVarZzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzfdVarZzg.zza(), true, zZzF) : versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfd zzfdVarZzg = zzg();
        if (zzfdVarZzg != null) {
            return zzfdVarZzg.zzb();
        }
        return null;
    }

    public final void zzf(zzbpo zzbpoVar) {
        zzbpo adapterCreator;
        if (!((Boolean) zzbfd.zza.zze()).booleanValue()) {
            zzfdj.zza(this.zzd, null, zzbpoVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbpoVar = adapterCreator;
        }
        zzfdj.zza(atomicReference, null, zzbpoVar);
    }
}
