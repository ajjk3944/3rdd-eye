package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1077at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C1436gi> A02;
    public final WeakReference<InterfaceC1074aq> A03;
    public final WeakReference<C1069al> A04;
    public final InterfaceC1073ap A01 = new InterfaceC1073ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.instagram.common.viewpoint.core.InterfaceC1073ap
        public final boolean AAf(String str) {
            return C1077at.A04(str);
        }
    };
    public WeakReference<InterfaceC1075ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C1077at(WeakReference<C1436gi> weakReference, WeakReference<InterfaceC1074aq> weakReference2, WeakReference<C1069al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1436gi c1436gi) {
        c1436gi.A08().ABC(A00(11, 11, 104), AbstractC0848Td.A09, new C0849Te(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) throws URISyntaxException {
        boolean zA14;
        String strA00;
        String strA002;
        String strA003;
        Intent intent;
        String strA004 = A00(116, 8, 68);
        C1436gi c1436gi = this.A02.get();
        if (c1436gi != null) {
            if ((M3.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    zA14 = C0886Up.A14(c1436gi);
                    strA00 = A00(48, 33, 58);
                    strA002 = A00(22, 26, 65);
                    strA003 = A00(105, 6, 36);
                } catch (Exception e2) {
                    c1436gi.A08().ABD(strA004, AbstractC0848Td.A2d, new C0849Te(e2));
                    c1436gi.A0F().AA2(e2.toString());
                }
                if (zA14) {
                    if (!M3.A0D.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                        if (strA003.equalsIgnoreCase(scheme)) {
                            intent = Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new Intent(strA002, uri);
                        }
                        intent.addCategory(strA00);
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!C0940Wu.A0D(c1436gi, intent)) {
                                A02(str, c1436gi);
                            }
                            return true;
                        } catch (C0938Ws unused) {
                            if (strA003.equals(scheme)) {
                                String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    if (!C0940Wu.A0D(c1436gi, new Intent(strA002, XB.A00(stringExtra)))) {
                                        A02(str, c1436gi);
                                    }
                                    return true;
                                }
                            }
                            C0849Te c0849Te = new C0849Te(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 5, 91) + str);
                            c0849Te.A05(1);
                            c1436gi.A08().ABD(A00(11, 11, 104), AbstractC0848Td.A06, c0849Te);
                            return true;
                        }
                    }
                    return false;
                }
                if (!M3.A0A || !strA003.equalsIgnoreCase(scheme)) {
                    if ((M3.A0A && AbstractC0945Xb.A04(str)) || !M3.A0D.contains(scheme)) {
                        return C0940Wu.A0D(c1436gi, new Intent(strA002, uri));
                    }
                } else {
                    Intent uri2 = Intent.parseUri(str, 1);
                    uri2.addCategory(strA00);
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    if (c1436gi.getPackageManager().resolveActivity(uri2, 65536) != null && C0940Wu.A0D(c1436gi, uri2)) {
                        webView.goBack();
                        return true;
                    }
                }
                return false;
            } catch (SecurityException e10) {
                c1436gi.A08().ABD(strA004, AbstractC0848Td.A2d, new C0849Te(e10));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC1075ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1069al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1074aq interfaceC1074aq = this.A03.get();
        if (interfaceC1074aq != null) {
            interfaceC1074aq.AF7(str);
        }
        InterfaceC1075ar interfaceC1075ar = this.A00.get();
        if (interfaceC1075ar != null) {
            interfaceC1075ar.ADB(webView.canGoBack());
            interfaceC1075ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1074aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) throws JSONException {
        super.onReceivedError(webView, i4, str, str2);
        C1436gi c1436gi = this.A02.get();
        if (c1436gi != null) {
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            String errorMessage = AbstractC0945Xb.A01(i4, sb2.append(strA00).append(str).toString(), strA00 + str2);
            c1436gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1436gi c1436gi = this.A02.get();
        if (c1436gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            String errorMessage = AbstractC0945Xb.A01(errorCode, sb2.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1436gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1436gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1436gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1082ay.A0D(AbstractC0848Td.A2e);
        InterfaceC1074aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
