package g5;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;

/* loaded from: classes2.dex */
public class n extends l {

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (n.this.f21200e.isEmpty()) {
                return;
            }
            outline.setPath(n.this.f21200e);
        }
    }

    public n(View view) {
        k(view);
    }

    @DoNotInline
    private void k(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // g5.l
    public void b(View view) {
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // g5.l
    public boolean i() {
        return this.f21196a;
    }
}
