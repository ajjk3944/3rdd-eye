package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class fu0 implements yz0.b {
    public static final Parcelable.Creator<fu0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f27460b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27461c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27462d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27463e;

    public class a implements Parcelable.Creator<fu0> {
        @Override // android.os.Parcelable.Creator
        public final fu0 createFromParcel(Parcel parcel) {
            return new fu0(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final fu0[] newArray(int i) {
            return new fu0[i];
        }
    }

    public /* synthetic */ fu0(Parcel parcel, int i) {
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
        if (obj != null && fu0.class == obj.getClass()) {
            fu0 fu0Var = (fu0) obj;
            if (this.f27460b.equals(fu0Var.f27460b) && Arrays.equals(this.f27461c, fu0Var.f27461c) && this.f27462d == fu0Var.f27462d && this.f27463e == fu0Var.f27463e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f27461c) + C4121h3.a(this.f27460b, 527, 31)) * 31) + this.f27462d) * 31) + this.f27463e;
    }

    public final String toString() {
        return "mdta: key=" + this.f27460b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27460b);
        parcel.writeByteArray(this.f27461c);
        parcel.writeInt(this.f27462d);
        parcel.writeInt(this.f27463e);
    }

    public fu0(int i, int i10, String str, byte[] bArr) {
        this.f27460b = str;
        this.f27461c = bArr;
        this.f27462d = i;
        this.f27463e = i10;
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }

    private fu0(Parcel parcel) {
        this.f27460b = (String) s82.a(parcel.readString());
        this.f27461c = (byte[]) s82.a(parcel.createByteArray());
        this.f27462d = parcel.readInt();
        this.f27463e = parcel.readInt();
    }
}
