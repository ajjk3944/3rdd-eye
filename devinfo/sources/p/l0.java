package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends View.BaseSavedState {
    public static final Parcelable.Creator<l0> CREATOR = new j4.g(12);

    /* renamed from: a, reason: collision with root package name */
    public boolean f30758a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f30758a ? (byte) 1 : (byte) 0);
    }
}
