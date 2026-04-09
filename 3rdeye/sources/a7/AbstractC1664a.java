package a7;

import N7.B8;
import a7.C1668e;
import a7.EnumC1667d;
import c7.b;
import c7.e;
import c7.j;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import d7.C4278a;
import d7.C4279b;
import d7.C4280c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Evaluable.kt */
/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1664a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14167a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14168b;

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$a, reason: collision with other inner class name */
    public static final class C0224a extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.c.a f14169c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC1664a f14170d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC1664a f14171e;

        /* renamed from: f, reason: collision with root package name */
        public final String f14172f;

        /* renamed from: g, reason: collision with root package name */
        public final ArrayList f14173g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0224a(e.c.a aVar, AbstractC1664a left, AbstractC1664a right, String rawExpression) {
            super(rawExpression);
            kotlin.jvm.internal.l.f(left, "left");
            kotlin.jvm.internal.l.f(right, "right");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14169c = aVar;
            this.f14170d = left;
            this.f14171e = right;
            this.f14172f = rawExpression;
            this.f14173g = C2097r.y0(right.c(), left.c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) throws C1665b {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            AbstractC1664a abstractC1664a = this.f14170d;
            Object objB = evaluator.b(abstractC1664a);
            d(abstractC1664a.f14168b);
            e.c.a aVar = this.f14169c;
            boolean zEquals = false;
            if (aVar instanceof e.c.a.d) {
                e.c.a.d dVar = (e.c.a.d) aVar;
                a7.f fVar = new a7.f(evaluator, this);
                if (!(objB instanceof Boolean)) {
                    C1666c.c(objB + ' ' + dVar + " ...", "'" + dVar + "' must be called with boolean operands.", null);
                    throw null;
                }
                boolean z10 = dVar instanceof e.c.a.d.b;
                if ((z10 && ((Boolean) objB).booleanValue()) || ((dVar instanceof e.c.a.d.C0293a) && !((Boolean) objB).booleanValue())) {
                    return objB;
                }
                Object objInvoke = fVar.invoke();
                if (!(objInvoke instanceof Boolean)) {
                    C1666c.b(dVar, objB, objInvoke);
                    throw null;
                }
                if (!z10 ? !(!((Boolean) objB).booleanValue() || !((Boolean) objInvoke).booleanValue()) : !(!((Boolean) objB).booleanValue() && !((Boolean) objInvoke).booleanValue())) {
                    zEquals = true;
                }
                return Boolean.valueOf(zEquals);
            }
            AbstractC1664a abstractC1664a2 = this.f14171e;
            Object objB2 = evaluator.b(abstractC1664a2);
            d(abstractC1664a2.f14168b);
            b9.l lVar = objB.getClass().equals(objB2.getClass()) ? new b9.l(objB, objB2) : ((objB instanceof Long) && (objB2 instanceof Double)) ? new b9.l(Double.valueOf(((Number) objB).longValue()), objB2) : ((objB instanceof Double) && (objB2 instanceof Long)) ? new b9.l(objB, Double.valueOf(((Number) objB2).longValue())) : new b9.l(objB, objB2);
            A a10 = lVar.f18083b;
            Class<?> cls = a10.getClass();
            Object obj = lVar.f18084c;
            if (!cls.equals(obj.getClass())) {
                C1666c.b(aVar, a10, obj);
                throw null;
            }
            if (aVar instanceof e.c.a.b) {
                e.c.a.b bVar = (e.c.a.b) aVar;
                if (bVar instanceof e.c.a.b.C0288a) {
                    zEquals = a10.equals(obj);
                } else {
                    if (!(bVar instanceof e.c.a.b.C0289b)) {
                        throw new b9.j();
                    }
                    if (!a10.equals(obj)) {
                        zEquals = true;
                    }
                }
                return Boolean.valueOf(zEquals);
            }
            if (aVar instanceof e.c.a.f) {
                return C1668e.a.b((e.c.a.f) aVar, a10, obj);
            }
            if (aVar instanceof e.c.a.InterfaceC0290c) {
                return C1668e.a.a((e.c.a.InterfaceC0290c) aVar, a10, obj);
            }
            if (!(aVar instanceof e.c.a.InterfaceC0285a)) {
                C1666c.b(aVar, a10, obj);
                throw null;
            }
            e.c.a.InterfaceC0285a interfaceC0285a = (e.c.a.InterfaceC0285a) aVar;
            if ((a10 instanceof Double) && (obj instanceof Double)) {
                return C1668e.c(interfaceC0285a, (Comparable) a10, (Comparable) obj);
            }
            if ((a10 instanceof Long) && (obj instanceof Long)) {
                return C1668e.c(interfaceC0285a, (Comparable) a10, (Comparable) obj);
            }
            if ((a10 instanceof C4279b) && (obj instanceof C4279b)) {
                return C1668e.c(interfaceC0285a, (Comparable) a10, (Comparable) obj);
            }
            C1666c.b(interfaceC0285a, a10, obj);
            throw null;
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14173g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0224a)) {
                return false;
            }
            C0224a c0224a = (C0224a) obj;
            return kotlin.jvm.internal.l.b(this.f14169c, c0224a.f14169c) && kotlin.jvm.internal.l.b(this.f14170d, c0224a.f14170d) && kotlin.jvm.internal.l.b(this.f14171e, c0224a.f14171e) && kotlin.jvm.internal.l.b(this.f14172f, c0224a.f14172f);
        }

        public final int hashCode() {
            return this.f14172f.hashCode() + ((this.f14171e.hashCode() + ((this.f14170d.hashCode() + (this.f14169c.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "(" + this.f14170d + ' ' + this.f14169c + ' ' + this.f14171e + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$b */
    public static final class b extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.a f14174c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f14175d;

        /* renamed from: e, reason: collision with root package name */
        public final String f14176e;

        /* renamed from: f, reason: collision with root package name */
        public final List<String> f14177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e.a token, ArrayList arrayList, String rawExpression) {
            Object obj;
            super(rawExpression);
            kotlin.jvm.internal.l.f(token, "token");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14174c = token;
            this.f14175d = arrayList;
            this.f14176e = rawExpression;
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC1664a) it.next()).c());
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = C2097r.y0((List) it2.next(), (List) next);
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list = (List) obj;
            this.f14177f = list == null ? C2099t.f18581b : list;
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) {
            EnumC1667d enumC1667d;
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            X0.n nVar = evaluator.f14211a;
            e.a aVar = this.f14174c;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f14175d.iterator();
            while (it.hasNext()) {
                AbstractC1664a abstractC1664a = (AbstractC1664a) it.next();
                arrayList.add(evaluator.b(abstractC1664a));
                d(abstractC1664a.f14168b);
            }
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                EnumC1667d.a aVar2 = EnumC1667d.Companion;
                if (next instanceof Long) {
                    enumC1667d = EnumC1667d.INTEGER;
                } else if (next instanceof Double) {
                    enumC1667d = EnumC1667d.NUMBER;
                } else if (next instanceof Boolean) {
                    enumC1667d = EnumC1667d.BOOLEAN;
                } else if (next instanceof String) {
                    enumC1667d = EnumC1667d.STRING;
                } else if (next instanceof C4279b) {
                    enumC1667d = EnumC1667d.DATETIME;
                } else if (next instanceof C4278a) {
                    enumC1667d = EnumC1667d.COLOR;
                } else if (next instanceof C4280c) {
                    enumC1667d = EnumC1667d.URL;
                } else if (next instanceof JSONObject) {
                    enumC1667d = EnumC1667d.DICT;
                } else {
                    if (!(next instanceof JSONArray)) {
                        if (next == null) {
                            throw new C1665b(null, "Unable to find type for null");
                        }
                        throw new C1665b(null, "Unable to find type for ".concat(next.getClass().getName()));
                    }
                    enumC1667d = EnumC1667d.ARRAY;
                }
                arrayList2.add(enumC1667d);
            }
            try {
                H7.e eVar = (H7.e) nVar.f13450c;
                a7.g gVarE = ((k) eVar.f2291b).e(aVar.f18514a, arrayList2);
                d(gVarE.f());
                try {
                    return gVarE.e(nVar, this, C1668e.a(gVarE, arrayList));
                } catch (l unused) {
                    throw new l(C1666c.a(gVarE.c(), arrayList));
                }
            } catch (C1665b e4) {
                String str = aVar.f18514a;
                String message = e4.getMessage();
                if (message == null) {
                    message = "";
                }
                C1666c.d(str, arrayList, message, null);
                throw null;
            }
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14177f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.f14174c, bVar.f14174c) && kotlin.jvm.internal.l.b(this.f14175d, bVar.f14175d) && kotlin.jvm.internal.l.b(this.f14176e, bVar.f14176e);
        }

        public final int hashCode() {
            return this.f14176e.hashCode() + ((this.f14175d.hashCode() + (this.f14174c.f18514a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return this.f14174c.f18514a + '(' + C2097r.u0(this.f14175d, StringUtils.COMMA, null, null, null, 62) + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$c */
    public static final class c extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final String f14178c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f14179d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC1664a f14180e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String expr) {
            super(expr);
            kotlin.jvm.internal.l.f(expr, "expr");
            this.f14178c = expr;
            char[] charArray = expr.toCharArray();
            kotlin.jvm.internal.l.e(charArray, "this as java.lang.String).toCharArray()");
            j.a aVar = new j.a(charArray);
            ArrayList arrayList = aVar.f18548c;
            try {
                c7.j.h(aVar, arrayList, false);
                this.f14179d = arrayList;
            } catch (C1665b e4) {
                if (!(e4 instanceof t)) {
                    throw e4;
                }
                throw new C1665b(e4, "Error tokenizing '" + new String(charArray) + "'.");
            }
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) throws C1665b {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            if (this.f14180e == null) {
                ArrayList tokens = this.f14179d;
                kotlin.jvm.internal.l.f(tokens, "tokens");
                String rawExpression = this.f14167a;
                kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
                if (tokens.isEmpty()) {
                    throw new C1665b(null, "Expression expected");
                }
                b.a aVar = new b.a(rawExpression, tokens);
                AbstractC1664a abstractC1664aE = c7.b.e(aVar);
                if (aVar.c()) {
                    throw new C1665b(null, "Expression expected");
                }
                this.f14180e = abstractC1664aE;
            }
            AbstractC1664a abstractC1664a = this.f14180e;
            if (abstractC1664a == null) {
                kotlin.jvm.internal.l.l("expression");
                throw null;
            }
            Object objA = abstractC1664a.a(evaluator);
            AbstractC1664a abstractC1664a2 = this.f14180e;
            if (abstractC1664a2 != null) {
                d(abstractC1664a2.f14168b);
                return objA;
            }
            kotlin.jvm.internal.l.l("expression");
            throw null;
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            AbstractC1664a abstractC1664a = this.f14180e;
            if (abstractC1664a != null) {
                return abstractC1664a.c();
            }
            ArrayList arrayList = this.f14179d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof e.b.C0284b) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((e.b.C0284b) it2.next()).f18519a);
            }
            return arrayList3;
        }

        public final String toString() {
            return this.f14178c;
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$d */
    public static final class d extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.a f14181c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f14182d;

        /* renamed from: e, reason: collision with root package name */
        public final String f14183e;

        /* renamed from: f, reason: collision with root package name */
        public final List<String> f14184f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e.a token, ArrayList arrayList, String rawExpression) {
            Object obj;
            super(rawExpression);
            kotlin.jvm.internal.l.f(token, "token");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14181c = token;
            this.f14182d = arrayList;
            this.f14183e = rawExpression;
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC1664a) it.next()).c());
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = C2097r.y0((List) it2.next(), (List) next);
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list = (List) obj;
            this.f14184f = list == null ? C2099t.f18581b : list;
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) {
            String strConcat;
            EnumC1667d enumC1667d;
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            X0.n nVar = evaluator.f14211a;
            e.a aVar = this.f14181c;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f14182d.iterator();
            while (it.hasNext()) {
                AbstractC1664a abstractC1664a = (AbstractC1664a) it.next();
                arrayList.add(evaluator.b(abstractC1664a));
                d(abstractC1664a.f14168b);
            }
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                EnumC1667d.a aVar2 = EnumC1667d.Companion;
                if (next instanceof Long) {
                    enumC1667d = EnumC1667d.INTEGER;
                } else if (next instanceof Double) {
                    enumC1667d = EnumC1667d.NUMBER;
                } else if (next instanceof Boolean) {
                    enumC1667d = EnumC1667d.BOOLEAN;
                } else if (next instanceof String) {
                    enumC1667d = EnumC1667d.STRING;
                } else if (next instanceof C4279b) {
                    enumC1667d = EnumC1667d.DATETIME;
                } else if (next instanceof C4278a) {
                    enumC1667d = EnumC1667d.COLOR;
                } else if (next instanceof C4280c) {
                    enumC1667d = EnumC1667d.URL;
                } else if (next instanceof JSONObject) {
                    enumC1667d = EnumC1667d.DICT;
                } else {
                    if (!(next instanceof JSONArray)) {
                        if (next == null) {
                            throw new C1665b(null, "Unable to find type for null");
                        }
                        throw new C1665b(null, "Unable to find type for ".concat(next.getClass().getName()));
                    }
                    enumC1667d = EnumC1667d.ARRAY;
                }
                arrayList2.add(enumC1667d);
            }
            try {
                H7.e eVar = (H7.e) nVar.f13450c;
                a7.g gVarD = ((k) eVar.f2291b).d(aVar.f18514a, arrayList2);
                d(gVarD.f());
                return gVarD.e(nVar, this, C1668e.a(gVarD, arrayList));
            } catch (C1665b e4) {
                String str = aVar.f18514a;
                String message = e4.getMessage();
                if (message == null) {
                    message = "";
                }
                if (arrayList.size() > 1) {
                    strConcat = C2097r.u0(arrayList.subList(1, arrayList.size()), StringUtils.COMMA, str.concat("("), ")", null, 56);
                } else {
                    strConcat = str.concat("()");
                }
                C1666c.c(strConcat, message, e4);
                throw null;
            }
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14184f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.l.b(this.f14181c, dVar.f14181c) && kotlin.jvm.internal.l.b(this.f14182d, dVar.f14182d) && kotlin.jvm.internal.l.b(this.f14183e, dVar.f14183e);
        }

        public final int hashCode() {
            return this.f14183e.hashCode() + ((this.f14182d.hashCode() + (this.f14181c.f18514a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            ArrayList arrayList = this.f14182d;
            return C2097r.p0(arrayList) + '.' + this.f14181c.f18514a + '(' + (arrayList.size() > 1 ? C2097r.u0(arrayList.subList(1, arrayList.size()), StringUtils.COMMA, null, null, null, 62) : "") + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$e */
    public static final class e extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f14185c;

        /* renamed from: d, reason: collision with root package name */
        public final String f14186d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f14187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String rawExpression, ArrayList arrayList) {
            super(rawExpression);
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14185c = arrayList;
            this.f14186d = rawExpression;
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC1664a) it.next()).c());
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = C2097r.y0((List) it2.next(), (List) next);
            }
            this.f14187e = (List) next;
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f14185c.iterator();
            while (it.hasNext()) {
                AbstractC1664a abstractC1664a = (AbstractC1664a) it.next();
                arrayList.add(evaluator.b(abstractC1664a).toString());
                d(abstractC1664a.f14168b);
            }
            return C2097r.u0(arrayList, "", null, null, null, 62);
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14187e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.l.b(this.f14185c, eVar.f14185c) && kotlin.jvm.internal.l.b(this.f14186d, eVar.f14186d);
        }

        public final int hashCode() {
            return this.f14186d.hashCode() + (this.f14185c.hashCode() * 31);
        }

        public final String toString() {
            return C2097r.u0(this.f14185c, "", null, null, null, 62);
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$f */
    public static final class f extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.c.C0297e f14188c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC1664a f14189d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC1664a f14190e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC1664a f14191f;

        /* renamed from: g, reason: collision with root package name */
        public final String f14192g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f14193h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC1664a firstExpression, AbstractC1664a secondExpression, AbstractC1664a thirdExpression, String rawExpression) {
            super(rawExpression);
            e.c.C0297e c0297e = e.c.C0297e.f18537a;
            kotlin.jvm.internal.l.f(firstExpression, "firstExpression");
            kotlin.jvm.internal.l.f(secondExpression, "secondExpression");
            kotlin.jvm.internal.l.f(thirdExpression, "thirdExpression");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14188c = c0297e;
            this.f14189d = firstExpression;
            this.f14190e = secondExpression;
            this.f14191f = thirdExpression;
            this.f14192g = rawExpression;
            this.f14193h = C2097r.y0(thirdExpression.c(), C2097r.y0(secondExpression.c(), firstExpression.c()));
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) throws C1665b {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            e.c.C0297e c0297e = this.f14188c;
            if (!androidx.work.s.n(c0297e)) {
                C1666c.c(this.f14167a, c0297e + " was incorrectly parsed as a ternary operator.", null);
                throw null;
            }
            AbstractC1664a abstractC1664a = this.f14189d;
            Object objB = evaluator.b(abstractC1664a);
            d(abstractC1664a.f14168b);
            boolean z10 = objB instanceof Boolean;
            AbstractC1664a abstractC1664a2 = this.f14191f;
            AbstractC1664a abstractC1664a3 = this.f14190e;
            if (z10) {
                if (((Boolean) objB).booleanValue()) {
                    Object objB2 = evaluator.b(abstractC1664a3);
                    d(abstractC1664a3.f14168b);
                    return objB2;
                }
                Object objB3 = evaluator.b(abstractC1664a2);
                d(abstractC1664a2.f14168b);
                return objB3;
            }
            C1666c.c(abstractC1664a + " ? " + abstractC1664a3 + " : " + abstractC1664a2, "Ternary must be called with a Boolean value as a condition.", null);
            throw null;
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14193h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.l.b(this.f14188c, fVar.f14188c) && kotlin.jvm.internal.l.b(this.f14189d, fVar.f14189d) && kotlin.jvm.internal.l.b(this.f14190e, fVar.f14190e) && kotlin.jvm.internal.l.b(this.f14191f, fVar.f14191f) && kotlin.jvm.internal.l.b(this.f14192g, fVar.f14192g);
        }

        public final int hashCode() {
            return this.f14192g.hashCode() + ((this.f14191f.hashCode() + ((this.f14190e.hashCode() + ((this.f14189d.hashCode() + (this.f14188c.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "(" + this.f14189d + ' ' + e.c.d.f18536a + ' ' + this.f14190e + ' ' + e.c.C0296c.f18535a + ' ' + this.f14191f + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$g */
    public static final class g extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.c.f f14194c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC1664a f14195d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC1664a f14196e;

        /* renamed from: f, reason: collision with root package name */
        public final String f14197f;

        /* renamed from: g, reason: collision with root package name */
        public final ArrayList f14198g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e.c.f fVar, AbstractC1664a tryExpression, AbstractC1664a fallbackExpression, String rawExpression) {
            super(rawExpression);
            kotlin.jvm.internal.l.f(tryExpression, "tryExpression");
            kotlin.jvm.internal.l.f(fallbackExpression, "fallbackExpression");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14194c = fVar;
            this.f14195d = tryExpression;
            this.f14196e = fallbackExpression;
            this.f14197f = rawExpression;
            this.f14198g = C2097r.y0(fallbackExpression.c(), tryExpression.c());
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) throws C1665b {
            Object objA;
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            AbstractC1664a abstractC1664a = this.f14195d;
            try {
                objA = evaluator.b(abstractC1664a);
                d(abstractC1664a.f14168b);
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (b9.m.a(objA) == null) {
                return objA;
            }
            AbstractC1664a abstractC1664a2 = this.f14196e;
            Object objB = evaluator.b(abstractC1664a2);
            d(abstractC1664a2.f14168b);
            return objB;
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14198g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.l.b(this.f14194c, gVar.f14194c) && kotlin.jvm.internal.l.b(this.f14195d, gVar.f14195d) && kotlin.jvm.internal.l.b(this.f14196e, gVar.f14196e) && kotlin.jvm.internal.l.b(this.f14197f, gVar.f14197f);
        }

        public final int hashCode() {
            return this.f14197f.hashCode() + ((this.f14196e.hashCode() + ((this.f14195d.hashCode() + (this.f14194c.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "(" + this.f14195d + ' ' + this.f14194c + ' ' + this.f14196e + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$h */
    public static final class h extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.c f14199c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC1664a f14200d;

        /* renamed from: e, reason: collision with root package name */
        public final String f14201e;

        /* renamed from: f, reason: collision with root package name */
        public final List<String> f14202f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e.c cVar, AbstractC1664a expression, String rawExpression) {
            super(rawExpression);
            kotlin.jvm.internal.l.f(expression, "expression");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14199c = cVar;
            this.f14200d = expression;
            this.f14201e = rawExpression;
            this.f14202f = expression.c();
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) throws C1665b {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            AbstractC1664a abstractC1664a = this.f14200d;
            Object objB = evaluator.b(abstractC1664a);
            d(abstractC1664a.f14168b);
            e.c cVar = this.f14199c;
            if (cVar instanceof e.c.g.C0298c) {
                if (objB instanceof Long) {
                    return Long.valueOf(((Number) objB).longValue());
                }
                if (objB instanceof Double) {
                    return Double.valueOf(((Number) objB).doubleValue());
                }
                C1666c.c("+" + objB, "A Number is expected after a unary plus.", null);
                throw null;
            }
            if (cVar instanceof e.c.g.a) {
                if (objB instanceof Long) {
                    return Long.valueOf(-((Number) objB).longValue());
                }
                if (objB instanceof Double) {
                    return Double.valueOf(-((Number) objB).doubleValue());
                }
                C1666c.c("-" + objB, "A Number is expected after a unary minus.", null);
                throw null;
            }
            if (!kotlin.jvm.internal.l.b(cVar, e.c.g.b.f18540a)) {
                throw new C1665b(null, cVar + " was incorrectly parsed as a unary operator.");
            }
            if (objB instanceof Boolean) {
                return Boolean.valueOf(!((Boolean) objB).booleanValue());
            }
            String str = objB instanceof String ? "'" : "";
            C1666c.c("!" + str + objB + str, "A Boolean is expected after a unary not.", null);
            throw null;
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14202f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.l.b(this.f14199c, hVar.f14199c) && kotlin.jvm.internal.l.b(this.f14200d, hVar.f14200d) && kotlin.jvm.internal.l.b(this.f14201e, hVar.f14201e);
        }

        public final int hashCode() {
            return this.f14201e.hashCode() + ((this.f14200d.hashCode() + (this.f14199c.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14199c);
            sb.append(this.f14200d);
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$i */
    public static final class i extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final e.b.a f14203c;

        /* renamed from: d, reason: collision with root package name */
        public final String f14204d;

        /* renamed from: e, reason: collision with root package name */
        public final C2099t f14205e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e.b.a token, String rawExpression) {
            super(rawExpression);
            kotlin.jvm.internal.l.f(token, "token");
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14203c = token;
            this.f14204d = rawExpression;
            this.f14205e = C2099t.f18581b;
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            e.b.a aVar = this.f14203c;
            if (aVar instanceof e.b.a.C0283b) {
                return ((e.b.a.C0283b) aVar).f18517a;
            }
            if (aVar instanceof e.b.a.C0282a) {
                return Boolean.valueOf(((e.b.a.C0282a) aVar).f18516a);
            }
            if (aVar instanceof e.b.a.c) {
                return ((e.b.a.c) aVar).f18518a;
            }
            throw new b9.j();
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14205e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.l.b(this.f14203c, iVar.f14203c) && kotlin.jvm.internal.l.b(this.f14204d, iVar.f14204d);
        }

        public final int hashCode() {
            return this.f14204d.hashCode() + (this.f14203c.hashCode() * 31);
        }

        public final String toString() {
            e.b.a aVar = this.f14203c;
            if (aVar instanceof e.b.a.c) {
                return B8.j(new StringBuilder("'"), ((e.b.a.c) aVar).f18518a, '\'');
            }
            if (aVar instanceof e.b.a.C0283b) {
                return ((e.b.a.C0283b) aVar).f18517a.toString();
            }
            if (aVar instanceof e.b.a.C0282a) {
                return String.valueOf(((e.b.a.C0282a) aVar).f18516a);
            }
            throw new b9.j();
        }
    }

    /* compiled from: Evaluable.kt */
    /* renamed from: a7.a$j */
    public static final class j extends AbstractC1664a {

        /* renamed from: c, reason: collision with root package name */
        public final String f14206c;

        /* renamed from: d, reason: collision with root package name */
        public final String f14207d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f14208e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String rawExpression) {
            super(rawExpression);
            kotlin.jvm.internal.l.f(rawExpression, "rawExpression");
            this.f14206c = str;
            this.f14207d = rawExpression;
            this.f14208e = E.u.G(str);
        }

        @Override // a7.AbstractC1664a
        public final Object b(C1668e evaluator) {
            kotlin.jvm.internal.l.f(evaluator, "evaluator");
            s6.k kVar = (s6.k) evaluator.f14211a.f13448a;
            String str = this.f14206c;
            Object objMo0get = kVar.mo0get(str);
            if (objMo0get != null) {
                return objMo0get;
            }
            throw new s(str);
        }

        @Override // a7.AbstractC1664a
        public final List<String> c() {
            return this.f14208e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.l.b(this.f14206c, jVar.f14206c) && kotlin.jvm.internal.l.b(this.f14207d, jVar.f14207d);
        }

        public final int hashCode() {
            return this.f14207d.hashCode() + (this.f14206c.hashCode() * 31);
        }

        public final String toString() {
            return this.f14206c;
        }
    }

    public AbstractC1664a(String rawExpr) {
        kotlin.jvm.internal.l.f(rawExpr, "rawExpr");
        this.f14167a = rawExpr;
        this.f14168b = true;
    }

    public final Object a(C1668e evaluator) throws C1665b {
        kotlin.jvm.internal.l.f(evaluator, "evaluator");
        return b(evaluator);
    }

    public abstract Object b(C1668e c1668e) throws C1665b;

    public abstract List<String> c();

    public final void d(boolean z10) {
        this.f14168b = this.f14168b && z10;
    }
}
