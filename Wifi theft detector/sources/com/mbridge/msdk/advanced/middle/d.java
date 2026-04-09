package com.mbridge.msdk.advanced.middle;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected NativeAdvancedAdListener f12832a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f12833b;

    /* renamed from: c, reason: collision with root package name */
    protected c f12834c;

    public d(c cVar, NativeAdvancedAdListener nativeAdvancedAdListener, CampaignEx campaignEx) {
        this.f12834c = cVar;
        this.f12832a = nativeAdvancedAdListener;
        this.f12833b = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds, String str) {
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12833b, mBridgeIds.getUnitId(), str);
    }

    public void b(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12832a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClick(mBridgeIds);
        }
    }

    public void c(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12832a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClose(mBridgeIds);
            c cVar = this.f12834c;
            if (cVar != null) {
                cVar.E = false;
            }
        }
    }

    public void d(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12832a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLeaveApp(mBridgeIds);
        }
    }

    public void e(MBridgeIds mBridgeIds) {
        c cVar = this.f12834c;
        if (cVar != null) {
            cVar.E = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_to", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            jSONObject.put("allow_skip", this.f12834c.f());
        } catch (JSONException e10) {
            q0.b("NativeAdvancedShowListenerImpl", "e:" + e10.getMessage());
        }
        j.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12833b, mBridgeIds.getUnitId(), jSONObject.toString());
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12832a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLogImpression(mBridgeIds);
        }
    }

    public void f(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12832a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.showFullScreen(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12832a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.closeFullScreen(mBridgeIds);
        }
    }
}
