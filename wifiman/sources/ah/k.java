package Ah;

import Bh.G;
import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class k extends kotlin.reflect.jvm.internal.impl.builtins.i {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f808k = {O.h(new F(O.b(k.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h, reason: collision with root package name */
    private final a f809h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6824a f810i;

    /* renamed from: j, reason: collision with root package name */
    private final oi.i f811j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FROM_DEPENDENCIES = new a("FROM_DEPENDENCIES", 0);
        public static final a FROM_CLASS_LOADER = new a("FROM_CLASS_LOADER", 1);
        public static final a FALLBACK = new a("FALLBACK", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final G f812a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f813b;

        public b(G ownerModuleDescriptor, boolean z10) {
            AbstractC6492s.i(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f812a = ownerModuleDescriptor;
            this.f813b = z10;
        }

        public final G a() {
            return this.f812a;
        }

        public final boolean b() {
            return this.f813b;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f814a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f814a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(oi.n storageManager, a kind) {
        super(storageManager);
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(kind, "kind");
        this.f809h = kind;
        this.f811j = storageManager.f(new h(this, storageManager));
        int i10 = c.f814a[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I0(k kVar, oi.n nVar) {
        Dh.F fR = kVar.r();
        AbstractC6492s.h(fR, "getBuiltInsModule(...)");
        return new u(fR, nVar, new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b J0(k kVar) {
        InterfaceC6824a interfaceC6824a = kVar.f810i;
        if (interfaceC6824a == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) interfaceC6824a.invoke();
        kVar.f810i = null;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b N0(G g10, boolean z10) {
        return new b(g10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.i
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List v() {
        Iterable iterableV = super.v();
        AbstractC6492s.h(iterableV, "getClassDescriptorFactories(...)");
        oi.n nVarU = U();
        AbstractC6492s.h(nVarU, "getStorageManager(...)");
        Dh.F fR = r();
        AbstractC6492s.h(fR, "getBuiltInsModule(...)");
        return AbstractC3689v.L0(iterableV, new g(nVarU, fR, null, 4, null));
    }

    public final u L0() {
        return (u) oi.m.a(this.f811j, this, f808k[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.i
    protected Ch.c M() {
        return L0();
    }

    public final void M0(G moduleDescriptor, boolean z10) {
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        O0(new i(moduleDescriptor, z10));
    }

    public final void O0(InterfaceC6824a computation) {
        AbstractC6492s.i(computation, "computation");
        this.f810i = computation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.i
    protected Ch.a g() {
        return L0();
    }
}
