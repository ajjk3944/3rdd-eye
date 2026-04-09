package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzabb extends HandlerThread implements Handler.Callback {
    private zzdp zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzabd zze;

    public zzabb() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdp zzdpVar;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i10 = message.arg1;
                    zzdp zzdpVar2 = this.zza;
                    if (zzdpVar2 == null) {
                        throw null;
                    }
                    zzdpVar2.zzb(i10);
                    this.zze = new zzabd(this, this.zza.zza(), i10 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdq e4) {
                    zzea.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.zzd = new IllegalStateException(e4);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    zzea.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzc = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    zzea.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzd = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdpVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzdpVar == null) {
                    throw null;
                }
                zzdpVar.zzc();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzabd zza(int i) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdp(handler, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzabd zzabdVar = this.zze;
        zzabdVar.getClass();
        return zzabdVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
