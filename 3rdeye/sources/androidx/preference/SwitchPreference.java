package androidx.preference;

import B0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.h;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: S, reason: collision with root package name */
    public final a f16299S;

    /* renamed from: T, reason: collision with root package name */
    public final String f16300T;

    /* renamed from: U, reason: collision with root package name */
    public final String f16301U;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            SwitchPreference switchPreference = SwitchPreference.this;
            switchPreference.getClass();
            switchPreference.A(z10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iA = i.a(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iA, 0);
        this.f16299S = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.i.f44243l, iA, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f16308O = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f16307N) {
            h();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f16309P = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f16307N) {
            h();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f16300T = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        h();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f16301U = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        h();
        this.f16311R = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16307N);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f16300T);
            r42.setTextOff(this.f16301U);
            r42.setOnCheckedChangeListener(this.f16299S);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(h hVar) {
        super.l(hVar);
        C(hVar.a(android.R.id.switch_widget));
        B(hVar.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.f16248b.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(android.R.id.switch_widget));
            B(view.findViewById(android.R.id.summary));
        }
    }
}
