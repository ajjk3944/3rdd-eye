package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.dn0;
import defpackage.gi2;
import defpackage.gr;
import defpackage.pz;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String Y;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iL = gi2.l(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.d, iL, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (pz.r == null) {
                pz.r = new pz(18);
            }
            this.Q = pz.r;
            h();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gr.class)) {
            super.p(parcelable);
            return;
        }
        gr grVar = (gr) parcelable;
        super.p(grVar.getSuperState());
        y(grVar.f);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.w) {
            return absSavedState;
        }
        gr grVar = new gr();
        grVar.f = this.Y;
        return grVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        y(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        return TextUtils.isEmpty(this.Y) || super.w();
    }

    public final void y(String str) {
        boolean zW = w();
        this.Y = str;
        t(str);
        boolean zW2 = w();
        if (zW2 != zW) {
            i(zW2);
        }
        h();
    }
}
