package x3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2996a extends W.b {
    public static final Parcelable.Creator<C2996a> CREATOR = new A3.w(15);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24039c;

    public C2996a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f24039c = parcel.readInt() == 1;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f24039c ? 1 : 0);
    }
}
