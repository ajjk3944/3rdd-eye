package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public class e extends f {

    /* renamed from: e, reason: collision with root package name */
    private int f12936e;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f12939h;

    /* renamed from: i, reason: collision with root package name */
    private p f12940i;

    /* renamed from: b, reason: collision with root package name */
    JumpLoaderResult f12933b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f12934c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f12935d = null;

    /* renamed from: f, reason: collision with root package name */
    private g f12937f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12938g = true;

    /* renamed from: j, reason: collision with root package name */
    private Handler f12941j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f12939h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f12940i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id;
        this.f12935d = str2;
        this.f12937f = gVar;
        this.f12933b = null;
        this.f12936e = i10;
        if (campaignEx != null) {
            z = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id = campaignEx.getId();
        } else {
            id = "";
        }
        this.f12940i.a(str2, gVar, z, id, str, campaignEx, z10, z11, i10);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f12935d = new String(campaignEx.getClickURL());
        this.f12937f = gVar;
        this.f12933b = null;
        this.f12940i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f13052p);
    }

    public void a() {
        this.f12938g = false;
    }
}
