package ui;

import android.content.pm.PermissionInfo;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f35459a;

    /* renamed from: b, reason: collision with root package name */
    public String f35460b;

    /* renamed from: c, reason: collision with root package name */
    public String f35461c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35462d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35463e;

    /* renamed from: f, reason: collision with root package name */
    public final String f35464f;

    public r(PermissionInfo permissionInfo) {
        this.f35462d = permissionInfo.name;
        this.f35463e = permissionInfo.group;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35464f = ti.e.d(permissionInfo.getProtection(), permissionInfo.getProtectionFlags());
        } else {
            int i4 = permissionInfo.protectionLevel;
            this.f35464f = ti.e.d(i4 & 15, i4 & 65520);
        }
    }
}
