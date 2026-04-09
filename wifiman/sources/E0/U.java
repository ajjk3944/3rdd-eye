package E0;

import C0.InterfaceC2535o;
import E0.G;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class U {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3807a;

        static {
            int[] iArr = new int[G.e.values().length];
            try {
                iArr[G.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3807a = iArr;
        }
    }

    public static final List a(InterfaceC2535o interfaceC2535o) {
        AbstractC6492s.g(interfaceC2535o, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        G gG1 = ((T) interfaceC2535o).G1();
        boolean zB = b(gG1);
        List listM = gG1.M();
        ArrayList arrayList = new ArrayList(listM.size());
        int size = listM.size();
        for (int i10 = 0; i10 < size; i10++) {
            G g10 = (G) listM.get(i10);
            arrayList.add(zB ? g10.F() : g10.G());
        }
        return arrayList;
    }

    private static final boolean b(G g10) {
        int i10 = a.f3807a[g10.W().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        G gO0 = g10.o0();
        if (gO0 != null) {
            return b(gO0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
