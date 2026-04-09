package tg;

import android.content.Context;

/* loaded from: classes.dex */
public final class b0 implements vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22737a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final kq.a f22738d;

    /* renamed from: g, reason: collision with root package name */
    public final i5.c f22739g;

    public b0(i5.c cVar, vg.c cVar2) {
        this.f22739g = cVar;
        this.f22738d = cVar2;
    }

    @Override // kq.a
    public final Object get() {
        switch (this.f22737a) {
            case 0:
                return new a0((Context) this.f22739g.f11238a, (f1) this.f22738d.get());
            default:
                return new wg.e((b) this.f22738d.get(), (pq.h) this.f22739g.f11238a);
        }
    }

    public b0(vg.c cVar, i5.c cVar2) {
        this.f22738d = cVar;
        this.f22739g = cVar2;
    }
}
