package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View f;
    public final /* synthetic */ int g;
    public final /* synthetic */ mt h;
    public final /* synthetic */ ExpandableBehavior i;

    public lt(ExpandableBehavior expandableBehavior, View view, int i, mt mtVar) {
        this.i = expandableBehavior;
        this.f = view;
        this.g = i;
        this.h = mtVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.i;
        if (expandableBehavior.a == this.g) {
            Object obj = this.h;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).t.f, false);
        }
        return false;
    }
}
