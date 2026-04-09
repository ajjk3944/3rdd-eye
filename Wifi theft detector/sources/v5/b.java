package v5;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public a f24735a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0493b f24736b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: v5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0493b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0493b interfaceC0493b) {
        this.f24736b = interfaceC0493b;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f24735a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void b(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void c(a aVar) {
        this.f24735a = aVar;
    }
}
