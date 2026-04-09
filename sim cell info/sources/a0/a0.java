package a0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f180b = new a().a().a().b().c();

    /* renamed from: a, reason: collision with root package name */
    private final i f181a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f182a;

        public a() {
            int i2 = Build.VERSION.SDK_INT;
            this.f182a = i2 >= 29 ? new c() : i2 >= 20 ? new b() : new d();
        }

        public a(a0 a0Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.f182a = i2 >= 29 ? new c(a0Var) : i2 >= 20 ? new b(a0Var) : new d(a0Var);
        }

        public a0 a() {
            return this.f182a.a();
        }

        public a b(t.b bVar) {
            this.f182a.b(bVar);
            return this;
        }
    }

    private static class b extends d {

        /* renamed from: c, reason: collision with root package name */
        private static Field f183c = null;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f184d = false;

        /* renamed from: e, reason: collision with root package name */
        private static Constructor<WindowInsets> f185e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f186f = false;

        /* renamed from: b, reason: collision with root package name */
        private WindowInsets f187b;

        b() {
            this.f187b = c();
        }

        b(a0 a0Var) {
            this.f187b = a0Var.k();
        }

        private static WindowInsets c() {
            if (!f184d) {
                try {
                    f183c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f184d = true;
            }
            Field field = f183c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f186f) {
                try {
                    f185e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f186f = true;
            }
            Constructor<WindowInsets> constructor = f185e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // a0.a0.d
        a0 a() {
            return a0.l(this.f187b);
        }

        @Override // a0.a0.d
        void b(t.b bVar) {
            WindowInsets windowInsets = this.f187b;
            if (windowInsets != null) {
                this.f187b = windowInsets.replaceSystemWindowInsets(bVar.f3309a, bVar.f3310b, bVar.f3311c, bVar.f3312d);
            }
        }
    }

    private static class c extends d {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets.Builder f188b;

        c() {
            this.f188b = new WindowInsets.Builder();
        }

        c(a0 a0Var) {
            WindowInsets windowInsetsK = a0Var.k();
            this.f188b = windowInsetsK != null ? new WindowInsets.Builder(windowInsetsK) : new WindowInsets.Builder();
        }

        @Override // a0.a0.d
        a0 a() {
            return a0.l(this.f188b.build());
        }

        @Override // a0.a0.d
        void b(t.b bVar) {
            this.f188b.setSystemWindowInsets(bVar.b());
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f189a;

        d() {
            this(new a0((a0) null));
        }

        d(a0 a0Var) {
            this.f189a = a0Var;
        }

        a0 a() {
            return this.f189a;
        }

        void b(t.b bVar) {
        }
    }

    private static class e extends i {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets f190b;

        /* renamed from: c, reason: collision with root package name */
        private t.b f191c;

        e(a0 a0Var, e eVar) {
            this(a0Var, new WindowInsets(eVar.f190b));
        }

        e(a0 a0Var, WindowInsets windowInsets) {
            super(a0Var);
            this.f191c = null;
            this.f190b = windowInsets;
        }

        @Override // a0.a0.i
        final t.b f() {
            if (this.f191c == null) {
                this.f191c = t.b.a(this.f190b.getSystemWindowInsetLeft(), this.f190b.getSystemWindowInsetTop(), this.f190b.getSystemWindowInsetRight(), this.f190b.getSystemWindowInsetBottom());
            }
            return this.f191c;
        }

        @Override // a0.a0.i
        boolean h() {
            return this.f190b.isRound();
        }
    }

    private static class f extends e {

        /* renamed from: d, reason: collision with root package name */
        private t.b f192d;

        f(a0 a0Var, f fVar) {
            super(a0Var, fVar);
            this.f192d = null;
        }

        f(a0 a0Var, WindowInsets windowInsets) {
            super(a0Var, windowInsets);
            this.f192d = null;
        }

        @Override // a0.a0.i
        a0 b() {
            return a0.l(this.f190b.consumeStableInsets());
        }

        @Override // a0.a0.i
        a0 c() {
            return a0.l(this.f190b.consumeSystemWindowInsets());
        }

        @Override // a0.a0.i
        final t.b e() {
            if (this.f192d == null) {
                this.f192d = t.b.a(this.f190b.getStableInsetLeft(), this.f190b.getStableInsetTop(), this.f190b.getStableInsetRight(), this.f190b.getStableInsetBottom());
            }
            return this.f192d;
        }

        @Override // a0.a0.i
        boolean g() {
            return this.f190b.isConsumed();
        }
    }

    private static class g extends f {
        g(a0 a0Var, g gVar) {
            super(a0Var, gVar);
        }

        g(a0 a0Var, WindowInsets windowInsets) {
            super(a0Var, windowInsets);
        }

        @Override // a0.a0.i
        a0 a() {
            return a0.l(this.f190b.consumeDisplayCutout());
        }

        @Override // a0.a0.i
        a0.c d() {
            return a0.c.a(this.f190b.getDisplayCutout());
        }

        @Override // a0.a0.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return b0.a(this.f190b, ((g) obj).f190b);
            }
            return false;
        }

        @Override // a0.a0.i
        public int hashCode() {
            return this.f190b.hashCode();
        }
    }

    private static class h extends g {

        /* renamed from: e, reason: collision with root package name */
        private t.b f193e;

        /* renamed from: f, reason: collision with root package name */
        private t.b f194f;

        /* renamed from: g, reason: collision with root package name */
        private t.b f195g;

        h(a0 a0Var, h hVar) {
            super(a0Var, hVar);
            this.f193e = null;
            this.f194f = null;
            this.f195g = null;
        }

        h(a0 a0Var, WindowInsets windowInsets) {
            super(a0Var, windowInsets);
            this.f193e = null;
            this.f194f = null;
            this.f195g = null;
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        final a0 f196a;

        i(a0 a0Var) {
            this.f196a = a0Var;
        }

        a0 a() {
            return this.f196a;
        }

        a0 b() {
            return this.f196a;
        }

        a0 c() {
            return this.f196a;
        }

        a0.c d() {
            return null;
        }

        t.b e() {
            return t.b.f3308e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return h() == iVar.h() && g() == iVar.g() && z.c.a(f(), iVar.f()) && z.c.a(e(), iVar.e()) && z.c.a(d(), iVar.d());
        }

        t.b f() {
            return t.b.f3308e;
        }

        boolean g() {
            return false;
        }

        boolean h() {
            return false;
        }

        public int hashCode() {
            return z.c.b(Boolean.valueOf(h()), Boolean.valueOf(g()), f(), e(), d());
        }
    }

    public a0(a0 a0Var) {
        i iVar;
        i eVar;
        if (a0Var != null) {
            i iVar2 = a0Var.f181a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && (iVar2 instanceof h)) {
                eVar = new h(this, (h) iVar2);
            } else if (i2 >= 28 && (iVar2 instanceof g)) {
                eVar = new g(this, (g) iVar2);
            } else if (i2 >= 21 && (iVar2 instanceof f)) {
                eVar = new f(this, (f) iVar2);
            } else if (i2 < 20 || !(iVar2 instanceof e)) {
                iVar = new i(this);
            } else {
                eVar = new e(this, (e) iVar2);
            }
            this.f181a = eVar;
            return;
        }
        iVar = new i(this);
        this.f181a = iVar;
    }

    private a0(WindowInsets windowInsets) {
        i eVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            eVar = new h(this, windowInsets);
        } else if (i2 >= 28) {
            eVar = new g(this, windowInsets);
        } else if (i2 >= 21) {
            eVar = new f(this, windowInsets);
        } else {
            if (i2 < 20) {
                this.f181a = new i(this);
                return;
            }
            eVar = new e(this, windowInsets);
        }
        this.f181a = eVar;
    }

    public static a0 l(WindowInsets windowInsets) {
        return new a0((WindowInsets) z.g.b(windowInsets));
    }

    public a0 a() {
        return this.f181a.a();
    }

    public a0 b() {
        return this.f181a.b();
    }

    public a0 c() {
        return this.f181a.c();
    }

    public int d() {
        return h().f3312d;
    }

    public int e() {
        return h().f3309a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return z.c.a(this.f181a, ((a0) obj).f181a);
        }
        return false;
    }

    public int f() {
        return h().f3311c;
    }

    public int g() {
        return h().f3310b;
    }

    public t.b h() {
        return this.f181a.f();
    }

    public int hashCode() {
        i iVar = this.f181a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public boolean i() {
        return this.f181a.g();
    }

    @Deprecated
    public a0 j(int i2, int i3, int i4, int i5) {
        return new a(this).b(t.b.a(i2, i3, i4, i5)).a();
    }

    public WindowInsets k() {
        i iVar = this.f181a;
        if (iVar instanceof e) {
            return ((e) iVar).f190b;
        }
        return null;
    }
}
