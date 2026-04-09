package com.google.gson.internal.bind;

import com.google.gson.p;
import com.google.gson.q;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import t5.C8032c;

/* loaded from: classes3.dex */
public final class d implements q {

    /* renamed from: c, reason: collision with root package name */
    private static final q f38994c;

    /* renamed from: d, reason: collision with root package name */
    private static final q f38995d;

    /* renamed from: a, reason: collision with root package name */
    private final C8032c f38996a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f38997b = new ConcurrentHashMap();

    private static class b implements q {
        private b() {
        }

        @Override // com.google.gson.q
        public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f38994c = new b();
        f38995d = new b();
    }

    public d(C8032c c8032c) {
        this.f38996a = c8032c;
    }

    private static Object a(C8032c c8032c, Class cls) {
        return c8032c.b(com.google.gson.reflect.a.a(cls)).a();
    }

    private static s5.b c(Class cls) {
        return (s5.b) cls.getAnnotation(s5.b.class);
    }

    private q f(Class cls, q qVar) {
        q qVar2 = (q) this.f38997b.putIfAbsent(cls, qVar);
        return qVar2 != null ? qVar2 : qVar;
    }

    @Override // com.google.gson.q
    public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        s5.b bVarC = c(aVar.c());
        if (bVarC == null) {
            return null;
        }
        return d(this.f38996a, eVar, aVar, bVarC, true);
    }

    p d(C8032c c8032c, com.google.gson.e eVar, com.google.gson.reflect.a aVar, s5.b bVar, boolean z10) {
        p pVarB;
        Object objA = a(c8032c, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof p) {
            pVarB = (p) objA;
        } else {
            if (!(objA instanceof q)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            q qVarF = (q) objA;
            if (z10) {
                qVarF = f(aVar.c(), qVarF);
            }
            pVarB = qVarF.b(eVar, aVar);
        }
        return (pVarB == null || !zNullSafe) ? pVarB : pVarB.a();
    }

    public boolean e(com.google.gson.reflect.a aVar, q qVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(qVar);
        if (qVar == f38994c) {
            return true;
        }
        Class clsC = aVar.c();
        q qVar2 = (q) this.f38997b.get(clsC);
        if (qVar2 != null) {
            return qVar2 == qVar;
        }
        s5.b bVarC = c(clsC);
        if (bVarC == null) {
            return false;
        }
        Class clsValue = bVarC.value();
        return q.class.isAssignableFrom(clsValue) && f(clsC, (q) a(this.f38996a, clsValue)) == qVar;
    }
}
