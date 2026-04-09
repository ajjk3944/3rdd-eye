package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class td1 extends HandlerThread implements Handler.Callback {
    public jq2 f;
    public Handler g;
    public Error h;
    public RuntimeException i;
    public ud1 j;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        jq2 jq2Var;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    jq2 jq2Var2 = this.f;
                    if (jq2Var2 == null) {
                        throw null;
                    }
                    jq2Var2.a(i2);
                    SurfaceTexture surfaceTexture = this.f.k;
                    surfaceTexture.getClass();
                    this.j = new ud1(this, surfaceTexture, i2 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    a30.C("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.h = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    a30.C("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.i = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (lq2 e3) {
                    a30.C("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.i = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    jq2Var = this.f;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (jq2Var == null) {
                    throw null;
                }
                jq2Var.b();
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
}
