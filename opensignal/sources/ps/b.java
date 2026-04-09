package ps;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.y3;
import java.util.LinkedHashMap;
import java.util.List;
import mq.o;
import tt.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20631a = o.x0(e5.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f20632b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listI = e5.I("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iV = y3.v(0, listI.size() - 1, 2);
        if (iV >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f20631a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listI.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listI.get(i11));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(w.g.j(sb3, (String) listI.get(i10), "Array"), "[" + ((String) listI.get(i11)));
                if (i10 == iV) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f20631a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : e5.I("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : e5.I("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, c7.a.p("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String strH = h0.b.h(i12, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f20631a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            a(linkedHashMap, strH, sb4.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : e5.I("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, w.g.f(str5, ".Companion"), f20631a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f20632b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f20631a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        l.e(str, "classId");
        String str2 = (String) f20632b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + s.k0(str, '.', '$') + ';';
    }
}
