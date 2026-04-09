package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import q.AbstractC7402u;
import r.AbstractC7535j;

/* renamed from: N.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3351w implements InterfaceC3326j {

    /* renamed from: a, reason: collision with root package name */
    private final long f14815a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14816b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14817c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14818d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14819e;

    /* renamed from: f, reason: collision with root package name */
    private final long f14820f;

    /* renamed from: g, reason: collision with root package name */
    private final long f14821g;

    /* renamed from: h, reason: collision with root package name */
    private final long f14822h;

    /* renamed from: i, reason: collision with root package name */
    private final long f14823i;

    /* renamed from: j, reason: collision with root package name */
    private final long f14824j;

    /* renamed from: k, reason: collision with root package name */
    private final long f14825k;

    /* renamed from: N.w$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14826a;

        static {
            int[] iArr = new int[K0.a.values().length];
            try {
                iArr[K0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K0.a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K0.a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14826a = iArr;
        }
    }

    public /* synthetic */ C3351w(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    @Override // N.InterfaceC3326j
    public z1 a(boolean z10, K0.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        long j10;
        z1 z1VarN;
        interfaceC3540l.U(840901029);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(840901029, i10, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:425)");
        }
        if (z10) {
            int i11 = a.f14826a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f14817c;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f14818d;
            }
        } else {
            int i12 = a.f14826a[aVar.ordinal()];
            if (i12 == 1) {
                j10 = this.f14819e;
            } else if (i12 == 2) {
                j10 = this.f14821g;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f14820f;
            }
        }
        long j11 = j10;
        if (z10) {
            interfaceC3540l.U(507315190);
            z1VarN = AbstractC7402u.a(j11, AbstractC7535j.l(aVar == K0.a.Off ? 100 : 50, 0, null, 6, null), null, null, interfaceC3540l, 0, 12);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(507495734);
            z1VarN = o1.n(C6733v0.g(j11), interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarN;
    }

    @Override // N.InterfaceC3326j
    public z1 b(boolean z10, K0.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        long j10;
        z1 z1VarN;
        interfaceC3540l.U(-1568341342);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1568341342, i10, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:450)");
        }
        if (z10) {
            int i11 = a.f14826a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f14822h;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f14823i;
            }
        } else {
            int i12 = a.f14826a[aVar.ordinal()];
            if (i12 == 1) {
                j10 = this.f14824j;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f14824j;
            } else {
                j10 = this.f14825k;
            }
        }
        long j11 = j10;
        if (z10) {
            interfaceC3540l.U(-840809961);
            z1VarN = AbstractC7402u.a(j11, AbstractC7535j.l(aVar == K0.a.Off ? 100 : 50, 0, null, 6, null), null, null, interfaceC3540l, 0, 12);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(-840629417);
            z1VarN = o1.n(C6733v0.g(j11), interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarN;
    }

    @Override // N.InterfaceC3326j
    public z1 c(K0.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(544656267);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(544656267, i10, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:413)");
        }
        K0.a aVar2 = K0.a.Off;
        z1 z1VarA = AbstractC7402u.a(aVar == aVar2 ? this.f14816b : this.f14815a, AbstractC7535j.l(aVar == aVar2 ? 100 : 50, 0, null, 6, null), null, null, interfaceC3540l, 0, 12);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }

    private C3351w(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f14815a = j10;
        this.f14816b = j11;
        this.f14817c = j12;
        this.f14818d = j13;
        this.f14819e = j14;
        this.f14820f = j15;
        this.f14821g = j16;
        this.f14822h = j17;
        this.f14823i = j18;
        this.f14824j = j19;
        this.f14825k = j20;
    }
}
