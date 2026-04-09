package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5015v4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41829a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f41830b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41831c;

    public C5015v4(String str, Integer num, String str2) {
        this.f41829a = str;
        this.f41830b = num;
        this.f41831c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5015v4.class == obj.getClass()) {
            C5015v4 c5015v4 = (C5015v4) obj;
            if (!this.f41829a.equals(c5015v4.f41829a)) {
                return false;
            }
            Integer num = this.f41830b;
            if (num == null ? c5015v4.f41830b != null : !num.equals(c5015v4.f41830b)) {
                return false;
            }
            String str = this.f41831c;
            String str2 = c5015v4.f41831c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f41829a.hashCode() * 31;
        Integer num = this.f41830b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f41831c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
