package Y2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.C1664ow;
import com.google.android.gms.internal.ads.C2203yw;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lefan.base.activity.PrivacyActivity;
import com.lefan.base.activity.WebUrlActivity;
import java.util.Locale;
import q2.InterfaceC2853y;

/* renamed from: Y2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212n extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4351b;

    public /* synthetic */ C0212n(int i, Object obj) {
        this.f4350a = i;
        this.f4351b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f4350a) {
            case 0:
                C0213o c0213o = (C0213o) this.f4351b;
                int i = C0213o.f4352d;
                if (str != null && str.startsWith("consent://")) {
                    c0213o.f4354b.e(str);
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
        switch (this.f4350a) {
            case 0:
                C0213o c0213o = (C0213o) this.f4351b;
                if (!c0213o.f4355c) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    c0213o.f4355c = true;
                    break;
                }
                break;
            case 1:
            case 2:
            default:
                super.onPageFinished(webView, str);
                break;
            case 3:
                LinearProgressIndicator linearProgressIndicator = ((PrivacyActivity) this.f4351b).f18765O;
                if (linearProgressIndicator != null) {
                    linearProgressIndicator.b();
                }
                super.onPageFinished(webView, str);
                break;
            case 4:
                LinearProgressIndicator linearProgressIndicator2 = ((WebUrlActivity) this.f4351b).f18777P;
                if (linearProgressIndicator2 != null) {
                    linearProgressIndicator2.b();
                }
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f4350a) {
            case 3:
                LinearProgressIndicator linearProgressIndicator = ((PrivacyActivity) this.f4351b).f18765O;
                if (linearProgressIndicator != null) {
                    linearProgressIndicator.e();
                }
                super.onPageStarted(webView, str, bitmap);
                break;
            case 4:
                LinearProgressIndicator linearProgressIndicator2 = ((WebUrlActivity) this.f4351b).f18777P;
                if (linearProgressIndicator2 != null) {
                    linearProgressIndicator2.e();
                }
                super.onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f4350a) {
            case 0:
                C0200b c0200b = ((C0213o) this.f4351b).f4354b;
                c0200b.getClass();
                Locale locale = Locale.US;
                Q q3 = new Q(2, "WebResourceError(" + i + ", " + str2 + "): " + str);
                C0206h c0206h = (C0206h) ((C0207i) c0200b.f4309h).i.getAndSet(null);
                if (c0206h != null) {
                    c0206h.k(q3.a());
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f4350a) {
            case 1:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                Log.w("NativeBridge", AbstractC1135f5.o(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
                C1664ow c1664ow = (C1664ow) this.f4351b;
                if (c1664ow.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    c1664ow.f15489b = new C2203yw(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f4350a) {
            case 0:
                String string = webResourceRequest.getUrl().toString();
                C0213o c0213o = (C0213o) this.f4351b;
                int i = C0213o.f4352d;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                c0213o.f4354b.e(string);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = this.f4350a;
        Object obj = this.f4351b;
        int iB = 0;
        switch (i) {
            case 0:
                C0213o c0213o = (C0213o) obj;
                int i3 = C0213o.f4352d;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                c0213o.f4354b.e(str);
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                p2.i iVar = (p2.i) obj;
                String strL3 = iVar.L3();
                Context context = iVar.f22780c;
                if (str.startsWith(strL3)) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC2853y interfaceC2853y = iVar.f22783f;
                    if (interfaceC2853y != null) {
                        try {
                            interfaceC2853y.j0(AbstractC1984ut.A(3, null, null));
                        } catch (RemoteException e6) {
                            u2.k.k("#007 Could not call remote method.", e6);
                        }
                    }
                    InterfaceC2853y interfaceC2853y2 = iVar.f22783f;
                    if (interfaceC2853y2 != null) {
                        try {
                            interfaceC2853y2.E(3);
                        } catch (RemoteException e7) {
                            u2.k.k("#007 Could not call remote method.", e7);
                        }
                    }
                    iVar.K3(0);
                    return true;
                }
                if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC2853y interfaceC2853y3 = iVar.f22783f;
                    if (interfaceC2853y3 != null) {
                        try {
                            interfaceC2853y3.j0(AbstractC1984ut.A(1, null, null));
                        } catch (RemoteException e8) {
                            u2.k.k("#007 Could not call remote method.", e8);
                        }
                    }
                    InterfaceC2853y interfaceC2853y4 = iVar.f22783f;
                    if (interfaceC2853y4 != null) {
                        try {
                            interfaceC2853y4.E(0);
                        } catch (RemoteException e9) {
                            u2.k.k("#007 Could not call remote method.", e9);
                        }
                    }
                    iVar.K3(0);
                    return true;
                }
                if (str.startsWith("gmsg://adResized")) {
                    InterfaceC2853y interfaceC2853y5 = iVar.f22783f;
                    if (interfaceC2853y5 != null) {
                        try {
                            interfaceC2853y5.d();
                        } catch (RemoteException e10) {
                            u2.k.k("#007 Could not call remote method.", e10);
                        }
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            u2.f fVar = q2.r.f23260g.f23261a;
                            iB = u2.f.b(context, Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    iVar.K3(iB);
                    return true;
                }
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                InterfaceC2853y interfaceC2853y6 = iVar.f22783f;
                if (interfaceC2853y6 != null) {
                    try {
                        interfaceC2853y6.g();
                        iVar.f22783f.b();
                    } catch (RemoteException e11) {
                        u2.k.k("#007 Could not call remote method.", e11);
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
        switch (this.f4350a) {
            case 2:
                p2.i iVar = (p2.i) this.f4351b;
                InterfaceC2853y interfaceC2853y = iVar.f22783f;
                if (interfaceC2853y != null) {
                    try {
                        interfaceC2853y.j0(AbstractC1984ut.A(1, null, null));
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                    }
                }
                InterfaceC2853y interfaceC2853y2 = iVar.f22783f;
                if (interfaceC2853y2 != null) {
                    try {
                        interfaceC2853y2.E(0);
                        break;
                    } catch (RemoteException e7) {
                        u2.k.k("#007 Could not call remote method.", e7);
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
