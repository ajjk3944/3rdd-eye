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
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC2140q extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f20728a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f20729b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f20730c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f20731d;

    public DialogC2140q(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f20728a = viewGroup;
        this.f20729b = size;
        this.f20730c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f20731d.removeView(this.f20728a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f20730c, this.f20729b.getWidth()), AppLovinSdkUtils.dpToPx(this.f20730c, this.f20729b.getHeight()));
        layoutParams.addRule(13);
        this.f20728a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f20730c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f20730c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f20730c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new F8.c(this, 5));
        RelativeLayout relativeLayout = new RelativeLayout(this.f20730c);
        this.f20731d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f20731d.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
        this.f20731d.addView(imageButton);
        this.f20731d.addView(this.f20728a);
        this.f20731d.setOnClickListener(new D8.e(this, 4));
        setContentView(this.f20731d);
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
