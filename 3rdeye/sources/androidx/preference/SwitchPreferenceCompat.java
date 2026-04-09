package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.h;
import n1.i;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: S, reason: collision with root package name */
    public final a f16303S;

    /* renamed from: T, reason: collision with root package name */
    public final String f16304T;

    /* renamed from: U, reason: collision with root package name */
    public final String f16305U;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            SwitchPreferenceCompat switchPreferenceCompat = SwitchPreferenceCompat.this;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.A(z10);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.f16303S = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f44244m, R.attr.switchPreferenceCompatStyle, 0);
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
        this.f16304T = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        h();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f16305U = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        h();
        this.f16311R = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) throws Resources.NotFoundException {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16307N);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f16304T);
            switchCompat.setTextOff(this.f16305U);
            switchCompat.setOnCheckedChangeListener(this.f16303S);
        }
    }

    @Override // androidx.preference.Preference
    public void l(h hVar) throws Resources.NotFoundException {
        super.l(hVar);
        C(hVar.a(R.id.switchWidget));
        B(hVar.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) throws Resources.NotFoundException {
        super.s(view);
        if (((AccessibilityManager) this.f16248b.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(R.id.switchWidget));
            B(view.findViewById(android.R.id.summary));
        }
    }
}
