package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class r extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f7412a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f7413b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f7414c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f7415d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f7412a = viewGroup;
        this.f7413b = size;
        this.f7414c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f7415d.removeView(this.f7412a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f7414c, this.f7413b.getWidth()), AppLovinSdkUtils.dpToPx(this.f7414c, this.f7413b.getHeight()));
        layoutParams.addRule(13);
        this.f7412a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f7414c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f7414c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f7414c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.yd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8723a.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f7414c);
        this.f7415d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7415d.setBackgroundColor(Integer.MIN_VALUE);
        this.f7415d.addView(imageButton);
        this.f7415d.addView(this.f7412a);
        this.f7415d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.zd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8819a.b(view);
            }
        });
        setContentView(this.f7415d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
