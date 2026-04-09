package A2;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C0540Hh;
import com.google.android.gms.internal.ads.C1799rN;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC2069wN;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class D implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final C0540Hh f152a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f153b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f154c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f155d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f156e;

    public D(C0540Hh c0540Hh, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f152a = c0540Hh;
        this.f153b = c1799rN;
        this.f154c = c1799rN2;
        this.f155d = c1799rN3;
        this.f156e = c1799rN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final /* bridge */ /* synthetic */ Object c() {
        return new r(this.f152a.a(), ((Long) this.f153b.c()).longValue(), (PackageInfo) this.f154c.c(), (E) this.f155d.c(), (ScheduledExecutorService) this.f156e.c());
    }
}
