package we;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* renamed from: we.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8332b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: we.b$a */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASE64 = new a("BASE64", 0);

        private static final /* synthetic */ a[] $values() {
            return new a[]{BASE64};
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

    String a(byte[] bArr);

    byte[] b(String str);
}
