package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vc implements Parcelable {
    public static final Parcelable.Creator<vc> CREATOR = new k2(4);
    public final we0 f;
    public final we0 g;
    public final rm h;
    public final we0 i;
    public final int j;
    public final int k;
    public final int l;

    public vc(we0 we0Var, we0 we0Var2, rm rmVar, we0 we0Var3, int i) {
        Objects.requireNonNull(we0Var, "start cannot be null");
        Objects.requireNonNull(we0Var2, "end cannot be null");
        Objects.requireNonNull(rmVar, "validator cannot be null");
        this.f = we0Var;
        this.g = we0Var2;
        this.i = we0Var3;
        this.j = i;
        this.h = rmVar;
        if (we0Var3 != null && we0Var.f.compareTo(we0Var3.f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (we0Var3 != null && we0Var3.f.compareTo(we0Var2.f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > g41.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.l = we0Var.d(we0Var2) + 1;
        this.k = (we0Var2.h - we0Var.h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc)) {
            return false;
        }
        vc vcVar = (vc) obj;
        return this.f.equals(vcVar.f) && this.g.equals(vcVar.g) && Objects.equals(this.i, vcVar.i) && this.j == vcVar.j && this.h.equals(vcVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.i, Integer.valueOf(this.j), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.j);
    }
}
