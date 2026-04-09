package h;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.g1;
import androidx.core.view.h1;
import androidx.core.view.i1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f21370c;

    /* renamed from: d, reason: collision with root package name */
    public h1 f21371d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21372e;

    /* renamed from: b, reason: collision with root package name */
    public long f21369b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f21373f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21368a = new ArrayList();

    public class a extends i1 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21374a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f21375b = 0;

        public a() {
        }

        @Override // androidx.core.view.h1
        public void b(View view) {
            int i10 = this.f21375b + 1;
            this.f21375b = i10;
            if (i10 == h.this.f21368a.size()) {
                h1 h1Var = h.this.f21371d;
                if (h1Var != null) {
                    h1Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public void c(View view) {
            if (this.f21374a) {
                return;
            }
            this.f21374a = true;
            h1 h1Var = h.this.f21371d;
            if (h1Var != null) {
                h1Var.c(null);
            }
        }

        public void d() {
            this.f21375b = 0;
            this.f21374a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f21372e) {
            ArrayList arrayList = this.f21368a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((g1) obj).c();
            }
            this.f21372e = false;
        }
    }

    public void b() {
        this.f21372e = false;
    }

    public h c(g1 g1Var) {
        if (!this.f21372e) {
            this.f21368a.add(g1Var);
        }
        return this;
    }

    public h d(g1 g1Var, g1 g1Var2) {
        this.f21368a.add(g1Var);
        g1Var2.i(g1Var.d());
        this.f21368a.add(g1Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f21372e) {
            this.f21369b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f21372e) {
            this.f21370c = interpolator;
        }
        return this;
    }

    public h g(h1 h1Var) {
        if (!this.f21372e) {
            this.f21371d = h1Var;
        }
        return this;
    }

    public void h() {
        if (this.f21372e) {
            return;
        }
        ArrayList arrayList = this.f21368a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g1 g1Var = (g1) obj;
            long j10 = this.f21369b;
            if (j10 >= 0) {
                g1Var.e(j10);
            }
            Interpolator interpolator = this.f21370c;
            if (interpolator != null) {
                g1Var.f(interpolator);
            }
            if (this.f21371d != null) {
                g1Var.g(this.f21373f);
            }
            g1Var.k();
        }
        this.f21372e = true;
    }
}
