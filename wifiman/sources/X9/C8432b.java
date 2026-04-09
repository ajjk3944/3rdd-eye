package x9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q.AbstractC7402u;
import r.AbstractC7535j;

/* renamed from: x9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8432b implements InterfaceC8433c {

    /* renamed from: a, reason: collision with root package name */
    private final long f65450a;

    /* renamed from: b, reason: collision with root package name */
    private final long f65451b;

    /* renamed from: c, reason: collision with root package name */
    private final long f65452c;

    /* renamed from: d, reason: collision with root package name */
    private final long f65453d;

    /* renamed from: e, reason: collision with root package name */
    private final long f65454e;

    /* renamed from: f, reason: collision with root package name */
    private final long f65455f;

    /* renamed from: g, reason: collision with root package name */
    private final long f65456g;

    /* renamed from: h, reason: collision with root package name */
    private final long f65457h;

    /* renamed from: i, reason: collision with root package name */
    private final long f65458i;

    /* renamed from: x9.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65459a;

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
            f65459a = iArr;
        }
    }

    public /* synthetic */ C8432b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @Override // x9.InterfaceC8433c
    public z1 a(boolean z10, K0.a state, InterfaceC3540l interfaceC3540l, int i10) {
        long j10;
        AbstractC6492s.i(state, "state");
        interfaceC3540l.U(-1763344816);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1763344816, i10, -1, "com.ui.core.ui.component.checkbox.DefaultColors.boxColor (UiCheckbox.kt:104)");
        }
        if (z10) {
            int i11 = a.f65459a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f65453d;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f65455f;
            }
        } else {
            int i12 = a.f65459a[state.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j10 = this.f65454e;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f65455f;
            }
        }
        z1 z1VarA = AbstractC7402u.a(j10, AbstractC7535j.l(200, 0, null, 6, null), "box", null, interfaceC3540l, 432, 8);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }

    @Override // x9.InterfaceC8433c
    public z1 b(boolean z10, K0.a state, InterfaceC3540l interfaceC3540l, int i10) {
        long j10;
        AbstractC6492s.i(state, "state");
        interfaceC3540l.U(-2057890803);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2057890803, i10, -1, "com.ui.core.ui.component.checkbox.DefaultColors.borderColor (UiCheckbox.kt:125)");
        }
        if (z10) {
            int i11 = a.f65459a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f65457h;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f65456g;
            }
        } else {
            int i12 = a.f65459a[state.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j10 = this.f65457h;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f65458i;
            }
        }
        z1 z1VarA = AbstractC7402u.a(j10, AbstractC7535j.l(200, 0, null, 6, null), "border", null, interfaceC3540l, 432, 8);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }

    @Override // x9.InterfaceC8433c
    public z1 c(boolean z10, K0.a state, InterfaceC3540l interfaceC3540l, int i10) {
        long j10;
        AbstractC6492s.i(state, "state");
        interfaceC3540l.U(-931492134);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-931492134, i10, -1, "com.ui.core.ui.component.checkbox.DefaultColors.checkmarkColor (UiCheckbox.kt:83)");
        }
        if (z10) {
            int i11 = a.f65459a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f65450a;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f65451b;
            }
        } else {
            int i12 = a.f65459a[state.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j10 = this.f65452c;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f65451b;
            }
        }
        z1 z1VarA = AbstractC7402u.a(j10, AbstractC7535j.l(200, 0, null, 6, null), "checkmark", null, interfaceC3540l, 432, 8);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }

    private C8432b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f65450a = j10;
        this.f65451b = j11;
        this.f65452c = j12;
        this.f65453d = j13;
        this.f65454e = j14;
        this.f65455f = j15;
        this.f65456g = j16;
        this.f65457h = j17;
        this.f65458i = j18;
    }
}
