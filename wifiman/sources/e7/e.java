package e7;

import com.google.ar.core.Frame;
import com.google.ar.core.TrackingState;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Fg.a f46224a;

    /* renamed from: b, reason: collision with root package name */
    private float[] f46225b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f46226c;

    public e() {
        Fg.a aVarJ2 = Fg.a.j2();
        AbstractC6492s.h(aVarJ2, "create(...)");
        this.f46224a = aVarJ2;
        this.f46225b = new float[3];
        gg.i iVarI2 = aVarJ2.e1().X0(Gg.a.a()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f46226c = iVarI2;
    }

    @Override // e7.d
    public void a(Frame frame, int i10) {
        AbstractC6492s.i(frame, "frame");
        if (frame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            float[] fArr = this.f46225b;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 1.0f;
            this.f46224a.h(C5427c.f46223a.a(frame, fArr));
        }
    }

    public gg.i b() {
        return this.f46226c;
    }
}
