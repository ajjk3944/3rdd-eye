package lg;

import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f28811b;

    static {
        HashSet hashSet = new HashSet();
        f28811b = hashSet;
        hashSet.add("cache");
        hashSet.add("cache.db");
        hashSet.add("cache.info");
        hashSet.add("imagecache");
        hashSet.add(".cache");
    }

    @Override // lg.e
    public final boolean a(aj.b bVar) {
        String str = bVar.f410e;
        nk.k.d(str, "getNodeName(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        if (vk.i.y0(lowerCase, "cache", false)) {
            String strC = bVar.c();
            nk.k.d(strC, "getPath(...)");
            if (!vk.i.y0(strC, "Android/data", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // lg.e
    public final kg.d b(aj.b bVar) {
        String strC = bVar.c();
        nk.k.d(strC, "getPath(...)");
        kg.e eVar = new kg.e(strC, bVar.f406a, 4, bVar);
        String str = bVar.f410e;
        nk.k.d(str, "getNodeName(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        if (!f28811b.contains(lowerCase)) {
            eVar.f28293f = true;
        }
        return eVar;
    }
}
