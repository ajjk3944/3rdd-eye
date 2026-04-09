package l5;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f14695g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f14696h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f14697a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f14698b;

    /* renamed from: c, reason: collision with root package name */
    public i.c f14699c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f14700d;

    /* renamed from: e, reason: collision with root package name */
    public final a5.d f14701e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14702f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        a5.d dVar = new a5.d(0);
        this.f14697a = mediaCodec;
        this.f14698b = handlerThread;
        this.f14701e = dVar;
        this.f14700d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f14695g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        if (this.f14702f) {
            try {
                i.c cVar = this.f14699c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                a5.d dVar = this.f14701e;
                dVar.c();
                i.c cVar2 = this.f14699c;
                cVar2.getClass();
                cVar2.obtainMessage(2).sendToTarget();
                synchronized (dVar) {
                    while (!dVar.f104d) {
                        dVar.wait();
                    }
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }
}
