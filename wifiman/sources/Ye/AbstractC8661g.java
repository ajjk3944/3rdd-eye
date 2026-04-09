package ye;

import Ii.C3048c0;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.J;
import Li.P;
import Li.z;
import Yg.J;
import Yg.m;
import Yg.n;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.N;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.snmp4j.mp.PduHandle;
import th.l;
import ye.C8656b;

/* renamed from: ye.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8661g extends N implements InterfaceC4007e {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ l[] f66743e = {O.g(new D(AbstractC8661g.class, "scopedFlow", "<v#0>", 0)), O.g(new D(AbstractC8661g.class, "scopedFlow", "<v#1>", 0))};

    /* renamed from: f, reason: collision with root package name */
    public static final int f66744f = 8;

    /* renamed from: b, reason: collision with root package name */
    private E f66745b;

    /* renamed from: c, reason: collision with root package name */
    private final m f66746c = n.b(new InterfaceC6824a() { // from class: ye.e
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return AbstractC8661g.Z();
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3220g f66747d = k0();

    /* renamed from: ye.g$a */
    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f66748a;

        /* renamed from: ye.g$a$a, reason: collision with other inner class name */
        public static final class C2369a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f66749a;

            /* renamed from: ye.g$a$a$a, reason: collision with other inner class name */
            public static final class C2370a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f66750a;

                /* renamed from: b, reason: collision with root package name */
                int f66751b;

                public C2370a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f66750a = obj;
                    this.f66751b |= PduHandle.NONE;
                    return C2369a.this.a(null, this);
                }
            }

            public C2369a(InterfaceC3221h interfaceC3221h) {
                this.f66749a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ye.AbstractC8661g.a.C2369a.C2370a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ye.g$a$a$a r0 = (ye.AbstractC8661g.a.C2369a.C2370a) r0
                    int r1 = r0.f66751b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f66751b = r1
                    goto L18
                L13:
                    ye.g$a$a$a r0 = new ye.g$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f66750a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f66751b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f66749a
                    l9.a r5 = (l9.C6556a) r5
                    java.lang.Object r5 = r5.b()
                    r0.f66751b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ye.AbstractC8661g.a.C2369a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public a(InterfaceC3220g interfaceC3220g) {
            this.f66748a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f66748a.b(new C2369a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z Z() {
        return P.a(AbstractC4013k.b.INITIALIZED);
    }

    public static /* synthetic */ Li.N c0(AbstractC8661g abstractC8661g, InterfaceC3220g interfaceC3220g, Object obj, boolean z10, AbstractC4013k.b bVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asLifecycleStateFlow");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            bVar = AbstractC4013k.b.STARTED;
        }
        return abstractC8661g.a0(interfaceC3220g, obj, z10, bVar);
    }

    public static /* synthetic */ Li.N d0(AbstractC8661g abstractC8661g, gg.i iVar, Object obj, boolean z10, AbstractC4013k.b bVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asLifecycleStateFlow");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            bVar = AbstractC4013k.b.STARTED;
        }
        return abstractC8661g.b0(iVar, obj, z10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3220g e0(InterfaceC3220g interfaceC3220g) {
        return AbstractC3222i.C(interfaceC3220g, C3048c0.a());
    }

    private static final InterfaceC3220g f0(C8656b.a aVar) {
        return aVar.c(null, f66743e[0]);
    }

    public static /* synthetic */ Li.N h0(AbstractC8661g abstractC8661g, gg.i iVar, Object obj, AbstractC4013k.b bVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asLifecycleStateFlow");
        }
        if ((i10 & 2) != 0) {
            bVar = AbstractC4013k.b.STARTED;
        }
        return abstractC8661g.g0(iVar, obj, bVar);
    }

    private final z k0() {
        return (z) this.f66746c.getValue();
    }

    protected final Li.N a0(final InterfaceC3220g interfaceC3220g, Object obj, boolean z10, AbstractC4013k.b isAtLeast) {
        AbstractC6492s.i(interfaceC3220g, "<this>");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        return AbstractC3222i.M(f0(C8656b.f66710a.b(this, isAtLeast, new InterfaceC6824a() { // from class: ye.f
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AbstractC8661g.e0(interfaceC3220g);
            }
        })), androidx.lifecycle.O.a(this), J.a.b(Li.J.f11860a, 0L, !z10 ? Long.MAX_VALUE : 0L, 1, null), obj);
    }

    protected final Li.N b0(gg.i iVar, Object initialValue, boolean z10, AbstractC4013k.b isAtLeast) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(initialValue, "initialValue");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        return a0(Pi.e.a(iVar), initialValue, z10, isAtLeast);
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void g(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.g(owner);
        k0().setValue(AbstractC4013k.b.RESUMED);
    }

    protected final Li.N g0(gg.i iVar, Object obj, AbstractC4013k.b isAtLeast) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        return c0(this, new a(Pi.e.a(iVar)), obj, false, isAtLeast, 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void h(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.h(owner);
        k0().setValue(AbstractC4013k.b.CREATED);
    }

    public final InterfaceC3220g i0() {
        return this.f66747d;
    }

    protected final E j0() {
        E e10 = this.f66745b;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException("SavedStateHandle not set");
    }

    public void l0() {
    }

    public final void m0(E handle) {
        AbstractC6492s.i(handle, "handle");
        this.f66745b = handle;
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void onDestroy(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.onDestroy(owner);
        k0().setValue(AbstractC4013k.b.DESTROYED);
    }

    public void onStart(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.onStart(owner);
        k0().setValue(AbstractC4013k.b.STARTED);
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void onStop(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.onStop(owner);
        k0().setValue(AbstractC4013k.b.CREATED);
    }

    public void p(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.p(owner);
        k0().setValue(AbstractC4013k.b.STARTED);
    }
}
