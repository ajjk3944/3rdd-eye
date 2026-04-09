package com.liuzh.deviceinfo.common;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.ru0;
import d.m;
import e4.m0;
import e4.v0;
import hg.a;
import java.util.WeakHashMap;
import lf.e;
import qg.c;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class WebViewActivity extends a {
    public static final /* synthetic */ int C = 0;
    public c B;

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        if (this.B.f32331d.canGoBack()) {
            this.B.f32331d.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        m.a(this);
        String stringExtra2 = getIntent().getStringExtra("title");
        if (!TextUtils.isEmpty(stringExtra2)) {
            setTitle(stringExtra2);
        }
        try {
            c cVarA = c.a(getLayoutInflater());
            this.B = cVarA;
            z(cVarA.f32330c);
            i.e(this.B.f32330c);
            A();
            setContentView(this.B.f32328a);
            WebSettings settings = this.B.f32331d.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            this.B.f32331d.setWebViewClient(new ru0(1, this));
            this.B.f32331d.loadUrl(stringExtra);
            FrameLayout frameLayout = this.B.f32328a;
            e eVar = new e(4, this);
            WeakHashMap weakHashMap = v0.f22405a;
            m0.j(frameLayout, eVar);
        } catch (Exception unused) {
            finish();
        }
    }
}
