package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class co extends ei0 {
    public static final Parcelable.Creator<co> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f25723c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25724d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25725e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25726f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25727g;

    /* renamed from: h, reason: collision with root package name */
    private final ei0[] f25728h;

    public class a implements Parcelable.Creator<co> {
        @Override // android.os.Parcelable.Creator
        public final co createFromParcel(Parcel parcel) {
            return new co(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final co[] newArray(int i) {
            return new co[i];
        }
    }

    public co(Parcel parcel) {
        super("CHAP");
        this.f25723c = (String) s82.a(parcel.readString());
        this.f25724d = parcel.readInt();
        this.f25725e = parcel.readInt();
        this.f25726f = parcel.readLong();
        this.f25727g = parcel.readLong();
        int i = parcel.readInt();
        this.f25728h = new ei0[i];
        for (int i10 = 0; i10 < i; i10++) {
            this.f25728h[i10] = (ei0) parcel.readParcelable(ei0.class.getClassLoader());
        }
    }

    @Override // com.yandex.mobile.ads.impl.ei0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && co.class == obj.getClass()) {
            co coVar = (co) obj;
            if (this.f25724d == coVar.f25724d && this.f25725e == coVar.f25725e && this.f25726f == coVar.f25726f && this.f25727g == coVar.f25727g && s82.a(this.f25723c, coVar.f25723c) && Arrays.equals(this.f25728h, coVar.f25728h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f25724d + 527) * 31) + this.f25725e) * 31) + ((int) this.f25726f)) * 31) + ((int) this.f25727g)) * 31;
        String str = this.f25723c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25723c);
        parcel.writeInt(this.f25724d);
        parcel.writeInt(this.f25725e);
        parcel.writeLong(this.f25726f);
        parcel.writeLong(this.f25727g);
        parcel.writeInt(this.f25728h.length);
        for (ei0 ei0Var : this.f25728h) {
            parcel.writeParcelable(ei0Var, 0);
        }
    }

    public co(String str, int i, int i10, long j4, long j10, ei0[] ei0VarArr) {
        super("CHAP");
        this.f25723c = str;
        this.f25724d = i;
        this.f25725e = i10;
        this.f25726f = j4;
        this.f25727g = j10;
        this.f25728h = ei0VarArr;
    }
}
