package androidx.compose.ui.focus;

import C0.AbstractC2526f;
import C0.InterfaceC2525e;
import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.InterfaceC2630h;
import E0.V;
import E0.e0;
import E0.h0;
import E0.i0;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes.dex */
public final class FocusTargetNode extends e.c implements InterfaceC2630h, k0.n, h0, D0.h {

    /* renamed from: n, reason: collision with root package name */
    private boolean f28813n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28814o;

    /* renamed from: p, reason: collision with root package name */
    private k0.m f28815p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f28816q;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "LE0/V;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "d", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final FocusTargetElement f28817a = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // E0.V
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return new FocusTargetNode();
        }

        @Override // E0.V
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28818a;

        static {
            int[] iArr = new int[k0.m.values().length];
            try {
                iArr[k0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.m.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28818a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f28819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10, FocusTargetNode focusTargetNode) {
            super(0);
            this.f28819a = n10;
            this.f28820b = focusTargetNode;
        }

        public final void a() {
            this.f28819a.f51689a = this.f28820b.I2();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    private final void L2() {
        if (O2(this)) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        k0.q qVarD = k0.p.d(this);
        try {
            if (qVarD.f51016c) {
                qVarD.g();
            }
            qVarD.f();
            Q2((N2(this) && M2(this)) ? k0.m.ActiveParent : k0.m.Inactive);
            J j10 = J.f24997a;
            qVarD.h();
        } catch (Throwable th2) {
            qVarD.h();
            throw th2;
        }
    }

    private static final boolean M2(FocusTargetNode focusTargetNode) {
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            B0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.b bVar = new V.b(new e.c[16], 0);
        e.c cVarB2 = focusTargetNode.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar, focusTargetNode.h1());
        } else {
            bVar.b(cVarB2);
        }
        while (bVar.u()) {
            e.c cVar = (e.c) bVar.z(bVar.o() - 1);
            if ((cVar.a2() & iA) != 0) {
                for (e.c cVarB22 = cVar; cVarB22 != null; cVarB22 = cVarB22.b2()) {
                    if ((cVarB22.f2() & iA) != 0) {
                        e.c cVarG = cVarB22;
                        V.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (O2(focusTargetNode2)) {
                                    int i10 = a.f28818a[focusTargetNode2.K2().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i11 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar2.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar2.b(cVarE2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar2);
                        }
                    }
                }
            }
            AbstractC2633k.c(bVar, cVar);
        }
        return false;
    }

    private static final boolean N2(FocusTargetNode focusTargetNode) {
        C2620a0 c2620a0K0;
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = focusTargetNode.h1().h2();
        G gM = AbstractC2633k.m(focusTargetNode);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        e.c cVarG = cVarH2;
                        V.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (O2(focusTargetNode2)) {
                                    int i10 = a.f28818a[focusTargetNode2.K2().ordinal()];
                                    if (i10 == 1 || i10 == 2) {
                                        return false;
                                    }
                                    if (i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i11 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH2 = cVarH2.h2();
                }
            }
            gM = gM.o0();
            cVarH2 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
        return false;
    }

    private static final boolean O2(FocusTargetNode focusTargetNode) {
        return focusTargetNode.f28815p != null;
    }

    public final void H2() {
        k0.m mVarI = k0.p.d(this).i(this);
        if (mVarI != null) {
            this.f28815p = mVarI;
        } else {
            B0.a.c("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final k I2() {
        C2620a0 c2620a0K0;
        l lVar = new l();
        int iA = e0.a(2048);
        int iA2 = e0.a(1024);
        e.c cVarH1 = h1();
        int i10 = iA | iA2;
        if (!h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH12 = h1();
        G gM = AbstractC2633k.m(this);
        loop0: while (gM != null) {
            if ((gM.k0().k().a2() & i10) != 0) {
                while (cVarH12 != null) {
                    if ((cVarH12.f2() & i10) != 0) {
                        if (cVarH12 != cVarH1 && (cVarH12.f2() & iA2) != 0) {
                            break loop0;
                        }
                        if ((cVarH12.f2() & iA) != 0) {
                            AbstractC2635m abstractC2635mG = cVarH12;
                            ?? bVar = 0;
                            while (abstractC2635mG != 0) {
                                if (abstractC2635mG instanceof k0.h) {
                                    ((k0.h) abstractC2635mG).o0(lVar);
                                } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                    e.c cVarE2 = abstractC2635mG.E2();
                                    int i11 = 0;
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.f2() & iA) != 0) {
                                            i11++;
                                            bVar = bVar;
                                            if (i11 == 1) {
                                                abstractC2635mG = cVarE2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new V.b(new e.c[16], 0);
                                                }
                                                if (abstractC2635mG != 0) {
                                                    bVar.b(abstractC2635mG);
                                                    abstractC2635mG = 0;
                                                }
                                                bVar.b(cVarE2);
                                            }
                                        }
                                        cVarE2 = cVarE2.b2();
                                        abstractC2635mG = abstractC2635mG;
                                        bVar = bVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2635mG = AbstractC2633k.g(bVar);
                            }
                        }
                    }
                    cVarH12 = cVarH12.h2();
                }
            }
            gM = gM.o0();
            cVarH12 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
        return lVar;
    }

    public final InterfaceC2525e J2() {
        return (InterfaceC2525e) z(AbstractC2526f.a());
    }

    public k0.m K2() {
        k0.m mVarI;
        k0.q qVarB = k0.p.b(this);
        if (qVarB != null && (mVarI = qVarB.i(this)) != null) {
            return mVarI;
        }
        k0.m mVar = this.f28815p;
        return mVar == null ? k0.m.Inactive : mVar;
    }

    public final void P2() {
        k kVar;
        if (this.f28815p == null) {
            L2();
        }
        int i10 = a.f28818a[K2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            N n10 = new N();
            i0.a(this, new b(n10, this));
            Object obj = n10.f51689a;
            if (obj == null) {
                AbstractC6492s.v("focusProperties");
                kVar = null;
            } else {
                kVar = (k) obj;
            }
            if (kVar.o()) {
                return;
            }
            AbstractC2633k.n(this).getFocusOwner().r(true);
        }
    }

    public void Q2(k0.m mVar) {
        k0.p.d(this).j(this, mVar);
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f28816q;
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        int i10 = a.f28818a[K2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            AbstractC2633k.n(this).getFocusOwner().e(true, true, false, d.f28823b.c());
            k0.p.c(this);
        } else if (i10 == 3) {
            k0.q qVarD = k0.p.d(this);
            try {
                if (qVarD.f51016c) {
                    qVarD.g();
                }
                qVarD.f();
                Q2(k0.m.Inactive);
                J j10 = J.f24997a;
                qVarD.h();
            } catch (Throwable th2) {
                qVarD.h();
                throw th2;
            }
        }
        this.f28815p = null;
    }

    @Override // E0.h0
    public void q1() {
        k0.m mVarK2 = K2();
        P2();
        if (mVarK2 != K2()) {
            k0.c.c(this);
        }
    }
}
