package Pb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f18561c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f18562a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18563b;

    public static final class a {

        /* renamed from: Pb.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0655a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18564a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.LAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.BLUETOOTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f18564a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(b bVar) {
            int i10 = C0655a.f18564a[bVar.ordinal()];
            if (i10 == 1) {
                return "lan";
            }
            if (i10 == 2) {
                return "bluetooth";
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b LAN = new b("LAN", 0);
        public static final b BLUETOOTH = new b("BLUETOOTH", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{LAN, BLUETOOTH};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public h(int i10, String tabId) {
        AbstractC6492s.i(tabId, "tabId");
        this.f18562a = i10;
        this.f18563b = tabId;
    }

    public final int a() {
        return this.f18562a;
    }

    public final b b() {
        String str = this.f18563b;
        if (AbstractC6492s.d(str, "lan")) {
            return b.LAN;
        }
        if (AbstractC6492s.d(str, "bluetooth")) {
            return b.BLUETOOTH;
        }
        throw new IllegalStateException("unexpected value in tab - `" + this.f18563b + "`");
    }

    public final String c() {
        return this.f18563b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18562a == hVar.f18562a && AbstractC6492s.d(this.f18563b, hVar.f18563b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f18562a) * 31) + this.f18563b.hashCode();
    }

    public String toString() {
        return "RoomDiscoveryHomeConfig(id=" + this.f18562a + ", tabId=" + this.f18563b + ")";
    }

    public /* synthetic */ h(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(b tab) {
        this(0, f18561c.b(tab), 1, null);
        AbstractC6492s.i(tab, "tab");
    }
}
