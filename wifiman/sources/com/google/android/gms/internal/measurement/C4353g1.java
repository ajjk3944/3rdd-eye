package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import t3.AbstractC8026a;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4353g1 extends AbstractC8026a {
    public static final Parcelable.Creator<C4353g1> CREATOR = new C4380j1();

    /* renamed from: a, reason: collision with root package name */
    public final int f35227a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35228b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f35229c;

    public C4353g1(int i10, String str, Intent intent) {
        this.f35227a = i10;
        this.f35228b = str;
        this.f35229c = intent;
    }

    public static C4353g1 b(Activity activity) {
        return new C4353g1(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4353g1)) {
            return false;
        }
        C4353g1 c4353g1 = (C4353g1) obj;
        return this.f35227a == c4353g1.f35227a && Objects.equals(this.f35228b, c4353g1.f35228b) && Objects.equals(this.f35229c, c4353g1.f35229c);
    }

    public final int hashCode() {
        return this.f35227a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, this.f35227a);
        t3.b.q(parcel, 2, this.f35228b, false);
        t3.b.p(parcel, 3, this.f35229c, i10, false);
        t3.b.b(parcel, iA);
    }
}
