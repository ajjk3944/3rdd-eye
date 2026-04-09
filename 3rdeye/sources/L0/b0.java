package L0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import m0.C5316i;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class b0 extends T1.B {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f3887b;

    /* renamed from: c, reason: collision with root package name */
    public Window f3888c;

    public b0(WindowInsetsController windowInsetsController, C0792x c0792x) {
        new C5316i();
        this.f3887b = windowInsetsController;
    }

    @Override // T1.B
    public final void o(int i) {
        this.f3887b.hide(i & (-9));
    }

    @Override // T1.B
    public final void x(boolean z10) {
        Window window = this.f3888c;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3887b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3887b.setSystemBarsAppearance(0, 16);
    }

    @Override // T1.B
    public final void y(boolean z10) {
        Window window = this.f3888c;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3887b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3887b.setSystemBarsAppearance(0, 8);
    }

    @Override // T1.B
    public final void z() {
        this.f3887b.setSystemBarsBehavior(2);
    }
}
