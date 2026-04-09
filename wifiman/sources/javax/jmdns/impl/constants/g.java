package javax.jmdns.impl.constants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PROBING_1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g ANNOUNCED;
    public static final g ANNOUNCING_1;
    public static final g ANNOUNCING_2;
    public static final g CANCELED;
    public static final g CANCELING_1;
    public static final g CANCELING_2;
    public static final g CANCELING_3;
    public static final g CLOSED;
    public static final g CLOSING;
    public static final g PROBING_1;
    public static final g PROBING_2;
    public static final g PROBING_3;
    private final String _name;
    private final b _state;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50181a;

        static {
            int[] iArr = new int[g.values().length];
            f50181a = iArr;
            try {
                iArr[g.PROBING_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50181a[g.PROBING_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50181a[g.PROBING_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50181a[g.ANNOUNCING_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50181a[g.ANNOUNCING_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50181a[g.ANNOUNCED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50181a[g.CANCELING_1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50181a[g.CANCELING_2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50181a[g.CANCELING_3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50181a[g.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50181a[g.CLOSING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50181a[g.CLOSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private enum b {
        probing,
        announcing,
        announced,
        canceling,
        canceled,
        closing,
        closed
    }

    private static /* synthetic */ g[] $values() {
        return new g[]{PROBING_1, PROBING_2, PROBING_3, ANNOUNCING_1, ANNOUNCING_2, ANNOUNCED, CANCELING_1, CANCELING_2, CANCELING_3, CANCELED, CLOSING, CLOSED};
    }

    static {
        b bVar = b.probing;
        PROBING_1 = new g("PROBING_1", 0, "probing 1", bVar);
        PROBING_2 = new g("PROBING_2", 1, "probing 2", bVar);
        PROBING_3 = new g("PROBING_3", 2, "probing 3", bVar);
        b bVar2 = b.announcing;
        ANNOUNCING_1 = new g("ANNOUNCING_1", 3, "announcing 1", bVar2);
        ANNOUNCING_2 = new g("ANNOUNCING_2", 4, "announcing 2", bVar2);
        ANNOUNCED = new g("ANNOUNCED", 5, "announced", b.announced);
        b bVar3 = b.canceling;
        CANCELING_1 = new g("CANCELING_1", 6, "canceling 1", bVar3);
        CANCELING_2 = new g("CANCELING_2", 7, "canceling 2", bVar3);
        CANCELING_3 = new g("CANCELING_3", 8, "canceling 3", bVar3);
        CANCELED = new g("CANCELED", 9, "canceled", b.canceled);
        CLOSING = new g("CLOSING", 10, "closing", b.closing);
        CLOSED = new g("CLOSED", 11, "closed", b.closed);
        $VALUES = $values();
    }

    private g(String str, int i10, String str2, b bVar) {
        this._name = str2;
        this._state = bVar;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final g advance() {
        switch (a.f50181a[ordinal()]) {
            case 1:
                return PROBING_2;
            case 2:
                return PROBING_3;
            case 3:
                return ANNOUNCING_1;
            case 4:
                return ANNOUNCING_2;
            case 5:
                return ANNOUNCED;
            case 6:
                return ANNOUNCED;
            case 7:
                return CANCELING_2;
            case 8:
                return CANCELING_3;
            case 9:
                return CANCELED;
            case 10:
                return CANCELED;
            case 11:
                return CLOSED;
            case 12:
                return CLOSED;
            default:
                return this;
        }
    }

    public final boolean isAnnounced() {
        return this._state == b.announced;
    }

    public final boolean isAnnouncing() {
        return this._state == b.announcing;
    }

    public final boolean isCanceled() {
        return this._state == b.canceled;
    }

    public final boolean isCanceling() {
        return this._state == b.canceling;
    }

    public final boolean isClosed() {
        return this._state == b.closed;
    }

    public final boolean isClosing() {
        return this._state == b.closing;
    }

    public final boolean isProbing() {
        return this._state == b.probing;
    }

    public final g revert() {
        switch (a.f50181a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return PROBING_1;
            case 7:
            case 8:
            case 9:
                return CANCELING_1;
            case 10:
                return CANCELED;
            case 11:
                return CLOSING;
            case 12:
                return CLOSED;
            default:
                return this;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this._name;
    }
}
