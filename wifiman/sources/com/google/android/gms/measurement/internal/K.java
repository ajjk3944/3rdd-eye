package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class K extends AbstractC8026a implements Iterable {
    public static final Parcelable.Creator<K> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f35952a;

    K(Bundle bundle) {
        this.f35952a = bundle;
    }

    public final int b() {
        return this.f35952a.size();
    }

    final Double f(String str) {
        return Double.valueOf(this.f35952a.getDouble(str));
    }

    public final Bundle g() {
        return new Bundle(this.f35952a);
    }

    final Long i(String str) {
        return Long.valueOf(this.f35952a.getLong(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this);
    }

    final Object j(String str) {
        return this.f35952a.get(str);
    }

    final String k(String str) {
        return this.f35952a.getString(str);
    }

    public final String toString() {
        return this.f35952a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.e(parcel, 2, g(), false);
        t3.b.b(parcel, iA);
    }
}
