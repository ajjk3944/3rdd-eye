package fb;

import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class v implements CookieJar {

    /* renamed from: c, reason: collision with root package name */
    private final Map f47298c = new LinkedHashMap();

    @Override // okhttp3.CookieJar
    public void a(HttpUrl url, List cookies) {
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(cookies, "cookies");
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            this.f47298c.put(cookie.getName(), cookie);
        }
    }

    @Override // okhttp3.CookieJar
    public List b(HttpUrl url) {
        AbstractC6492s.i(url, "url");
        return AbstractC3689v.i1(this.f47298c.values());
    }
}
