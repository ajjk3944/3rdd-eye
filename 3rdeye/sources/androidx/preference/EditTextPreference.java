package androidx.preference;

import B0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: T, reason: collision with root package name */
    public String f16221T;

    public static final class b implements Preference.e<EditTextPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static b f16223a;

        @Override // androidx.preference.Preference.e
        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.f16221T) ? editTextPreference.f16248b.getString(R.string.not_set) : editTextPreference.f16221T;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iA = i.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iA);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.i.f44236d, iA, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (b.f16223a == null) {
                b.f16223a = new b();
            }
            this.f16246L = b.f16223a;
            h();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void A(String str) {
        boolean zY = y();
        this.f16221T = str;
        t(str);
        boolean zY2 = y();
        if (zY2 != zY) {
            i(zY2);
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.p(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.p(aVar.getSuperState());
        A(aVar.f16222b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f16263r) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f16222b = this.f16221T;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        A(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return TextUtils.isEmpty(this.f16221T) || super.y();
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0251a();

        /* renamed from: b, reason: collision with root package name */
        public String f16222b;

        /* renamed from: androidx.preference.EditTextPreference$a$a, reason: collision with other inner class name */
        public class C0251a implements Parcelable.Creator<a> {
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
            this.f16222b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f16222b);
        }

        public a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
