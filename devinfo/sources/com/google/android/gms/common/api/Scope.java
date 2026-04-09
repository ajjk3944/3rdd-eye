package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j4.g;
import pb.y;
import qb.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new g(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f9058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9059b;

    public Scope(int i4, String str) {
        y.f(str, "scopeUri must not be null or empty");
        this.f9058a = i4;
        this.f9059b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f9059b.equals(((Scope) obj).f9059b);
    }

    public final int hashCode() {
        return this.f9059b.hashCode();
    }

    public final String toString() {
        return this.f9059b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.N(parcel, 1, 4);
        parcel.writeInt(this.f9058a);
        f.I(parcel, 2, this.f9059b);
        f.P(parcel, iO);
    }
}
