package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzacz {
    private final Context zzb;

    @Nullable
    private zzacv zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzabv zza = new zzabv();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzacz(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzabv zzabvVar = this.zza;
        float fZzg = zzabvVar.zzc() ? zzabvVar.zzg() : this.zzf;
        float f10 = this.zzg;
        if (fZzg != f10) {
            if (fZzg != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (zzabvVar.zzc() && zzabvVar.zze() >= 5000000000L) {
                    f11 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f11) {
                    return;
                }
            } else if (fZzg == -1.0f && zzabvVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzd) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z10 || this.zzh != f10) {
            this.zzh = f10;
            zzacu.zza(this.zze, f10);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzacu.zza(this.zze, 0.0f);
    }

    public final void zza(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzacv zzacyVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzacyVar = Build.VERSION.SDK_INT >= 33 ? new zzacy(choreographer, displayManager, null) : new zzacw(choreographer, displayManager, null);
            } catch (RuntimeException e10) {
                zzee.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        this.zzc = zzacyVar;
        if (zzacyVar != null) {
            zzacyVar.zza();
        }
        zzl(false);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl(false);
    }

    public final void zzf(float f10) {
        this.zzf = f10;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzq = j11;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j10 * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            zzacvVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzi(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacz.zzi(long, long):long");
    }
}
