package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class de0 extends ei0 {
    public static final Parcelable.Creator<de0> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26145c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26146d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26147e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f26148f;

    public class a implements Parcelable.Creator<de0> {
        @Override // android.os.Parcelable.Creator
        public final de0 createFromParcel(Parcel parcel) {
            return new de0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final de0[] newArray(int i) {
            return new de0[i];
        }
    }

    public de0(Parcel parcel) {
        super("GEOB");
        this.f26145c = (String) s82.a(parcel.readString());
        this.f26146d = (String) s82.a(parcel.readString());
        this.f26147e = (String) s82.a(parcel.readString());
        this.f26148f = (byte[]) s82.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && de0.class == obj.getClass()) {
            de0 de0Var = (de0) obj;
            if (s82.a(this.f26145c, de0Var.f26145c) && s82.a(this.f26146d, de0Var.f26146d) && s82.a(this.f26147e, de0Var.f26147e) && Arrays.equals(this.f26148f, de0Var.f26148f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26145c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f26146d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26147e;
        return Arrays.hashCode(this.f26148f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": mimeType=" + this.f26145c + ", filename=" + this.f26146d + ", description=" + this.f26147e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26145c);
        parcel.writeString(this.f26146d);
        parcel.writeString(this.f26147e);
        parcel.writeByteArray(this.f26148f);
    }

    public de0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f26145c = str;
        this.f26146d = str2;
        this.f26147e = str3;
        this.f26148f = bArr;
    }
}
