package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f7380g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f7381h;

    /* renamed from: i, reason: collision with root package name */
    private final d6.b f7382i;

    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.f7381h != null) {
                q5.this.f7381h.onPostbackSuccess(q5.this.f7380g.f());
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f7380g = eVar;
        this.f7381h = appLovinPostbackListener;
        this.f7382i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f7380g, b());
        bVar.a(this.f7382i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f7380g.f())) {
            if (this.f7380g.u()) {
                b().x0().a(this.f7380g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.d(this.f6219b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f7381h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f7380g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    public class b extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final String f7384m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f7384m = q5.this.f7380g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f6218a.c(x4.f8487i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f6218a);
                                r0.b(jSONObject, this.f6218a);
                                r0.a(jSONObject, this.f6218a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.f7381h != null) {
                q5.this.f7381h.onPostbackSuccess(this.f7384m);
            }
            if (q5.this.f7380g.t()) {
                this.f6218a.t().a(q5.this.f7380g.s(), this.f7384m, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f7384m);
            }
            if (q5.this.f7381h != null) {
                q5.this.f7381h.onPostbackFailure(this.f7384m, i10);
            }
            if (q5.this.f7380g.t()) {
                this.f6218a.t().a(q5.this.f7380g.s(), this.f7384m, i10, obj, str2, false);
            }
        }
    }
}
