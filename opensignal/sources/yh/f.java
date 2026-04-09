package yh;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MICRO_TEST' uses external variables
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
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CONTINUOUS_TEST;
    public static final f CONTINUOUS_TEST_1000_50;
    public static final f CONTINUOUS_TEST_100_50;
    public static final f FIVE_FIVE;
    public static final f FIVE_TWO;
    public static final f HUGE_TEST;
    public static final f LARGE_TEST;
    public static final f MASSIVE_TEST2010;
    public static final f MASSIVE_TEST205;
    public static final f MASSIVE_TEST3010;
    public static final f MASSIVE_TEST3015;
    public static final f MASSIVE_TEST305;
    public static final f MASSIVE_TEST5010;
    public static final f MASSIVE_TEST5025;
    public static final f MASSIVE_TEST505;
    public static final f MEDIUM_LARGE_TEST;
    public static final f MEDIUM_TEST;
    public static final f MICRO_TEST;
    public static final f NR_NSA_TEST_10_1;
    public static final f NR_NSA_TEST_20_1;
    public static final f NR_NSA_TEST_30_1;
    public static final f NR_NSA_TEST_50_1;
    public static final f SMALL_TEST;
    public static final f TEN_TEN;
    public static final f TEN_TWO;
    public static final f THREE_ONE;
    public static final f TWO_TWO;
    private final int bytesToDownload;
    private final int bytesToUpload;
    private final String downloadUrl;

    private static /* synthetic */ f[] $values() {
        return new f[]{MICRO_TEST, SMALL_TEST, MEDIUM_TEST, MEDIUM_LARGE_TEST, THREE_ONE, LARGE_TEST, HUGE_TEST, MASSIVE_TEST2010, MASSIVE_TEST3015, MASSIVE_TEST5025, MASSIVE_TEST205, MASSIVE_TEST305, MASSIVE_TEST505, MASSIVE_TEST3010, MASSIVE_TEST5010, CONTINUOUS_TEST, NR_NSA_TEST_10_1, NR_NSA_TEST_20_1, NR_NSA_TEST_30_1, NR_NSA_TEST_50_1, CONTINUOUS_TEST_100_50, CONTINUOUS_TEST_1000_50, TWO_TWO, FIVE_TWO, TEN_TWO, FIVE_FIVE, TEN_TEN};
    }

    static {
        int i10 = p.f26354a;
        MICRO_TEST = new f("MICRO_TEST", 0, "250KB", i10 * 250, i10 * 250);
        SMALL_TEST = new f("SMALL_TEST", 1, "500KB", i10 * 250, i10 * 500);
        int i11 = p.f26355b;
        MEDIUM_TEST = new f("MEDIUM_TEST", 2, "1MB", i10 * 500, i11);
        MEDIUM_LARGE_TEST = new f("MEDIUM_LARGE_TEST", 3, "2MB", i11, i11 * 2);
        THREE_ONE = new f("THREE_ONE", 4, "3MB", i11, i11 * 3);
        LARGE_TEST = new f("LARGE_TEST", 5, "5MB", i11, i11 * 5);
        HUGE_TEST = new f("HUGE_TEST", 6, "10MB", i11 * 5, i11 * 10);
        MASSIVE_TEST2010 = new f("MASSIVE_TEST2010", 7, "20MB", i11 * 10, i11 * 20);
        MASSIVE_TEST3015 = new f("MASSIVE_TEST3015", 8, "30MB", i11 * 15, i11 * 30);
        MASSIVE_TEST5025 = new f("MASSIVE_TEST5025", 9, "50MB", i11 * 25, i11 * 50);
        MASSIVE_TEST205 = new f("MASSIVE_TEST205", 10, "20MB", i11 * 5, i11 * 20);
        MASSIVE_TEST305 = new f("MASSIVE_TEST305", 11, "30MB", i11 * 5, i11 * 30);
        MASSIVE_TEST505 = new f("MASSIVE_TEST505", 12, "50MB", i11 * 5, i11 * 50);
        MASSIVE_TEST3010 = new f("MASSIVE_TEST3010", 13, "30MB", i11 * 10, i11 * 30);
        MASSIVE_TEST5010 = new f("MASSIVE_TEST5010", 14, "50MB", i11 * 10, i11 * 50);
        int i12 = p.f26356c;
        CONTINUOUS_TEST = new f("CONTINUOUS_TEST", 15, "1GB", i11 * 25, i12);
        NR_NSA_TEST_10_1 = new f("NR_NSA_TEST_10_1", 16, "10MB", i11, i11 * 10);
        NR_NSA_TEST_20_1 = new f("NR_NSA_TEST_20_1", 17, "20MB", i11, i11 * 20);
        NR_NSA_TEST_30_1 = new f("NR_NSA_TEST_30_1", 18, "30MB", i11, i11 * 30);
        NR_NSA_TEST_50_1 = new f("NR_NSA_TEST_50_1", 19, "50MB", i11, i11 * 50);
        CONTINUOUS_TEST_100_50 = new f("CONTINUOUS_TEST_100_50", 20, "100MB", i11 * 50, i11 * 100);
        CONTINUOUS_TEST_1000_50 = new f("CONTINUOUS_TEST_1000_50", 21, "1GB", i11 * 50, i12);
        TWO_TWO = new f("TWO_TWO", 22, "2MB", i11 * 2, i11 * 2);
        FIVE_TWO = new f("FIVE_TWO", 23, "5MB", i11 * 2, i11 * 5);
        TEN_TWO = new f("TEN_TWO", 24, "10MB", i11 * 2, i11 * 10);
        FIVE_FIVE = new f("FIVE_FIVE", 25, "5MB", i11 * 5, i11 * 5);
        TEN_TEN = new f("TEN_TEN", 26, "10MB", i11 * 10, i11 * 10);
        $VALUES = $values();
    }

    private f(String str, int i10, String str2, int i11, int i12) {
        this.downloadUrl = str2;
        this.bytesToUpload = i11;
        this.bytesToDownload = i12;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public int getDownloadByteCount() {
        return this.bytesToDownload;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getUploadByteCount() {
        return this.bytesToUpload;
    }
}
