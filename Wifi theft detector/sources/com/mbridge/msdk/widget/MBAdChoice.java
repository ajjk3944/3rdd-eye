package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* loaded from: classes3.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: c, reason: collision with root package name */
    private final Context f19751c;

    /* renamed from: d, reason: collision with root package name */
    private String f19752d;

    /* renamed from: e, reason: collision with root package name */
    private String f19753e;

    /* renamed from: f, reason: collision with root package name */
    private String f19754f;

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f19755g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f19756h;

    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }
    }

    public class b implements c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f19752d = "";
        this.f19753e = "";
        this.f19754f = "";
        this.f19751c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f19755g = campaignEx;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        c(campaignEx, gVarD);
        a(campaignEx, gVarD);
        b(campaignEx, gVarD);
        boolean z10 = (TextUtils.isEmpty(this.f19752d) || TextUtils.isEmpty(this.f19753e) || TextUtils.isEmpty(this.f19754f)) ? false : true;
        setImageUrl(this.f19752d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f19755g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f19753e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f19753e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f19753e = adchoice.h();
            }
            if (TextUtils.isEmpty(this.f19753e) && gVar != null) {
                this.f19753e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f19753e)) {
                this.f19753e = d.h().f15171g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f19756h == null) {
            this.f19756h = new a();
        }
        v0.a(this.f19755g, this.f19756h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f19755g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f19755g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f19756h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f19755g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f19754f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f19754f = adchoice.i();
        }
        if (!TextUtils.isEmpty(this.f19754f) || gVar == null) {
            return;
        }
        this.f19754f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19752d = "";
        this.f19753e = "";
        this.f19754f = "";
        this.f19751c = context;
        b();
    }

    private void a() {
        if (this.f19751c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f19752d, new b());
        }
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f19755g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f19752d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f19752d = adchoice.g();
        }
        if (!TextUtils.isEmpty(this.f19752d) || gVar == null) {
            return;
        }
        this.f19752d = gVar.b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19752d = "";
        this.f19753e = "";
        this.f19754f = "";
        this.f19751c = context;
        b();
    }
}
