package k0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2616u implements Parcelable {
    public static final Parcelable.Creator<C2616u> CREATOR = new A3.w(10);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f21678a;

    public C2616u(Bundle bundle) {
        this.f21678a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f21678a);
    }

    public C2616u(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f21678a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }
}
