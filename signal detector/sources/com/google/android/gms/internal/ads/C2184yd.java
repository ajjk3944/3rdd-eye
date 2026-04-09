package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2184yd extends N2.a {
    public static final Parcelable.Creator<C2184yd> CREATOR = new C1784r8(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f17725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17727c;

    public C2184yd(int i, int i3, int i6) {
        this.f17725a = i;
        this.f17726b = i3;
        this.f17727c = i6;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2184yd)) {
            C2184yd c2184yd = (C2184yd) obj;
            if (c2184yd.f17727c == this.f17727c && c2184yd.f17726b == this.f17726b && c2184yd.f17725a == this.f17725a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f17725a, this.f17726b, this.f17727c});
    }

    public final String toString() {
        int i = this.f17725a;
        int length = String.valueOf(i).length();
        int i3 = this.f17726b;
        int length2 = String.valueOf(i3).length();
        int i6 = this.f17727c;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i6).length());
        sb.append(i);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i6);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f17725a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f17726b);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f17727c);
        AbstractC0241a.H(parcel, iE);
    }
}
