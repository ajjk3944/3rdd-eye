package com.google.android.gms.common.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new l(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f4823a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4824d;

    public ClientIdentity(int i10, String str) {
        this.f4823a = i10;
        this.f4824d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f4823a == this.f4823a && s.k(clientIdentity.f4824d, this.f4824d);
    }

    public final int hashCode() {
        return this.f4823a;
    }

    public final String toString() {
        int i10 = this.f4823a;
        int length = String.valueOf(i10).length();
        String str = this.f4824d;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i10);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4823a);
        i4.P(parcel, 2, this.f4824d);
        i4.W(parcel, iU);
    }
}
