package androidx.preference;

import B0.i;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.h;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, i.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean g() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void l(h hVar) {
        super.l(hVar);
        if (Build.VERSION.SDK_INT >= 28) {
            hVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return !super.g();
    }
}
