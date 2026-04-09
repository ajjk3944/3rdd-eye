package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gr extends tl0 {
    public static final Parcelable.Creator<gr> CREATOR = new k2(6);
    public String f;

    public gr(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
    }

    public gr() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
