package N;

import C.C0621h;
import I.m;
import N.s;
import android.view.Surface;
import androidx.camera.core.impl.X;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f4427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.a f4428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0621h f4430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0621h f4431f;

    public /* synthetic */ r(s sVar, s.a aVar, int i, C0621h c0621h, C0621h c0621h2) {
        this.f4427b = sVar;
        this.f4428c = aVar;
        this.f4429d = i;
        this.f4430e = c0621h;
        this.f4431f = c0621h2;
    }

    @Override // I.a
    public final A4.a apply(Object obj) {
        s.a aVar = this.f4428c;
        Surface surface = (Surface) obj;
        s sVar = this.f4427b;
        sVar.getClass();
        surface.getClass();
        try {
            aVar.d();
            t tVar = new t(surface, this.f4429d, sVar.f4438g.d(), this.f4430e, this.f4431f);
            tVar.f4458k.f44804c.addListener(new p(aVar, 1), E.u.y());
            A2.l.q("Consumer can only be linked once.", aVar.f4449r == null);
            aVar.f4449r = tVar;
            return I.j.e(tVar);
        } catch (X.a e4) {
            return new m.a(e4);
        }
    }
}
