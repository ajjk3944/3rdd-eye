package o6;

import A7.b;
import N7.B8;
import a7.AbstractC1664a;
import a7.C1665b;
import a7.C1668e;
import a7.s;
import j6.C5195A;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l;
import l7.j;
import p6.h;
import s6.k;

/* compiled from: ExpressionResolverImpl.kt */
/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5425b implements A7.d {

    /* renamed from: b, reason: collision with root package name */
    public final String f44848b;

    /* renamed from: c, reason: collision with root package name */
    public final h f44849c;

    /* renamed from: d, reason: collision with root package name */
    public final k f44850d;

    /* renamed from: e, reason: collision with root package name */
    public final C1668e f44851e;

    /* renamed from: f, reason: collision with root package name */
    public final Q6.c f44852f;

    /* renamed from: g, reason: collision with root package name */
    public final a f44853g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f44854h;
    public final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f44855j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44856k;

    /* compiled from: ExpressionResolverImpl.kt */
    /* renamed from: o6.b$a */
    public interface a {
        void a(C5425b c5425b, k kVar, H7.e eVar);
    }

    public C5425b(String path, h runtimeStore, k kVar, C1668e c1668e, Q6.c cVar, a onCreateCallback) {
        l.f(path, "path");
        l.f(runtimeStore, "runtimeStore");
        l.f(onCreateCallback, "onCreateCallback");
        this.f44848b = path;
        this.f44849c = runtimeStore;
        this.f44850d = kVar;
        this.f44851e = c1668e;
        this.f44852f = cVar;
        this.f44853g = onCreateCallback;
        this.f44854h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.f44855j = new LinkedHashMap();
        H7.e eVar = (H7.e) c1668e.f14211a.f13450c;
        l.d(eVar, "null cannot be cast to non-null type com.yandex.div.core.expression.FunctionProviderDecorator");
        onCreateCallback.a(this, kVar, eVar);
    }

    @Override // A7.d
    public final <R, T> T a(String expressionKey, String rawExpression, AbstractC1664a abstractC1664a, p9.l<? super R, ? extends T> lVar, l7.l<T> validator, j<T> fieldType, z7.c logger) {
        l.f(expressionKey, "expressionKey");
        l.f(rawExpression, "rawExpression");
        l.f(validator, "validator");
        l.f(fieldType, "fieldType");
        l.f(logger, "logger");
        try {
            return (T) e(expressionKey, rawExpression, abstractC1664a, lVar, validator, fieldType);
        } catch (z7.d e4) {
            if (e4.f48476b == z7.f.MISSING_VARIABLE) {
                if (this.f44856k) {
                    throw z7.e.f48479a;
                }
                throw e4;
            }
            logger.d(e4);
            this.f44852f.a(e4);
            return (T) e(expressionKey, rawExpression, abstractC1664a, lVar, validator, fieldType);
        }
    }

    @Override // A7.d
    public final void b(z7.d dVar) {
        this.f44852f.a(dVar);
    }

    @Override // A7.d
    public final j6.d c(final String rawExpression, List list, final b.c.a aVar) {
        l.f(rawExpression, "rawExpression");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LinkedHashMap linkedHashMap = this.i;
            Object linkedHashSet = linkedHashMap.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(str, linkedHashSet);
            }
            ((Set) linkedHashSet).add(rawExpression);
        }
        LinkedHashMap linkedHashMap2 = this.f44855j;
        Object c5195a = linkedHashMap2.get(rawExpression);
        if (c5195a == null) {
            c5195a = new C5195A();
            linkedHashMap2.put(rawExpression, c5195a);
        }
        ((C5195A) c5195a).b(aVar);
        return new j6.d() { // from class: o6.a
            @Override // java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                C5425b this$0 = this.f44845b;
                l.f(this$0, "this$0");
                String rawExpression2 = rawExpression;
                l.f(rawExpression2, "$rawExpression");
                b.c.a aVar2 = aVar;
                C5195A c5195a2 = (C5195A) this$0.f44855j.get(rawExpression2);
                if (c5195a2 != null) {
                    c5195a2.c(aVar2);
                }
            }
        };
    }

    public final <R> R d(String str, AbstractC1664a abstractC1664a) {
        LinkedHashMap linkedHashMap = this.f44854h;
        R r9 = (R) linkedHashMap.get(str);
        if (r9 != null) {
            return r9;
        }
        R r10 = (R) this.f44851e.b(abstractC1664a);
        if (abstractC1664a.f14168b) {
            for (String str2 : abstractC1664a.c()) {
                LinkedHashMap linkedHashMap2 = this.i;
                Object linkedHashSet = linkedHashMap2.get(str2);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    linkedHashMap2.put(str2, linkedHashSet);
                }
                ((Set) linkedHashSet).add(str);
            }
            linkedHashMap.put(str, r10);
        }
        return r10;
    }

    public final <R, T> T e(String key, String expression, AbstractC1664a abstractC1664a, p9.l<? super R, ? extends T> lVar, l7.l<T> lVar2, j<T> jVar) {
        T tInvoke;
        try {
            Object obj = (Object) d(expression, abstractC1664a);
            if (!jVar.b(obj)) {
                if (lVar == null) {
                    tInvoke = (T) obj;
                } else {
                    try {
                        tInvoke = lVar.invoke(obj);
                    } catch (ClassCastException e4) {
                        throw z7.e.j(key, expression, obj, e4);
                    } catch (Exception e10) {
                        z7.d dVar = z7.e.f48479a;
                        l.f(key, "expressionKey");
                        l.f(expression, "rawExpression");
                        z7.f fVar = z7.f.INVALID_VALUE;
                        StringBuilder sbD = j6.l.d("Field '", key, "' with expression '", expression, "' received wrong value: '");
                        sbD.append(obj);
                        sbD.append('\'');
                        throw new z7.d(fVar, sbD.toString(), e10, null, null, 24);
                    }
                }
                if (tInvoke != null && (jVar.a() instanceof String) && !jVar.b(tInvoke)) {
                    tInvoke = String.valueOf(tInvoke);
                }
                if (tInvoke == null) {
                    z7.d dVar2 = z7.e.f48479a;
                    l.f(key, "key");
                    l.f(expression, "path");
                    z7.f fVar2 = z7.f.INVALID_VALUE;
                    StringBuilder sb = new StringBuilder("Value '");
                    sb.append(z7.e.i(obj));
                    sb.append("' for key '");
                    sb.append(key);
                    sb.append("' at path '");
                    throw new z7.d(fVar2, B4.f.c(sb, expression, "' is not valid"), null, null, null, 28);
                }
                obj = (T) tInvoke;
            }
            try {
                if (lVar2.e(obj)) {
                    return (T) obj;
                }
                throw z7.e.c(obj, expression);
            } catch (ClassCastException e11) {
                throw z7.e.j(key, expression, obj, e11);
            }
        } catch (C1665b e12) {
            String str = e12 instanceof s ? ((s) e12).f14234b : null;
            if (str == null) {
                throw z7.e.h(key, expression, e12);
            }
            z7.d dVar3 = z7.e.f48479a;
            l.f(key, "key");
            l.f(expression, "expression");
            throw new z7.d(z7.f.MISSING_VARIABLE, B8.j(j6.l.d("Undefined variable '", str, "' at \"", key, "\": \""), expression, '\"'), e12, null, null, 24);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5425b)) {
            return false;
        }
        C5425b c5425b = (C5425b) obj;
        if (this.f44849c != c5425b.f44849c) {
            return false;
        }
        return l.b(this.f44848b, c5425b.f44848b);
    }

    public final int hashCode() {
        return this.f44849c.hashCode() + (this.f44848b.hashCode() * 31);
    }
}
