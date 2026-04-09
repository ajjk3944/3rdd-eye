package am;

import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f863d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(0);
        this.f863d = i10;
        this.f864g = fVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f863d) {
            case 0:
                return e5.y(this.f864g).f13863a.b().a(null, x.f2918a.b(qm.f.class), null);
            default:
                f fVar = this.f864g;
                return new bm.e(fVar.d(), 28, fVar);
        }
    }
}
