package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13325a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f13326b = "";

    /* renamed from: c, reason: collision with root package name */
    private int f13327c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f13328d = -1;

    /* renamed from: e, reason: collision with root package name */
    private String f13329e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f13330f = "";

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.listener.a f13331g;

    /* renamed from: h, reason: collision with root package name */
    private Context f13332h;

    public a(Context context, com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f13332h = context;
        this.f13331g = aVar;
        a(context);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f13326b = com.mbridge.msdk.config.component.common.util.b.a(this.f13332h).a("adId", "");
        this.f13328d = com.mbridge.msdk.config.component.common.util.b.a(this.f13332h).a("isLimitAdId", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                this.f13325a = advertisingIdInfo.getId();
                this.f13327c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
            } catch (Exception unused) {
                c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
                this.f13325a = bVarA.a();
                this.f13327c = bVarA.b() ? 1 : 0;
            } catch (Throwable th) {
                q0.b("ADIDProvider", th.getMessage());
            }
        } catch (Exception unused2) {
            q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
        }
        a(this.f13325a, this.f13327c);
        if (this.f13331g != null) {
            HashMap map = new HashMap();
            map.put("adId", this.f13325a);
            map.put("adIdB64", k0.b(this.f13325a));
            map.put("adIdLimit", String.valueOf(this.f13327c));
            this.f13331g.a(map);
        }
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = TextUtils.isEmpty(this.f13325a) ? TextUtils.isEmpty(this.f13326b) ? "" : this.f13326b : this.f13325a;
        int i10 = this.f13327c;
        if (i10 == -1 && (i10 = this.f13328d) == -1) {
            i10 = 0;
        }
        map.put("adId", str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f13329e);
        map.put("amazonIdInfoB64", this.f13330f);
        return map;
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f13332h == null) {
            this.f13332h = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        if (str.equals(this.f13326b) && i10 == this.f13328d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(this.f13332h).b("adId", str);
        com.mbridge.msdk.config.component.common.util.b.a(this.f13332h).b("isLimitAdId", i10);
    }

    private void a(final Context context) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f13344a.c();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f13345a.b(context);
            }
        });
    }

    private void b() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                this.f13329e = string2;
                this.f13330f = k0.b(string2);
                if (this.f13331g != null) {
                    HashMap map = new HashMap();
                    map.put("amazonIdInfo", this.f13329e);
                    map.put("amazonIdInfoB64", this.f13330f);
                    this.f13331g.a(map);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("ADIDProvider", e10.getMessage());
            }
        } catch (Throwable th) {
            q0.b("ADIDProvider", th.getMessage());
        }
    }
}
