package w;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class z {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f64039a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1 z1Var) {
            super(1);
            this.f64039a = z1Var;
        }

        public final Float a(float f10) {
            return (Float) ((InterfaceC6835l) this.f64039a.getValue()).invoke(Float.valueOf(f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public static final y a(InterfaceC6835l interfaceC6835l) {
        return new i(interfaceC6835l);
    }

    public static final y b(InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        z1 z1VarN = o1.n(interfaceC6835l, interfaceC3540l, i10 & 14);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = a(new a(z1VarN));
            interfaceC3540l.K(objF);
        }
        y yVar = (y) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return yVar;
    }
}
