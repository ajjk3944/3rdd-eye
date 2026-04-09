package za;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f38144c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f38145d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f38147a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f38143b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f38146e = new HashSet(Arrays.asList(new String[0]));

    public f() {
        this.f38147a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z3;
        synchronized (f38143b) {
            try {
                z3 = false;
                if (f38144c && f38145d) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
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
            if (!f38146e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        i.e("Connection headers should be either Map<String, String> or Map<String, List<String>>");
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
            e("onNetworkRequest", new se.b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i4) throws IOException {
        if (c()) {
            String responseMessage = null;
            e("onNetworkResponse", new t7.m(i4, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), 23));
            if (i4 < 200 || i4 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    i.h("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                e("onNetworkRequestError", new gb.a(responseMessage));
            }
        }
    }

    public final void e(String str, e eVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f38147a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            eVar.i(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            i.f("unable to log", e2);
        }
        String string = stringWriter.toString();
        synchronized (f.class) {
            try {
                i.g("GMA Debug BEGIN");
                int i4 = 0;
                while (i4 < string.length()) {
                    int i10 = i4 + 4000;
                    i.g("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i4, Math.min(i10, string.length())))));
                    i4 = i10;
                }
                i.g("GMA Debug FINISH");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
