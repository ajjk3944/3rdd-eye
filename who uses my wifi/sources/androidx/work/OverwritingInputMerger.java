package androidx.work;

import defpackage.hm;
import defpackage.im;
import defpackage.v20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends v20 {
    @Override // defpackage.v20
    public final im a(ArrayList arrayList) throws Throwable {
        hm hmVar = new hm();
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.putAll(Collections.unmodifiableMap(((im) obj).a));
        }
        hmVar.a(map);
        im imVar = new im(hmVar.a);
        im.c(imVar);
        return imVar;
    }
}
