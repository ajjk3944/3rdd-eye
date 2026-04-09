package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final e f2749a;

    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Window f2750a;

        /* renamed from: b, reason: collision with root package name */
        public final n0 f2751b;

        public a(Window window, n0 n0Var) {
            this.f2750a = window;
            this.f2751b = n0Var;
        }

        @Override // androidx.core.view.t2.e
        public void a(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    f(i11);
                }
            }
        }

        @Override // androidx.core.view.t2.e
        public void d(int i10) {
            if (i10 == 0) {
                j(6144);
                return;
            }
            if (i10 == 1) {
                j(4096);
                g(KEYRecord.Flags.FLAG4);
            } else {
                if (i10 != 2) {
                    return;
                }
                j(KEYRecord.Flags.FLAG4);
                g(4096);
            }
        }

        @Override // androidx.core.view.t2.e
        public void e(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    i(i11);
                }
            }
        }

        public final void f(int i10) {
            if (i10 == 1) {
                g(4);
            } else if (i10 == 2) {
                g(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f2751b.a();
            }
        }

        public void g(int i10) {
            View decorView = this.f2750a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void h(int i10) {
            this.f2750a.addFlags(i10);
        }

        public final void i(int i10) {
            if (i10 == 1) {
                j(4);
                k(1024);
            } else if (i10 == 2) {
                j(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f2751b.b();
            }
        }

        public void j(int i10) {
            View decorView = this.f2750a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public void k(int i10) {
            this.f2750a.clearFlags(i10);
        }
    }

    public static class b extends a {
        public b(Window window, n0 n0Var) {
            super(window, n0Var);
        }

        @Override // androidx.core.view.t2.e
        public void c(boolean z10) {
            if (!z10) {
                j(8192);
                return;
            }
            k(67108864);
            h(Integer.MIN_VALUE);
            g(8192);
        }
    }

    public static class c extends b {
        public c(Window window, n0 n0Var) {
            super(window, n0Var);
        }

        @Override // androidx.core.view.t2.e
        public void b(boolean z10) {
            if (!z10) {
                j(16);
                return;
            }
            k(134217728);
            h(Integer.MIN_VALUE);
            g(16);
        }
    }

    public static class e {
        public abstract void a(int i10);

        public void b(boolean z10) {
        }

        public abstract void c(boolean z10);

        public abstract void d(int i10);

        public abstract void e(int i10);
    }

    public t2(WindowInsetsController windowInsetsController) {
        this.f2749a = new d(windowInsetsController, this, new n0(windowInsetsController));
    }

    public static t2 f(WindowInsetsController windowInsetsController) {
        return new t2(windowInsetsController);
    }

    public void a(int i10) {
        this.f2749a.a(i10);
    }

    public void b(boolean z10) {
        this.f2749a.b(z10);
    }

    public void c(boolean z10) {
        this.f2749a.c(z10);
    }

    public void d(int i10) {
        this.f2749a.d(i10);
    }

    public void e(int i10) {
        this.f2749a.e(i10);
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final t2 f2752a;

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f2753b;

        /* renamed from: c, reason: collision with root package name */
        public final n0 f2754c;

        /* renamed from: d, reason: collision with root package name */
        public final r.k f2755d;

        /* renamed from: e, reason: collision with root package name */
        public Window f2756e;

        public d(Window window, t2 t2Var, n0 n0Var) {
            this(window.getInsetsController(), t2Var, n0Var);
            this.f2756e = window;
        }

        @Override // androidx.core.view.t2.e
        public void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f2754c.a();
            }
            this.f2753b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.t2.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f2756e != null) {
                    f(16);
                }
                this.f2753b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f2756e != null) {
                    g(16);
                }
                this.f2753b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.t2.e
        public void c(boolean z10) {
            if (z10) {
                if (this.f2756e != null) {
                    f(8192);
                }
                this.f2753b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f2756e != null) {
                    g(8192);
                }
                this.f2753b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.t2.e
        public void d(int i10) {
            this.f2753b.setSystemBarsBehavior(i10);
        }

        @Override // androidx.core.view.t2.e
        public void e(int i10) {
            if ((i10 & 8) != 0) {
                this.f2754c.b();
            }
            this.f2753b.show(i10 & (-9));
        }

        public void f(int i10) {
            View decorView = this.f2756e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void g(int i10) {
            View decorView = this.f2756e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, t2 t2Var, n0 n0Var) {
            this.f2755d = new r.k();
            this.f2753b = windowInsetsController;
            this.f2752a = t2Var;
            this.f2754c = n0Var;
        }
    }

    public t2(Window window, View view) {
        n0 n0Var = new n0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2749a = new d(window, this, n0Var);
        } else if (i10 >= 26) {
            this.f2749a = new c(window, n0Var);
        } else {
            this.f2749a = new b(window, n0Var);
        }
    }
}
