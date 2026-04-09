package e5;

import A1.p;
import F4.A;
import F4.q;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f5.InterfaceC5536b;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5536b f46193a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46194b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5536b f46195c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f46196d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f46197e;

    private f(final Context context, final String str, Set set, InterfaceC5536b interfaceC5536b, Executor executor) {
        this(new InterfaceC5536b() { // from class: e5.c
            @Override // f5.InterfaceC5536b
            public final Object get() {
                return f.i(context, str);
            }
        }, set, executor, interfaceC5536b, context);
    }

    public static F4.c f() {
        final A a10 = A.a(E4.a.class, Executor.class);
        return F4.c.f(f.class, i.class, j.class).b(q.j(Context.class)).b(q.j(com.google.firebase.f.class)).b(q.m(g.class)).b(q.l(m5.i.class)).b(q.i(a10)).e(new F4.g() { // from class: e5.b
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return f.g(a10, dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f g(A a10, F4.d dVar) {
        return new f((Context) dVar.a(Context.class), ((com.google.firebase.f) dVar.a(com.google.firebase.f.class)).o(), dVar.g(g.class), dVar.e(m5.i.class), (Executor) dVar.f(a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h() {
        String string;
        synchronized (this) {
            try {
                k kVar = (k) this.f46193a.get();
                List listC = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listC.size(); i10++) {
                    l lVar = (l) listC.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k i(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void j() {
        synchronized (this) {
            ((k) this.f46193a.get()).g(System.currentTimeMillis(), ((m5.i) this.f46195c.get()).a());
        }
        return null;
    }

    @Override // e5.i
    public Task a() {
        return !p.a(this.f46194b) ? Tasks.forResult("") : Tasks.call(this.f46197e, new Callable() { // from class: e5.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f46191a.h();
            }
        });
    }

    public Task k() {
        if (this.f46196d.size() > 0 && p.a(this.f46194b)) {
            return Tasks.call(this.f46197e, new Callable() { // from class: e5.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f46192a.j();
                }
            });
        }
        return Tasks.forResult(null);
    }

    f(InterfaceC5536b interfaceC5536b, Set set, Executor executor, InterfaceC5536b interfaceC5536b2, Context context) {
        this.f46193a = interfaceC5536b;
        this.f46196d = set;
        this.f46197e = executor;
        this.f46195c = interfaceC5536b2;
        this.f46194b = context;
    }
}
