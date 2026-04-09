package Id;

import Fd.B;
import Id.a;
import Od.a;
import Rd.a;
import com.ui.wifiman.model.teleport.h;
import com.ui.wifiman.model.teleport.n;
import com.ui.wifiman.model.teleport.tunnel.TeleportAvailableNonFatal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9053a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.UNREACHABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.REACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B.UNSTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9053a = iArr;
        }
    }

    public static final Id.a a(com.ui.wifiman.model.teleport.h console, boolean z10, Od.a aVar) {
        AbstractC6492s.i(console, "console");
        if (!z10) {
            return a.c.d.f9049a;
        }
        if (aVar == null) {
            return a.b.f9045a;
        }
        if (aVar.b() instanceof a.b.AbstractC0620b.C0621a) {
            return a.c.C0371a.f9046a;
        }
        B bS = console.s();
        int i10 = bS == null ? -1 : a.f9053a[bS.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return a.c.b.f9047a;
            }
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Rd.a aVarT = console.t();
        if (aVarT instanceof a.C0705a) {
            return a.c.e.f9050a;
        }
        if (aVarT instanceof a.c) {
            return a.c.f.f9051a;
        }
        if (aVarT instanceof a.b.C0706a) {
            return aVar.a() instanceof a.b.AbstractC0620b.C0621a ? a.c.C0371a.f9046a : a.C0370a.f9044a;
        }
        if (aVarT instanceof a.b.AbstractC0707b.C0709b) {
            Rd.a aVarT2 = console.t();
            a.b.AbstractC0707b.C0709b c0709b = aVarT2 instanceof a.b.AbstractC0707b.C0709b ? (a.b.AbstractC0707b.C0709b) aVarT2 : null;
            Z7.b.f(new TeleportAvailableNonFatal("Teleport unsupported because UnsupportedNetworkVersion : " + (c0709b != null ? c0709b.a() : null)), null, 2, null);
            return a.c.f.f9051a;
        }
        if (!(aVarT instanceof a.b.AbstractC0707b.C0708a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!console.h()) {
            return a.c.C0372c.f9048a;
        }
        n.b bVarY = console.y();
        if ((bVarY instanceof n.b.a.C1472a) || (bVarY instanceof n.b.a.d)) {
            return a.b.f9045a;
        }
        if (bVarY instanceof n.b.a.c) {
            return a.C0370a.f9044a;
        }
        if (!(bVarY instanceof n.b.a.C1473b)) {
            if (bVarY instanceof n.b.C1474b) {
                return a.c.C0372c.f9048a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (console instanceof h.c) {
            return a.c.g.f9052a;
        }
        if (console instanceof h.a) {
            return a.c.C0372c.f9048a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
