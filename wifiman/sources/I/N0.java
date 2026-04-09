package I;

import Ii.InterfaceC3091y0;
import androidx.compose.ui.platform.w1;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class N0 implements R0.L {

    /* renamed from: a, reason: collision with root package name */
    private a f8059a;

    public interface a {
        M.G A0();

        F.E O1();

        InterfaceC3091y0 U0(InterfaceC6839p interfaceC6839p);

        androidx.compose.ui.platform.n1 getSoftwareKeyboardController();

        w1 getViewConfiguration();

        C0.r o1();
    }

    @Override // R0.L
    public final void c() {
        androidx.compose.ui.platform.n1 softwareKeyboardController;
        a aVar = this.f8059a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    @Override // R0.L
    public final void g() {
        androidx.compose.ui.platform.n1 softwareKeyboardController;
        a aVar = this.f8059a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.c();
    }

    protected final a i() {
        return this.f8059a;
    }

    public final void j(a aVar) {
        if (this.f8059a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.f8059a = aVar;
    }

    public abstract void k();

    public final void l(a aVar) {
        if (this.f8059a == aVar) {
            this.f8059a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + aVar + " but was " + this.f8059a).toString());
    }
}
