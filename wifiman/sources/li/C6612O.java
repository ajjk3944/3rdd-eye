package li;

import Bh.EnumC2496f;
import Uh.c;
import Uh.q;
import Uh.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import pi.N0;

/* renamed from: li.O, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6612O {

    /* renamed from: a, reason: collision with root package name */
    public static final C6612O f52662a = new C6612O();

    /* renamed from: li.O$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52663a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52664b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f52665c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f52666d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f52667e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f52668f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f52669g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f52670h;

        static {
            int[] iArr = new int[Uh.k.values().length];
            try {
                iArr[Uh.k.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Uh.k.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Uh.k.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Uh.k.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52663a = iArr;
            int[] iArr2 = new int[Bh.D.values().length];
            try {
                iArr2[Bh.D.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Bh.D.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Bh.D.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Bh.D.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f52664b = iArr2;
            int[] iArr3 = new int[Uh.x.values().length];
            try {
                iArr3[Uh.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Uh.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Uh.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Uh.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Uh.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Uh.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f52665c = iArr3;
            int[] iArr4 = new int[c.EnumC0834c.values().length];
            try {
                iArr4[c.EnumC0834c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[c.EnumC0834c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[c.EnumC0834c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[c.EnumC0834c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[c.EnumC0834c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[c.EnumC0834c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[c.EnumC0834c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f52666d = iArr4;
            int[] iArr5 = new int[EnumC2496f.values().length];
            try {
                iArr5[EnumC2496f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC2496f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC2496f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC2496f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC2496f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[EnumC2496f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f52667e = iArr5;
            int[] iArr6 = new int[s.c.values().length];
            try {
                iArr6[s.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[s.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[s.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f52668f = iArr6;
            int[] iArr7 = new int[q.b.c.values().length];
            try {
                iArr7[q.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[q.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[q.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[q.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f52669g = iArr7;
            int[] iArr8 = new int[N0.values().length];
            try {
                iArr8[N0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[N0.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[N0.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f52670h = iArr8;
        }
    }

    private C6612O() {
    }

    public final EnumC2496f a(c.EnumC0834c enumC0834c) {
        switch (enumC0834c == null ? -1 : a.f52666d[enumC0834c.ordinal()]) {
        }
        return EnumC2496f.CLASS;
    }

    public final Bh.D b(Uh.k kVar) {
        int i10 = kVar == null ? -1 : a.f52663a[kVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Bh.D.FINAL : Bh.D.SEALED : Bh.D.ABSTRACT : Bh.D.OPEN : Bh.D.FINAL;
    }

    public final N0 c(q.b.c projection) {
        AbstractC6492s.i(projection, "projection");
        int i10 = a.f52669g[projection.ordinal()];
        if (i10 == 1) {
            return N0.IN_VARIANCE;
        }
        if (i10 == 2) {
            return N0.OUT_VARIANCE;
        }
        if (i10 == 3) {
            return N0.INVARIANT;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    public final N0 d(s.c variance) {
        AbstractC6492s.i(variance, "variance");
        int i10 = a.f52668f[variance.ordinal()];
        if (i10 == 1) {
            return N0.IN_VARIANCE;
        }
        if (i10 == 2) {
            return N0.OUT_VARIANCE;
        }
        if (i10 == 3) {
            return N0.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
