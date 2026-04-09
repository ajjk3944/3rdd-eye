package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import o5.b;

/* loaded from: classes3.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* renamed from: t, reason: collision with root package name */
    private static final String f12884t = "MBNativeAdvancedWebview";

    /* renamed from: r, reason: collision with root package name */
    private b f12885r;

    /* renamed from: s, reason: collision with root package name */
    private NetWorkStateReceiver f12886s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            b bVar = this.f12885r;
            if (bVar != null) {
                bVar.c();
                this.f12885r = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public b getAdSession() {
        return this.f12885r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f12886s == null) {
                this.f12886s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f12886s, intentFilter);
        } catch (Throwable th) {
            q0.a(f12884t, th.getMessage());
        }
    }

    public void setAdSession(b bVar) {
        this.f12885r = bVar;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f12886s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.f12886s);
            }
        } catch (Throwable th) {
            q0.a(f12884t, th.getMessage());
        }
    }
}
