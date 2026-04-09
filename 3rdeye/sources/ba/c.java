package ba;

import ia.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: Header.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ia.h f18113d;

    /* renamed from: e, reason: collision with root package name */
    public static final ia.h f18114e;

    /* renamed from: f, reason: collision with root package name */
    public static final ia.h f18115f;

    /* renamed from: g, reason: collision with root package name */
    public static final ia.h f18116g;

    /* renamed from: h, reason: collision with root package name */
    public static final ia.h f18117h;
    public static final ia.h i;

    /* renamed from: a, reason: collision with root package name */
    public final ia.h f18118a;

    /* renamed from: b, reason: collision with root package name */
    public final ia.h f18119b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18120c;

    static {
        ia.h hVar = ia.h.f38646e;
        f18113d = h.a.c(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f18114e = h.a.c(":status");
        f18115f = h.a.c(":method");
        f18116g = h.a.c(":path");
        f18117h = h.a.c(":scheme");
        i = h.a.c(":authority");
    }

    public c(ia.h name, ia.h value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f18118a = name;
        this.f18119b = value;
        this.f18120c = value.c() + name.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.b(this.f18118a, cVar.f18118a) && kotlin.jvm.internal.l.b(this.f18119b, cVar.f18119b);
    }

    public final int hashCode() {
        return this.f18119b.hashCode() + (this.f18118a.hashCode() * 31);
    }

    public final String toString() {
        return this.f18118a.j() + ": " + this.f18119b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String name, String value) {
        this(h.a.c(name), h.a.c(value));
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        ia.h hVar = ia.h.f38646e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ia.h name, String value) {
        this(name, h.a.c(value));
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        ia.h hVar = ia.h.f38646e;
    }
}
