package androidx.compose.ui.platform;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    public static final L1 f29246a = new L1();

    private L1() {
    }

    public final void a(r rVar) {
        ViewParent parent = rVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(rVar, rVar);
        }
    }
}
