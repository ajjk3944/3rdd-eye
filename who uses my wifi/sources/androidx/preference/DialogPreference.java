package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.bm0;
import defpackage.dn0;
import defpackage.gi2;
import defpackage.hr;
import defpackage.iw;
import defpackage.kf0;
import defpackage.l70;
import defpackage.xo;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence S;
    public final String T;
    public final Drawable U;
    public final String V;
    public final String W;
    public final int X;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.S = string;
        if (string == null) {
            this.S = this.m;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.T = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.U = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.V = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.W = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.X = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void m() {
        xo kf0Var;
        bm0 bm0Var = this.g.i;
        if (bm0Var != null) {
            for (iw iwVar = bm0Var; iwVar != null; iwVar = iwVar.z) {
            }
            if (bm0Var.k().B("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                kf0Var = new hr();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", this.q);
                kf0Var.K(bundle);
            } else if (this instanceof ListPreference) {
                kf0Var = new l70();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", this.q);
                kf0Var.K(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                kf0Var = new kf0();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", this.q);
                kf0Var.K(bundle3);
            }
            kf0Var.L(bm0Var);
            kf0Var.Q(bm0Var.k(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gi2.l(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
