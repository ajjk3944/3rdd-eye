package vh;

import ak.g;
import br.l;
import df.c;
import h9.r2;
import ir.f0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import xu.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23912a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f23913b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.a f23914c;

    /* renamed from: d, reason: collision with root package name */
    public final xi.a f23915d;

    /* renamed from: e, reason: collision with root package name */
    public final r2 f23916e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23917f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedList f23918g = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f23919h;

    public a(String str, Executor executor, c cVar, q3.a aVar, xi.a aVar2, r2 r2Var, cj.a aVar3) {
        this.f23912a = str;
        this.f23913b = executor;
        this.f23914c = aVar;
        this.f23915d = aVar2;
        this.f23916e = r2Var;
    }

    public final void a(String str, Object... objArr) {
        l.e(str, "tag");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = Arrays.toString(objArr);
        l.d(string, "toString(...)");
        c(jCurrentTimeMillis, 400, string, null, str);
    }

    public final void b(String str, String str2, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2 != null ? str2.toString() : null);
        sb2.append(' ');
        sb2.append(th2);
        c(System.currentTimeMillis(), 100, sb2.toString(), th2 != null ? f0.W(th2) : null, str);
    }

    public final void c(long j, int i10, String str, String str2, String str3) {
        synchronized (this.f23917f) {
            try {
                try {
                    String str4 = this.f23915d.f25314d ? "Foreground" : "Background";
                    if (this.f23918g.size() > ((g) this.f23914c.f20680g).f529f.f463q.f500e) {
                        this.f23918g.remove(0);
                    }
                    LinkedList linkedList = this.f23918g;
                    l.e(str, "message");
                    l.e(str3, "tag");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", j);
                    jSONObject.put("code", i10);
                    jSONObject.put("message", str);
                    d.Y(jSONObject, "stackTrace", str2);
                    jSONObject.put("tag", str3);
                    jSONObject.put("appState", str4);
                    linkedList.add(jSONObject);
                    if (i10 <= e()) {
                        LinkedList linkedList2 = new LinkedList(this.f23918g);
                        if (!((AtomicBoolean) this.f23916e.f10475y).get()) {
                            this.f23913b.execute(new s9.c(this, 3, linkedList2));
                        }
                        this.f23918g.clear();
                    }
                } catch (Exception e4) {
                    cj.a.E(e4, "Exception when adding logs to MLVis list");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final StringBuilder d(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        l.d(it, "iterator(...)");
        StringBuilder sb2 = new StringBuilder();
        while (it.hasNext()) {
            String string = ((JSONObject) it.next()).toString();
            l.d(string, "toString(...)");
            try {
                new JSONObject(string);
                if (this.f23919h) {
                    sb2.append(string);
                    this.f23919h = false;
                } else {
                    sb2.append(",".concat(string));
                }
            } catch (JSONException unused) {
            }
        }
        return sb2;
    }

    public final int e() {
        String str = ((g) this.f23914c.f20680g).f529f.f463q.f499d;
        if (l.a(str, "warning")) {
            return 200;
        }
        l.a(str, "error");
        return 100;
    }
}
