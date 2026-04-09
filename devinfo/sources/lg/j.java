package lg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends e {
    @Override // lg.e
    public final boolean a(aj.b bVar) {
        String str = bVar.f410e;
        nk.k.d(str, "getNodeName(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        if (p.p0(lowerCase, ".thumbnails", false) || p.p0(lowerCase, ".thumbnail", false)) {
            HashMap map = bVar.f412h;
            Collection collectionValues = map == null ? null : map.values();
            if (collectionValues != null && collectionValues.size() == 1) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (".nomedia".equalsIgnoreCase(((aj.b) it.next()).f410e)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // lg.e
    public final kg.d b(aj.b bVar) {
        String strC = bVar.c();
        nk.k.d(strC, "getPath(...)");
        return new kg.e(strC, bVar.f406a, 3, bVar);
    }
}
