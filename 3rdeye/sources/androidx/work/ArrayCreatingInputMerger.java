package androidx.work;

import androidx.work.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ArrayCreatingInputMerger.kt */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends i {
    @Override // androidx.work.i
    public final e a(ArrayList arrayList) throws Throwable {
        Object newArray;
        e.a aVar = new e.a();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((e) it.next()).f16894a);
            kotlin.jvm.internal.l.e(mapUnmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                kotlin.jvm.internal.l.e(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        kotlin.jvm.internal.l.e(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.l.c(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        kotlin.jvm.internal.l.e(newArray2, "newArray");
                        value = newArray2;
                    } else {
                        if (!kotlin.jvm.internal.l.b(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        kotlin.jvm.internal.l.e(newArray, "newArray");
                        value = newArray;
                    }
                } else if (!cls.isArray()) {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    kotlin.jvm.internal.l.e(newArray, "newArray");
                    value = newArray;
                }
                kotlin.jvm.internal.l.e(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        aVar.b(map);
        e eVar = new e(aVar.f16895a);
        e.i(eVar);
        return eVar;
    }
}
