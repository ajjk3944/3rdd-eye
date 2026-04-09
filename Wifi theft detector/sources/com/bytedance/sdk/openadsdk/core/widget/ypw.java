package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.hxp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ypw extends Dialog {
    private com.bytedance.sdk.openadsdk.core.ycc.emc bw;
    private boolean cf;
    private com.bytedance.sdk.openadsdk.core.ycc.msw dg;
    public InterfaceC0165ypw emc;
    private String gbl;
    private final Context msw;
    private OnBackInvokedCallback qh;
    private String ru;
    private String sup;
    private int sz;
    private View uym;
    private com.bytedance.sdk.openadsdk.core.ycc.msw xq;
    private com.bytedance.sdk.openadsdk.core.ycc.emc ycc;
    private com.bytedance.sdk.openadsdk.core.ycc.dg ypw;
    private String zz;

    public static class emc implements OnBackInvokedCallback {
        private final WeakReference<ypw> emc;

        public emc(ypw ypwVar) {
            this.emc = new WeakReference<>(ypwVar);
        }

        public void onBackInvoked() {
            ypw ypwVar = this.emc.get();
            if (ypwVar != null) {
                com.bytedance.sdk.component.utils.ul.emc("CustomCommonDialog", "onBackInvoked");
                ypwVar.onBackPressed();
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.ypw$ypw, reason: collision with other inner class name */
    public interface InterfaceC0165ypw {
        void emc();

        void ypw();
    }

    public ypw(Context context) {
        super(context, rie.ycc(context, "tt_custom_dialog"));
        this.sz = -1;
        this.cf = false;
        this.msw = context;
    }

    private void emc() {
        this.ycc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ypw.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0165ypw interfaceC0165ypw = ypw.this.emc;
                if (interfaceC0165ypw != null) {
                    interfaceC0165ypw.emc();
                }
            }
        });
        this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ypw.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0165ypw interfaceC0165ypw = ypw.this.emc;
                if (interfaceC0165ypw != null) {
                    interfaceC0165ypw.ypw();
                }
            }
        });
    }

    private void xq() {
        if (this.qh == null || !hxp.emc()) {
            return;
        }
        com.bytedance.sdk.component.utils.ul.emc("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.qh);
    }

    private void ypw() {
        if (TextUtils.isEmpty(this.ru)) {
            this.xq.setVisibility(8);
        } else {
            this.xq.setText(this.ru);
            this.xq.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.zz)) {
            this.dg.setText(this.zz);
        }
        if (TextUtils.isEmpty(this.gbl)) {
            this.ycc.setText(rie.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), "tt_postive_txt"));
        } else {
            this.ycc.setText(this.gbl);
        }
        if (TextUtils.isEmpty(this.sup)) {
            this.bw.setText(rie.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), "tt_negtive_txt"));
        } else {
            this.bw.setText(this.sup);
        }
        int i10 = this.sz;
        if (i10 != -1) {
            this.ypw.setImageResource(i10);
            this.ypw.setVisibility(0);
        } else {
            this.ypw.setVisibility(8);
        }
        if (this.cf) {
            this.uym.setVisibility(8);
            this.bw.setVisibility(8);
        } else {
            this.bw.setVisibility(0);
            this.uym.setVisibility(0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        xq();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.ul.emc("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(emc(this.msw));
        if (hxp.emc()) {
            com.bytedance.sdk.component.utils.ul.emc("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.qh = new emc(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.qh);
        }
        setCanceledOnTouchOutside(false);
        ypw();
        emc();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ypw();
    }

    private View emc(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(context);
        uymVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        bwVar.setMinimumWidth(emc(260.0f));
        bwVar.setPadding(0, emc(32.0f), 0, 0);
        bwVar.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_custom_dialog_bg"));
        bwVar.setOrientation(1);
        bwVar.setLayoutParams(layoutParams);
        this.xq = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = emc(16.0f);
        layoutParams2.rightMargin = emc(16.0f);
        layoutParams2.bottomMargin = emc(16.0f);
        this.xq.setGravity(17);
        this.xq.setVisibility(0);
        this.xq.setTextColor(Color.parseColor("#333333"));
        this.xq.setTextSize(18.0f);
        this.xq.setLayoutParams(layoutParams2);
        this.ypw = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = emc(16.0f);
        layoutParams3.rightMargin = emc(16.0f);
        layoutParams3.bottomMargin = emc(10.0f);
        this.ypw.setMaxHeight(emc(150.0f));
        this.ypw.setMaxWidth(emc(150.0f));
        this.ypw.setVisibility(0);
        this.ypw.setLayoutParams(layoutParams3);
        this.dg = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = emc(20.0f);
        layoutParams4.rightMargin = emc(20.0f);
        this.dg.setGravity(17);
        this.dg.setLineSpacing(emc(3.0f), 1.2f);
        this.dg.setTextSize(18.0f);
        this.dg.setTextColor(Color.parseColor("#000000"));
        this.dg.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = emc(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        bwVar2.setOrientation(0);
        bwVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.ycc.emc emcVar = new com.bytedance.sdk.openadsdk.core.ycc.emc(context);
        this.bw = emcVar;
        emcVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = emc(10.0f);
        layoutParams7.weight = 1.0f;
        this.bw.setPadding(0, emc(16.0f), 0, emc(16.0f));
        this.bw.setBackground(null);
        this.bw.setGravity(17);
        this.bw.setSingleLine(true);
        this.bw.setTextColor(Color.parseColor("#999999"));
        this.bw.setTextSize(16.0f);
        this.bw.setLayoutParams(layoutParams7);
        this.uym = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.uym.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.uym.setLayoutParams(layoutParams8);
        this.ycc = new com.bytedance.sdk.openadsdk.core.ycc.emc(context);
        this.bw.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = emc(10.0f);
        layoutParams9.weight = 1.0f;
        this.ycc.setPadding(0, emc(16.0f), 0, emc(16.0f));
        this.ycc.setBackground(null);
        this.ycc.setGravity(17);
        this.ycc.setSingleLine(true);
        this.ycc.setTextColor(Color.parseColor("#38ADFF"));
        this.ycc.setTextSize(16.0f);
        this.ycc.setLayoutParams(layoutParams9);
        uymVar.addView(bwVar);
        bwVar.addView(this.xq);
        bwVar.addView(this.ypw);
        bwVar.addView(this.dg);
        bwVar.addView(view);
        bwVar.addView(bwVar2);
        bwVar2.addView(this.bw);
        bwVar2.addView(this.uym);
        bwVar2.addView(this.ycc);
        return uymVar;
    }

    public ypw xq(String str) {
        this.sup = str;
        return this;
    }

    public ypw ypw(String str) {
        this.gbl = str;
        return this;
    }

    private int emc(float f10) {
        return vw.ypw(getContext(), f10);
    }

    public ypw emc(InterfaceC0165ypw interfaceC0165ypw) {
        this.emc = interfaceC0165ypw;
        return this;
    }

    public ypw emc(String str) {
        this.zz = str;
        return this;
    }
}
