package com.google.android.gms.common.api;

import A3.q;
import N2.a;
import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new q(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f6902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6903b;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f6902a = i;
        this.f6903b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6903b.equals(((Scope) obj).f6903b);
    }

    public final int hashCode() {
        return this.f6903b.hashCode();
    }

    public final String toString() {
        return this.f6903b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f6902a);
        AbstractC0241a.u(parcel, 2, this.f6903b);
        AbstractC0241a.H(parcel, iE);
    }
}
