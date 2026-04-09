package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cm0 extends tl0 {
    public static final Parcelable.Creator<cm0> CREATOR = new k2(28);
    public final int f;

    public cm0(Parcel parcel) {
        super(parcel);
        this.f = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f);
    }

    public cm0(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.f = i;
    }
}
