package v5;

import java.util.HashSet;
import o5.g;
import org.json.JSONObject;
import v5.b;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0493b interfaceC0493b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0493b, hashSet, jSONObject, j10);
    }

    @Override // v5.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        e(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f24733d.toString();
    }

    public final void e(String str) {
        q5.c cVarE = q5.c.e();
        if (cVarE != null) {
            for (g gVar : cVarE.c()) {
                if (this.f24732c.contains(gVar.s())) {
                    gVar.t().f(str, this.f24734e);
                }
            }
        }
    }
}
