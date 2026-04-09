package dn;

import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class h extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7413d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f7414g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(0);
        this.f7413d = i10;
        this.f7414g = iVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f7413d) {
            case 0:
                return e5.y(this.f7414g).f13863a.b().a(null, x.f2918a.b(an.a.class), null);
            default:
                return e5.y(this.f7414g).f13863a.b().a(null, x.f2918a.b(bn.e.class), null);
        }
    }
}
