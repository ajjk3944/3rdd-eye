package e4;

import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e2 extends d2 {
    @Override // com.google.android.gms.internal.measurement.d5
    public final void v(boolean z3) {
        if (!z3) {
            D(16);
            return;
        }
        Window window = this.f22321b;
        window.clearFlags(134217728);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        C(16);
    }
}
