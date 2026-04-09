package Mj;

import Mj.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class q extends h.a {

    static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private final h f13390a;

        a(h hVar) {
            this.f13390a = hVar;
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional a(ResponseBody responseBody) {
            return Optional.ofNullable(this.f13390a.a(responseBody));
        }
    }

    q() {
    }

    @Override // Mj.h.a
    public h d(Type type, Annotation[] annotationArr, x xVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(xVar.h(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
