package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ie4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<ie4> CREATOR = new ed4(1);
    public final vd4[] f;
    public int g;
    public final String h;
    public final int i;

    public ie4(Parcel parcel) {
        this.h = parcel.readString();
        vd4[] vd4VarArr = (vd4[]) parcel.createTypedArray(vd4.CREATOR);
        String str = v23.a;
        this.f = vd4VarArr;
        this.i = vd4VarArr.length;
    }

    public final ie4 a(String str) {
        return Objects.equals(this.h, str) ? this : new ie4(str, false, this.f);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        vd4 vd4Var = (vd4) obj2;
        UUID uuid = fh3.a;
        UUID uuid2 = ((vd4) obj).g;
        return uuid.equals(uuid2) ? !uuid.equals(vd4Var.g) ? 1 : 0 : uuid2.compareTo(vd4Var.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie4.class == obj.getClass()) {
            ie4 ie4Var = (ie4) obj;
            if (Objects.equals(this.h, ie4Var.h) && Arrays.equals(this.f, ie4Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        String str = this.h;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f);
        this.g = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeTypedArray(this.f, 0);
    }

    public ie4(String str, boolean z, vd4... vd4VarArr) {
        this.h = str;
        vd4VarArr = z ? (vd4[]) vd4VarArr.clone() : vd4VarArr;
        this.f = vd4VarArr;
        this.i = vd4VarArr.length;
        Arrays.sort(vd4VarArr, this);
    }
}
