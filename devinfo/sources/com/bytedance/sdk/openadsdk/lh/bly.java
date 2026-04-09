package com.bytedance.sdk.openadsdk.lh;

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
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.lh.tlj;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends com.bytedance.sdk.openadsdk.core.le.lh implements tlj.lh, tlj.ouw, tlj.vt, tlj.yu {
    private com.bytedance.sdk.openadsdk.core.le.pno bly;

    /* renamed from: cf, reason: collision with root package name */
    private cf f8571cf;
    FilterWord fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f8572jg;

    /* renamed from: le, reason: collision with root package name */
    le f8573le;

    /* renamed from: lh, reason: collision with root package name */
    View f8574lh;
    private int mwh;
    final tlj ouw;
    private int pno;
    private int ra;
    private com.bytedance.sdk.openadsdk.core.le.pno ryl;
    private TextView tlj;
    View vt;
    com.bytedance.sdk.openadsdk.core.le.yu yu;

    public bly(Context context, tlj tljVar) {
        this(context, tljVar, null);
    }

    private boolean lh() {
        if (this.mwh == 0) {
            vt();
        }
        return this.mwh < this.f8572jg;
    }

    private void vt() {
        if (this.mwh > 0) {
            return;
        }
        this.mwh = osn.yu(getContext());
        int iLe = osn.le(getContext());
        this.f8572jg = iLe;
        this.ouw.ouw(this.mwh, iLe);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.mwh == 0) {
                vt();
            }
            layoutParams.width = Math.min(this.mwh, this.f8572jg) - (osn.ouw(getContext(), 16.0f) * 2);
        }
    }

    public bly(Context context, tlj tljVar, List<FilterWord> list) {
        super(context);
        this.ouw = tljVar;
        tljVar.ouw((tlj.lh) this);
        tljVar.ouw((tlj.vt) this);
        tljVar.ra.add(this);
        tljVar.pno.add(this);
        vt();
        this.pno = osn.ouw(context, 8.0f);
        this.ra = osn.ouw(context, 20.0f);
        int iOuw = osn.ouw(context, 56.0f);
        int iOuw2 = osn.ouw(context, 30.0f);
        int iOuw3 = lh() ? this.ra : osn.ouw(context, 12.0f);
        iOuw = lh() ? iOuw : iOuw2;
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, osn.ouw(getContext(), 98.0f));
        view.setBackground(vpp.lh(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.pno);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        int iOuw4 = osn.ouw(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams3.setMargins(0, iOuw3, iOuw3, 0);
        layoutParams3.gravity = 8388661;
        yuVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_titlebar_close_seletor"));
        addView(yuVar, layoutParams3);
        yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.bly.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bly.this.ouw.lh();
            }
        });
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.yu = yuVar2;
        yuVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.bly.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bly.this.ouw();
            }
        });
        this.yu.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams4.setMargins(iOuw3, iOuw3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableOuw = com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_leftbackicon_selector");
        drawableOuw.setAutoMirrored(true);
        this.yu.setImageDrawable(drawableOuw);
        addView(this.yu, layoutParams4);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iOuw3, iOuw, iOuw3, iOuw3);
        fkwVar.setOrientation(1);
        addView(fkwVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fkwVar2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(vpp.ouw(context, "tt_like_this_ad"));
        textView.setTextSize(lh() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        fkwVar2.addView(textView, layoutParams6);
        TextView textView2 = new TextView(context);
        textView2.setText(vpp.ouw(context, "tt_feel_hint"));
        textView2.setTextSize(lh() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        if (lh()) {
            layoutParams7.topMargin = osn.ouw(context, 4.0f);
        }
        fkwVar2.addView(textView2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        int iOuw5 = osn.ouw(context, 16.0f);
        int iOuw6 = osn.ouw(context, 12.0f);
        int iOuw7 = osn.ouw(context, 8.0f);
        if (lh()) {
            layoutParams8.topMargin = iOuw5;
            layoutParams8.bottomMargin = iOuw5;
        } else {
            layoutParams8.topMargin = iOuw6;
            layoutParams8.bottomMargin = iOuw7;
        }
        fkwVar2.addView(fkwVar3, layoutParams8);
        fkwVar3.addView(new fkw(context, 1, tljVar));
        fkw fkwVar4 = new fkw(context, 2, tljVar);
        ViewGroup.LayoutParams layoutParams9 = fkwVar4.getLayoutParams();
        boolean z3 = layoutParams9 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams10 = layoutParams9;
        if (!z3) {
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2);
            layoutParams11.weight = 1.0f;
            layoutParams10 = layoutParams11;
        }
        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams10;
        layoutParams12.leftMargin = iOuw5;
        layoutParams12.rightMargin = iOuw5;
        fkwVar3.addView(fkwVar4, layoutParams10);
        fkwVar3.addView(new fkw(context, 3, tljVar));
        cf cfVar = new cf(context);
        this.f8571cf = cfVar;
        fkwVar2.addView(cfVar);
        this.tlj = new TextView(context);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams13.topMargin = lh() ? iOuw5 : iOuw7;
        this.tlj.setTextColor(-16777216);
        this.tlj.setPadding(iOuw6, iOuw7, iOuw6, iOuw7);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(iOuw7);
        gradientDrawable2.setColor(Color.parseColor("#F8F8F8"));
        this.tlj.setBackground(gradientDrawable2);
        this.tlj.setText(vpp.ouw(context, "tt_report_this_ad"));
        this.tlj.setTextSize(lh() ? 14 : 12);
        Drawable drawableLh = vpp.lh(context, "tt_report_ad_arrow");
        drawableLh.setBounds(0, 0, iOuw6, iOuw6);
        this.tlj.setCompoundDrawables(null, null, drawableLh, null);
        this.tlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.bly.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bly blyVar = bly.this;
                View view3 = blyVar.f8574lh;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                View view4 = blyVar.vt;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                com.bytedance.sdk.openadsdk.core.le.yu yuVar3 = blyVar.yu;
                if (yuVar3 != null) {
                    yuVar3.setVisibility(0);
                }
                tlj tljVar2 = blyVar.ouw;
                if (tljVar2 == null || !tljVar2.vt()) {
                    return;
                }
                blyVar.fkw = blyVar.ouw.vm;
            }
        });
        fkwVar2.addView(this.tlj, layoutParams13);
        this.vt = fkwVar2;
        fkwVar.addView(fkwVar2);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar5 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar5.setOrientation(1);
        fkwVar5.setLayoutParams(new LinearLayout.LayoutParams(-1, !lh() ? osn.ouw(context, 200.0f) : osn.ouw(context, 358.0f)));
        TextView textView3 = new TextView(context);
        textView3.setText(vpp.ouw(context, "tt_select_reason"));
        textView3.setTextSize(lh() ? 23 : 16);
        textView3.setGravity(1);
        textView3.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams14.gravity = 1;
        layoutParams14.bottomMargin = osn.ouw(context, lh() ? 24.0f : 4.0f);
        fkwVar5.addView(textView3, layoutParams14);
        le leVar = new le(context, tljVar);
        this.f8573le = leVar;
        fkwVar5.addView(leVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.ryl = pnoVar;
        pnoVar.setId(rn.gls);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams15.topMargin = lh() ? this.ra : osn.ouw(context, 6.0f);
        layoutParams15.gravity = 17;
        this.ryl.setLayoutParams(layoutParams15);
        this.ryl.setFocusable(false);
        this.ryl.setHint(vpp.ouw(context, "tt_add_bad_reason"));
        this.ryl.setHintTextColor(Color.parseColor("#57000000"));
        this.ryl.setTextColor(Color.rgb(22, 24, 35));
        this.ryl.setTextSize(15.0f);
        this.ryl.setGravity(8388615);
        this.ryl.setVisibility(0);
        this.ryl.setPadding(0, osn.ouw(context, 15.0f), 0, osn.ouw(context, 14.0f));
        this.ryl.setEllipsize(TextUtils.TruncateAt.END);
        this.ryl.setSingleLine();
        this.ryl.setMaxLines(1);
        this.ryl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.bly.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Iterator<tlj.vt> it = bly.this.ouw.f8585le.iterator();
                while (it.hasNext()) {
                    it.next().ouw(tlj.fkw);
                }
            }
        });
        fkwVar5.addView(this.ryl, layoutParams15);
        fkwVar5.addView(new cf(context, Color.argb(128, 0, 0, 0)));
        fkwVar5.setVisibility(8);
        this.f8574lh = fkwVar5;
        fkwVar.addView(fkwVar5);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams16.topMargin = lh() ? this.ra : osn.ouw(context, 12.0f);
        layoutParams16.gravity = 80;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(this.pno);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable3.setColor(iRgb);
        gradientDrawable3.setAlpha(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(this.pno);
        gradientDrawable4.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable4);
        stateListDrawable.addState(new int[0], gradientDrawable3);
        int i4 = this.pno;
        pnoVar2.setPadding(0, i4, 0, i4);
        pnoVar2.setGravity(17);
        pnoVar2.setBackground(stateListDrawable);
        pnoVar2.setTextColor(-1);
        pnoVar2.setTextSize(16.0f);
        pnoVar2.setText(vpp.ouw(context, "tt_suggestion_commit"));
        pnoVar2.setEnabled(false);
        pnoVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.bly.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tlj tljVar2 = bly.this.ouw;
                if (!tljVar2.vt() && !TextUtils.isEmpty(tljVar2.mwh)) {
                    tljVar2.vm = new FilterWord("0:00", tljVar2.mwh);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(tljVar2.vm);
                if (!TextUtils.isEmpty(tljVar2.bly)) {
                    if (TextUtils.isEmpty(tljVar2.mwh)) {
                        vt.ouw().ouw(tljVar2.bly, arrayList, null, null, tljVar2.tlj);
                    } else {
                        if (tljVar2.f8584jg == null) {
                            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = tljVar2.rn;
                            if (vppVar != null) {
                                tljVar2.f8584jg = vppVar.ouw(true);
                            } else {
                                try {
                                    tljVar2.f8584jg = new JSONObject(tljVar2.ko);
                                } catch (Throwable th2) {
                                    qbp.ouw("TTDislikeManager", "creative info to json exception", th2);
                                }
                            }
                        }
                        vt.ouw().ouw(tljVar2.bly, arrayList, tljVar2.f8584jg, tljVar2.mwh, tljVar2.tlj);
                    }
                }
                if (!TextUtils.isEmpty(tljVar2.f8583cf)) {
                    if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                        bs.fkw(new com.bytedance.sdk.component.pno.pno("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.lh.tlj.1
                            final /* synthetic */ String ouw;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(String str, String str2) {
                                super(str);
                                str = str2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    if (TextUtils.isEmpty(tlj.this.f8583cf)) {
                                        return;
                                    }
                                    tlj.this.yu().executeDisLikeClosedCallback(tlj.this.f8583cf, str);
                                } catch (Throwable th3) {
                                    qbp.ouw("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th3);
                                }
                            }
                        });
                    } else {
                        ra.ouw ouwVarLh = com.bytedance.sdk.openadsdk.core.bly.ouw().lh(tljVar2.f8583cf);
                        if (ouwVarLh != null) {
                            ouwVarLh.ouw();
                            com.bytedance.sdk.openadsdk.core.bly.ouw().yu(tljVar2.f8583cf);
                        }
                    }
                }
                Iterator<tlj.vt> it = tljVar2.f8585le.iterator();
                while (it.hasNext()) {
                    it.next().ouw(tlj.vt);
                }
                tljVar2.ouw(tlj.ouw);
                tljVar2.vt("");
            }
        });
        pnoVar2.setLayoutParams(layoutParams16);
        this.bly = pnoVar2;
        fkwVar.addView(pnoVar2);
        if (list == null || list.isEmpty()) {
            return;
        }
        vt(list);
    }

    public final void ouw() {
        View view = this.f8574lh;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.vt;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = this.yu;
        if (yuVar != null) {
            yuVar.setVisibility(8);
        }
        tlj tljVar = this.ouw;
        if (tljVar != null) {
            FilterWord filterWord = this.fkw;
            if (filterWord != null) {
                tljVar.ouw(filterWord);
            } else {
                tljVar.ouw(tlj.ouw);
            }
            this.ouw.vt(null);
        }
    }

    private void vt(List<FilterWord> list) {
        this.f8573le.ouw(list);
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.lh
    public final void ouw(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.bly != null && TextUtils.isEmpty(this.ouw.mwh)) {
            this.bly.setEnabled(!tlj.ouw.equals(filterWord));
        }
        if (fkw.ouw.equals(filterWord) || fkw.vt.equals(filterWord)) {
            this.tlj.setVisibility(8);
            this.f8571cf.setVisibility(8);
        }
        if (fkw.f8575lh.equals(filterWord) || tlj.ouw.equals(filterWord)) {
            this.tlj.setVisibility(0);
            this.f8571cf.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.vt
    public final void ouw(int i4) {
        if (tlj.f8582lh == i4) {
            this.fkw = null;
            ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.yu
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar;
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = this.ryl;
        if (pnoVar2 != null) {
            pnoVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            tlj tljVar = this.ouw;
            if (tljVar == null || (pnoVar = this.bly) == null) {
                return;
            }
            pnoVar.setEnabled(tljVar.vt());
            return;
        }
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = this.bly;
        if (pnoVar3 != null) {
            pnoVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.ouw
    public final void ouw(List<FilterWord> list) {
        vt(list);
    }
}
