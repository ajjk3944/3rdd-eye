package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p91 extends bd2 {
    public final Window q;

    public p91(Window window, ts0 ts0Var) {
        this.q = window;
    }

    public final void c0(int i) {
        View decorView = this.q.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.bd2
    public final boolean n() {
        return (this.q.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.bd2
    public final void u(boolean z) {
        if (!z) {
            c0(16);
            return;
        }
        Window window = this.q;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // defpackage.bd2
    public final void v(boolean z) {
        if (!z) {
            c0(8192);
            return;
        }
        Window window = this.q;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
