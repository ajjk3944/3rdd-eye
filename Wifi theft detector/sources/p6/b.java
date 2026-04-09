package p6;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public a f23896a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0454b f23897b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: p6.b$b, reason: collision with other inner class name */
    public interface InterfaceC0454b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0454b interfaceC0454b) {
        this.f23897b = interfaceC0454b;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23896a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void b(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void c(a aVar) {
        this.f23896a = aVar;
    }
}
