package c;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;
import h.AbstractActivityC2349g;
import java.util.List;
import q0.C2794g;
import s0.C2885f;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0383h implements InterfaceC0296s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5832c;

    public /* synthetic */ C0383h(Object obj, int i, Object obj2) {
        this.f5830a = i;
        this.f5831b = obj;
        this.f5832c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        switch (this.f5830a) {
            case 0:
                C0371K c0371k = (C0371K) this.f5831b;
                AbstractActivityC2349g abstractActivityC2349g = (AbstractActivityC2349g) this.f5832c;
                if (enumC0291m == EnumC0291m.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = C0384i.f5833a.a(abstractActivityC2349g);
                    q5.i.e(onBackInvokedDispatcherA, "invoker");
                    c0371k.f5806e = onBackInvokedDispatcherA;
                    c0371k.d(c0371k.f5808g);
                    break;
                }
                break;
            default:
                C2885f c2885f = (C2885f) this.f5831b;
                C2794g c2794g = (C2794g) this.f5832c;
                q5.i.e(c2794g, "$entry");
                if (enumC0291m == EnumC0291m.ON_RESUME && ((List) ((C5.o) c2885f.b().f22982e.f73b).I()).contains(c2794g)) {
                    c2885f.b().b(c2794g);
                }
                if (enumC0291m == EnumC0291m.ON_DESTROY && !((List) ((C5.o) c2885f.b().f22982e.f73b).I()).contains(c2794g)) {
                    c2885f.b().b(c2794g);
                    break;
                }
                break;
        }
    }
}
