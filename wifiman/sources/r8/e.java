package r8;

import Cc.m;
import Dc.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import r8.d;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public abstract class e {
    public static final List a(j jVar, boolean z10, boolean z11) {
        AbstractC6492s.i(jVar, "<this>");
        ArrayList arrayList = new ArrayList();
        if (jVar.F() != null) {
            arrayList.add(new d.C2092d(z10));
        }
        if (jVar.C() != null) {
            arrayList.add(new d.c(z10));
        }
        if (AbstractC6492s.d(jVar.v(), Boolean.TRUE)) {
            arrayList.add(new d.b(z10));
        }
        if (jVar.z() != null) {
            arrayList.add(new d.a(z10));
        }
        InterfaceC8439a.d dVarF = jVar.f();
        if ((dVarF == null || m.a(dVarF)) && z11) {
            if (jVar.K() != null) {
                arrayList.add(new d.f(z10));
            }
            if (jVar.J() != null) {
                arrayList.add(new d.e(z10));
            }
        }
        return arrayList;
    }
}
