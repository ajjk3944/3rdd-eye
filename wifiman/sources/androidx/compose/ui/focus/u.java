package androidx.compose.ui.focus;

import E0.AbstractC2633k;
import E0.G;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final u f28866a = new u();

    private u() {
    }

    private final V.b b(G g10) {
        V.b bVar = new V.b(new G[16], 0);
        while (g10 != null) {
            bVar.a(0, g10);
            g10 = g10.o0();
        }
        return bVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i10 = 0;
        if (!t.g(focusTargetNode) || !t.g(focusTargetNode2)) {
            if (t.g(focusTargetNode)) {
                return -1;
            }
            return t.g(focusTargetNode2) ? 1 : 0;
        }
        G gM = AbstractC2633k.m(focusTargetNode);
        G gM2 = AbstractC2633k.m(focusTargetNode2);
        if (AbstractC6492s.d(gM, gM2)) {
            return 0;
        }
        V.b bVarB = b(gM);
        V.b bVarB2 = b(gM2);
        int iMin = Math.min(bVarB.o() - 1, bVarB2.o() - 1);
        if (iMin >= 0) {
            while (AbstractC6492s.d(bVarB.m()[i10], bVarB2.m()[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return AbstractC6492s.k(((G) bVarB.m()[i10]).p0(), ((G) bVarB2.m()[i10]).p0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
