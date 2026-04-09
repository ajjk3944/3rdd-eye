package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class SegmentsProgressBar extends ComponentLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f13878a;

    /* renamed from: b, reason: collision with root package name */
    private int f13879b;

    /* renamed from: c, reason: collision with root package name */
    private int f13880c;

    /* renamed from: d, reason: collision with root package name */
    private int f13881d;

    /* renamed from: e, reason: collision with root package name */
    private int f13882e;

    /* renamed from: f, reason: collision with root package name */
    private int f13883f;

    /* renamed from: g, reason: collision with root package name */
    private int f13884g;

    /* renamed from: h, reason: collision with root package name */
    private int f13885h;

    /* renamed from: i, reason: collision with root package name */
    private final List<ProgressBar> f13886i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f13887j;

    /* renamed from: k, reason: collision with root package name */
    private String f13888k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13889l;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public SegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13878a = "MBridgeSegmentsProgressBar";
        this.f13880c = 1;
        this.f13881d = 20;
        this.f13882e = 10;
        this.f13883f = 1;
        this.f13884g = -1711276033;
        this.f13885h = -1;
        this.f13886i = new ArrayList();
        this.f13889l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f13889l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        int i10 = this.f13880c;
        if (i10 == 1) {
            setOrientation(1);
            if (TextUtils.isEmpty(this.f13888k)) {
                this.f13888k = this.f13889l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
            }
        } else if (i10 == 2) {
            setOrientation(0);
            if (TextUtils.isEmpty(this.f13888k)) {
                this.f13888k = this.f13889l ? "广告 %s/%s" : "ADS %s/%s";
            }
        }
        this.f13886i.clear();
        removeAllViews();
        setBackground(getBackgroundDrawable());
        TextView textView = new TextView(getContext());
        this.f13887j = textView;
        textView.setTextColor(-1);
        this.f13887j.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f13887j.setLayoutParams(layoutParams);
        int i11 = this.f13880c;
        if (i11 == 1) {
            layoutParams.gravity = 5;
            TextView textView2 = this.f13887j;
            int i12 = this.f13881d / 2;
            textView2.setPadding(i12, 15, i12, 5);
        } else if (i11 == 2) {
            this.f13887j.setGravity(16);
            TextView textView3 = this.f13887j;
            int i13 = this.f13881d / 2;
            textView3.setPadding(i13, 0, i13, 0);
        }
        try {
            int iA = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f13887j.setCompoundDrawables(drawable, null, null, null);
                this.f13887j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i14 = 0; i14 < this.f13879b; i14++) {
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(getSegmentLayerDrawable());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            int i15 = this.f13881d / 2;
            layoutParams3.leftMargin = i15;
            layoutParams3.rightMargin = i15;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.f13886i.add(progressBar);
        }
        int i16 = this.f13880c;
        if (i16 == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.f13887j);
            addView(linearLayout);
        } else {
            if (i16 != 2) {
                addView(linearLayout);
                return;
            }
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.f13887j);
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f13882e);
        gradientDrawable.setColor(this.f13884g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f13882e);
        gradientDrawable2.setColor(this.f13885h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new a());
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f13879b = i10;
        this.f13880c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f13888k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f13886i.isEmpty()) {
                return;
            }
            if (i11 < this.f13886i.size()) {
                this.f13886i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f13883f) {
                this.f13883f = i12;
                TextView textView = this.f13887j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            this.f13879b = Integer.parseInt(String.valueOf(map.get("count")));
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
            this.f13879b = 1;
        }
        try {
            this.f13880c = Integer.parseInt(String.valueOf(map.get(TtmlNode.TAG_STYLE)));
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            this.f13880c = 0;
        }
        init(this.f13879b, this.f13880c);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        setProgress(str.contains("percent") ? Integer.parseInt(obj.toString()) : 0, str.contains("Index") ? Integer.parseInt(obj.toString()) : 0);
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f13879b = i10;
        this.f13880c = i11;
        this.f13885h = i12;
        this.f13884g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f13879b = i10;
        this.f13880c = i11;
        this.f13885h = i12;
        this.f13884g = i13;
        this.f13881d = i14;
        this.f13882e = i15;
        a();
    }

    private StringBuilder a(int i10) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f13888k, Integer.valueOf(i10), Integer.valueOf(this.f13879b)));
            return sb;
        } catch (Throwable th) {
            sb.append(this.f13879b);
            sb.append("videos, the");
            sb.append(i10);
            sb.append(" is playing.");
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
            return sb;
        }
    }
}
