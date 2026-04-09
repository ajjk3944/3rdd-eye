package io.sentry.protocol;

import com.google.android.gms.internal.measurement.b4;
import io.sentry.c2;
import io.sentry.e3;
import io.sentry.k6;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12528a = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f12529d = new io.sentry.util.a();

    public c() {
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f12528a.containsKey(obj);
    }

    public Set b() {
        return this.f12528a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f12528a.get(obj);
    }

    public a d() {
        return (a) u(a.class, "app");
    }

    public f e() {
        return (f) u(f.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f12528a.equals(((c) obj).f12528a);
    }

    public m f() {
        return (m) u(m.class, "os");
    }

    public v g() {
        return (v) u(v.class, "runtime");
    }

    public k6 h() {
        return (k6) u(k6.class, "trace");
    }

    public final int hashCode() {
        return this.f12528a.hashCode();
    }

    public Enumeration i() {
        return this.f12528a.keys();
    }

    public Object j(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f12528a;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void k(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f12528a.putAll(cVar.f12528a);
    }

    public void l(a aVar) {
        j(aVar, "app");
    }

    public void m(b bVar) {
        j(bVar, "browser");
    }

    public void n(f fVar) {
        j(fVar, "device");
    }

    public void o(i iVar) {
        j(iVar, "gpu");
    }

    public void p(m mVar) {
        j(mVar, "os");
    }

    public void q(p pVar) {
        io.sentry.q qVarA = this.f12529d.a();
        try {
            j(pVar, "response");
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void r(v vVar) {
        j(vVar, "runtime");
    }

    public void s(b0 b0Var) {
        j(b0Var, "spring");
    }

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        ArrayList<String> list = Collections.list(i());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                bVar.I(str);
                bVar.S(u0Var, objC);
            }
        }
        bVar.F();
    }

    public void t(k6 k6Var) {
        ir.f0.T(k6Var, "traceContext is required");
        j(k6Var, "trace");
    }

    public final Object u(Class cls, String str) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public c(c cVar) {
        for (Map.Entry entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.B = aVar.B;
                    aVar2.f12517a = aVar.f12517a;
                    aVar2.f12521x = aVar.f12521x;
                    aVar2.f12518d = aVar.f12518d;
                    aVar2.f12522y = aVar.f12522y;
                    aVar2.f12520r = aVar.f12520r;
                    aVar2.f12519g = aVar.f12519g;
                    aVar2.D = b4.O(aVar.D);
                    aVar2.G = aVar.G;
                    List list = aVar.E;
                    aVar2.E = list != null ? new ArrayList(list) : null;
                    aVar2.F = aVar.F;
                    aVar2.H = aVar.H;
                    aVar2.I = aVar.I;
                    aVar2.J = b4.O(aVar.J);
                    l(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    b bVar = (b) value;
                    b bVar2 = new b();
                    bVar2.f12523a = bVar.f12523a;
                    bVar2.f12524d = bVar.f12524d;
                    bVar2.f12525g = b4.O(bVar.f12525g);
                    m(bVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof f)) {
                    f fVar = (f) value;
                    f fVar2 = new f();
                    fVar2.f12540a = fVar.f12540a;
                    fVar2.f12544d = fVar.f12544d;
                    fVar2.f12547g = fVar.f12547g;
                    fVar2.f12548r = fVar.f12548r;
                    fVar2.f12549x = fVar.f12549x;
                    fVar2.f12550y = fVar.f12550y;
                    fVar2.E = fVar.E;
                    fVar2.F = fVar.F;
                    fVar2.G = fVar.G;
                    fVar2.H = fVar.H;
                    fVar2.I = fVar.I;
                    fVar2.J = fVar.J;
                    fVar2.K = fVar.K;
                    fVar2.L = fVar.L;
                    fVar2.M = fVar.M;
                    fVar2.N = fVar.N;
                    fVar2.O = fVar.O;
                    fVar2.P = fVar.P;
                    fVar2.Q = fVar.Q;
                    fVar2.R = fVar.R;
                    fVar2.S = fVar.S;
                    fVar2.T = fVar.T;
                    fVar2.U = fVar.U;
                    fVar2.W = fVar.W;
                    fVar2.Y = fVar.Y;
                    fVar2.Z = fVar.Z;
                    fVar2.D = fVar.D;
                    String[] strArr = fVar.B;
                    fVar2.B = strArr != null ? (String[]) strArr.clone() : null;
                    fVar2.X = fVar.X;
                    TimeZone timeZone = fVar.V;
                    fVar2.V = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    fVar2.f12541a0 = fVar.f12541a0;
                    fVar2.f12542b0 = fVar.f12542b0;
                    fVar2.f12543c0 = fVar.f12543c0;
                    fVar2.f12545d0 = fVar.f12545d0;
                    fVar2.f12546e0 = b4.O(fVar.f12546e0);
                    n(fVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.f12590a = mVar.f12590a;
                    mVar2.f12591d = mVar.f12591d;
                    mVar2.f12592g = mVar.f12592g;
                    mVar2.f12593r = mVar.f12593r;
                    mVar2.f12594x = mVar.f12594x;
                    mVar2.f12595y = mVar.f12595y;
                    mVar2.B = b4.O(mVar.B);
                    p(mVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof v)) {
                    v vVar = (v) value;
                    v vVar2 = new v();
                    vVar2.f12641a = vVar.f12641a;
                    vVar2.f12642d = vVar.f12642d;
                    vVar2.f12643g = vVar.f12643g;
                    vVar2.f12644r = b4.O(vVar.f12644r);
                    r(vVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof g)) {
                    g gVar = (g) value;
                    g gVar2 = new g();
                    gVar2.f12554a = gVar.f12554a;
                    gVar2.f12555d = gVar.f12555d;
                    gVar2.f12556g = gVar.f12556g;
                    gVar2.f12557r = gVar.f12557r;
                    gVar2.f12558x = gVar.f12558x;
                    gVar2.f12559y = gVar.f12559y;
                    gVar2.B = b4.O(gVar.B);
                    j(gVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof i)) {
                    i iVar = (i) value;
                    i iVar2 = new i();
                    iVar2.f12570a = iVar.f12570a;
                    iVar2.f12571d = iVar.f12571d;
                    iVar2.f12572g = iVar.f12572g;
                    iVar2.f12573r = iVar.f12573r;
                    iVar2.f12574x = iVar.f12574x;
                    iVar2.f12575y = iVar.f12575y;
                    iVar2.B = iVar.B;
                    iVar2.D = iVar.D;
                    iVar2.E = iVar.E;
                    iVar2.F = b4.O(iVar.F);
                    o(iVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof k6)) {
                    t(new k6((k6) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof e3)) {
                    e3 e3Var = (e3) value;
                    e3 e3Var2 = new e3();
                    e3Var2.f12234a = e3Var.f12234a;
                    ConcurrentHashMap concurrentHashMapO = b4.O(e3Var.f12235d);
                    if (concurrentHashMapO != null) {
                        e3Var2.f12235d = concurrentHashMapO;
                    }
                    j(e3Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    p pVar = (p) value;
                    p pVar2 = new p();
                    pVar2.f12602a = pVar.f12602a;
                    pVar2.f12603d = b4.O(pVar.f12603d);
                    pVar2.f12607y = b4.O(pVar.f12607y);
                    pVar2.f12604g = pVar.f12604g;
                    pVar2.f12605r = pVar.f12605r;
                    pVar2.f12606x = pVar.f12606x;
                    q(pVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof b0)) {
                    b0 b0Var = (b0) value;
                    b0 b0Var2 = new b0();
                    b0Var2.f12526a = b0Var.f12526a;
                    b0Var2.f12527d = b4.O(b0Var.f12527d);
                    s(b0Var2);
                } else {
                    j(value, (String) entry.getKey());
                }
            }
        }
    }
}
