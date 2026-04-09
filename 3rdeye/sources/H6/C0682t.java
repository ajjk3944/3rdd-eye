package H6;

import N7.C1130d0;
import N7.C1175g0;
import N7.C1242k9;
import N7.C1447z5;
import N7.S2;
import android.os.Build;
import android.view.View;
import b9.C1992A;
import java.util.List;

/* compiled from: DivAccessibilityBinder.kt */
/* renamed from: H6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2226a;

    /* renamed from: b, reason: collision with root package name */
    public final C6.a f2227b;

    /* compiled from: DivAccessibilityBinder.kt */
    /* renamed from: H6.t$a */
    public enum a {
        NONE,
        BUTTON,
        EDIT_TEXT,
        HEADER,
        IMAGE,
        LIST,
        SLIDER,
        SELECT,
        TAB_WIDGET,
        PAGER,
        TEXT,
        RADIO_BUTTON,
        CHECK_BOX
    }

    /* compiled from: DivAccessibilityBinder.kt */
    /* renamed from: H6.t$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2228a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2229b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f2230c;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EDIT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.PAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.SLIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.TAB_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.TEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.CHECK_BOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.RADIO_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f2228a = iArr;
            int[] iArr2 = new int[C1130d0.a.values().length];
            try {
                iArr2[C1130d0.a.EXCLUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[C1130d0.a.MERGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[C1130d0.a.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f2229b = iArr2;
            int[] iArr3 = new int[C1130d0.b.values().length];
            try {
                iArr3[C1130d0.b.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[C1130d0.b.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[C1130d0.b.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[C1130d0.b.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[C1130d0.b.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[C1130d0.b.EDIT_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[C1130d0.b.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[C1130d0.b.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[C1130d0.b.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[C1130d0.b.TAB_BAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[C1130d0.b.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[C1130d0.b.CHECKBOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            f2230c = iArr3;
        }
    }

    /* compiled from: DivAccessibilityBinder.kt */
    /* renamed from: H6.t$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.p<View, M0.g, C1992A> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f2232h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(2);
            this.f2232h = aVar;
        }

        @Override // p9.p
        public final C1992A invoke(View view, M0.g gVar) {
            M0.g gVar2 = gVar;
            if (gVar2 != null) {
                C0682t.a(C0682t.this, gVar2, this.f2232h);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: DivAccessibilityBinder.kt */
    /* renamed from: H6.t$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.p<View, M0.g, C1992A> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f2234h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(2);
            this.f2234h = aVar;
        }

        @Override // p9.p
        public final C1992A invoke(View view, M0.g gVar) {
            M0.g gVar2 = gVar;
            if (gVar2 != null) {
                C0682t.a(C0682t.this, gVar2, this.f2234h);
            }
            return C1992A.f18074a;
        }
    }

    public C0682t(boolean z10, C6.a aVar) {
        this.f2226a = z10;
        this.f2227b = aVar;
    }

    public static final void a(C0682t c0682t, M0.g gVar, a aVar) {
        c0682t.getClass();
        String str = "";
        switch (b.f2228a[aVar.ordinal()]) {
            case 1:
            case 6:
                break;
            case 2:
                str = "android.widget.Button";
                break;
            case 3:
                str = "android.widget.EditText";
                break;
            case 4:
            case 11:
                str = "android.widget.TextView";
                break;
            case 5:
                str = "android.widget.ImageView";
                break;
            case 7:
                str = "androidx.viewpager.widget.ViewPager";
                break;
            case 8:
                str = "android.widget.SeekBar";
                break;
            case 9:
                str = "android.widget.Spinner";
                break;
            case 10:
                str = "android.widget.TabWidget";
                break;
            case 12:
                str = "android.widget.CheckBox";
                break;
            case 13:
                str = "android.widget.RadioButton";
                break;
            default:
                throw new b9.j();
        }
        gVar.j(str);
        if (a.HEADER == aVar) {
            if (Build.VERSION.SDK_INT >= 28) {
                gVar.f4122a.setHeading(true);
            } else {
                gVar.h(2, true);
            }
        }
    }

    public static void b(View view, C1130d0.a aVar, C0675l c0675l, boolean z10) {
        int i = b.f2229b[aVar.ordinal()];
        if (i == 1) {
            view.setImportantForAccessibility(4);
            view.setFocusable(false);
            if (view instanceof O6.p) {
                ((O6.p) view).setFocusableInTouchMode(true);
            }
        } else if (i == 2) {
            view.setImportantForAccessibility(1);
            if (z10) {
                view.setClickable(false);
                view.setLongClickable(false);
                view.setFocusable(false);
            } else {
                view.setFocusable(!(view instanceof O6.y));
            }
        } else if (i == 3) {
            view.setImportantForAccessibility(0);
            view.setFocusable(!(view instanceof O6.y));
        }
        c0675l.getClass();
        kotlin.jvm.internal.l.f(view, "view");
        c0675l.f2158B.put(view, aVar);
    }

    public static C1130d0.a d(S2 s22) {
        C1242k9 c1242k9;
        List<C1175g0> list;
        List<C1175g0> list2;
        List<C1175g0> list3;
        C1447z5 c1447z5;
        List<C1175g0> list4;
        List<C1175g0> list5;
        List<C1175g0> list6;
        return s22 instanceof C1447z5 ? (((C1447z5) s22).f10060a == null && ((list4 = (c1447z5 = (C1447z5) s22).f10080r) == null || list4.isEmpty()) && (((list5 = c1447z5.f10066d) == null || list5.isEmpty()) && ((list6 = c1447z5.f10037D) == null || list6.isEmpty()))) ? C1130d0.a.EXCLUDE : C1130d0.a.DEFAULT : s22 instanceof C1242k9 ? (((C1242k9) s22).f8671a == null && ((list = (c1242k9 = (C1242k9) s22).f8684o) == null || list.isEmpty()) && (((list2 = c1242k9.f8674d) == null || list2.isEmpty()) && ((list3 = c1242k9.f8693x) == null || list3.isEmpty()))) ? C1130d0.a.EXCLUDE : C1130d0.a.DEFAULT : C1130d0.a.DEFAULT;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r5, N7.S2 r6, N7.C1130d0.b r7, A7.d r8) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0682t.c(android.view.View, N7.S2, N7.d0$b, A7.d):void");
    }
}
