package Zh;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes4.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25415a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25415a = iArr;
        }
    }

    public static final Object a(c cVar, Map values) {
        Object next;
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (AbstractC6492s.d(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c packageName) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(packageName, "packageName");
        return AbstractC6492s.d(f(cVar), packageName);
    }

    public static final boolean c(c cVar, c packageName) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(packageName, "packageName");
        if (AbstractC6492s.d(cVar, packageName) || packageName.d()) {
            return true;
        }
        String strB = cVar.b();
        AbstractC6492s.h(strB, "asString(...)");
        String strB2 = packageName.b();
        AbstractC6492s.h(strB2, "asString(...)");
        return d(strB, strB2);
    }

    private static final boolean d(String str, String str2) {
        return t.P(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f25415a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt == '.') {
                    kVar = k.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return kVar != k.AFTER_DOT;
    }

    public static final c f(c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c prefix) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(prefix, "prefix");
        if (!c(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (AbstractC6492s.d(cVar, prefix)) {
            c ROOT = c.f25405c;
            AbstractC6492s.h(ROOT, "ROOT");
            return ROOT;
        }
        String strB = cVar.b();
        AbstractC6492s.h(strB, "asString(...)");
        String strSubstring = strB.substring(prefix.b().length() + 1);
        AbstractC6492s.h(strSubstring, "substring(...)");
        return new c(strSubstring);
    }
}
