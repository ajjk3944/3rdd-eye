package o4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m0.C5316i;

/* compiled from: ExtendableSavedState.java */
/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5421a extends U0.a {
    public static final Parcelable.Creator<C5421a> CREATOR = new C0508a();

    /* renamed from: d, reason: collision with root package name */
    public final C5316i<String, Bundle> f44831d;

    /* compiled from: ExtendableSavedState.java */
    /* renamed from: o4.a$a, reason: collision with other inner class name */
    public class C0508a implements Parcelable.ClassLoaderCreator<C5421a> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final C5421a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C5421a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new C5421a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new C5421a(parcel, null);
        }
    }

    public C5421a(Parcelable parcelable) {
        super(parcelable);
        this.f44831d = new C5316i<>();
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f44831d + "}";
    }

    @Override // U0.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C5316i<String, Bundle> c5316i = this.f44831d;
        int i10 = c5316i.f44030d;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = c5316i.g(i11);
            bundleArr[i11] = c5316i.l(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C5421a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f44831d = new C5316i<>(i);
        for (int i10 = 0; i10 < i; i10++) {
            this.f44831d.put(strArr[i10], bundleArr[i10]);
        }
    }
}
