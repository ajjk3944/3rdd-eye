package androidx.appcompat.view;

import F1.AbstractC2749g0;
import F1.C2745e0;
import F1.InterfaceC2747f0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f26737c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC2747f0 f26738d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26739e;

    /* renamed from: b, reason: collision with root package name */
    private long f26736b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2749g0 f26740f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f26735a = new ArrayList();

    class a extends AbstractC2749g0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26741a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f26742b = 0;

        a() {
        }

        @Override // F1.InterfaceC2747f0
        public void b(View view) {
            int i10 = this.f26742b + 1;
            this.f26742b = i10;
            if (i10 == h.this.f26735a.size()) {
                InterfaceC2747f0 interfaceC2747f0 = h.this.f26738d;
                if (interfaceC2747f0 != null) {
                    interfaceC2747f0.b(null);
                }
                d();
            }
        }

        @Override // F1.AbstractC2749g0, F1.InterfaceC2747f0
        public void c(View view) {
            if (this.f26741a) {
                return;
            }
            this.f26741a = true;
            InterfaceC2747f0 interfaceC2747f0 = h.this.f26738d;
            if (interfaceC2747f0 != null) {
                interfaceC2747f0.c(null);
            }
        }

        void d() {
            this.f26742b = 0;
            this.f26741a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f26739e) {
            Iterator it = this.f26735a.iterator();
            while (it.hasNext()) {
                ((C2745e0) it.next()).c();
            }
            this.f26739e = false;
        }
    }

    void b() {
        this.f26739e = false;
    }

    public h c(C2745e0 c2745e0) {
        if (!this.f26739e) {
            this.f26735a.add(c2745e0);
        }
        return this;
    }

    public h d(C2745e0 c2745e0, C2745e0 c2745e02) {
        this.f26735a.add(c2745e0);
        c2745e02.j(c2745e0.d());
        this.f26735a.add(c2745e02);
        return this;
    }

    public h e(long j10) {
        if (!this.f26739e) {
            this.f26736b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f26739e) {
            this.f26737c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC2747f0 interfaceC2747f0) {
        if (!this.f26739e) {
            this.f26738d = interfaceC2747f0;
        }
        return this;
    }

    public void h() {
        if (this.f26739e) {
            return;
        }
        Iterator it = this.f26735a.iterator();
        while (it.hasNext()) {
            C2745e0 c2745e0 = (C2745e0) it.next();
            long j10 = this.f26736b;
            if (j10 >= 0) {
                c2745e0.f(j10);
            }
            Interpolator interpolator = this.f26737c;
            if (interpolator != null) {
                c2745e0.g(interpolator);
            }
            if (this.f26738d != null) {
                c2745e0.h(this.f26740f);
            }
            c2745e0.l();
        }
        this.f26739e = true;
    }
}
