package v;

import I.m;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import o0.b;
import v.o0;
import w.C5688b;

/* compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* loaded from: classes.dex */
public class q0 extends o0.b implements o0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f46835b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f46836c;

    /* renamed from: d, reason: collision with root package name */
    public final H.g f46837d;

    /* renamed from: e, reason: collision with root package name */
    public final H.c f46838e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f46839f;

    /* renamed from: g, reason: collision with root package name */
    public C5688b f46840g;

    /* renamed from: h, reason: collision with root package name */
    public b.d f46841h;
    public b.a<Void> i;

    /* renamed from: j, reason: collision with root package name */
    public I.d f46842j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f46834a = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List<androidx.camera.core.impl.X> f46843k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f46844l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f46845m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f46846n = false;

    public q0(a0 a0Var, H.g gVar, H.c cVar, Handler handler) {
        this.f46835b = a0Var;
        this.f46836c = handler;
        this.f46837d = gVar;
        this.f46838e = cVar;
    }

    @Override // v.o0.b
    public final void a(r0 r0Var) {
        Objects.requireNonNull(this.f46839f);
        this.f46839f.a(r0Var);
    }

    @Override // v.o0
    public void c() {
        throw null;
    }

    @Override // v.o0
    public final C5688b d() {
        this.f46840g.getClass();
        return this.f46840g;
    }

    @Override // v.o0.b
    public final void g(r0 r0Var) {
        Objects.requireNonNull(this.f46839f);
        this.f46839f.g(r0Var);
    }

    @Override // v.o0.b
    public void h(o0 o0Var) {
        b.d dVar;
        synchronized (this.f46834a) {
            try {
                if (this.f46844l) {
                    dVar = null;
                } else {
                    this.f46844l = true;
                    A2.l.p(this.f46841h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f46841h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c();
        if (dVar != null) {
            dVar.f44804c.addListener(new RunnableC5660o(2, this, o0Var), E.u.y());
        }
    }

    @Override // v.o0.b
    public final void i(o0 o0Var) {
        o0 o0Var2;
        Objects.requireNonNull(this.f46839f);
        c();
        a0 a0Var = this.f46835b;
        Iterator it = a0Var.c().iterator();
        while (it.hasNext() && (o0Var2 = (o0) it.next()) != this) {
            o0Var2.c();
        }
        synchronized (a0Var.f46663b) {
            a0Var.f46666e.remove(this);
        }
        this.f46839f.i(o0Var);
    }

    @Override // v.o0.b
    public final void k(r0 r0Var) {
        Objects.requireNonNull(this.f46839f);
        this.f46839f.k(r0Var);
    }

    @Override // v.o0.b
    public final void l(o0 o0Var) {
        b.d dVar;
        synchronized (this.f46834a) {
            try {
                if (this.f46846n) {
                    dVar = null;
                } else {
                    this.f46846n = true;
                    A2.l.p(this.f46841h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f46841h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            dVar.f44804c.addListener(new com.yandex.mobile.ads.impl.L(20, this, o0Var), E.u.y());
        }
    }

    @Override // v.o0.b
    public final void m(r0 r0Var, Surface surface) {
        Objects.requireNonNull(this.f46839f);
        this.f46839f.m(r0Var, surface);
    }

    public final void n() throws CameraAccessException {
        A2.l.p(this.f46840g, "Need to call openCaptureSession before using this API.");
        this.f46840g.f47112a.f47137a.abortCaptures();
    }

    public final void o(CameraCaptureSession cameraCaptureSession) {
        if (this.f46840g == null) {
            this.f46840g = new C5688b(cameraCaptureSession, this.f46836c);
        }
    }

    public final CameraDevice p() {
        this.f46840g.getClass();
        return this.f46840g.f47112a.f47137a.getDevice();
    }

    public final void q(List<androidx.camera.core.impl.X> list) throws X.a {
        synchronized (this.f46834a) {
            s();
            androidx.camera.core.impl.Z.b(list);
            this.f46843k = list;
        }
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f46834a) {
            z10 = this.f46841h != null;
        }
        return z10;
    }

    public final void s() {
        synchronized (this.f46834a) {
            try {
                List<androidx.camera.core.impl.X> list = this.f46843k;
                if (list != null) {
                    androidx.camera.core.impl.Z.a(list);
                    this.f46843k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public A4.a t(ArrayList arrayList) {
        synchronized (this.f46834a) {
            try {
                if (this.f46845m) {
                    return new m.a(new CancellationException("Opener is disabled"));
                }
                I.d dVarA = I.d.a(androidx.camera.core.impl.Z.c(arrayList, this.f46837d, this.f46838e));
                B.i iVar = new B.i(12, this, arrayList);
                H.g gVar = this.f46837d;
                dVarA.getClass();
                I.b bVarJ = I.j.j(dVarA, iVar, gVar);
                this.f46842j = bVarJ;
                return I.j.f(bVarJ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean u() {
        boolean z10;
        try {
            synchronized (this.f46834a) {
                try {
                    if (!this.f46845m) {
                        I.d dVar = this.f46842j;
                        dVar = dVar != null ? dVar : null;
                        this.f46845m = true;
                    }
                    z10 = !r();
                } finally {
                }
            }
            return z10;
        } finally {
            if (dVar != null) {
                dVar.cancel(true);
            }
        }
    }

    public final void v() throws CameraAccessException {
        A2.l.p(this.f46840g, "Need to call openCaptureSession before using this API.");
        this.f46840g.f47112a.f47137a.stopRepeating();
    }

    @Override // v.o0
    public final q0 b() {
        return this;
    }
}
