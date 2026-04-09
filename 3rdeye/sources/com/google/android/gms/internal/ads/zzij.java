package com.google.android.gms.internal.ads;

import B4.g;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzij implements zzkx {
    private final zzzm zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzij() {
        zzzm zzzmVar = new zzzm(true, 65536);
        zzl(1000, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        zzl(2000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        zzl(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzl(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(50000, 50000, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.zza = zzzmVar;
        this.zzb = zzex.zzs(50000L);
        this.zzc = zzex.zzs(50000L);
        this.zzd = zzex.zzs(1000L);
        this.zze = zzex.zzs(2000L);
        this.zzf = zzex.zzs(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzl(int i, int i10, String str, String str2) {
        zzdd.zze(i >= i10, g.o(str, " cannot be less than ", str2));
    }

    private final void zzm(zzph zzphVar) {
        if (this.zzg.remove(zzphVar) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    public final int zza() {
        Iterator it = this.zzg.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzih) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final long zzb(zzph zzphVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzc(zzph zzphVar) {
        long id = Thread.currentThread().getId();
        long j4 = this.zzh;
        boolean z10 = true;
        if (j4 != -1 && j4 != id) {
            z10 = false;
        }
        zzdd.zzg(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        HashMap map = this.zzg;
        if (!map.containsKey(zzphVar)) {
            map.put(zzphVar, new zzih(null));
        }
        zzih zzihVar = (zzih) map.get(zzphVar);
        zzihVar.getClass();
        zzihVar.zzb = 13107200;
        zzihVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzd(zzph zzphVar) {
        zzm(zzphVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zze(zzph zzphVar) {
        zzm(zzphVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzf(zzkw zzkwVar, zzxk zzxkVar, zzyw[] zzywVarArr) {
        zzih zzihVar = (zzih) this.zzg.get(zzkwVar.zza);
        zzihVar.getClass();
        int length = zzywVarArr.length;
        int i = 0;
        int i10 = 0;
        while (true) {
            int i11 = 13107200;
            if (i >= length) {
                zzihVar.zzb = Math.max(13107200, i10);
                zzn();
                return;
            }
            zzyw zzywVar = zzywVarArr[i];
            if (zzywVar != null) {
                switch (zzywVar.zzc().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i11 = 144310272;
                        break;
                    case 2:
                        i11 = 131072000;
                        break;
                    case 3:
                    case 5:
                    default:
                        i11 = 131072;
                        break;
                    case 4:
                        i11 = 26214400;
                        break;
                }
                i10 += i11;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzg(zzph zzphVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzh(zzkw zzkwVar) {
        zzih zzihVar = (zzih) this.zzg.get(zzkwVar.zza);
        zzihVar.getClass();
        int iZza = this.zza.zza();
        int iZza2 = zza();
        long jMin = this.zzb;
        float f10 = zzkwVar.zzc;
        if (f10 > 1.0f) {
            jMin = Math.min(zzex.zzq(jMin, f10), this.zzc);
        }
        long j4 = zzkwVar.zzb;
        if (j4 < Math.max(jMin, 500000L)) {
            boolean z10 = iZza < iZza2;
            zzihVar.zza = z10;
            if (!z10 && j4 < 500000) {
                zzea.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= this.zzc || iZza >= iZza2) {
            zzihVar.zza = false;
        }
        return zzihVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzi(zzbl zzblVar, zzvh zzvhVar, long j4) {
        Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            if (((zzih) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzj(zzkw zzkwVar) {
        boolean z10 = zzkwVar.zzd;
        long jZzr = zzex.zzr(zzkwVar.zzb, zzkwVar.zzc);
        long jMin = z10 ? this.zze : this.zzd;
        long j4 = zzkwVar.zze;
        if (j4 != -9223372036854775807L) {
            jMin = Math.min(j4 / 2, jMin);
        }
        return jMin <= 0 || jZzr >= jMin || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final zzzm zzk() {
        return this.zza;
    }
}
