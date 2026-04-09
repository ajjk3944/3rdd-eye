package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.dn0;
import defpackage.gi2;
import defpackage.im0;
import defpackage.pe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final pe X;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iL = gi2.l(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iL);
        this.X = new pe(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.b, iL, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.T = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.S) {
            h();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.U = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.S) {
            h();
        }
        this.W = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.S);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.X);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(im0 im0Var) {
        super.l(im0Var);
        A(im0Var.q(android.R.id.checkbox));
        z(im0Var.q(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.f.getSystemService("accessibility")).isEnabled()) {
            A(view.findViewById(android.R.id.checkbox));
            z(view.findViewById(android.R.id.summary));
        }
    }
}
