package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241h2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14414a;

    /* renamed from: b, reason: collision with root package name */
    public final N0 f14415b;

    /* renamed from: c, reason: collision with root package name */
    public final C2154y0 f14416c;

    /* renamed from: d, reason: collision with root package name */
    public final C1348j3 f14417d;

    /* renamed from: e, reason: collision with root package name */
    public final G f14418e;

    static {
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        List list = Collections.EMPTY_LIST;
        C1993v1 c1993v1 = C1993v1.f17203a;
        new G();
        C1348j3 c1348j3 = C1348j3.f14865B;
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C1241h2(String str, G g2, N0 n02, C2154y0 c2154y0, C1348j3 c1348j3) {
        C1993v1 c1993v1 = C1993v1.f17203a;
        this.f14414a = str;
        this.f14415b = n02;
        this.f14416c = c2154y0;
        this.f14417d = c1348j3;
        this.f14418e = g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241h2)) {
            return false;
        }
        C1241h2 c1241h2 = (C1241h2) obj;
        if (!this.f14414a.equals(c1241h2.f14414a) || !this.f14418e.equals(c1241h2.f14418e) || !Objects.equals(this.f14415b, c1241h2.f14415b) || !this.f14416c.equals(c1241h2.f14416c) || !Objects.equals(this.f14417d, c1241h2.f14417d)) {
            return false;
        }
        C1993v1 c1993v1 = C1993v1.f17203a;
        return c1993v1.equals(c1993v1);
    }

    public final int hashCode() {
        int iHashCode = this.f14414a.hashCode() * 31;
        N0 n02 = this.f14415b;
        return (this.f14417d.hashCode() + ((this.f14418e.hashCode() + ((this.f14416c.hashCode() + ((iHashCode + (n02 != null ? n02.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
