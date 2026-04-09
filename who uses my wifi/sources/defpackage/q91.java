package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q91 extends bd2 {
    public final WindowInsetsController q;
    public Window r;

    public q91(WindowInsetsController windowInsetsController, ts0 ts0Var) {
        this.q = windowInsetsController;
    }

    @Override // defpackage.bd2
    public final boolean n() {
        this.q.setSystemBarsAppearance(0, 0);
        return (this.q.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.bd2
    public final void u(boolean z) {
        Window window = this.r;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.q.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.q.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.bd2
    public final void v(boolean z) {
        Window window = this.r;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.q.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.q.setSystemBarsAppearance(0, 8);
    }
}
