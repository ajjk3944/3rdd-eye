package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h31 extends tl0 {
    public static final Parcelable.Creator<h31> CREATOR = new kq0(4);
    public boolean f;

    public h31(Parcel parcel) {
        super(parcel);
        this.f = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public h31() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
