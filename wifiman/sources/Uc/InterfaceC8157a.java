package uc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8157a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: uc.a$a, reason: collision with other inner class name */
    public static final class EnumC2226a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC2226a[] $VALUES;
        public static final EnumC2226a TICK = new EnumC2226a("TICK", 0);

        private static final /* synthetic */ EnumC2226a[] $values() {
            return new EnumC2226a[]{TICK};
        }

        static {
            EnumC2226a[] enumC2226aArr$values = $values();
            $VALUES = enumC2226aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC2226aArr$values);
        }

        private EnumC2226a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC2226a valueOf(String str) {
            return (EnumC2226a) Enum.valueOf(EnumC2226a.class, str);
        }

        public static EnumC2226a[] values() {
            return (EnumC2226a[]) $VALUES.clone();
        }
    }

    void a(EnumC2226a enumC2226a);
}
