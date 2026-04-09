package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pa2 extends l0 {
    public static final Parcelable.Creator<pa2> CREATOR = new p92(5);
    public final pc4 f;
    public final String g;

    public pa2(String str, pc4 pc4Var) {
        this.f = pc4Var;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.C(parcel, 2, this.f, i);
        uk2.D(parcel, 3, this.g);
        uk2.O(parcel, I);
    }
}
