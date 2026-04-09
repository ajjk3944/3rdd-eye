package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yk1 extends ei0 {
    public static final Parcelable.Creator<yk1> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f35850c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f35851d;

    public class a implements Parcelable.Creator<yk1> {
        @Override // android.os.Parcelable.Creator
        public final yk1 createFromParcel(Parcel parcel) {
            return new yk1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final yk1[] newArray(int i) {
            return new yk1[i];
        }
    }

    public yk1(Parcel parcel) {
        super("PRIV");
        this.f35850c = (String) s82.a(parcel.readString());
        this.f35851d = (byte[]) s82.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yk1.class == obj.getClass()) {
            yk1 yk1Var = (yk1) obj;
            if (s82.a(this.f35850c, yk1Var.f35850c) && Arrays.equals(this.f35851d, yk1Var.f35851d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35850c;
        return Arrays.hashCode(this.f35851d) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": owner=" + this.f35850c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35850c);
        parcel.writeByteArray(this.f35851d);
    }

    public yk1(String str, byte[] bArr) {
        super("PRIV");
        this.f35850c = str;
        this.f35851d = bArr;
    }
}
