package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v0 extends qb.a {
    public static final Parcelable.Creator<v0> CREATOR = new u0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f19965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19966b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f19967c;

    public v0(int i4, String str, Intent intent) {
        this.f19965a = i4;
        this.f19966b = str;
        this.f19967c = intent;
    }

    public static v0 a(Activity activity) {
        return new v0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f19965a == v0Var.f19965a && Objects.equals(this.f19966b, v0Var.f19966b) && Objects.equals(this.f19967c, v0Var.f19967c);
    }

    public final int hashCode() {
        return this.f19965a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f19965a);
        com.bumptech.glide.f.I(parcel, 2, this.f19966b);
        com.bumptech.glide.f.H(parcel, 3, this.f19967c, i4);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
