package li;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: li.P, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6613P {

    /* renamed from: li.P$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52671a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52672b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f52673c;

        static {
            int[] iArr = new int[Uh.j.values().length];
            try {
                iArr[Uh.j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Uh.j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Uh.j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Uh.j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52671a = iArr;
            int[] iArr2 = new int[InterfaceC2492b.a.values().length];
            try {
                iArr2[InterfaceC2492b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC2492b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC2492b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC2492b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f52672b = iArr2;
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
            f52673c = iArr3;
        }
    }

    public static final AbstractC2510u a(C6612O c6612o, Uh.x xVar) {
        AbstractC6492s.i(c6612o, "<this>");
        switch (xVar == null ? -1 : a.f52673c[xVar.ordinal()]) {
            case 1:
                AbstractC2510u INTERNAL = AbstractC2509t.f1795d;
                AbstractC6492s.h(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC2510u PRIVATE = AbstractC2509t.f1792a;
                AbstractC6492s.h(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC2510u PRIVATE_TO_THIS = AbstractC2509t.f1793b;
                AbstractC6492s.h(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC2510u PROTECTED = AbstractC2509t.f1794c;
                AbstractC6492s.h(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC2510u PUBLIC = AbstractC2509t.f1796e;
                AbstractC6492s.h(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC2510u LOCAL = AbstractC2509t.f1797f;
                AbstractC6492s.h(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC2510u PRIVATE2 = AbstractC2509t.f1792a;
                AbstractC6492s.h(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final InterfaceC2492b.a b(C6612O c6612o, Uh.j jVar) {
        AbstractC6492s.i(c6612o, "<this>");
        int i10 = jVar == null ? -1 : a.f52671a[jVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC2492b.a.DECLARATION : InterfaceC2492b.a.SYNTHESIZED : InterfaceC2492b.a.DELEGATION : InterfaceC2492b.a.FAKE_OVERRIDE : InterfaceC2492b.a.DECLARATION;
    }
}
