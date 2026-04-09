package j4;

import b4.C0344i;
import g4.InterfaceC2336A;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import n4.C2689a;

/* renamed from: j4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2572d implements InterfaceC2336A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21415a;

    /* renamed from: b, reason: collision with root package name */
    public final C0344i f21416b;

    public /* synthetic */ C2572d(C0344i c0344i, int i) {
        this.f21415a = i;
        this.f21416b = c0344i;
    }

    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f21415a;
        C0344i c0344i = this.f21416b;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = c2689a.f22328b;
                Class cls2 = c2689a.f22327a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type typeH = i4.i.h(type, cls2, Collection.class);
                cls = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new C2571c(new C2581m(mVar, mVar.b(new C2689a(cls)), cls), c0344i.r(c2689a, false));
            default:
                Type type2 = c2689a.f22328b;
                Class cls3 = c2689a.f22327a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeH2 = i4.i.h(type2, cls3, Map.class);
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C2581m(this, new C2581m(mVar, (type3 == Boolean.TYPE || type3 == Boolean.class) ? b0.f21389c : mVar.b(new C2689a(type3)), type3), new C2581m(mVar, mVar.b(new C2689a(type4)), type4), c0344i.r(c2689a, false));
        }
    }
}
