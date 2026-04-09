package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.recyclerview.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326x implements Parcelable {
    public static final Parcelable.Creator<C0326x> CREATOR = new A3.q(19);

    /* renamed from: a, reason: collision with root package name */
    public int f5630a;

    /* renamed from: b, reason: collision with root package name */
    public int f5631b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5632c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5630a);
        parcel.writeInt(this.f5631b);
        parcel.writeInt(this.f5632c ? 1 : 0);
    }
}
