package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements n.b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f18664a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f18664a = (CollapsibleActionView) view;
        addView(view);
    }
}
