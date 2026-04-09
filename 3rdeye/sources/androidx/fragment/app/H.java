package androidx.fragment.app;

import androidx.lifecycle.AbstractC1781n;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<a> f15784a;

    /* renamed from: b, reason: collision with root package name */
    public int f15785b;

    /* renamed from: c, reason: collision with root package name */
    public int f15786c;

    /* renamed from: d, reason: collision with root package name */
    public int f15787d;

    /* renamed from: e, reason: collision with root package name */
    public int f15788e;

    /* renamed from: f, reason: collision with root package name */
    public int f15789f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15790g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15791h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f15792j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f15793k;

    /* renamed from: l, reason: collision with root package name */
    public int f15794l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f15795m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f15796n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<String> f15797o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15798p;

    /* compiled from: FragmentTransaction.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f15799a;

        /* renamed from: b, reason: collision with root package name */
        public ComponentCallbacksC1759l f15800b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15801c;

        /* renamed from: d, reason: collision with root package name */
        public int f15802d;

        /* renamed from: e, reason: collision with root package name */
        public int f15803e;

        /* renamed from: f, reason: collision with root package name */
        public int f15804f;

        /* renamed from: g, reason: collision with root package name */
        public int f15805g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC1781n.b f15806h;
        public AbstractC1781n.b i;

        public a() {
        }

        public a(ComponentCallbacksC1759l componentCallbacksC1759l, int i) {
            this.f15799a = i;
            this.f15800b = componentCallbacksC1759l;
            this.f15801c = false;
            AbstractC1781n.b bVar = AbstractC1781n.b.RESUMED;
            this.f15806h = bVar;
            this.i = bVar;
        }

        public a(ComponentCallbacksC1759l componentCallbacksC1759l, int i, int i10) {
            this.f15799a = i;
            this.f15800b = componentCallbacksC1759l;
            this.f15801c = true;
            AbstractC1781n.b bVar = AbstractC1781n.b.RESUMED;
            this.f15806h = bVar;
            this.i = bVar;
        }
    }

    public final void b(a aVar) {
        this.f15784a.add(aVar);
        aVar.f15802d = this.f15785b;
        aVar.f15803e = this.f15786c;
        aVar.f15804f = this.f15787d;
        aVar.f15805g = this.f15788e;
    }

    public abstract void c(int i, ComponentCallbacksC1759l componentCallbacksC1759l, String str, int i10);

    public final void d(ComponentCallbacksC1759l componentCallbacksC1759l, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c(i, componentCallbacksC1759l, null, 2);
    }

    public abstract C1748a e(ComponentCallbacksC1759l componentCallbacksC1759l, AbstractC1781n.b bVar);
}
