package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ud0 extends FrameLayout implements wf {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public ud0(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.wf
    public final void onActionViewCollapsed() {
        this.f.onActionViewCollapsed();
    }

    @Override // defpackage.wf
    public final void onActionViewExpanded() {
        this.f.onActionViewExpanded();
    }
}
