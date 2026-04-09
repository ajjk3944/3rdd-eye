package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    public boolean f16307N;

    /* renamed from: O, reason: collision with root package name */
    public String f16308O;

    /* renamed from: P, reason: collision with root package name */
    public String f16309P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f16310Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f16311R;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public final void A(boolean z10) {
        boolean z11 = this.f16307N != z10;
        if (z11 || !this.f16310Q) {
            this.f16307N = z10;
            this.f16310Q = true;
            if (z()) {
                boolean z12 = !z10;
                if (z()) {
                    z12 = this.f16249c.c().getBoolean(this.f16257l, z12);
                }
                if (z10 != z12) {
                    SharedPreferences.Editor editorA = this.f16249c.a();
                    editorA.putBoolean(this.f16257l, z10);
                    if (!this.f16249c.f44219e) {
                        editorA.apply();
                    }
                }
            }
            if (z11) {
                i(y());
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
    public final void B(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f16307N
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r4.f16308O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = r4.f16308O
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f16307N
            if (r0 != 0) goto L2d
            java.lang.String r0 = r4.f16309P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = r4.f16309P
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.B(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public void m() {
        A(!this.f16307N);
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.p(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.p(aVar.getSuperState());
        A(aVar.f16312b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f16263r) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f16312b = this.f16307N;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (z()) {
            zBooleanValue = this.f16249c.c().getBoolean(this.f16257l, zBooleanValue);
        }
        A(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return (this.f16311R ? this.f16307N : !this.f16307N) || super.y();
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0255a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f16312b;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        public class C0255a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f16312b = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16312b ? 1 : 0);
        }

        public a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
