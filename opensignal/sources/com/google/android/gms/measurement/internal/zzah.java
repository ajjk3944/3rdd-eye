package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import wc.h;

/* loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new h(19);
    public final zzbg B;
    public long D;
    public zzbg E;
    public final long F;
    public final zzbg G;

    /* renamed from: a, reason: collision with root package name */
    public String f5397a;

    /* renamed from: d, reason: collision with root package name */
    public String f5398d;

    /* renamed from: g, reason: collision with root package name */
    public zzpl f5399g;

    /* renamed from: r, reason: collision with root package name */
    public long f5400r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5401x;

    /* renamed from: y, reason: collision with root package name */
    public String f5402y;

    public zzah(zzah zzahVar) {
        s.h(zzahVar);
        this.f5397a = zzahVar.f5397a;
        this.f5398d = zzahVar.f5398d;
        this.f5399g = zzahVar.f5399g;
        this.f5400r = zzahVar.f5400r;
        this.f5401x = zzahVar.f5401x;
        this.f5402y = zzahVar.f5402y;
        this.B = zzahVar.B;
        this.D = zzahVar.D;
        this.E = zzahVar.E;
        this.F = zzahVar.F;
        this.G = zzahVar.G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 2, this.f5397a);
        i4.P(parcel, 3, this.f5398d);
        i4.O(parcel, 4, this.f5399g, i10);
        long j = this.f5400r;
        i4.S(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z10 = this.f5401x;
        i4.S(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        i4.P(parcel, 7, this.f5402y);
        i4.O(parcel, 8, this.B, i10);
        long j7 = this.D;
        i4.S(parcel, 9, 8);
        parcel.writeLong(j7);
        i4.O(parcel, 10, this.E, i10);
        i4.S(parcel, 11, 8);
        parcel.writeLong(this.F);
        i4.O(parcel, 12, this.G, i10);
        i4.W(parcel, iU);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z10, String str3, zzbg zzbgVar, long j7, zzbg zzbgVar2, long j10, zzbg zzbgVar3) {
        this.f5397a = str;
        this.f5398d = str2;
        this.f5399g = zzplVar;
        this.f5400r = j;
        this.f5401x = z10;
        this.f5402y = str3;
        this.B = zzbgVar;
        this.D = j7;
        this.E = zzbgVar2;
        this.F = j10;
        this.G = zzbgVar3;
    }
}
