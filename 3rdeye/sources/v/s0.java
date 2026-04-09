package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.o0;

/* compiled from: SynchronizedCaptureSessionStateCallbacks.java */
/* loaded from: classes.dex */
public final class s0 extends o0.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f46860a;

    public s0(List<o0.b> list) {
        ArrayList arrayList = new ArrayList();
        this.f46860a = arrayList;
        arrayList.addAll(list);
    }

    @Override // v.o0.b
    public final void a(r0 r0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).a(r0Var);
        }
    }

    @Override // v.o0.b
    public final void g(r0 r0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).g(r0Var);
        }
    }

    @Override // v.o0.b
    public final void h(o0 o0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).h(o0Var);
        }
    }

    @Override // v.o0.b
    public final void i(o0 o0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).i(o0Var);
        }
    }

    @Override // v.o0.b
    public final void j(r0 r0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).j(r0Var);
        }
    }

    @Override // v.o0.b
    public final void k(r0 r0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).k(r0Var);
        }
    }

    @Override // v.o0.b
    public final void l(o0 o0Var) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).l(o0Var);
        }
    }

    @Override // v.o0.b
    public final void m(r0 r0Var, Surface surface) {
        Iterator it = this.f46860a.iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).m(r0Var, surface);
        }
    }

    /* compiled from: SynchronizedCaptureSessionStateCallbacks.java */
    public static class a extends o0.b {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f46861a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            this.f46861a = list.isEmpty() ? new N() : list.size() == 1 ? list.get(0) : new M(list);
        }

        @Override // v.o0.b
        public final void a(r0 r0Var) {
            this.f46861a.onActive(r0Var.d().f47112a.f47137a);
        }

        @Override // v.o0.b
        public final void g(r0 r0Var) {
            this.f46861a.onCaptureQueueEmpty(r0Var.d().f47112a.f47137a);
        }

        @Override // v.o0.b
        public final void h(o0 o0Var) {
            this.f46861a.onClosed(o0Var.d().f47112a.f47137a);
        }

        @Override // v.o0.b
        public final void i(o0 o0Var) {
            this.f46861a.onConfigureFailed(o0Var.d().f47112a.f47137a);
        }

        @Override // v.o0.b
        public final void j(r0 r0Var) {
            this.f46861a.onConfigured(r0Var.d().f47112a.f47137a);
        }

        @Override // v.o0.b
        public final void k(r0 r0Var) {
            this.f46861a.onReady(r0Var.d().f47112a.f47137a);
        }

        @Override // v.o0.b
        public final void m(r0 r0Var, Surface surface) {
            this.f46861a.onSurfacePrepared(r0Var.d().f47112a.f47137a, surface);
        }

        @Override // v.o0.b
        public final void l(o0 o0Var) {
        }
    }
}
