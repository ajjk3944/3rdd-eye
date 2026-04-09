package im;

import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.tabcoverage.SuperUserActivity;
import qm.f;

/* loaded from: classes.dex */
public final class b extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11440d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SuperUserActivity f11441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SuperUserActivity superUserActivity, int i10) {
        super(0);
        this.f11440d = i10;
        this.f11441g = superUserActivity;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f11440d) {
            case 0:
                return e5.y(this.f11441g).f13863a.b().a(null, x.f2918a.b(f.class), null);
            default:
                return e5.y(this.f11441g).f13863a.b().a(null, x.f2918a.b(com.staircase3.opensignal.utils.a.class), null);
        }
    }
}
