package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class nq extends ei0 {
    public static final Parcelable.Creator<nq> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f30972c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30973d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30974e;

    public class a implements Parcelable.Creator<nq> {
        @Override // android.os.Parcelable.Creator
        public final nq createFromParcel(Parcel parcel) {
            return new nq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final nq[] newArray(int i) {
            return new nq[i];
        }
    }

    public nq(Parcel parcel) {
        super("COMM");
        this.f30972c = (String) s82.a(parcel.readString());
        this.f30973d = (String) s82.a(parcel.readString());
        this.f30974e = (String) s82.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nq.class == obj.getClass()) {
            nq nqVar = (nq) obj;
            if (s82.a(this.f30973d, nqVar.f30973d) && s82.a(this.f30972c, nqVar.f30972c) && s82.a(this.f30974e, nqVar.f30974e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30972c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f30973d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30974e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": language=" + this.f30972c + ", description=" + this.f30973d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26869b);
        parcel.writeString(this.f30972c);
        parcel.writeString(this.f30974e);
    }

    public nq(String str, String str2, String str3) {
        super("COMM");
        this.f30972c = str;
        this.f30973d = str2;
        this.f30974e = str3;
    }
}
