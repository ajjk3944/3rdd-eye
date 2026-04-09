package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzabn implements zzcb {
    private final Context zza;
    private final zzca zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzacn zze;
    private final zzdj zzf;
    private final CopyOnWriteArraySet zzg;
    private zzet zzh = new zzet(10);
    private final zzz zzi;
    private final zzbv zzj;
    private final zzfyf zzk;
    private zzdt zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzabn(zzabg zzabgVar, zzabm zzabmVar) {
        this.zza = zzabgVar.zza;
        zzca zzcaVar = zzabgVar.zzc;
        zzdd.zzb(zzcaVar);
        this.zzb = zzcaVar;
        this.zzc = new SparseArray();
        this.zzk = zzfyf.zzn();
        this.zzj = zzbv.zza;
        this.zzd = zzabgVar.zzd;
        zzdj zzdjVar = zzabgVar.zze;
        this.zzf = zzdjVar;
        this.zze = new zzaar(zzabgVar.zzb, zzdjVar);
        this.zzg = new CopyOnWriteArraySet();
        this.zzi = new zzx().zzan();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzk zzA(zzk zzkVar) {
        return (zzkVar == null || !zzkVar.zzf()) ? zzk.zza : zzkVar;
    }

    public static /* synthetic */ void zzf(zzabn zzabnVar) {
        zzabnVar.zzn--;
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzabn zzabnVar, boolean z10) {
        if (zzabnVar.zzo == 1) {
            zzabnVar.zzn++;
            zzacn zzacnVar = zzabnVar.zze;
            zzacnVar.zzj(z10);
            while (zzabnVar.zzh.zza() > 1) {
                zzabnVar.zzh.zzb();
            }
            if (zzabnVar.zzh.zza() == 1) {
                zzabl zzablVar = (zzabl) zzabnVar.zzh.zzb();
                zzablVar.getClass();
                zzacnVar.zzl(1, zzabnVar.zzi, zzablVar.zza, zzablVar.zzb, zzfyf.zzn());
            }
            zzabnVar.zzp = -9223372036854775807L;
            zzabnVar.zzq = -9223372036854775807L;
            zzdt zzdtVar = zzabnVar.zzl;
            zzdd.zzb(zzdtVar);
            zzdtVar.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final void run() {
                    zzabn.zzf(this.zza);
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzy(zzabn zzabnVar, zzz zzzVar, int i) throws zzacm {
        zzdd.zzf(zzabnVar.zzo == 0);
        zzk zzkVarZzA = zzA(zzzVar.zzE);
        int i10 = zzkVarZzA.zzd;
        if (i10 != 7) {
            if (!zzdr.zzc(i10) && Build.VERSION.SDK_INT >= 29) {
                String str = zzex.zza;
                Locale locale = Locale.US;
                zzea.zzf("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                zzkVarZzA = zzk.zza;
            }
        } else if (Build.VERSION.SDK_INT >= 34 || !zzdr.zzb()) {
            i10 = 7;
            if (!zzdr.zzc(i10)) {
                String str2 = zzex.zza;
                Locale locale2 = Locale.US;
                zzea.zzf("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                zzkVarZzA = zzk.zza;
            }
        } else {
            zzi zziVarZzc = zzkVarZzA.zzc();
            zziVarZzc.zzd(6);
            zzkVarZzA = zziVarZzc.zzg();
        }
        zzk zzkVar = zzkVarZzA;
        zzdj zzdjVar = zzabnVar.zzf;
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        final zzdt zzdtVarZzd = zzdjVar.zzd(looperMyLooper, null);
        zzabnVar.zzl = zzdtVarZzd;
        try {
            zzca zzcaVar = zzabnVar.zzb;
            Context context = zzabnVar.zza;
            zzn zznVar = zzn.zza;
            Objects.requireNonNull(zzdtVarZzd);
            zzcaVar.zza(context, zzkVar, zznVar, zzabnVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdtVarZzd.zzi(runnable);
                }
            }, zzabnVar.zzj, zzabnVar.zzk, 0L, false);
            throw null;
        } catch (zzbw e4) {
            throw new zzacm(e4, zzzVar);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzz(zzabn zzabnVar) {
        int i = zzabnVar.zzr;
        return i != -1 && i == 0;
    }

    public final zzacn zze(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzex.zzH(sparseArray, 0)) {
            return (zzacn) sparseArray.get(0);
        }
        zzabh zzabhVar = new zzabh(this, this.zza, 0);
        this.zzg.add(zzabhVar);
        sparseArray.put(0, zzabhVar);
        return zzabhVar;
    }

    public final void zzq() {
        zzeo zzeoVar = zzeo.zza;
        zzeoVar.zzb();
        zzeoVar.zza();
        this.zzm = null;
    }

    public final void zzr() {
        if (this.zzo == 2) {
            return;
        }
        zzdt zzdtVar = this.zzl;
        if (zzdtVar != null) {
            zzdtVar.zzf(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzs(Surface surface, zzeo zzeoVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeo) this.zzm.second).equals(zzeoVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzeoVar);
        zzeoVar.zzb();
        zzeoVar.zza();
    }

    public final void zzt(int i) {
        this.zzr = 1;
    }

    public final void zzu() {
        this.zze.zzx();
    }

    public final void zzv() {
        this.zze.zzy();
    }
}
