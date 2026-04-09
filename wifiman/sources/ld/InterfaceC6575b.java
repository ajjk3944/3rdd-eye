package ld;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.i;

/* renamed from: ld.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6575b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ld.b$a */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INIT = new a("INIT", 0);
        public static final a DB = new a("DB", 1);
        public static final a LOGGING_START = new a("LOGGING_START", 2);
        public static final a FINISHED = new a("FINISHED", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{INIT, DB, LOGGING_START, FINISHED};
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

    i a();

    AbstractC5912b b();
}
