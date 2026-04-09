package androidx.work;

import A2.C0117e;
import V0.f;
import V0.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // V0.h
    public final f a(ArrayList arrayList) throws Throwable {
        C0117e c0117e = new C0117e(19);
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.putAll(Collections.unmodifiableMap(((f) obj).f3821a));
        }
        c0117e.x(map);
        f fVar = new f((HashMap) c0117e.f245b);
        f.c(fVar);
        return fVar;
    }
}
