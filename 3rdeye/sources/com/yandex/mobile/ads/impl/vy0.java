package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vy0 implements Parcelable {
    public static final Parcelable.Creator<vy0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final List<zy0> f34736b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f34737c;

    public static final class a implements Parcelable.Creator<vy0> {
        @Override // android.os.Parcelable.Creator
        public final vy0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i10 = 0; i10 != i; i10++) {
                arrayList.add(zy0.CREATOR.createFromParcel(parcel));
            }
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new vy0(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final vy0[] newArray(int i) {
            return new vy0[i];
        }
    }

    public vy0(ArrayList mediationNetworks, Map passbackParameters) {
        kotlin.jvm.internal.l.f(mediationNetworks, "mediationNetworks");
        kotlin.jvm.internal.l.f(passbackParameters, "passbackParameters");
        this.f34736b = mediationNetworks;
        this.f34737c = passbackParameters;
    }

    public final List<zy0> c() {
        return this.f34736b;
    }

    public final Map<String, String> d() {
        return this.f34737c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        List<zy0> list = this.f34736b;
        out.writeInt(list.size());
        Iterator<zy0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
        Map<String, String> map = this.f34737c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }
}
