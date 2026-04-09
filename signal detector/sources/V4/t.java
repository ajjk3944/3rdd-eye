package V4;

import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import c5.C0409f;
import c5.C0412i;
import d5.AbstractC2282j;
import h5.InterfaceC2370d;
import java.util.List;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class t extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f3937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f3938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f3939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q5.o f3940h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, double d6, double d7, q5.o oVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3937e = uVar;
        this.f3938f = d6;
        this.f3939g = d7;
        this.f3940h = oVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((t) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new t(this.f3937e, this.f3938f, this.f3939g, this.f3940h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        Address address;
        R2.a.H(obj);
        try {
            int i = Build.VERSION.SDK_INT;
            u uVar = this.f3937e;
            double d6 = this.f3938f;
            double d7 = this.f3939g;
            q5.o oVar = this.f3940h;
            if (i >= 33) {
                Geocoder geocoder = uVar.f3941b;
                q5.i.b(geocoder);
                geocoder.getFromLocation(d6, d7, 1, new S4.g(oVar, 2));
            } else {
                Geocoder geocoder2 = uVar.f3941b;
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
