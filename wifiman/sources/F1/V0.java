package F1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    private final g f5670a;

    private static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f5671a;

        /* renamed from: b, reason: collision with root package name */
        private final K f5672b;

        a(Window window, K k10) {
            this.f5671a = window;
            this.f5672b = k10;
        }

        private void f(int i10) {
            if (i10 == 1) {
                g(4);
                h(1024);
            } else if (i10 == 2) {
                g(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f5672b.b();
            }
        }

        @Override // F1.V0.g
        void c(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    f(i11);
                }
            }
        }

        protected void d(int i10) {
            View decorView = this.f5671a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void e(int i10) {
            this.f5671a.addFlags(i10);
        }

        protected void g(int i10) {
            View decorView = this.f5671a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void h(int i10) {
            this.f5671a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, K k10) {
            super(window, k10);
        }

        @Override // F1.V0.g
        public void b(boolean z10) {
            if (!z10) {
                g(8192);
                return;
            }
            h(67108864);
            e(PduHandle.NONE);
            d(8192);
        }
    }

    private static class c extends b {
        c(Window window, K k10) {
            super(window, k10);
        }

        @Override // F1.V0.g
        public void a(boolean z10) {
            if (!z10) {
                g(16);
                return;
            }
            h(134217728);
            e(PduHandle.NONE);
            d(16);
        }
    }

    private static class e extends d {
        e(Window window, V0 v02, K k10) {
            super(window, v02, k10);
        }

        e(WindowInsetsController windowInsetsController, V0 v02, K k10) {
            super(windowInsetsController, v02, k10);
        }
    }

    private static class f extends e {
        f(Window window, V0 v02, K k10) {
            super(window, v02, k10);
        }

        f(WindowInsetsController windowInsetsController, V0 v02, K k10) {
            super(windowInsetsController, v02, k10);
        }
    }

    private static class g {
        g() {
        }

        public abstract void a(boolean z10);

        public abstract void b(boolean z10);

        abstract void c(int i10);
    }

    private V0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f5670a = new f(windowInsetsController, this, new K(windowInsetsController));
        } else {
            this.f5670a = new d(windowInsetsController, this, new K(windowInsetsController));
        }
    }

    public static V0 d(WindowInsetsController windowInsetsController) {
        return new V0(windowInsetsController);
    }

    public void a(boolean z10) {
        this.f5670a.a(z10);
    }

    public void b(boolean z10) {
        this.f5670a.b(z10);
    }

    public void c(int i10) {
        this.f5670a.c(i10);
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        final V0 f5673a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f5674b;

        /* renamed from: c, reason: collision with root package name */
        final K f5675c;

        /* renamed from: d, reason: collision with root package name */
        private final o.V f5676d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f5677e;

        d(Window window, V0 v02, K k10) {
            this(window.getInsetsController(), v02, k10);
            this.f5677e = window;
        }

        @Override // F1.V0.g
        public void a(boolean z10) {
            if (z10) {
                if (this.f5677e != null) {
                    d(16);
                }
                this.f5674b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f5677e != null) {
                    e(16);
                }
                this.f5674b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // F1.V0.g
        public void b(boolean z10) {
            if (z10) {
                if (this.f5677e != null) {
                    d(8192);
                }
                this.f5674b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f5677e != null) {
                    e(8192);
                }
                this.f5674b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // F1.V0.g
        void c(int i10) {
            if ((i10 & 8) != 0) {
                this.f5675c.b();
            }
            this.f5674b.show(i10 & (-9));
        }

        protected void d(int i10) {
            View decorView = this.f5677e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void e(int i10) {
            View decorView = this.f5677e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, V0 v02, K k10) {
            this.f5676d = new o.V();
            this.f5674b = windowInsetsController;
            this.f5673a = v02;
            this.f5675c = k10;
        }
    }

    public V0(Window window, View view) {
        K k10 = new K(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f5670a = new f(window, this, k10);
        } else if (i10 >= 30) {
            this.f5670a = new d(window, this, k10);
        } else {
            this.f5670a = new c(window, k10);
        }
    }
}
