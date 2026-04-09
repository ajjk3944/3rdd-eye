package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7901p;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class r7 extends AbstractC8026a {
    public static final Parcelable.Creator<r7> CREATOR = new v7();

    /* renamed from: a, reason: collision with root package name */
    private final int f36712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36713b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36714c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f36715d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36716e;

    /* renamed from: f, reason: collision with root package name */
    public final String f36717f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f36718g;

    r7(u7 u7Var) {
        this(u7Var.f36790c, u7Var.f36791d, u7Var.f36792e, u7Var.f36789b);
    }

    public final Object b() {
        Long l10 = this.f36715d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f36718g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f36716e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, this.f36712a);
        t3.b.q(parcel, 2, this.f36713b, false);
        t3.b.n(parcel, 3, this.f36714c);
        t3.b.o(parcel, 4, this.f36715d, false);
        t3.b.i(parcel, 5, null, false);
        t3.b.q(parcel, 6, this.f36716e, false);
        t3.b.q(parcel, 7, this.f36717f, false);
        t3.b.g(parcel, 8, this.f36718g, false);
        t3.b.b(parcel, iA);
    }

    r7(String str, long j10, Object obj, String str2) {
        AbstractC7901p.f(str);
        this.f36712a = 2;
        this.f36713b = str;
        this.f36714c = j10;
        this.f36717f = str2;
        if (obj == null) {
            this.f36715d = null;
            this.f36718g = null;
            this.f36716e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f36715d = (Long) obj;
            this.f36718g = null;
            this.f36716e = null;
        } else if (obj instanceof String) {
            this.f36715d = null;
            this.f36718g = null;
            this.f36716e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f36715d = null;
            this.f36718g = (Double) obj;
            this.f36716e = null;
        }
    }

    r7(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f36712a = i10;
        this.f36713b = str;
        this.f36714c = j10;
        this.f36715d = l10;
        if (i10 == 1) {
            this.f36718g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f36718g = d10;
        }
        this.f36716e = str2;
        this.f36717f = str3;
    }
}
