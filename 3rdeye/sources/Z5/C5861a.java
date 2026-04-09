package z5;

import B.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5861a {
    public final List<I4.a<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (I4.a<?> aVar : componentRegistrar.getComponents()) {
            String str = aVar.f2433a;
            if (str != null) {
                i iVar = new i(13, str, aVar);
                aVar = new I4.a<>(str, aVar.f2434b, aVar.f2435c, aVar.f2436d, aVar.f2437e, iVar, aVar.f2439g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
