package com.google.gson.internal.bind;

import com.google.gson.internal.bind.i;
import com.google.gson.p;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import w5.C8268a;
import w5.C8270c;

/* loaded from: classes3.dex */
final class k extends p {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f39043a;

    /* renamed from: b, reason: collision with root package name */
    private final p f39044b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f39045c;

    k(com.google.gson.e eVar, p pVar, Type type) {
        this.f39043a = eVar;
        this.f39044b = pVar;
        this.f39045c = type;
    }

    private static Type e(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean f(p pVar) {
        p pVarE;
        while ((pVar instanceof j) && (pVarE = ((j) pVar).e()) != pVar) {
            pVar = pVarE;
        }
        return pVar instanceof i.c;
    }

    @Override // com.google.gson.p
    public Object b(C8268a c8268a) {
        return this.f39044b.b(c8268a);
    }

    @Override // com.google.gson.p
    public void d(C8270c c8270c, Object obj) {
        p pVarL = this.f39044b;
        Type typeE = e(this.f39045c, obj);
        if (typeE != this.f39045c) {
            pVarL = this.f39043a.l(com.google.gson.reflect.a.b(typeE));
            if ((pVarL instanceof i.c) && !f(this.f39044b)) {
                pVarL = this.f39044b;
            }
        }
        pVarL.d(c8270c, obj);
    }
}
