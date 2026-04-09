package J1;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class b {
    public static final ViewParent a(View view) {
        AbstractC6492s.i(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(a.f9725a);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
