package u3;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class j1 extends i1 {
    @Override // vc.e
    public final void M(boolean z10) {
        if (!z10) {
            X(16);
            return;
        }
        Window window = this.f23183b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
