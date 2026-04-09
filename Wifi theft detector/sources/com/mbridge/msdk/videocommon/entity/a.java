package com.mbridge.msdk.videocommon.entity;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f19682a;

    /* renamed from: b, reason: collision with root package name */
    private String f19683b;

    public a(String str, String str2) {
        this.f19682a = str;
        this.f19683b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
