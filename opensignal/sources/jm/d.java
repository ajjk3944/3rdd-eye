package jm;

import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.utils.o;

/* loaded from: classes.dex */
public final class d extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13766d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f13767g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(0);
        this.f13766d = i10;
        this.f13767g = eVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f13766d) {
            case 0:
                return e5.y(this.f13767g).f13863a.b().a(null, x.f2918a.b(o.class), null);
            default:
                return e5.y(this.f13767g).f13863a.b().a(null, x.f2918a.b(com.staircase3.opensignal.utils.a.class), null);
        }
    }
}
