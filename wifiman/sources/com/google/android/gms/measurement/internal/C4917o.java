package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4917o extends AbstractC8026a {
    public static final Parcelable.Creator<C4917o> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f36617a;

    public C4917o(Bundle bundle) {
        this.f36617a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.e(parcel, 1, this.f36617a, false);
        t3.b.b(parcel, iA);
    }
}
