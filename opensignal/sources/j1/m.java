package j1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
public final class m extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13131a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f13131a) {
            case 0:
                if (!(view instanceof n) || (outline2 = ((n) view).f13136x) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                br.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                w.g.p(view);
                throw null;
        }
    }
}
