package d4;

import L0.I;
import L0.S;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class m implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.c.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
