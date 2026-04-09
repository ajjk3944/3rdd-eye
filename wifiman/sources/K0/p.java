package k0;

import E0.AbstractC2624c0;
import E0.AbstractC2633k;
import E0.G;
import E0.m0;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: classes.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q b(FocusTargetNode focusTargetNode) {
        G gG1;
        m0 m0VarN0;
        g focusOwner;
        AbstractC2624c0 abstractC2624c0C2 = focusTargetNode.h1().c2();
        if (abstractC2624c0C2 == null || (gG1 = abstractC2624c0C2.G1()) == null || (m0VarN0 = gG1.n0()) == null || (focusOwner = m0VarN0.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.g();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        AbstractC2633k.n(focusTargetNode).getFocusOwner().a(focusTargetNode);
    }

    public static final q d(FocusTargetNode focusTargetNode) {
        return AbstractC2633k.n(focusTargetNode).getFocusOwner().g();
    }
}
