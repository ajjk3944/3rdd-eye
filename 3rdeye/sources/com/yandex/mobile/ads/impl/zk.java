package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zk implements Parcelable {
    public static final Parcelable.Creator<zk> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final List<n9> f36537b;

    /* renamed from: c, reason: collision with root package name */
    private final vz0 f36538c;

    public static final class a implements Parcelable.Creator<zk> {
        @Override // android.os.Parcelable.Creator
        public final zk createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i10 = 0; i10 != i; i10++) {
                arrayList.add(n9.CREATOR.createFromParcel(parcel));
            }
            return new zk(arrayList, parcel.readInt() == 0 ? null : vz0.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final zk[] newArray(int i) {
            return new zk[i];
        }
    }

    public zk(ArrayList adUnitIdBiddingSettingsList, vz0 vz0Var) {
        kotlin.jvm.internal.l.f(adUnitIdBiddingSettingsList, "adUnitIdBiddingSettingsList");
        this.f36537b = adUnitIdBiddingSettingsList;
        this.f36538c = vz0Var;
    }

    public final List<n9> c() {
        return this.f36537b;
    }

    public final vz0 d() {
        return this.f36538c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return kotlin.jvm.internal.l.b(this.f36537b, zkVar.f36537b) && kotlin.jvm.internal.l.b(this.f36538c, zkVar.f36538c);
    }

    public final int hashCode() {
        int iHashCode = this.f36537b.hashCode() * 31;
        vz0 vz0Var = this.f36538c;
        return iHashCode + (vz0Var == null ? 0 : vz0Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.f36537b + ", mediationPrefetchSettings=" + this.f36538c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        List<n9> list = this.f36537b;
        out.writeInt(list.size());
        Iterator<n9> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
        vz0 vz0Var = this.f36538c;
        if (vz0Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            vz0Var.writeToParcel(out, i);
        }
    }
}
