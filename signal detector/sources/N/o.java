package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class o extends FrameLayout implements m.b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f22122a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view) {
        super(view.getContext());
        this.f22122a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // m.b
    public final void onActionViewCollapsed() {
        this.f22122a.onActionViewCollapsed();
    }

    @Override // m.b
    public final void onActionViewExpanded() {
        this.f22122a.onActionViewExpanded();
    }
}
