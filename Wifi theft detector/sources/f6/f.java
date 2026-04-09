package f6;

import android.text.TextUtils;
import f6.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0394b interfaceC0394b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0394b, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        a6.c cVarE = a6.c.e();
        if (cVarE != null) {
            for (y5.f fVar : cVarE.c()) {
                if (this.f21143c.contains(fVar.o())) {
                    fVar.p().m(str, this.f21145e);
                }
            }
        }
    }

    @Override // f6.b, android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(str);
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (d6.c.u(this.f21144d, this.f21147b.a())) {
            return null;
        }
        this.f21147b.a(this.f21144d);
        return this.f21144d.toString();
    }
}
