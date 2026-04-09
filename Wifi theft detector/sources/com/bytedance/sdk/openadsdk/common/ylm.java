package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.aa;
import com.bytedance.sdk.openadsdk.common.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ylm {

    /* renamed from: aa, reason: collision with root package name */
    private ycc.emc f9271aa;
    ul bw;
    private boolean cf;
    aa emc;
    private ImageView gbl;
    private com.bytedance.sdk.openadsdk.core.ycc.bw hxp;
    private final Context msw;
    private TextView rie;
    private com.bytedance.sdk.openadsdk.core.ycc.ycc ru;
    private final String sba;
    private TextView sra;
    private ImageView sup;
    private ImageView sz;
    private View ul;
    private final rie uym;
    private final com.bytedance.sdk.component.zz.ycc vk;
    private final RelativeLayout ycc;
    TTAdDislikeToast ypw;
    private boolean yzg;
    private ImageView zz;
    final AtomicBoolean xq = new AtomicBoolean(false);
    final AtomicBoolean dg = new AtomicBoolean(false);
    private boolean ylm = false;
    private final int qh = vw.ypw(com.bytedance.sdk.openadsdk.core.aa.emc(), 44.0f);

    public ylm(Context context, RelativeLayout relativeLayout, rie rieVar, com.bytedance.sdk.component.zz.ycc yccVar, String str, boolean z10) {
        this.msw = context;
        this.ycc = relativeLayout;
        this.uym = rieVar;
        this.vk = yccVar;
        this.sba = str;
        this.yzg = z10;
        this.bw = new ul(context, this.yzg);
        uym();
        msw();
    }

    private boolean gbl() {
        return this.msw.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void msw() {
        View view = this.ul;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9270a.emc(view2);
            }
        });
    }

    private void ru() {
        this.ypw.show(TTAdDislikeToast.getDislikeTip());
    }

    @SuppressLint({"SetTextI18n"})
    private void uym() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ycc.getLayoutParams();
        layoutParams.height = this.qh;
        this.ycc.setLayoutParams(layoutParams);
        int iYpw = vw.ypw(this.msw, 8.0f);
        this.ycc.setPadding(iYpw, 0, iYpw, 0);
        this.zz = (ImageView) this.ycc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ltx);
        this.gbl = (ImageView) this.ycc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.pm);
        this.sup = (ImageView) this.ycc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ipv);
        this.sz = (ImageView) this.ycc.findViewById(520093740);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = (com.bytedance.sdk.openadsdk.core.ycc.bw) this.ycc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.rig);
        this.hxp = bwVar;
        this.sra = (TextView) bwVar.findViewById(com.bytedance.sdk.openadsdk.utils.vk.emc);
        this.rie = (TextView) this.hxp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ypw);
        if (gbl()) {
            this.sra.setTextDirection(4);
            this.rie.setTextDirection(4);
            this.sra.setGravity(8388629);
            this.rie.setGravity(8388629);
            this.gbl.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.msw, "tt_titlebar_forward"));
            this.sup.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.msw, "tt_titlebar_backward"));
        }
        this.ru = (com.bytedance.sdk.openadsdk.core.ycc.ycc) this.ycc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.wbn);
        this.sup.setVisibility(0);
        this.gbl.setVisibility(0);
        this.zz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ylm.this.vk != null) {
                    ylm.this.vk.uym();
                    ylm.this.vk.removeAllViews();
                    ViewGroup viewGroup = (ViewGroup) ylm.this.vk.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(ylm.this.vk);
                    }
                    ylm.this.vk.vk();
                }
                if (ylm.this.msw instanceof Activity) {
                    ((Activity) ylm.this.msw).finish();
                }
            }
        });
        this.gbl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ylm.this.vk == null || !ylm.this.vk.zz()) {
                    return;
                }
                if (ylm.this.f9271aa != null) {
                    ylm.this.f9271aa.emc();
                }
                ylm.this.vk.ru();
            }
        });
        this.sup.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ylm.this.vk == null || !ylm.this.vk.gbl()) {
                    return;
                }
                ylm.this.vk.sup();
            }
        });
        this.sz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ylm ylmVar = ylm.this;
                ylmVar.emc(ylmVar.bw, view);
            }
        });
        emc(true);
        this.gbl.setClickable(false);
        this.sup.setClickable(false);
        ImageView imageView = this.gbl;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(color, mode);
        this.sup.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.ul = this.ycc;
    }

    private void zz() {
        try {
            if (this.emc == null) {
                aa aaVar = new aa(this.msw, this.uym);
                this.emc = aaVar;
                aaVar.setDislikeSource("landing_page");
                this.emc.setCallback(new aa.emc() { // from class: com.bytedance.sdk.openadsdk.common.ylm.2
                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void emc(View view) {
                        ylm.this.xq.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void ypw(View view) {
                        ylm.this.xq.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void emc(FilterWord filterWord) {
                        if (ylm.this.dg.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        ylm.this.dg.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.ycc.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.emc);
            if (this.ypw == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.msw);
                this.ypw = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    public TextView bw() {
        return this.rie;
    }

    public TextView dg() {
        return this.sra;
    }

    public ImageView xq() {
        return this.zz;
    }

    public void ycc() {
        if (this.dg.get()) {
            ru();
            return;
        }
        if (this.emc == null) {
            zz();
        }
        aa aaVar = this.emc;
        if (aaVar != null) {
            aaVar.emc();
        }
    }

    private boolean dg(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c10 : str.toCharArray()) {
            if (Character.getDirectionality(c10) == 1 || Character.getDirectionality(c10) == 2) {
                return true;
            }
        }
        return false;
    }

    public String xq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void ypw() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ycc.getLayoutParams();
            if (this.cf) {
                return;
            }
            int i10 = layoutParams.height;
            int i11 = this.qh;
            if (i10 == i11) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11, i11 / 2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ylm.this.ycc.setLayoutParams(layoutParams);
                        ylm.this.ycc.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.10
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ylm.this.cf = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ylm.this.cf = true;
                        ylm.this.emc(8);
                        ylm.this.emc(false);
                        ylm.this.ylm = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void emc(View view) {
        if (this.ylm) {
            emc();
            this.ylm = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final ul ulVar, View view) {
        ulVar.setOnMenuItemClickListener(new ul.emc() { // from class: com.bytedance.sdk.openadsdk.common.ylm.6
            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void dg() {
                if (!ylm.this.yzg) {
                    ylm.this.ycc();
                }
                ulVar.emc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void emc() {
                if (ylm.this.vk != null) {
                    ylm.this.vk.msw();
                    if (ylm.this.ru != null) {
                        ylm.this.ru.setVisibility(0);
                        ylm.this.ru.setProgress(0);
                    }
                    ulVar.emc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void xq() {
                if (ylm.this.vk != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = ylm.this.vk.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.ypw.emc(ylm.this.msw, intent, null);
                    }
                    ulVar.emc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void ypw() {
                ClipboardManager clipboardManager;
                if (ylm.this.vk != null) {
                    String url = ylm.this.vk.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) ylm.this.msw.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                ulVar.emc();
            }
        });
        ulVar.emc(view);
    }

    @SuppressLint({"SetTextI18n"})
    public void emc(boolean z10) {
        if (this.sra == null || this.rie == null) {
            return;
        }
        String string = dg().getText().toString();
        String strReplaceAll = TextUtils.isEmpty(string) ? " " : string.replaceAll("[\n\r]+", " ");
        String string2 = bw().getText().toString();
        this.sra.setText(strReplaceAll);
        this.rie.setText(string2);
        if (z10) {
            this.sra.setVisibility(0);
            com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = this.hxp;
            if (bwVar != null) {
                ViewGroup.LayoutParams layoutParams = bwVar.getLayoutParams();
                layoutParams.width = -2;
                this.hxp.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ycc.getLayoutParams();
            layoutParams2.height = this.qh;
            this.ycc.setLayoutParams(layoutParams2);
            return;
        }
        this.sra.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = this.hxp;
        if (bwVar2 != null) {
            ViewGroup.LayoutParams layoutParams3 = bwVar2.getLayoutParams();
            layoutParams3.width = -1;
            this.hxp.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.ycc.getLayoutParams();
        layoutParams4.height = this.qh / 2;
        this.ycc.setLayoutParams(layoutParams4);
    }

    public void ypw(String str) {
        String strXq = xq(str);
        TextView textView = this.rie;
        if (!TextUtils.isEmpty(strXq)) {
            str = strXq;
        }
        textView.setText(str);
    }

    public void emc() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ycc.getLayoutParams();
            if (this.cf) {
                return;
            }
            int i10 = layoutParams.height;
            int i11 = this.qh;
            if (i10 == i11 / 2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11 / 2, i11);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ylm.this.ycc.setLayoutParams(layoutParams);
                        ylm.this.ycc.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.ylm.8
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    @SuppressLint({"SetTextI18n"})
                    public void onAnimationEnd(@NonNull Animator animator) {
                        ylm.this.cf = false;
                        ylm.this.emc(0);
                        ylm.this.emc(true);
                        ylm.this.ylm = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NonNull Animator animator) {
                        ylm.this.cf = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void emc(String str) {
        this.sra.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i10) {
        ImageView imageView = this.zz;
        if (imageView != null) {
            imageView.setVisibility(i10);
        }
        ImageView imageView2 = this.gbl;
        if (imageView2 != null) {
            imageView2.setVisibility(i10);
        }
        ImageView imageView3 = this.sup;
        if (imageView3 != null) {
            imageView3.setVisibility(i10);
        }
        ImageView imageView4 = this.sz;
        if (imageView4 != null) {
            imageView4.setVisibility(i10);
        }
    }

    public void emc(WebView webView, ycc.emc emcVar) {
        this.f9271aa = emcVar;
        try {
            if (this.gbl != null) {
                if (webView.canGoBack()) {
                    this.gbl.setClickable(true);
                    this.gbl.clearColorFilter();
                } else {
                    this.gbl.setClickable(false);
                    this.gbl.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.sup != null) {
                if (webView.canGoForward()) {
                    this.sup.setClickable(true);
                    this.sup.clearColorFilter();
                } else {
                    this.sup.setClickable(false);
                    this.sup.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
