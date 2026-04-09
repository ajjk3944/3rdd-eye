package K3;

import A3.w;
import W.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u.C2940i;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new w(4);

    /* renamed from: c, reason: collision with root package name */
    public final C2940i f2159c;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f2159c = new C2940i(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2159c + "}";
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C2940i c2940i = this.f2159c;
        int i3 = c2940i.f23705c;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            strArr[i6] = (String) c2940i.f(i6);
            bundleArr[i6] = (Bundle) c2940i.j(i6);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2159c = new C2940i(i);
        for (int i3 = 0; i3 < i; i3++) {
            this.f2159c.put(strArr[i3], bundleArr[i3]);
        }
    }
}
