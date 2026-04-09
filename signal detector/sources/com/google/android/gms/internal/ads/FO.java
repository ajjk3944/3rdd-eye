package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class FO implements Parcelable {
    public static final Parcelable.Creator<FO> CREATOR = new C1784r8(26);

    /* renamed from: a, reason: collision with root package name */
    public int f8112a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f8113b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8114c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8115d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8116e;

    public FO(Parcel parcel) {
        this.f8113b = new UUID(parcel.readLong(), parcel.readLong());
        this.f8114c = parcel.readString();
        String string = parcel.readString();
        String str = Vt.f12096a;
        this.f8115d = string;
        this.f8116e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FO)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        FO fo = (FO) obj;
        return Objects.equals(this.f8114c, fo.f8114c) && Objects.equals(this.f8115d, fo.f8115d) && Objects.equals(this.f8113b, fo.f8113b) && Arrays.equals(this.f8116e, fo.f8116e);
    }

    public final int hashCode() {
        int i = this.f8112a;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f8113b.hashCode() * 31;
        String str = this.f8114c;
        int iHashCode2 = Arrays.hashCode(this.f8116e) + ((this.f8115d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        this.f8112a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f8113b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f8114c);
        parcel.writeString(this.f8115d);
        parcel.writeByteArray(this.f8116e);
    }

    public FO(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f8113b = uuid;
        this.f8114c = null;
        this.f8115d = D4.h(str);
        this.f8116e = bArr;
    }
}
