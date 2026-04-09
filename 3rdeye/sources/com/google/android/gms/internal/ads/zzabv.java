package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzabv {
    private final zzaat zza = new zzaat();
    private final zzabt zzb;
    private final zzabu zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzabv(Context context) {
        DisplayManager displayManager;
        zzabt zzabtVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzabt(this, displayManager);
        this.zzb = zzabtVar;
        this.zzc = zzabtVar != null ? zzabu.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzabv zzabvVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzabvVar.zzk = refreshRate;
            zzabvVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzea.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzabvVar.zzk = -9223372036854775807L;
            zzabvVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzabs.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzaat zzaatVar = this.zza;
        float fZza = zzaatVar.zzg() ? zzaatVar.zza() : this.zzf;
        float f10 = this.zzg;
        if (fZza != f10) {
            if (fZza != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (zzaatVar.zzg() && zzaatVar.zzd() >= 5000000000L) {
                    f11 = 0.02f;
                }
                if (Math.abs(fZza - this.zzg) < f11) {
                    return;
                }
            } else if (fZza == -1.0f && zzaatVar.zzb() < 30) {
                return;
            }
            this.zzg = fZza;
            zzn(false);
        }
    }

    private final void zzn(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
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
            zzabs.zza(surface, f10);
        }
    }

    public final long zza(long j4) {
        long j10;
        if (this.zzp != -1) {
            zzaat zzaatVar = this.zza;
            if (zzaatVar.zzg()) {
                long jZzc = zzaatVar.zzc();
                long j11 = this.zzq + ((long) (((this.zzm - this.zzp) * jZzc) / this.zzi));
                if (Math.abs(j4 - j11) > 20000000) {
                    zzl();
                } else {
                    j4 = j11;
                }
            }
        }
        this.zzn = this.zzm;
        this.zzo = j4;
        zzabu zzabuVar = this.zzc;
        if (zzabuVar != null && this.zzk != -9223372036854775807L) {
            long j12 = zzabuVar.zza;
            if (j12 != -9223372036854775807L) {
                long j13 = this.zzk;
                long j14 = (((j4 - j12) / j13) * j13) + j12;
                if (j4 <= j14) {
                    j10 = j14 - j13;
                } else {
                    j10 = j14;
                    j14 = j13 + j14;
                }
                long j15 = this.zzl;
                if (j14 - j4 >= j4 - j10) {
                    j14 = j10;
                }
                return j14 - j15;
            }
        }
        return j4;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j4) {
        long j10 = this.zzn;
        if (j10 != -1) {
            this.zzp = j10;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j4 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        zzabt zzabtVar = this.zzb;
        if (zzabtVar != null) {
            zzabu zzabuVar = this.zzc;
            zzabuVar.getClass();
            zzabuVar.zzb();
            zzabtVar.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzabt zzabtVar = this.zzb;
        if (zzabtVar != null) {
            zzabtVar.zzb();
            zzabu zzabuVar = this.zzc;
            zzabuVar.getClass();
            zzabuVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
