package i2;

import i2.z;
import u2.C5628g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements z.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f38399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f38400b;

    public /* synthetic */ x(z zVar, float f10) {
        this.f38399a = zVar;
        this.f38400b = f10;
    }

    @Override // i2.z.a
    public final void run() {
        z zVar = this.f38399a;
        C4448h c4448h = zVar.f38423b;
        float f10 = this.f38400b;
        if (c4448h == null) {
            zVar.f38429h.add(new x(zVar, f10));
        } else {
            zVar.q((int) C5628g.e(c4448h.f38355l, c4448h.f38356m, f10));
        }
    }
}
