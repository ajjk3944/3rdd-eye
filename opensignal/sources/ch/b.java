package ch;

import android.content.SharedPreferences;
import jj.y;
import mi.x;

/* loaded from: classes.dex */
public final class b extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3768d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f3769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i10) {
        super(0);
        this.f3768d = i10;
        this.f3769g = dVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f3768d) {
            case 0:
                d dVar = this.f3769g;
                return new jj.a(dVar.J0(), dVar.A0());
            case 1:
                return this.f3769g.d().getSharedPreferences("excludedDevices", 0);
            case 2:
                return new y(this.f3769g.k0());
            case 3:
                Object value = this.f3769g.f3812f5.getValue();
                br.l.d(value, "getValue(...)");
                return new xh.a((SharedPreferences) value);
            case 4:
                return new x(this.f3769g.I0());
            default:
                this.f3769g.r();
                return new zj.d();
        }
    }
}
