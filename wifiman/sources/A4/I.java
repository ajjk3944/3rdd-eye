package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;

/* loaded from: classes3.dex */
public enum I implements AbstractC5097y.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final AbstractC5097y.b internalValueMap = new AbstractC5097y.b() { // from class: A4.I.a
    };
    private final int value;

    private static final class b implements AbstractC5097y.c {

        /* renamed from: a, reason: collision with root package name */
        static final AbstractC5097y.c f289a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5097y.c
        public boolean a(int i10) {
            return I.forNumber(i10) != null;
        }
    }

    I(int i10) {
        this.value = i10;
    }

    public static I forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static AbstractC5097y.b internalGetValueMap() {
        return internalValueMap;
    }

    public static AbstractC5097y.c internalGetVerifier() {
        return b.f289a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static I valueOf(int i10) {
        return forNumber(i10);
    }
}
