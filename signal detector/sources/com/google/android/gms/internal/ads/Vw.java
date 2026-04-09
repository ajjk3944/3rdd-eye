package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Vw extends N2.a {
    public static final Parcelable.Creator<Vw> CREATOR = new C1784r8(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f12112a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12114c;

    public Vw(int i, int i3, byte[] bArr) {
        this.f12112a = i;
        this.f12113b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f12114c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f12112a);
        AbstractC0241a.r(parcel, 2, this.f12113b);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f12114c);
        AbstractC0241a.H(parcel, iE);
    }

    public Vw() {
        this(1, 1, null);
    }
}
