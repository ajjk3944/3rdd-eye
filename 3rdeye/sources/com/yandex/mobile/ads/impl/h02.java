package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;

/* loaded from: classes3.dex */
public final class h02 implements yz0.b {
    public static final Parcelable.Creator<h02> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f28065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28066c;

    public class a implements Parcelable.Creator<h02> {
        @Override // android.os.Parcelable.Creator
        public final h02 createFromParcel(Parcel parcel) {
            return new h02(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h02[] newArray(int i) {
            return new h02[i];
        }
    }

    public /* synthetic */ h02(Parcel parcel, int i) {
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
        if (obj != null && h02.class == obj.getClass()) {
            h02 h02Var = (h02) obj;
            if (this.f28065b == h02Var.f28065b && this.f28066c == h02Var.f28066c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f28065b).hashCode() + 527) * 31) + this.f28066c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f28065b + ", svcTemporalLayerCount=" + this.f28066c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f28065b);
        parcel.writeInt(this.f28066c);
    }

    public h02(int i, float f10) {
        this.f28065b = f10;
        this.f28066c = i;
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }

    private h02(Parcel parcel) {
        this.f28065b = parcel.readFloat();
        this.f28066c = parcel.readInt();
    }
}
