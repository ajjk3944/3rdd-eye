package je;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13627b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f13626a = i10;
        this.f13627b = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        switch (this.f13626a) {
            case 0:
                j jVar = (j) this.f13627b;
                AutoCompleteTextView autoCompleteTextView = jVar.f13631h;
                if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
                    jVar.f13651d.setImportantForAccessibility(z10 ? 2 : 1);
                    break;
                }
                break;
            default:
                y1.x xVar = (y1.x) this.f13627b;
                xVar.k = xVar.f25795g.getEnabledAccessibilityServiceList(-1);
                break;
        }
    }
}
