package g0;

import Yg.J;
import java.util.LinkedHashMap;
import java.util.Map;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Map f47379a = new LinkedHashMap();

    public final Map a() {
        return this.f47379a;
    }

    public final J b(int i10, String str) {
        InterfaceC6835l interfaceC6835lF;
        h hVar = (h) this.f47379a.get(Integer.valueOf(i10));
        if (hVar == null || (interfaceC6835lF = hVar.f()) == null) {
            return null;
        }
        interfaceC6835lF.invoke(str);
        return J.f24997a;
    }

    public final void c(h hVar) {
        this.f47379a.put(Integer.valueOf(hVar.e()), hVar);
    }
}
