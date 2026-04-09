package L0;

import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public class Z extends Y {
    @Override // T1.B
    public final void y(boolean z10) {
        if (!z10) {
            F(8192);
            return;
        }
        Window window = this.f3880b;
        window.clearFlags(67108864);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        E(8192);
    }
}
