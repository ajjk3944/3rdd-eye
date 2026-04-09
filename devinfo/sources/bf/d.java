package bf;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2156b;

    public /* synthetic */ d(e eVar, int i4) {
        this.f2155a = i4;
        this.f2156b = eVar;
    }

    private final Object a() {
        String string;
        e eVar = this.f2156b;
        synchronized (eVar) {
            try {
                i iVar = (i) eVar.f2157a.get();
                ArrayList arrayListC = iVar.c();
                iVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < arrayListC.size(); i4++) {
                    a aVar = (a) arrayListC.get(i4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f2148a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f2149b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2155a) {
            case 0:
                return a();
            default:
                e eVar = this.f2156b;
                synchronized (eVar) {
                    i iVar = (i) eVar.f2157a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    jf.b bVar = (jf.b) eVar.f2159c.get();
                    String str = bVar.f27637a;
                    jf.c cVar = bVar.f27638b;
                    if (!cVar.m().isEmpty()) {
                        str = str + ' ' + jf.b.a(cVar.m());
                    }
                    iVar.g(jCurrentTimeMillis, str);
                }
                return null;
        }
    }
}
