package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.i;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: T, reason: collision with root package name */
    public final CharSequence[] f16224T;

    /* renamed from: U, reason: collision with root package name */
    public final CharSequence[] f16225U;

    /* renamed from: V, reason: collision with root package name */
    public String f16226V;

    /* renamed from: W, reason: collision with root package name */
    public final String f16227W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f16228X;

    public static final class b implements Preference.e<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static b f16230a;

        @Override // androidx.preference.Preference.e
        public final CharSequence a(Preference preference) {
            CharSequence[] charSequenceArr;
            CharSequence[] charSequenceArr2;
            ListPreference listPreference = (ListPreference) preference;
            int iA = listPreference.A(listPreference.f16226V);
            if (TextUtils.isEmpty((iA < 0 || (charSequenceArr2 = listPreference.f16224T) == null) ? null : charSequenceArr2[iA])) {
                return listPreference.f16248b.getString(R.string.not_set);
            }
            int iA2 = listPreference.A(listPreference.f16226V);
            if (iA2 < 0 || (charSequenceArr = listPreference.f16224T) == null) {
                return null;
            }
            return charSequenceArr[iA2];
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f44237e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f16224T = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f16225U = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (b.f16230a == null) {
                b.f16230a = new b();
            }
            this.f16246L = b.f16230a;
            h();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.f44239g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f16227W = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int A(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f16225U) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] B() {
        return this.f16224T;
    }

    public final void C(String str) {
        boolean zEquals = TextUtils.equals(this.f16226V, str);
        if (zEquals && this.f16228X) {
            return;
        }
        this.f16226V = str;
        this.f16228X = true;
        t(str);
        if (zEquals) {
            return;
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final CharSequence f() {
        CharSequence[] charSequenceArr;
        Preference.e eVar = this.f16246L;
        if (eVar != null) {
            return eVar.a(this);
        }
        int iA = A(this.f16226V);
        CharSequence charSequence = (iA < 0 || (charSequenceArr = this.f16224T) == null) ? null : charSequenceArr[iA];
        CharSequence charSequenceF = super.f();
        String str = this.f16227W;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceF)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceF;
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
        C(aVar.f16229b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f16263r) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f16229b = this.f16226V;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        C(e((String) obj));
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0252a();

        /* renamed from: b, reason: collision with root package name */
        public String f16229b;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        public class C0252a implements Parcelable.Creator<a> {
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
            this.f16229b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f16229b);
        }

        public a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, B0.i.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
