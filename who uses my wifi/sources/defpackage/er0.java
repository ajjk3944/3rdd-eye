package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class er0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ er0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 1:
                u82 u82Var = (u82) this.b;
                int i = u82.i;
                if (str != null && str.startsWith("consent://")) {
                    u82Var.g.e(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                RouterAdminActivity routerAdminActivity = (RouterAdminActivity) this.b;
                routerAdminActivity.runOnUiThread(new r5(routerAdminActivity, str, 6));
                try {
                    mc2 mc2Var = routerAdminActivity.C;
                    if (mc2Var != null) {
                        ((RelativeLayout) mc2Var.g).setVisibility(8);
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 1:
                u82 u82Var = (u82) this.b;
                if (u82Var.h) {
                    return;
                }
                u82Var.h = true;
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                RouterAdminActivity routerAdminActivity = (RouterAdminActivity) this.b;
                int i = RouterAdminActivity.F;
                try {
                    mc2 mc2Var = routerAdminActivity.C;
                    if (mc2Var != null) {
                        ((RelativeLayout) mc2Var.g).setVisibility(0);
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onPageStarted(webView, str, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 1:
                gi1 gi1Var = ((u82) this.b).g;
                gi1Var.getClass();
                Locale locale = Locale.US;
                ah3 ah3Var = new ah3("WebResourceError(" + i + ", " + str2 + "): " + str, 2);
                yu1 yu1Var = (yu1) ((bw1) gi1Var.l).i.getAndSet(null);
                if (yu1Var != null) {
                    yu1Var.j(ah3Var.a());
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        String string;
        switch (this.a) {
            case 0:
                i30.m(webView, "view");
                i30.m(sslErrorHandler, "handler");
                i30.m(sslError, "error");
                RouterAdminActivity routerAdminActivity = (RouterAdminActivity) this.b;
                if (!routerAdminActivity.isDestroyed()) {
                    u3 u3VarB = new t3(routerAdminActivity).b();
                    s3 s3Var = u3VarB.k;
                    int primaryError = sslError.getPrimaryError();
                    if (primaryError == 0) {
                        string = routerAdminActivity.getString(R.string.err_ssl_notyetvalid);
                        i30.l(string, "getString(...)");
                    } else if (primaryError == 1) {
                        string = routerAdminActivity.getString(R.string.err_ssl_expired);
                        i30.l(string, "getString(...)");
                    } else if (primaryError == 2) {
                        string = routerAdminActivity.getString(R.string.err_ssl_idmismatch);
                        i30.l(string, "getString(...)");
                    } else if (primaryError != 3) {
                        string = "";
                    } else {
                        string = routerAdminActivity.getString(R.string.err_ssl_untrusted);
                        i30.l(string, "getString(...)");
                    }
                    String str = string + "\n" + routerAdminActivity.getString(R.string.txt_continue);
                    u3VarB.setTitle(routerAdminActivity.getString(R.string.err_ssl_title));
                    s3Var.e = str;
                    TextView textView = s3Var.v;
                    if (textView != null) {
                        textView.setText(str);
                    }
                    final int i = 0;
                    s3Var.c(-1, routerAdminActivity.getString(R.string.btn_ok), new DialogInterface.OnClickListener() { // from class: dr0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            switch (i) {
                                case 0:
                                    sslErrorHandler.proceed();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    sslErrorHandler.cancel();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                    final int i2 = 1;
                    s3Var.c(-2, routerAdminActivity.getString(R.string.btn_cancel), new DialogInterface.OnClickListener() { // from class: dr0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            switch (i2) {
                                case 0:
                                    sslErrorHandler.proceed();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    sslErrorHandler.cancel();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                    if (!routerAdminActivity.isDestroyed()) {
                        u3VarB.show();
                        break;
                    }
                }
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 2:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length());
                uc3 uc3Var = (uc3) this.b;
                if (uc3Var.c() == webView) {
                    uc3Var.b = new dd3(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 1:
                String string = webResourceRequest.getUrl().toString();
                u82 u82Var = (u82) this.b;
                int i = u82.i;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                u82Var.g.e(string);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = this.a;
        Object obj = this.b;
        int iB = 0;
        switch (i) {
            case 1:
                u82 u82Var = (u82) obj;
                int i2 = u82.i;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                u82Var.g.e(str);
                return true;
            case 2:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 3:
                pf4 pf4Var = (pf4) obj;
                String strC3 = pf4Var.C3();
                Context context = pf4Var.h;
                if (str.startsWith(strC3)) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    d32 d32Var = pf4Var.k;
                    if (d32Var != null) {
                        try {
                            d32Var.W(zt0.Q(3, null, null));
                        } catch (RemoteException e) {
                            gi2.p0("#007 Could not call remote method.", e);
                        }
                    }
                    d32 d32Var2 = pf4Var.k;
                    if (d32Var2 != null) {
                        try {
                            d32Var2.I(3);
                        } catch (RemoteException e2) {
                            gi2.p0("#007 Could not call remote method.", e2);
                        }
                    }
                    pf4Var.B3(0);
                    return true;
                }
                if (str.startsWith("gmsg://scriptLoadFailed")) {
                    d32 d32Var3 = pf4Var.k;
                    if (d32Var3 != null) {
                        try {
                            d32Var3.W(zt0.Q(1, null, null));
                        } catch (RemoteException e3) {
                            gi2.p0("#007 Could not call remote method.", e3);
                        }
                    }
                    d32 d32Var4 = pf4Var.k;
                    if (d32Var4 != null) {
                        try {
                            d32Var4.I(0);
                        } catch (RemoteException e4) {
                            gi2.p0("#007 Could not call remote method.", e4);
                        }
                    }
                    pf4Var.B3(0);
                    return true;
                }
                if (str.startsWith("gmsg://adResized")) {
                    d32 d32Var5 = pf4Var.k;
                    if (d32Var5 != null) {
                        try {
                            d32Var5.c();
                        } catch (RemoteException e5) {
                            gi2.p0("#007 Could not call remote method.", e5);
                        }
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            j63 j63Var = sv1.f.a;
                            iB = j63.b(context, Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    pf4Var.B3(iB);
                    return true;
                }
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                d32 d32Var6 = pf4Var.k;
                if (d32Var6 != null) {
                    try {
                        d32Var6.f();
                        pf4Var.k.b();
                    } catch (RemoteException e6) {
                        gi2.p0("#007 Could not call remote method.", e6);
                    }
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                context.startActivity(intent);
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 3:
                pf4 pf4Var = (pf4) this.b;
                d32 d32Var = pf4Var.k;
                if (d32Var != null) {
                    try {
                        d32Var.W(zt0.Q(1, null, null));
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                    }
                }
                d32 d32Var2 = pf4Var.k;
                if (d32Var2 != null) {
                    try {
                        d32Var2.I(0);
                        break;
                    } catch (RemoteException e2) {
                        gi2.p0("#007 Could not call remote method.", e2);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }
}
