package lg;

import java.util.Locale;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends e {
    @Override // lg.e
    public final boolean a(aj.b bVar) {
        String str = bVar.f410e;
        nk.k.d(str, "getNodeName(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        return !bVar.f409d && (p.p0(lowerCase, ".tmp", false) || p.p0(lowerCase, ".temp", false) || lowerCase.equals("tmp") || lowerCase.equals("temp"));
    }

    @Override // lg.e
    public final kg.d b(aj.b bVar) {
        String strC = bVar.c();
        nk.k.d(strC, "getPath(...)");
        return new kg.e(strC, -1L, 1, bVar);
    }
}
