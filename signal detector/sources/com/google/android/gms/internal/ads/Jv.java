package com.google.android.gms.internal.ads;

import j$.util.Objects;
import j2.EnumC2546b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Jv {

    /* renamed from: a, reason: collision with root package name */
    public final String f9395a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC2546b f9396b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9397c;

    public /* synthetic */ Jv(C1338iu c1338iu) {
        this.f9395a = (String) c1338iu.f14822b;
        this.f9396b = (EnumC2546b) c1338iu.f14823c;
        this.f9397c = (String) c1338iu.f14824d;
    }

    public final String a() {
        EnumC2546b enumC2546b = this.f9396b;
        return enumC2546b == null ? "unknown" : enumC2546b.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        EnumC2546b enumC2546b;
        EnumC2546b enumC2546b2;
        if (obj instanceof Jv) {
            Jv jv = (Jv) obj;
            if (this.f9395a.equals(jv.f9395a) && (enumC2546b = this.f9396b) != null && (enumC2546b2 = jv.f9396b) != null && enumC2546b.equals(enumC2546b2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9395a, this.f9396b);
    }
}
