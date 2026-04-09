package o9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new j4.g(9);

    /* renamed from: a, reason: collision with root package name */
    public float f30453a;

    /* renamed from: b, reason: collision with root package name */
    public Parcelable f30454b = null;

    /* renamed from: c, reason: collision with root package name */
    public float f30455c;

    public d(float f10, float f11) {
        this.f30453a = f11;
        this.f30455c = f10;
    }

    public float a() {
        return this.f30455c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f30455c + " y: " + this.f30453a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f30455c);
        parcel.writeFloat(this.f30453a);
        if (this.f30454b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.f30454b, i4);
        }
    }
}
