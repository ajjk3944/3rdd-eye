package Te;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import ma.AbstractC6784a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class N {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ N[] $VALUES;
    public static final N PRIMARY = new N("PRIMARY", 0);
    public static final N COMPARE_1 = new N("COMPARE_1", 1);
    public static final N COMPARE_2 = new N("COMPARE_2", 2);
    public static final N COMPARE_3 = new N("COMPARE_3", 3);
    public static final N COMPARE_4 = new N("COMPARE_4", 4);
    public static final N COMPARE_5 = new N("COMPARE_5", 5);
    public static final N SECONDARY = new N("SECONDARY", 6);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21734a;

        static {
            int[] iArr = new int[N.values().length];
            try {
                iArr[N.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N.COMPARE_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N.COMPARE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N.COMPARE_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[N.COMPARE_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[N.COMPARE_5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[N.SECONDARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f21734a = iArr;
        }
    }

    private static final /* synthetic */ N[] $values() {
        return new N[]{PRIMARY, COMPARE_1, COMPARE_2, COMPARE_3, COMPARE_4, COMPARE_5, SECONDARY};
    }

    static {
        N[] nArr$values = $values();
        $VALUES = nArr$values;
        $ENTRIES = AbstractC5827b.a(nArr$values);
    }

    private N(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }

    /* renamed from: getColor-vNxB06k, reason: not valid java name */
    public final long m2getColorvNxB06k(AbstractC6784a palette) {
        AbstractC6492s.i(palette, "palette");
        switch (a.f21734a[ordinal()]) {
            case 1:
                return palette.a().j();
            case 2:
                return palette.a().a().f();
            case 3:
                return palette.a().k().f();
            case 4:
                return palette.a().f().f();
            case 5:
                return palette.a().a().h();
            case 6:
                return palette.a().e().f();
            case 7:
                return palette.a().g().i();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
