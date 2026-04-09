package L0;

import android.view.View;
import android.view.Window;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public class Y extends T1.B {

    /* renamed from: b, reason: collision with root package name */
    public final Window f3880b;

    /* renamed from: c, reason: collision with root package name */
    public final C0792x f3881c;

    public Y(Window window, C0792x c0792x) {
        this.f3880b = window;
        this.f3881c = c0792x;
    }

    public final void E(int i) {
        View decorView = this.f3880b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void F(int i) {
        View decorView = this.f3880b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // T1.B
    public final void o(int i) {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i & i10) != 0) {
                if (i10 == 1) {
                    E(4);
                } else if (i10 == 2) {
                    E(2);
                } else if (i10 == 8) {
                    this.f3881c.f3936a.a();
                }
            }
        }
    }

    @Override // T1.B
    public final void z() {
        F(2048);
        E(4096);
    }
}
