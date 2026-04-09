package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzabu implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzabu zzb = new zzabu();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzabu() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = zzex.zza;
        Handler handler = new Handler(looper, this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzabu zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.zza = j4;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e4) {
                zzea.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i10 = this.zzf + 1;
                this.zzf = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.zze;
        if (choreographer2 != null) {
            int i11 = this.zzf - 1;
            this.zzf = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.zza = -9223372036854775807L;
            }
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }
}
