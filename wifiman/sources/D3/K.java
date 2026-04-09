package D3;

import a3.C3754b;
import a3.InterfaceC3759g;
import android.content.Context;
import c3.C4220u;
import f5.InterfaceC5536b;

/* loaded from: classes.dex */
public final class K implements y {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5536b f2841a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5536b f2842b;

    /* renamed from: c, reason: collision with root package name */
    private final B f2843c;

    public K(Context context, B b10) {
        this.f2843c = b10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f34674g;
        C4220u.f(context);
        final a3.i iVarG = C4220u.c().g(aVar);
        if (aVar.a().contains(C3754b.b("json"))) {
            this.f2841a = new F4.t(new InterfaceC5536b() { // from class: D3.H
                @Override // f5.InterfaceC5536b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, C3754b.b("json"), new InterfaceC3759g() { // from class: D3.J
                        @Override // a3.InterfaceC3759g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f2842b = new F4.t(new InterfaceC5536b() { // from class: D3.I
            @Override // f5.InterfaceC5536b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, C3754b.b("proto"), new InterfaceC3759g() { // from class: D3.G
                    @Override // a3.InterfaceC3759g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
