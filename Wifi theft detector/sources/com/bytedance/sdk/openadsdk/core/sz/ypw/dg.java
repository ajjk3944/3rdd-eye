package com.bytedance.sdk.openadsdk.core.sz.ypw;

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
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.ul;
import com.bytedance.sdk.openadsdk.core.widget.yzg;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import s2.b;
import y2.a;

/* loaded from: classes.dex */
public class dg extends bw {
    private TextView but;
    private final int bv;
    private int cn;
    private ColorStateList ej;
    private final sf ffd;
    private int fu;
    private boolean hj;
    private final yzg ipv;
    private TextView iyl;
    private final Rect jp;
    private float jxk;
    private ColorStateList ltx;
    private ImageView mxo;
    private boolean ndl;
    private int nw;
    private final Rect pe;
    private final int pm;
    private TextView pxa;
    private float pxj;
    private TextView ra;
    private final View.OnTouchListener rgy;
    private float rig;
    private SeekBar rqm;
    private float se;
    private View tp;
    private final Rect vaf;
    private ColorStateList vhn;
    private final Rect vum;
    private TextView vw;
    private View wa;
    private TextView wad;
    private int wbn;
    private ImageView wd;
    private TextView wo;
    private ImageView wpn;
    private int xhi;
    private ImageView xxg;
    private final Rect xxs;
    private int yid;
    private float yuz;
    private View yz;

    public dg(Context context, ViewGroup viewGroup, boolean z10, int i10, rie rieVar, b bVar, boolean z11) {
        super(context, viewGroup, z10, i10, rieVar, bVar, z11);
        this.ffd = new sf(this);
        this.ndl = false;
        this.hj = false;
        this.xhi = 0;
        this.cn = 0;
        this.fu = 0;
        this.nw = 0;
        this.wbn = 0;
        this.jp = new Rect();
        this.pe = new Rect();
        this.yid = 0;
        this.rgy = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.vum = new Rect();
        this.xxs = new Rect();
        this.vaf = new Rect();
        this.db = aa.emc().getApplicationContext();
        dg(z11);
        this.xq = viewGroup;
        this.ylm = z10;
        yzg yzgVar = new yzg(this);
        this.ipv = yzgVar;
        yzgVar.emc(this.ylm);
        DisplayMetrics displayMetrics = this.db.getResources().getDisplayMetrics();
        this.bv = displayMetrics.widthPixels;
        this.pm = displayMetrics.heightPixels;
        this.hxp = i10;
        this.lt = bVar;
        this.ee = rieVar;
        dg(8);
        emc(context, this.xq);
        dg();
        sup();
    }

    private void db() {
        TextView textView = this.but;
        if (textView != null) {
            textView.setTextSize(0, this.jxk);
            ColorStateList colorStateList = this.ej;
            if (colorStateList != null) {
                this.but.setTextColor(colorStateList);
            }
            this.but.setAlpha(this.yuz);
            this.but.setShadowLayer(vw.ypw(this.db, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.rie.uym(this.db, "tt_72000000"));
            TextView textView2 = this.but;
            Rect rect = this.vum;
            vw.emc(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.wad;
        if (textView3 != null) {
            textView3.setTextSize(0, this.se);
            ColorStateList colorStateList2 = this.vhn;
            if (colorStateList2 != null) {
                this.wad.setTextColor(colorStateList2);
            }
            this.wad.setAlpha(this.pxj);
            this.wad.setShadowLayer(vw.ypw(this.db, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.rie.uym(this.db, "tt_72000000"));
            TextView textView4 = this.wad;
            Rect rect2 = this.xxs;
            vw.emc(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.wd;
        if (imageView != null) {
            Rect rect3 = this.vaf;
            vw.emc(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.wd;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this.db, "tt_enlarge_video"));
        }
        TextView textView5 = this.ra;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.ltx;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.ra.setAlpha(this.rig);
            TextView textView6 = this.ra;
            Rect rect4 = this.xxs;
            vw.emc(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.tp;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.yid;
            this.tp.setLayoutParams(layoutParams);
            this.tp.setBackground(gbl.emc(this.db, "tt_video_black_desc_gradient"));
        }
        ypw(false, true);
    }

    private void ee() {
        DisplayMetrics displayMetrics = this.db.getResources().getDisplayMetrics();
        TextView textView = this.but;
        if (textView != null) {
            this.jxk = textView.getTextSize();
            this.but.setTextSize(2, 14.0f);
            ColorStateList textColors = this.but.getTextColors();
            this.ej = textColors;
            if (textColors != null) {
                this.but.setTextColor(-1);
            }
            this.yuz = this.but.getAlpha();
            this.but.setAlpha(0.85f);
            this.but.setShadowLayer(0.0f, vw.ypw(this.db, 0.5f), vw.ypw(this.db, 0.5f), com.bytedance.sdk.component.utils.rie.uym(this.db, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.but.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.vum.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                vw.emc(this.but, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.vum.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.vum.bottom);
            }
        }
        TextView textView2 = this.wad;
        if (textView2 != null) {
            this.se = textView2.getTextSize();
            this.wad.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.wad.getTextColors();
            this.vhn = textColors2;
            if (textColors2 != null) {
                this.wad.setTextColor(-1);
            }
            this.pxj = this.wad.getAlpha();
            this.wad.setAlpha(0.85f);
            this.wad.setShadowLayer(0.0f, vw.ypw(this.db, 0.5f), vw.ypw(this.db, 0.5f), com.bytedance.sdk.component.utils.rie.uym(this.db, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.wad.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.xxs.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.wad;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.xxs;
                vw.emc(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.wd;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.vaf.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.wd;
                Rect rect2 = this.vaf;
                vw.emc(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.vaf.bottom);
            }
        }
        ImageView imageView3 = this.wd;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this.db, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.ra;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.ltx = textColors3;
            if (textColors3 != null) {
                this.ra.setTextColor(-1);
            }
            this.rig = this.ra.getAlpha();
            this.ra.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.ra.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.pe.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.ra;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.xxs;
                vw.emc(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.tp;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.yid = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.tp.setLayoutParams(layoutParams5);
            this.tp.setBackgroundResource(com.bytedance.sdk.component.utils.rie.dg(this.db, "tt_shadow_fullscreen_top"));
        }
        ypw(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void bw() {
        this.ffd.removeMessages(1);
        this.ffd.sendMessageDelayed(this.ffd.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    @SuppressLint({"ClickableViewAccessibility"})
    public void dg() {
        super.dg();
        this.ipv.emc(this.xq);
        vw.emc((View) this.mxo, (this.ylm || (this.hxp & 1) == 1) ? 8 : 0);
        this.mxo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (dg.this.vk()) {
                    dg dgVar = dg.this;
                    dgVar.sf.xq(dgVar, view);
                }
            }
        });
        vw.emc((View) this.iyl, (!this.ylm || (this.hxp & 2) == 2) ? 0 : 8);
        this.iyl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (dg.this.vk()) {
                    dg dgVar = dg.this;
                    dgVar.sf.dg(dgVar, view);
                }
            }
        });
        this.xxg.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (dg.this.vk()) {
                    dg dgVar = dg.this;
                    dgVar.sf.bw(dgVar, view);
                }
            }
        });
        this.wpn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dg.this.ypw(false, true);
                dg.this.msw();
                dg.this.uym();
                dg.this.vk();
            }
        });
        this.wd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (dg.this.vk()) {
                    dg dgVar = dg.this;
                    dgVar.sf.ypw(dgVar, view);
                }
            }
        });
        this.rqm.setThumbOffset(0);
        this.rqm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.dg.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
                if (dg.this.vk()) {
                    dg dgVar = dg.this;
                    dgVar.sf.emc(dgVar, i10, z10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!dg.this.ndl && dg.this.db != null) {
                    seekBar.setThumb(gbl.emc(aa.emc(), "tt_seek_thumb_press"));
                }
                if (dg.this.vk()) {
                    seekBar.setThumbOffset(0);
                    dg dgVar = dg.this;
                    dgVar.sf.ypw(dgVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!dg.this.ndl && dg.this.db != null) {
                    seekBar.setThumb(gbl.emc(aa.emc(), "tt_seek_thumb_normal"));
                }
                if (dg.this.vk()) {
                    seekBar.setThumbOffset(0);
                    dg dgVar = dg.this;
                    dgVar.sf.emc(dgVar, seekBar.getProgress());
                }
            }
        });
        this.rqm.setOnTouchListener(this.rgy);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw, s2.c
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void emc(Object obj, WeakReference weakReference, boolean z10) {
        emc((rie) obj, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw, com.bytedance.sdk.openadsdk.core.widget.ul.ypw
    public void gbl() {
        emc(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void msw() {
        vw.bw(this.ycc);
        vw.bw(this.yz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw, com.bytedance.sdk.openadsdk.core.widget.ul.ypw
    public boolean ru() {
        return this.ndl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void uym() {
        rie rieVar;
        vw.ycc(this.ycc);
        vw.ycc(this.uym);
        vw.bw(this.yz);
        if (this.msw != null && (rieVar = this.ee) != null && rieVar.iat() != null && this.ee.iat().r() != null) {
            vw.ycc(this.msw);
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.ee.iat().r(), this.ee.iat().B(), this.ee.iat().I(), this.msw, this.ee);
        }
        if (this.bw.getVisibility() == 0) {
            vw.emc((View) this.bw, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void xq(boolean z10) {
        TextView textView = this.vw;
        if (textView != null) {
            vw.emc((View) textView, (!this.ylm && z10) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void ycc() {
        this.ffd.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void ypw(boolean z10) {
        int i10 = ru() ? this.pm : this.f9301aa;
        int iYpw = ru() ? this.bv : this.sba;
        if (this.ul <= 0 || this.yzg <= 0 || i10 <= 0) {
            return;
        }
        if (!ylm() && !ru() && (this.hxp & 8) != 8) {
            iYpw = vw.ypw(this.db, 228.0f);
        }
        int i11 = this.yzg;
        int i12 = this.ul;
        int i13 = (int) (i12 * ((i10 * 1.0f) / i11));
        if (i13 > iYpw) {
            i10 = (int) (i11 * ((iYpw * 1.0f) / i12));
        } else {
            iYpw = i13;
        }
        if (!z10 && !ru()) {
            i10 = this.f9301aa;
            iYpw = this.sba;
        }
        this.dg.emc(i10, iYpw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void zz() {
        this.rqm.setProgress(0);
        this.rqm.setSecondaryProgress(0);
        this.wad.setText(com.bytedance.sdk.component.utils.rie.emc(this.db, "tt_00_00"));
        this.but.setText(com.bytedance.sdk.component.utils.rie.emc(this.db, "tt_00_00"));
        dg(8);
        if (hxp()) {
            this.dg.setVisibility(8);
        }
        ImageView imageView = this.msw;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        dg(8);
        vw.emc(this.wa, 8);
        vw.emc(this.ru, 8);
        vw.emc((View) this.gbl, 8);
        vw.emc(this.sup, 8);
        vw.emc((View) this.sz, 8);
        vw.emc((View) this.qh, 8);
        vw.emc((View) this.cf, 8);
        ul ulVar = this.sb;
        if (ulVar != null) {
            ulVar.emc(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(Context context, View view) {
        super.emc(context, view);
        this.iyl = (TextView) view.findViewById(vk.xou);
        this.mxo = (ImageView) view.findViewById(vk.av);
        this.tp = view.findViewById(vk.fxt);
        this.xxg = (ImageView) view.findViewById(vk.knr);
        this.vw = (TextView) view.findViewById(vk.oug);
        this.ra = (TextView) view.findViewById(vk.ya);
        this.wo = (TextView) view.findViewById(vk.xst);
        this.yz = view.findViewById(vk.igv);
        this.wpn = (ImageView) view.findViewById(vk.sx);
        TextView textView = (TextView) view.findViewById(vk.oz);
        this.pxa = textView;
        textView.setText(com.bytedance.sdk.component.utils.rie.emc(context, "tt_video_retry_des_txt"));
        this.rqm = (SeekBar) view.findViewById(vk.cwv);
        this.wad = (TextView) view.findViewById(vk.ff);
        this.but = (TextView) view.findViewById(vk.dm);
        this.wa = view.findViewById(vk.rr);
        this.wd = (ImageView) view.findViewById(vk.wq);
        this.zz = view.findViewById(vk.sg);
    }

    private void bw(boolean z10) {
        if (z10) {
            ee();
        } else {
            db();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void ypw(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.xq) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.ndl = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.xq.getLayoutParams();
        marginLayoutParams.width = this.fu;
        marginLayoutParams.height = this.nw;
        marginLayoutParams.leftMargin = this.cn;
        marginLayoutParams.topMargin = this.xhi;
        this.xq.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.wbn);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.jp;
            vw.emc(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        ypw(true);
        this.wd.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this.db, "tt_enlarge_video"));
        this.rqm.setThumb(gbl.emc(this.db, "tt_seek_thumb_normal"));
        this.rqm.setThumbOffset(0);
        a.c(this.xq, true);
        bw(this.ndl);
        vw.emc(this.tp, 8);
        if ((this.hxp & 2) == 2) {
            vw.emc((View) this.iyl, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(String str) {
        TextView textView = this.vw;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.ra;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(int i10) {
        View view = this.wa;
        if (view == null || view.getVisibility() != 0) {
            this.rqm.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(long j10, long j11) {
        this.wad.setText(a.b(j11));
        this.but.setText(a.b(j10));
        this.rqm.setProgress(a.a(j10, j11));
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw, s2.c
    public void emc() {
        emc(false, this.ylm);
        yzg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(long j10) {
        this.but.setText(a.b(j10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    @SuppressLint({"ClickableViewAccessibility"})
    public void emc(rie rieVar, WeakReference<Context> weakReference, boolean z10) {
        String strVyk;
        String strEmc;
        rie rieVar2;
        if (rieVar == null) {
            return;
        }
        emc(this.xq, aa.emc());
        emc(false, this.ylm);
        vw.emc(this.ru, 0);
        vw.emc((View) this.gbl, 0);
        vw.emc(this.sup, 0);
        if (this.gbl != null && (rieVar2 = this.ee) != null && rieVar2.iat() != null && this.ee.iat().r() != null) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.ee.iat().r(), this.ee.iat().B(), this.ee.iat().I(), this.gbl, this.ee);
        }
        if (!TextUtils.isEmpty(rieVar.hs())) {
            strVyk = rieVar.hs();
        } else if (!TextUtils.isEmpty(rieVar.xou())) {
            strVyk = rieVar.xou();
        } else if (!TextUtils.isEmpty(rieVar.vyk())) {
            strVyk = rieVar.vyk();
        } else {
            strVyk = "";
        }
        rie rieVar3 = this.ee;
        if (rieVar3 != null && rieVar3.ya() != null && this.ee.ya().emc() != null) {
            vw.emc((View) this.sz, 0);
            vw.emc((View) this.qh, 4);
            if (this.sz != null) {
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.ee.ya(), this.sz, rieVar);
                this.sz.setOnClickListener(this.cuf);
                this.sz.setOnTouchListener(this.cuf);
            }
        } else if (!TextUtils.isEmpty(strVyk)) {
            vw.emc((View) this.sz, 4);
            vw.emc((View) this.qh, 0);
            TextView textView = this.qh;
            if (textView != null) {
                textView.setText(strVyk.substring(0, 1));
                this.qh.setOnClickListener(this.cuf);
                this.qh.setOnTouchListener(this.cuf);
            }
        }
        if (this.cf != null && !TextUtils.isEmpty(strVyk)) {
            this.cf.setText(strVyk);
        }
        vw.emc((View) this.cf, 0);
        vw.emc((View) this.vk, 0);
        int iSx = rieVar.sx();
        if (iSx == 4) {
            strEmc = com.bytedance.sdk.component.utils.rie.emc(this.db, "tt_video_download_apk");
        } else if (iSx != 5) {
            strEmc = com.bytedance.sdk.component.utils.rie.emc(this.db, "tt_video_mobile_go_detail");
        } else {
            strEmc = com.bytedance.sdk.component.utils.rie.emc(this.db, "tt_video_dial_phone");
        }
        TextView textView2 = this.vk;
        if (textView2 != null) {
            textView2.setText(strEmc);
            this.vk.setOnClickListener(this.cuf);
            this.vk.setOnTouchListener(this.cuf);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public boolean ypw(int i10) {
        SeekBar seekBar = this.rqm;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.xq.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.ndl = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.xq.getLayoutParams();
            this.cn = marginLayoutParams.leftMargin;
            this.xhi = marginLayoutParams.topMargin;
            this.fu = marginLayoutParams.width;
            this.nw = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.xq.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.wbn = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.jp.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                vw.emc(viewGroup, 0, 0, 0, 0);
            }
            ypw(true);
            this.wd.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this.db, "tt_shrink_video"));
            this.rqm.setThumb(gbl.emc(this.db, "tt_seek_thumb_fullscreen_selector"));
            this.rqm.setThumbOffset(0);
            a.c(this.xq, false);
            bw(this.ndl);
            vw.emc(this.tp, 8);
            if (!this.ylm) {
                vw.emc((View) this.mxo, 8);
                vw.emc((View) this.iyl, 8);
            } else if ((this.hxp & 1) == 1) {
                vw.emc((View) this.mxo, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw, com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message.what != 1) {
            return;
        }
        gbl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(boolean z10, boolean z11, boolean z12) {
        vw.emc(this.wa, 0);
        if (this.ndl) {
            vw.emc(this.tp, 0);
            vw.emc((View) this.ra, 0);
        } else if (z12) {
            vw.emc(this.tp, 8);
        }
        vw.emc((View) this.bw, (!z10 || this.ycc.getVisibility() == 0) ? 8 : 0);
        if (!this.ylm && !this.ndl) {
            if ((this.hxp & 1) != 1 && !z12) {
                vw.emc((View) this.mxo, 0);
            }
            vw.emc((View) this.iyl, z12 ? 8 : 0);
        }
        vw.emc((View) this.wad, 0);
        vw.emc((View) this.but, 0);
        vw.emc((View) this.rqm, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw
    public void emc(boolean z10, boolean z11) {
        vw.emc(this.wa, 8);
        vw.emc(this.tp, 8);
        vw.emc((View) this.bw, 8);
        if (!this.ylm && !this.ndl) {
            vw.emc((View) this.mxo, 8);
            if ((this.hxp & 2) != 2) {
                vw.emc((View) this.iyl, 8);
            }
        } else if ((this.hxp & 1) == 1) {
            vw.emc((View) this.mxo, 8);
        }
        if (z11) {
            vw.emc((View) this.mxo, 8);
            vw.emc((View) this.iyl, 8);
        }
        xq(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.bw, com.bytedance.sdk.openadsdk.core.widget.yzg.emc
    public void emc(View view, boolean z10) {
        if (ru()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            rie rieVar = this.ee;
            if (rieVar != null && !TextUtils.isEmpty(rieVar.xou())) {
                emc(this.ee.xou());
            }
            this.wo.setText(str);
        } else {
            emc("");
            this.wo.setText("");
        }
        if (this.dr) {
            return;
        }
        xq(this.ylm && !this.ndl);
        if (vk()) {
            this.sf.emc(this, view, true, this.ycc.getVisibility() != 0);
        }
    }
}
