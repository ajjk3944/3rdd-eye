package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import A.f;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
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
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setTextColor(this.sup.uym());
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setTextSize(this.sup.bw());
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setAnimationType(this.sup.ra());
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).setAnimationDuration(this.sup.vw() * TTAdConstant.STYLE_SIZE_RADIO_1_1);
            ((com.bytedance.sdk.component.adexpress.ycc.emc) this.cf).emc();
        }
    }

    private void ru() {
        int iEmc;
        if (f.x(this.sz, "source") || f.x(this.sz, "title") || f.x(this.sz, "text_star")) {
            int[] iArrYpw = com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw(this.sup.ycc(), this.sup.bw(), true);
            int iEmc2 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.ypw());
            int iEmc3 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.xq());
            int iEmc4 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.dg());
            int iEmc5 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.emc());
            int iMin = Math.min(iEmc2, iEmc5);
            if (f.x(this.sz, "source") && (iEmc = ((this.msw - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.sup.bw()))) - iEmc2) - iEmc5) > 1 && iEmc <= iMin * 2) {
                int i = iEmc / 2;
                this.cf.setPadding(iEmc3, iEmc2 - i, iEmc4, iEmc5 - (iEmc - i));
                return;
            }
            int i3 = (((iArrYpw[1] + iEmc2) + iEmc5) - this.msw) - 2;
            if (i3 <= 1) {
                return;
            }
            if (i3 <= iMin * 2) {
                int i6 = i3 / 2;
                this.cf.setPadding(iEmc3, iEmc2 - i6, iEmc4, iEmc5 - (i3 - i6));
            } else if (i3 > iEmc2 + iEmc5) {
                final int i7 = (i3 - iEmc2) - iEmc5;
                this.cf.setPadding(iEmc3, 0, iEmc4, 0);
                if (i7 <= ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 1.0f)) + 1) {
                    ((TextView) this.cf).setTextSize(this.sup.bw() - 1.0f);
                } else if (i7 <= (((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.cf).setTextSize(this.sup.bw() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ee.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = ee.this.cf.getLayoutParams();
                                ee eeVar = ee.this;
                                layoutParams.height = eeVar.msw + i7;
                                eeVar.cf.setLayoutParams(layoutParams);
                                ee.this.cf.setTranslationY(-i7);
                                ((ViewGroup) ee.this.cf.getParent()).setClipChildren(false);
                                ((ViewGroup) ee.this.cf.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iEmc2 > iEmc5) {
                this.cf.setPadding(iEmc3, iEmc2 - (i3 - iMin), iEmc4, iEmc5 - iMin);
            } else {
                this.cf.setPadding(iEmc3, iEmc2 - iMin, iEmc4, iEmc5 - (i3 - iMin));
            }
        }
        if (f.x(this.sz, "fillButton")) {
            this.cf.setTextAlignment(2);
            ((TextView) this.cf).setGravity(17);
        }
    }

    public String getText() {
        String strYcc = this.sup.ycc();
        if (TextUtils.isEmpty(strYcc)) {
            if (!com.bytedance.sdk.component.adexpress.dg.ypw() && f.x(this.sz, "text_star")) {
                strYcc = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.dg.ypw() && f.x(this.sz, "score-count")) {
                strYcc = "6870";
            }
        }
        return (f.x(this.sz, "title") || f.x(this.sz, "subtitle")) ? strYcc.replace("\n", "") : strYcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() throws NumberFormatException {
        int i;
        double d6;
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
            if (com.bytedance.sdk.component.adexpress.dg.ypw() && emc() && (f.x(this.sz, "text_star") || f.x(this.sz, "score-count") || f.x(this.sz, "score-count-type-1") || f.x(this.sz, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (f.x(this.sz, "score-count") || f.x(this.sz, "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
                if (i < 0) {
                    if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                        setVisibility(8);
                        return true;
                    }
                    this.cf.setVisibility(0);
                }
                if (TextUtils.equals(this.sz.ru().ypw(), "score-count-type-2")) {
                    ((TextView) this.cf).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                    ((TextView) this.cf).setGravity(17);
                    return true;
                }
                emc((TextView) this.cf, i, getContext(), "tt_comment_num");
            } else if (f.x(this.sz, "text_star")) {
                try {
                    d6 = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d6 = -1.0d;
                }
                if (d6 < 0.0d || d6 > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                        setVisibility(8);
                        return true;
                    }
                    this.cf.setVisibility(0);
                }
                ((TextView) this.cf).setIncludeFontPadding(false);
                ((TextView) this.cf).setText(String.format("%.1f", Double.valueOf(d6)));
            } else if (TextUtils.equals("privacy-detail", this.sz.ru().ypw())) {
                ((TextView) this.cf).setText("Permission list | Privacy policy");
            } else if (f.x(this.sz, "development-name")) {
                ((TextView) this.cf).setText(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_text_privacy_development") + getText());
            } else if (f.x(this.sz, "app-version")) {
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

    public void emc(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.rie.emc(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }
}
