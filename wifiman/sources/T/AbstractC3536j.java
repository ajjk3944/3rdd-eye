package T;

/* renamed from: T.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3536j {
    public static final int a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int iL = interfaceC3540l.L();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return iL;
    }

    public static final J0 b(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        J0 j0B = interfaceC3540l.b();
        if (j0B == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        interfaceC3540l.V(j0B);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return j0B;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final AbstractC3550q d(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        AbstractC3550q abstractC3550qM = interfaceC3540l.M();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return abstractC3550qM;
    }
}
