package com.mbridge.msdk.advanced.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    private static final String f12669c = "NetWorkStateReceiver";

    /* renamed from: a, reason: collision with root package name */
    private WebView f12670a;

    /* renamed from: b, reason: collision with root package name */
    private int f12671b;

    public NetWorkStateReceiver(WebView webView) {
        this.f12670a = webView;
    }

    public void a() {
        this.f12670a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f12670a, 0);
                return;
            }
            if (!com.mbridge.msdk.foundation.same.a.f15051z) {
                a(this.f12670a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f12670a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f12670a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f12670a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f12671b = networkType;
                int iC = m0.c(networkType);
                this.f12671b = iC;
                a(this.f12670a, iC);
            }
        } catch (Throwable th) {
            q0.a(f12669c, th.getMessage());
        }
    }

    public void a(WebView webView, int i10) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a(webView, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                q0.a(f12669c, th.getMessage());
            }
        }
    }
}
