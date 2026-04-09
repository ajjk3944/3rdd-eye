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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class r extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f5179a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f5180b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f5181c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f5182d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f5179a = viewGroup;
        this.f5180b = size;
        this.f5181c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f5182d.removeView(this.f5179a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f5181c, this.f5180b.getWidth()), AppLovinSdkUtils.dpToPx(this.f5181c, this.f5180b.getHeight()));
        layoutParams.addRule(13);
        this.f5179a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f5181c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f5181c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f5181c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i4 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.ca

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f3841b;

            {
                this.f3841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f3841b.a(view);
                        break;
                    default:
                        this.f3841b.b(view);
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f5181c);
        this.f5182d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f5182d.setBackgroundColor(LinearLayoutManager.INVALID_OFFSET);
        this.f5182d.addView(imageButton);
        this.f5182d.addView(this.f5179a);
        final int i10 = 1;
        this.f5182d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.ca

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f3841b;

            {
                this.f3841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f3841b.a(view);
                        break;
                    default:
                        this.f3841b.b(view);
                        break;
                }
            }
        });
        setContentView(this.f5182d);
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
