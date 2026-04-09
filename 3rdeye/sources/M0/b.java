package M0;

import L0.I;
import L0.S;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p4.C5457g;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final D7.c f4120a;

    public b(D7.c cVar) {
        this.f4120a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4120a.equals(((b) obj).f4120a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4120a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        C5457g c5457g = (C5457g) this.f4120a.f1075c;
        AutoCompleteTextView autoCompleteTextView = c5457g.f45138h;
        if (autoCompleteTextView == null || B7.d.r(autoCompleteTextView)) {
            return;
        }
        int i = z10 ? 2 : 1;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        c5457g.f45151d.setImportantForAccessibility(i);
    }
}
