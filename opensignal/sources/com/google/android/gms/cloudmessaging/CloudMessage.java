package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import yb.b;

/* loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f4803a;

    public CloudMessage(Intent intent) {
        this.f4803a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 1, this.f4803a, i10);
        i4.W(parcel, iU);
    }
}
