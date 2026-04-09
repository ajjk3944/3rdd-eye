package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* renamed from: Li.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3223j {

    /* renamed from: Li.j$a */
    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f11917a;

        public a(Object obj) {
            this.f11917a = obj;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objA = interfaceC3221h.a(this.f11917a, interfaceC5380e);
            return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
        }
    }

    public static final InterfaceC3220g a(InterfaceC6839p interfaceC6839p) {
        return new C3215b(interfaceC6839p, null, 0, null, 14, null);
    }

    public static final InterfaceC3220g b() {
        return C3219f.f11916a;
    }

    public static final InterfaceC3220g c(InterfaceC6839p interfaceC6839p) {
        return new C(interfaceC6839p);
    }

    public static final InterfaceC3220g d(Object obj) {
        return new a(obj);
    }
}
