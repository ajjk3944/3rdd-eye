package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dh1 implements yz0.b {
    public static final Parcelable.Creator<dh1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f26174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26175c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26176d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26177e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26178f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26179g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26180h;
    public final byte[] i;

    public class a implements Parcelable.Creator<dh1> {
        @Override // android.os.Parcelable.Creator
        public final dh1 createFromParcel(Parcel parcel) {
            return new dh1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final dh1[] newArray(int i) {
            return new dh1[i];
        }
    }

    public dh1(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f26174b = i;
        this.f26175c = str;
        this.f26176d = str2;
        this.f26177e = i10;
        this.f26178f = i11;
        this.f26179g = i12;
        this.f26180h = i13;
        this.i = bArr;
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
        if (obj != null && dh1.class == obj.getClass()) {
            dh1 dh1Var = (dh1) obj;
            if (this.f26174b == dh1Var.f26174b && this.f26175c.equals(dh1Var.f26175c) && this.f26176d.equals(dh1Var.f26176d) && this.f26177e == dh1Var.f26177e && this.f26178f == dh1Var.f26178f && this.f26179g == dh1Var.f26179g && this.f26180h == dh1Var.f26180h && Arrays.equals(this.i, dh1Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.i) + ((((((((C4121h3.a(this.f26176d, C4121h3.a(this.f26175c, (this.f26174b + 527) * 31, 31), 31) + this.f26177e) * 31) + this.f26178f) * 31) + this.f26179g) * 31) + this.f26180h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f26175c + ", description=" + this.f26176d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26174b);
        parcel.writeString(this.f26175c);
        parcel.writeString(this.f26176d);
        parcel.writeInt(this.f26177e);
        parcel.writeInt(this.f26178f);
        parcel.writeInt(this.f26179g);
        parcel.writeInt(this.f26180h);
        parcel.writeByteArray(this.i);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final void a(aw0.a aVar) {
        aVar.a(this.f26174b, this.i);
    }

    public dh1(Parcel parcel) {
        this.f26174b = parcel.readInt();
        this.f26175c = (String) s82.a(parcel.readString());
        this.f26176d = (String) s82.a(parcel.readString());
        this.f26177e = parcel.readInt();
        this.f26178f = parcel.readInt();
        this.f26179g = parcel.readInt();
        this.f26180h = parcel.readInt();
        this.i = (byte[]) s82.a(parcel.createByteArray());
    }
}
