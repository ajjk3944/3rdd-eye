package androidx.work;

import androidx.work.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // androidx.work.h
    public d b(List list) {
        d.a aVar = new d.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((d) it.next()).h());
        }
        aVar.d(map);
        return aVar.a();
    }
}
