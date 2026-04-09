package Lf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.z;

/* loaded from: classes4.dex */
public interface b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a GET = new a("GET", 0, "GET");
        public static final a POST = new a("POST", 1, "POST");

        /* renamed from: id, reason: collision with root package name */
        private final String f11653id;

        private static final /* synthetic */ a[] $values() {
            return new a[]{GET, POST};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.f11653id = str2;
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

        public final String getId() {
            return this.f11653id;
        }
    }

    z getVersion();
}
