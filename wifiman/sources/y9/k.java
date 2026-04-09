package Y9;

import Li.N;
import dh.InterfaceC5380e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* loaded from: classes3.dex */
public interface k extends W9.f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AUTH = new a("AUTH", 0);
        public static final a DENIED = new a("DENIED", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{AUTH, DENIED};
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

    Object A(InterfaceC5380e interfaceC5380e);

    N K();
}
