package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzis implements zzlj {
    public static final zzguf zza = zzguf.zzn("file", "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzaat zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgui zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzis() {
        zzaat zzaatVar = new zzaat(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzgui zzguiVarZza = zzgui.zza();
        zzq(1000, 0, "bufferForPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        zzq(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzaatVar;
        this.zze = zzfj.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzf = zzfj.zzq(1000L);
        this.zzg = zzfj.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzh = zzfj.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzi = zzfj.zzq(1000L);
        this.zzj = zzfj.zzq(1000L);
        this.zzk = zzfj.zzq(2000L);
        this.zzl = zzfj.zzq(1000L);
        this.zzm = zzfj.zzq(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgui.zzc(zzguiVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpq zzpqVar) {
        Integer num = (Integer) this.zzn.get(zzpqVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpq zzpqVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar != null) {
            int i10 = zzirVar.zza - 1;
            zzirVar.zza = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(zzpqVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzaat zzaatVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zzir) it.next()).zzc;
        }
        zzaatVar.zzf(i10);
    }

    private final boolean zzp(zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzliVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i10, int i11, String str, String str2) {
        zzgrc.zzh(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc() * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    private final int zzs(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc;
    }

    private static final boolean zzt(boolean z10) {
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        long id = Thread.currentThread().getId();
        long j10 = this.zzp;
        zzgrc.zzj(j10 == -1 || j10 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar == null) {
            concurrentHashMap.put(zzpqVar, new zzir());
        } else {
            zzirVar.zza++;
        }
        zzir zzirVar2 = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar2.getClass();
        int iZzm = zzm(zzpqVar);
        if (iZzm == -1) {
            iZzm = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        zzirVar2.zzc = iZzm;
        zzirVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        int iZzm = zzm(zzpqVar);
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzliVar);
            int length = zzaacVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 < length) {
                    zzaac zzaacVar = zzaacVarArr[i10];
                    if (zzaacVar != null) {
                        switch (zzaacVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                if (!zZzp) {
                                    i12 = 131072000;
                                    break;
                                } else {
                                    i12 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = 26214400;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    iZzm = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i11);
                }
            }
        }
        zzirVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        zzn(zzpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        zzn(zzpqVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return new zziq(this, zzpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        int iZzr = zzr(zzpqVar);
        int iZzs = zzs(zzpqVar);
        if (zzpqVar.equals(zzpq.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzliVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j10 = zZzp ? this.zzh : this.zzg;
        float f10 = zzliVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfj.zzv(jMin, f10), j10);
        }
        long j11 = zzliVar.zze;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z10 = zzt(zZzp) || iZzr < iZzs;
            zzirVar.zzb = z10;
            if (!z10 && j11 < 500000) {
                zzee.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iZzr >= iZzs) {
            zzirVar.zzb = false;
        }
        return zzirVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long jMin;
        boolean z10;
        boolean z11 = zzliVar.zzg;
        long j10 = zzliVar.zze;
        float f10 = zzliVar.zzf;
        boolean zZzp = zzp(zzliVar);
        long jZzw = zzfj.zzw(j10, f10);
        if (z11) {
            if (zZzp) {
                jMin = this.zzl;
                z10 = true;
            } else {
                jMin = this.zzk;
                z10 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z10 = true;
        } else {
            jMin = this.zzi;
            z10 = false;
        }
        long j11 = zzliVar.zzh;
        if (j11 != C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        if (!zzt(z10)) {
            zzpq zzpqVar = zzliVar.zza;
            if (zzr(zzpqVar) >= zzs(zzpqVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j10) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzir) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzaat zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
