package id;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g1.p;
import m4.b;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new p(4);

    /* renamed from: c, reason: collision with root package name */
    public final n0 f25966c;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f25966c = new n0(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f25966c + "}";
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        n0 n0Var = this.f25966c;
        int i10 = n0Var.f36920c;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = (String) n0Var.f(i11);
            bundleArr[i11] = (Bundle) n0Var.j(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i4 = parcel.readInt();
        String[] strArr = new String[i4];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i4];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f25966c = new n0(i4);
        for (int i10 = 0; i10 < i4; i10++) {
            this.f25966c.put(strArr[i10], bundleArr[i10]);
        }
    }
}
