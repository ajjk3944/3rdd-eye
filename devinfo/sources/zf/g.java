package zf;

import ah.o;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import je.u;
import jg.m;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends hg.e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f38268b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38269c;

    /* renamed from: d, reason: collision with root package name */
    public n.a f38270d;

    /* renamed from: e, reason: collision with root package name */
    public long f38271e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38272f;

    @Override // androidx.lifecycle.e1
    public final void d() {
        n.a aVar = this.f38270d;
        if (aVar != null) {
            aVar.b();
        }
        this.f38270d = null;
    }

    public final void g(int i4) {
        if (i4 != 0 || o.f400d.c() || this.f38272f) {
            return;
        }
        if ((this.f38270d != null && System.currentTimeMillis() - this.f38271e <= 10800000) || this.f38269c || this.f38268b) {
            return;
        }
        n nVar = kh.a.f28294a;
        if (((mh.a) kh.a.b(mh.a.f29378d, "di_confirm_ad")).a()) {
            pi.a aVarC = ag.a.c(R.layout.ad_native_exit_confirm);
            aVarC.toString();
            this.f38272f = true;
            u.k(DeviceInfoApp.f21145f, new m(1, this), aVarC);
        }
    }
}
