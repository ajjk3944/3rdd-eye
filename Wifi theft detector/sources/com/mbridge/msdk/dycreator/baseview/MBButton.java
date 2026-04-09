package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBButton extends Button implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f14136a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f14137b;

    /* renamed from: c, reason: collision with root package name */
    private String f14138c;

    public MBButton(Context context) {
        super(context);
        this.f14138c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f14136a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f14136a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f14136a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f14136a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f14136a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f14136a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f14136a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f14136a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f14136a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f14136a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f14137b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f14137b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f14138c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f14137b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f14137b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f14138c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f14137b = c.a(str);
        if (campaignEx != null) {
            this.f14138c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f14138c = "";
        this.f14136a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f14136a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14138c = "";
    }
}
