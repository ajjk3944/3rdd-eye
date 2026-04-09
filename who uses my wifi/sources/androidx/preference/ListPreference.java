package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.dn0;
import defpackage.fr;
import defpackage.gi2;
import defpackage.j70;
import defpackage.wl0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] Y;
    public final CharSequence[] Z;
    public String a0;
    public String b0;
    public boolean c0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.Y = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.Z = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (fr.t == null) {
                fr.t = new fr(24);
            }
            this.Q = fr.t;
            h();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dn0.g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.b0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence f() {
        CharSequence[] charSequenceArr;
        wl0 wl0Var = this.Q;
        if (wl0Var != null) {
            return wl0Var.h(this);
        }
        int iY = y(this.a0);
        CharSequence charSequence = (iY < 0 || (charSequenceArr = this.Y) == null) ? null : charSequenceArr[iY];
        CharSequence charSequenceF = super.f();
        String str = this.b0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceF)) {
                return str2;
            }
        }
        return charSequenceF;
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(j70.class)) {
            super.p(parcelable);
            return;
        }
        j70 j70Var = (j70) parcelable;
        super.p(j70Var.getSuperState());
        z(j70Var.f);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.w) {
            return absSavedState;
        }
        j70 j70Var = new j70();
        j70Var.f = this.a0;
        return j70Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        z(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void v(CharSequence charSequence) {
        super.v("1.9.2");
        this.b0 = "1.9.2";
    }

    public final int y(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.Z) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void z(String str) {
        boolean zEquals = TextUtils.equals(this.a0, str);
        if (zEquals && this.c0) {
            return;
        }
        this.a0 = str;
        this.c0 = true;
        t(str);
        if (zEquals) {
            return;
        }
        h();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gi2.l(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
