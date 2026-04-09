package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2126xQ {

    /* renamed from: a, reason: collision with root package name */
    public final String f17590a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17591b;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2126xQ(String str, String str2) {
        this.f17590a = Vt.o(str);
        this.f17591b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2126xQ.class == obj.getClass()) {
            C2126xQ c2126xQ = (C2126xQ) obj;
            if (Objects.equals(this.f17590a, c2126xQ.f17590a) && Objects.equals(this.f17591b, c2126xQ.f17591b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f17591b.hashCode() * 31;
        String str = this.f17590a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
