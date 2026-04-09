package Mj;

import Mj.B;
import dh.InterfaceC5380e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: classes2.dex */
abstract class m extends y {

    /* renamed from: a, reason: collision with root package name */
    private final v f13350a;

    /* renamed from: b, reason: collision with root package name */
    private final Call.Factory f13351b;

    /* renamed from: c, reason: collision with root package name */
    private final h f13352c;

    static final class a extends m {

        /* renamed from: d, reason: collision with root package name */
        private final e f13353d;

        a(v vVar, Call.Factory factory, h hVar, e eVar) {
            super(vVar, factory, hVar);
            this.f13353d = eVar;
        }

        @Override // Mj.m
        protected Object c(d dVar, Object[] objArr) {
            return this.f13353d.b(dVar);
        }
    }

    static final class b extends m {

        /* renamed from: d, reason: collision with root package name */
        private final e f13354d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f13355e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f13356f;

        b(v vVar, Call.Factory factory, h hVar, e eVar, boolean z10, boolean z11) {
            super(vVar, factory, hVar);
            this.f13354d = eVar;
            this.f13355e = z10;
            this.f13356f = z11;
        }

        @Override // Mj.m
        protected Object c(d dVar, Object[] objArr) {
            d dVar2 = (d) this.f13354d.b(dVar);
            InterfaceC5380e interfaceC5380e = (InterfaceC5380e) objArr[objArr.length - 1];
            try {
                return this.f13356f ? o.d(dVar2, interfaceC5380e) : this.f13355e ? o.b(dVar2, interfaceC5380e) : o.a(dVar2, interfaceC5380e);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return o.e(th2, interfaceC5380e);
            }
        }
    }

    static final class c extends m {

        /* renamed from: d, reason: collision with root package name */
        private final e f13357d;

        c(v vVar, Call.Factory factory, h hVar, e eVar) {
            super(vVar, factory, hVar);
            this.f13357d = eVar;
        }

        @Override // Mj.m
        protected Object c(d dVar, Object[] objArr) {
            d dVar2 = (d) this.f13357d.b(dVar);
            InterfaceC5380e interfaceC5380e = (InterfaceC5380e) objArr[objArr.length - 1];
            try {
                return o.c(dVar2, interfaceC5380e);
            } catch (Exception e10) {
                return o.e(e10, interfaceC5380e);
            }
        }
    }

    m(v vVar, Call.Factory factory, h hVar) {
        this.f13350a = vVar;
        this.f13351b = factory;
        this.f13352c = hVar;
    }

    private static e d(x xVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return xVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw B.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static h e(x xVar, Method method, Type type) {
        try {
            return xVar.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw B.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    static m f(x xVar, Method method, v vVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zM;
        boolean z12 = vVar.f13467l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = B.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (B.h(typeF) == w.class && (typeF instanceof ParameterizedType)) {
                typeF = B.g(0, (ParameterizedType) typeF);
                z10 = true;
                zM = false;
            } else {
                if (B.h(typeF) == d.class) {
                    throw B.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", B.g(0, (ParameterizedType) typeF));
                }
                zM = B.m(typeF);
                z10 = false;
            }
            genericReturnType = new B.b(null, d.class, typeF);
            annotations = A.a(annotations);
            z11 = zM;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        e eVarD = d(xVar, method, genericReturnType, annotations);
        Type typeA = eVarD.a();
        if (typeA == Response.class) {
            throw B.n(method, "'" + B.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == w.class) {
            throw B.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (vVar.f13459d.equals("HEAD") && !Void.class.equals(typeA) && !B.m(typeA)) {
            throw B.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h hVarE = e(xVar, method, typeA);
        Call.Factory factory = xVar.f13498b;
        return !z12 ? new a(vVar, factory, hVarE, eVarD) : z10 ? new c(vVar, factory, hVarE, eVarD) : new b(vVar, factory, hVarE, eVarD, false, z11);
    }

    @Override // Mj.y
    final Object a(Object obj, Object[] objArr) {
        return c(new p(this.f13350a, obj, objArr, this.f13351b, this.f13352c), objArr);
    }

    protected abstract Object c(d dVar, Object[] objArr);
}
