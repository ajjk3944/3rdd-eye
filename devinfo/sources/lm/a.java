package lm;

import com.google.gson.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jf.c;
import km.l;
import km.m;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final j f28844a;

    public a(j jVar) {
        this.f28844a = jVar;
    }

    @Override // km.l
    public final m a(Type type) {
        xf.a aVar = new xf.a(type);
        j jVar = this.f28844a;
        return new b(jVar, jVar.d(aVar));
    }

    @Override // km.l
    public final m b(Type type, Annotation[] annotationArr, o oVar) {
        xf.a aVar = new xf.a(type);
        j jVar = this.f28844a;
        return new c(jVar, jVar.d(aVar));
    }
}
