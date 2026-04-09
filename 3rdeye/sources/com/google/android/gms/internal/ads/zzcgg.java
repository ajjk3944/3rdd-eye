package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcgg extends com.google.android.gms.ads.internal.client.zzec {
    private final zzcbz zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzeg zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhv zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcgg(zzcbz zzcbzVar, float f10, boolean z10, boolean z11) {
        this.zza = zzcbzVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    public static /* synthetic */ void zzd(zzcgg zzcggVar, int i, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        boolean z13;
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        com.google.android.gms.ads.internal.client.zzeg zzegVar2;
        com.google.android.gms.ads.internal.client.zzeg zzegVar3;
        synchronized (zzcggVar.zzb) {
            try {
                boolean z14 = zzcggVar.zzg;
                if (z14 || i10 != 1) {
                    i11 = i10;
                    z12 = false;
                } else {
                    i10 = 1;
                    i11 = 1;
                    z12 = true;
                }
                boolean z15 = i != i10;
                if (z15 && i11 == 1) {
                    z13 = true;
                    i11 = 1;
                } else {
                    z13 = false;
                }
                boolean z16 = z15 && i11 == 2;
                boolean z17 = z15 && i11 == 3;
                zzcggVar.zzg = z14 || z12;
                if (z12) {
                    try {
                        com.google.android.gms.ads.internal.client.zzeg zzegVar4 = zzcggVar.zzf;
                        if (zzegVar4 != null) {
                            zzegVar4.zzi();
                        }
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
                if (z13 && (zzegVar3 = zzcggVar.zzf) != null) {
                    zzegVar3.zzh();
                }
                if (z16 && (zzegVar2 = zzcggVar.zzf) != null) {
                    zzegVar2.zzg();
                }
                if (z17) {
                    com.google.android.gms.ads.internal.client.zzeg zzegVar5 = zzcggVar.zzf;
                    if (zzegVar5 != null) {
                        zzegVar5.zze();
                    }
                    zzcggVar.zza.zzw();
                }
                if (z10 != z11 && (zzegVar = zzcggVar.zzf) != null) {
                    zzegVar.zzf(z11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzw(final int i, final int i10, final boolean z10, final boolean z11) {
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgf
            @Override // java.lang.Runnable
            public final void run() {
                zzcgg.zzd(this.zza, i, i10, z10, z11);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd("pubVideoCmd", map2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final com.google.android.gms.ads.internal.client.zzeg zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        synchronized (this.zzb) {
            zzegVar = this.zzf;
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzm(com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        synchronized (this.zzb) {
            this.zzf = zzegVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzo() {
        boolean z10;
        Object obj = this.zzb;
        boolean zZzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zZzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            try {
                z10 = false;
                if (this.zzc && this.zzl) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    public final void zzr(float f10, float f11, int i, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i10;
        synchronized (this.zzb) {
            try {
                z11 = true;
                if (f11 == this.zzi && f12 == this.zzk) {
                    z11 = false;
                }
                this.zzi = f11;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmX)).booleanValue()) {
                    this.zzj = f10;
                }
                z12 = this.zzh;
                this.zzh = z10;
                i10 = this.zze;
                this.zze = i;
                float f13 = this.zzk;
                this.zzk = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.zza.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z11) {
            try {
                zzbhv zzbhvVar = this.zzn;
                if (zzbhvVar != null) {
                    zzbhvVar.zze();
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
        zzw(i10, i, z12, z10);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzgc zzgcVar) {
        Object obj = this.zzb;
        boolean z10 = zzgcVar.zzb;
        boolean z11 = zzgcVar.zzc;
        synchronized (obj) {
            this.zzl = z10;
            this.zzm = z11;
        }
        boolean z12 = zzgcVar.zza;
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z12 ? CommonUrlParts.Values.FALSE_INTEGER : "1", "customControlsRequested", true != z10 ? CommonUrlParts.Values.FALSE_INTEGER : "1", "clickToExpandRequested", true != z11 ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z10, z10);
    }

    public final void zzv(zzbhv zzbhvVar) {
        synchronized (this.zzb) {
            this.zzn = zzbhvVar;
        }
    }
}
