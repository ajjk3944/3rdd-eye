package R;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class t0 extends s0 {
    @Override // R2.a
    public final void C(boolean z6) {
        if (!z6) {
            K(16);
            return;
        }
        Window window = this.f3360e;
        window.clearFlags(134217728);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
