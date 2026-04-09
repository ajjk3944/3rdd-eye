package h3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC2362a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f20475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E.b f20476c;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC2362a(E.b bVar, View view, int i) {
        this.f20474a = i;
        this.f20476c = bVar;
        this.f20475b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z6) {
        switch (this.f20474a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f20476c;
                if (z6 && hideBottomViewOnScrollBehavior.f18094j == 1) {
                    hideBottomViewOnScrollBehavior.w(this.f20475b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f20476c;
                if (z6 && hideViewOnScrollBehavior.f18104j == 1) {
                    hideViewOnScrollBehavior.x(this.f20475b);
                    break;
                }
                break;
        }
    }
}
