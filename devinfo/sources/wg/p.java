package wg;

import androidx.lifecycle.f1;
import com.google.firebase.abt.component.AbtRegistrar;
import com.liuzh.deviceinfo.monitor.MonitorActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements gd.f, de.d, f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36692a;

    public /* synthetic */ p(int i4) {
        this.f36692a = i4;
    }

    @Override // gd.f
    public String a(float f10) {
        switch (this.f36692a) {
            case 0:
                int i4 = MonitorActivity.B;
                return String.valueOf(Math.round(f10));
            case 1:
                int i10 = MonitorActivity.B;
                return String.valueOf(Math.round(f10));
            case 2:
                int i11 = MonitorActivity.B;
                return String.valueOf(Math.round(f10));
            default:
                return String.valueOf(pk.a.s(f10));
        }
    }

    @Override // de.d
    public Object c(f1 f1Var) {
        return AbtRegistrar.lambda$getComponents$0(f1Var);
    }

    @Override // f.b
    public void k(Object obj) {
        if (zg.c.c()) {
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            com.liuzh.deviceinfo.utilities.f.k("show_overview_notification", true);
        }
    }
}
