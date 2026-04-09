package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import i6.a;
import u.e;

/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new a(7);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f5832a;

    /* renamed from: d, reason: collision with root package name */
    public e f5833d;

    public RemoteMessage(Bundle bundle) {
        this.f5832a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.L(parcel, 2, this.f5832a);
        i4.W(parcel, iU);
    }
}
