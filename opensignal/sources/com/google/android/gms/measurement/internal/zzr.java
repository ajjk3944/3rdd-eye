package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;
import wc.h;

/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new h(28);
    public final String B;
    public final boolean D;
    public final boolean E;
    public final long F;
    public final String G;
    public final long H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final Boolean L;
    public final long M;
    public final List N;
    public final String O;
    public final String P;
    public final String Q;
    public final boolean R;
    public final long S;
    public final int T;
    public final String U;
    public final int V;
    public final long W;
    public final String X;
    public final String Y;
    public final long Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f5426a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f5427a0;

    /* renamed from: d, reason: collision with root package name */
    public final String f5428d;

    /* renamed from: g, reason: collision with root package name */
    public final String f5429g;

    /* renamed from: r, reason: collision with root package name */
    public final String f5430r;

    /* renamed from: x, reason: collision with root package name */
    public final long f5431x;

    /* renamed from: y, reason: collision with root package name */
    public final long f5432y;

    public zzr(String str, String str2, String str3, long j, String str4, long j7, long j10, String str5, boolean z10, boolean z11, String str6, long j11, int i10, boolean z12, boolean z13, Boolean bool, long j12, List list, String str7, String str8, String str9, boolean z14, long j13, int i11, String str10, int i12, long j14, String str11, String str12, long j15, int i13) {
        s.e(str);
        this.f5426a = str;
        this.f5428d = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f5429g = str3;
        this.F = j;
        this.f5430r = str4;
        this.f5431x = j7;
        this.f5432y = j10;
        this.B = str5;
        this.D = z10;
        this.E = z11;
        this.G = str6;
        this.H = j11;
        this.I = i10;
        this.J = z12;
        this.K = z13;
        this.L = bool;
        this.M = j12;
        this.N = list;
        this.O = str7;
        this.P = str8;
        this.Q = str9;
        this.R = z14;
        this.S = j13;
        this.T = i11;
        this.U = str10;
        this.V = i12;
        this.W = j14;
        this.X = str11;
        this.Y = str12;
        this.Z = j15;
        this.f5427a0 = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 2, this.f5426a);
        i4.P(parcel, 3, this.f5428d);
        i4.P(parcel, 4, this.f5429g);
        i4.P(parcel, 5, this.f5430r);
        i4.S(parcel, 6, 8);
        parcel.writeLong(this.f5431x);
        i4.S(parcel, 7, 8);
        parcel.writeLong(this.f5432y);
        i4.P(parcel, 8, this.B);
        i4.S(parcel, 9, 4);
        parcel.writeInt(this.D ? 1 : 0);
        i4.S(parcel, 10, 4);
        parcel.writeInt(this.E ? 1 : 0);
        i4.S(parcel, 11, 8);
        parcel.writeLong(this.F);
        i4.P(parcel, 12, this.G);
        i4.S(parcel, 14, 8);
        parcel.writeLong(this.H);
        i4.S(parcel, 15, 4);
        parcel.writeInt(this.I);
        i4.S(parcel, 16, 4);
        parcel.writeInt(this.J ? 1 : 0);
        i4.S(parcel, 18, 4);
        parcel.writeInt(this.K ? 1 : 0);
        Boolean bool = this.L;
        if (bool != null) {
            i4.S(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        i4.S(parcel, 22, 8);
        parcel.writeLong(this.M);
        List<String> list = this.N;
        if (list != null) {
            int iU2 = i4.U(parcel, 23);
            parcel.writeStringList(list);
            i4.W(parcel, iU2);
        }
        i4.P(parcel, 25, this.O);
        i4.P(parcel, 26, this.P);
        i4.P(parcel, 27, this.Q);
        i4.S(parcel, 28, 4);
        parcel.writeInt(this.R ? 1 : 0);
        i4.S(parcel, 29, 8);
        parcel.writeLong(this.S);
        i4.S(parcel, 30, 4);
        parcel.writeInt(this.T);
        i4.P(parcel, 31, this.U);
        i4.S(parcel, 32, 4);
        parcel.writeInt(this.V);
        i4.S(parcel, 34, 8);
        parcel.writeLong(this.W);
        i4.P(parcel, 35, this.X);
        i4.P(parcel, 36, this.Y);
        i4.S(parcel, 37, 8);
        parcel.writeLong(this.Z);
        i4.S(parcel, 38, 4);
        parcel.writeInt(this.f5427a0);
        i4.W(parcel, iU);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j7, String str5, boolean z10, boolean z11, long j10, String str6, long j11, int i10, boolean z12, boolean z13, Boolean bool, long j12, ArrayList arrayList, String str7, String str8, String str9, boolean z14, long j13, int i11, String str10, int i12, long j14, String str11, String str12, long j15, int i13) {
        this.f5426a = str;
        this.f5428d = str2;
        this.f5429g = str3;
        this.F = j10;
        this.f5430r = str4;
        this.f5431x = j;
        this.f5432y = j7;
        this.B = str5;
        this.D = z10;
        this.E = z11;
        this.G = str6;
        this.H = j11;
        this.I = i10;
        this.J = z12;
        this.K = z13;
        this.L = bool;
        this.M = j12;
        this.N = arrayList;
        this.O = str7;
        this.P = str8;
        this.Q = str9;
        this.R = z14;
        this.S = j13;
        this.T = i11;
        this.U = str10;
        this.V = i12;
        this.W = j14;
        this.X = str11;
        this.Y = str12;
        this.Z = j15;
        this.f5427a0 = i13;
    }
}
