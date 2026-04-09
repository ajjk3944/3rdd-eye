package com.google.android.gms.common.api;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4817a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4818d;

    public Scope(int i10, String str) {
        s.f(str, "scopeUri must not be null or empty");
        this.f4817a = i10;
        this.f4818d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4818d.equals(((Scope) obj).f4818d);
    }

    public final int hashCode() {
        return this.f4818d.hashCode();
    }

    public final String toString() {
        return this.f4818d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4817a);
        i4.P(parcel, 2, this.f4818d);
        i4.W(parcel, iU);
    }
}
