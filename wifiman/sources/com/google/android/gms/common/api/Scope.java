package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s3.AbstractC7901p;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC8026a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f34712a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34713b;

    Scope(int i10, String str) {
        AbstractC7901p.g(str, "scopeUri must not be null or empty");
        this.f34712a = i10;
        this.f34713b = str;
    }

    public String b() {
        return this.f34713b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f34713b.equals(((Scope) obj).f34713b);
        }
        return false;
    }

    public int hashCode() {
        return this.f34713b.hashCode();
    }

    public String toString() {
        return this.f34713b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f34712a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.q(parcel, 2, b(), false);
        t3.b.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
