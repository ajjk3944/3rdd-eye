package c7;

import N7.B8;
import a7.AbstractC1664a;
import a7.C1665b;
import c7.e;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* compiled from: Parser.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Parser.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f18509a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18510b;

        /* renamed from: c, reason: collision with root package name */
        public int f18511c;

        public a(String rawExpr, ArrayList tokens) {
            l.f(tokens, "tokens");
            l.f(rawExpr, "rawExpr");
            this.f18509a = tokens;
            this.f18510b = rawExpr;
        }

        public final e a() {
            return (e) this.f18509a.get(this.f18511c);
        }

        public final int b() {
            int i = this.f18511c;
            this.f18511c = i + 1;
            return i;
        }

        public final boolean c() {
            return !(this.f18511c >= this.f18509a.size());
        }

        public final e d() {
            return (e) this.f18509a.get(b());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.b(this.f18509a, aVar.f18509a) && l.b(this.f18510b, aVar.f18510b);
        }

        public final int hashCode() {
            return this.f18510b.hashCode() + (this.f18509a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ParsingState(tokens=");
            sb.append(this.f18509a);
            sb.append(", rawExpr=");
            return B8.j(sb, this.f18510b, ')');
        }
    }

    public static AbstractC1664a a(a aVar) {
        AbstractC1664a abstractC1664aD = d(aVar);
        while (aVar.c() && (aVar.a() instanceof e.c.a.d.C0293a)) {
            aVar.b();
            abstractC1664aD = new AbstractC1664a.C0224a(e.c.a.d.C0293a.f18529a, abstractC1664aD, d(aVar), aVar.f18510b);
        }
        return abstractC1664aD;
    }

    public static AbstractC1664a b(a aVar, AbstractC1664a abstractC1664a) {
        if (aVar.f18511c >= aVar.f18509a.size()) {
            throw new C1665b(null, "Expression expected");
        }
        e eVarD = aVar.d();
        if (abstractC1664a != null && !(eVarD instanceof e.a)) {
            throw new C1665b(null, "Method expected after .");
        }
        boolean z10 = eVarD instanceof e.b.a;
        String str = aVar.f18510b;
        if (z10) {
            return new AbstractC1664a.i((e.b.a) eVarD, str);
        }
        if (eVarD instanceof e.b.C0284b) {
            return new AbstractC1664a.j(((e.b.C0284b) eVarD).f18519a, str);
        }
        if (eVarD instanceof e.a) {
            e.a aVar2 = (e.a) eVarD;
            if (!(aVar.d() instanceof c)) {
                throw new C1665b(null, "'(' expected after function call");
            }
            ArrayList arrayList = new ArrayList();
            if (abstractC1664a != null) {
                arrayList.add(abstractC1664a);
            }
            while (!(aVar.a() instanceof d)) {
                arrayList.add(e(aVar));
                if (aVar.a() instanceof e.a.C0281a) {
                    aVar.b();
                }
            }
            if (aVar.d() instanceof d) {
                return abstractC1664a == null ? new AbstractC1664a.b(aVar2, arrayList, str) : new AbstractC1664a.d(aVar2, arrayList, str);
            }
            throw new C1665b(null, "expected ')' after a function call");
        }
        if (eVarD instanceof c) {
            AbstractC1664a abstractC1664aE = e(aVar);
            if (aVar.d() instanceof d) {
                return abstractC1664aE;
            }
            throw new C1665b(null, "')' expected after expression");
        }
        if (!(eVarD instanceof h)) {
            throw new C1665b(null, "Expression expected");
        }
        ArrayList arrayList2 = new ArrayList();
        while (aVar.c() && !(aVar.a() instanceof f)) {
            if ((aVar.a() instanceof i) || (aVar.a() instanceof g)) {
                aVar.b();
            } else {
                arrayList2.add(e(aVar));
            }
        }
        if (aVar.d() instanceof f) {
            return new AbstractC1664a.e(str, arrayList2);
        }
        throw new C1665b(null, "expected ''' at end of a string template");
    }

    public static AbstractC1664a c(a aVar) {
        AbstractC1664a abstractC1664aG = g(aVar);
        while (aVar.c() && (aVar.a() instanceof e.c.a.InterfaceC0285a)) {
            e eVarD = aVar.d();
            AbstractC1664a abstractC1664aG2 = g(aVar);
            l.d(eVarD, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            abstractC1664aG = new AbstractC1664a.C0224a((e.c.a) eVarD, abstractC1664aG, abstractC1664aG2, aVar.f18510b);
        }
        return abstractC1664aG;
    }

    public static AbstractC1664a d(a aVar) {
        AbstractC1664a abstractC1664aC = c(aVar);
        while (aVar.c() && (aVar.a() instanceof e.c.a.b)) {
            e eVarD = aVar.d();
            AbstractC1664a abstractC1664aC2 = c(aVar);
            l.d(eVarD, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            abstractC1664aC = new AbstractC1664a.C0224a((e.c.a) eVarD, abstractC1664aC, abstractC1664aC2, aVar.f18510b);
        }
        return abstractC1664aC;
    }

    public static AbstractC1664a e(a aVar) {
        String str;
        AbstractC1664a abstractC1664aA = a(aVar);
        while (true) {
            boolean zC = aVar.c();
            str = aVar.f18510b;
            if (!zC || !(aVar.a() instanceof e.c.a.d.b)) {
                break;
            }
            aVar.b();
            abstractC1664aA = new AbstractC1664a.C0224a(e.c.a.d.b.f18530a, abstractC1664aA, a(aVar), str);
        }
        if (aVar.c() && (aVar.a() instanceof e.c.f)) {
            e eVarD = aVar.d();
            AbstractC1664a abstractC1664aE = e(aVar);
            l.d(eVarD, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Try");
            abstractC1664aA = new AbstractC1664a.g((e.c.f) eVarD, abstractC1664aA, abstractC1664aE, str);
        }
        if (!aVar.c() || !(aVar.a() instanceof e.c.d)) {
            return abstractC1664aA;
        }
        aVar.b();
        AbstractC1664a abstractC1664aE2 = e(aVar);
        if (aVar.f18511c >= aVar.f18509a.size() || !(aVar.a() instanceof e.c.C0296c)) {
            throw new C1665b(null, "':' expected in ternary-if-else expression");
        }
        aVar.b();
        return new AbstractC1664a.f(abstractC1664aA, abstractC1664aE2, e(aVar), str);
    }

    public static AbstractC1664a f(a aVar) {
        AbstractC1664a abstractC1664aH = h(aVar);
        while (aVar.c() && (aVar.a() instanceof e.c.a.InterfaceC0290c)) {
            e eVarD = aVar.d();
            l.d(eVarD, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            abstractC1664aH = new AbstractC1664a.C0224a((e.c.a) eVarD, abstractC1664aH, h(aVar), aVar.f18510b);
        }
        return abstractC1664aH;
    }

    public static AbstractC1664a g(a aVar) {
        AbstractC1664a abstractC1664aF = f(aVar);
        while (aVar.c() && (aVar.a() instanceof e.c.a.f)) {
            e eVarD = aVar.d();
            l.d(eVarD, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            abstractC1664aF = new AbstractC1664a.C0224a((e.c.a) eVarD, abstractC1664aF, f(aVar), aVar.f18510b);
        }
        return abstractC1664aF;
    }

    public static AbstractC1664a h(a aVar) {
        boolean zC = aVar.c();
        String str = aVar.f18510b;
        if (zC && (aVar.a() instanceof e.c.g)) {
            e eVarD = aVar.d();
            l.d(eVarD, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator");
            return new AbstractC1664a.h((e.c) eVarD, h(aVar), str);
        }
        AbstractC1664a abstractC1664aB = b(aVar, null);
        while (aVar.c() && (aVar.a() instanceof e.c.b)) {
            aVar.b();
            abstractC1664aB = b(aVar, abstractC1664aB);
        }
        if (!aVar.c() || !(aVar.a() instanceof e.c.a.C0294e)) {
            return abstractC1664aB;
        }
        aVar.b();
        return new AbstractC1664a.C0224a(e.c.a.C0294e.f18531a, abstractC1664aB, h(aVar), str);
    }
}
