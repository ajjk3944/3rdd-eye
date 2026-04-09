package Td;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.i;
import gg.z;

/* loaded from: classes4.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Td.a$a, reason: collision with other inner class name */
    public static final class EnumC0795a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC0795a[] $VALUES;
        public static final EnumC0795a DIRECT = new EnumC0795a("DIRECT", 0);
        public static final EnumC0795a WEBRTC = new EnumC0795a("WEBRTC", 1);

        private static final /* synthetic */ EnumC0795a[] $values() {
            return new EnumC0795a[]{DIRECT, WEBRTC};
        }

        static {
            EnumC0795a[] enumC0795aArr$values = $values();
            $VALUES = enumC0795aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC0795aArr$values);
        }

        private EnumC0795a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0795a valueOf(String str) {
            return (EnumC0795a) Enum.valueOf(EnumC0795a.class, str);
        }

        public static EnumC0795a[] values() {
            return (EnumC0795a[]) $VALUES.clone();
        }
    }

    i a();

    EnumC0795a b();

    z c(String str, String str2);

    String d();

    i e();

    i f();
}
