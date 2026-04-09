package r5;

import F4.d;
import F4.g;
import F4.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7574b implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, F4.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    @Override // F4.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final F4.c cVarT : componentRegistrar.getComponents()) {
            final String strI = cVarT.i();
            if (strI != null) {
                cVarT = cVarT.t(new g() { // from class: r5.a
                    @Override // F4.g
                    public final Object a(d dVar) {
                        return C7574b.c(strI, cVarT, dVar);
                    }
                });
            }
            arrayList.add(cVarT);
        }
        return arrayList;
    }
}
