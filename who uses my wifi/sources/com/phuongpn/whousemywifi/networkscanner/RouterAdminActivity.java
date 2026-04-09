package com.phuongpn.whousemywifi.networkscanner;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import defpackage.a3;
import defpackage.a30;
import defpackage.b3;
import defpackage.cr0;
import defpackage.er0;
import defpackage.fr0;
import defpackage.g30;
import defpackage.i30;
import defpackage.i5;
import defpackage.ia0;
import defpackage.k52;
import defpackage.mc2;
import defpackage.p21;
import defpackage.qw;
import defpackage.sy0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class RouterAdminActivity extends i5 {
    public static final /* synthetic */ int F = 0;
    public mc2 C;
    public k52 D;
    public boolean E;

    public static void y(View view) {
        try {
            Object systemService = view.getContext().getSystemService("input_method");
            i30.k(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.i5, defpackage.ch, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_router_admin, (ViewGroup) null, false);
        int i = R.id.loadingLayout;
        RelativeLayout relativeLayout = (RelativeLayout) a30.e(viewInflate, R.id.loadingLayout);
        if (relativeLayout != null) {
            i = R.id.routerAdminRotateLoading;
            if (((ProgressBar) a30.e(viewInflate, R.id.routerAdminRotateLoading)) != null) {
                i = R.id.toolbar_layout;
                View viewE = a30.e(viewInflate, R.id.toolbar_layout);
                if (viewE != null) {
                    p21 p21VarH = p21.h(viewE);
                    i = R.id.tvRouterAdminStatus;
                    TextView textView = (TextView) a30.e(viewInflate, R.id.tvRouterAdminStatus);
                    if (textView != null) {
                        i = R.id.wvRouterAdmin;
                        WebView webView = (WebView) a30.e(viewInflate, R.id.wvRouterAdmin);
                        if (webView != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                            this.C = new mc2(coordinatorLayout, relativeLayout, p21VarH, textView, webView);
                            i30.l(coordinatorLayout, "getRoot(...)");
                            setContentView(coordinatorLayout);
                            Object systemService = getApplicationContext().getSystemService("connectivity");
                            i30.k(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                mc2 mc2Var = this.C;
                                if (mc2Var == null) {
                                    i30.S("binding");
                                    throw null;
                                }
                                ((WebView) mc2Var.j).setVisibility(8);
                                mc2 mc2Var2 = this.C;
                                if (mc2Var2 == null) {
                                    i30.S("binding");
                                    throw null;
                                }
                                ((TextView) mc2Var2.i).setText("ERR_INTERNET_DISCONNECTED");
                            } else {
                                mc2 mc2Var3 = this.C;
                                if (mc2Var3 == null) {
                                    i30.S("binding");
                                    throw null;
                                }
                                WebSettings settings = ((WebView) mc2Var3.j).getSettings();
                                settings.setJavaScriptEnabled(true);
                                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                                settings.setSupportZoom(true);
                                settings.setBuiltInZoomControls(true);
                                settings.setDisplayZoomControls(false);
                                settings.setUseWideViewPort(true);
                                settings.setLoadWithOverviewMode(true);
                                settings.setSaveFormData(true);
                                settings.setUserAgentString("Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1");
                                mc2 mc2Var4 = this.C;
                                if (mc2Var4 == null) {
                                    i30.S("binding");
                                    throw null;
                                }
                                ((WebView) mc2Var4.j).setWebViewClient(new er0(0, this));
                                String strX = x();
                                if (!sy0.y(strX, "http://", false) && !sy0.y(strX, "https://", false)) {
                                    strX = "http://".concat(strX);
                                }
                                mc2 mc2Var5 = this.C;
                                if (mc2Var5 == null) {
                                    i30.S("binding");
                                    throw null;
                                }
                                ((WebView) mc2Var5.j).loadUrl(strX);
                            }
                            g30.a(this, getString(R.string.ads_interstitial), new b3(new a3(1)), new fr0(this, 0));
                            mc2 mc2Var6 = this.C;
                            if (mc2Var6 == null) {
                                i30.S("binding");
                                throw null;
                            }
                            final p21 p21Var = (p21) mc2Var6.h;
                            MaterialButton materialButton = (MaterialButton) p21Var.g;
                            MaterialButton materialButton2 = (MaterialButton) p21Var.f;
                            TextInputEditText textInputEditText = (TextInputEditText) p21Var.i;
                            materialButton.setVisibility(0);
                            final int i2 = 0;
                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ar0
                                public final /* synthetic */ RouterAdminActivity g;

                                {
                                    this.g = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i3 = i2;
                                    RouterAdminActivity routerAdminActivity = this.g;
                                    switch (i3) {
                                        case 0:
                                            int i4 = RouterAdminActivity.F;
                                            routerAdminActivity.onBackPressed();
                                            break;
                                        case 1:
                                            routerAdminActivity.E = true;
                                            routerAdminActivity.i().c();
                                            break;
                                        default:
                                            int i5 = RouterAdminActivity.F;
                                            routerAdminActivity.i().c();
                                            break;
                                    }
                                }
                            });
                            String stringExtra = getIntent().getStringExtra("ping_ip_arg");
                            if (stringExtra == null || stringExtra.length() == 0) {
                                textInputEditText.setText(x());
                            } else {
                                textInputEditText.setText(stringExtra);
                            }
                            textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: br0
                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i3, KeyEvent keyEvent) {
                                    int i4 = RouterAdminActivity.F;
                                    if (i3 != 6) {
                                        return false;
                                    }
                                    ((MaterialButton) p21Var.h).callOnClick();
                                    return true;
                                }
                            });
                            textInputEditText.setOnFocusChangeListener(new cr0());
                            ((MaterialButton) p21Var.h).setOnClickListener(new ia0(p21Var, this, 3));
                            final int i3 = 1;
                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: ar0
                                public final /* synthetic */ RouterAdminActivity g;

                                {
                                    this.g = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i32 = i3;
                                    RouterAdminActivity routerAdminActivity = this.g;
                                    switch (i32) {
                                        case 0:
                                            int i4 = RouterAdminActivity.F;
                                            routerAdminActivity.onBackPressed();
                                            break;
                                        case 1:
                                            routerAdminActivity.E = true;
                                            routerAdminActivity.i().c();
                                            break;
                                        default:
                                            int i5 = RouterAdminActivity.F;
                                            routerAdminActivity.i().c();
                                            break;
                                    }
                                }
                            });
                            final int i4 = 2;
                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ar0
                                public final /* synthetic */ RouterAdminActivity g;

                                {
                                    this.g = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i32 = i4;
                                    RouterAdminActivity routerAdminActivity = this.g;
                                    switch (i32) {
                                        case 0:
                                            int i42 = RouterAdminActivity.F;
                                            routerAdminActivity.onBackPressed();
                                            break;
                                        case 1:
                                            routerAdminActivity.E = true;
                                            routerAdminActivity.i().c();
                                            break;
                                        default:
                                            int i5 = RouterAdminActivity.F;
                                            routerAdminActivity.i().c();
                                            break;
                                    }
                                }
                            });
                            i().a(this, new qw(this, 1));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final String x() {
        Object systemService = getApplicationContext().getSystemService("wifi");
        i30.k(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        String ipAddress = Formatter.formatIpAddress(((WifiManager) systemService).getDhcpInfo().gateway);
        i30.l(ipAddress, "formatIpAddress(...)");
        return ipAddress;
    }
}
