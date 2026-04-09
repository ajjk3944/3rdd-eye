package O2;

import C2.k;
import W2.l;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final B2.a f16918a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f16919b;

    /* renamed from: c, reason: collision with root package name */
    private final List f16920c;

    /* renamed from: d, reason: collision with root package name */
    final com.bumptech.glide.j f16921d;

    /* renamed from: e, reason: collision with root package name */
    private final F2.d f16922e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16923f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16924g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16925h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.i f16926i;

    /* renamed from: j, reason: collision with root package name */
    private a f16927j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16928k;

    /* renamed from: l, reason: collision with root package name */
    private a f16929l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f16930m;

    /* renamed from: n, reason: collision with root package name */
    private k f16931n;

    /* renamed from: o, reason: collision with root package name */
    private a f16932o;

    /* renamed from: p, reason: collision with root package name */
    private int f16933p;

    /* renamed from: q, reason: collision with root package name */
    private int f16934q;

    /* renamed from: r, reason: collision with root package name */
    private int f16935r;

    static class a extends T2.a {

        /* renamed from: d, reason: collision with root package name */
        private final Handler f16936d;

        /* renamed from: e, reason: collision with root package name */
        final int f16937e;

        /* renamed from: f, reason: collision with root package name */
        private final long f16938f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f16939g;

        a(Handler handler, int i10, long j10) {
            this.f16936d = handler;
            this.f16937e = i10;
            this.f16938f = j10;
        }

        Bitmap c() {
            return this.f16939g;
        }

        @Override // T2.d
        public void k(Drawable drawable) {
            this.f16939g = null;
        }

        @Override // T2.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void g(Bitmap bitmap, U2.b bVar) {
            this.f16939g = bitmap;
            this.f16936d.sendMessageAtTime(this.f16936d.obtainMessage(1, this), this.f16938f);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f16921d.p((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, B2.a aVar, int i10, int i11, k kVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), kVar, bitmap);
    }

    private static C2.e g() {
        return new V2.b(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.i i(com.bumptech.glide.j jVar, int i10, int i11) {
        return jVar.m().b(((com.bumptech.glide.request.f) ((com.bumptech.glide.request.f) com.bumptech.glide.request.f.e0(E2.a.f4019b).c0(true)).X(true)).Q(i10, i11));
    }

    private void l() {
        if (!this.f16923f || this.f16924g) {
            return;
        }
        if (this.f16925h) {
            W2.k.a(this.f16932o == null, "Pending target must be null when starting from the first frame");
            this.f16918a.g();
            this.f16925h = false;
        }
        a aVar = this.f16932o;
        if (aVar != null) {
            this.f16932o = null;
            m(aVar);
            return;
        }
        this.f16924g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f16918a.e();
        this.f16918a.c();
        this.f16929l = new a(this.f16919b, this.f16918a.h(), jUptimeMillis);
        this.f16926i.b(com.bumptech.glide.request.f.f0(g())).p0(this.f16918a).l0(this.f16929l);
    }

    private void n() {
        Bitmap bitmap = this.f16930m;
        if (bitmap != null) {
            this.f16922e.c(bitmap);
            this.f16930m = null;
        }
    }

    private void p() {
        if (this.f16923f) {
            return;
        }
        this.f16923f = true;
        this.f16928k = false;
        l();
    }

    private void q() {
        this.f16923f = false;
    }

    void a() {
        this.f16920c.clear();
        n();
        q();
        a aVar = this.f16927j;
        if (aVar != null) {
            this.f16921d.p(aVar);
            this.f16927j = null;
        }
        a aVar2 = this.f16929l;
        if (aVar2 != null) {
            this.f16921d.p(aVar2);
            this.f16929l = null;
        }
        a aVar3 = this.f16932o;
        if (aVar3 != null) {
            this.f16921d.p(aVar3);
            this.f16932o = null;
        }
        this.f16918a.clear();
        this.f16928k = true;
    }

    ByteBuffer b() {
        return this.f16918a.b().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f16927j;
        return aVar != null ? aVar.c() : this.f16930m;
    }

    int d() {
        a aVar = this.f16927j;
        if (aVar != null) {
            return aVar.f16937e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f16930m;
    }

    int f() {
        return this.f16918a.d();
    }

    int h() {
        return this.f16935r;
    }

    int j() {
        return this.f16918a.i() + this.f16933p;
    }

    int k() {
        return this.f16934q;
    }

    void m(a aVar) {
        this.f16924g = false;
        if (this.f16928k) {
            this.f16919b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f16923f) {
            if (this.f16925h) {
                this.f16919b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f16932o = aVar;
                return;
            }
        }
        if (aVar.c() != null) {
            n();
            a aVar2 = this.f16927j;
            this.f16927j = aVar;
            for (int size = this.f16920c.size() - 1; size >= 0; size--) {
                ((b) this.f16920c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f16919b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(k kVar, Bitmap bitmap) {
        this.f16931n = (k) W2.k.d(kVar);
        this.f16930m = (Bitmap) W2.k.d(bitmap);
        this.f16926i = this.f16926i.b(new com.bumptech.glide.request.f().Y(kVar));
        this.f16933p = l.h(bitmap);
        this.f16934q = bitmap.getWidth();
        this.f16935r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f16928k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f16920c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f16920c.isEmpty();
        this.f16920c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f16920c.remove(bVar);
        if (this.f16920c.isEmpty()) {
            q();
        }
    }

    g(F2.d dVar, com.bumptech.glide.j jVar, B2.a aVar, Handler handler, com.bumptech.glide.i iVar, k kVar, Bitmap bitmap) {
        this.f16920c = new ArrayList();
        this.f16921d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f16922e = dVar;
        this.f16919b = handler;
        this.f16926i = iVar;
        this.f16918a = aVar;
        o(kVar, bitmap);
    }
}
