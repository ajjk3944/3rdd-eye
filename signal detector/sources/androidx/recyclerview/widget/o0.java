package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new A3.q(21);

    /* renamed from: a, reason: collision with root package name */
    public int f5562a;

    /* renamed from: b, reason: collision with root package name */
    public int f5563b;

    /* renamed from: c, reason: collision with root package name */
    public int f5564c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5565d;

    /* renamed from: e, reason: collision with root package name */
    public int f5566e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5567f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f5568g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5569h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5570j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5562a);
        parcel.writeInt(this.f5563b);
        parcel.writeInt(this.f5564c);
        if (this.f5564c > 0) {
            parcel.writeIntArray(this.f5565d);
        }
        parcel.writeInt(this.f5566e);
        if (this.f5566e > 0) {
            parcel.writeIntArray(this.f5567f);
        }
        parcel.writeInt(this.f5569h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f5570j ? 1 : 0);
        parcel.writeList(this.f5568g);
    }
}
