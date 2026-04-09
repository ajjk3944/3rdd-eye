package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import b9.e;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.widget.th;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import i9.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends fkw {
    private final int an;

    /* renamed from: cj, reason: collision with root package name */
    private ImageView f8364cj;
    private final Rect coz;
    private final Rect euf;
    private View fqk;
    private int fwd;

    /* renamed from: gh, reason: collision with root package name */
    private final th f8365gh;
    private TextView hun;
    private ImageView jvy;
    private ColorStateList kfa;
    private SeekBar kn;
    private TextView lso;
    private ColorStateList lvd;
    private final int mq;
    private final Rect ms;
    private boolean mt;
    private final Rect mwe;
    private int myk;

    /* renamed from: ng, reason: collision with root package name */
    private int f8366ng;
    private int njr;
    private float npr;
    private float odc;
    View ouw;
    private TextView pv;
    private TextView rrs;

    /* renamed from: sd, reason: collision with root package name */
    private float f8367sd;

    /* renamed from: ub, reason: collision with root package name */
    private ImageView f8368ub;
    private TextView ucs;
    private TextView ux;

    /* renamed from: vh, reason: collision with root package name */
    private TextView f8369vh;

    /* renamed from: vi, reason: collision with root package name */
    private ColorStateList f8370vi;
    boolean vt;
    private View wp;
    private int xdk;
    private final Rect xn;
    private final View.OnTouchListener ycd;
    private final jae yhj;
    private ImageView yib;
    private float yw;
    private float zjp;
    private int zvq;

    public yu(Context context, ViewGroup viewGroup, vpp vppVar, e eVar) {
        super(context, viewGroup, vppVar, eVar, false);
        this.yhj = new jae(this);
        this.vt = false;
        this.mt = false;
        this.xdk = 0;
        this.zvq = 0;
        this.myk = 0;
        this.f8366ng = 0;
        this.fwd = 0;
        this.coz = new Rect();
        this.euf = new Rect();
        this.njr = 0;
        this.ycd = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.xn = new Rect();
        this.ms = new Rect();
        this.mwe = new Rect();
        this.f8346od = zih.ouw().getApplicationContext();
        fkw(false);
        this.fkw = viewGroup;
        this.jqy = true;
        th thVar = new th(this);
        this.f8365gh = thVar;
        thVar.vt = this.jqy;
        DisplayMetrics displayMetrics = this.f8346od.getResources().getDisplayMetrics();
        this.mq = displayMetrics.widthPixels;
        this.an = displayMetrics.heightPixels;
        this.ksc = 17;
        this.bs = eVar;
        this.jae = vppVar;
        yu(8);
        ouw(context, this.fkw);
        le();
        ko();
    }

    private void ex() {
        DisplayMetrics displayMetrics = this.f8346od.getResources().getDisplayMetrics();
        TextView textView = this.f8369vh;
        if (textView != null) {
            this.odc = textView.getTextSize();
            this.f8369vh.setTextSize(2, 14.0f);
            ColorStateList textColors = this.f8369vh.getTextColors();
            this.f8370vi = textColors;
            if (textColors != null) {
                this.f8369vh.setTextColor(-1);
            }
            this.npr = this.f8369vh.getAlpha();
            this.f8369vh.setAlpha(0.85f);
            this.f8369vh.setShadowLayer(0.0f, osn.ouw(this.f8346od, 0.5f), osn.ouw(this.f8346od, 0.5f), com.bytedance.sdk.component.utils.vpp.ra(this.f8346od, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.f8369vh.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.xn.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                osn.ouw(this.f8369vh, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.xn.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.xn.bottom);
            }
        }
        TextView textView2 = this.ucs;
        if (textView2 != null) {
            this.zjp = textView2.getTextSize();
            this.ucs.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.ucs.getTextColors();
            this.kfa = textColors2;
            if (textColors2 != null) {
                this.ucs.setTextColor(-1);
            }
            this.yw = this.ucs.getAlpha();
            this.ucs.setAlpha(0.85f);
            this.ucs.setShadowLayer(0.0f, osn.ouw(this.f8346od, 0.5f), osn.ouw(this.f8346od, 0.5f), com.bytedance.sdk.component.utils.vpp.ra(this.f8346od, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.ucs.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.ms.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.ucs;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.ms;
                osn.ouw(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.yib;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.mwe.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.yib;
                Rect rect2 = this.mwe;
                osn.ouw(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.mwe.bottom);
            }
        }
        ImageView imageView3 = this.yib;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f8346od, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.ux;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.lvd = textColors3;
            if (textColors3 != null) {
                this.ux.setTextColor(-1);
            }
            this.f8367sd = this.ux.getAlpha();
            this.ux.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.ux.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.euf.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.ux;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.ms;
                osn.ouw(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.fqk;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.njr = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.fqk.setLayoutParams(layoutParams5);
            this.fqk.setBackgroundResource(com.bytedance.sdk.component.utils.vpp.yu(this.f8346od, "tt_shadow_fullscreen_top"));
        }
        le(false);
    }

    private void tc() {
        TextView textView = this.f8369vh;
        if (textView != null) {
            textView.setTextSize(0, this.odc);
            ColorStateList colorStateList = this.f8370vi;
            if (colorStateList != null) {
                this.f8369vh.setTextColor(colorStateList);
            }
            this.f8369vh.setAlpha(this.npr);
            this.f8369vh.setShadowLayer(osn.ouw(this.f8346od, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.vpp.ra(this.f8346od, "tt_72000000"));
            TextView textView2 = this.f8369vh;
            Rect rect = this.xn;
            osn.ouw(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.ucs;
        if (textView3 != null) {
            textView3.setTextSize(0, this.zjp);
            ColorStateList colorStateList2 = this.kfa;
            if (colorStateList2 != null) {
                this.ucs.setTextColor(colorStateList2);
            }
            this.ucs.setAlpha(this.yw);
            this.ucs.setShadowLayer(osn.ouw(this.f8346od, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.vpp.ra(this.f8346od, "tt_72000000"));
            TextView textView4 = this.ucs;
            Rect rect2 = this.ms;
            osn.ouw(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.yib;
        if (imageView != null) {
            Rect rect3 = this.mwe;
            osn.ouw(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.yib;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f8346od, "tt_enlarge_video"));
        }
        TextView textView5 = this.ux;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.lvd;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.ux.setAlpha(this.f8367sd);
            TextView textView6 = this.ux;
            Rect rect4 = this.ms;
            osn.ouw(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.fqk;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.njr;
            this.fqk.setLayoutParams(layoutParams);
            this.fqk.setBackground(cf.ouw(this.f8346od, "tt_video_black_desc_gradient"));
        }
        le(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void bly() {
        boolean z3 = this.vt;
        int i4 = z3 ? this.an : this.f8348th;
        int iOuw = z3 ? this.mq : this.qbp;
        if (this.vpp <= 0 || this.zin <= 0 || i4 <= 0) {
            return;
        }
        if (!this.jqy && !z3 && (this.ksc & 8) != 8) {
            iOuw = osn.ouw(this.f8346od, 228.0f);
        }
        float f10 = this.zin;
        float f11 = this.vpp;
        int i10 = (int) (((i4 * 1.0f) / f10) * f11);
        if (i10 > iOuw) {
            i4 = (int) (((iOuw * 1.0f) / f11) * f10);
        } else {
            iOuw = i10;
        }
        this.f8344le.ouw(i4, iOuw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void cf() {
        this.kn.setProgress(0);
        this.kn.setSecondaryProgress(0);
        this.ucs.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.f8346od, "tt_00_00"));
        this.f8369vh.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.f8346od, "tt_00_00"));
        yu(8);
        if (jqy()) {
            this.f8344le.setVisibility(8);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        yu(8);
        osn.ouw(this.wp, 8);
        osn.ouw(this.ryl, 8);
        osn.ouw((View) this.mwh, 8);
        osn.ouw(this.f8343jg, 8);
        osn.ouw((View) this.ko, 8);
        osn.ouw((View) this.rn, 8);
        osn.ouw((View) this.zih, 8);
        qbp qbpVar = this.f8341cd;
        if (qbpVar != null) {
            qbpVar.ouw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public final void jg() {
        if (this.vt) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            vpp vppVar = this.jae;
            if (vppVar != null && !TextUtils.isEmpty(vppVar.fqk)) {
                ouw(this.jae.fqk);
            }
            this.lso.setText(str);
        } else {
            ouw("");
            this.lso.setText("");
        }
        if (this.f8347pd) {
            return;
        }
        yu(this.jqy && !this.vt);
        if (zih()) {
            this.uq.ouw(this.pno.getVisibility() != 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    @SuppressLint({"ClickableViewAccessibility"})
    public final void le() {
        super.le();
        this.f8365gh.ouw(this.fkw);
        osn.ouw((View) this.jvy, (this.jqy || (this.ksc & 1) == 1) ? 8 : 0);
        this.jvy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (yu.this.zih()) {
                    yu.this.uq.yu();
                }
            }
        });
        osn.ouw((View) this.rrs, (!this.jqy || (this.ksc & 2) == 2) ? 0 : 8);
        this.rrs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (yu.this.zih()) {
                    yu.this.uq.fkw();
                }
            }
        });
        this.f8368ub.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (yu.this.zih()) {
                    yu.this.uq.le();
                }
            }
        });
        this.f8364cj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yu.this.le(false);
                yu yuVar = yu.this;
                osn.fkw(yuVar.pno);
                osn.fkw(yuVar.ouw);
                yu.this.tlj();
                yu.this.zih();
            }
        });
        this.yib.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (yu.this.zih()) {
                    yu.this.uq.lh();
                }
            }
        });
        this.kn.setThumbOffset(0);
        this.kn.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
                if (yu.this.zih()) {
                    yu.this.uq.vt(i4);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                yu yuVar = yu.this;
                if (!yuVar.vt && yuVar.f8346od != null) {
                    seekBar.setThumb(cf.ouw(zih.ouw(), "tt_seek_thumb_press"));
                }
                if (yu.this.zih()) {
                    seekBar.setThumbOffset(0);
                    ouw ouwVar = yu.this.uq;
                    seekBar.getProgress();
                    ouwVar.vt();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                yu yuVar = yu.this;
                if (!yuVar.vt && yuVar.f8346od != null) {
                    seekBar.setThumb(cf.ouw(zih.ouw(), "tt_seek_thumb_normal"));
                }
                if (yu.this.zih()) {
                    seekBar.setThumbOffset(0);
                    yu.this.uq.ouw(seekBar.getProgress());
                }
            }
        });
        this.kn.setOnTouchListener(this.ycd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void lh(boolean z3) {
        osn.ouw(this.wp, 8);
        osn.ouw(this.fqk, 8);
        osn.ouw((View) this.ra, 8);
        if (!this.jqy && !this.vt) {
            osn.ouw((View) this.jvy, 8);
            if ((this.ksc & 2) != 2) {
                osn.ouw((View) this.rrs, 8);
            }
        } else if ((this.ksc & 1) == 1) {
            osn.ouw((View) this.jvy, 8);
        }
        if (z3) {
            osn.ouw((View) this.jvy, 8);
            osn.ouw((View) this.rrs, 8);
        }
        yu(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public final void mwh() {
        lh(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void pno() {
        this.yhj.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ra() {
        this.yhj.removeMessages(1);
        this.yhj.sendMessageDelayed(this.yhj.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public final boolean ryl() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void tlj() {
        vpp vppVar;
        c cVar;
        osn.le(this.pno);
        osn.le(this.bly);
        osn.fkw(this.ouw);
        ImageView imageView = this.tlj;
        if (imageView != null && (vppVar = this.jae) != null && (cVar = vppVar.f8309sd) != null && cVar.f6578f != null) {
            osn.le(imageView);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.jae;
            c cVar2 = vppVar2.f8309sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(cVar2.f6578f, cVar2.f6574b, cVar2.f6573a, this.tlj, vppVar2);
        }
        if (this.ra.getVisibility() == 0) {
            osn.ouw((View) this.ra, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void vt(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ko.fkw("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (viewGroup2 = this.fkw) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.vt = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fkw.getLayoutParams();
        marginLayoutParams.width = this.myk;
        marginLayoutParams.height = this.f8366ng;
        marginLayoutParams.leftMargin = this.zvq;
        marginLayoutParams.topMargin = this.xdk;
        this.fkw.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.fwd);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.coz;
            osn.ouw(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        bly();
        this.yib.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f8346od, "tt_enlarge_video"));
        this.kn.setThumb(cf.ouw(this.f8346od, "tt_seek_thumb_normal"));
        this.kn.setThumbOffset(0);
        a.c(this.fkw, true);
        ra(this.vt);
        osn.ouw(this.fqk, 8);
        if ((this.ksc & 2) == 2) {
            osn.ouw((View) this.rrs, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void yu(boolean z3) {
        TextView textView = this.hun;
        if (textView != null) {
            osn.ouw((View) textView, (!this.jqy && z3) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(Context context, View view) {
        super.ouw(context, view);
        this.rrs = (TextView) view.findViewById(rn.swm);
        this.jvy = (ImageView) view.findViewById(rn.nn);
        this.fqk = view.findViewById(rn.eot);
        this.f8368ub = (ImageView) view.findViewById(rn.mu);
        this.hun = (TextView) view.findViewById(rn.zjq);
        this.ux = (TextView) view.findViewById(rn.xne);
        this.lso = (TextView) view.findViewById(rn.ajl);
        this.ouw = view.findViewById(rn.xwt);
        this.f8364cj = (ImageView) view.findViewById(rn.fg);
        TextView textView = (TextView) view.findViewById(rn.baa);
        this.pv = textView;
        textView.setText(com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_video_retry_des_txt"));
        this.kn = (SeekBar) view.findViewById(rn.kq);
        this.ucs = (TextView) view.findViewById(rn.nbp);
        this.f8369vh = (TextView) view.findViewById(rn.f8732vf);
        this.wp = view.findViewById(rn.sm);
        this.yib = (ImageView) view.findViewById(rn.cu);
        this.f8342cf = view.findViewById(rn.ln);
    }

    private void ra(boolean z3) {
        if (z3) {
            ex();
        } else {
            tc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(String str) {
        TextView textView = this.hun;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.ux;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(int i4) {
        View view = this.wp;
        if (view == null || view.getVisibility() != 0) {
            this.kn.setProgress(i4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(long j, long j8) {
        this.ucs.setText(a.b(j8));
        this.f8369vh.setText(a.b(j));
        this.kn.setProgress(a.a(j, j8));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void vt(boolean z3) {
        osn.ouw(this.wp, 0);
        if (this.vt) {
            osn.ouw(this.fqk, 0);
            osn.ouw((View) this.ux, 0);
        }
        osn.ouw((View) this.ra, (!z3 || this.pno.getVisibility() == 0) ? 8 : 0);
        if (!this.jqy && !this.vt) {
            if ((this.ksc & 1) != 1) {
                osn.ouw((View) this.jvy, 0);
            }
            osn.ouw((View) this.rrs, 0);
        }
        osn.ouw((View) this.ucs, 0);
        osn.ouw((View) this.f8369vh, 0);
        osn.ouw((View) this.kn, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, b9.g
    public final void ouw() {
        lh(this.jqy);
        qbp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(long j) {
        this.f8369vh.setText(a.b(j));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, b9.g
    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw(vpp vppVar) {
        String str;
        String strOuw;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        vpp vppVar2;
        c cVar;
        if (vppVar == null) {
            return;
        }
        ouw(this.fkw, zih.ouw());
        lh(this.jqy);
        osn.ouw(this.ryl, 0);
        osn.ouw((View) this.mwh, 0);
        osn.ouw(this.f8343jg, 0);
        if (this.mwh != null && (vppVar2 = this.jae) != null && (cVar = vppVar2.f8309sd) != null && cVar.f6578f != null) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar3 = this.jae;
            c cVar2 = vppVar3.f8309sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(cVar2.f6578f, cVar2.f6574b, cVar2.f6573a, this.mwh, vppVar3);
        }
        if (!TextUtils.isEmpty(vppVar.f8315vh)) {
            str = vppVar.f8315vh;
        } else if (!TextUtils.isEmpty(vppVar.fqk)) {
            str = vppVar.fqk;
        } else if (!TextUtils.isEmpty(vppVar.hun)) {
            str = vppVar.hun;
        } else {
            str = "";
        }
        vpp vppVar4 = this.jae;
        if (vppVar4 != null && (zihVar = vppVar4.fak) != null && zihVar.ouw != null) {
            osn.ouw((View) this.ko, 0);
            osn.ouw((View) this.rn, 4);
            if (this.ko != null) {
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                com.bytedance.sdk.openadsdk.th.vt.ouw(this.jae.fak, this.ko, vppVar);
                this.ko.setOnClickListener(this.fak);
                this.ko.setOnTouchListener(this.fak);
            }
        } else if (!TextUtils.isEmpty(str)) {
            osn.ouw((View) this.ko, 4);
            osn.ouw((View) this.rn, 0);
            TextView textView = this.rn;
            if (textView != null) {
                textView.setText(str.substring(0, 1));
                this.rn.setOnClickListener(this.fak);
                this.rn.setOnTouchListener(this.fak);
            }
        }
        if (this.zih != null && !TextUtils.isEmpty(str)) {
            this.zih.setText(str);
        }
        osn.ouw((View) this.zih, 0);
        osn.ouw((View) this.vm, 0);
        int i4 = vppVar.f8305pd;
        if (i4 == 4) {
            strOuw = com.bytedance.sdk.component.utils.vpp.ouw(this.f8346od, "tt_video_download_apk");
        } else if (i4 != 5) {
            strOuw = com.bytedance.sdk.component.utils.vpp.ouw(this.f8346od, "tt_video_mobile_go_detail");
        } else {
            strOuw = com.bytedance.sdk.component.utils.vpp.ouw(this.f8346od, "tt_video_dial_phone");
        }
        TextView textView2 = this.vm;
        if (textView2 != null) {
            textView2.setText(strOuw);
            this.vm.setOnClickListener(this.fak);
            this.vm.setOnTouchListener(this.fak);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final boolean vt(int i4) {
        SeekBar seekBar = this.kn;
        return seekBar != null && i4 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(ViewGroup viewGroup) {
        if (viewGroup != null && (this.fkw.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.vt = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fkw.getLayoutParams();
            this.zvq = marginLayoutParams.leftMargin;
            this.xdk = marginLayoutParams.topMargin;
            this.myk = marginLayoutParams.width;
            this.f8366ng = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.fkw.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.fwd = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.coz.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                osn.ouw(viewGroup, 0, 0, 0, 0);
            }
            bly();
            this.yib.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f8346od, "tt_shrink_video"));
            this.kn.setThumb(cf.ouw(this.f8346od, "tt_seek_thumb_fullscreen_selector"));
            this.kn.setThumbOffset(0);
            a.c(this.fkw, false);
            ra(this.vt);
            osn.ouw(this.fqk, 8);
            if (!this.jqy) {
                osn.ouw((View) this.jvy, 8);
                osn.ouw((View) this.rrs, 8);
            } else if ((this.ksc & 1) == 1) {
                osn.ouw((View) this.jvy, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what != 1) {
            return;
        }
        lh(false);
    }
}
