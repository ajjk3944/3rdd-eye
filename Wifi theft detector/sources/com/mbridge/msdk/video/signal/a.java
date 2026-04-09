package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes3.dex */
public interface a extends e {

    /* renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0345a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i10, String str);

        void a(boolean z10);

        void onInitSuccess();
    }

    void a(int i10);

    void a(int i10, String str);

    void a(InterfaceC0345a interfaceC0345a);

    void a(String str);

    void a(boolean z10);

    boolean a();

    int b();

    void b(int i10);

    void b(boolean z10);

    String c();

    void c(int i10);

    int d();

    void d(int i10);

    String e();

    void e(int i10);

    String f(int i10);

    void f();

    String g();

    void g(int i10);

    void h();

    int i();

    void release();

    void setActivity(Activity activity);

    void setAdEvents(o5.a aVar);

    void setAdSession(o5.b bVar);

    void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar);

    void setUnitId(String str);

    void setVideoEvents(com.iab.omid.library.mmadbridge.adsession.media.a aVar);

    void setWebViewFront(int i10);
}
