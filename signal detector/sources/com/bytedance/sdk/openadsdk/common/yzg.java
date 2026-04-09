package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg extends Dialog {
    private static final String[] ypw = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private Button bw;
    private TextView dg;
    private final Handler emc;
    private String xq;
    private ImageView ycc;

    public yzg(Context context) {
        super(context, rie.ycc(context, "tt_privacy_dialog_theme_ad_report"));
        this.emc = new Handler(Looper.getMainLooper());
        this.xq = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(emc(getContext()), new ViewGroup.LayoutParams(vw.xq(getContext()), (int) (vw.bw(getContext()) * 0.9d)));
        ypw();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.emc.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.yzg.3
                @Override // java.lang.Runnable
                public void run() {
                    yzg.this.dg.setText(yzg.this.xq);
                }
            }, 1000L);
        } catch (Exception e6) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e6);
        }
    }

    private void ypw() {
        final String strYcc = tp.ycc();
        final String strMsw = tp.msw();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.yzg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) yzg.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strYcc, strMsw, str, str2, yzg.this.xq};
                    for (int i = 0; i < yzg.ypw.length; i++) {
                        sb.append(yzg.ypw[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.ycc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.yzg.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                yzg.this.dg.setText("loading ...");
                yzg.this.cancel();
            }
        });
    }

    public void emc(String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        JSONObject jSONObjectGef;
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObjectGef = new JSONObject(str);
            } else {
                jSONObjectGef = rieVar.gef();
            }
            this.xq = com.bytedance.sdk.component.utils.emc.emc(jSONObjectGef).toString();
        } catch (JSONException e6) {
            com.bytedance.sdk.component.utils.ul.xq("TTPrivacyAdReportDialog", e6.getMessage());
        }
    }

    private View emc(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bwVar.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_ad_report_info_bg"));
        bwVar.setOrientation(1);
        bwVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(context);
        uymVar.setLayoutParams(new ViewGroup.LayoutParams(-1, emc(44.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(emc(191.0f), emc(24.0f));
        layoutParams2.addRule(13);
        mswVar.setGravity(17);
        mswVar.setText("Ad Report");
        mswVar.setTextColor(Color.parseColor("#161823"));
        mswVar.setTextSize(1, 17.0f);
        mswVar.setLayoutParams(layoutParams2);
        this.ycc = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(emc(40.0f), emc(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = emc(8.0f);
        this.ycc.setPadding(emc(12.0f), emc(14.0f), emc(12.0f), emc(14.0f));
        this.ycc.setImageResource(rie.dg(context, "tt_ad_xmark"));
        this.ycc.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, emc(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = emc(16.0f);
        layoutParams5.rightMargin = emc(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(emc(16.0f));
        layoutParams5.setMarginEnd(emc(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        bwVar2.setOrientation(1);
        bwVar2.setLayoutParams(layoutParams6);
        String strYcc = tp.ycc();
        String strMsw = tp.msw();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc = emc(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc2 = emc(context, "App", strYcc);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc3 = emc(context, "App version", strMsw);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc4 = emc(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc5 = emc(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc6 = emc(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, emc(76.0f));
        bwVar3.setBackgroundColor(-1);
        bwVar3.setLayoutParams(layoutParams7);
        this.bw = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iEmc = emc(16.0f);
        layoutParams8.setMargins(iEmc, iEmc, iEmc, iEmc);
        this.bw.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_ad_report_info_button_bg"));
        this.bw.setText("copy all");
        this.bw.setTextColor(Color.parseColor("#333333"));
        this.bw.setTextSize(14.0f);
        this.bw.setLayoutParams(layoutParams8);
        bwVar.addView(uymVar);
        uymVar.addView(mswVar);
        uymVar.addView(this.ycc);
        bwVar.addView(view);
        bwVar.addView(scrollView);
        scrollView.addView(bwVar2);
        bwVar2.addView(bwVarEmc);
        bwVar2.addView(bwVarEmc2);
        bwVar2.addView(bwVarEmc3);
        bwVar2.addView(bwVarEmc4);
        bwVar2.addView(bwVarEmc5);
        bwVar2.addView(bwVarEmc6);
        bwVar.addView(bwVar3);
        bwVar3.addView(this.bw);
        return bwVar;
    }

    private com.bytedance.sdk.openadsdk.core.ycc.bw emc(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : emc(74.0f));
        bwVar.setOrientation(1);
        bwVar.setPadding(0, emc(16.0f), 0, emc(16.0f));
        bwVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = emc(7.0f);
        mswVar.setIncludeFontPadding(false);
        mswVar.setText(str);
        mswVar.setTextColor(Color.parseColor("#333333"));
        mswVar.setTextSize(16.0f);
        mswVar.setTypeface(Typeface.defaultFromStyle(1));
        mswVar.setLayoutParams(layoutParams2);
        bwVar.addView(mswVar);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        if (str.equals("Creative info")) {
            this.dg = mswVar2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        mswVar2.setIncludeFontPadding(false);
        mswVar2.setTextColor(Color.parseColor("#666666"));
        mswVar2.setText(str2);
        mswVar2.setTextSize(14.0f);
        mswVar2.setLayoutParams(layoutParams3);
        bwVar.addView(mswVar2);
        return bwVar;
    }

    private int emc(float f2) {
        return vw.ypw(getContext(), f2);
    }
}
