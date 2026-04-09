package j4;

import g4.InterfaceC2336A;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import n4.C2689a;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2569a implements InterfaceC2336A {
    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        Type type = c2689a.f22328b;
        boolean z6 = type instanceof GenericArrayType;
        if (!z6 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z6 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C2570b(mVar, mVar.b(new C2689a(genericComponentType)), i4.i.g(genericComponentType));
    }
}
