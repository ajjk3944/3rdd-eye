package K6;

import H6.C0672i;
import H6.C0675l;
import N7.B8;
import N7.EnumC1195h5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.T5;
import android.graphics.drawable.Drawable;
import android.view.View;
import i7.l;

/* compiled from: DivInputBinder.kt */
/* renamed from: K6.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759u0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final D f3641c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.f f3642d;

    /* renamed from: e, reason: collision with root package name */
    public final s6.h f3643e;

    /* renamed from: f, reason: collision with root package name */
    public final C0745n f3644f;

    /* renamed from: g, reason: collision with root package name */
    public final C6.a f3645g;

    /* renamed from: h, reason: collision with root package name */
    public final Q6.d f3646h;

    /* compiled from: DivInputBinder.kt */
    /* renamed from: K6.u0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3647a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3648b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f3649c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f3650d;

        static {
            int[] iArr = new int[EnumC1305p2.values().length];
            try {
                iArr[EnumC1305p2.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1305p2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1305p2.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1305p2.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1305p2.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3647a = iArr;
            int[] iArr2 = new int[T5.c.values().length];
            try {
                iArr2[T5.c.SINGLE_LINE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[T5.c.MULTI_LINE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[T5.c.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[T5.c.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[T5.c.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[T5.c.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[T5.c.PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            f3648b = iArr2;
            int[] iArr3 = new int[T5.b.values().length];
            try {
                iArr3[T5.b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[T5.b.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[T5.b.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[T5.b.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[T5.b.GO.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            f3649c = iArr3;
            int[] iArr4 = new int[T5.a.values().length];
            try {
                iArr4[T5.a.SENTENCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[T5.a.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[T5.a.ALL_CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            f3650d = iArr4;
        }
    }

    public C0759u0(D d10, B0.f fVar, s6.h hVar, C0745n c0745n, C6.a aVar, Q6.d dVar) {
        super(d10);
        this.f3641c = d10;
        this.f3642d = fVar;
        this.f3643e = hVar;
        this.f3644f = c0745n;
        this.f3645g = aVar;
        this.f3646h = dVar;
    }

    public static final void m(C0759u0 c0759u0, G6.d dVar, String str, O6.p pVar, C0675l c0675l, A7.d dVar2) {
        c0759u0.getClass();
        boolean zA = dVar.f1935a.a(str);
        l.a aVar = i7.l.f38481a;
        String strValueOf = String.valueOf(zA);
        String str2 = dVar.f1936b;
        aVar.getClass();
        l.a.a(c0675l, str2, strValueOf, dVar2);
        StringBuilder sb = new StringBuilder("Can't find label with id '");
        String str3 = dVar.f1937c;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(B8.j(sb, str3, '\''));
        Q6.c cVarA = c0759u0.f3646h.a(c0675l.getDivData(), c0675l.getDataTag());
        H6.I iB = c0675l.getViewComponent$div_release().b();
        if (!pVar.isLaidOut() || pVar.isLayoutRequested()) {
            pVar.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0761v0(iB, dVar, pVar, zA, cVarA, illegalArgumentException));
            return;
        }
        int iF = iB.f(str3);
        if (iF == -1) {
            cVarA.a(illegalArgumentException);
            return;
        }
        View viewFindViewById = pVar.getRootView().findViewById(iF);
        if (viewFindViewById != null) {
            viewFindViewById.setLabelFor(zA ? -1 : pVar.getId());
        } else {
            cVarA.a(illegalArgumentException);
        }
    }

    public static void o(O6.p pVar, EnumC1305p2 enumC1305p2, EnumC1319q2 enumC1319q2) {
        pVar.setGravity(C0713c.F(enumC1305p2, enumC1319q2));
        int i = enumC1305p2 == null ? -1 : a.f3647a[enumC1305p2.ordinal()];
        int i10 = 5;
        if (i != 1) {
            if (i == 2) {
                i10 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i10 = 6;
            }
        }
        pVar.setTextAlignment(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e4  */
    @Override // H6.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.View r20, H6.C0672i r21, N7.S2 r22, N7.S2 r23, z6.C5865d r24) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C0759u0.e(android.view.View, H6.i, N7.S2, N7.S2, z6.d):void");
    }

    public final void n(O6.p pVar, C0672i c0672i, T5 t52, T5 t53) {
        Drawable nativeBackground$div_release;
        Drawable drawable;
        A7.d dVar = c0672i.f2147b;
        T5.d dVar2 = t52.f6275K;
        int iIntValue = dVar2 != null ? dVar2.f6330a.a(dVar).intValue() : 0;
        if (iIntValue == 0 || (nativeBackground$div_release = pVar.getNativeBackground$div_release()) == null) {
            drawable = null;
        } else {
            nativeBackground$div_release.setTint(iIntValue);
            drawable = nativeBackground$div_release;
        }
        i7.k kVarW = A2.l.w(pVar);
        D d10 = this.f3641c;
        d10.getClass();
        d10.c(pVar, c0672i, t52, t53, kVarW, drawable);
        D.e(pVar, t52, t53, dVar, kVarW);
    }

    public final void p(O6.p pVar, T5 t52, A7.d dVar) {
        A7.b<String> bVar = t52.f6313p;
        String strA = bVar != null ? bVar.a(dVar) : null;
        EnumC1195h5 enumC1195h5A = t52.f6317t.a(dVar);
        A7.b<Long> bVar2 = t52.f6318u;
        pVar.setTypeface(T1.B.m(this.f3642d, strA, enumC1195h5A, bVar2 != null ? bVar2.a(dVar) : null));
    }
}
