package I9;

import F9.C0663f;
import O6.C1482h;
import O6.D;
import O6.t;
import O6.v;
import Q9.C1552r0;
import T1.B;
import android.graphics.Typeface;
import android.view.View;
import c8.C2074a;
import java.util.List;
import kotlin.jvm.internal.x;
import w9.InterfaceC5748c;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public abstract class g implements P9.d, P9.b, qa.e {
    public /* synthetic */ g() {
    }

    @Override // P9.d
    public P9.d A(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return this;
    }

    @Override // P9.d
    public Object B(M9.b deserializer) {
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // P9.b
    public long C(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return m();
    }

    @Override // P9.d
    public abstract short E();

    @Override // P9.d
    public float F() {
        M();
        throw null;
    }

    @Override // P9.b
    public Object G(O9.e descriptor, int i, M9.b deserializer, Object obj) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        if (deserializer.getDescriptor().c() || p()) {
            return B(deserializer);
        }
        return null;
    }

    @Override // P9.d
    public int H(O9.e enumDescriptor) {
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        M();
        throw null;
    }

    @Override // P9.b
    public boolean I(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return f();
    }

    @Override // P9.d
    public double J() {
        M();
        throw null;
    }

    public abstract void K(E1.c cVar, Object obj);

    public abstract String L();

    public void M() {
        throw new M9.i(x.a(getClass()) + " can't retrieve untyped values");
    }

    public void N(O6.l view) {
        kotlin.jvm.internal.l.f(view, "view");
    }

    public abstract String O();

    public abstract int P(com.zipoapps.ads.banner.b bVar);

    public abstract M9.b Q(InterfaceC5748c interfaceC5748c, List list);

    public C2074a R(C2074a c2074a) {
        return S(c2074a.f18549a, c2074a.f18550b);
    }

    public abstract C2074a S(String str, String str2);

    public abstract M9.b T(String str, InterfaceC5748c interfaceC5748c);

    public abstract M9.b U(InterfaceC5748c interfaceC5748c, Object obj);

    public int V(E1.a connection, Object obj) throws Exception {
        kotlin.jvm.internal.l.f(connection, "connection");
        if (obj == null) {
            return 0;
        }
        E1.c cVarK0 = connection.K0(L());
        try {
            K(cVarK0, obj);
            cVarK0.x();
            cVarK0.close();
            cVarK0 = connection.K0("SELECT changes()");
            try {
                cVarK0.x();
                int i = (int) cVarK0.getLong(0);
                cVarK0.close();
                return i;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public void W(C2074a c2074a) {
        C2074a c2074aR = R(c2074a);
        if (c2074aR == null) {
            c2074aR = new C2074a(c2074a.f18549a, c2074a.f18550b);
        }
        System.currentTimeMillis();
        c2074aR.f18551c++;
        a0(c2074aR);
        int i = c2074aR.f18551c;
        System.currentTimeMillis();
        c2074a.getClass();
        c2074a.f18551c = i;
    }

    public abstract Object X(String str, com.zipoapps.ads.banner.b bVar, R7.c cVar, R7.b bVar2);

    public abstract void Y(int i);

    public abstract void Z(Typeface typeface, boolean z10);

    public abstract void a0(C2074a c2074a);

    @Override // P9.b
    public void b(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
    }

    public void b0(P8.b bVar) {
        try {
            c0(bVar);
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th) {
            B.A(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c0(P8.b bVar);

    @Override // P9.d
    public P9.b d(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return this;
    }

    public void d0(C1482h view) {
        kotlin.jvm.internal.l.f(view, "view");
        N(view);
    }

    public void e0(t view) {
        kotlin.jvm.internal.l.f(view, "view");
        N(view);
    }

    @Override // P9.d
    public boolean f() {
        M();
        throw null;
    }

    public void f0(v view) {
        kotlin.jvm.internal.l.f(view, "view");
        N(view);
    }

    @Override // P9.d
    public char g() {
        M();
        throw null;
    }

    public void g0(D view) {
        kotlin.jvm.internal.l.f(view, "view");
        N(view);
    }

    @Override // qa.e
    public int get(qa.h hVar) {
        return range(hVar).a(getLong(hVar), hVar);
    }

    @Override // P9.b
    public Object h(O9.e descriptor, int i, M9.b deserializer, Object obj) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        return B(deserializer);
    }

    @Override // P9.b
    public int i(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return k();
    }

    @Override // P9.d
    public abstract int k();

    @Override // P9.d
    public String l() {
        M();
        throw null;
    }

    @Override // P9.d
    public abstract long m();

    @Override // P9.b
    public String n(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return l();
    }

    @Override // P9.b
    public byte o(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return z();
    }

    @Override // P9.d
    public boolean p() {
        return true;
    }

    @Override // qa.e
    public Object query(qa.j jVar) {
        if (jVar == qa.i.f45475a || jVar == qa.i.f45476b || jVar == qa.i.f45477c) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // P9.b
    public P9.d r(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return A(descriptor.i(i));
    }

    @Override // qa.e
    public qa.m range(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.rangeRefinedBy(this);
        }
        if (isSupported(hVar)) {
            return hVar.range();
        }
        throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
    }

    @Override // P9.b
    public short s(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return E();
    }

    @Override // P9.b
    public float v(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return F();
    }

    @Override // P9.b
    public char w(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return g();
    }

    @Override // P9.b
    public double y(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return J();
    }

    @Override // P9.d
    public abstract byte z();

    public g(C0663f c0663f) {
    }

    public void h0(View view) {
    }
}
