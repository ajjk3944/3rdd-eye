package ea;

import U9.x;
import c9.C2078B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* compiled from: AndroidLog.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f37779a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f37780b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = x.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(x.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(ba.e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(X9.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f37780b = C2078B.t(linkedHashMap);
    }
}
