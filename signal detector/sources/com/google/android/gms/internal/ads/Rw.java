package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Rw extends N2.a {
    public static final Parcelable.Creator<Rw> CREATOR = new C1784r8(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f11085a;

    /* renamed from: b, reason: collision with root package name */
    public C1136f6 f11086b = null;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f11087c;

    public Rw(int i, byte[] bArr) {
        this.f11085a = i;
        this.f11087c = bArr;
        a();
    }

    public final void a() {
        C1136f6 c1136f6 = this.f11086b;
        if (c1136f6 != null || this.f11087c == null) {
            if (c1136f6 == null || this.f11087c != null) {
                if (c1136f6 != null && this.f11087c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (c1136f6 != null || this.f11087c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f11085a);
        byte[] bArrB = this.f11087c;
        if (bArrB == null) {
            bArrB = this.f11086b.b();
        }
        AbstractC0241a.r(parcel, 2, bArrB);
        AbstractC0241a.H(parcel, iE);
    }
}
