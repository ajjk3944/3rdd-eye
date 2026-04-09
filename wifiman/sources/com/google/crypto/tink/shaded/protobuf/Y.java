package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class Y {

    /* renamed from: c, reason: collision with root package name */
    private static final Y f38475c = new Y();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f38477b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final d0 f38476a = new E();

    private Y() {
    }

    public static Y a() {
        return f38475c;
    }

    public c0 b(Class cls, c0 c0Var) {
        AbstractC5097y.b(cls, "messageType");
        AbstractC5097y.b(c0Var, "schema");
        return (c0) this.f38477b.putIfAbsent(cls, c0Var);
    }

    public c0 c(Class cls) {
        AbstractC5097y.b(cls, "messageType");
        c0 c0Var = (c0) this.f38477b.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarA = this.f38476a.a(cls);
        c0 c0VarB = b(cls, c0VarA);
        return c0VarB != null ? c0VarB : c0VarA;
    }

    public c0 d(Object obj) {
        return c(obj.getClass());
    }
}
