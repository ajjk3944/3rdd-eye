package u3;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class i1 extends vc.e {

    /* renamed from: b, reason: collision with root package name */
    public final Window f23183b;

    public i1(Window window, df.c cVar) {
        this.f23183b = window;
    }

    @Override // vc.e
    public final void N(boolean z10) {
        if (!z10) {
            X(8192);
            return;
        }
        Window window = this.f23183b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void X(int i10) {
        View decorView = this.f23183b.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}
