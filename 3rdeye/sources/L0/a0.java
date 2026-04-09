package L0;

import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class a0 extends Z {
    @Override // T1.B
    public final void x(boolean z10) {
        if (!z10) {
            F(16);
            return;
        }
        Window window = this.f3880b;
        window.clearFlags(134217728);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        E(16);
    }
}
