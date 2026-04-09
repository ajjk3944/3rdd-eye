package y7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8621a {
    ETHERNET(0),
    WIFI(1);

    public static final C2356a Companion = new C2356a(null);
    private final int value;

    /* renamed from: y7.a$a, reason: collision with other inner class name */
    public static final class C2356a {
        public /* synthetic */ C2356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC8621a a(int i10) {
            EnumC8621a enumC8621a;
            EnumC8621a[] enumC8621aArrValues = EnumC8621a.values();
            int length = enumC8621aArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC8621a = null;
                    break;
                }
                enumC8621a = enumC8621aArrValues[i11];
                if (enumC8621a.getValue() == i10) {
                    break;
                }
                i11++;
            }
            return enumC8621a == null ? EnumC8621a.ETHERNET : enumC8621a;
        }

        private C2356a() {
        }
    }

    EnumC8621a(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
