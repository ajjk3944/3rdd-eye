package p6;

import android.text.TextUtils;
import i6.h;
import java.util.HashSet;
import org.json.JSONObject;
import p6.b;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0454b interfaceC0454b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0454b, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        k6.c cVarE = k6.c.e();
        if (cVarE != null) {
            for (h hVar : cVarE.c()) {
                if (this.f23893c.contains(hVar.j())) {
                    hVar.k().m(str, this.f23895e);
                }
            }
        }
    }

    @Override // p6.b, android.os.AsyncTask
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
        if (n6.c.v(this.f23894d, this.f23897b.a())) {
            return null;
        }
        this.f23897b.a(this.f23894d);
        return this.f23894d.toString();
    }
}
