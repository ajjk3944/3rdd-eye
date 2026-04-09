package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzsn implements zztd {
    private final zzfvw zza;
    private final zzfvw zzb;

    public zzsn(int i) {
        zzsl zzslVar = new zzsl(i);
        zzsm zzsmVar = new zzsm(i);
        this.zza = zzslVar;
        this.zzb = zzsmVar;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzsp.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzsp.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final zzsp zzc(zztc zztcVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzsp zzspVar;
        zzti zztiVar = zztcVar.zza;
        String str = zztiVar.zza;
        zzsp zzspVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzspVar = new zzsp(mediaCodecCreateByCodecName, zza(((zzsl) this.zza).zza), new zzst(mediaCodecCreateByCodecName, zzb(((zzsm) this.zzb).zza)), zztcVar.zzf, null);
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (Exception e10) {
            exc = e10;
            mediaCodecCreateByCodecName = null;
        }
        try {
            Trace.endSection();
            Surface surface = zztcVar.zzd;
            int i = 0;
            if (surface == null && zztiVar.zzh && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            }
            zzsp.zzh(zzspVar, zztcVar.zzb, surface, null, i);
            return zzspVar;
        } catch (Exception e11) {
            exc = e11;
            zzspVar2 = zzspVar;
            if (zzspVar2 != null) {
                zzspVar2.zzm();
                throw exc;
            }
            if (mediaCodecCreateByCodecName == null) {
                throw exc;
            }
            mediaCodecCreateByCodecName.release();
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztd
    public final /* bridge */ /* synthetic */ zztf zzd(zztc zztcVar) throws IOException {
        throw null;
    }
}
