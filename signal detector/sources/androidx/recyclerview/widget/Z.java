package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z extends W.b {
    public static final Parcelable.Creator<Z> CREATOR = new A3.w(8);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f5418c;

    public Z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5418c = parcel.readParcelable(classLoader == null ? Q.class.getClassLoader() : classLoader);
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5418c, 0);
    }
}
