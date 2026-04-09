package R;

import G3.C0152f;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class u0 extends R2.a {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f3362e;

    /* renamed from: f, reason: collision with root package name */
    public final Window f3363f;

    public u0(Window window, C0152f c0152f) {
        this.f3362e = window.getInsetsController();
        this.f3363f = window;
    }

    @Override // R2.a
    public final void C(boolean z6) {
        Window window = this.f3363f;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3362e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3362e.setSystemBarsAppearance(0, 16);
    }

    @Override // R2.a
    public final void D(boolean z6) {
        Window window = this.f3363f;
        if (z6) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3362e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3362e.setSystemBarsAppearance(0, 8);
    }

    @Override // R2.a
    public boolean t() {
        this.f3362e.setSystemBarsAppearance(0, 0);
        return (this.f3362e.getSystemBarsAppearance() & 8) != 0;
    }
}
