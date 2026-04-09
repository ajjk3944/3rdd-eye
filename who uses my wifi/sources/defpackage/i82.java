package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i82 extends l0 {
    public static final Parcelable.Creator<i82> CREATOR = new kq0(29);
    public final int f;
    public final int g;
    public final int h;

    public i82(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof i82)) {
            i82 i82Var = (i82) obj;
            if (i82Var.h == this.h && i82Var.g == this.g && i82Var.f == this.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f, this.g, this.h});
    }

    public final String toString() {
        int i = this.f;
        int length = String.valueOf(i).length();
        int i2 = this.g;
        int length2 = String.valueOf(i2).length();
        int i3 = this.h;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i3).length());
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.O(parcel, I);
    }
}
