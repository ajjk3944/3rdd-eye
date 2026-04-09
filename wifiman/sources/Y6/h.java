package Y6;

import Y6.k;
import a7.C3768a;
import a7.C3769b;
import com.squareup.moshi.JsonDataException;
import ej.C5481e;
import ej.InterfaceC5482f;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class h<T> {

    class a extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f24654a;

        a(h hVar) {
            this.f24654a = hVar;
        }

        @Override // Y6.h
        public Object b(k kVar) {
            return this.f24654a.b(kVar);
        }

        @Override // Y6.h
        boolean d() {
            return this.f24654a.d();
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) {
            boolean zY = oVar.y();
            oVar.m0(true);
            try {
                this.f24654a.j(oVar, obj);
            } finally {
                oVar.m0(zY);
            }
        }

        public String toString() {
            return this.f24654a + ".serializeNulls()";
        }
    }

    class b extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f24656a;

        b(h hVar) {
            this.f24656a = hVar;
        }

        @Override // Y6.h
        public Object b(k kVar) {
            boolean zV = kVar.v();
            kVar.s0(true);
            try {
                return this.f24656a.b(kVar);
            } finally {
                kVar.s0(zV);
            }
        }

        @Override // Y6.h
        boolean d() {
            return true;
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) {
            boolean zC = oVar.C();
            oVar.f0(true);
            try {
                this.f24656a.j(oVar, obj);
            } finally {
                oVar.f0(zC);
            }
        }

        public String toString() {
            return this.f24656a + ".lenient()";
        }
    }

    class c extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f24658a;

        c(h hVar) {
            this.f24658a = hVar;
        }

        @Override // Y6.h
        public Object b(k kVar) {
            boolean zP = kVar.p();
            kVar.r0(true);
            try {
                return this.f24658a.b(kVar);
            } finally {
                kVar.r0(zP);
            }
        }

        @Override // Y6.h
        boolean d() {
            return this.f24658a.d();
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) {
            this.f24658a.j(oVar, obj);
        }

        public String toString() {
            return this.f24658a + ".failOnUnknown()";
        }
    }

    public interface d {
        h a(Type type, Set set, r rVar);
    }

    public final h a() {
        return new c(this);
    }

    public abstract Object b(k kVar);

    public final Object c(String str) {
        k kVarB0 = k.b0(new C5481e().F(str));
        Object objB = b(kVarB0);
        if (d() || kVarB0.d0() == k.c.END_DOCUMENT) {
            return objB;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    boolean d() {
        return false;
    }

    public final h e() {
        return new b(this);
    }

    public final h f() {
        return this instanceof C3768a ? this : new C3768a(this);
    }

    public final h g() {
        return this instanceof C3769b ? this : new C3769b(this);
    }

    public final h h() {
        return new a(this);
    }

    public final String i(Object obj) {
        C5481e c5481e = new C5481e();
        try {
            k(c5481e, obj);
            return c5481e.z0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void j(o oVar, Object obj);

    public final void k(InterfaceC5482f interfaceC5482f, Object obj) {
        j(o.S(interfaceC5482f), obj);
    }
}
