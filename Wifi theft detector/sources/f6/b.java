package f6;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public a f21146a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0394b f21147b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: f6.b$b, reason: collision with other inner class name */
    public interface InterfaceC0394b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0394b interfaceC0394b) {
        this.f21147b = interfaceC0394b;
    }

    public void a(a aVar) {
        this.f21146a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21146a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void c(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
