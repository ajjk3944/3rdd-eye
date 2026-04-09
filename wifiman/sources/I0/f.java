package I0;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import Yg.J;
import android.os.CancellationSignal;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class f {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f8430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f8430a = cancellationSignal;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f8430a.cancel();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3091y0 c(N n10, CancellationSignal cancellationSignal, InterfaceC6839p interfaceC6839p) {
        final InterfaceC3091y0 interfaceC3091y0D = AbstractC3063k.d(n10, null, null, interfaceC6839p, 3, null);
        interfaceC3091y0D.invokeOnCompletion(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: I0.e
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                f.d(interfaceC3091y0D);
            }
        });
        return interfaceC3091y0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC3091y0 interfaceC3091y0) {
        InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
    }
}
