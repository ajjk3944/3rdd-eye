package id;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3.b f11328c;

    public /* synthetic */ a(e3.b bVar, View view, int i10) {
        this.f11326a = i10;
        this.f11328c = bVar;
        this.f11327b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        int i10 = this.f11326a;
        View view = this.f11327b;
        e3.b bVar = this.f11328c;
        switch (i10) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) bVar;
                int i11 = HideBottomViewOnScrollBehavior.f5476l;
                if (z10 && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.s(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) bVar;
                if (z10 && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.t(view);
                    break;
                }
                break;
        }
    }
}
