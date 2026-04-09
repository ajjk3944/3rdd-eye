package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ae3 extends l0 {
    public static final Parcelable.Creator<ae3> CREATOR = new p92(23);
    public final String f;
    public final int g;
    public final pc4 h;
    public final int i;

    public ae3(String str, int i, pc4 pc4Var, int i2) {
        this.f = str;
        this.g = i;
        this.h = pc4Var;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae3)) {
            return false;
        }
        ae3 ae3Var = (ae3) obj;
        return this.f.equals(ae3Var.f) && this.g == ae3Var.g && this.h.a(ae3Var.h);
    }

    public final int hashCode() {
        return Objects.hash(this.f, Integer.valueOf(this.g), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g);
        uk2.C(parcel, 3, this.h, i);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.i);
        uk2.O(parcel, I);
    }
}
