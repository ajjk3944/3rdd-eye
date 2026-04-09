package com.bytedance.sdk.openadsdk.common;

import M3.h;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ul extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    private boolean dg;
    private Context emc;
    private emc xq;
    private LinearLayout ypw;

    public interface emc {
        void dg();

        void emc();

        void xq();

        void ypw();
    }

    public ul(Context context, boolean z6) {
        super(context);
        this.emc = context;
        this.dg = z6;
        ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bw(View view) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dg(View view) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.ypw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean emc(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            this.ypw.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                emc();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xq(View view) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.xq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ycc(View view) {
        emc();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ypw() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new h(1, this));
        LinearLayout linearLayout = new LinearLayout(this.emc);
        this.ypw = linearLayout;
        linearLayout.setOrientation(1);
        this.ypw.setGravity(80);
        this.ypw.setPadding(emc(16.0f), 0, emc(16.0f), emc(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(emc(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.ypw.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = emc(16.0f);
        this.ypw.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(this.emc);
        xqVar.setPadding(emc(6.0f), 0, emc(6.0f), 0);
        xqVar.setLayoutParams(new LinearLayout.LayoutParams(-1, emc(44.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(this.emc);
        Context context = this.emc;
        mswVar.setText(context.getString(rie.ypw(context, "tt_more_title")));
        mswVar.setTextColor(Color.parseColor("#000000"));
        mswVar.setTextSize(2, 17.0f);
        mswVar.setGravity(17);
        mswVar.setTypeface(Typeface.defaultFromStyle(1));
        xqVar.addView(mswVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.emc);
        imageView.setImageResource(rie.dg(this.emc, "tt_titlebar_close_drawable"));
        imageView.setPadding(emc(10.0f), emc(10.0f), emc(10.0f), emc(10.0f));
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ul f6831b;

            {
                this.f6831b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f6831b.ycc(view);
                        break;
                    case 1:
                        this.f6831b.bw(view);
                        break;
                    case 2:
                        this.f6831b.dg(view);
                        break;
                    case 3:
                        this.f6831b.xq(view);
                        break;
                    default:
                        this.f6831b.ypw(view);
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(emc(44.0f), emc(44.0f));
        layoutParams2.gravity = 8388629;
        xqVar.addView(imageView, layoutParams2);
        this.ypw.addView(xqVar);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc = emc(8);
        Context context2 = this.emc;
        final int i3 = 1;
        emc(bwVarEmc, context2.getString(rie.ypw(context2, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ul f6831b;

            {
                this.f6831b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f6831b.ycc(view);
                        break;
                    case 1:
                        this.f6831b.bw(view);
                        break;
                    case 2:
                        this.f6831b.dg(view);
                        break;
                    case 3:
                        this.f6831b.xq(view);
                        break;
                    default:
                        this.f6831b.ypw(view);
                        break;
                }
            }
        });
        Context context3 = this.emc;
        final int i6 = 2;
        emc(bwVarEmc, context3.getString(rie.ypw(context3, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ul f6831b;

            {
                this.f6831b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f6831b.ycc(view);
                        break;
                    case 1:
                        this.f6831b.bw(view);
                        break;
                    case 2:
                        this.f6831b.dg(view);
                        break;
                    case 3:
                        this.f6831b.xq(view);
                        break;
                    default:
                        this.f6831b.ypw(view);
                        break;
                }
            }
        });
        Context context4 = this.emc;
        final int i7 = 3;
        emc(bwVarEmc, context4.getString(rie.ypw(context4, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ul f6831b;

            {
                this.f6831b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f6831b.ycc(view);
                        break;
                    case 1:
                        this.f6831b.bw(view);
                        break;
                    case 2:
                        this.f6831b.dg(view);
                        break;
                    case 3:
                        this.f6831b.xq(view);
                        break;
                    default:
                        this.f6831b.ypw(view);
                        break;
                }
            }
        });
        this.ypw.addView(bwVarEmc);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc2 = emc(8);
        Context context5 = this.emc;
        final int i8 = 4;
        emc(bwVarEmc2, context5.getString(rie.ypw(context5, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ul f6831b;

            {
                this.f6831b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        this.f6831b.ycc(view);
                        break;
                    case 1:
                        this.f6831b.bw(view);
                        break;
                    case 2:
                        this.f6831b.dg(view);
                        break;
                    case 3:
                        this.f6831b.xq(view);
                        break;
                    default:
                        this.f6831b.ypw(view);
                        break;
                }
            }
        });
        this.ypw.addView(bwVarEmc2);
        addView(this.ypw);
    }

    public void setOnMenuItemClickListener(emc emcVar) {
        this.xq = emcVar;
    }

    private void emc(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(this.emc);
        bwVar2.setOrientation(0);
        bwVar2.setGravity(16);
        bwVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.emc);
        imageView.setImageResource(rie.dg(this.emc, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(emc(20.0f), emc(20.0f));
        layoutParams.setMargins(emc(16.0f), emc(0.0f), emc(16.0f), emc(0.0f));
        bwVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(this.emc);
        mswVar.setText(str);
        mswVar.setTextColor(Color.parseColor("#000000"));
        mswVar.setTextSize(2, 16.0f);
        mswVar.setGravity(8388627);
        mswVar.setTypeface(Typeface.defaultFromStyle(0));
        bwVar2.addView(mswVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, emc(52.0f));
        if (bwVar.getChildCount() > 0) {
            View view = new View(this.emc);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            bwVar.addView(view, new LinearLayout.LayoutParams(-1, emc(1.0f)));
        }
        bwVar.addView(bwVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.ycc.bw emc(int i) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(this.emc);
        bwVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(emc(i));
        gradientDrawable.setColor(-1);
        bwVar.setBackgroundDrawable(gradientDrawable);
        bwVar.setPadding(emc(8.0f), emc(8.0f), emc(8.0f), emc(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = emc(8.0f);
        bwVar.setLayoutParams(layoutParams);
        return bwVar;
    }

    public void emc(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (getParent() == null) {
            ((ViewGroup) viewFindViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ypw(View view) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.dg();
        }
    }

    public void emc() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    private int emc(float f2) {
        return vw.ypw(this.emc, f2);
    }
}
