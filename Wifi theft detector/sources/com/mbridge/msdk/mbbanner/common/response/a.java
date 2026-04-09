package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends c<JSONObject> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f15845b = "a";

    /* renamed from: a, reason: collision with root package name */
    private String f15846a = "";

    /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    public class RunnableC0277a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f15847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15848b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15849c;

        /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        public class RunnableC0278a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f15851a;

            public RunnableC0278a(CampaignUnit campaignUnit) {
                this.f15851a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f15851a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f15851a.getAds().size() > 0) {
                    a.this.a(this.f15851a);
                    if (!TextUtils.isEmpty(a.this.f15846a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f15851a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f15851a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0277a.this.f15847a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0277a runnableC0277a = RunnableC0277a.this;
                a.this.a(runnableC0277a.f15849c, msg);
            }
        }

        public RunnableC0277a(JSONObject jSONObject, String str, int i10) {
            this.f15847a = jSONObject;
            this.f15848b = str;
            this.f15849c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f15847a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0278a("v5".equals(this.f15848b) ? b.parseV5CampaignUnit(jSONObjectOptJSONObject, a.this.f15846a) : b.parseCampaignUnit(jSONObjectOptJSONObject, a.this.f15846a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f15845b, "onFailed errorCode = " + aVar.f15126a);
        a(aVar.f15126a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f15124b.f15147b, eVar.f15125c);
    }

    public void a(String str) {
        this.f15846a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f15845b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0277a(jSONObject, jSONObject.optString("version"), iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
