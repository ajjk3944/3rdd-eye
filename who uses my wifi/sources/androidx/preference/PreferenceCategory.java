package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.gi2;
import defpackage.im0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gi2.l(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean g() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void l(im0 im0Var) {
        super.l(im0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            im0Var.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        return !super.g();
    }
}
