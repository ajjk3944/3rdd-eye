package Mj;

import Mj.h;
import Yg.J;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: Mj.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3307b extends h.a {

    /* renamed from: Mj.b$a */
    static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        static final a f13322a = new a();

        a() {
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            try {
                return B.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: Mj.b$b, reason: collision with other inner class name */
    static final class C0532b implements h {

        /* renamed from: a, reason: collision with root package name */
        static final C0532b f13323a = new C0532b();

        C0532b() {
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: Mj.b$c */
    static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        static final c f13324a = new c();

        c() {
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: Mj.b$d */
    static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        static final d f13325a = new d();

        d() {
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: Mj.b$e */
    static final class e implements h {

        /* renamed from: a, reason: collision with root package name */
        static final e f13326a = new e();

        e() {
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public J a(ResponseBody responseBody) {
            responseBody.close();
            return J.f24997a;
        }
    }

    /* renamed from: Mj.b$f */
    static final class f implements h {

        /* renamed from: a, reason: collision with root package name */
        static final f f13327a = new f();

        f() {
        }

        @Override // Mj.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    C3307b() {
    }

    @Override // Mj.h.a
    public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        if (RequestBody.class.isAssignableFrom(B.h(type))) {
            return C0532b.f13323a;
        }
        return null;
    }

    @Override // Mj.h.a
    public h d(Type type, Annotation[] annotationArr, x xVar) {
        if (type == ResponseBody.class) {
            return B.l(annotationArr, Rj.w.class) ? c.f13324a : a.f13322a;
        }
        if (type == Void.class) {
            return f.f13327a;
        }
        if (B.m(type)) {
            return e.f13326a;
        }
        return null;
    }
}
