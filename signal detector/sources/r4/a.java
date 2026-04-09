package R4;

import I3.e;
import com.lefan.signal.ui.magnetic.MagneticActivity;
import com.lefan.signal.ui.noise.NoiseDetailActivity;
import h.AbstractActivityC2349g;

/* loaded from: classes.dex */
public final /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f3427b;

    public /* synthetic */ a(AbstractActivityC2349g abstractActivityC2349g, int i) {
        this.f3426a = i;
        this.f3427b = abstractActivityC2349g;
    }

    public final void a(e eVar, float f2) {
        int i = this.f3426a;
        AbstractActivityC2349g abstractActivityC2349g = this.f3427b;
        switch (i) {
            case 0:
                int i3 = MagneticActivity.f18919f0;
                ((MagneticActivity) abstractActivityC2349g).f18926U = f2;
                break;
            default:
                int i6 = NoiseDetailActivity.f18995c0;
                ((NoiseDetailActivity) abstractActivityC2349g).b0 = (int) f2;
                break;
        }
    }
}
