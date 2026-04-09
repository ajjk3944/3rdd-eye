package com.google.android.gms.common.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new l(24);
    public final String B;
    public final int D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public final int f4837a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4838d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4839g;

    /* renamed from: r, reason: collision with root package name */
    public final long f4840r;

    /* renamed from: x, reason: collision with root package name */
    public final long f4841x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4842y;

    public MethodInvocation(int i10, int i11, int i12, long j, long j7, String str, String str2, int i13, int i14) {
        this.f4837a = i10;
        this.f4838d = i11;
        this.f4839g = i12;
        this.f4840r = j;
        this.f4841x = j7;
        this.f4842y = str;
        this.B = str2;
        this.D = i13;
        this.E = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4837a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f4838d);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4839g);
        i4.S(parcel, 4, 8);
        parcel.writeLong(this.f4840r);
        i4.S(parcel, 5, 8);
        parcel.writeLong(this.f4841x);
        i4.P(parcel, 6, this.f4842y);
        i4.P(parcel, 7, this.B);
        i4.S(parcel, 8, 4);
        parcel.writeInt(this.D);
        i4.S(parcel, 9, 4);
        parcel.writeInt(this.E);
        i4.W(parcel, iU);
    }
}
