package u3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class k1 extends vc.e {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f23190b;

    /* renamed from: c, reason: collision with root package name */
    public Window f23191c;

    public k1(WindowInsetsController windowInsetsController, df.c cVar) {
        this.f23190b = windowInsetsController;
    }

    @Override // vc.e
    public final void M(boolean z10) {
        Window window = this.f23191c;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f23190b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f23190b.setSystemBarsAppearance(0, 16);
    }

    @Override // vc.e
    public final void N(boolean z10) {
        Window window = this.f23191c;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f23190b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f23190b.setSystemBarsAppearance(0, 8);
    }
}
