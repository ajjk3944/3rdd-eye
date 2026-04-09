package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class dp0 extends ei0 {
    public static final Parcelable.Creator<dp0> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26284c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26285d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26286e;

    public class a implements Parcelable.Creator<dp0> {
        @Override // android.os.Parcelable.Creator
        public final dp0 createFromParcel(Parcel parcel) {
            return new dp0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final dp0[] newArray(int i) {
            return new dp0[i];
        }
    }

    public dp0(Parcel parcel) {
        super("----");
        this.f26284c = (String) s82.a(parcel.readString());
        this.f26285d = (String) s82.a(parcel.readString());
        this.f26286e = (String) s82.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dp0.class == obj.getClass()) {
            dp0 dp0Var = (dp0) obj;
            if (s82.a(this.f26285d, dp0Var.f26285d) && s82.a(this.f26284c, dp0Var.f26284c) && s82.a(this.f26286e, dp0Var.f26286e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26284c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f26285d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26286e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": domain=" + this.f26284c + ", description=" + this.f26285d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26869b);
        parcel.writeString(this.f26284c);
        parcel.writeString(this.f26286e);
    }

    public dp0(String str, String str2, String str3) {
        super("----");
        this.f26284c = str;
        this.f26285d = str2;
        this.f26286e = str3;
    }
}
