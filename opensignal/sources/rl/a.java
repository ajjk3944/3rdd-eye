package rl;

import br.n;
import br.x;
import ch.f;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.loadingconfig.LoadConfigActivity;
import el.b;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21656d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LoadConfigActivity f21657g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LoadConfigActivity loadConfigActivity, int i10) {
        super(0);
        this.f21656d = i10;
        this.f21657g = loadConfigActivity;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f21656d) {
            case 0:
                return e5.y(this.f21657g).f13863a.b().a(null, x.f2918a.b(vl.a.class), null);
            case 1:
                return e5.y(this.f21657g).f13863a.b().a(null, x.f2918a.b(gl.a.class), null);
            case 2:
                return e5.y(this.f21657g).f13863a.b().a(null, x.f2918a.b(f.class), null);
            default:
                return e5.y(this.f21657g).f13863a.b().a(null, x.f2918a.b(b.class), null);
        }
    }
}
