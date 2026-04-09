package E0;

import E0.G;
import E0.S;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final G f3764a;

    /* renamed from: b, reason: collision with root package name */
    private final C2637o f3765b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3766c;

    public N(G g10, C2637o c2637o, List list) {
        this.f3764a = g10;
        this.f3765b = c2637o;
        this.f3766c = list;
    }

    private final boolean b(G g10) {
        Object obj;
        G gO0 = g10.o0();
        Object obj2 = null;
        G.e eVarW = gO0 != null ? gO0.W() : null;
        if (g10.q() || (g10.p0() != Integer.MAX_VALUE && gO0 != null && gO0.q())) {
            if (g10.d0()) {
                List list = this.f3766c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i10);
                    S.a aVar = (S.a) obj;
                    if (AbstractC6492s.d(aVar.a(), g10) && !aVar.c()) {
                        break;
                    }
                    i10++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (g10.d0()) {
                return this.f3765b.d(g10) || g10.W() == G.e.LookaheadMeasuring || (gO0 != null && gO0.d0()) || ((gO0 != null && gO0.Y()) || eVarW == G.e.Measuring);
            }
            if (g10.V()) {
                return this.f3765b.d(g10) || gO0 == null || gO0.d0() || gO0.V() || eVarW == G.e.Measuring || eVarW == G.e.LayingOut;
            }
        }
        if (AbstractC6492s.d(g10.N0(), Boolean.TRUE)) {
            if (g10.Y()) {
                List list2 = this.f3766c;
                int size2 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj3 = list2.get(i11);
                    S.a aVar2 = (S.a) obj3;
                    if (AbstractC6492s.d(aVar2.a(), g10) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                    i11++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (g10.Y()) {
                return this.f3765b.e(g10, true) || (gO0 != null && gO0.Y()) || eVarW == G.e.LookaheadMeasuring || (gO0 != null && gO0.d0() && AbstractC6492s.d(g10.a0(), g10));
            }
            if (g10.X()) {
                return this.f3765b.e(g10, true) || gO0 == null || gO0.Y() || gO0.X() || eVarW == G.e.LookaheadMeasuring || eVarW == G.e.LookaheadLayingOut || (gO0.V() && AbstractC6492s.d(g10.a0(), g10));
            }
        }
        return true;
    }

    private final boolean c(G g10) {
        if (!b(g10)) {
            return false;
        }
        List listH = g10.H();
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c((G) listH.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        AbstractC6492s.h(sb2, "append(value)");
        sb2.append('\n');
        AbstractC6492s.h(sb2, "append('\\n')");
        e(this, sb2, this.f3764a, 0);
        return sb2.toString();
    }

    private static final void e(N n10, StringBuilder sb2, G g10, int i10) {
        String strF = n10.f(g10);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            AbstractC6492s.h(sb2, "append(value)");
            sb2.append('\n');
            AbstractC6492s.h(sb2, "append('\\n')");
            i10++;
        }
        List listH = g10.H();
        int size = listH.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(n10, sb2, (G) listH.get(i12), i10);
        }
    }

    private final String f(G g10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(g10.W());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!g10.q()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + g10.f0() + ']');
        if (!b(g10)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (c(this.f3764a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
