package qh;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends pi.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32422f;
    public final /* synthetic */ ViewGroup g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hg.a f32423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(hg.a aVar, ViewGroup viewGroup, int i4) {
        super(1);
        this.f32422f = i4;
        this.f32423h = aVar;
        this.g = viewGroup;
    }

    @Override // pi.e, cm.g
    public void A() {
        switch (this.f32422f) {
            case 1:
                RealtimeSatelliteActivity realtimeSatelliteActivity = (RealtimeSatelliteActivity) this.f32423h;
                int i4 = RealtimeSatelliteActivity.S;
                realtimeSatelliteActivity.D();
                break;
            default:
                super.A();
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void B(String str) {
        int i4 = this.f32422f;
        ViewGroup viewGroup = this.g;
        switch (i4) {
            case 0:
                pd.b.g(viewGroup);
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                if (com.liuzh.deviceinfo.utilities.f.g()) {
                    viewGroup.setVisibility(8);
                    break;
                }
                break;
            default:
                pd.b.g((FrameLayout) viewGroup);
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void D(n.a aVar) {
        int i4 = this.f32422f;
        hg.a aVar2 = this.f32423h;
        ViewGroup viewGroup = this.g;
        switch (i4) {
            case 0:
                SettingsActivity settingsActivity = (SettingsActivity) aVar2;
                if (!i0.l(settingsActivity)) {
                    com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                    if (!com.liuzh.deviceinfo.utilities.f.g()) {
                        n.a aVar3 = settingsActivity.I;
                        if (aVar3 != null && aVar3 != aVar) {
                            aVar3.b();
                        }
                        settingsActivity.I = aVar;
                        viewGroup.removeAllViews();
                        viewGroup.addView(aVar.a());
                        break;
                    } else {
                        aVar.b();
                        viewGroup.setVisibility(8);
                        break;
                    }
                } else {
                    aVar.b();
                    break;
                }
            default:
                FrameLayout frameLayout = (FrameLayout) viewGroup;
                RealtimeSatelliteActivity realtimeSatelliteActivity = (RealtimeSatelliteActivity) aVar2;
                if (!i0.l(realtimeSatelliteActivity)) {
                    int i10 = RealtimeSatelliteActivity.S;
                    n.a aVar4 = realtimeSatelliteActivity.L;
                    if (aVar4 != null) {
                        aVar4.b();
                        realtimeSatelliteActivity.L = null;
                    }
                    frameLayout.removeAllViews();
                    frameLayout.setVisibility(0);
                    frameLayout.addView(aVar.a());
                    realtimeSatelliteActivity.L = aVar;
                    break;
                }
                break;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f32422f) {
            case 0:
                cg.a.f2848b.d(bVar);
                break;
            default:
                cg.a.f2848b.d(bVar);
                break;
        }
    }
}
