package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q5 extends i5 {
    private final com.applovin.impl.sdk.network.e g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f5162h;

    /* renamed from: i, reason: collision with root package name */
    private final d6.b f5163i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i4) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.f5162h != null) {
                q5.this.f5162h.onPostbackSuccess(q5.this.g.f());
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.g = eVar;
        this.f5162h = appLovinPostbackListener;
        this.f5163i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.g, b());
        bVar.a(this.f5163i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.g.f())) {
            if (this.g.u()) {
                b().x0().a(this.g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.d(this.f4288b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f5162h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final String f5165m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f5165m = q5.this.g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i4) {
            if (obj instanceof String) {
                for (String str2 : this.f4287a.c(x4.f6054i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f4287a);
                                r0.b(jSONObject, this.f4287a);
                                r0.a(jSONObject, this.f4287a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.f5162h != null) {
                q5.this.f5162h.onPostbackSuccess(this.f5165m);
            }
            if (q5.this.g.t()) {
                this.f4287a.t().a(q5.this.g.s(), this.f5165m, i4, obj, null, true);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f4289c;
                String str3 = this.f4288b;
                StringBuilder sbW = je.u.w(i4, "Failed to dispatch postback. Error code: ", " URL: ");
                sbW.append(this.f5165m);
                oVar.b(str3, sbW.toString());
            }
            if (q5.this.f5162h != null) {
                q5.this.f5162h.onPostbackFailure(this.f5165m, i4);
            }
            if (q5.this.g.t()) {
                this.f4287a.t().a(q5.this.g.s(), this.f5165m, i4, obj, str2, false);
            }
        }
    }
}
