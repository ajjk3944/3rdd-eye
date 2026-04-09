package androidx.preference;

import B0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.h;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: S, reason: collision with root package name */
    public final a f16209S;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            checkBoxPreference.getClass();
            checkBoxPreference.A(z10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iA = i.a(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iA, 0);
        this.f16209S = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.i.f44234b, iA, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f16308O = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f16307N) {
            h();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f16309P = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f16307N) {
            h();
        }
        this.f16311R = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16307N);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f16209S);
        }
    }

    @Override // androidx.preference.Preference
    public void l(h hVar) {
        super.l(hVar);
        C(hVar.a(android.R.id.checkbox));
        B(hVar.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.f16248b.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(android.R.id.checkbox));
            B(view.findViewById(android.R.id.summary));
        }
    }
}
