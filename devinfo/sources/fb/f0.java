package fb;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.x80;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 implements x80 {

    /* renamed from: a, reason: collision with root package name */
    public final od0 f23901a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f23902b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23903c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23904d;

    public f0(od0 od0Var, e0 e0Var, String str, int i4) {
        this.f23901a = od0Var;
        this.f23902b = e0Var;
        this.f23903c = str;
        this.f23904d = i4;
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void a(o oVar) {
        String strOptString;
        if (oVar == null || this.f23904d == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(oVar.f23955c);
        od0 od0Var = this.f23901a;
        e0 e0Var = this.f23902b;
        if (zIsEmpty) {
            e0Var.a(this.f23903c, oVar.f23954b, od0Var);
            return;
        }
        try {
            strOptString = new JSONObject(oVar.f23955c).optString("request_id");
        } catch (JSONException e2) {
            ua.j.C.f35265h.f("RenderSignals.getRequestId", e2);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        e0Var.a(strOptString, oVar.f23955c, od0Var);
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void k(String str) {
    }
}
