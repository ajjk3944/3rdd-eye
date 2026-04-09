package I4;

import M4.o;
import f.AbstractC5487d;
import f5.InterfaceC5535a;
import f5.InterfaceC5536b;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5535a f8624a;

    public l(InterfaceC5535a interfaceC5535a) {
        this.f8624a = interfaceC5535a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, InterfaceC5536b interfaceC5536b) {
        AbstractC5487d.a(interfaceC5536b.get());
        throw null;
    }

    public void c(o oVar) {
        if (oVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(oVar);
            this.f8624a.a(new InterfaceC5535a.InterfaceC1759a() { // from class: I4.k
                @Override // f5.InterfaceC5535a.InterfaceC1759a
                public final void a(InterfaceC5536b interfaceC5536b) {
                    l.b(eVar, interfaceC5536b);
                }
            });
        }
    }
}
