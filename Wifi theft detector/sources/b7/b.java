package b7;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.TikTokBusinessSdk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4628a = new a(b.class.getName(), TikTokBusinessSdk.a());

    public static JSONObject a(Long l10) {
        if (l10 == null) {
            l10 = Long.valueOf(System.currentTimeMillis());
        }
        try {
            return new JSONObject().put(CampaignEx.JSON_KEY_ST_TS, l10);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
