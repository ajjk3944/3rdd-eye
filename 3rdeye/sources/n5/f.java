package N5;

import G5.l;
import I5.i;
import K5.a;
import android.text.TextUtils;
import java.util.Collections;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f extends a {
    @Override // N5.b, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        I5.c cVar;
        if (!TextUtils.isEmpty(str) && (cVar = I5.c.f2496c) != null) {
            for (l lVar : Collections.unmodifiableCollection(cVar.f2497a)) {
                if (this.f4669c.contains(lVar.f1930h)) {
                    K5.a aVar = lVar.f1927e;
                    if (this.f4671e >= aVar.f3153e) {
                        aVar.f3152d = a.EnumC0055a.AD_STATE_VISIBLE;
                        i.f2509a.a(aVar.f(), "setNativeViewHierarchy", str, aVar.f3149a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        M5.c cVar = (M5.c) this.f4673b;
        JSONObject jSONObject = cVar.f4200a;
        JSONObject jSONObject2 = this.f4670d;
        if (L5.a.e(jSONObject2, jSONObject)) {
            return null;
        }
        cVar.f4200a = jSONObject2;
        return jSONObject2.toString();
    }
}
