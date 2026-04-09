package N3;

import L0.I;
import L0.S;
import M0.i;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4668a;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4668a = swipeDismissBehavior;
    }

    @Override // M0.i
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f4668a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        boolean z10 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f22501d;
        view.offsetLeftAndRight((!(i == 0 && z10) && (i != 1 || z10)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }
}
