package T4;

import android.location.Location;
import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import p5.p;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class j extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public l f3613e;

    /* renamed from: f, reason: collision with root package name */
    public int f3614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f3615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Location f3616h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Location location, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3615g = lVar;
        this.f3616h = location;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((j) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new j(this.f3615g, this.f3616h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        l lVar;
        int i = this.f3614f;
        if (i == 0) {
            R2.a.H(obj);
            Location location = this.f3616h;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            l lVar2 = this.f3615g;
            this.f3613e = lVar2;
            this.f3614f = 1;
            obj = l.e(lVar2, latitude, longitude, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (obj == enumC2380a) {
                return enumC2380a;
            }
            lVar = lVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.f3613e;
            R2.a.H(obj);
        }
        lVar.f3629k.j((String) obj);
        return C0412i.f5929a;
    }
}
