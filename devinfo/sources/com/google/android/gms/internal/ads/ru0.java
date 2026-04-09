package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.liuzh.deviceinfo.common.WebViewActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ru0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15766b;

    public /* synthetic */ ru0(int i4, Object obj) {
        this.f15765a = i4;
        this.f15766b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f15765a) {
            case 1:
                ((WebViewActivity) this.f15766b).B.f32329b.setVisibility(8);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f15765a) {
            case 2:
                ua.i iVar = (ua.i) this.f15766b;
                va.y yVar = iVar.f35258f;
                if (yVar != null) {
                    try {
                        yVar.W(yo0.A(1, null, null));
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                    }
                }
                va.y yVar2 = iVar.f35258f;
                if (yVar2 != null) {
                    try {
                        yVar2.p(0);
                        break;
                    } catch (RemoteException e10) {
                        za.i.k("#007 Could not call remote method.", e10);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f15765a) {
            case 0:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                Log.w("NativeBridge", a0.g.p(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
                tu0 tu0Var = (tu0) this.f15766b;
                if (tu0Var.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    tu0Var.f15109b = new c1.r(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f15765a) {
            case 2:
                ua.i iVar = (ua.i) this.f15766b;
                String strI4 = iVar.i4();
                Context context = iVar.f35255c;
                int iB = 0;
                if (str.startsWith(strI4)) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    va.y yVar = iVar.f35258f;
                    if (yVar != null) {
                        try {
                            yVar.W(yo0.A(3, null, null));
                        } catch (RemoteException e2) {
                            za.i.k("#007 Could not call remote method.", e2);
                        }
                    }
                    va.y yVar2 = iVar.f35258f;
                    if (yVar2 != null) {
                        try {
                            yVar2.p(3);
                        } catch (RemoteException e10) {
                            za.i.k("#007 Could not call remote method.", e10);
                        }
                    }
                    iVar.h4(0);
                } else if (str.startsWith("gmsg://scriptLoadFailed")) {
                    va.y yVar3 = iVar.f35258f;
                    if (yVar3 != null) {
                        try {
                            yVar3.W(yo0.A(1, null, null));
                        } catch (RemoteException e11) {
                            za.i.k("#007 Could not call remote method.", e11);
                        }
                    }
                    va.y yVar4 = iVar.f35258f;
                    if (yVar4 != null) {
                        try {
                            yVar4.p(0);
                        } catch (RemoteException e12) {
                            za.i.k("#007 Could not call remote method.", e12);
                        }
                    }
                    iVar.h4(0);
                } else if (str.startsWith("gmsg://adResized")) {
                    va.y yVar5 = iVar.f35258f;
                    if (yVar5 != null) {
                        try {
                            yVar5.d();
                        } catch (RemoteException e13) {
                            za.i.k("#007 Could not call remote method.", e13);
                        }
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            za.d dVar = va.r.g.f36157a;
                            iB = za.d.b(Integer.parseInt(queryParameter), context);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    iVar.h4(iB);
                } else if (!str.startsWith("gmsg://")) {
                    va.y yVar6 = iVar.f35258f;
                    if (yVar6 != null) {
                        try {
                            yVar6.z1();
                            iVar.f35258f.c();
                        } catch (RemoteException e14) {
                            za.i.k("#007 Could not call remote method.", e14);
                        }
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    context.startActivity(intent);
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
