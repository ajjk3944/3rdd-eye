package a0;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class u {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(p.b.M);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && s.w(viewGroup) == null) ? false : true;
    }
}
