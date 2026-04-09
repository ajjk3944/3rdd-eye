package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class n9 implements Parcelable {
    public static final Parcelable.Creator<n9> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f30800b;

    /* renamed from: c, reason: collision with root package name */
    private final List<zy0> f30801c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30802d;

    public static final class a implements Parcelable.Creator<n9> {
        @Override // android.os.Parcelable.Creator
        public final n9 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i10 = 0; i10 != i; i10++) {
                arrayList.add(zy0.CREATOR.createFromParcel(parcel));
            }
            return new n9(string, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final n9[] newArray(int i) {
            return new n9[i];
        }
    }

    public n9(String adUnitId, String rawData, ArrayList mediationNetworks) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.l.f(mediationNetworks, "mediationNetworks");
        kotlin.jvm.internal.l.f(rawData, "rawData");
        this.f30800b = adUnitId;
        this.f30801c = mediationNetworks;
        this.f30802d = rawData;
    }

    public final String c() {
        return this.f30800b;
    }

    public final String d() {
        return this.f30802d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f30800b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return kotlin.jvm.internal.l.b(this.f30800b, n9Var.f30800b) && kotlin.jvm.internal.l.b(this.f30801c, n9Var.f30801c) && kotlin.jvm.internal.l.b(this.f30802d, n9Var.f30802d);
    }

    public final List<zy0> f() {
        return this.f30801c;
    }

    public final int hashCode() {
        return this.f30802d.hashCode() + m9.a(this.f30801c, this.f30800b.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f30800b;
        List<zy0> list = this.f30801c;
        String str2 = this.f30802d;
        StringBuilder sb = new StringBuilder("AdUnitIdBiddingSettings(adUnitId=");
        sb.append(str);
        sb.append(", mediationNetworks=");
        sb.append(list);
        sb.append(", rawData=");
        return B4.f.c(sb, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f30800b);
        List<zy0> list = this.f30801c;
        out.writeInt(list.size());
        Iterator<zy0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
        out.writeString(this.f30802d);
    }
}
