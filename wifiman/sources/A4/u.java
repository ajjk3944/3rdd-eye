package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;

/* loaded from: classes3.dex */
public enum u implements AbstractC5097y.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final AbstractC5097y.b internalValueMap = new AbstractC5097y.b() { // from class: A4.u.a
    };
    private final int value;

    private static final class b implements AbstractC5097y.c {

        /* renamed from: a, reason: collision with root package name */
        static final AbstractC5097y.c f313a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5097y.c
        public boolean a(int i10) {
            return u.forNumber(i10) != null;
        }
    }

    u(int i10) {
        this.value = i10;
    }

    public static u forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    public static AbstractC5097y.b internalGetValueMap() {
        return internalValueMap;
    }

    public static AbstractC5097y.c internalGetVerifier() {
        return b.f313a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static u valueOf(int i10) {
        return forNumber(i10);
    }
}
