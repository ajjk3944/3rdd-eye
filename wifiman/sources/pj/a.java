package Pj;

import Mj.h;
import Mj.x;
import Y6.j;
import Y6.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a extends h.a {

    /* renamed from: a, reason: collision with root package name */
    private final r f18708a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18709b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18710c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18711d;

    private a(r rVar, boolean z10, boolean z11, boolean z12) {
        this.f18708a = rVar;
        this.f18709b = z10;
        this.f18710c = z11;
        this.f18711d = z12;
    }

    public static a f() {
        return g(new r.a().c());
    }

    public static a g(r rVar) {
        if (rVar != null) {
            return new a(rVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    private static Set h(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // Mj.h.a
    public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        Y6.h hVarE = this.f18708a.e(type, h(annotationArr));
        if (this.f18709b) {
            hVarE = hVarE.e();
        }
        if (this.f18710c) {
            hVarE = hVarE.a();
        }
        if (this.f18711d) {
            hVarE = hVarE.h();
        }
        return new b(hVarE);
    }

    @Override // Mj.h.a
    public h d(Type type, Annotation[] annotationArr, x xVar) {
        Y6.h hVarE = this.f18708a.e(type, h(annotationArr));
        if (this.f18709b) {
            hVarE = hVarE.e();
        }
        if (this.f18710c) {
            hVarE = hVarE.a();
        }
        if (this.f18711d) {
            hVarE = hVarE.h();
        }
        return new c(hVarE);
    }
}
