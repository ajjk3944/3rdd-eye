package k0;

import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new C2333b(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21528a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f21529b;

    /* renamed from: c, reason: collision with root package name */
    public C2598b[] f21530c;

    /* renamed from: d, reason: collision with root package name */
    public int f21531d;

    /* renamed from: e, reason: collision with root package name */
    public String f21532e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f21533f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f21534g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f21535h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f21528a);
        parcel.writeStringList(this.f21529b);
        parcel.writeTypedArray(this.f21530c, i);
        parcel.writeInt(this.f21531d);
        parcel.writeString(this.f21532e);
        parcel.writeStringList(this.f21533f);
        parcel.writeTypedList(this.f21534g);
        parcel.writeTypedList(this.f21535h);
    }
}
