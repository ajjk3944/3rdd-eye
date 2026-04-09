package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f16262d = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private Context f16263a;

    /* renamed from: b, reason: collision with root package name */
    private Object f16264b;

    /* renamed from: c, reason: collision with root package name */
    private WindVaneWebView f16265c;

    public e(Context context, WindVaneWebView windVaneWebView) throws ClassNotFoundException {
        this.f16263a = context;
        this.f16265c = windVaneWebView;
        a();
    }

    public void a(Context context) {
        this.f16263a = context;
    }

    public void a(Object obj) {
        this.f16264b = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f16262d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f16264b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f16262d == null) {
            f16262d = new HashMap<>();
        }
        f16262d.put(str, cls);
    }

    public Object a(String str) {
        if (f16262d == null) {
            f16262d = new HashMap<>();
        }
        return a(str, this.f16265c, this.f16263a);
    }

    public void a() throws ClassNotFoundException {
        try {
            int i10 = interstitial.f15649i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16135a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i11 = RewardSignal.f19229i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16136b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i12 = VideoCommunication.f19255j;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16137c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i13 = MraidSignalCommunication.f16206h;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16139e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i14 = BannerSignalPlugin.f16194i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16140f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            int i15 = SplashSignal.f17306i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16141g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i16 = WebGLCheckSignal.f16218g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16142h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}
