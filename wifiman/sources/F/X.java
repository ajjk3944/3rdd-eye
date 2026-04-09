package F;

import L0.AbstractC3190u;
import L0.InterfaceC3186p;
import Q0.AbstractC3434k;
import Zg.AbstractC3689v;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4956a = kotlin.text.t.H("H", 10);

    public static final long a(L0.U u10, Y0.d dVar, AbstractC3434k.b bVar, String str, int i10) {
        InterfaceC3186p interfaceC3186pA = AbstractC3190u.a(str, u10, Y0.c.b(0, 0, 0, 0, 15, null), dVar, bVar, (64 & 32) != 0 ? AbstractC3689v.l() : AbstractC3689v.l(), (64 & 64) != 0 ? AbstractC3689v.l() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : false);
        return Y0.s.a(T.a(interfaceC3186pA.a()), T.a(interfaceC3186pA.getHeight()));
    }

    public static /* synthetic */ long b(L0.U u10, Y0.d dVar, AbstractC3434k.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f4956a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(u10, dVar, bVar, str, i10);
    }

    public static final String c() {
        return f4956a;
    }
}
