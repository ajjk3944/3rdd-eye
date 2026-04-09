package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;

/* loaded from: classes3.dex */
public final class p11 implements yz0.b {
    public static final Parcelable.Creator<p11> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f31561b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31563d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31564e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31565f;

    public class a implements Parcelable.Creator<p11> {
        @Override // android.os.Parcelable.Creator
        public final p11 createFromParcel(Parcel parcel) {
            return new p11(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final p11[] newArray(int i) {
            return new p11[i];
        }
    }

    public /* synthetic */ p11(Parcel parcel, int i) {
        this(parcel);
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
        if (obj != null && p11.class == obj.getClass()) {
            p11 p11Var = (p11) obj;
            if (this.f31561b == p11Var.f31561b && this.f31562c == p11Var.f31562c && this.f31563d == p11Var.f31563d && this.f31564e == p11Var.f31564e && this.f31565f == p11Var.f31565f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f31561b;
        long j10 = this.f31562c;
        int i = (((((int) (j4 ^ (j4 >>> 32))) + 527) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f31563d;
        int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f31564e;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f31565f;
        return i11 + ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f31561b + ", photoSize=" + this.f31562c + ", photoPresentationTimestampUs=" + this.f31563d + ", videoStartPosition=" + this.f31564e + ", videoSize=" + this.f31565f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f31561b);
        parcel.writeLong(this.f31562c);
        parcel.writeLong(this.f31563d);
        parcel.writeLong(this.f31564e);
        parcel.writeLong(this.f31565f);
    }

    public p11(long j4, long j10, long j11, long j12, long j13) {
        this.f31561b = j4;
        this.f31562c = j10;
        this.f31563d = j11;
        this.f31564e = j12;
        this.f31565f = j13;
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }

    private p11(Parcel parcel) {
        this.f31561b = parcel.readLong();
        this.f31562c = parcel.readLong();
        this.f31563d = parcel.readLong();
        this.f31564e = parcel.readLong();
        this.f31565f = parcel.readLong();
    }
}
