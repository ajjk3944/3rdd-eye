package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import w.g;
import wc.h;

/* loaded from: classes.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new h(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f5405a;

    /* renamed from: d, reason: collision with root package name */
    public final zzbe f5406d;

    /* renamed from: g, reason: collision with root package name */
    public final String f5407g;

    /* renamed from: r, reason: collision with root package name */
    public final long f5408r;

    public zzbg(zzbg zzbgVar, long j) {
        s.h(zzbgVar);
        this.f5405a = zzbgVar.f5405a;
        this.f5406d = zzbgVar.f5406d;
        this.f5407g = zzbgVar.f5407g;
        this.f5408r = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5406d);
        String str = this.f5407g;
        int length = String.valueOf(str).length();
        String str2 = this.f5405a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        g.q(sb2, "origin=", str, ",name=", str2);
        return g.j(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        h.a(this, parcel, i10);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j) {
        this.f5405a = str;
        this.f5406d = zzbeVar;
        this.f5407g = str2;
        this.f5408r = j;
    }
}
