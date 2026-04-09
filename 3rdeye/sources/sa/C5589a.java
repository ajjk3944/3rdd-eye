package sa;

import U9.D;
import U9.F;
import b9.C1992A;
import ia.C4468d;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import sa.f;

/* compiled from: BuiltInConverters.java */
/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5589a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f46190a;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: sa.a$a, reason: collision with other inner class name */
    public static final class C0529a implements sa.f<F, F> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0529a f46191a = new C0529a();

        @Override // sa.f
        public final F convert(F f10) throws IOException {
            F f11 = f10;
            try {
                C4468d c4468d = new C4468d();
                f11.source().o(c4468d);
                return F.create(f11.contentType(), f11.contentLength(), c4468d);
            } finally {
                f11.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: sa.a$b */
    public static final class b implements sa.f<D, D> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f46192a = new b();

        @Override // sa.f
        public final D convert(D d10) throws IOException {
            return d10;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: sa.a$c */
    public static final class c implements sa.f<F, F> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46193a = new c();

        @Override // sa.f
        public final F convert(F f10) throws IOException {
            return f10;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: sa.a$d */
    public static final class d implements sa.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f46194a = new d();

        @Override // sa.f
        public final String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: sa.a$e */
    public static final class e implements sa.f<F, C1992A> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f46195a = new e();

        @Override // sa.f
        public final C1992A convert(F f10) throws IOException {
            f10.close();
            return C1992A.f18074a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: sa.a$f */
    public static final class f implements sa.f<F, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f46196a = new f();

        @Override // sa.f
        public final Void convert(F f10) throws IOException {
            f10.close();
            return null;
        }
    }

    @Override // sa.f.a
    public final sa.f a(Type type) {
        if (D.class.isAssignableFrom(A.e(type))) {
            return b.f46192a;
        }
        return null;
    }

    @Override // sa.f.a
    public final sa.f<F, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (type == F.class) {
            return A.h(annotationArr, ua.w.class) ? c.f46193a : C0529a.f46191a;
        }
        if (type == Void.class) {
            return f.f46196a;
        }
        if (!this.f46190a || type != C1992A.class) {
            return null;
        }
        try {
            return e.f46195a;
        } catch (NoClassDefFoundError unused) {
            this.f46190a = false;
            return null;
        }
    }
}
