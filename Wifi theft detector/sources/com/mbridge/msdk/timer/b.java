package com.mbridge.msdk.timer;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    public static class C0329b {

        /* renamed from: a, reason: collision with root package name */
        static b f18221a = new b();
    }

    public static b getInstance() {
        return C0329b.f18221a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e10) {
            q0.b("TimerController", "addInterstitialList error:" + e10.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e10) {
            q0.b("TimerController", "addRewardList error:" + e10.getMessage());
        }
    }

    public void start() {
        g gVarD = h.b().d(c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        if (gVarD.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r0 * 1000);
        }
    }

    private b() {
    }
}
