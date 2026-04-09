package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ci0 implements yz0.b {
    public static final Parcelable.Creator<ci0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f25657b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25658c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25659d;

    public class a implements Parcelable.Creator<ci0> {
        @Override // android.os.Parcelable.Creator
        public final ci0 createFromParcel(Parcel parcel) {
            return new ci0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ci0[] newArray(int i) {
            return new ci0[i];
        }
    }

    public ci0(Parcel parcel) {
        this.f25657b = (byte[]) zf.a(parcel.createByteArray());
        this.f25658c = parcel.readString();
        this.f25659d = parcel.readString();
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ dc0 a() {
        return N4.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ byte[] b() {
        return N4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ci0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f25657b, ((ci0) obj).f25657b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25657b);
    }

    public final String toString() {
        String str = this.f25658c;
        String str2 = this.f25659d;
        return B4.i.j(j6.l.d("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), this.f25657b.length, "\"");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f25657b);
        parcel.writeString(this.f25658c);
        parcel.writeString(this.f25659d);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final void a(aw0.a aVar) {
        String str = this.f25658c;
        if (str != null) {
            aVar.i(str);
        }
    }

    public ci0(byte[] bArr, String str, String str2) {
        this.f25657b = bArr;
        this.f25658c = str;
        this.f25659d = str2;
    }
}
