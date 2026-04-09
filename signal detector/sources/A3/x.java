package A3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x extends W.b {
    public static final Parcelable.Creator<x> CREATOR = new w(0);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f503c;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f503c = parcel.readBundle(classLoader == null ? x.class.getClassLoader() : classLoader);
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f503c);
    }
}
