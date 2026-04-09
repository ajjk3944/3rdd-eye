package B;

import androidx.compose.ui.layout.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class v implements androidx.compose.ui.layout.y {

    /* renamed from: a, reason: collision with root package name */
    private final r f1015a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f1016b = new LinkedHashMap();

    public v(r rVar) {
        this.f1015a = rVar;
    }

    @Override // androidx.compose.ui.layout.y
    public void a(y.a aVar) {
        this.f1016b.clear();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            Object objC = this.f1015a.c(it.next());
            Integer num = (Integer) this.f1016b.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f1016b.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.y
    public boolean b(Object obj, Object obj2) {
        return AbstractC6492s.d(this.f1015a.c(obj), this.f1015a.c(obj2));
    }
}
