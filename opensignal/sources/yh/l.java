package yh;

/* loaded from: classes.dex */
public enum l {
    MICRO_TEST(0),
    SMALL_TEST(1),
    MEDIUM_TEST(2),
    MEDIUM_LARGE_TEST(6),
    LARGE_TEST(3),
    HUGE_TEST(4),
    CONTINUOUS_TEST(5),
    MASSIVE_TEST2010(7),
    MASSIVE_TEST3015(8),
    MASSIVE_TEST5025(9),
    MASSIVE_TEST205(17),
    MASSIVE_TEST305(18),
    MASSIVE_TEST505(19),
    MASSIVE_TEST3010(20),
    MASSIVE_TEST5010(21),
    THREE_ONE(10),
    NR_NSA_TEST_10_1(11),
    NR_NSA_TEST_20_1(12),
    NR_NSA_TEST_30_1(13),
    NR_NSA_TEST_50_1(14),
    CONTINUOUS_TEST_100_50(15),
    CONTINUOUS_TEST_1000_50(16),
    TWO_TWO(22),
    FIVE_TWO(23),
    TEN_TWO(24),
    FIVE_FIVE(25),
    TEN_TEN(26);

    private int numberValue;

    l(int i10) {
        this.numberValue = i10;
    }

    public static l getTestSizeFromInt(int i10) {
        for (l lVar : values()) {
            if (lVar.getNumberValue() == i10) {
                return lVar;
            }
        }
        return b.f26247a;
    }

    public int getNumberValue() {
        return this.numberValue;
    }
}
