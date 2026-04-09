package l2;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import i2.C4444d;
import i2.EnumC4441a;
import java.util.ArrayList;
import java.util.List;
import v2.C5673a;

/* compiled from: BaseKeyframeAnimation.java */
/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5268a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    public final c<K> f43688c;

    /* renamed from: e, reason: collision with root package name */
    public B0.f f43690e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f43686a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f43687b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f43689d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public A f43691f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f43692g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f43693h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: l2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0489a {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: l2.a$b */
    public static final class b<T> implements c<T> {
        @Override // l2.AbstractC5268a.c
        public final boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // l2.AbstractC5268a.c
        public final C5673a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // l2.AbstractC5268a.c
        public final boolean c(float f10) {
            return false;
        }

        @Override // l2.AbstractC5268a.c
        public final float d() {
            return 1.0f;
        }

        @Override // l2.AbstractC5268a.c
        public final float e() {
            return 0.0f;
        }

        @Override // l2.AbstractC5268a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: l2.a$c */
    public interface c<T> {
        boolean a(float f10);

        C5673a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: l2.a$d */
    public static final class d<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends C5673a<T>> f43694a;

        /* renamed from: c, reason: collision with root package name */
        public C5673a<T> f43696c = null;

        /* renamed from: d, reason: collision with root package name */
        public float f43697d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        public C5673a<T> f43695b = f(0.0f);

        public d(List<? extends C5673a<T>> list) {
            this.f43694a = list;
        }

        @Override // l2.AbstractC5268a.c
        public final boolean a(float f10) {
            C5673a<T> c5673a = this.f43696c;
            C5673a<T> c5673a2 = this.f43695b;
            if (c5673a == c5673a2 && this.f43697d == f10) {
                return true;
            }
            this.f43696c = c5673a2;
            this.f43697d = f10;
            return false;
        }

        @Override // l2.AbstractC5268a.c
        public final C5673a<T> b() {
            return this.f43695b;
        }

        @Override // l2.AbstractC5268a.c
        public final boolean c(float f10) {
            C5673a<T> c5673a = this.f43695b;
            if (f10 >= c5673a.b() && f10 < c5673a.a()) {
                return !this.f43695b.c();
            }
            this.f43695b = f(f10);
            return true;
        }

        @Override // l2.AbstractC5268a.c
        public final float d() {
            return this.f43694a.get(r0.size() - 1).a();
        }

        @Override // l2.AbstractC5268a.c
        public final float e() {
            return this.f43694a.get(0).b();
        }

        public final C5673a<T> f(float f10) {
            List<? extends C5673a<T>> list = this.f43694a;
            C5673a<T> c5673a = list.get(list.size() - 1);
            if (f10 >= c5673a.b()) {
                return c5673a;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                C5673a<T> c5673a2 = list.get(size);
                if (this.f43695b != c5673a2 && f10 >= c5673a2.b() && f10 < c5673a2.a()) {
                    return c5673a2;
                }
            }
            return list.get(0);
        }

        @Override // l2.AbstractC5268a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: l2.a$e */
    public static final class e<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final C5673a<T> f43698a;

        /* renamed from: b, reason: collision with root package name */
        public float f43699b = -1.0f;

        public e(List<? extends C5673a<T>> list) {
            this.f43698a = list.get(0);
        }

        @Override // l2.AbstractC5268a.c
        public final boolean a(float f10) {
            if (this.f43699b == f10) {
                return true;
            }
            this.f43699b = f10;
            return false;
        }

        @Override // l2.AbstractC5268a.c
        public final C5673a<T> b() {
            return this.f43698a;
        }

        @Override // l2.AbstractC5268a.c
        public final boolean c(float f10) {
            return !this.f43698a.c();
        }

        @Override // l2.AbstractC5268a.c
        public final float d() {
            return this.f43698a.a();
        }

        @Override // l2.AbstractC5268a.c
        public final float e() {
            return this.f43698a.b();
        }

        @Override // l2.AbstractC5268a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public AbstractC5268a(List<? extends C5673a<K>> list) {
        c eVar;
        if (list.isEmpty()) {
            eVar = new b();
        } else {
            eVar = list.size() == 1 ? new e(list) : new d(list);
        }
        this.f43688c = eVar;
    }

    public final void a(InterfaceC0489a interfaceC0489a) {
        this.f43686a.add(interfaceC0489a);
    }

    public final C5673a<K> b() {
        EnumC4441a enumC4441a = C4444d.f38338a;
        return this.f43688c.b();
    }

    @SuppressLint({"Range"})
    public float c() {
        if (this.f43693h == -1.0f) {
            this.f43693h = this.f43688c.d();
        }
        return this.f43693h;
    }

    public final float d() {
        Interpolator interpolator;
        C5673a<K> c5673aB = b();
        if (c5673aB == null || c5673aB.c() || (interpolator = c5673aB.f47014d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.f43687b) {
            return 0.0f;
        }
        C5673a<K> c5673aB = b();
        if (c5673aB.c()) {
            return 0.0f;
        }
        return (this.f43689d - c5673aB.b()) / (c5673aB.a() - c5673aB.b());
    }

    public A f() {
        Interpolator interpolator;
        float fE = e();
        if (this.f43690e == null && this.f43688c.a(fE)) {
            return this.f43691f;
        }
        C5673a<K> c5673aB = b();
        Interpolator interpolator2 = c5673aB.f47015e;
        A aG = (interpolator2 == null || (interpolator = c5673aB.f47016f) == null) ? g(c5673aB, d()) : h(c5673aB, fE, interpolator2.getInterpolation(fE), interpolator.getInterpolation(fE));
        this.f43691f = aG;
        return aG;
    }

    public abstract A g(C5673a<K> c5673a, float f10);

    public A h(C5673a<K> c5673a, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        EnumC4441a enumC4441a = C4444d.f38338a;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f43686a;
            if (i >= arrayList.size()) {
                EnumC4441a enumC4441a2 = C4444d.f38338a;
                return;
            } else {
                ((InterfaceC0489a) arrayList.get(i)).a();
                i++;
            }
        }
    }

    public void j(float f10) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        c<K> cVar = this.f43688c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f43692g == -1.0f) {
            this.f43692g = cVar.e();
        }
        float f11 = this.f43692g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f43692g = cVar.e();
            }
            f10 = this.f43692g;
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f43689d) {
            return;
        }
        this.f43689d = f10;
        if (cVar.c(f10)) {
            i();
        }
    }

    public final void k(B0.f fVar) {
        B0.f fVar2 = this.f43690e;
        if (fVar2 != null) {
            fVar2.getClass();
        }
        this.f43690e = fVar;
    }
}
