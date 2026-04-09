package androidx.preference;

import B0.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: T, reason: collision with root package name */
    public final CharSequence[] f16231T;

    /* renamed from: U, reason: collision with root package name */
    public final CharSequence[] f16232U;

    /* renamed from: V, reason: collision with root package name */
    public final HashSet f16233V;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iA = i.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iA);
        this.f16233V = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.i.f44238f, iA, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f16231T = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f16232U = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void A(Set<String> set) {
        HashSet hashSet = this.f16233V;
        hashSet.clear();
        hashSet.addAll(set);
        if (z()) {
            if (!set.equals(z() ? this.f16249c.c().getStringSet(this.f16257l, null) : null)) {
                SharedPreferences.Editor editorA = this.f16249c.a();
                editorA.putStringSet(this.f16257l, set);
                if (!this.f16249c.f44219e) {
                    editorA.apply();
                }
            }
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.p(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.p(aVar.getSuperState());
        A(aVar.f16234b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f16263r) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f16234b = this.f16233V;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (z()) {
            stringSet = this.f16249c.c().getStringSet(this.f16257l, stringSet);
        }
        A(stringSet);
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0253a();

        /* renamed from: b, reason: collision with root package name */
        public HashSet f16234b;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        public class C0253a implements Parcelable.Creator<a> {
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
            int i = parcel.readInt();
            this.f16234b = new HashSet();
            String[] strArr = new String[i];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f16234b, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16234b.size());
            HashSet hashSet = this.f16234b;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
