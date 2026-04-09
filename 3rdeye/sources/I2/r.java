package i2;

import i2.z;
import u2.C5628g;
import u2.ChoreographerFrameCallbackC5626e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements z.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f38386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f38387c;

    public /* synthetic */ r(z zVar, float f10, int i) {
        this.f38385a = i;
        this.f38386b = zVar;
        this.f38387c = f10;
    }

    @Override // i2.z.a
    public final void run() {
        switch (this.f38385a) {
            case 0:
                z zVar = this.f38386b;
                C4448h c4448h = zVar.f38423b;
                float f10 = this.f38387c;
                if (c4448h != null) {
                    float fE = C5628g.e(c4448h.f38355l, c4448h.f38356m, f10);
                    ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = zVar.f38424c;
                    choreographerFrameCallbackC5626e.j(choreographerFrameCallbackC5626e.f46550k, fE);
                    break;
                } else {
                    zVar.f38429h.add(new r(zVar, f10, 0));
                    break;
                }
            default:
                this.f38386b.s(this.f38387c);
                break;
        }
    }
}
