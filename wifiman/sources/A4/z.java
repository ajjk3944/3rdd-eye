package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;

/* loaded from: classes3.dex */
public enum z implements AbstractC5097y.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final AbstractC5097y.b internalValueMap = new AbstractC5097y.b() { // from class: A4.z.a
    };
    private final int value;

    private static final class b implements AbstractC5097y.c {

        /* renamed from: a, reason: collision with root package name */
        static final AbstractC5097y.c f319a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5097y.c
        public boolean a(int i10) {
            return z.forNumber(i10) != null;
        }
    }

    z(int i10) {
        this.value = i10;
    }

    public static z forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static AbstractC5097y.b internalGetValueMap() {
        return internalValueMap;
    }

    public static AbstractC5097y.c internalGetVerifier() {
        return b.f319a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static z valueOf(int i10) {
        return forNumber(i10);
    }
}
