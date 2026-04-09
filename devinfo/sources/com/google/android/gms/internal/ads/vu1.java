package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vu1 implements Parcelable {
    public static final Parcelable.Creator<vu1> CREATOR = new ci(26);

    /* renamed from: a, reason: collision with root package name */
    public int f17721a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f17722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17723c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17724d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17725e;

    public vu1(Parcel parcel) {
        this.f17722b = new UUID(parcel.readLong(), parcel.readLong());
        this.f17723c = parcel.readString();
        String string = parcel.readString();
        String str = bq0.f9768a;
        this.f17724d = string;
        this.f17725e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vu1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        vu1 vu1Var = (vu1) obj;
        return Objects.equals(this.f17723c, vu1Var.f17723c) && Objects.equals(this.f17724d, vu1Var.f17724d) && Objects.equals(this.f17722b, vu1Var.f17722b) && Arrays.equals(this.f17725e, vu1Var.f17725e);
    }

    public final int hashCode() {
        int i4 = this.f17721a;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = this.f17722b.hashCode() * 31;
        String str = this.f17723c;
        int iHashCode2 = Arrays.hashCode(this.f17725e) + je.u.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17724d);
        this.f17721a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        UUID uuid = this.f17722b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f17723c);
        parcel.writeString(this.f17724d);
        parcel.writeByteArray(this.f17725e);
    }

    public vu1(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f17722b = uuid;
        this.f17723c = null;
        this.f17724d = ia.h(str);
        this.f17725e = bArr;
    }
}
