package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfhp implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdpp zzj;
    private final List zzk;
    private final zzbvw zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfhu zzg = zzfhy.zzb();
    private String zzh = "";
    private boolean zzl = false;

    public zzfhp(Context context, VersionInfoParcel versionInfoParcel, zzdpp zzdppVar, zzdzy zzdzyVar, zzbvw zzbvwVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdppVar;
        this.zzm = zzbvwVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjc)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = zzfyf.zzn();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbev.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbev.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static /* synthetic */ void zzb(zzfhp zzfhpVar, zzfhf zzfhfVar) {
        synchronized (zzd) {
            try {
                if (!zzfhpVar.zzl) {
                    zzfhpVar.zzl = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzv.zzr();
                            zzfhpVar.zzh = com.google.android.gms.ads.internal.util.zzs.zzq(zzfhpVar.zze);
                        } catch (RemoteException | RuntimeException e4) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        zzfhpVar.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(zzfhpVar.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziX)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzme)).booleanValue()) {
                            long j4 = iIntValue;
                            zzcad.zzd.scheduleWithFixedDelay(zzfhpVar, j4, j4, TimeUnit.MILLISECONDS);
                        } else {
                            long j10 = iIntValue;
                            zzcad.zzd.scheduleAtFixedRate(zzfhpVar, j10, j10, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfhfVar != null) {
            synchronized (zzc) {
                try {
                    zzfhu zzfhuVar = zzfhpVar.zzg;
                    if (zzfhuVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziY)).intValue()) {
                        return;
                    }
                    zzfhq zzfhqVarZza = zzfht.zza();
                    zzfhqVarZza.zzu(zzfhfVar.zzm());
                    zzfhqVarZza.zzq(zzfhfVar.zzl());
                    zzfhqVarZza.zzg(zzfhfVar.zzb());
                    zzfhqVarZza.zzw(3);
                    zzfhqVarZza.zzn(zzfhpVar.zzf.afmaVersion);
                    zzfhqVarZza.zzb(zzfhpVar.zzh);
                    zzfhqVarZza.zzk(Build.VERSION.RELEASE);
                    zzfhqVarZza.zzr(Build.VERSION.SDK_INT);
                    zzfhqVarZza.zzv(zzfhfVar.zzo());
                    zzfhqVarZza.zzj(zzfhfVar.zza());
                    zzfhqVarZza.zze(zzfhpVar.zzi);
                    zzfhqVarZza.zzt(zzfhfVar.zzn());
                    zzfhqVarZza.zzc(zzfhfVar.zze());
                    zzfhqVarZza.zzf(zzfhfVar.zzg());
                    zzfhqVarZza.zzh(zzfhfVar.zzh());
                    zzfhqVarZza.zzi(zzfhpVar.zzj.zzb(zzfhfVar.zzh()));
                    zzfhqVarZza.zzl(zzfhfVar.zzi());
                    zzfhqVarZza.zzm(zzfhfVar.zzd());
                    zzfhqVarZza.zzd(zzfhfVar.zzf());
                    zzfhqVarZza.zzs(zzfhfVar.zzk());
                    zzfhqVarZza.zzo(zzfhfVar.zzj());
                    zzfhqVarZza.zzp(zzfhfVar.zzc());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjc)).booleanValue()) {
                        zzfhqVarZza.zza(zzfhpVar.zzk);
                    }
                    zzfhv zzfhvVarZza = zzfhw.zza();
                    zzfhvVarZza.zza(zzfhqVarZza);
                    zzfhuVar.zzb(zzfhvVarZza);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfhu zzfhuVar = this.zzg;
                            bArrZzaV = ((zzfhy) zzfhuVar.zzbr()).zzaV();
                            zzfhuVar.zzc();
                        }
                        new zzdzx(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(new zzdzv((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziW), 60000, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                    } catch (Exception e4) {
                        if ((e4 instanceof zzdwe) && ((zzdwe) e4).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(e4, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzc(final zzfhf zzfhfVar) {
        zzcad.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfho
            @Override // java.lang.Runnable
            public final void run() {
                zzfhp.zzb(this.zza, zzfhfVar);
            }
        });
    }
}
