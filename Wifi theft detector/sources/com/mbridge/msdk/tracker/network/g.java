package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f18302a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18303b;

    public g(String str, String str2) {
        this.f18302a = str;
        this.f18303b = str2;
    }

    public final String a() {
        return this.f18302a;
    }

    public final String b() {
        return this.f18303b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f18302a, gVar.f18302a) && TextUtils.equals(this.f18303b, gVar.f18303b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f18302a.hashCode() * 31) + this.f18303b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f18302a + ",value=" + this.f18303b + "]";
    }
}
