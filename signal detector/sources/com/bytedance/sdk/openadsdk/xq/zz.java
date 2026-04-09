package com.bytedance.sdk.openadsdk.xq;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.xq.ru;
import java.util.List;

/* loaded from: classes.dex */
public class zz extends com.bytedance.sdk.openadsdk.core.ycc.xq implements ru.dg, ru.emc, ru.xq, ru.ypw {
    private com.bytedance.sdk.openadsdk.core.ycc.msw bw;
    private final ru dg;
    ycc emc;
    private com.bytedance.sdk.openadsdk.core.ycc.msw gbl;
    private View msw;
    private FilterWord qh;
    private com.bytedance.sdk.openadsdk.core.ycc.dg ru;
    private int sup;
    private int sz;
    private gbl uym;
    private int xq;
    private TextView ycc;
    private int ypw;
    private View zz;

    public zz(Context context, ru ruVar) {
        this(context, ruVar, null);
    }

    private boolean dg() {
        if (this.sup == 0) {
            xq();
        }
        return this.sup < this.sz;
    }

    private void xq() {
        if (this.sup > 0) {
            return;
        }
        this.sup = vw.xq(getContext());
        int iBw = vw.bw(getContext());
        this.sz = iBw;
        this.dg.emc(this.sup, iBw);
    }

    private com.bytedance.sdk.openadsdk.core.ycc.msw ypw(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dg() ? this.ypw : vw.ypw(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.xq);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.xq);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.xq;
        mswVar.setPadding(0, i, 0, i);
        mswVar.setGravity(17);
        mswVar.setBackground(stateListDrawable);
        mswVar.setTextColor(-1);
        mswVar.setTextSize(16.0f);
        mswVar.setText(rie.emc(context, "tt_suggestion_commit"));
        mswVar.setEnabled(false);
        mswVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.zz.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                zz.this.dg.dg();
            }
        });
        mswVar.setLayoutParams(layoutParams);
        return mswVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.xq, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.sup == 0) {
                xq();
            }
            layoutParams.width = Math.min(this.sup, this.sz) - (vw.ypw(getContext(), 16.0f) * 2);
        }
    }

    public zz(Context context, ru ruVar, List<FilterWord> list) {
        super(context);
        this.dg = ruVar;
        ruVar.emc((ru.xq) this);
        ruVar.emc((ru.ypw) this);
        ruVar.emc((ru.dg) this);
        ruVar.emc((ru.emc) this);
        xq();
        emc(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        ypw(list);
    }

    private void emc(Context context) {
        this.xq = vw.ypw(context, 8.0f);
        this.ypw = vw.ypw(context, 20.0f);
        int iYpw = vw.ypw(context, 56.0f);
        int iYpw2 = vw.ypw(context, 30.0f);
        int iYpw3 = vw.ypw(context, 12.0f);
        if (dg()) {
            iYpw3 = this.ypw;
        }
        if (!dg()) {
            iYpw = iYpw2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, vw.ypw(getContext(), 98.0f));
        view.setBackground(rie.xq(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.xq);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        int iYpw4 = vw.ypw(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iYpw4, iYpw4);
        layoutParams3.setMargins(0, iYpw3, iYpw3, 0);
        layoutParams3.gravity = 8388661;
        dgVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_titlebar_close_seletor"));
        addView(dgVar, layoutParams3);
        dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.zz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                zz.this.dg.bw();
            }
        });
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        this.ru = dgVar2;
        dgVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.zz.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                zz.this.ypw();
            }
        });
        this.ru.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iYpw4, iYpw4);
        layoutParams4.setMargins(iYpw3, iYpw3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableEmc = com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_leftbackicon_selector");
        drawableEmc.setAutoMirrored(true);
        this.ru.setImageDrawable(drawableEmc);
        addView(this.ru, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iYpw3, iYpw, iYpw3, iYpw3);
        bwVar.setOrientation(1);
        addView(bwVar, layoutParams5);
        View viewXq = xq(context);
        this.msw = viewXq;
        bwVar.addView(viewXq);
        View viewDg = dg(context);
        this.zz = viewDg;
        bwVar.addView(viewDg);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVarYpw = ypw(context);
        this.bw = mswVarYpw;
        bwVar.addView(mswVarYpw);
    }

    private View dg(Context context) {
        int iYpw;
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(1);
        if (!dg()) {
            iYpw = vw.ypw(context, 200.0f);
        } else {
            iYpw = vw.ypw(context, 358.0f);
        }
        bwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iYpw));
        TextView textView = new TextView(context);
        textView.setText(rie.emc(context, "tt_select_reason"));
        textView.setTextSize(dg() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = vw.ypw(context, dg() ? 24.0f : 4.0f);
        bwVar.addView(textView, layoutParams);
        ycc yccVar = new ycc(context, this.dg);
        this.emc = yccVar;
        bwVar.addView(yccVar);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.gbl = mswVar;
        mswVar.setId(vk.uie);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dg() ? this.ypw : vw.ypw(context, 6.0f);
        layoutParams2.gravity = 17;
        this.gbl.setLayoutParams(layoutParams2);
        this.gbl.setFocusable(false);
        this.gbl.setHint(rie.emc(context, "tt_add_bad_reason"));
        this.gbl.setHintTextColor(Color.parseColor("#57000000"));
        this.gbl.setTextColor(Color.rgb(22, 24, 35));
        this.gbl.setTextSize(15.0f);
        this.gbl.setGravity(8388615);
        this.gbl.setVisibility(0);
        this.gbl.setPadding(0, vw.ypw(context, 15.0f), 0, vw.ypw(context, 14.0f));
        this.gbl.setEllipsize(TextUtils.TruncateAt.END);
        this.gbl.setSingleLine();
        this.gbl.setMaxLines(1);
        this.gbl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.zz.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                zz.this.dg.ycc();
            }
        });
        bwVar.addView(this.gbl, layoutParams2);
        bwVar.addView(new gbl(context, Color.argb(128, 0, 0, 0)));
        bwVar.setVisibility(8);
        return bwVar;
    }

    private View xq(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        bwVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(rie.emc(context, "tt_like_this_ad"));
        textView.setTextSize(dg() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        bwVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(rie.emc(context, "tt_feel_hint"));
        textView2.setTextSize(dg() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (dg()) {
            layoutParams2.topMargin = vw.ypw(context, 4.0f);
        }
        bwVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iYpw = vw.ypw(context, 16.0f);
        int iYpw2 = vw.ypw(context, 12.0f);
        int iYpw3 = vw.ypw(context, 8.0f);
        if (dg()) {
            layoutParams3.topMargin = iYpw;
            layoutParams3.bottomMargin = iYpw;
        } else {
            layoutParams3.topMargin = iYpw2;
            layoutParams3.bottomMargin = iYpw3;
        }
        bwVar.addView(bwVar2, layoutParams3);
        bwVar2.addView(new bw(context, 1, this.dg));
        bw bwVar3 = new bw(context, 2, this.dg);
        ViewGroup.LayoutParams layoutParams4 = bwVar3.getLayoutParams();
        boolean z6 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z6) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iYpw;
        layoutParams7.rightMargin = iYpw;
        bwVar2.addView(bwVar3, layoutParams5);
        bwVar2.addView(new bw(context, 3, this.dg));
        gbl gblVar = new gbl(context);
        this.uym = gblVar;
        bwVar.addView(gblVar);
        this.ycc = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!dg()) {
            iYpw = iYpw3;
        }
        layoutParams8.topMargin = iYpw;
        this.ycc.setTextColor(-16777216);
        this.ycc.setPadding(iYpw2, iYpw3, iYpw2, iYpw3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iYpw3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.ycc.setBackground(gradientDrawable);
        this.ycc.setText(rie.emc(context, "tt_report_this_ad"));
        this.ycc.setTextSize(dg() ? 14 : 12);
        Drawable drawableXq = rie.xq(context, "tt_report_ad_arrow");
        drawableXq.setBounds(0, 0, iYpw2, iYpw2);
        this.ycc.setCompoundDrawables(null, null, drawableXq, null);
        this.ycc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.zz.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                zz.this.emc();
            }
        });
        bwVar.addView(this.ycc, layoutParams8);
        return bwVar;
    }

    private void ypw(List<FilterWord> list) {
        this.emc.emc(list);
    }

    public void ypw() {
        View view = this.zz;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.msw;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = this.ru;
        if (dgVar != null) {
            dgVar.setVisibility(8);
        }
        ru ruVar = this.dg;
        if (ruVar != null) {
            FilterWord filterWord = this.qh;
            if (filterWord != null) {
                ruVar.emc(filterWord);
            } else {
                ruVar.emc(ru.emc);
            }
            this.dg.xq(null);
        }
    }

    public void emc() {
        View view = this.zz;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.msw;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = this.ru;
        if (dgVar != null) {
            dgVar.setVisibility(0);
        }
        ru ruVar = this.dg;
        if (ruVar == null || !ruVar.xq()) {
            return;
        }
        this.qh = this.dg.ypw();
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.xq
    public void emc(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.bw != null && TextUtils.isEmpty(this.dg.uym())) {
            this.bw.setEnabled(!ru.emc.equals(filterWord));
        }
        if (bw.emc.equals(filterWord) || bw.ypw.equals(filterWord)) {
            this.ycc.setVisibility(8);
            this.uym.setVisibility(8);
        }
        if (bw.xq.equals(filterWord) || ru.emc.equals(filterWord)) {
            this.ycc.setVisibility(0);
            this.uym.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.ypw
    public void emc(int i) {
        if (ru.xq == i) {
            this.qh = null;
            ypw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.dg
    public void emc(String str) {
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar;
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = this.gbl;
        if (mswVar2 != null) {
            mswVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            ru ruVar = this.dg;
            if (ruVar == null || (mswVar = this.bw) == null) {
                return;
            }
            mswVar.setEnabled(ruVar.xq());
            return;
        }
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = this.bw;
        if (mswVar3 != null) {
            mswVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.emc
    public void emc(List<FilterWord> list) {
        ypw(list);
    }
}
