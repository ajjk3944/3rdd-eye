package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class e82 extends ei0 {
    public static final Parcelable.Creator<e82> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26733c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26734d;

    public class a implements Parcelable.Creator<e82> {
        @Override // android.os.Parcelable.Creator
        public final e82 createFromParcel(Parcel parcel) {
            return new e82(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e82[] newArray(int i) {
            return new e82[i];
        }
    }

    public e82(Parcel parcel) {
        super((String) s82.a(parcel.readString()));
        this.f26733c = parcel.readString();
        this.f26734d = (String) s82.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e82.class == obj.getClass()) {
            e82 e82Var = (e82) obj;
            if (this.f26869b.equals(e82Var.f26869b) && s82.a(this.f26733c, e82Var.f26733c) && s82.a(this.f26734d, e82Var.f26734d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f26869b, 527, 31);
        String str = this.f26733c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26734d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": url=" + this.f26734d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26869b);
        parcel.writeString(this.f26733c);
        parcel.writeString(this.f26734d);
    }

    public e82(String str, String str2, String str3) {
        super(str);
        this.f26733c = str2;
        this.f26734d = str3;
    }
}
