package u2;

import L2.w;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23804c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f23805d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f23807a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23803b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f23806e = new HashSet(Arrays.asList(new String[0]));

    public h() {
        this.f23807a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z6;
        synchronized (f23803b) {
            try {
                z6 = false;
                if (f23804c && f23805d) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    public static void d(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f23806e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        k.e("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (c()) {
            e("onNetworkRequest", new c1.g((Object) new String(httpURLConnection.getURL().toString()), (Object) new String(httpURLConnection.getRequestMethod()), (Object) (httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties())), (Object) bArr, 26));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i) throws IOException {
        if (c()) {
            String responseMessage = null;
            e("onNetworkResponse", new w(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e6) {
                    k.h("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e6.getMessage())));
                }
                e("onNetworkRequestError", new B2.a(responseMessage, 7));
            }
        }
    }

    public final void e(String str, g gVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f23807a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            gVar.j(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e6) {
            k.f("unable to log", e6);
        }
        String string = stringWriter.toString();
        synchronized (h.class) {
            try {
                k.g("GMA Debug BEGIN");
                int i = 0;
                while (i < string.length()) {
                    int i3 = i + 4000;
                    k.g("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i, Math.min(i3, string.length())))));
                    i = i3;
                }
                k.g("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
