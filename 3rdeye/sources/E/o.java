package E;

import C.K;
import C.N;
import C.S;
import C.g0;
import C.i0;
import E.D;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1707p;
import java.util.Objects;

/* compiled from: CaptureNode.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public A f1324a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.camera.core.e f1325b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.camera.core.e f1326c;

    /* renamed from: d, reason: collision with root package name */
    public C0657e f1327d;

    /* renamed from: e, reason: collision with root package name */
    public C0654b f1328e;

    /* renamed from: f, reason: collision with root package name */
    public v f1329f;

    /* compiled from: CaptureNode.java */
    public class a implements I.c<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A f1330b;

        public a(A a10) {
            this.f1330b = a10;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            G.n.a();
            o oVar = o.this;
            if (this.f1330b == oVar.f1324a) {
                S.g("CaptureNode", "request aborted, id=" + oVar.f1324a.f1269a);
                v vVar = oVar.f1329f;
                if (vVar != null) {
                    vVar.f1344b = null;
                }
                oVar.f1324a = null;
            }
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* compiled from: CaptureNode.java */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public i0 f1333b;

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1707p f1332a = new a();

        /* renamed from: c, reason: collision with root package name */
        public i0 f1334c = null;

        /* compiled from: CaptureNode.java */
        public class a extends AbstractC1707p {
        }

        public abstract N.k<D.a> a();

        public abstract N b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract Size f();

        public abstract N.k<A> g();

        public abstract Size h();

        public abstract boolean i();
    }

    public final int a() {
        int iF;
        G.n.a();
        A2.l.q("The ImageReader is not initialized.", this.f1325b != null);
        androidx.camera.core.e eVar = this.f1325b;
        synchronized (eVar.f14856a) {
            iF = eVar.f14859d.f() - eVar.f14857b;
        }
        return iF;
    }

    public final void b(androidx.camera.core.c cVar) {
        G.n.a();
        if (this.f1324a == null) {
            S.g("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + cVar);
            cVar.close();
            return;
        }
        if (((Integer) cVar.i0().a().f14935a.get(this.f1324a.f1275g)) == null) {
            S.g("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            cVar.close();
            return;
        }
        G.n.a();
        C0657e c0657e = this.f1327d;
        Objects.requireNonNull(c0657e);
        c0657e.f1308a.accept(new f(this.f1324a, cVar));
        A a10 = this.f1324a;
        this.f1324a = null;
        if (a10.f1277j != -1) {
            int i = 100;
            if (a10.f1277j != 100) {
                a10.f1277j = 100;
                B b10 = a10.f1274f;
                G.n.a();
                if (!b10.f1284g) {
                    E e4 = b10.f1278a;
                    e4.a().execute(new B.b(e4, i));
                }
            }
        }
        B b11 = a10.f1274f;
        G.n.a();
        if (b11.f1284g) {
            return;
        }
        if (!b11.f1285h) {
            b11.b();
        }
        b11.f1282e.b(null);
    }

    public final void c(A a10) {
        G.n.a();
        A2.l.q("only one capture stage is supported.", a10.f1276h.size() == 1);
        A2.l.q("Too many acquire images. Close image to be able to process next.", a() > 0);
        this.f1324a = a10;
        I.j.a(a10.i, new a(a10), u.y());
    }

    public final void d(D.a aVar) {
        boolean z10;
        G.n.a();
        A a10 = this.f1324a;
        if (a10 != null) {
            if (a10.f1269a == aVar.b()) {
                A a11 = this.f1324a;
                K kA = aVar.a();
                B b10 = a11.f1274f;
                G.n.a();
                if (b10.f1284g) {
                    return;
                }
                E e4 = b10.f1278a;
                G.n.a();
                int i = e4.f1294a;
                if (i > 0) {
                    z10 = true;
                    e4.f1294a = i - 1;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    G.n.a();
                    e4.a().execute(new g0(e4, kA));
                }
                b10.a();
                b10.f1282e.d(kA);
                if (z10) {
                    D d10 = b10.f1279b;
                    G.n.a();
                    S.a("TakePictureManager", "Add a new request for retrying.");
                    d10.f1288a.addFirst(e4);
                    d10.b();
                }
            }
        }
    }
}
