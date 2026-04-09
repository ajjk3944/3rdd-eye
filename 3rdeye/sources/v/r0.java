package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.C0;
import androidx.fragment.app.C1752e;
import f2.RunnableC4331a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.b;
import z.C5835e;
import z.C5836f;
import z.C5841k;

/* compiled from: SynchronizedCaptureSessionImpl.java */
/* loaded from: classes.dex */
public final class r0 extends q0 {

    /* renamed from: o, reason: collision with root package name */
    public final H.c f46849o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f46850p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f46851q;

    /* renamed from: r, reason: collision with root package name */
    public I.q f46852r;

    /* renamed from: s, reason: collision with root package name */
    public final C5836f f46853s;

    /* renamed from: t, reason: collision with root package name */
    public final C5835e f46854t;

    /* renamed from: u, reason: collision with root package name */
    public final C5841k f46855u;

    /* renamed from: v, reason: collision with root package name */
    public final C6.a f46856v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f46857w;

    public r0(H.c cVar, H.g gVar, Handler handler, C0 c02, C0 c03, a0 a0Var) {
        super(a0Var, gVar, cVar, handler);
        this.f46850p = new Object();
        this.f46857w = new AtomicBoolean(false);
        this.f46853s = new C5836f(c02, c03);
        this.f46855u = new C5841k(c02.d(CaptureSessionStuckQuirk.class) || c02.d(IncorrectCaptureStateQuirk.class));
        this.f46854t = new C5835e(c03);
        C6.a aVar = new C6.a();
        aVar.f927a = c03.d(Preview3AThreadCrashQuirk.class);
        this.f46856v = aVar;
        this.f46849o = cVar;
    }

    @Override // v.q0, v.o0
    public final void c() {
        s();
        this.f46855u.c();
    }

    @Override // v.o0
    public final void close() {
        if (!this.f46857w.compareAndSet(false, true)) {
            x("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f46856v.f927a) {
            try {
                x("Call abortCaptures() before closing session.");
                n();
            } catch (Exception e4) {
                x("Exception when calling abortCaptures()" + e4);
            }
        }
        x("Session call close()");
        this.f46855u.b().addListener(new RunnableC4331a(this, 9), this.f46837d);
    }

    @Override // v.o0
    public final void e(int i) {
        if (i == 5) {
            synchronized (this.f46850p) {
                try {
                    if (r() && this.f46851q != null) {
                        x("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f46851q.iterator();
                        while (it.hasNext()) {
                            ((androidx.camera.core.impl.X) it.next()).a();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // v.o0
    public final b.d f() {
        return o0.b.a(new I.e(this.f46855u.b(), this.f46849o, 1500L));
    }

    @Override // v.q0, v.o0.b
    public final void h(o0 o0Var) {
        synchronized (this.f46850p) {
            this.f46853s.a(this.f46851q);
        }
        x("onClosed()");
        super.h(o0Var);
    }

    @Override // v.o0.b
    public final void j(r0 r0Var) {
        o0 o0Var;
        o0 o0Var2;
        o0 o0Var3;
        x("Session onConfigured()");
        C5835e c5835e = this.f46854t;
        ArrayList arrayListB = this.f46835b.b();
        ArrayList arrayListA = this.f46835b.a();
        if (c5835e.f48387a != null) {
            LinkedHashSet<o0> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayListB.iterator();
            while (it.hasNext() && (o0Var3 = (o0) it.next()) != r0Var) {
                linkedHashSet.add(o0Var3);
            }
            for (o0 o0Var4 : linkedHashSet) {
                o0Var4.b().i(o0Var4);
            }
        }
        Objects.requireNonNull(this.f46839f);
        a0 a0Var = this.f46835b;
        synchronized (a0Var.f46663b) {
            a0Var.f46664c.add(this);
            a0Var.f46666e.remove(this);
        }
        Iterator it2 = a0Var.c().iterator();
        while (it2.hasNext() && (o0Var2 = (o0) it2.next()) != this) {
            o0Var2.c();
        }
        this.f46839f.j(r0Var);
        if (c5835e.f48387a != null) {
            LinkedHashSet<o0> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayListA.iterator();
            while (it3.hasNext() && (o0Var = (o0) it3.next()) != r0Var) {
                linkedHashSet2.add(o0Var);
            }
            for (o0 o0Var5 : linkedHashSet2) {
                o0Var5.b().h(o0Var5);
            }
        }
    }

    @Override // v.q0
    public final A4.a t(ArrayList arrayList) {
        A4.a aVarT;
        synchronized (this.f46850p) {
            this.f46851q = arrayList;
            aVarT = super.t(arrayList);
        }
        return aVarT;
    }

    @Override // v.q0
    public final boolean u() {
        boolean zU;
        synchronized (this.f46850p) {
            try {
                if (r()) {
                    this.f46853s.a(this.f46851q);
                } else {
                    I.q qVar = this.f46852r;
                    if (qVar != null) {
                        qVar.cancel(true);
                    }
                }
                zU = super.u();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zU;
    }

    public final int w(ArrayList arrayList, L l5) throws CameraAccessException {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.f46855u.a(l5);
        A2.l.p(this.f46840g, "Need to call openCaptureSession before using this API.");
        return this.f46840g.f47112a.a(arrayList, this.f46837d, captureCallbackA);
    }

    public final void x(String str) {
        C.S.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final A4.a<Void> y(CameraDevice cameraDevice, x.l lVar, List<androidx.camera.core.impl.X> list) {
        A4.a<Void> aVarF;
        synchronized (this.f46850p) {
            try {
                ArrayList arrayListA = this.f46835b.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o0) it.next()).f());
                }
                I.q qVarI = I.j.i(arrayList);
                this.f46852r = qVarI;
                I.d dVarA = I.d.a(qVarI);
                C1752e c1752e = new C1752e(this, cameraDevice, lVar, list);
                H.g gVar = this.f46837d;
                dVarA.getClass();
                aVarF = I.j.f(I.j.j(dVarA, c1752e, gVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarF;
    }

    public final int z(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.f46855u.a(captureCallback);
        A2.l.p(this.f46840g, "Need to call openCaptureSession before using this API.");
        return this.f46840g.f47112a.b(captureRequest, this.f46837d, captureCallbackA);
    }
}
