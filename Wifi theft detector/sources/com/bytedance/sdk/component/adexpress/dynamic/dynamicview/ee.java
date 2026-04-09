package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ee extends ycc {
    public ee(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.msw += 6;
        if (this.sup.tp()) {
            com.bytedance.sdk.component.adexpress.ycc.emc emcVar = new com.bytedance.sdk.component.adexpress.ycc.emc(context, this.sup.uym(), this.sup.bw(), 1, this.sup.msw());
            this.cf = emcVar;
            emcVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.cf = textView;
            textView.setIncludeFontPadding(false);
        }
        this.cf.setTag(Integer.valueOf(getClickArea()));
        addView(this.cf, getWidgetLayoutParams());
    }

    private boolean emc() {
        DynamicRootView dynamicRootView = this.qh;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.qh.getRenderRequest().ru() == 4) ? false : true;
    }

    private void gbl() {
        if (this.cf instanceof com.bytedance.sdk.component.adexpress.ycc.emc) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.optString(i10));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setTextColor(this.sup.uym());
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setTextSize(this.sup.bw());
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setAnimationType(this.sup.ra());
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setAnimationDuration(this.sup.vw() * 1000);
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).emc();
        }
    }

    private void ru() {
        int iEmc;
        if (TextUtils.equals(this.sz.ru().ypw(), "source") || TextUtils.equals(this.sz.ru().ypw(), CampaignEx.JSON_KEY_TITLE) || TextUtils.equals(this.sz.ru().ypw(), "text_star")) {
            int[] iArrYpw = com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw(this.sup.ycc(), this.sup.bw(), true);
            int iEmc2 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.ypw());
            int iEmc3 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.xq());
            int iEmc4 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.dg());
            int iEmc5 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.emc());
            int iMin = Math.min(iEmc2, iEmc5);
            if (TextUtils.equals(this.sz.ru().ypw(), "source") && (iEmc = ((this.msw - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.bw()))) - iEmc2) - iEmc5) > 1 && iEmc <= iMin * 2) {
                int i10 = iEmc / 2;
                this.cf.setPadding(iEmc3, iEmc2 - i10, iEmc4, iEmc5 - (iEmc - i10));
                return;
            }
            int i11 = (((iArrYpw[1] + iEmc2) + iEmc5) - this.msw) - 2;
            if (i11 <= 1) {
                return;
            }
            if (i11 <= iMin * 2) {
                int i12 = i11 / 2;
                this.cf.setPadding(iEmc3, iEmc2 - i12, iEmc4, iEmc5 - (i11 - i12));
            } else if (i11 > iEmc2 + iEmc5) {
                final int i13 = (i11 - iEmc2) - iEmc5;
                this.cf.setPadding(iEmc3, 0, iEmc4, 0);
                if (i13 <= ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 1.0f)) + 1) {
                    ((TextView) this.cf).setTextSize(this.sup.bw() - 1.0f);
                } else if (i13 <= (((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.cf).setTextSize(this.sup.bw() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ee.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = ee.this.cf.getLayoutParams();
                                ee eeVar = ee.this;
                                layoutParams.height = eeVar.msw + i13;
                                eeVar.cf.setLayoutParams(layoutParams);
                                ee.this.cf.setTranslationY(-i13);
                                ((ViewGroup) ee.this.cf.getParent()).setClipChildren(false);
                                ((ViewGroup) ee.this.cf.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iEmc2 > iEmc5) {
                this.cf.setPadding(iEmc3, iEmc2 - (i11 - iMin), iEmc4, iEmc5 - iMin);
            } else {
                this.cf.setPadding(iEmc3, iEmc2 - iMin, iEmc4, iEmc5 - (i11 - iMin));
            }
        }
        if (TextUtils.equals(this.sz.ru().ypw(), "fillButton")) {
            this.cf.setTextAlignment(2);
            ((TextView) this.cf).setGravity(17);
        }
    }

    public String getText() {
        String strYcc = this.sup.ycc();
        if (TextUtils.isEmpty(strYcc)) {
            if (!com.bytedance.sdk.component.adexpress.dg.ypw() && TextUtils.equals(this.sz.ru().ypw(), "text_star")) {
                strYcc = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.dg.ypw() && TextUtils.equals(this.sz.ru().ypw(), "score-count")) {
                strYcc = "6870";
            }
        }
        return (TextUtils.equals(this.sz.ru().ypw(), CampaignEx.JSON_KEY_TITLE) || TextUtils.equals(this.sz.ru().ypw(), "subtitle")) ? strYcc.replace("\n", "") : strYcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() throws NumberFormatException {
        int i10;
        double d10;
        super.zz();
        if (TextUtils.isEmpty(getText())) {
            this.cf.setVisibility(4);
            return true;
        }
        if (this.sup.tp()) {
            gbl();
            return true;
        }
        ((TextView) this.cf).setText(this.sup.ycc());
        ((TextView) this.cf).setTextDirection(5);
        this.cf.setTextAlignment(this.sup.msw());
        ((TextView) this.cf).setTextColor(this.sup.uym());
        ((TextView) this.cf).setTextSize(this.sup.bw());
        if (this.sup.sra()) {
            int iRie = this.sup.rie();
            if (iRie > 0) {
                ((TextView) this.cf).setLines(iRie);
                ((TextView) this.cf).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.cf).setMaxLines(1);
            ((TextView) this.cf).setGravity(17);
            ((TextView) this.cf).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = this.sz;
        if (mswVar != null && mswVar.ru() != null) {
            if (com.bytedance.sdk.component.adexpress.dg.ypw() && emc() && (TextUtils.equals(this.sz.ru().ypw(), "text_star") || TextUtils.equals(this.sz.ru().ypw(), "score-count") || TextUtils.equals(this.sz.ru().ypw(), "score-count-type-1") || TextUtils.equals(this.sz.ru().ypw(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.sz.ru().ypw(), "score-count") || TextUtils.equals(this.sz.ru().ypw(), "score-count-type-2")) {
                try {
                    try {
                        i10 = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
                if (i10 < 0) {
                    if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                        setVisibility(8);
                        return true;
                    }
                    this.cf.setVisibility(0);
                }
                if (TextUtils.equals(this.sz.ru().ypw(), "score-count-type-2")) {
                    ((TextView) this.cf).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                    ((TextView) this.cf).setGravity(17);
                    return true;
                }
                emc((TextView) this.cf, i10, getContext(), "tt_comment_num");
            } else if (TextUtils.equals(this.sz.ru().ypw(), "text_star")) {
                try {
                    d10 = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d10 = -1.0d;
                }
                if (d10 < 0.0d || d10 > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                        setVisibility(8);
                        return true;
                    }
                    this.cf.setVisibility(0);
                }
                ((TextView) this.cf).setIncludeFontPadding(false);
                ((TextView) this.cf).setText(String.format("%.1f", Double.valueOf(d10)));
            } else if (TextUtils.equals("privacy-detail", this.sz.ru().ypw())) {
                ((TextView) this.cf).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.sz.ru().ypw(), "development-name")) {
                ((TextView) this.cf).setText(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.sz.ru().ypw(), "app-version")) {
                ((TextView) this.cf).setText(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.cf).setText(getText());
            }
            this.cf.setTextAlignment(this.sup.msw());
            ((TextView) this.cf).setGravity(this.sup.zz());
            if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                ru();
            }
        }
        return true;
    }

    public void emc(TextView textView, int i10, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.rie.emc(context, str), Integer.valueOf(i10)) + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }
}
