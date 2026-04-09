package ql;

import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class b extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20909d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f20910g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(0);
        this.f20909d = i10;
        this.f20910g = cVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f20909d) {
            case 0:
                return e5.y(this.f20910g).f13863a.b().a(null, x.f2918a.b(com.staircase3.opensignal.utils.a.class), null);
            case 1:
                return e5.y(this.f20910g).f13863a.b().a(null, x.f2918a.b(nl.a.class), null);
            default:
                return e5.y(this.f20910g).f13863a.b().a(null, x.f2918a.b(cm.a.class), null);
        }
    }
}
