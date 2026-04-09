package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vf4 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public q3 c;
    public final AtomicReference d;
    public final hp2 e;
    public boolean f;

    public vf4(MediaCodec mediaCodec, HandlerThread handlerThread) {
        hp2 hp2Var = new hp2();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = hp2Var;
        this.d = new AtomicReference();
    }

    public static uf4 c() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new uf4();
                }
                return (uf4) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                q3 q3Var = this.c;
                if (q3Var == null) {
                    throw null;
                }
                q3Var.removeCallbacksAndMessages(null);
                hp2 hp2Var = this.e;
                synchronized (hp2Var) {
                    hp2Var.a = false;
                }
                q3 q3Var2 = this.c;
                if (q3Var2 == null) {
                    throw null;
                }
                q3Var2.obtainMessage(3).sendToTarget();
                synchronized (hp2Var) {
                    while (!hp2Var.a) {
                        hp2Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
