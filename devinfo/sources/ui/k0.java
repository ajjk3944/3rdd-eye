package ui;

import android.content.pm.ServiceInfo;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceInfo f35409a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35410b = false;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35411c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35412d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35413e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35414f;
    public final CharSequence g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f35415h;

    public k0(ServiceInfo serviceInfo, CharSequence charSequence) {
        this.f35409a = serviceInfo;
        this.f35411c = ti.e.e(serviceInfo.flags, 1);
        this.f35412d = ti.e.e(serviceInfo.flags, 1073741824);
        this.f35413e = ti.e.e(serviceInfo.flags, 2);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f35415h = ti.e.e(serviceInfo.flags, 4);
        }
        this.f35414f = "android.permission.BIND_QUICK_SETTINGS_TILE".equals(serviceInfo.permission);
        this.g = charSequence;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ServiceInfo serviceInfo;
        k0 k0Var = (k0) obj;
        ServiceInfo serviceInfo2 = this.f35409a;
        if (serviceInfo2 == null || k0Var == null || (serviceInfo = k0Var.f35409a) == null) {
            return 0;
        }
        return serviceInfo2.name.compareToIgnoreCase(serviceInfo.name);
    }
}
