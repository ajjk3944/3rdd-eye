package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.gi2;
import defpackage.iw;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean Y;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gi2.l(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.Y = true;
    }

    @Override // androidx.preference.Preference
    public final void m() {
        iw iwVar;
        if (this.r != null || this.s != null || this.T.size() == 0 || (iwVar = this.g.j) == null) {
            return;
        }
        for (iwVar = this.g.j; iwVar != null; iwVar = iwVar.z) {
        }
    }
}
