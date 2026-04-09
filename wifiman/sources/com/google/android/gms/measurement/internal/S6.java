package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class S6 extends AbstractC8026a {
    public static final Parcelable.Creator<S6> CREATOR = new V6();

    /* renamed from: a, reason: collision with root package name */
    public final List f36206a;

    S6(List list) {
        this.f36206a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.t(parcel, 1, this.f36206a, false);
        t3.b.b(parcel, iA);
    }
}
