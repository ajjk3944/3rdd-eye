package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ju extends l0 {
    public static final Parcelable.Creator<ju> CREATOR = new p92(9);
    public final String f;
    public final int g;
    public final long h;

    public ju(int i, long j, String str) {
        this.f = str;
        this.g = i;
        this.h = j;
    }

    public final long a() {
        long j = this.h;
        return j == -1 ? this.g : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ju) {
            ju juVar = (ju) obj;
            String str = juVar.f;
            String str2 = this.f;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == juVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, Long.valueOf(a())});
    }

    public final String toString() {
        gw3 gw3Var = new gw3(this);
        gw3Var.m(this.f, "name");
        gw3Var.m(Long.valueOf(a()), "version");
        return gw3Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g);
        long jA = a();
        uk2.T(parcel, 3, 8);
        parcel.writeLong(jA);
        uk2.O(parcel, I);
    }

    public ju(String str) {
        this.f = str;
        this.h = 1L;
        this.g = -1;
    }
}
