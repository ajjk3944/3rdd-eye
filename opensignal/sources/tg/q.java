package tg;

import android.content.Context;

/* loaded from: classes.dex */
public final class q implements vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22834a;

    /* renamed from: d, reason: collision with root package name */
    public final i5.c f22835d;

    public /* synthetic */ q(i5.c cVar, int i10) {
        this.f22834a = i10;
        this.f22835d = cVar;
    }

    @Override // kq.a
    public final Object get() {
        int i10 = this.f22834a;
        i5.c cVar = this.f22835d;
        switch (i10) {
            case 0:
                se.f fVar = (se.f) cVar.f11238a;
                br.l.e(fVar, "firebaseApp");
                l0 l0Var = l0.f22817a;
                return l0.a(fVar);
            default:
                return new wg.a((Context) cVar.f11238a);
        }
    }
}
