package j4;

import b4.C0344i;
import g4.InterfaceC2336A;
import h4.InterfaceC2365a;
import j$.util.concurrent.ConcurrentHashMap;
import n4.C2689a;

/* renamed from: j4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2579k implements InterfaceC2336A {

    /* renamed from: c, reason: collision with root package name */
    public static final C2578j f21425c;

    /* renamed from: a, reason: collision with root package name */
    public final C0344i f21426a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21427b = new ConcurrentHashMap();

    static {
        int i = 0;
        f21425c = new C2578j(i);
        new C2578j(i);
    }

    public C2579k(C0344i c0344i) {
        this.f21426a = c0344i;
    }

    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        InterfaceC2365a interfaceC2365a = (InterfaceC2365a) c2689a.f22327a.getAnnotation(InterfaceC2365a.class);
        if (interfaceC2365a == null) {
            return null;
        }
        return b(this.f21426a, mVar, c2689a, interfaceC2365a, true);
    }

    public final g4.z b(C0344i c0344i, g4.m mVar, C2689a c2689a, InterfaceC2365a interfaceC2365a, boolean z6) {
        g4.z zVarA;
        Object objD = c0344i.r(new C2689a(interfaceC2365a.value()), true).d();
        boolean zNullSafe = interfaceC2365a.nullSafe();
        if (objD instanceof g4.z) {
            zVarA = (g4.z) objD;
        } else {
            if (!(objD instanceof InterfaceC2336A)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objD.getClass().getName() + " as a @JsonAdapter for " + i4.i.k(c2689a.f22328b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC2336A interfaceC2336A = (InterfaceC2336A) objD;
            if (z6) {
                InterfaceC2336A interfaceC2336A2 = (InterfaceC2336A) this.f21427b.putIfAbsent(c2689a.f22327a, interfaceC2336A);
                if (interfaceC2336A2 != null) {
                    interfaceC2336A = interfaceC2336A2;
                }
            }
            zVarA = interfaceC2336A.a(mVar, c2689a);
        }
        return (zVarA == null || !zNullSafe) ? zVarA : zVarA.a();
    }
}
