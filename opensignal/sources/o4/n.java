package o4;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n implements androidx.lifecycle.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18822a;

    public n(p pVar) {
        this.f18822a = pVar;
    }

    @Override // androidx.lifecycle.e0
    public final void b(Object obj) {
        if (((androidx.lifecycle.v) obj) != null) {
            p pVar = this.f18822a;
            if (pVar.D0) {
                View viewY = pVar.Y();
                if (viewY.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (pVar.H0 != null) {
                    if (androidx.fragment.app.d.K(3)) {
                        Objects.toString(pVar.H0);
                    }
                    pVar.H0.setContentView(viewY);
                }
            }
        }
    }
}
