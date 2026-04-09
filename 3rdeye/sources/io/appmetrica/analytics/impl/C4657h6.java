package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4657h6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        E9 e92;
        Bundle bundle = parcel.readBundle(T6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i = bundle.getInt("CounterReport.Source");
            E9[] e9ArrValues = E9.values();
            int length = e9ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    e92 = E9.NATIVE;
                    break;
                }
                e92 = e9ArrValues[i10];
                if (e92.f39363a == i) {
                    break;
                }
                i10++;
            }
        } else {
            e92 = null;
        }
        C4683i6 c4683i6 = new C4683i6("", "", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = bundle.getInt("CounterReport.Type", -1);
        c4683i6.f41048e = bundle.getInt("CounterReport.CustomType");
        c4683i6.f41045b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        c4683i6.f41046c = bundle.getString("CounterReport.Environment");
        c4683i6.f41044a = bundle.getString("CounterReport.Event");
        c4683i6.f41049f = C4683i6.a(bundle);
        c4683i6.f41050g = bundle.getInt("CounterReport.TRUNCATED");
        c4683i6.f41051h = bundle.getString("CounterReport.ProfileID");
        c4683i6.i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        c4683i6.f41052j = bundle.getLong("CounterReport.CreationTimestamp");
        c4683i6.f41053k = EnumC5046wa.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        c4683i6.f41054l = e92;
        c4683i6.f41055m = bundle.getBundle("CounterReport.Payload");
        c4683i6.f41056n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c4683i6.f41057o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        c4683i6.f41058p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return c4683i6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C4683i6[i];
    }
}
