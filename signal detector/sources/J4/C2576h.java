package j4;

import g4.InterfaceC2336A;
import n4.C2689a;

/* renamed from: j4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2576h implements InterfaceC2336A {
    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        Class superclass = c2689a.f22327a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new C2577i(superclass);
    }
}
