package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;

/* loaded from: classes3.dex */
public final class ie implements yz0.b {
    public static final Parcelable.Creator<ie> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f28646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28647c;

    public class a implements Parcelable.Creator<ie> {
        @Override // android.os.Parcelable.Creator
        public final ie createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return new ie(parcel.readInt(), string);
        }

        @Override // android.os.Parcelable.Creator
        public final ie[] newArray(int i) {
            return new ie[i];
        }
    }

    public ie(int i, String str) {
        this.f28646b = i;
        this.f28647c = str;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f28646b);
        sb.append(",url=");
        return B4.f.c(sb, this.f28647c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28647c);
        parcel.writeInt(this.f28646b);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }
}
