package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iv1 implements Comparator, Parcelable {
    public static final Parcelable.Creator<iv1> CREATOR = new ci(25);

    /* renamed from: a, reason: collision with root package name */
    public final vu1[] f12493a;

    /* renamed from: b, reason: collision with root package name */
    public int f12494b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12495c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12496d;

    public iv1(Parcel parcel) {
        this.f12495c = parcel.readString();
        vu1[] vu1VarArr = (vu1[]) parcel.createTypedArray(vu1.CREATOR);
        String str = bq0.f9768a;
        this.f12493a = vu1VarArr;
        this.f12496d = vu1VarArr.length;
    }

    public final iv1 a(String str) {
        return Objects.equals(this.f12495c, str) ? this : new iv1(str, false, this.f12493a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        vu1 vu1Var = (vu1) obj2;
        UUID uuid = fx0.f11280a;
        UUID uuid2 = ((vu1) obj).f17722b;
        return uuid.equals(uuid2) ? !uuid.equals(vu1Var.f17722b) ? 1 : 0 : uuid2.compareTo(vu1Var.f17722b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iv1.class == obj.getClass()) {
            iv1 iv1Var = (iv1) obj;
            if (Objects.equals(this.f12495c, iv1Var.f12495c) && Arrays.equals(this.f12493a, iv1Var.f12493a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f12494b;
        if (i4 != 0) {
            return i4;
        }
        String str = this.f12495c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f12493a);
        this.f12494b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f12495c);
        parcel.writeTypedArray(this.f12493a, 0);
    }

    public iv1(String str, boolean z3, vu1... vu1VarArr) {
        this.f12495c = str;
        vu1VarArr = z3 ? (vu1[]) vu1VarArr.clone() : vu1VarArr;
        this.f12493a = vu1VarArr;
        this.f12496d = vu1VarArr.length;
        Arrays.sort(vu1VarArr, this);
    }
}
