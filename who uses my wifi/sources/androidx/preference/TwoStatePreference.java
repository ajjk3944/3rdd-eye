package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import defpackage.h31;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean S;
    public CharSequence T;
    public CharSequence U;
    public boolean V;
    public boolean W;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void m() {
        boolean z = !this.S;
        a(Boolean.valueOf(z));
        y(z);
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(h31.class)) {
            super.p(parcelable);
            return;
        }
        h31 h31Var = (h31) parcelable;
        super.p(h31Var.getSuperState());
        y(h31Var.f);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.w) {
            return absSavedState;
        }
        h31 h31Var = new h31();
        h31Var.f = this.S;
        return h31Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (x()) {
            zBooleanValue = this.g.c().getBoolean(this.q, zBooleanValue);
        }
        y(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        return (this.W ? this.S : !this.S) || super.w();
    }

    public final void y(boolean z) {
        boolean z2 = this.S != z;
        if (z2 || !this.V) {
            this.S = z;
            this.V = true;
            if (x()) {
                boolean z3 = !z;
                boolean zX = x();
                String str = this.q;
                if (zX) {
                    z3 = this.g.c().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editorB = this.g.b();
                    editorB.putBoolean(str, z);
                    if (!this.g.e) {
                        editorB.apply();
                    }
                }
            }
            if (z2) {
                i(w());
                h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.S
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.T
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.S
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.U
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.U
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.f()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.z(android.view.View):void");
    }
}
