package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class Q6 extends AbstractC8026a {
    public static final Parcelable.Creator<Q6> CREATOR = new T6();

    /* renamed from: a, reason: collision with root package name */
    public final List f36189a;

    Q6(List list) {
        this.f36189a = list;
    }

    public static Q6 b(EnumC4954s5... enumC4954s5Arr) {
        ArrayList arrayList = new ArrayList(enumC4954s5Arr.length);
        for (EnumC4954s5 enumC4954s5 : enumC4954s5Arr) {
            arrayList.add(Integer.valueOf(enumC4954s5.zza()));
        }
        return new Q6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.m(parcel, 1, this.f36189a, false);
        t3.b.b(parcel, iA);
    }
}
