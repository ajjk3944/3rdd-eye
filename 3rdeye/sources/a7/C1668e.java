package a7;

import a7.EnumC1667d;
import c7.e;
import c9.C2092m;
import d7.C4278a;
import d7.C4279b;
import d7.C4280c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Evaluator.kt */
/* renamed from: a7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1668e {

    /* renamed from: a, reason: collision with root package name */
    public final X0.n f14211a;

    /* compiled from: Evaluator.kt */
    /* renamed from: a7.e$a */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if (r12.equals(-1L) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Number a(c7.e.c.a.InterfaceC0290c r10, java.lang.Object r11, java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 409
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a7.C1668e.a.a(c7.e$c$a$c, java.lang.Object, java.lang.Object):java.lang.Number");
        }

        public static Object b(e.c.a.f operator, Object left, Object right) {
            double dDoubleValue;
            kotlin.jvm.internal.l.f(operator, "operator");
            kotlin.jvm.internal.l.f(left, "left");
            kotlin.jvm.internal.l.f(right, "right");
            if ((left instanceof String) && (right instanceof String)) {
                if (!(operator instanceof e.c.a.f.b)) {
                    C1666c.b(operator, left, right);
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(left);
                sb.append(right);
                return sb.toString();
            }
            if (!(left instanceof Long) || !(right instanceof Long)) {
                if (!(left instanceof Double) || !(right instanceof Double)) {
                    C1666c.b(operator, left, right);
                    throw null;
                }
                if (operator instanceof e.c.a.f.b) {
                    dDoubleValue = ((Number) right).doubleValue() + ((Number) left).doubleValue();
                } else {
                    if (!(operator instanceof e.c.a.f.C0295a)) {
                        throw new b9.j();
                    }
                    dDoubleValue = ((Number) left).doubleValue() - ((Number) right).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            }
            if (operator instanceof e.c.a.f.b) {
                Number number = (Number) left;
                Number number2 = (Number) right;
                long jLongValue = number2.longValue() + number.longValue();
                if (((number.longValue() ^ jLongValue) & (number2.longValue() ^ jLongValue)) >= 0) {
                    return Long.valueOf(jLongValue);
                }
                throw new l(left + " + " + right);
            }
            if (!(operator instanceof e.c.a.f.C0295a)) {
                throw new b9.j();
            }
            Number number3 = (Number) left;
            Number number4 = (Number) right;
            long jLongValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ jLongValue2)) >= 0) {
                return Long.valueOf(jLongValue2);
            }
            throw new l(left + " - " + right);
        }
    }

    /* compiled from: Evaluator.kt */
    /* renamed from: a7.e$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14212a;

        static {
            int[] iArr = new int[EnumC1667d.values().length];
            try {
                iArr[EnumC1667d.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14212a = iArr;
        }
    }

    public C1668e(X0.n nVar) {
        this.f14211a = nVar;
    }

    public static ArrayList a(g gVar, ArrayList arrayList) {
        EnumC1667d enumC1667d;
        List<j> listB = gVar.b();
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        int i = 0;
        for (Object objValueOf : arrayList) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            int iV = C2092m.V(listB);
            if (i > iV) {
                i = iV;
            }
            EnumC1667d enumC1667d2 = listB.get(i).f14227a;
            EnumC1667d.a aVar = EnumC1667d.Companion;
            boolean z10 = objValueOf instanceof Long;
            if (z10) {
                enumC1667d = EnumC1667d.INTEGER;
            } else if (objValueOf instanceof Double) {
                enumC1667d = EnumC1667d.NUMBER;
            } else if (objValueOf instanceof Boolean) {
                enumC1667d = EnumC1667d.BOOLEAN;
            } else if (objValueOf instanceof String) {
                enumC1667d = EnumC1667d.STRING;
            } else if (objValueOf instanceof C4279b) {
                enumC1667d = EnumC1667d.DATETIME;
            } else if (objValueOf instanceof C4278a) {
                enumC1667d = EnumC1667d.COLOR;
            } else if (objValueOf instanceof C4280c) {
                enumC1667d = EnumC1667d.URL;
            } else if (objValueOf instanceof JSONObject) {
                enumC1667d = EnumC1667d.DICT;
            } else {
                if (!(objValueOf instanceof JSONArray)) {
                    if (objValueOf == null) {
                        throw new C1665b(null, "Unable to find type for null");
                    }
                    throw new C1665b(null, "Unable to find type for ".concat(objValueOf.getClass().getName()));
                }
                enumC1667d = EnumC1667d.ARRAY;
            }
            if (enumC1667d2 != enumC1667d && z10 && b.f14212a[enumC1667d2.ordinal()] == 1) {
                objValueOf = Double.valueOf(((Number) objValueOf).longValue());
            }
            arrayList2.add(objValueOf);
            i = i10;
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean c(c7.e.c.a.InterfaceC0285a r3, java.lang.Comparable r4, java.lang.Comparable r5) {
        /*
            boolean r0 = r3 instanceof c7.e.c.a.InterfaceC0285a.C0287c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            int r3 = r4.compareTo(r5)
            if (r3 >= 0) goto L2f
        Lc:
            r1 = r2
            goto L2f
        Le:
            boolean r0 = r3 instanceof c7.e.c.a.InterfaceC0285a.d
            if (r0 == 0) goto L19
            int r3 = r4.compareTo(r5)
            if (r3 > 0) goto L2f
            goto Lc
        L19:
            boolean r0 = r3 instanceof c7.e.c.a.InterfaceC0285a.b
            if (r0 == 0) goto L24
            int r3 = r4.compareTo(r5)
            if (r3 < 0) goto L2f
            goto Lc
        L24:
            boolean r3 = r3 instanceof c7.e.c.a.InterfaceC0285a.C0286a
            if (r3 == 0) goto L34
            int r3 = r4.compareTo(r5)
            if (r3 <= 0) goto L2f
            goto Lc
        L2f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L34:
            b9.j r3 = new b9.j
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.C1668e.c(c7.e$c$a$a, java.lang.Comparable, java.lang.Comparable):java.lang.Boolean");
    }

    public final <T> T b(AbstractC1664a expr) throws C1665b {
        kotlin.jvm.internal.l.f(expr, "expr");
        try {
            return (T) expr.a(this);
        } catch (C1665b e4) {
            throw e4;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            throw new C1665b(message, e10);
        }
    }
}
