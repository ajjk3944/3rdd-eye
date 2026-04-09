package or;

import ht.b0;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19668a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f19669d;

    public /* synthetic */ f(h hVar, int i10) {
        this.f19668a = i10;
        this.f19669d = hVar;
    }

    @Override // ar.a
    public final Object c() {
        int i10 = this.f19668a;
        h hVar = this.f19669d;
        switch (i10) {
            case 0:
                return Arrays.asList(hVar.k().J0(o.j), hVar.k().J0(o.f19722l), hVar.k().J0(o.f19723m), hVar.k().J0(o.k));
            default:
                EnumMap enumMap = new EnumMap(k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (k kVar : k.values()) {
                    String strB = kVar.getTypeName().b();
                    if (strB == null) {
                        h.a(46);
                        throw null;
                    }
                    b0 b0VarQ = hVar.j(strB).q();
                    if (b0VarQ == null) {
                        h.a(47);
                        throw null;
                    }
                    String strB2 = kVar.getArrayTypeName().b();
                    if (strB2 == null) {
                        h.a(46);
                        throw null;
                    }
                    b0 b0VarQ2 = hVar.j(strB2).q();
                    if (b0VarQ2 == null) {
                        h.a(47);
                        throw null;
                    }
                    enumMap.put((EnumMap) kVar, (k) b0VarQ2);
                    map.put(b0VarQ, b0VarQ2);
                    map2.put(b0VarQ2, b0VarQ);
                }
                return new g(enumMap, map, map2);
        }
    }
}
