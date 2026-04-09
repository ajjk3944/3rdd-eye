package androidx.work;

import androidx.work.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: OverwritingInputMerger.kt */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // androidx.work.i
    public final e a(ArrayList arrayList) throws Throwable {
        e.a aVar = new e.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((e) it.next()).f16894a);
            kotlin.jvm.internal.l.e(mapUnmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        aVar.b(linkedHashMap);
        e eVar = new e(aVar.f16895a);
        e.i(eVar);
        return eVar;
    }
}
