package androidx.compose.ui.focus;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.InterfaceC2632j;
import E0.V;
import E0.e0;
import Yg.J;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.o;
import f.AbstractC5487d;
import java.util.ArrayList;
import k0.EnumC6353a;
import k0.InterfaceC6354b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.N;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.C7004C;
import org.snmp4j.transport.TLSTM;
import w0.AbstractC8249c;
import w0.AbstractC8250d;

/* loaded from: classes.dex */
public final class FocusOwnerImpl implements k0.g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f28791a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f28792b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6824a f28793c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6824a f28794d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6824a f28795e;

    /* renamed from: g, reason: collision with root package name */
    private final k0.d f28797g;

    /* renamed from: j, reason: collision with root package name */
    private C7004C f28800j;

    /* renamed from: f, reason: collision with root package name */
    private FocusTargetNode f28796f = new FocusTargetNode();

    /* renamed from: h, reason: collision with root package name */
    private final k0.q f28798h = new k0.q();

    /* renamed from: i, reason: collision with root package name */
    private final androidx.compose.ui.e f28799i = m.a(androidx.compose.ui.e.f28771b0, e.f28806a).b0(new V() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // E0.V
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode getNode() {
            return this.f28810a.t();
        }

        @Override // E0.V
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f28810a.t().hashCode();
        }
    });

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28801a;

        static {
            int[] iArr = new int[EnumC6353a.values().length];
            try {
                iArr[EnumC6353a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6353a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6353a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6353a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28801a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28802a = new b();

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ class c extends C6490p implements InterfaceC6824a {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        public final void a() {
            ((FocusOwnerImpl) this.receiver).u();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28803a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f28804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f28803a = focusTargetNode;
            this.f28804b = focusOwnerImpl;
            this.f28805c = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (AbstractC6492s.d(focusTargetNode, this.f28803a)) {
                zBooleanValue = false;
            } else {
                if (AbstractC6492s.d(focusTargetNode, this.f28804b.t())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.f28805c.invoke(focusTargetNode)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28806a = new e();

        e() {
            super(1);
        }

        public final void a(k kVar) {
            kVar.w(false);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f28807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(N n10, int i10) {
            super(1);
            this.f28807a = n10;
            this.f28808b = i10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f28807a.f51689a = s.k(focusTargetNode, this.f28808b);
            Boolean bool = (Boolean) this.f28807a.f51689a;
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10) {
            super(1);
            this.f28809a = i10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean boolK = s.k(focusTargetNode, this.f28809a);
            return Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    public FocusOwnerImpl(InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l2, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3) {
        this.f28791a = interfaceC6839p;
        this.f28792b = interfaceC6835l2;
        this.f28793c = interfaceC6824a;
        this.f28794d = interfaceC6824a2;
        this.f28795e = interfaceC6824a3;
        this.f28797g = new k0.d(interfaceC6835l, new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        if (this.f28796f.K2() == k0.m.Inactive) {
            this.f28793c.invoke();
        }
    }

    private final e.c v(InterfaceC2632j interfaceC2632j) {
        int iA = e0.a(1024) | e0.a(8192);
        if (!interfaceC2632j.h1().k2()) {
            B0.a.b("visitLocalDescendants called on an unattached node");
        }
        e.c cVarH1 = interfaceC2632j.h1();
        e.c cVar = null;
        if ((cVarH1.a2() & iA) != 0) {
            for (e.c cVarB2 = cVarH1.b2(); cVarB2 != null; cVarB2 = cVarB2.b2()) {
                if ((cVarB2.f2() & iA) != 0) {
                    if ((e0.a(1024) & cVarB2.f2()) != 0) {
                        return cVar;
                    }
                    cVar = cVarB2;
                }
            }
        }
        return cVar;
    }

    private final boolean x(KeyEvent keyEvent) {
        long jA = AbstractC8250d.a(keyEvent);
        int iB = AbstractC8250d.b(keyEvent);
        AbstractC8249c.a aVar = AbstractC8249c.f64330a;
        if (AbstractC8249c.e(iB, aVar.a())) {
            C7004C c7004c = this.f28800j;
            if (c7004c == null) {
                c7004c = new C7004C(3);
                this.f28800j = c7004c;
            }
            c7004c.l(jA);
        } else if (AbstractC8249c.e(iB, aVar.b())) {
            C7004C c7004c2 = this.f28800j;
            if (c7004c2 == null || !c7004c2.a(jA)) {
                return false;
            }
            C7004C c7004c3 = this.f28800j;
            if (c7004c3 != null) {
                c7004c3.m(jA);
            }
        }
        return true;
    }

    @Override // k0.g
    public void a(FocusTargetNode focusTargetNode) {
        this.f28797g.d(focusTargetNode);
    }

    @Override // k0.g
    public androidx.compose.ui.e b() {
        return this.f28799i;
    }

    @Override // k0.g
    public boolean e(boolean z10, boolean z11, boolean z12, int i10) {
        boolean zC;
        k0.q qVarG = g();
        b bVar = b.f28802a;
        try {
            if (qVarG.f51016c) {
                qVarG.g();
            }
            qVarG.f();
            if (bVar != null) {
                qVarG.f51015b.b(bVar);
            }
            if (!z10) {
                int i11 = a.f28801a[s.e(this.f28796f, i10).ordinal()];
                zC = (i11 == 1 || i11 == 2 || i11 == 3) ? false : s.c(this.f28796f, z10, z11);
            }
            if (zC && z12) {
                this.f28793c.invoke();
            }
            return zC;
        } finally {
            qVarG.h();
        }
    }

    @Override // k0.g
    public k0.l f() {
        return this.f28796f.K2();
    }

    @Override // k0.g
    public k0.q g() {
        return this.f28798h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [V.b] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [V.b] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // k0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(android.view.KeyEvent r17, mh.InterfaceC6824a r18) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.h(android.view.KeyEvent, mh.a):boolean");
    }

    @Override // k0.g
    public C6533i i() {
        FocusTargetNode focusTargetNodeB = t.b(this.f28796f);
        if (focusTargetNodeB != null) {
            return t.d(focusTargetNodeB);
        }
        return null;
    }

    @Override // k0.g
    public void j(InterfaceC6354b interfaceC6354b) {
        this.f28797g.e(interfaceC6354b);
    }

    @Override // k0.e
    public boolean k(int i10) {
        N n10 = new N();
        n10.f51689a = Boolean.FALSE;
        Boolean boolP = p(i10, (C6533i) this.f28794d.invoke(), new f(n10, i10));
        if (boolP == null || n10.f51689a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (AbstractC6492s.d(boolP, bool) && AbstractC6492s.d(n10.f51689a, bool)) {
            return true;
        }
        return j.a(i10) ? e(false, true, false, i10) && w(i10, null) : ((Boolean) this.f28792b.invoke(androidx.compose.ui.focus.d.i(i10))).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [V.b] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [V.b] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [V.b] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [V.b] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [V.b] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [V.b] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // k0.g
    public boolean l(A0.b bVar) {
        A0.a aVar;
        int size;
        C2620a0 c2620a0K0;
        AbstractC2635m abstractC2635mG;
        C2620a0 c2620a0K02;
        if (this.f28797g.b()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNodeB = t.b(this.f28796f);
        if (focusTargetNodeB != null) {
            int iA = e0.a(TLSTM.TLS_MAX_FRAGMENT_SIZE);
            if (!focusTargetNodeB.h1().k2()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c cVarH1 = focusTargetNodeB.h1();
            G gM = AbstractC2633k.m(focusTargetNodeB);
            loop0: while (true) {
                if (gM == null) {
                    abstractC2635mG = 0;
                    break;
                }
                if ((gM.k0().k().a2() & iA) != 0) {
                    while (cVarH1 != null) {
                        if ((cVarH1.f2() & iA) != 0) {
                            ?? bVar2 = 0;
                            abstractC2635mG = cVarH1;
                            while (abstractC2635mG != 0) {
                                if (abstractC2635mG instanceof A0.a) {
                                    break loop0;
                                }
                                if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                    e.c cVarE2 = abstractC2635mG.E2();
                                    int i10 = 0;
                                    abstractC2635mG = abstractC2635mG;
                                    bVar2 = bVar2;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.f2() & iA) != 0) {
                                            i10++;
                                            bVar2 = bVar2;
                                            if (i10 == 1) {
                                                abstractC2635mG = cVarE2;
                                            } else {
                                                if (bVar2 == 0) {
                                                    bVar2 = new V.b(new e.c[16], 0);
                                                }
                                                if (abstractC2635mG != 0) {
                                                    bVar2.b(abstractC2635mG);
                                                    abstractC2635mG = 0;
                                                }
                                                bVar2.b(cVarE2);
                                            }
                                        }
                                        cVarE2 = cVarE2.b2();
                                        abstractC2635mG = abstractC2635mG;
                                        bVar2 = bVar2;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC2635mG = AbstractC2633k.g(bVar2);
                            }
                        }
                        cVarH1 = cVarH1.h2();
                    }
                }
                gM = gM.o0();
                cVarH1 = (gM == null || (c2620a0K02 = gM.k0()) == null) ? null : c2620a0K02.o();
            }
            aVar = (A0.a) abstractC2635mG;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int iA2 = e0.a(TLSTM.TLS_MAX_FRAGMENT_SIZE);
            if (!aVar.h1().k2()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c cVarH2 = aVar.h1().h2();
            G gM2 = AbstractC2633k.m(aVar);
            ArrayList arrayList = null;
            while (gM2 != null) {
                if ((gM2.k0().k().a2() & iA2) != 0) {
                    while (cVarH2 != null) {
                        if ((cVarH2.f2() & iA2) != 0) {
                            e.c cVarG = cVarH2;
                            V.b bVar3 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof A0.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.f2() & iA2) != 0 && (cVarG instanceof AbstractC2635m)) {
                                    int i11 = 0;
                                    for (e.c cVarE22 = ((AbstractC2635m) cVarG).E2(); cVarE22 != null; cVarE22 = cVarE22.b2()) {
                                        if ((cVarE22.f2() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = cVarE22;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new V.b(new e.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar3.b(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar3.b(cVarE22);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = AbstractC2633k.g(bVar3);
                            }
                        }
                        cVarH2 = cVarH2.h2();
                    }
                }
                gM2 = gM2.o0();
                cVarH2 = (gM2 == null || (c2620a0K0 = gM2.k0()) == null) ? null : c2620a0K0.o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((A0.a) arrayList.get(size)).J0(bVar)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            AbstractC2635m abstractC2635mH1 = aVar.h1();
            ?? bVar4 = 0;
            while (abstractC2635mH1 != 0) {
                if (abstractC2635mH1 instanceof A0.a) {
                    if (((A0.a) abstractC2635mH1).J0(bVar)) {
                        return true;
                    }
                } else if ((abstractC2635mH1.f2() & iA2) != 0 && (abstractC2635mH1 instanceof AbstractC2635m)) {
                    e.c cVarE23 = abstractC2635mH1.E2();
                    int i13 = 0;
                    abstractC2635mH1 = abstractC2635mH1;
                    bVar4 = bVar4;
                    while (cVarE23 != null) {
                        if ((cVarE23.f2() & iA2) != 0) {
                            i13++;
                            bVar4 = bVar4;
                            if (i13 == 1) {
                                abstractC2635mH1 = cVarE23;
                            } else {
                                if (bVar4 == 0) {
                                    bVar4 = new V.b(new e.c[16], 0);
                                }
                                if (abstractC2635mH1 != 0) {
                                    bVar4.b(abstractC2635mH1);
                                    abstractC2635mH1 = 0;
                                }
                                bVar4.b(cVarE23);
                            }
                        }
                        cVarE23 = cVarE23.b2();
                        abstractC2635mH1 = abstractC2635mH1;
                        bVar4 = bVar4;
                    }
                    if (i13 == 1) {
                    }
                }
                abstractC2635mH1 = AbstractC2633k.g(bVar4);
            }
            AbstractC2635m abstractC2635mH12 = aVar.h1();
            ?? bVar5 = 0;
            while (abstractC2635mH12 != 0) {
                if (abstractC2635mH12 instanceof A0.a) {
                    if (((A0.a) abstractC2635mH12).Y0(bVar)) {
                        return true;
                    }
                } else if ((abstractC2635mH12.f2() & iA2) != 0 && (abstractC2635mH12 instanceof AbstractC2635m)) {
                    e.c cVarE24 = abstractC2635mH12.E2();
                    int i14 = 0;
                    abstractC2635mH12 = abstractC2635mH12;
                    bVar5 = bVar5;
                    while (cVarE24 != null) {
                        if ((cVarE24.f2() & iA2) != 0) {
                            i14++;
                            bVar5 = bVar5;
                            if (i14 == 1) {
                                abstractC2635mH12 = cVarE24;
                            } else {
                                if (bVar5 == 0) {
                                    bVar5 = new V.b(new e.c[16], 0);
                                }
                                if (abstractC2635mH12 != 0) {
                                    bVar5.b(abstractC2635mH12);
                                    abstractC2635mH12 = 0;
                                }
                                bVar5.b(cVarE24);
                            }
                        }
                        cVarE24 = cVarE24.b2();
                        abstractC2635mH12 = abstractC2635mH12;
                        bVar5 = bVar5;
                    }
                    if (i14 == 1) {
                    }
                }
                abstractC2635mH12 = AbstractC2633k.g(bVar5);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((A0.a) arrayList.get(i15)).Y0(bVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // k0.g
    public boolean m(KeyEvent keyEvent) {
        C2620a0 c2620a0K0;
        if (this.f28797g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeB = t.b(this.f28796f);
        if (focusTargetNodeB != null) {
            int iA = e0.a(131072);
            if (!focusTargetNodeB.h1().k2()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c cVarH1 = focusTargetNodeB.h1();
            G gM = AbstractC2633k.m(focusTargetNodeB);
            while (gM != null) {
                if ((gM.k0().k().a2() & iA) != 0) {
                    while (cVarH1 != null) {
                        if ((cVarH1.f2() & iA) != 0) {
                            e.c cVarG = cVarH1;
                            V.b bVar = null;
                            while (cVarG != null) {
                                if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                    int i10 = 0;
                                    for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                        if ((cVarE2.f2() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                                cVarG = AbstractC2633k.g(bVar);
                            }
                        }
                        cVarH1 = cVarH1.h2();
                    }
                }
                gM = gM.o0();
                cVarH1 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
            }
            AbstractC5487d.a(null);
        }
        return false;
    }

    @Override // k0.g
    public void n() {
        k0.q qVarG = g();
        if (qVarG.f51016c) {
            s.c(this.f28796f, true, true);
            return;
        }
        try {
            qVarG.f();
            s.c(this.f28796f, true, true);
        } finally {
            qVarG.h();
        }
    }

    @Override // k0.g
    public void o(k0.h hVar) {
        this.f28797g.f(hVar);
    }

    @Override // k0.g
    public Boolean p(int i10, C6533i c6533i, InterfaceC6835l interfaceC6835l) {
        FocusTargetNode focusTargetNodeB = t.b(this.f28796f);
        if (focusTargetNodeB != null) {
            o oVarA = t.a(focusTargetNodeB, i10, (Y0.t) this.f28795e.invoke());
            o.a aVar = o.f28853b;
            if (AbstractC6492s.d(oVarA, aVar.a())) {
                return null;
            }
            if (!AbstractC6492s.d(oVarA, aVar.b())) {
                return Boolean.valueOf(oVarA.c(interfaceC6835l));
            }
        } else {
            focusTargetNodeB = null;
        }
        return t.e(this.f28796f, i10, (Y0.t) this.f28795e.invoke(), c6533i, new d(focusTargetNodeB, this, interfaceC6835l));
    }

    @Override // k0.g
    public boolean q(androidx.compose.ui.focus.d dVar, C6533i c6533i) {
        return ((Boolean) this.f28791a.invoke(dVar, c6533i)).booleanValue();
    }

    @Override // k0.e
    public void r(boolean z10) {
        e(z10, true, true, androidx.compose.ui.focus.d.f28823b.c());
    }

    public final FocusTargetNode t() {
        return this.f28796f;
    }

    public boolean w(int i10, C6533i c6533i) {
        Boolean boolP = p(i10, c6533i, new g(i10));
        if (boolP != null) {
            return boolP.booleanValue();
        }
        return false;
    }
}
