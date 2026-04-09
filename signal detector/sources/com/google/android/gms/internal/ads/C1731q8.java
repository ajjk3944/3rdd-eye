package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731q8 extends N2.a {
    public static final Parcelable.Creator<C1731q8> CREATOR = new C1784r8(0);

    /* renamed from: a, reason: collision with root package name */
    public ParcelFileDescriptor f16322a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16323b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16324c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16325d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16326e;

    public C1731q8(ParcelFileDescriptor parcelFileDescriptor, boolean z6, boolean z7, long j6, boolean z8) {
        this.f16322a = parcelFileDescriptor;
        this.f16323b = z6;
        this.f16324c = z7;
        this.f16325d = j6;
        this.f16326e = z8;
    }

    public final synchronized boolean a() {
        return this.f16322a != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f16322a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f16322a);
        this.f16322a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.f16323b;
    }

    public final synchronized boolean d() {
        return this.f16324c;
    }

    public final synchronized long e() {
        return this.f16325d;
    }

    public final synchronized boolean f() {
        return this.f16326e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        int iE = AbstractC0241a.E(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f16322a;
        }
        AbstractC0241a.t(parcel, 2, parcelFileDescriptor, i);
        boolean zC = c();
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(zC ? 1 : 0);
        boolean zD = d();
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(zD ? 1 : 0);
        long jE = e();
        AbstractC0241a.B(parcel, 5, 8);
        parcel.writeLong(jE);
        boolean zF = f();
        AbstractC0241a.B(parcel, 6, 4);
        parcel.writeInt(zF ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }

    public C1731q8() {
        this(null, false, false, 0L, false);
    }
}
