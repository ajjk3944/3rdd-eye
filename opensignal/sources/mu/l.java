package mu;

import com.google.android.gms.internal.measurement.e5;
import h7.h0;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m f17018a = new m();

    public static final h a(Number number, String str, String str2) {
        br.l.e(str, "key");
        br.l.e(str2, "output");
        return e(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(str2, -1)));
    }

    public static final k b(String str, Number number) {
        return new k("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(str, -1)));
    }

    public static final k c(iu.e eVar) {
        return new k("Value of type '" + eVar.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.f() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final h d(int i10, CharSequence charSequence, String str) {
        br.l.e(str, "message");
        br.l.e(charSequence, "input");
        return e(i10, str + "\nJSON input: " + ((Object) l(charSequence, i10)));
    }

    public static final h e(int i10, String str) {
        br.l.e(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        br.l.e(str, "message");
        return new h(str);
    }

    public static final iu.e f(iu.e eVar, cg.e eVar2) {
        br.l.e(eVar, "<this>");
        br.l.e(eVar2, "module");
        if (!br.l.a(eVar.f(), iu.h.f13009d)) {
            return eVar.g() ? f(eVar.n(0), eVar2) : eVar;
        }
        e5.x(eVar);
        return eVar;
    }

    public static final byte g(char c4) {
        if (c4 < '~') {
            return d.f17011b[c4];
        }
        return (byte) 0;
    }

    public static final String h(iu.e eVar, lu.c cVar) {
        br.l.e(eVar, "<this>");
        br.l.e(cVar, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof lu.h) {
                return ((lu.h) annotation).discriminator();
            }
        }
        return cVar.f15934a.f15947e;
    }

    public static final int i(iu.e eVar, lu.c cVar, String str) {
        br.l.e(eVar, "<this>");
        br.l.e(cVar, "json");
        br.l.e(str, "name");
        m(eVar, cVar);
        int iJ = eVar.j(str);
        if (iJ != -3 || !cVar.f15934a.f15948f) {
            return iJ;
        }
        h0 h0Var = cVar.f15936c;
        c8.x xVar = new c8.x(eVar, 3, cVar);
        h0Var.getClass();
        m mVar = f17018a;
        Object objW = h0Var.w(eVar, mVar);
        if (objW == null) {
            objW = xVar.c();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h0Var.f10078a;
            Object concurrentHashMap2 = concurrentHashMap.get(eVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(mVar, objW);
        }
        Integer num = (Integer) ((Map) objW).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int j(iu.e eVar, lu.c cVar, String str, String str2) {
        br.l.e(eVar, "<this>");
        br.l.e(cVar, "json");
        br.l.e(str, "name");
        br.l.e(str2, "suffix");
        int i10 = i(eVar, cVar, str);
        if (i10 != -3) {
            return i10;
        }
        throw new gu.e(eVar.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final void k(bj.c cVar, String str) {
        cVar.t("Trailing comma before the end of JSON ".concat(str), cVar.f2794d - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence l(CharSequence charSequence, int i10) {
        br.l.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                String str = i11 <= 0 ? "" : ".....";
                String str2 = i12 >= charSequence.length() ? "" : ".....";
                StringBuilder sbT = c7.a.t(str);
                if (i11 < 0) {
                    i11 = 0;
                }
                int length = charSequence.length();
                if (i12 > length) {
                    i12 = length;
                }
                sbT.append(charSequence.subSequence(i11, i12).toString());
                sbT.append(str2);
                return sbT.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void m(iu.e eVar, lu.c cVar) {
        br.l.e(eVar, "<this>");
        br.l.e(cVar, "json");
        br.l.a(eVar.f(), iu.j.f13011d);
    }

    public static final Object n(lu.c cVar, String str, lu.w wVar, gu.a aVar) {
        br.l.e(cVar, "<this>");
        br.l.e(str, "discriminator");
        return new o(cVar, wVar, str, aVar.getDescriptor()).f(aVar);
    }

    public static final b0 o(iu.e eVar, lu.c cVar) {
        br.l.e(eVar, "desc");
        i3.g gVarF = eVar.f();
        if (gVarF instanceof iu.b) {
            return b0.POLY_OBJ;
        }
        if (br.l.a(gVarF, iu.j.f13012e)) {
            return b0.LIST;
        }
        if (!br.l.a(gVarF, iu.j.f13013f)) {
            return b0.OBJ;
        }
        iu.e eVarF = f(eVar.n(0), cVar.f15935b);
        i3.g gVarF2 = eVarF.f();
        if ((gVarF2 instanceof iu.d) || br.l.a(gVarF2, iu.i.f13010d)) {
            return b0.MAP;
        }
        throw c(eVarF);
    }

    public static final void p(bj.c cVar, Number number) {
        bj.c.u(cVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String q(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }
}
