package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import defpackage.bw0;
import defpackage.cm0;
import defpackage.dn0;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final bw0 S;
    public final ArrayList T;
    public boolean U;
    public int V;
    public boolean W;
    public int X;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.S = new bw0(0);
        new Handler(Looper.getMainLooper());
        this.U = true;
        this.V = 0;
        this.W = false;
        this.X = Integer.MAX_VALUE;
        this.T = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.i, i, 0);
        this.U = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.q)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.X = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            z(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            z(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void i(boolean z) {
        super.i(z);
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceZ = z(i);
            if (preferenceZ.A == z) {
                preferenceZ.A = !z;
                preferenceZ.i(preferenceZ.w());
                preferenceZ.h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        this.W = true;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            z(i).j();
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        super.n();
        this.W = false;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            z(i).n();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(cm0.class)) {
            super.p(parcelable);
            return;
        }
        cm0 cm0Var = (cm0) parcelable;
        this.X = cm0Var.f;
        super.p(cm0Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new cm0(this.X);
    }

    public final Preference y(CharSequence charSequence) {
        Preference preferenceY;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.q, charSequence)) {
            return this;
        }
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceZ = z(i);
            if (TextUtils.equals(preferenceZ.q, charSequence)) {
                return preferenceZ;
            }
            if ((preferenceZ instanceof PreferenceGroup) && (preferenceY = ((PreferenceGroup) preferenceZ).y(charSequence)) != null) {
                return preferenceY;
            }
        }
        return null;
    }

    public final Preference z(int i) {
        return (Preference) this.T.get(i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
