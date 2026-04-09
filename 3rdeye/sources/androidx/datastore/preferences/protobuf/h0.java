package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1740s;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public final class h0 extends i0<Object, Object> {
    @Override // androidx.datastore.preferences.protobuf.i0
    public final void g() {
        if (!this.f15627e) {
            for (int i = 0; i < this.f15625c.size(); i++) {
                ((C1740s.b) d(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = e().iterator();
            while (it.hasNext()) {
                ((C1740s.b) it.next().getKey()).getClass();
            }
        }
        super.g();
    }

    @Override // androidx.datastore.preferences.protobuf.i0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C1740s.b) obj, obj2);
    }
}
