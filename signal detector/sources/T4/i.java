package T4;

import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import c5.C0409f;
import c5.C0412i;
import d5.AbstractC2282j;
import h5.InterfaceC2370d;
import java.util.List;
import p5.p;
import q5.o;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class i extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f3609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f3610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f3611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f3612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, double d6, double d7, o oVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3609e = lVar;
        this.f3610f = d6;
        this.f3611g = d7;
        this.f3612h = oVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((i) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new i(this.f3609e, this.f3610f, this.f3611g, this.f3612h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        Address address;
        R2.a.H(obj);
        try {
            int i = Build.VERSION.SDK_INT;
            l lVar = this.f3609e;
            double d6 = this.f3610f;
            double d7 = this.f3611g;
            o oVar = this.f3612h;
            if (i >= 33) {
                Geocoder geocoder = lVar.f3621b;
                q5.i.b(geocoder);
                geocoder.getFromLocation(d6, d7, 1, new S4.g(oVar, 1));
            } else {
                Geocoder geocoder2 = lVar.f3621b;
                q5.i.b(geocoder2);
                List<Address> fromLocation = geocoder2.getFromLocation(d6, d7, 1);
                oVar.f23299a = (fromLocation == null || (address = (Address) AbstractC2282j.U(fromLocation)) == null) ? null : address.getAddressLine(0);
            }
            objD = C0412i.f5929a;
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        return new C0409f(objD);
    }
}
