package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new a0(29);
    public Integer B;
    public Integer D;
    public String F;
    public Locale J;
    public CharSequence K;
    public CharSequence L;
    public int M;
    public int N;
    public Integer O;
    public Integer Q;
    public Integer R;
    public Integer S;
    public Integer T;
    public Integer U;
    public Integer V;
    public Integer W;
    public Integer X;
    public Integer Y;
    public Boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public int f5469a;

    /* renamed from: a0, reason: collision with root package name */
    public Integer f5470a0;

    /* renamed from: d, reason: collision with root package name */
    public Integer f5471d;

    /* renamed from: g, reason: collision with root package name */
    public Integer f5472g;

    /* renamed from: r, reason: collision with root package name */
    public Integer f5473r;

    /* renamed from: x, reason: collision with root package name */
    public Integer f5474x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f5475y;
    public int E = 255;
    public int G = -2;
    public int H = -2;
    public int I = -2;
    public Boolean P = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5469a);
        parcel.writeSerializable(this.f5471d);
        parcel.writeSerializable(this.f5472g);
        parcel.writeSerializable(this.f5473r);
        parcel.writeSerializable(this.f5474x);
        parcel.writeSerializable(this.f5475y);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        CharSequence charSequence = this.K;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.L;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.M);
        parcel.writeSerializable(this.O);
        parcel.writeSerializable(this.Q);
        parcel.writeSerializable(this.R);
        parcel.writeSerializable(this.S);
        parcel.writeSerializable(this.T);
        parcel.writeSerializable(this.U);
        parcel.writeSerializable(this.V);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.W);
        parcel.writeSerializable(this.X);
        parcel.writeSerializable(this.P);
        parcel.writeSerializable(this.J);
        parcel.writeSerializable(this.Z);
        parcel.writeSerializable(this.f5470a0);
    }
}
