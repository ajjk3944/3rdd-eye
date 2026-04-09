package mc;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f29025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.b f29026c;

    public /* synthetic */ a(p3.b bVar, View view, int i4) {
        this.f29024a = i4;
        this.f29026c = bVar;
        this.f29025b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        switch (this.f29024a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f29026c;
                if (z3 && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.w(this.f29025b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f29026c;
                if (z3 && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.x(this.f29025b);
                    break;
                }
                break;
        }
    }
}
