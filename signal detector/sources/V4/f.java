package V4;

import a2.AbstractC0271g;
import android.view.View;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.satellite.SatelliteActivity;
import d5.AbstractC2282j;
import e.InterfaceC2285b;
import e2.InterfaceC2302a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC2302a, InterfaceC2285b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SatelliteActivity f3886a;

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        int i3 = SatelliteActivity.f19187g0;
        SatelliteActivity satelliteActivity = this.f3886a;
        l lVar = (l) AbstractC2282j.V(i, satelliteActivity.f19188O.f4668b);
        if (lVar == null) {
            return;
        }
        o oVar = new o();
        oVar.f3920B0 = lVar;
        oVar.f0(satelliteActivity.s(), "satellite_info");
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        SatelliteActivity satelliteActivity = this.f3886a;
        if (zBooleanValue) {
            satelliteActivity.f19199Z.b(satelliteActivity);
        } else if (!satelliteActivity.shouldShowRequestPermissionRationale(satelliteActivity.f19200a0) && System.currentTimeMillis() - satelliteActivity.f19202d0 < 500) {
            boolean z6 = MyApplication.f18812d;
            MyApplication.f18812d = com.bumptech.glide.d.F(satelliteActivity, satelliteActivity.f19204f0);
        }
        satelliteActivity.C().i.j(bool);
    }
}
