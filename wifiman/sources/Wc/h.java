package wc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* loaded from: classes4.dex */
public interface h {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IDLE = new a("IDLE", 0);
        public static final a SCANNING = new a("SCANNING", 1);
        public static final a PAUSED = new a("PAUSED", 2);
        public static final a UNAVAILABLE = new a("UNAVAILABLE", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{IDLE, SCANNING, PAUSED, UNAVAILABLE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    gg.i a(f fVar);
}
