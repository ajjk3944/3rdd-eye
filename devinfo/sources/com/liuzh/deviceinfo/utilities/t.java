package com.liuzh.deviceinfo.utilities;

import android.content.SharedPreferences;
import com.liuzh.deviceinfo.DeviceInfoApp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final t f21303b = new t();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21304a = DeviceInfoApp.f21145f.getSharedPreferences("com.liuzh.deviceinfo_preferences.tester", 0);

    public final void a(int i4) {
        je.u.z(this.f21304a, "test_fingerprint", i4);
    }

    public final void b(int i4) {
        je.u.z(this.f21304a, "test_wifi", i4);
    }
}
