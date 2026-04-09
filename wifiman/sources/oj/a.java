package Oj;

import Mj.h;
import Mj.x;
import com.google.gson.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class a extends h.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f17861a;

    private a(e eVar) {
        this.f17861a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        if (eVar != null) {
            return new a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // Mj.h.a
    public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        return new b(this.f17861a, this.f17861a.l(com.google.gson.reflect.a.b(type)));
    }

    @Override // Mj.h.a
    public h d(Type type, Annotation[] annotationArr, x xVar) {
        return new c(this.f17861a, this.f17861a.l(com.google.gson.reflect.a.b(type)));
    }
}
