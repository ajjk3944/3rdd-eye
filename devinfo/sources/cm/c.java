package cm;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import rl.t;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f2956a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2957b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = t.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(t.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(yl.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(ul.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f2957b = w.L(linkedHashMap);
    }

    public static void a(String str, int i4, String str2, Throwable th2) {
        int iMin;
        String strU0 = (String) f2957b.get(str);
        if (strU0 == null) {
            strU0 = vk.i.U0(23, str);
        }
        if (Log.isLoggable(strU0, i4)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i10 = 0;
            while (i10 < length) {
                int iE0 = vk.i.E0(str2, '\n', i10, 4);
                if (iE0 == -1) {
                    iE0 = length;
                }
                while (true) {
                    iMin = Math.min(iE0, i10 + 4000);
                    String strSubstring = str2.substring(i10, iMin);
                    nk.k.d(strSubstring, "substring(...)");
                    Log.println(i4, strU0, strSubstring);
                    if (iMin >= iE0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f2956a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f2958a);
        }
    }
}
