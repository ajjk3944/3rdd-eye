package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.libs.identity.ClientIdentity;
import i6.a;
import java.util.Arrays;
import pc.i;

/* loaded from: classes.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new a(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f5298a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5299d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5300g;

    /* renamed from: r, reason: collision with root package name */
    public final ClientIdentity f5301r;

    public LastLocationRequest(long j, int i10, boolean z10, ClientIdentity clientIdentity) {
        this.f5298a = j;
        this.f5299d = i10;
        this.f5300g = z10;
        this.f5301r = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.f5298a == lastLocationRequest.f5298a && this.f5299d == lastLocationRequest.f5299d && this.f5300g == lastLocationRequest.f5300g && s.k(this.f5301r, lastLocationRequest.f5301r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5298a), Integer.valueOf(this.f5299d), Boolean.valueOf(this.f5300g)});
    }

    public final String toString() {
        String str;
        StringBuilder sbT = c7.a.t("LastLocationRequest[");
        long j = this.f5298a;
        if (j != Long.MAX_VALUE) {
            sbT.append("maxAge=");
            i.a(j, sbT);
        }
        int i10 = this.f5299d;
        if (i10 != 0) {
            sbT.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbT.append(str);
        }
        if (this.f5300g) {
            sbT.append(", bypass");
        }
        ClientIdentity clientIdentity = this.f5301r;
        if (clientIdentity != null) {
            sbT.append(", impersonation=");
            sbT.append(clientIdentity);
        }
        sbT.append(']');
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 8);
        parcel.writeLong(this.f5298a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5299d);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5300g ? 1 : 0);
        i4.O(parcel, 5, this.f5301r, i10);
        i4.W(parcel, iU);
    }
}
