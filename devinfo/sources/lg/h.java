package lg;

import java.util.Locale;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends e {
    @Override // lg.e
    public final boolean a(aj.b bVar) {
        if (!bVar.f409d) {
            String str = bVar.f410e;
            nk.k.d(str, "getNodeName(...)");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            nk.k.d(lowerCase, "toLowerCase(...)");
            if (p.p0(lowerCase, ".log", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // lg.e
    public final kg.d b(aj.b bVar) {
        String strC = bVar.c();
        nk.k.d(strC, "getPath(...)");
        return new kg.e(strC, -1L, 0, bVar);
    }
}
