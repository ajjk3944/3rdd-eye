package mu;

import com.google.android.gms.internal.measurement.e5;
import ir.f0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import ku.t0;

/* loaded from: classes.dex */
public abstract class a implements lu.j, ju.c, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17001a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f17002b;

    /* renamed from: c, reason: collision with root package name */
    public final lu.c f17003c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17004d;

    /* renamed from: e, reason: collision with root package name */
    public final lu.i f17005e;

    public a(lu.c cVar, String str) {
        this.f17003c = cVar;
        this.f17004d = str;
        this.f17005e = cVar.f15934a;
    }

    @Override // ju.c
    public final short A() {
        return O(T());
    }

    @Override // ju.c
    public final float B() {
        return K(T());
    }

    @Override // ju.c
    public final double C() {
        return J(T());
    }

    @Override // ju.c
    public final int D(iu.e eVar) {
        br.l.e(eVar, "enumDescriptor");
        String str = (String) T();
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        String strH = eVar.h();
        if (lVarE instanceof lu.a0) {
            return l.j(eVar, this.f17003c, ((lu.a0) lVarE).a(), "");
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        br.y yVar = br.x.f2918a;
        sb2.append(yVar.b(lu.a0.class).p());
        sb2.append(", but had ");
        sb2.append(yVar.b(lVarE.getClass()).p());
        sb2.append(" as the serialized body of ");
        sb2.append(strH);
        sb2.append(" at element: ");
        sb2.append(V(str));
        throw l.d(-1, lVarE.toString(), sb2.toString());
    }

    public abstract lu.l E(String str);

    public final lu.l F() {
        lu.l lVarE;
        String str = (String) mq.o.A0(this.f17001a);
        return (str == null || (lVarE = E(str)) == null) ? S() : lVarE;
    }

    public final boolean G(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (lVarE instanceof lu.a0) {
            lu.a0 a0Var = (lu.a0) lVarE;
            try {
                Boolean boolA = lu.m.a(a0Var);
                if (boolA != null) {
                    return boolA.booleanValue();
                }
                W(a0Var, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(a0Var, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        br.y yVar = br.x.f2918a;
        sb2.append(yVar.b(lu.a0.class).p());
        sb2.append(", but had ");
        sb2.append(yVar.b(lVarE.getClass()).p());
        sb2.append(" as the serialized body of boolean at element: ");
        sb2.append(V(str));
        throw l.d(-1, lVarE.toString(), sb2.toString());
    }

    public final byte H(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (!(lVarE instanceof lu.a0)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.a0.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarE.getClass()).p());
            sb2.append(" as the serialized body of byte at element: ");
            sb2.append(V(str));
            throw l.d(-1, lVarE.toString(), sb2.toString());
        }
        lu.a0 a0Var = (lu.a0) lVarE;
        try {
            int iB = lu.m.b(a0Var);
            Byte bValueOf = (-128 > iB || iB > 127) ? null : Byte.valueOf((byte) iB);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            W(a0Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(a0Var, "byte", str);
            throw null;
        }
    }

    public final char I(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (!(lVarE instanceof lu.a0)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.a0.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarE.getClass()).p());
            sb2.append(" as the serialized body of char at element: ");
            sb2.append(V(str));
            throw l.d(-1, lVarE.toString(), sb2.toString());
        }
        lu.a0 a0Var = (lu.a0) lVarE;
        try {
            String strA = a0Var.a();
            br.l.e(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            W(a0Var, "char", str);
            throw null;
        }
    }

    public final double J(Object obj) throws NumberFormatException {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (!(lVarE instanceof lu.a0)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.a0.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarE.getClass()).p());
            sb2.append(" as the serialized body of double at element: ");
            sb2.append(V(str));
            throw l.d(-1, lVarE.toString(), sb2.toString());
        }
        lu.a0 a0Var = (lu.a0) lVarE;
        try {
            ku.a0 a0Var2 = lu.m.f15950a;
            double d6 = Double.parseDouble(a0Var.a());
            lu.i iVar = this.f17003c.f15934a;
            if (Double.isInfinite(d6) || Double.isNaN(d6)) {
                throw l.a(Double.valueOf(d6), str, F().toString());
            }
            return d6;
        } catch (IllegalArgumentException unused) {
            W(a0Var, "double", str);
            throw null;
        }
    }

    public final float K(Object obj) throws NumberFormatException {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (!(lVarE instanceof lu.a0)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.a0.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarE.getClass()).p());
            sb2.append(" as the serialized body of float at element: ");
            sb2.append(V(str));
            throw l.d(-1, lVarE.toString(), sb2.toString());
        }
        lu.a0 a0Var = (lu.a0) lVarE;
        try {
            ku.a0 a0Var2 = lu.m.f15950a;
            float f10 = Float.parseFloat(a0Var.a());
            lu.i iVar = this.f17003c.f15934a;
            if (Float.isInfinite(f10) || Float.isNaN(f10)) {
                throw l.a(Float.valueOf(f10), str, F().toString());
            }
            return f10;
        } catch (IllegalArgumentException unused) {
            W(a0Var, "float", str);
            throw null;
        }
    }

    public final ju.c L(Object obj, iu.e eVar) {
        String str = (String) obj;
        br.l.e(str, "tag");
        br.l.e(eVar, "inlineDescriptor");
        if (!z.a(eVar)) {
            this.f17001a.add(str);
            return this;
        }
        lu.l lVarE = E(str);
        String strH = eVar.h();
        if (lVarE instanceof lu.a0) {
            String strA = ((lu.a0) lVarE).a();
            lu.c cVar = this.f17003c;
            br.l.e(cVar, "json");
            br.l.e(strA, "source");
            return new g(new bj.c(strA), cVar);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        br.y yVar = br.x.f2918a;
        sb2.append(yVar.b(lu.a0.class).p());
        sb2.append(", but had ");
        sb2.append(yVar.b(lVarE.getClass()).p());
        sb2.append(" as the serialized body of ");
        sb2.append(strH);
        sb2.append(" at element: ");
        sb2.append(V(str));
        throw l.d(-1, lVarE.toString(), sb2.toString());
    }

    public final int M(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (lVarE instanceof lu.a0) {
            lu.a0 a0Var = (lu.a0) lVarE;
            try {
                return lu.m.b(a0Var);
            } catch (IllegalArgumentException unused) {
                W(a0Var, "int", str);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        br.y yVar = br.x.f2918a;
        sb2.append(yVar.b(lu.a0.class).p());
        sb2.append(", but had ");
        sb2.append(yVar.b(lVarE.getClass()).p());
        sb2.append(" as the serialized body of int at element: ");
        sb2.append(V(str));
        throw l.d(-1, lVarE.toString(), sb2.toString());
    }

    public final long N(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (lVarE instanceof lu.a0) {
            lu.a0 a0Var = (lu.a0) lVarE;
            try {
                ku.a0 a0Var2 = lu.m.f15950a;
                try {
                    return new bj.c(a0Var.a()).o();
                } catch (h e4) {
                    throw new NumberFormatException(e4.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                W(a0Var, "long", str);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        br.y yVar = br.x.f2918a;
        sb2.append(yVar.b(lu.a0.class).p());
        sb2.append(", but had ");
        sb2.append(yVar.b(lVarE.getClass()).p());
        sb2.append(" as the serialized body of long at element: ");
        sb2.append(V(str));
        throw l.d(-1, lVarE.toString(), sb2.toString());
    }

    public final short O(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (!(lVarE instanceof lu.a0)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.a0.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarE.getClass()).p());
            sb2.append(" as the serialized body of short at element: ");
            sb2.append(V(str));
            throw l.d(-1, lVarE.toString(), sb2.toString());
        }
        lu.a0 a0Var = (lu.a0) lVarE;
        try {
            int iB = lu.m.b(a0Var);
            Short shValueOf = (-32768 > iB || iB > 32767) ? null : Short.valueOf((short) iB);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            W(a0Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(a0Var, "short", str);
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        br.l.e(str, "tag");
        lu.l lVarE = E(str);
        if (!(lVarE instanceof lu.a0)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.a0.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarE.getClass()).p());
            sb2.append(" as the serialized body of string at element: ");
            sb2.append(V(str));
            throw l.d(-1, lVarE.toString(), sb2.toString());
        }
        lu.a0 a0Var = (lu.a0) lVarE;
        if (!(a0Var instanceof lu.p)) {
            StringBuilder sbU = c7.a.u("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbU.append(V(str));
            throw l.d(-1, F().toString(), sbU.toString());
        }
        lu.p pVar = (lu.p) a0Var;
        if (pVar.f15953a) {
            return pVar.f15954d;
        }
        lu.i iVar = this.f17003c.f15934a;
        StringBuilder sbU2 = c7.a.u("String literal for key '", str, "' should be quoted at element: ");
        sbU2.append(V(str));
        sbU2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw l.d(-1, F().toString(), sbU2.toString());
    }

    public String Q(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return eVar.l(i10);
    }

    public final String R(iu.e eVar, int i10) {
        br.l.e(eVar, "<this>");
        String strQ = Q(eVar, i10);
        br.l.e(strQ, "nestedName");
        return strQ;
    }

    public abstract lu.l S();

    public final Object T() {
        ArrayList arrayList = this.f17001a;
        Object objRemove = arrayList.remove(e5.z(arrayList));
        this.f17002b = true;
        return objRemove;
    }

    public final String U() {
        ArrayList arrayList = this.f17001a;
        return arrayList.isEmpty() ? "$" : mq.o.x0(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        br.l.e(str, "currentTag");
        return U() + '.' + str;
    }

    public final void W(lu.a0 a0Var, String str, String str2) {
        throw l.d(-1, F().toString(), "Failed to parse literal '" + a0Var + "' as " + (tt.s.n0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + V(str2));
    }

    @Override // ju.a
    public final cg.e a() {
        return this.f17003c.f15935b;
    }

    @Override // ju.c
    public ju.a b(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        lu.l lVarF = F();
        i3.g gVarF = eVar.f();
        boolean zA = br.l.a(gVarF, iu.j.f13012e);
        lu.c cVar = this.f17003c;
        if (zA || (gVarF instanceof iu.b)) {
            String strH = eVar.h();
            if (lVarF instanceof lu.e) {
                return new p(cVar, (lu.e) lVarF);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.e.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarF.getClass()).p());
            sb2.append(" as the serialized body of ");
            sb2.append(strH);
            sb2.append(" at element: ");
            sb2.append(U());
            throw l.d(-1, lVarF.toString(), sb2.toString());
        }
        if (!br.l.a(gVarF, iu.j.f13013f)) {
            String strH2 = eVar.h();
            if (lVarF instanceof lu.w) {
                return new o(cVar, (lu.w) lVarF, this.f17004d, 8);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            br.y yVar2 = br.x.f2918a;
            sb3.append(yVar2.b(lu.w.class).p());
            sb3.append(", but had ");
            sb3.append(yVar2.b(lVarF.getClass()).p());
            sb3.append(" as the serialized body of ");
            sb3.append(strH2);
            sb3.append(" at element: ");
            sb3.append(U());
            throw l.d(-1, lVarF.toString(), sb3.toString());
        }
        iu.e eVarF = l.f(eVar.n(0), cVar.f15935b);
        i3.g gVarF2 = eVarF.f();
        if (!(gVarF2 instanceof iu.d) && !br.l.a(gVarF2, iu.i.f13010d)) {
            throw l.c(eVarF);
        }
        String strH3 = eVar.h();
        if (lVarF instanceof lu.w) {
            return new q(cVar, (lu.w) lVarF);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        br.y yVar3 = br.x.f2918a;
        sb4.append(yVar3.b(lu.w.class).p());
        sb4.append(", but had ");
        sb4.append(yVar3.b(lVarF.getClass()).p());
        sb4.append(" as the serialized body of ");
        sb4.append(strH3);
        sb4.append(" at element: ");
        sb4.append(U());
        throw l.d(-1, lVarF.toString(), sb4.toString());
    }

    @Override // ju.a
    public void c(iu.e eVar) {
        br.l.e(eVar, "descriptor");
    }

    @Override // ju.c
    public final boolean d() {
        return G(T());
    }

    @Override // ju.c
    public final char e() {
        return I(T());
    }

    @Override // ju.c
    public final Object f(gu.a aVar) {
        br.l.e(aVar, "deserializer");
        if (!(aVar instanceof gu.d)) {
            return aVar.deserialize(this);
        }
        lu.c cVar = this.f17003c;
        lu.i iVar = cVar.f15934a;
        gu.d dVar = (gu.d) aVar;
        String strH = l.h(dVar.getDescriptor(), cVar);
        lu.l lVarF = F();
        String strH2 = dVar.getDescriptor().h();
        if (!(lVarF instanceof lu.w)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            br.y yVar = br.x.f2918a;
            sb2.append(yVar.b(lu.w.class).p());
            sb2.append(", but had ");
            sb2.append(yVar.b(lVarF.getClass()).p());
            sb2.append(" as the serialized body of ");
            sb2.append(strH2);
            sb2.append(" at element: ");
            sb2.append(U());
            throw l.d(-1, lVarF.toString(), sb2.toString());
        }
        lu.w wVar = (lu.w) lVarF;
        lu.l lVar = (lu.l) wVar.get(strH);
        String strA = null;
        if (lVar != null) {
            lu.a0 a0VarC = lu.m.c(lVar);
            if (!(a0VarC instanceof lu.s)) {
                strA = a0VarC.a();
            }
        }
        try {
            return l.n(cVar, strH, wVar, f0.v((gu.d) aVar, this, strA));
        } catch (gu.e e4) {
            String message = e4.getMessage();
            br.l.b(message);
            throw l.d(-1, wVar.toString(), message);
        }
    }

    @Override // ju.a
    public final long g(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return N(R(eVar, i10));
    }

    @Override // ju.a
    public final int h(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return M(R(eVar, i10));
    }

    @Override // ju.a
    public final float i(t0 t0Var, int i10) {
        br.l.e(t0Var, "descriptor");
        return K(R(t0Var, i10));
    }

    @Override // lu.j
    public final lu.l j() {
        return F();
    }

    @Override // ju.c
    public final int k() {
        return M(T());
    }

    @Override // ju.a
    public final char l(t0 t0Var, int i10) {
        br.l.e(t0Var, "descriptor");
        return I(R(t0Var, i10));
    }

    @Override // ju.a
    public final Object m(iu.e eVar, int i10, gu.a aVar, Object obj) {
        br.l.e(eVar, "descriptor");
        br.l.e(aVar, "deserializer");
        this.f17001a.add(R(eVar, i10));
        br.l.e(aVar, "deserializer");
        Object objF = f(aVar);
        if (!this.f17002b) {
            T();
        }
        this.f17002b = false;
        return objF;
    }

    @Override // ju.c
    public final String n() {
        return P(T());
    }

    @Override // ju.a
    public final short o(t0 t0Var, int i10) {
        br.l.e(t0Var, "descriptor");
        return O(R(t0Var, i10));
    }

    @Override // ju.c
    public final ju.c p(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        if (mq.o.A0(this.f17001a) != null) {
            return L(T(), eVar);
        }
        return new n(this.f17003c, S(), this.f17004d).p(eVar);
    }

    @Override // ju.a
    public final String q(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return P(R(eVar, i10));
    }

    @Override // ju.c
    public final long r() {
        return N(T());
    }

    @Override // ju.a
    public final ju.c s(t0 t0Var, int i10) {
        br.l.e(t0Var, "descriptor");
        return L(R(t0Var, i10), t0Var.n(i10));
    }

    @Override // ju.c
    public boolean u() {
        return !(F() instanceof lu.s);
    }

    @Override // ju.a
    public final boolean v(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return G(R(eVar, i10));
    }

    @Override // ju.a
    public final double w(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return J(R(eVar, i10));
    }

    @Override // ju.a
    public final byte x(t0 t0Var, int i10) {
        br.l.e(t0Var, "descriptor");
        return H(R(t0Var, i10));
    }

    @Override // ju.a
    public final Object y(iu.e eVar, int i10, gu.a aVar, Object obj) {
        br.l.e(eVar, "descriptor");
        br.l.e(aVar, "deserializer");
        this.f17001a.add(R(eVar, i10));
        Object objF = (aVar.getDescriptor().i() || u()) ? f(aVar) : null;
        if (!this.f17002b) {
            T();
        }
        this.f17002b = false;
        return objF;
    }

    @Override // ju.c
    public final byte z() {
        return H(T());
    }
}
