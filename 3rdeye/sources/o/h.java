package O;

import C.C;
import C.E;
import C.Q;
import C.S;
import C.T;
import C.V;
import C.X;
import C.d0;
import C.g0;
import C.k0;
import I.m;
import N.u;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import v.RunnableC5655j;

/* compiled from: DualSurfaceProcessor.java */
/* loaded from: classes.dex */
public final class h implements u, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b, reason: collision with root package name */
    public final c f10150b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThread f10151c;

    /* renamed from: d, reason: collision with root package name */
    public final H.c f10152d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f10153e;

    /* renamed from: f, reason: collision with root package name */
    public int f10154f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10155g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f10156h;
    public final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f10157j;

    /* renamed from: k, reason: collision with root package name */
    public SurfaceTexture f10158k;

    public h(C c10, Q q10, Q q11) {
        Map map = Collections.EMPTY_MAP;
        this.f10154f = 0;
        this.f10155g = false;
        this.f10156h = new AtomicBoolean(false);
        this.i = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f10151c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f10153e = handler;
        this.f10152d = new H.c(handler);
        this.f10150b = new c(q10, q11);
        try {
            try {
                o0.b.a(new D3.b(this, c10)).get();
            } catch (InterruptedException | ExecutionException e4) {
                e = e4;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    @Override // N.u
    public final void a(k0 k0Var) throws X {
        if (this.f10156h.get()) {
            k0Var.d();
        } else {
            e(new T(8, this, k0Var), new V(k0Var, 2));
        }
    }

    @Override // N.u
    public final void b(d0 d0Var) throws IOException, X {
        if (this.f10156h.get()) {
            d0Var.close();
            return;
        }
        E e4 = new E(4, this, d0Var);
        Objects.requireNonNull(d0Var);
        e(e4, new g0(d0Var, 5));
    }

    @Override // N.u
    public final /* synthetic */ A4.a c(int i, int i10) {
        return m.c.f2366c;
    }

    public final void d() {
        if (this.f10155g && this.f10154f == 0) {
            LinkedHashMap linkedHashMap = this.i;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((d0) it.next()).close();
            }
            linkedHashMap.clear();
            c cVar = this.f10150b;
            if (cVar.f4408a.getAndSet(false)) {
                P.d.c(cVar.f4410c);
                cVar.h();
            }
            cVar.f10136n = -1;
            cVar.f10137o = -1;
            this.f10151c.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f10152d.execute(new J4.e(this, runnable2, runnable, 2));
        } catch (RejectedExecutionException e4) {
            S.h("DualSurfaceProcessor", "Unable to executor runnable", e4);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f10156h.get() || (surfaceTexture2 = this.f10157j) == null || this.f10158k == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f10158k.updateTexImage();
        for (Map.Entry entry : this.i.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            d0 d0Var = (d0) entry.getKey();
            if (d0Var.getFormat() == 34) {
                try {
                    this.f10150b.l(surfaceTexture.getTimestamp(), surface, d0Var, this.f10157j, this.f10158k);
                } catch (RuntimeException e4) {
                    S.c("DualSurfaceProcessor", "Failed to render with OpenGL.", e4);
                }
            }
        }
    }

    @Override // N.u
    public final void release() {
        if (this.f10156h.getAndSet(true)) {
            return;
        }
        e(new g0(this, 6), new RunnableC5655j(0));
    }
}
