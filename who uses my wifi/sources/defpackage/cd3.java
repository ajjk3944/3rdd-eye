package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cd3 extends ad3 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd3(lv2 lv2Var, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(lv2Var);
        this.f = i;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // defpackage.ad3
    /* renamed from: a */
    public final void onPostExecute(String str) {
        ic3 ic3Var;
        switch (this.f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (ic3Var = ic3.c) != null) {
                    for (xb3 xb3Var : Collections.unmodifiableCollection(ic3Var.a)) {
                        if (this.c.contains(xb3Var.g)) {
                            sc3 sc3Var = xb3Var.d;
                            if (this.e >= sc3Var.c) {
                                sc3Var.d = 2;
                                fr.q.s(sc3Var.c(), "setNativeViewHierarchy", str, sc3Var.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        ic3 ic3Var = ic3.c;
        if (ic3Var != null) {
            for (xb3 xb3Var : Collections.unmodifiableCollection(ic3Var.a)) {
                if (this.c.contains(xb3Var.g)) {
                    sc3 sc3Var = xb3Var.d;
                    if (this.e >= sc3Var.c && sc3Var.d != 3) {
                        sc3Var.d = 3;
                        fr.q.s(sc3Var.c(), "setNativeViewHierarchy", str, sc3Var.a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f) {
            case 0:
                return this.d.toString();
            default:
                lv2 lv2Var = this.b;
                JSONObject jSONObject = (JSONObject) lv2Var.g;
                JSONObject jSONObject2 = this.d;
                if (vc3.e(jSONObject2, jSONObject)) {
                    return null;
                }
                lv2Var.g = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // defpackage.ad3, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
