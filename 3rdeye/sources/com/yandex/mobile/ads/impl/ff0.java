package com.yandex.mobile.ads.impl;

import ia.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class ff0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ia.h f27304d;

    /* renamed from: e, reason: collision with root package name */
    public static final ia.h f27305e;

    /* renamed from: f, reason: collision with root package name */
    public static final ia.h f27306f;

    /* renamed from: g, reason: collision with root package name */
    public static final ia.h f27307g;

    /* renamed from: h, reason: collision with root package name */
    public static final ia.h f27308h;
    public static final ia.h i;

    /* renamed from: a, reason: collision with root package name */
    public final ia.h f27309a;

    /* renamed from: b, reason: collision with root package name */
    public final ia.h f27310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27311c;

    static {
        ia.h hVar = ia.h.f38646e;
        f27304d = h.a.c(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f27305e = h.a.c(":status");
        f27306f = h.a.c(":method");
        f27307g = h.a.c(":path");
        f27308h = h.a.c(":scheme");
        i = h.a.c(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ff0(String name, String value) {
        this(h.a.c(name), h.a.c(value));
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        ia.h hVar = ia.h.f38646e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0)) {
            return false;
        }
        ff0 ff0Var = (ff0) obj;
        return kotlin.jvm.internal.l.b(this.f27309a, ff0Var.f27309a) && kotlin.jvm.internal.l.b(this.f27310b, ff0Var.f27310b);
    }

    public final int hashCode() {
        return this.f27310b.hashCode() + (this.f27309a.hashCode() * 31);
    }

    public final String toString() {
        return B4.g.o(this.f27309a.j(), ": ", this.f27310b.j());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ff0(ia.h name, String value) {
        this(name, h.a.c(value));
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        ia.h hVar = ia.h.f38646e;
    }

    public ff0(ia.h name, ia.h value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f27309a = name;
        this.f27310b = value;
        this.f27311c = value.c() + name.c() + 32;
    }
}
