package f6;

import f6.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0394b interfaceC0394b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0394b, hashSet, jSONObject, j10);
    }

    @Override // f6.b, android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        e(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f21144d.toString();
    }

    public final void e(String str) {
        a6.c cVarE = a6.c.e();
        if (cVarE != null) {
            for (y5.f fVar : cVarE.c()) {
                if (this.f21143c.contains(fVar.o())) {
                    fVar.p().d(str, this.f21145e);
                }
            }
        }
    }
}
