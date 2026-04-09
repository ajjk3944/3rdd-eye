package N5;

import android.os.AsyncTask;

/* loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    public c f4672a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4673b;

    public interface a {
    }

    public b(a aVar) {
        this.f4673b = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        c cVar = this.f4672a;
        if (cVar != null) {
            cVar.f4676d = null;
            cVar.d();
        }
    }
}
