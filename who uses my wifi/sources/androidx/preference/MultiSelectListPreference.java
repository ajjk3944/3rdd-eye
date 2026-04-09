package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.dn0;
import defpackage.gi2;
import defpackage.if0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] Y;
    public final CharSequence[] Z;
    public final HashSet a0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iL = gi2.l(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iL);
        this.a0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.f, iL, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.Y = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.Z = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(if0.class)) {
            super.p(parcelable);
            return;
        }
        if0 if0Var = (if0) parcelable;
        super.p(if0Var.getSuperState());
        y(if0Var.f);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.w) {
            return absSavedState;
        }
        if0 if0Var = new if0();
        if0Var.f = this.a0;
        return if0Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (x()) {
            stringSet = this.g.c().getStringSet(this.q, stringSet);
        }
        y(stringSet);
    }

    public final void y(Set set) {
        HashSet hashSet = this.a0;
        hashSet.clear();
        hashSet.addAll(set);
        if (x()) {
            boolean zX = x();
            String str = this.q;
            if (!set.equals(zX ? this.g.c().getStringSet(str, null) : null)) {
                SharedPreferences.Editor editorB = this.g.b();
                editorB.putStringSet(str, set);
                if (!this.g.e) {
                    editorB.apply();
                }
            }
        }
        h();
    }
}
