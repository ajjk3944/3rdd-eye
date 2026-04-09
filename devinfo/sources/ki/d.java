package ki;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new j4.g(2);

    /* renamed from: a, reason: collision with root package name */
    public int f28302a;

    /* renamed from: b, reason: collision with root package name */
    public int f28303b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28304c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f28302a);
        parcel.writeInt(this.f28303b);
        parcel.writeInt(this.f28304c ? 1 : 0);
    }
}
