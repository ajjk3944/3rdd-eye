package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import g0.C4356c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f19317g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f19318h;
    private final r5.b i;

    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            e5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (e5.this.f19318h != null) {
                e5.this.f19318h.onPostbackSuccess(e5.this.f19317g.f());
            }
        }
    }

    public e5(com.applovin.impl.sdk.network.e eVar, r5.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f19317g = eVar;
        this.f19318h = appLovinPostbackListener;
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f19317g, b());
        bVar.a(this.i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f19317g.f())) {
            if (this.f19317g.u()) {
                b().x0().a(this.f19317g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.d(this.f21693b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f19318h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f19317g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    public class b extends z5 {

        /* renamed from: m, reason: collision with root package name */
        final String f19320m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f19320m = e5.this.f19317g.f();
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.f21692a.c(l4.f19971m0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                AbstractC2135n0.c(jSONObject, this.f21692a);
                                AbstractC2135n0.b(jSONObject, this.f21692a);
                                AbstractC2135n0.a(jSONObject, this.f21692a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (e5.this.f19318h != null) {
                e5.this.f19318h.onPostbackSuccess(this.f19320m);
            }
            if (e5.this.f19317g.t()) {
                this.f21692a.u().a(e5.this.f19317g.s(), this.f19320m, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f21694c;
                String str3 = this.f21693b;
                StringBuilder sbJ = C4356c.j(i, "Failed to dispatch postback. Error code: ", " URL: ");
                sbJ.append(this.f19320m);
                oVar.b(str3, sbJ.toString());
            }
            if (e5.this.f19318h != null) {
                e5.this.f19318h.onPostbackFailure(this.f19320m, i);
            }
            if (e5.this.f19317g.t()) {
                this.f21692a.u().a(e5.this.f19317g.s(), this.f19320m, i, obj, str2, false);
            }
        }
    }
}
