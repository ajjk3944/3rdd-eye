package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends FrameLayout implements n.b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f30290a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f30290a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // n.b
    public final void onActionViewCollapsed() {
        this.f30290a.onActionViewCollapsed();
    }

    @Override // n.b
    public final void onActionViewExpanded() {
        this.f30290a.onActionViewExpanded();
    }
}
