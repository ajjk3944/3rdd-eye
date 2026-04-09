package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdwd extends zzfrq {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwc zzf;
    private boolean zzg;

    public zzdwd(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfrq
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjk)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            float f13 = f12 * f12;
            if (((float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10))) >= ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjl)).floatValue()) {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjm)).intValue() <= jCurrentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjn)).intValue() < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzdwc zzdwcVar = this.zzf;
                    if (zzdwcVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjo)).intValue()) {
                            zzdvb zzdvbVar = (zzdvb) zzdwcVar;
                            zzdvbVar.zzh(new zzduy(zzdvbVar), zzdva.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjk)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjm)).intValue();
                        this.zzg = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzdwc zzdwcVar) {
        this.zzf = zzdwcVar;
    }
}
