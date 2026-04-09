package o;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import j$.util.Objects;

/* renamed from: o.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2695F {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
