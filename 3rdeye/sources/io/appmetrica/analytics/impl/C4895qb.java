package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4895qb implements Parcelable {
    public static final Parcelable.Creator<C4895qb> CREATOR = new C4869pb();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f41472a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41473b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41474c;

    public C4895qb(T6 t62, List list, Map map) {
        this.f41473b = list;
        this.f41472a = t62;
        this.f41474c = map == null ? new HashMap() : new HashMap(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f41472a);
        if (this.f41473b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f41473b));
        }
        HashMap map = this.f41474c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Dm.a((Map) map));
        }
        parcel.writeBundle(bundle);
    }

    public C4895qb(Parcel parcel) {
        Bundle bundle = parcel.readBundle(T6.class.getClassLoader());
        if (bundle != null) {
            this.f41472a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f41473b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f41474c = Dm.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f41474c = new HashMap();
    }
}
