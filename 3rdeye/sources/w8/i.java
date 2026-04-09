package w8;

import J8.S;
import P7.s;
import P7.t;
import android.app.Activity;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.f;
import i9.InterfaceC4463a;
import kotlin.jvm.internal.l;
import p9.InterfaceC5480a;

/* compiled from: HappyMoment.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.rate.f f47581a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f47582b;

    /* renamed from: c, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f47583c;

    /* renamed from: d, reason: collision with root package name */
    public final S f47584d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HappyMoment.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE = new a("NONE", 0);
        public static final a DEFAULT = new a("DEFAULT", 1);
        public static final a IN_APP_REVIEW = new a("IN_APP_REVIEW", 2);
        public static final a VALIDATE_INTENT = new a("VALIDATE_INTENT", 3);
        public static final a IN_APP_REVIEW_WITH_AD = new a("IN_APP_REVIEW_WITH_AD", 4);
        public static final a VALIDATE_INTENT_WITH_AD = new a("VALIDATE_INTENT_WITH_AD", 5);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NONE, DEFAULT, IN_APP_REVIEW, VALIDATE_INTENT, IN_APP_REVIEW_WITH_AD, VALIDATE_INTENT_WITH_AD};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: HappyMoment.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47585a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47586b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f47587c;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.VALIDATE_INTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.IN_APP_REVIEW_WITH_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VALIDATE_INTENT_WITH_AD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f47585a = iArr;
            int[] iArr2 = new int[f.b.values().length];
            try {
                iArr2[f.b.VALIDATE_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.b.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[f.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f47586b = iArr2;
            int[] iArr3 = new int[f.c.values().length];
            try {
                iArr3[f.c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[f.c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[f.c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f47587c = iArr3;
        }
    }

    /* compiled from: HappyMoment.kt */
    public static final class c extends s {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5480a<C1992A> f47588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC5480a<C1992A> interfaceC5480a) {
            super(0L, 7);
            this.f47588c = interfaceC5480a;
        }

        @Override // P7.s
        public final void b() {
            InterfaceC5480a<C1992A> interfaceC5480a = this.f47588c;
            if (interfaceC5480a != null) {
                interfaceC5480a.invoke();
            }
        }

        @Override // P7.s
        public final void c(t tVar) {
            InterfaceC5480a<C1992A> interfaceC5480a = this.f47588c;
            if (interfaceC5480a != null) {
                interfaceC5480a.invoke();
            }
        }
    }

    public i(com.zipoapps.premiumhelper.ui.rate.f fVar, l8.b bVar, com.zipoapps.premiumhelper.c cVar) {
        this.f47581a = fVar;
        this.f47582b = bVar;
        this.f47583c = cVar;
        B8.c cVar2 = new B8.c(this, 7);
        this.f47584d = new S(new B8.c(cVar2, 2), cVar.g("happy_moment_capping_timestamp"), false);
    }

    public final void a(InterfaceC5480a<C1992A> interfaceC5480a, InterfaceC5480a<C1992A> interfaceC5480a2) {
        com.zipoapps.premiumhelper.c cVar = this.f47583c;
        long jG = cVar.g("happy_moment_counter");
        l8.d<Integer> PH_HAPPY_MOMENT_SKIP_FIRST = i8.d.f38581w;
        l.e(PH_HAPPY_MOMENT_SKIP_FIRST, "PH_HAPPY_MOMENT_SKIP_FIRST");
        if (jG >= ((Number) this.f47582b.h(PH_HAPPY_MOMENT_SKIP_FIRST)).intValue()) {
            this.f47584d.b(new A8.j(3, this, interfaceC5480a), interfaceC5480a2);
        } else {
            interfaceC5480a2.invoke();
        }
        cVar.n(Long.valueOf(jG + 1), "happy_moment_counter");
    }

    public final void b(Activity activity, InterfaceC5480a<C1992A> interfaceC5480a) throws Throwable {
        c cVar = new c(interfaceC5480a);
        l8.d<Boolean> PH_SHOW_INTERSTITIAL_ON_HAPPY_MOMENT = i8.d.f38548a0;
        l.e(PH_SHOW_INTERSTITIAL_ON_HAPPY_MOMENT, "PH_SHOW_INTERSTITIAL_ON_HAPPY_MOMENT");
        if (((Boolean) this.f47582b.h(PH_SHOW_INTERSTITIAL_ON_HAPPY_MOMENT)).booleanValue()) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            ((U7.f) e.a.a().f37035y.f1156b).f(activity, cVar);
        } else if (interfaceC5480a != null) {
            interfaceC5480a.invoke();
        }
    }
}
