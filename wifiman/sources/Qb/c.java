package Qb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19278a;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19278a = iArr;
        }
    }

    public static final String a(S8.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        int i10 = a.f19278a[cVar.ordinal()];
        if (i10 == 1) {
            return "2";
        }
        if (i10 == 2) {
            return "5";
        }
        if (i10 == 3) {
            return "6";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final S8.c b(String id2) {
        AbstractC6492s.i(id2, "id");
        int iHashCode = id2.hashCode();
        if (iHashCode != 50) {
            if (iHashCode != 53) {
                if (iHashCode == 54 && id2.equals("6")) {
                    return S8.c.GHZ_6;
                }
            } else if (id2.equals("5")) {
                return S8.c.GHZ_5;
            }
        } else if (id2.equals("2")) {
            return S8.c.GHZ_2_4;
        }
        throw new IllegalStateException("unknown WifiBand `" + id2 + "`");
    }
}
