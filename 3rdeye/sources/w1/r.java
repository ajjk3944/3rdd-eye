package w1;

import i9.InterfaceC4463a;

/* compiled from: Transactor.kt */
/* loaded from: classes.dex */
public interface r extends g {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Transactor.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEFERRED = new a("DEFERRED", 0);
        public static final a IMMEDIATE = new a("IMMEDIATE", 1);
        public static final a EXCLUSIVE = new a("EXCLUSIVE", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    Object b(h9.i iVar);

    Object c(a aVar, p9.p pVar, h9.i iVar);
}
