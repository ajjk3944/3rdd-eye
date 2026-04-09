package com.liuzh.deviceinfo.splash;

import ag.c;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import hg.a;
import nk.k;
import pd.b;
import rh.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class SplashLoadingActivity extends a {
    public static final /* synthetic */ int C = 0;
    public final Handler B = new Handler(Looper.getMainLooper());

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!c.f364f.a(this, false)) {
            finish();
            return;
        }
        a4.a.C(this);
        setContentView(R.layout.activity_splash);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        k.b(progressBar);
        progressBar.setVisibility(0);
        progressBar.setAlpha(1.0f);
        TextView textView = (TextView) findViewById(R.id.loading_txt);
        k.b(textView);
        textView.setVisibility(0);
        textView.setText(R.string.welcome_back);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = b.j(8);
        textView.setLayoutParams(marginLayoutParams);
        this.B.postDelayed(new f(this, 0), 800L);
    }
}
