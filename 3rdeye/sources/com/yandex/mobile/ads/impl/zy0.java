package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zy0 implements Parcelable {
    public static final Parcelable.Creator<zy0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f36788b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f36789c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f36790d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f36791e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f36792f;

    /* renamed from: g, reason: collision with root package name */
    private final C4108f4 f36793g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f36794h;

    public static final class a implements Parcelable.Creator<zy0> {
        @Override // android.os.Parcelable.Creator
        public final zy0 createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            kotlin.jvm.internal.l.f(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            for (int i10 = 0; i10 != i; i10++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            C4108f4 c4108f4CreateFromParcel = parcel.readInt() == 0 ? null : C4108f4.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new zy0(string, linkedHashMap2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, c4108f4CreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final zy0[] newArray(int i) {
            return new zy0[i];
        }
    }

    public zy0(String adapter, Map<String, String> networkData, List<String> list, List<String> list2, List<String> list3, C4108f4 c4108f4, Map<String, String> map) {
        kotlin.jvm.internal.l.f(adapter, "adapter");
        kotlin.jvm.internal.l.f(networkData, "networkData");
        this.f36788b = adapter;
        this.f36789c = networkData;
        this.f36790d = list;
        this.f36791e = list2;
        this.f36792f = list3;
        this.f36793g = c4108f4;
        this.f36794h = map;
    }

    public final C4108f4 c() {
        return this.f36793g;
    }

    public final List<String> d() {
        return this.f36792f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f36788b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy0)) {
            return false;
        }
        zy0 zy0Var = (zy0) obj;
        return kotlin.jvm.internal.l.b(this.f36788b, zy0Var.f36788b) && kotlin.jvm.internal.l.b(this.f36789c, zy0Var.f36789c) && kotlin.jvm.internal.l.b(this.f36790d, zy0Var.f36790d) && kotlin.jvm.internal.l.b(this.f36791e, zy0Var.f36791e) && kotlin.jvm.internal.l.b(this.f36792f, zy0Var.f36792f) && kotlin.jvm.internal.l.b(this.f36793g, zy0Var.f36793g) && kotlin.jvm.internal.l.b(this.f36794h, zy0Var.f36794h);
    }

    public final Map<String, String> f() {
        return this.f36794h;
    }

    public final List<String> g() {
        return this.f36791e;
    }

    public final List<String> h() {
        return this.f36790d;
    }

    public final int hashCode() {
        int iHashCode = (this.f36789c.hashCode() + (this.f36788b.hashCode() * 31)) * 31;
        List<String> list = this.f36790d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f36791e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f36792f;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C4108f4 c4108f4 = this.f36793g;
        int iHashCode5 = (iHashCode4 + (c4108f4 == null ? 0 : c4108f4.hashCode())) * 31;
        Map<String, String> map = this.f36794h;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final Map<String, String> i() {
        return this.f36789c;
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.f36788b + ", networkData=" + this.f36789c + ", impressionTrackingUrls=" + this.f36790d + ", clickTrackingUrls=" + this.f36791e + ", adResponseTrackingUrls=" + this.f36792f + ", adImpressionData=" + this.f36793g + ", biddingInfo=" + this.f36794h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f36788b);
        Map<String, String> map = this.f36789c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeStringList(this.f36790d);
        out.writeStringList(this.f36791e);
        out.writeStringList(this.f36792f);
        C4108f4 c4108f4 = this.f36793g;
        if (c4108f4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4108f4.writeToParcel(out, i);
        }
        Map<String, String> map2 = this.f36794h;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeString(entry2.getValue());
        }
    }
}
