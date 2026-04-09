package v;

import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1709q;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CaptureCallbackConverter.java */
/* loaded from: classes.dex */
public final class V {
    public static void a(AbstractC1707p abstractC1707p, ArrayList arrayList) {
        if (abstractC1707p instanceof C1709q) {
            Iterator it = ((C1709q) abstractC1707p).f15113a.iterator();
            while (it.hasNext()) {
                a((AbstractC1707p) it.next(), arrayList);
            }
        } else if (abstractC1707p instanceof U) {
            arrayList.add(((U) abstractC1707p).f46639a);
        } else {
            arrayList.add(new T(abstractC1707p));
        }
    }
}
