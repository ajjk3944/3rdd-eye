package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4759l5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41170a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41171b;

    public C4759l5(String str, String str2) {
        this.f41170a = str;
        this.f41171b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f41171b);
    }

    public final String b() {
        return this.f41171b;
    }

    public final String c() {
        return this.f41170a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f41170a + "_" + ApiKeyUtils.createPartialApiKey(this.f41171b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4759l5 c4759l5 = (C4759l5) obj;
            String str = this.f41170a;
            if (str == null ? c4759l5.f41170a != null : !str.equals(c4759l5.f41170a)) {
                return false;
            }
            String str2 = this.f41171b;
            String str3 = c4759l5.f41171b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f41170a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f41171b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f41170a + "_" + this.f41171b;
    }
}
