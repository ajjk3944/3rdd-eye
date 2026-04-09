package V4;

import com.lefan.signal.ui.satellite.SatelliteActivity;

/* loaded from: classes.dex */
public final class k extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SatelliteActivity f3904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(SatelliteActivity satelliteActivity, int i) {
        super(0);
        this.f3903b = i;
        this.f3904c = satelliteActivity;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f3903b) {
            case 0:
                return this.f3904c.n();
            case 1:
                return this.f3904c.d();
            default:
                return this.f3904c.c();
        }
    }
}
