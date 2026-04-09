package Yh;

import Zg.AbstractC3689v;
import gh.AbstractC5918c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25032a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f25033b = AbstractC3689v.z0(AbstractC3689v.o('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f25034c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listO = AbstractC3689v.o("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iC = AbstractC5918c.c(0, listO.size() - 1, 2);
        if (iC >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f25033b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listO.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listO.get(i11));
                linkedHashMap.put(str + '/' + ((String) listO.get(i10)) + "Array", '[' + ((String) listO.get(i11)));
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f25033b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC3689v.o("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC3689v.o("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f25033b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC3689v.o("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f25033b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f25034c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map map, String str, String str2) {
        map.put(f25033b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String classId) {
        AbstractC6492s.i(classId, "classId");
        String str = (String) f25034c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + t.K(classId, '.', '$', false, 4, null) + ';';
    }
}
