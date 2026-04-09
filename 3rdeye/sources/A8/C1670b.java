package a8;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1789w;
import va.a;

/* compiled from: BLyticsEngine.java */
/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1670b implements InterfaceC1789w {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14236b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1671c f14238d;

    public C1670b(C1671c c1671c, boolean z10) {
        this.f14238d = c1671c;
        this.f14237c = z10;
    }

    @G(AbstractC1781n.a.ON_STOP)
    public void onEnterBackground() {
        if (this.f14236b) {
            a.b bVar = va.a.f47104a;
            bVar.o("BLytics");
            bVar.g("App is BACKGROUND", new Object[0]);
            try {
                this.f14238d.d();
            } catch (Throwable th) {
                a.b bVar2 = va.a.f47104a;
                bVar2.o("Blytics");
                bVar2.e(th, "Stop session failed", new Object[0]);
            }
            this.f14236b = false;
        }
    }

    @G(AbstractC1781n.a.ON_START)
    public void onEnterForeground() {
        if (this.f14236b) {
            return;
        }
        a.b bVar = va.a.f47104a;
        bVar.o("BLytics");
        bVar.g("App is FOREGROUND", new Object[0]);
        try {
            this.f14238d.c(this.f14237c);
        } catch (Throwable th) {
            a.b bVar2 = va.a.f47104a;
            bVar2.o("Blytics");
            bVar2.e(th, "Start session failed", new Object[0]);
        }
        this.f14236b = true;
    }
}
