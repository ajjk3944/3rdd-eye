package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uw1 extends l0 {
    public static final Parcelable.Creator<uw1> CREATOR = new kq0(21);
    public ParcelFileDescriptor f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final boolean j;

    public uw1(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f = parcelFileDescriptor;
        this.g = z;
        this.h = z2;
        this.i = j;
        this.j = z3;
    }

    public final synchronized boolean a() {
        return this.f != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f);
        this.f = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.h;
    }

    public final synchronized boolean d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        long j;
        int I = uk2.I(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f;
        }
        uk2.C(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z = this.g;
        }
        uk2.T(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean zC = c();
        uk2.T(parcel, 4, 4);
        parcel.writeInt(zC ? 1 : 0);
        synchronized (this) {
            j = this.i;
        }
        uk2.T(parcel, 5, 8);
        parcel.writeLong(j);
        boolean zD = d();
        uk2.T(parcel, 6, 4);
        parcel.writeInt(zD ? 1 : 0);
        uk2.O(parcel, I);
    }

    public uw1() {
        this(null, false, false, 0L, false);
    }
}
