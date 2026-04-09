package l3;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2643b extends W.b {
    public static final Parcelable.Creator<C2643b> CREATOR = new w(12);

    /* renamed from: c, reason: collision with root package name */
    public boolean f21826c;

    public C2643b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C2643b.class.getClassLoader();
        }
        this.f21826c = parcel.readInt() == 1;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21826c ? 1 : 0);
    }
}
