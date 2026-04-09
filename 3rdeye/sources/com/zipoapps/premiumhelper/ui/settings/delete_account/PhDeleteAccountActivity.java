package com.zipoapps.premiumhelper.ui.settings.delete_account;

import C8.c;
import J8.C0690e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import c.C2012j;
import e.AbstractC4292c;
import f.AbstractC4328a;
import kotlin.jvm.internal.l;

/* compiled from: PhDeleteAccountActivity.kt */
/* loaded from: classes3.dex */
public final class PhDeleteAccountActivity extends AppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37155f = 0;

    /* renamed from: c, reason: collision with root package name */
    public WebView f37156c;

    /* renamed from: d, reason: collision with root package name */
    public C8.b f37157d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f37158e = new Handler(Looper.getMainLooper());

    /* compiled from: PhDeleteAccountActivity.kt */
    public static final class a extends AbstractC4328a<String, Integer> {
        @Override // f.AbstractC4328a
        public final Intent a(Context context, String str) {
            String url = str;
            l.f(url, "url");
            Intent intent = new Intent(context, (Class<?>) PhDeleteAccountActivity.class);
            intent.putExtra("DELETE_ACCOUNT_URL", url);
            return intent;
        }

        @Override // f.AbstractC4328a
        public final Integer c(int i, Intent intent) {
            return Integer.valueOf(i);
        }
    }

    /* compiled from: PhDeleteAccountActivity.kt */
    public static final class b extends AbstractC4292c<String> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC4292c<String> f37159a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC4328a<String, ?> f37160b;

        public b(AbstractC4292c<String> abstractC4292c) {
            this.f37159a = abstractC4292c;
            this.f37160b = abstractC4292c.a();
        }

        @Override // e.AbstractC4292c
        public final AbstractC4328a<String, ?> a() {
            return this.f37160b;
        }

        @Override // e.AbstractC4292c
        public final void b(String str) {
            String deleteAccountUrl = str;
            l.f(deleteAccountUrl, "deleteAccountUrl");
            c(deleteAccountUrl);
        }

        @Override // e.AbstractC4292c
        public final void c(Object obj) {
            String deleteAccountUrl = (String) obj;
            l.f(deleteAccountUrl, "deleteAccountUrl");
            this.f37159a.c(deleteAccountUrl);
        }

        @Override // e.AbstractC4292c
        public final void d() {
            this.f37159a.d();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C2012j.a(this, null, 3);
        super.onCreate(bundle);
        this.f37157d = new C8.b(this);
        WebView webView = new WebView(this);
        this.f37156c = webView;
        C8.b bVar = this.f37157d;
        if (bVar == null) {
            l.l("webClient");
            throw null;
        }
        webView.setWebViewClient(bVar);
        WebView webView2 = this.f37156c;
        if (webView2 == null) {
            l.l("webView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.f37156c;
        if (webView3 == null) {
            l.l("webView");
            throw null;
        }
        setContentView(webView3);
        C0690e.a(this, null, 3);
        getOnBackPressedDispatcher().a(this, new c(this));
        String stringExtra = getIntent().getStringExtra("DELETE_ACCOUNT_URL");
        if (stringExtra == null) {
            finish();
            return;
        }
        WebView webView4 = this.f37156c;
        if (webView4 != null) {
            webView4.loadUrl(stringExtra);
        } else {
            l.l("webView");
            throw null;
        }
    }
}
