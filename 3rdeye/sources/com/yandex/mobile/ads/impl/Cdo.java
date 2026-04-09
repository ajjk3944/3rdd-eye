package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo extends ei0 {
    public static final Parcelable.Creator<Cdo> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26278c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26279d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26280e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f26281f;

    /* renamed from: g, reason: collision with root package name */
    private final ei0[] f26282g;

    /* renamed from: com.yandex.mobile.ads.impl.do$a */
    public class a implements Parcelable.Creator<Cdo> {
        @Override // android.os.Parcelable.Creator
        public final Cdo createFromParcel(Parcel parcel) {
            return new Cdo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Cdo[] newArray(int i) {
            return new Cdo[i];
        }
    }

    public Cdo(Parcel parcel) {
        super("CTOC");
        this.f26278c = (String) s82.a(parcel.readString());
        this.f26279d = parcel.readByte() != 0;
        this.f26280e = parcel.readByte() != 0;
        this.f26281f = (String[]) s82.a(parcel.createStringArray());
        int i = parcel.readInt();
        this.f26282g = new ei0[i];
        for (int i10 = 0; i10 < i; i10++) {
            this.f26282g[i10] = (ei0) parcel.readParcelable(ei0.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Cdo.class == obj.getClass()) {
            Cdo cdo = (Cdo) obj;
            if (this.f26279d == cdo.f26279d && this.f26280e == cdo.f26280e && s82.a(this.f26278c, cdo.f26278c) && Arrays.equals(this.f26281f, cdo.f26281f) && Arrays.equals(this.f26282g, cdo.f26282g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f26279d ? 1 : 0) + 527) * 31) + (this.f26280e ? 1 : 0)) * 31;
        String str = this.f26278c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26278c);
        parcel.writeByte(this.f26279d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f26280e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f26281f);
        parcel.writeInt(this.f26282g.length);
        for (ei0 ei0Var : this.f26282g) {
            parcel.writeParcelable(ei0Var, 0);
        }
    }

    public Cdo(String str, boolean z10, boolean z11, String[] strArr, ei0[] ei0VarArr) {
        super("CTOC");
        this.f26278c = str;
        this.f26279d = z10;
        this.f26280e = z11;
        this.f26281f = strArr;
        this.f26282g = ei0VarArr;
    }
}
