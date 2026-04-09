package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArrowOrientation.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0164a Companion;
    public static final a BOTTOM = new a("BOTTOM", 0);
    public static final a TOP = new a("TOP", 1);
    public static final a START = new a("START", 2);
    public static final a END = new a("END", 3);

    /* compiled from: ArrowOrientation.kt */
    /* renamed from: S5.a$a, reason: collision with other inner class name */
    public static final class C0164a {

        /* compiled from: ArrowOrientation.kt */
        /* renamed from: S5.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0165a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11914a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11914a = iArr;
            }
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{BOTTOM, TOP, START, END};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        Companion = new C0164a();
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
