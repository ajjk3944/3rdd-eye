package v5;

import android.text.TextUtils;
import java.util.HashSet;
import o5.g;
import org.json.JSONObject;
import v5.b;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0493b interfaceC0493b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0493b, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        q5.c cVarE = q5.c.e();
        if (cVarE != null) {
            for (g gVar : cVarE.c()) {
                if (this.f24732c.contains(gVar.s())) {
                    gVar.t().p(str, this.f24734e);
                }
            }
        }
    }

    @Override // v5.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(str);
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (t5.c.v(this.f24733d, this.f24736b.a())) {
            return null;
        }
        this.f24736b.a(this.f24733d);
        return this.f24733d.toString();
    }
}
