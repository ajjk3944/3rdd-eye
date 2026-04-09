package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new androidx.recyclerview.widget.i0(25);

    /* renamed from: a, reason: collision with root package name */
    public String f23731a;

    /* renamed from: b, reason: collision with root package name */
    public int f23732b;

    /* renamed from: c, reason: collision with root package name */
    public float f23733c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23734d;

    /* renamed from: e, reason: collision with root package name */
    public String f23735e;

    /* renamed from: f, reason: collision with root package name */
    public int f23736f;
    public int g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.f23731a);
        parcel.writeFloat(this.f23733c);
        parcel.writeInt(this.f23734d ? 1 : 0);
        parcel.writeString(this.f23735e);
        parcel.writeInt(this.f23736f);
        parcel.writeInt(this.g);
    }
}
