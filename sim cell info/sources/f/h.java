package f;

import a0.w;
import a0.x;
import a0.y;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f2608c;

    /* renamed from: d, reason: collision with root package name */
    x f2609d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2610e;

    /* renamed from: b, reason: collision with root package name */
    private long f2607b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final y f2611f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<w> f2606a = new ArrayList<>();

    class a extends y {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2612a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f2613b = 0;

        a() {
        }

        @Override // a0.x
        public void a(View view) {
            int i2 = this.f2613b + 1;
            this.f2613b = i2;
            if (i2 == h.this.f2606a.size()) {
                x xVar = h.this.f2609d;
                if (xVar != null) {
                    xVar.a(null);
                }
                d();
            }
        }

        @Override // a0.y, a0.x
        public void b(View view) {
            if (this.f2612a) {
                return;
            }
            this.f2612a = true;
            x xVar = h.this.f2609d;
            if (xVar != null) {
                xVar.b(null);
            }
        }

        void d() {
            this.f2613b = 0;
            this.f2612a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f2610e) {
            Iterator<w> it = this.f2606a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f2610e = false;
        }
    }

    void b() {
        this.f2610e = false;
    }

    public h c(w wVar) {
        if (!this.f2610e) {
            this.f2606a.add(wVar);
        }
        return this;
    }

    public h d(w wVar, w wVar2) {
        this.f2606a.add(wVar);
        wVar2.h(wVar.c());
        this.f2606a.add(wVar2);
        return this;
    }

    public h e(long j2) {
        if (!this.f2610e) {
            this.f2607b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f2610e) {
            this.f2608c = interpolator;
        }
        return this;
    }

    public h g(x xVar) {
        if (!this.f2610e) {
            this.f2609d = xVar;
        }
        return this;
    }

    public void h() {
        if (this.f2610e) {
            return;
        }
        Iterator<w> it = this.f2606a.iterator();
        while (it.hasNext()) {
            w next = it.next();
            long j2 = this.f2607b;
            if (j2 >= 0) {
                next.d(j2);
            }
            Interpolator interpolator = this.f2608c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f2609d != null) {
                next.f(this.f2611f);
            }
            next.j();
        }
        this.f2610e = true;
    }
}
