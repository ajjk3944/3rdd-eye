package com.google.android.gms.signin.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zag> CREATOR = new l(13);

    /* renamed from: a, reason: collision with root package name */
    public final List f5436a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5437d;

    public zag(String str, ArrayList arrayList) {
        this.f5436a = arrayList;
        this.f5437d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        List<String> list = this.f5436a;
        if (list != null) {
            int iU2 = i4.U(parcel, 1);
            parcel.writeStringList(list);
            i4.W(parcel, iU2);
        }
        i4.P(parcel, 2, this.f5437d);
        i4.W(parcel, iU);
    }
}
