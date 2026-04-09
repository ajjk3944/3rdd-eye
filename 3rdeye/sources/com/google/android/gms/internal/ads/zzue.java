package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzue implements zztf {
    private final MediaCodec zza;
    private final zztb zzb;

    public /* synthetic */ zzue(MediaCodec mediaCodec, zztb zztbVar, zzud zzudVar) {
        this.zza = mediaCodec;
        this.zzb = zztbVar;
        if (Build.VERSION.SDK_INT < 35 || zztbVar == null) {
            return;
        }
        zztbVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzk(int i, int i10, int i11, long j4, int i12) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i, 0, i11, j4, i12);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzl(int i, int i10, zzhp zzhpVar, long j4, int i11) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i, 0, zzhpVar.zza(), j4, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzm() {
        zztb zztbVar;
        zztb zztbVar2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.zza.stop();
            }
            if (i >= 35 && (zztbVar2 = this.zzb) != null) {
                zztbVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zztbVar = this.zzb) != null) {
                zztbVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzn(int i, long j4) {
        this.zza.releaseOutputBuffer(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzo(int i, boolean z10) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzq(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final /* synthetic */ boolean zzs(zzte zzteVar) {
        return false;
    }
}
