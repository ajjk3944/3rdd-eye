package A2;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.InterfaceC0425Al;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S implements InterfaceC0425Al {

    /* renamed from: a, reason: collision with root package name */
    public final C0750Tn f210a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f213d;

    public S(C0750Tn c0750Tn, Q q3, String str, int i) {
        this.f210a = c0750Tn;
        this.f211b = q3;
        this.f212c = str;
        this.f213d = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void a(w wVar) {
        String strOptString;
        if (wVar == null || this.f213d == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(wVar.f342c);
        C0750Tn c0750Tn = this.f210a;
        Q q3 = this.f211b;
        if (zIsEmpty) {
            q3.a(this.f212c, wVar.f341b, c0750Tn);
            return;
        }
        try {
            strOptString = new JSONObject(wVar.f342c).optString("request_id");
        } catch (JSONException e6) {
            p2.j.f22785C.f22795h.f("RenderSignals.getRequestId", e6);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        q3.a(strOptString, wVar.f342c, c0750Tn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void x(String str) {
    }
}
