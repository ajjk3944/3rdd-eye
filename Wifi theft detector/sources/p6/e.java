package p6;

import i6.h;
import java.util.HashSet;
import org.json.JSONObject;
import p6.b;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0454b interfaceC0454b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0454b, hashSet, jSONObject, j10);
    }

    @Override // p6.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        e(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f23894d.toString();
    }

    public final void e(String str) {
        k6.c cVarE = k6.c.e();
        if (cVarE != null) {
            for (h hVar : cVarE.c()) {
                if (this.f23893c.contains(hVar.j())) {
                    hVar.k().h(str, this.f23895e);
                }
            }
        }
    }
}
