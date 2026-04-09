package L0;

import O6.C1482h;
import android.view.View;

/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class N {
    public static final View a(C1482h c1482h) {
        View childAt = c1482h.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: 0, Size: " + c1482h.getChildCount());
    }
}
