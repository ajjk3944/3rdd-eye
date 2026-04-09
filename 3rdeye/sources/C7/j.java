package c7;

import N7.C1154e9;
import a7.C1665b;
import a7.t;
import c7.e;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import y9.n;

/* compiled from: Tokenizer.kt */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Tokenizer.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final char[] f18546a;

        /* renamed from: b, reason: collision with root package name */
        public int f18547b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f18548c = new ArrayList();

        public a(char[] cArr) {
            this.f18546a = cArr;
        }

        public static char c(a aVar) {
            int i = aVar.f18547b + 1;
            char[] cArr = aVar.f18546a;
            if (i >= cArr.length) {
                return (char) 0;
            }
            return cArr[i];
        }

        public static char d(a aVar) {
            int i = aVar.f18547b - 1;
            if (i >= 0) {
                return aVar.f18546a[i];
            }
            return (char) 0;
        }

        public final char a() {
            int i = this.f18547b;
            char[] cArr = this.f18546a;
            if (i >= cArr.length) {
                return (char) 0;
            }
            return cArr[i];
        }

        public final int b(int i) {
            int i10 = this.f18547b;
            this.f18547b = i + i10;
            return i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Tokenizer.TokenizationState");
            return Arrays.equals(this.f18546a, ((a) obj).f18546a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f18546a);
        }

        public final String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.f18546a) + ')';
        }
    }

    public static C1665b a(a aVar) {
        return new C1665b(null, "Invalid token '" + aVar.a() + "' at position " + aVar.f18547b);
    }

    public static boolean b(char c10, a aVar) {
        if (c10 == '\'') {
            int i = aVar.f18547b;
            char[] cArr = aVar.f18546a;
            if (i < cArr.length) {
                int i10 = 0;
                for (int i11 = i - 1; i11 > 0 && cArr[i11] == '\\'; i11--) {
                    i10++;
                }
                if (i10 % 2 == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(char c10, char c11, char c12) {
        if (!Character.isDigit(c10)) {
            if (!(c10 == '.' ? Character.isDigit(c12) : !(c10 == 'e' || c10 == 'E') ? !((c10 == '+' || c10 == '-') && ((c11 == 'e' || c11 == 'E') && Character.isDigit(c12))) : !(Character.isDigit(c11) && (Character.isDigit(c12) || c12 == '+' || c12 == '-')))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(ArrayList arrayList) {
        if (arrayList.isEmpty() || (C2097r.v0(arrayList) instanceof e.c.g)) {
            return false;
        }
        return (C2097r.v0(arrayList) instanceof e.b) || (C2097r.v0(arrayList) instanceof d);
    }

    public static boolean e(char c10, a aVar) {
        return c10 == '@' && a.d(aVar) != '\\' && a.c(aVar) == '{';
    }

    public static boolean f(ArrayList arrayList) {
        return (d(arrayList) || (C2097r.w0(arrayList) instanceof e.c.g)) ? false : true;
    }

    public static String g(a aVar, boolean z10) {
        int i = aVar.f18547b;
        while (aVar.a() != 0 && !e(aVar.a(), aVar) && (!z10 || !b(aVar.a(), aVar))) {
            aVar.b(1);
        }
        String strA = C2073a.a(n.S(aVar.f18546a, i, aVar.f18547b));
        if (strA.length() > 0) {
            return strA;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [c7.j$a] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public static void h(a aVar, ArrayList arrayList, boolean z10) {
        e eVar;
        e eVar2;
        int i;
        char c10;
        char c11;
        int i10;
        boolean z11;
        e.a aVar2;
        char c12;
        e.b.a.C0282a c0282a;
        ?? r32 = 1;
        if (z10) {
            aVar.b(1);
        }
        ArrayList arrayList2 = new ArrayList();
        String strG = g(aVar, z10);
        if (aVar.a() == 0) {
            if (z10) {
                throw new t("''' expected at end of string literal at " + aVar.f18547b);
            }
            if (strG != null) {
                arrayList.add(new e.b.a.c(strG));
                return;
            }
            return;
        }
        if (b(aVar.a(), aVar)) {
            if (strG == null) {
                strG = "";
            }
            arrayList.add(new e.b.a.c(strG));
            aVar.b(1);
            return;
        }
        h hVar = h.f18544a;
        if (strG != null && e(aVar.a(), aVar)) {
            arrayList2.add(hVar);
            arrayList2.add(new e.b.a.c(strG));
        }
        while (e(aVar.a(), aVar)) {
            ArrayList arrayList3 = new ArrayList();
            if (e(aVar.a(), aVar)) {
                int i11 = 2;
                aVar.b(2);
                while (aVar.a() != 0 && aVar.a() != '}') {
                    char cA = aVar.a();
                    if (cA == '?') {
                        arrayList3.add(e.c.d.f18536a);
                        aVar.b(r32);
                    } else if (cA == ':') {
                        arrayList3.add(e.c.C0296c.f18535a);
                        aVar.b(r32);
                    } else if (cA == '+') {
                        if (f(arrayList3)) {
                            eVar = e.c.g.C0298c.f18541a;
                        } else {
                            if (!d(arrayList3)) {
                                throw a(aVar);
                            }
                            eVar = e.c.a.f.b.f18533a;
                        }
                        arrayList3.add(eVar);
                        aVar.b(r32);
                    } else if (cA == '-') {
                        if (f(arrayList3)) {
                            eVar2 = e.c.g.a.f18539a;
                        } else {
                            if (!d(arrayList3)) {
                                throw a(aVar);
                            }
                            eVar2 = e.c.a.f.C0295a.f18532a;
                        }
                        arrayList3.add(eVar2);
                        aVar.b(r32);
                    } else if (cA == '*') {
                        arrayList3.add(e.c.a.InterfaceC0290c.C0292c.f18528a);
                        aVar.b(r32);
                    } else if (cA == '/') {
                        arrayList3.add(e.c.a.InterfaceC0290c.C0291a.f18526a);
                        aVar.b(r32);
                    } else if (cA == '%') {
                        arrayList3.add(e.c.a.InterfaceC0290c.b.f18527a);
                        aVar.b(r32);
                    } else if (cA == '!') {
                        if (a.c(aVar) == '=') {
                            arrayList3.add(e.c.a.b.C0289b.f18525a);
                            aVar.b(i11);
                        } else if (a.c(aVar) == ':') {
                            arrayList3.add(e.c.f.f18538a);
                            aVar.b(i11);
                        } else {
                            if (!f(arrayList3)) {
                                throw a(aVar);
                            }
                            arrayList3.add(e.c.g.b.f18540a);
                            aVar.b(r32);
                        }
                    } else if (cA == '&') {
                        if (a.c(aVar) != '&') {
                            throw a(aVar);
                        }
                        arrayList3.add(e.c.a.d.C0293a.f18529a);
                        aVar.b(i11);
                    } else if (cA == '|') {
                        if (a.c(aVar) != '|') {
                            throw a(aVar);
                        }
                        arrayList3.add(e.c.a.d.b.f18530a);
                        aVar.b(i11);
                    } else if (cA == '<') {
                        if (a.c(aVar) == '=') {
                            arrayList3.add(e.c.a.InterfaceC0285a.d.f18523a);
                            aVar.b(i11);
                        } else {
                            arrayList3.add(e.c.a.InterfaceC0285a.C0287c.f18522a);
                            aVar.b(r32);
                        }
                    } else if (cA == '>') {
                        if (a.c(aVar) == '=') {
                            arrayList3.add(e.c.a.InterfaceC0285a.b.f18521a);
                            aVar.b(i11);
                        } else {
                            arrayList3.add(e.c.a.InterfaceC0285a.C0286a.f18520a);
                            aVar.b(r32);
                        }
                    } else if (cA == '=') {
                        if (a.c(aVar) != '=') {
                            throw a(aVar);
                        }
                        arrayList3.add(e.c.a.b.C0288a.f18524a);
                        aVar.b(i11);
                    } else if (cA == '(') {
                        arrayList3.add(c.f18512a);
                        aVar.b(r32);
                    } else if (cA == ')') {
                        arrayList3.add(d.f18513a);
                        aVar.b(r32);
                    } else if (cA == ',') {
                        arrayList3.add(e.a.C0281a.f18515a);
                        aVar.b(r32);
                    } else if (cA == '\'') {
                        h(aVar, arrayList3, r32);
                    } else {
                        char cA2 = aVar.a();
                        if (cA2 == ' ' || cA2 == '\t' || cA2 == '\r' || cA2 == '\n') {
                            i = r32;
                            aVar.b(i);
                        } else {
                            boolean zC = c(aVar.a(), a.d(aVar), a.c(aVar));
                            char[] cArr = aVar.f18546a;
                            if (zC) {
                                int i12 = aVar.f18547b;
                                boolean z12 = C2097r.w0(arrayList3) instanceof e.c.g.a;
                                if (z12 && !arrayList3.isEmpty()) {
                                    arrayList3.remove(C2092m.V(arrayList3));
                                }
                                do {
                                    aVar.b(r32);
                                } while (Character.isDigit(aVar.a()));
                                if (((i12 < 0 || i12 >= cArr.length) ? (char) 0 : cArr[i12]) == '.' || c(aVar.a(), a.d(aVar), a.c(aVar))) {
                                    while (c(aVar.a(), a.d(aVar), a.c(aVar))) {
                                        aVar.b(1);
                                    }
                                    String strConcat = z12 ? "-".concat(n.S(cArr, i12, aVar.f18547b)) : n.S(cArr, i12, aVar.f18547b);
                                    try {
                                        arrayList3.add(new e.b.a.C0283b(Double.valueOf(Double.parseDouble(strConcat))));
                                    } catch (Exception unused) {
                                        throw new C1665b(null, C1154e9.i("Value ", strConcat, " can't be converted to Number type."));
                                    }
                                } else {
                                    String strConcat2 = z12 ? "-".concat(n.S(cArr, i12, aVar.f18547b)) : n.S(cArr, i12, aVar.f18547b);
                                    try {
                                        arrayList3.add(new e.b.a.C0283b(Long.valueOf(Long.parseLong(strConcat2))));
                                    } catch (Exception unused2) {
                                        throw new C1665b(null, C1154e9.i("Value ", strConcat2, " can't be converted to Integer type."));
                                    }
                                }
                            } else {
                                char cA3 = aVar.a();
                                char c13 = '[';
                                char c14 = 'A';
                                boolean z13 = ('a' <= cA3 && cA3 < '{') || ('A' <= cA3 && cA3 < '[') || cA3 == '_';
                                e.c.b bVar = e.c.b.f18534a;
                                if (z13) {
                                    int i13 = aVar.f18547b;
                                    Integer numValueOf = null;
                                    while (true) {
                                        int i14 = aVar.f18547b;
                                        while (true) {
                                            char cA4 = aVar.a();
                                            if (('a' > cA4 || cA4 >= '{') && ((c14 > cA4 || cA4 >= c13) && cA4 != '_' && ('0' > cA4 || cA4 >= ':'))) {
                                                break;
                                            }
                                            aVar.b(1);
                                            c13 = '[';
                                        }
                                        if (aVar.a() == '.') {
                                            int i15 = aVar.f18547b + 1;
                                            numValueOf = Integer.valueOf(i15);
                                            aVar.b(1);
                                            if (i15 - i14 <= 1) {
                                                throw new C1665b(null, "Unexpected token: .");
                                            }
                                        }
                                        char cA5 = aVar.a();
                                        if ('a' > cA5 || cA5 >= '{') {
                                            c10 = '[';
                                            if ('A' <= cA5) {
                                                c11 = '_';
                                                if (cA5 < '[') {
                                                }
                                                c13 = c10;
                                                c14 = 'A';
                                            } else {
                                                c11 = '_';
                                            }
                                            if (cA5 != c11) {
                                                if ('0' > cA5 || cA5 >= ':') {
                                                    if (aVar.a() != '.') {
                                                        int iIntValue = aVar.f18547b;
                                                        while (true) {
                                                            char cA6 = aVar.a();
                                                            if (cA6 == ' ' || cA6 == '\t') {
                                                                i10 = 1;
                                                                aVar.b(i10);
                                                            } else if (cA6 == '\r') {
                                                                i10 = 1;
                                                                aVar.b(i10);
                                                            } else {
                                                                if (cA6 != '\n') {
                                                                    break;
                                                                }
                                                                i10 = 1;
                                                                aVar.b(i10);
                                                            }
                                                        }
                                                        if (aVar.a() == '(') {
                                                            aVar2 = new e.a(n.S(cArr, numValueOf != null ? numValueOf.intValue() : i13, iIntValue));
                                                            if (numValueOf == null) {
                                                                arrayList3.add(aVar2);
                                                            } else {
                                                                z11 = true;
                                                                iIntValue = numValueOf.intValue() - 1;
                                                            }
                                                        } else {
                                                            z11 = true;
                                                            aVar2 = null;
                                                        }
                                                        String strS = n.S(cArr, i13, iIntValue);
                                                        if (strS.equals("true")) {
                                                            c0282a = new e.b.a.C0282a(z11);
                                                            c12 = 0;
                                                        } else if (strS.equals("false")) {
                                                            c12 = 0;
                                                            c0282a = new e.b.a.C0282a(false);
                                                        } else {
                                                            c12 = 0;
                                                            c0282a = null;
                                                        }
                                                        if (c0282a == null) {
                                                            int i16 = iIntValue - 1;
                                                            if ((((i16 < 0 || i16 >= cArr.length) ? c12 : cArr[i16]) == '.' ? (char) 1 : c12) != 0) {
                                                                throw new C1665b(null, "Unexpected token: .");
                                                            }
                                                            arrayList3.add(new e.b.C0284b(strS));
                                                        } else {
                                                            arrayList3.add(c0282a);
                                                        }
                                                        if (aVar2 != null) {
                                                            arrayList3.add(bVar);
                                                            arrayList3.add(aVar2);
                                                        }
                                                    }
                                                }
                                            }
                                            c13 = c10;
                                            c14 = 'A';
                                        } else {
                                            c10 = '[';
                                        }
                                        c13 = c10;
                                        c14 = 'A';
                                    }
                                } else {
                                    i = 1;
                                    if (!(aVar.a() == '.')) {
                                        throw a(aVar);
                                    }
                                    aVar.b(1);
                                    arrayList3.add(bVar);
                                }
                            }
                            r32 = 1;
                            i11 = 2;
                        }
                        r32 = i;
                        i11 = 2;
                    }
                }
                int i17 = r32;
                if (aVar.a() != '}') {
                    throw new t("'}' expected at end of expression at " + aVar.f18547b);
                }
                aVar.b(i17);
            }
            String strG2 = g(aVar, z10);
            if (!z10 && arrayList2.isEmpty() && strG2 == null && !e(aVar.a(), aVar)) {
                arrayList.addAll(arrayList3);
                return;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(hVar);
            }
            arrayList2.add(i.f18545a);
            arrayList2.addAll(arrayList3);
            arrayList2.add(g.f18543a);
            if (strG2 != null) {
                arrayList2.add(new e.b.a.c(strG2));
            }
            r32 = 1;
        }
        if (z10 && !b(aVar.a(), aVar)) {
            throw new t("''' expected at end of string literal at " + aVar.f18547b);
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList.add(f.f18542a);
        }
        if (z10) {
            aVar.b(1);
        }
    }
}
