package C;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.X;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: SurfaceRequest.java */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Range<Integer> f730p = L0.f14918a;

    /* renamed from: a, reason: collision with root package name */
    public final Object f731a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Size f732b;

    /* renamed from: c, reason: collision with root package name */
    public final C f733c;

    /* renamed from: d, reason: collision with root package name */
    public final Range<Integer> f734d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.J f735e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f736f;

    /* renamed from: g, reason: collision with root package name */
    public final b.d f737g;

    /* renamed from: h, reason: collision with root package name */
    public final b.a<Surface> f738h;
    public final b.d i;

    /* renamed from: j, reason: collision with root package name */
    public final b.a<Void> f739j;

    /* renamed from: k, reason: collision with root package name */
    public final b.a<Void> f740k;

    /* renamed from: l, reason: collision with root package name */
    public final i0 f741l;

    /* renamed from: m, reason: collision with root package name */
    public C0624k f742m;

    /* renamed from: n, reason: collision with root package name */
    public e f743n;

    /* renamed from: o, reason: collision with root package name */
    public Executor f744o;

    /* compiled from: SurfaceRequest.java */
    public class a implements I.c<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ K0.b f745b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Surface f746c;

        public a(K0.b bVar, Surface surface) {
            this.f745b = bVar;
            this.f746c = surface;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            A2.l.q("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof b);
            this.f745b.accept(new C0623j(1, this.f746c));
        }

        @Override // I.c
        public final void onSuccess(Void r32) {
            this.f745b.accept(new C0623j(0, this.f746c));
        }
    }

    /* compiled from: SurfaceRequest.java */
    public static final class b extends RuntimeException {
    }

    /* compiled from: SurfaceRequest.java */
    public static abstract class c {
        public abstract int a();

        public abstract Surface b();
    }

    /* compiled from: SurfaceRequest.java */
    public static abstract class d {
        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    /* compiled from: SurfaceRequest.java */
    public interface e {
        void f(C0624k c0624k);
    }

    public k0(Size size, androidx.camera.core.impl.J j4, boolean z10, C c10, Range range, N.o oVar) {
        this.f732b = size;
        this.f735e = j4;
        this.f736f = z10;
        this.f733c = c10;
        this.f734d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        b.d dVarA = o0.b.a(new e0(0, atomicReference, str));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f740k = aVar;
        AtomicReference atomicReference2 = new AtomicReference(null);
        b.d dVarA2 = o0.b.a(new C0635w(1, atomicReference2, str));
        this.i = dVarA2;
        I.j.a(dVarA2, new h0(aVar, dVarA), E.u.y());
        b.a aVar2 = (b.a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        b.d dVarA3 = o0.b.a(new f0(0, atomicReference3, str));
        this.f737g = dVarA3;
        b.a<Surface> aVar3 = (b.a) atomicReference3.get();
        aVar3.getClass();
        this.f738h = aVar3;
        i0 i0Var = new i0(this, size);
        this.f741l = i0Var;
        A4.a aVarF = I.j.f(i0Var.f14991e);
        I.j.a(dVarA3, new j0(aVarF, aVar2, str), E.u.y());
        aVarF.addListener(new g0(this, 0), E.u.y());
        H.b bVarY = E.u.y();
        AtomicReference atomicReference4 = new AtomicReference(null);
        I.j.a(o0.b.a(new B.i(2, this, atomicReference4)), new l0(oVar), bVarY);
        b.a<Void> aVar4 = (b.a) atomicReference4.get();
        aVar4.getClass();
        this.f739j = aVar4;
    }

    public final boolean a() {
        return this.f737g.f44804c.isDone();
    }

    public final void b(Surface surface, Executor executor, K0.b<c> bVar) {
        if (!this.f738h.b(surface)) {
            b.d dVar = this.f737g;
            if (!dVar.isCancelled()) {
                A2.l.q(null, dVar.f44804c.isDone());
                try {
                    dVar.get();
                    executor.execute(new B.c(1, bVar, surface));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new E(2, bVar, surface));
                    return;
                }
            }
        }
        I.j.a(this.i, new a(bVar, surface), executor);
    }

    public final void c(Executor executor, e eVar) {
        C0624k c0624k;
        synchronized (this.f731a) {
            this.f743n = eVar;
            this.f744o = executor;
            c0624k = this.f742m;
        }
        if (c0624k != null) {
            executor.execute(new T(1, eVar, c0624k));
        }
    }

    public final void d() {
        this.f738h.d(new X.b("Surface request will not complete."));
    }
}
