package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BalloonCenterAlign.kt */
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m START = new m("START", 0);
    public static final m END = new m("END", 1);
    public static final m TOP = new m("TOP", 2);
    public static final m BOTTOM = new m("BOTTOM", 3);

    /* compiled from: BalloonCenterAlign.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11985a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11985a = iArr;
        }
    }

    private static final /* synthetic */ m[] $values() {
        return new m[]{START, END, TOP, BOTTOM};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(mVarArr$values);
    }

    private m(String str, int i) {
    }

    public static InterfaceC4463a<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final k toAlign() {
        int i = a.f11985a[ordinal()];
        if (i == 1) {
            return k.START;
        }
        if (i == 2) {
            return k.END;
        }
        if (i == 3) {
            return k.TOP;
        }
        if (i == 4) {
            return k.BOTTOM;
        }
        throw new b9.j();
    }
}
