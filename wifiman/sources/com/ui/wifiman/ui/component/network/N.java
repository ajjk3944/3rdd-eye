package com.ui.wifiman.ui.component.network;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import com.ui.wifiman.ui.component.network.C5219q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class N implements C5219q.c {

    /* renamed from: a, reason: collision with root package name */
    private final M f44351a;

    /* renamed from: b, reason: collision with root package name */
    private final L f44352b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44353c;

    /* renamed from: d, reason: collision with root package name */
    private final List f44354d;

    static final class a implements InterfaceC6839p {

        /* renamed from: com.ui.wifiman.ui.component.network.N$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1548a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44356a;

            static {
                int[] iArr = new int[L.values().length];
                try {
                    iArr[L.REACHABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[L.UNREACHABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[L.REACHABLE_WITH_ISSUES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[L.CHECKING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f44356a = iArr;
            }
        }

        a() {
        }

        public final long a(InterfaceC3540l interfaceC3540l, int i10) {
            long jF;
            interfaceC3540l.U(1273933286);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1273933286, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.Model.<get-connectionColor>.<anonymous> (WifimanNetworkTopology.kt:118)");
            }
            int i11 = C1548a.f44356a[N.this.f().ordinal()];
            if (i11 == 1) {
                interfaceC3540l.U(-921479353);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
                interfaceC3540l.J();
            } else if (i11 == 2) {
                interfaceC3540l.U(-921476921);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f();
                interfaceC3540l.J();
            } else if (i11 == 3) {
                interfaceC3540l.U(-921474073);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
                interfaceC3540l.J();
            } else {
                if (i11 != 4) {
                    interfaceC3540l.U(-921482131);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-921471609);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i();
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jF;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
        }
    }

    public N(M initialItem, L connectionState, boolean z10, List items) {
        AbstractC6492s.i(initialItem, "initialItem");
        AbstractC6492s.i(connectionState, "connectionState");
        AbstractC6492s.i(items, "items");
        this.f44351a = initialItem;
        this.f44352b = connectionState;
        this.f44353c = z10;
        this.f44354d = items;
    }

    public static /* synthetic */ N e(N n10, M m10, L l10, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            m10 = n10.f44351a;
        }
        if ((i10 & 2) != 0) {
            l10 = n10.f44352b;
        }
        if ((i10 & 4) != 0) {
            z10 = n10.f44353c;
        }
        if ((i10 & 8) != 0) {
            list = n10.f44354d;
        }
        return n10.d(m10, l10, z10, list);
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.c
    public List a() {
        return this.f44354d;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.c
    public InterfaceC6839p c() {
        return new a();
    }

    public final N d(M initialItem, L connectionState, boolean z10, List items) {
        AbstractC6492s.i(initialItem, "initialItem");
        AbstractC6492s.i(connectionState, "connectionState");
        AbstractC6492s.i(items, "items");
        return new N(initialItem, connectionState, z10, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC6492s.d(this.f44351a, n10.f44351a) && this.f44352b == n10.f44352b && this.f44353c == n10.f44353c && AbstractC6492s.d(this.f44354d, n10.f44354d);
    }

    public final L f() {
        return this.f44352b;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public M b() {
        return this.f44351a;
    }

    public final List h() {
        return this.f44354d;
    }

    public int hashCode() {
        return (((((this.f44351a.hashCode() * 31) + this.f44352b.hashCode()) * 31) + Boolean.hashCode(this.f44353c)) * 31) + this.f44354d.hashCode();
    }

    public final boolean i() {
        return this.f44353c;
    }

    public String toString() {
        return "Model(initialItem=" + this.f44351a + ", connectionState=" + this.f44352b + ", isVpnActive=" + this.f44353c + ", items=" + this.f44354d + ")";
    }
}
