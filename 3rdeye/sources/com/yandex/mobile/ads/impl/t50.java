package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.yz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t50 implements yz0.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f33442b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33443c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33444d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33445e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f33446f;

    /* renamed from: g, reason: collision with root package name */
    private int f33447g;

    /* renamed from: h, reason: collision with root package name */
    private static final dc0 f33441h = new dc0.a().e("application/id3").a();
    private static final dc0 i = new dc0.a().e("application/x-scte35").a();
    public static final Parcelable.Creator<t50> CREATOR = new a();

    public class a implements Parcelable.Creator<t50> {
        @Override // android.os.Parcelable.Creator
        public final t50 createFromParcel(Parcel parcel) {
            return new t50(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final t50[] newArray(int i) {
            return new t50[i];
        }
    }

    public t50(Parcel parcel) {
        this.f33442b = (String) s82.a(parcel.readString());
        this.f33443c = (String) s82.a(parcel.readString());
        this.f33444d = parcel.readLong();
        this.f33445e = parcel.readLong();
        this.f33446f = (byte[]) s82.a(parcel.createByteArray());
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final byte[] b() {
        if (a() != null) {
            return this.f33446f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t50.class == obj.getClass()) {
            t50 t50Var = (t50) obj;
            if (this.f33444d == t50Var.f33444d && this.f33445e == t50Var.f33445e && s82.a(this.f33442b, t50Var.f33442b) && s82.a(this.f33443c, t50Var.f33443c) && Arrays.equals(this.f33446f, t50Var.f33446f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f33447g == 0) {
            String str = this.f33442b;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f33443c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j4 = this.f33444d;
            int i10 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j10 = this.f33445e;
            this.f33447g = Arrays.hashCode(this.f33446f) + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f33447g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f33442b + ", id=" + this.f33445e + ", durationMs=" + this.f33444d + ", value=" + this.f33443c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f33442b);
        parcel.writeString(this.f33443c);
        parcel.writeLong(this.f33444d);
        parcel.writeLong(this.f33445e);
        parcel.writeByteArray(this.f33446f);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final dc0 a() {
        String str = this.f33442b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f33441h;
            default:
                return null;
        }
    }

    public t50(String str, String str2, long j4, long j10, byte[] bArr) {
        this.f33442b = str;
        this.f33443c = str2;
        this.f33444d = j4;
        this.f33445e = j10;
        this.f33446f = bArr;
    }
}
