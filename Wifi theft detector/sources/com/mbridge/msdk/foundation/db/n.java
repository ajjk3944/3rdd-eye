package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14815a = "com.mbridge.msdk.foundation.db.n";

    /* renamed from: b, reason: collision with root package name */
    private static n f14816b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (f14816b == null) {
            synchronized (n.class) {
                try {
                    if (f14816b == null) {
                        f14816b = new n(fVar);
                    }
                } finally {
                }
            }
        }
        return f14816b;
    }

    public synchronized int d() {
        int i10;
        i10 = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i10 = cursorRawQuery.getInt(0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x033c A[EXC_TOP_SPLITTER, PHI: r10 r21
  0x033c: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v14 android.database.Cursor) binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r21v3 java.util.List<com.mbridge.msdk.foundation.entity.n>) = 
  (r21v2 java.util.List<com.mbridge.msdk.foundation.entity.n>)
  (r21v6 java.util.List<com.mbridge.msdk.foundation.entity.n>)
 binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String):java.util.List");
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key", nVar.n());
                    contentValues.put("networkType", Integer.valueOf(nVar.q()));
                    contentValues.put("network_str", nVar.r());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                    contentValues.put("videoLength", Integer.valueOf(nVar.C()));
                    if (!TextUtils.isEmpty(nVar.s())) {
                        contentValues.put("offerUrl", nVar.s());
                    }
                    if (!TextUtils.isEmpty(nVar.t())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.t(), "utf-8"));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.x()));
                    contentValues.put("duration", nVar.g());
                    contentValues.put("videoSize", Long.valueOf(nVar.D()));
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, nVar.h());
                    String strI = nVar.i();
                    if (!TextUtils.isEmpty(strI)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, strI);
                    }
                    String strE = nVar.E();
                    if (!TextUtils.isEmpty(strE)) {
                        contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, strE);
                    }
                    String strU = nVar.u();
                    if (!TextUtils.isEmpty(strU)) {
                        contentValues.put("rid", strU);
                    }
                    String strV = nVar.v();
                    if (!TextUtils.isEmpty(strV)) {
                        contentValues.put("rid_n", strV);
                    }
                    String strZ = nVar.z();
                    if (!TextUtils.isEmpty(strZ)) {
                        contentValues.put("template_url", strZ);
                    }
                    String strL = nVar.l();
                    if (!TextUtils.isEmpty(strL)) {
                        contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, strL);
                    }
                    String strA = nVar.a();
                    if (!TextUtils.isEmpty(strA)) {
                        contentValues.put("ad_type", URLEncoder.encode(strA, "utf-8"));
                    }
                    contentValues.put("unitId", nVar.B());
                    contentValues.put("campaignId", nVar.d());
                    if ("2000039".equals(nVar.n())) {
                        String strB = o.b(nVar);
                        if (a1.b(strB)) {
                            contentValues.put("h5_click_data", strB);
                        }
                    }
                    String strW = nVar.w();
                    if (!TextUtils.isEmpty(strW)) {
                        contentValues.put("resource_type", URLEncoder.encode(strW, "utf-8"));
                    }
                    String strF = nVar.f();
                    if (!TextUtils.isEmpty(strF)) {
                        contentValues.put("device_id", URLEncoder.encode(strF, "utf-8"));
                    }
                    String strE2 = nVar.e();
                    if (!TextUtils.isEmpty(strE2)) {
                        contentValues.put("creative", URLEncoder.encode(strE2, "utf-8"));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e10) {
                    q0.b(f14815a, e10.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
