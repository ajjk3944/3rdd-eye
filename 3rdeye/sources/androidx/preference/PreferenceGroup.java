package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import java.util.ArrayList;
import m0.C5316i;
import n1.i;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: N, reason: collision with root package name */
    public final C5316i<String, Long> f16274N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f16275O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f16276P;

    /* renamed from: Q, reason: collision with root package name */
    public int f16277Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f16278R;

    /* renamed from: S, reason: collision with root package name */
    public int f16279S;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f16274N = new C5316i<>();
        new Handler(Looper.getMainLooper());
        this.f16276P = true;
        this.f16277Q = 0;
        this.f16278R = false;
        this.f16279S = Integer.MAX_VALUE;
        this.f16275O = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.i, i, 0);
        this.f16276P = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i10 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i10 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f16257l)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.f16279S = i10;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Preference A(String str) {
        Preference preferenceA;
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f16257l, str)) {
            return this;
        }
        int size = this.f16275O.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceB = B(i);
            if (TextUtils.equals(preferenceB.f16257l, str)) {
                return preferenceB;
            }
            if ((preferenceB instanceof PreferenceGroup) && (preferenceA = ((PreferenceGroup) preferenceB).A(str)) != null) {
                return preferenceA;
            }
        }
        return null;
    }

    public final Preference B(int i) {
        return (Preference) this.f16275O.get(i);
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.f16275O.size();
        for (int i = 0; i < size; i++) {
            B(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.f16275O.size();
        for (int i = 0; i < size; i++) {
            B(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void i(boolean z10) {
        super.i(z10);
        int size = this.f16275O.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceB = B(i);
            if (preferenceB.f16267v == z10) {
                preferenceB.f16267v = !z10;
                preferenceB.i(preferenceB.y());
                preferenceB.h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        this.f16278R = true;
        int size = this.f16275O.size();
        for (int i = 0; i < size; i++) {
            B(i).j();
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        super.n();
        this.f16278R = false;
        int size = this.f16275O.size();
        for (int i = 0; i < size; i++) {
            B(i).n();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.p(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        this.f16279S = aVar.f16280b;
        super.p(aVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new a(this.f16279S);
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0254a();

        /* renamed from: b, reason: collision with root package name */
        public final int f16280b;

        /* renamed from: androidx.preference.PreferenceGroup$a$a, reason: collision with other inner class name */
        public class C0254a implements Parcelable.Creator<a> {
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
            this.f16280b = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16280b);
        }

        public a(int i) {
            super(AbsSavedState.EMPTY_STATE);
            this.f16280b = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
