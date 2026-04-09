package ka;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* renamed from: ka.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6411a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ka.a$a, reason: collision with other inner class name */
    public static final class EnumC1899a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1899a[] $VALUES;
        public static final EnumC1899a TICK = new EnumC1899a("TICK", 0);

        private static final /* synthetic */ EnumC1899a[] $values() {
            return new EnumC1899a[]{TICK};
        }

        static {
            EnumC1899a[] enumC1899aArr$values = $values();
            $VALUES = enumC1899aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1899aArr$values);
        }

        private EnumC1899a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1899a valueOf(String str) {
            return (EnumC1899a) Enum.valueOf(EnumC1899a.class, str);
        }

        public static EnumC1899a[] values() {
            return (EnumC1899a[]) $VALUES.clone();
        }
    }

    void a(EnumC1899a enumC1899a);
}
