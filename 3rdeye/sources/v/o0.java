package v;

import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.C0;
import o0.b;
import w.C5688b;

/* compiled from: SynchronizedCaptureSession.java */
/* loaded from: classes.dex */
public interface o0 {

    /* compiled from: SynchronizedCaptureSession.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final H.g f46817a;

        /* renamed from: b, reason: collision with root package name */
        public final H.c f46818b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f46819c;

        /* renamed from: d, reason: collision with root package name */
        public final a0 f46820d;

        /* renamed from: e, reason: collision with root package name */
        public final C0 f46821e;

        /* renamed from: f, reason: collision with root package name */
        public final C0 f46822f;

        public a(H.c cVar, H.g gVar, Handler handler, C0 c02, C0 c03, a0 a0Var) {
            this.f46817a = gVar;
            this.f46818b = cVar;
            this.f46819c = handler;
            this.f46820d = a0Var;
            this.f46821e = c02;
            this.f46822f = c03;
        }
    }

    q0 b();

    void c();

    void close();

    C5688b d();

    void e(int i);

    b.d f();

    /* compiled from: SynchronizedCaptureSession.java */
    public static abstract class b {
        public void a(r0 r0Var) {
        }

        public void g(r0 r0Var) {
        }

        public void h(o0 o0Var) {
        }

        public void i(o0 o0Var) {
        }

        public void j(r0 r0Var) {
        }

        public void k(r0 r0Var) {
        }

        public void l(o0 o0Var) {
        }

        public void m(r0 r0Var, Surface surface) {
        }
    }
}
