package R;

import G3.C0152f;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public class s0 extends R2.a {

    /* renamed from: e, reason: collision with root package name */
    public final Window f3360e;

    public s0(Window window, C0152f c0152f) {
        this.f3360e = window;
    }

    @Override // R2.a
    public final void D(boolean z6) {
        if (!z6) {
            K(8192);
            return;
        }
        Window window = this.f3360e;
        window.clearFlags(67108864);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void K(int i) {
        View decorView = this.f3360e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // R2.a
    public final boolean t() {
        return (this.f3360e.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
