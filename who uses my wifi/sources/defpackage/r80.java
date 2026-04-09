package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r80 extends View.BaseSavedState {
    public static final Parcelable.Creator<r80> CREATOR = new k2(13);
    public String f;
    public int g;
    public float h;
    public boolean i;
    public String j;
    public int k;
    public int l;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
    }
}
