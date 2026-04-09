package com.google.firebase.crashlytics.internal.common;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final String f38739a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38740b;

    public K(String str, String str2) {
        this.f38739a = str;
        this.f38740b = str2;
    }

    public final String a() {
        return this.f38740b;
    }

    public final String b() {
        return this.f38739a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return AbstractC6492s.d(this.f38739a, k10.f38739a) && AbstractC6492s.d(this.f38740b, k10.f38740b);
    }

    public int hashCode() {
        String str = this.f38739a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38740b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f38739a + ", authToken=" + this.f38740b + ')';
    }
}
