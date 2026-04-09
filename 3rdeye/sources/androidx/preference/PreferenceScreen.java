package androidx.preference;

import B0.i;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.preference.b;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: T, reason: collision with root package name */
    public final boolean f16281T;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, i.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.f16281T = true;
    }

    @Override // androidx.preference.Preference
    public final void m() {
        b bVar;
        if (this.f16258m != null || this.f16259n != null || this.f16275O.size() == 0 || (bVar = this.f16249c.f44223j) == null) {
            return;
        }
        boolean zA = false;
        for (ComponentCallbacksC1759l parentFragment = bVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof b.f) {
                zA = ((b.f) parentFragment).a();
            }
        }
        if (!zA && (bVar.getContext() instanceof b.f)) {
            zA = ((b.f) bVar.getContext()).a();
        }
        if (zA || !(bVar.getActivity() instanceof b.f)) {
            return;
        }
        ((b.f) bVar.getActivity()).a();
    }
}
