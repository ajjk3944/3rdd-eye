package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vd4 implements Parcelable {
    public static final Parcelable.Creator<vd4> CREATOR = new ed4(4);
    public int f;
    public final UUID g;
    public final String h;
    public final String i;
    public final byte[] j;

    public vd4(Parcel parcel) {
        this.g = new UUID(parcel.readLong(), parcel.readLong());
        this.h = parcel.readString();
        String string = parcel.readString();
        String str = v23.a;
        this.i = string;
        this.j = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vd4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        vd4 vd4Var = (vd4) obj;
        return Objects.equals(this.h, vd4Var.h) && Objects.equals(this.i, vd4Var.i) && Objects.equals(this.g, vd4Var.g) && Arrays.equals(this.j, vd4Var.j);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.g.hashCode() * 31;
        String str = this.h;
        int iHashCode2 = Arrays.hashCode(this.j) + ((this.i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        this.f = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.g;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByteArray(this.j);
    }

    public vd4(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.g = uuid;
        this.h = null;
        this.i = pp1.i(str);
        this.j = bArr;
    }
}
