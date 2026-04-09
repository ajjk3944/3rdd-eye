package A3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E extends W.b {
    public static final Parcelable.Creator<E> CREATOR = new w(1);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f361c;

    public E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f361c = parcel.readBundle(classLoader);
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f361c);
    }
}
