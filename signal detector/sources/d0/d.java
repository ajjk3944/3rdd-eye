package d0;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends W.b {
    public static final Parcelable.Creator<d> CREATOR = new w(9);

    /* renamed from: c, reason: collision with root package name */
    public int f19704c;

    /* renamed from: d, reason: collision with root package name */
    public int f19705d;

    /* renamed from: e, reason: collision with root package name */
    public int f19706e;

    /* renamed from: f, reason: collision with root package name */
    public int f19707f;

    /* renamed from: g, reason: collision with root package name */
    public int f19708g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19704c = 0;
        this.f19704c = parcel.readInt();
        this.f19705d = parcel.readInt();
        this.f19706e = parcel.readInt();
        this.f19707f = parcel.readInt();
        this.f19708g = parcel.readInt();
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f19704c);
        parcel.writeInt(this.f19705d);
        parcel.writeInt(this.f19706e);
        parcel.writeInt(this.f19707f);
        parcel.writeInt(this.f19708g);
    }
}
