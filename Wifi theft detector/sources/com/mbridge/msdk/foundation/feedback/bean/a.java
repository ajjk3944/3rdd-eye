package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.b;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* renamed from: b, reason: collision with root package name */
    private String f14992b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f14993c;

    /* renamed from: e, reason: collision with root package name */
    private FeedBackButton f14995e;

    /* renamed from: f, reason: collision with root package name */
    private String f14996f;

    /* renamed from: i, reason: collision with root package name */
    private String f14999i;

    /* renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f15000j;

    /* renamed from: k, reason: collision with root package name */
    private Dialog f15001k;

    /* renamed from: l, reason: collision with root package name */
    private JSONArray f15002l;

    /* renamed from: q, reason: collision with root package name */
    private int f15007q;

    /* renamed from: r, reason: collision with root package name */
    private List<g> f15008r;

    /* renamed from: u, reason: collision with root package name */
    private int f15011u;

    /* renamed from: a, reason: collision with root package name */
    private float f14991a = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private String f14994d = "";

    /* renamed from: g, reason: collision with root package name */
    private float f14997g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f14998h = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f15003m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f15004n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f15005o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f15006p = -1;

    /* renamed from: s, reason: collision with root package name */
    private int f15009s = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 20.0f);

    /* renamed from: t, reason: collision with root package name */
    private String f15010t = "";

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f15012v = new C0261a();

    /* renamed from: w, reason: collision with root package name */
    private int f15013w = A;

    /* renamed from: x, reason: collision with root package name */
    private int f15014x = -1;

    /* renamed from: y, reason: collision with root package name */
    private int f15015y = -1;

    /* renamed from: z, reason: collision with root package name */
    private int f15016z = -1;

    /* renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    public class C0261a implements com.mbridge.msdk.widget.dialog.b {
        public C0261a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public class c implements com.mbridge.msdk.widget.dialog.b {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f15000j != null) {
                a.this.f15000j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f15001k == null || !a.this.f15001k.isShowing()) {
                    return;
                }
                a.this.f15001k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public a(String str) {
        this.f15008r = new ArrayList();
        this.f14999i = str;
        if (this.f15008r == null) {
            this.f15008r = new ArrayList();
        }
        d();
        e();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, 1, 4, B, this.f14994d);
        List<g> list = this.f15008r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, 0, 4, B, this.f14994d);
        List<g> list = this.f15008r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, 0, 4, B, this.f14994d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        List<g> list = this.f15008r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    private void o() {
        if (TextUtils.isEmpty(this.f15010t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(i0.a(activityA, "mbridge_cm_feedback_notice_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f15001k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f15001k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f15001k.setContentView(viewInflate);
                this.f15001k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        FeedBackButton feedBackButton = this.f14995e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f14995e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f14995e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f14995e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f15000j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f15000j.setListener(null);
        }
        this.f15000j = null;
        this.f15008r = null;
        this.f14995e = null;
        this.f15012v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f15000j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f15000j.cancel();
    }

    public CampaignEx h() {
        return this.f14993c;
    }

    public FeedBackButton i() {
        if (this.f14995e == null) {
            e();
        }
        return this.f14995e;
    }

    public int j() {
        return this.f15007q;
    }

    public int k() {
        return this.f15011u;
    }

    public void p() {
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, 0, 1, B, this.f14994d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            MBFeedBackDialog mBFeedBackDialog = this.f15000j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            FeedBackButton feedBackButton = this.f14995e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, contextD, this.f15000j);
            a(zA ? 2 : 3);
            if (zA) {
                return;
            }
            a(contextD);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                b.C0311b c0311bA = gVarD.A();
                if (c0311bA == null) {
                    q0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f15000j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()), this.f15012v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0311bA);
                this.f15000j.setCancelText(c0311bA.d());
                this.f15000j.setConfirmText(c0311bA.a());
                this.f15000j.setPrivacyText(c0311bA.c());
                this.f15010t = c0311bA.e();
                this.f15000j.setTitle(c0311bA.f());
                this.f15000j.setContent(feedbackRadioGroupA);
                this.f15000j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0311bA);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f15012v == null) {
            this.f15012v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f14995e = feedBackButton;
                int i10 = 8;
                if (this.f15013w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f14995e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str) {
        this.f14994d = str;
    }

    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f15023a;

        /* renamed from: b, reason: collision with root package name */
        private String f15024b;

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f15023a = aVar;
            this.f15024b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f14986f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f15023a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f14986f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f15023a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f15023a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public void a(int i10) {
            if (this.f15023a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f14986f = true;
            this.f15023a.a();
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f14995e;
        if (feedBackButton != null) {
            int i10 = this.f15015y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f15016z;
            if (i11 > -1) {
                this.f14995e.setY(i11);
            }
            float f10 = this.f14991a;
            if (f10 >= 0.0f) {
                this.f14995e.setAlpha(f10);
                this.f14995e.setEnabled(this.f14991a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f14995e.getLayoutParams();
            int i12 = this.f15014x;
            if (i12 > 0) {
                this.f14995e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f15014x;
                }
            }
            int i13 = this.f14998h;
            if (i13 > 0) {
                this.f14995e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f14998h;
                }
            }
            if (layoutParams != null) {
                this.f14995e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f14996f)) {
                    this.f14995e.setTextColor(Color.parseColor(this.f14996f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f14997g;
            if (f11 > 0.0f) {
                this.f14995e.setTextSize(f11);
            }
            JSONArray jSONArray = this.f15002l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                this.f14995e.setPadding(v0.a(contextD, (float) this.f15002l.optDouble(0)), v0.a(contextD, (float) this.f15002l.optDouble(1)), v0.a(contextD, (float) this.f15002l.optDouble(2)), v0.a(contextD, (float) this.f15002l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f15009s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f14992b)) {
                gradientDrawable.setColor(Color.parseColor(this.f14992b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f14995e.setBackground(gradientDrawable);
        }
    }

    public void a(g gVar) {
        if (this.f15008r == null) {
            this.f15008r = new ArrayList();
        }
        this.f15008r.add(gVar);
    }

    public void d(int i10) {
        this.f15013w = i10;
        FeedBackButton feedBackButton = this.f14995e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f14993c = campaignEx;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, 0, 2, B, this.f14994d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f14999i, 0, 3, B, this.f14994d);
        }
        List<g> list = this.f15008r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, v0.a(this.f14993c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, v0.a(this.f14993c));
            }
        }
    }

    private FeedbackRadioGroup a(b.C0311b c0311b) {
        JSONArray jSONArrayB = c0311b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void c(int i10) {
        this.f15011u = i10;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, b.C0311b c0311b) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        JSONArray jSONArrayB = c0311b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        i0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = i0.a(contextD);
        int iA = i0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", TtmlNode.ATTR_TTS_COLOR);
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            colorStateList = null;
        }
        int iA2 = v0.a(contextD, 1.0f);
        int iA3 = v0.a(contextD, 1.0f);
        int iA4 = v0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    public void b(int i10) {
        this.f15007q = i10;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f14995e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f14991a);
            feedBackButton.setEnabled(this.f14991a != 0.0f);
            feedBackButton.setVisibility(this.f15013w != 8 ? 0 : 8);
            this.f14995e = feedBackButton;
            CampaignEx campaignEx = this.f14993c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f15015y = i10;
        }
        if (i11 > -1) {
            this.f15016z = i11;
        }
        if (i12 > -1) {
            this.f15014x = i12;
        }
        if (i13 > -1) {
            this.f14998h = i13;
        }
        if (f11 > -1.0f) {
            this.f14997g = f11;
        }
        if (jSONArray != null) {
            this.f15002l = jSONArray;
        }
        this.f14996f = str;
        this.f14992b = str2;
        this.f14991a = f10;
        this.f15009s = i14;
        b();
    }
}
