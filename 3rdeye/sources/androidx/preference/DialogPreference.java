package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k;
import androidx.preference.b;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.i;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    public final CharSequence f16211N;

    /* renamed from: O, reason: collision with root package name */
    public final String f16212O;

    /* renamed from: P, reason: collision with root package name */
    public final Drawable f16213P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f16214Q;

    /* renamed from: R, reason: collision with root package name */
    public final String f16215R;

    /* renamed from: S, reason: collision with root package name */
    public final int f16216S;

    public interface a {
        Preference a(String str);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f44235c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f16211N = string;
        if (string == null) {
            this.f16211N = this.f16254h;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f16212O = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f16213P = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f16214Q = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f16215R = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f16216S = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void m() {
        DialogInterfaceOnCancelListenerC1758k dVar;
        b bVar = this.f16249c.i;
        if (bVar != null) {
            boolean zA = false;
            for (ComponentCallbacksC1759l parentFragment = bVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof b.d) {
                    zA = ((b.d) parentFragment).a();
                }
            }
            if (!zA && (bVar.getContext() instanceof b.d)) {
                zA = ((b.d) bVar.getContext()).a();
            }
            if (!zA && (bVar.getActivity() instanceof b.d)) {
                zA = ((b.d) bVar.getActivity()).a();
            }
            if (!zA && bVar.getParentFragmentManager().B("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    dVar = new n1.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", this.f16257l);
                    dVar.setArguments(bundle);
                } else if (this instanceof ListPreference) {
                    dVar = new n1.c();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", this.f16257l);
                    dVar.setArguments(bundle2);
                } else {
                    if (!(this instanceof MultiSelectListPreference)) {
                        throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    }
                    dVar = new n1.d();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", this.f16257l);
                    dVar.setArguments(bundle3);
                }
                dVar.setTargetFragment(bVar, 0);
                dVar.show(bVar.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, B0.i.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
