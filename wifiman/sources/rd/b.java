package rd;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f60258a;

        /* renamed from: b, reason: collision with root package name */
        private final int f60259b;

        /* renamed from: c, reason: collision with root package name */
        private final String f60260c;

        /* renamed from: d, reason: collision with root package name */
        private final String f60261d;

        /* renamed from: e, reason: collision with root package name */
        private final S8.g f60262e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC2104a f60263f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: rd.b$a$a, reason: collision with other inner class name */
        public static final class EnumC2104a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ EnumC2104a[] $VALUES;
            public static final EnumC2104a PHONE_IOS = new EnumC2104a("PHONE_IOS", 0);
            public static final EnumC2104a PHONE_ANDROID = new EnumC2104a("PHONE_ANDROID", 1);
            public static final EnumC2104a TABLE_IOS = new EnumC2104a("TABLE_IOS", 2);
            public static final EnumC2104a TABLET_ANDROID = new EnumC2104a("TABLET_ANDROID", 3);

            private static final /* synthetic */ EnumC2104a[] $values() {
                return new EnumC2104a[]{PHONE_IOS, PHONE_ANDROID, TABLE_IOS, TABLET_ANDROID};
            }

            static {
                EnumC2104a[] enumC2104aArr$values = $values();
                $VALUES = enumC2104aArr$values;
                $ENTRIES = AbstractC5827b.a(enumC2104aArr$values);
            }

            private EnumC2104a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static EnumC2104a valueOf(String str) {
                return (EnumC2104a) Enum.valueOf(EnumC2104a.class, str);
            }

            public static EnumC2104a[] values() {
                return (EnumC2104a[]) $VALUES.clone();
            }
        }

        public a(inet.ipaddr.g ipAddress, int i10, String name, String str, S8.g gVar, EnumC2104a enumC2104a) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(name, "name");
            this.f60258a = ipAddress;
            this.f60259b = i10;
            this.f60260c = name;
            this.f60261d = str;
            this.f60262e = gVar;
            this.f60263f = enumC2104a;
        }

        public final String a() {
            return String.valueOf(this.f60258a);
        }

        public final inet.ipaddr.g b() {
            return this.f60258a;
        }

        public final String c() {
            return this.f60261d;
        }

        public final String d() {
            return this.f60260c;
        }

        public final int e() {
            return this.f60259b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC6492s.d(aVar.f60258a, this.f60258a) && aVar.f60259b == this.f60259b && AbstractC6492s.d(aVar.f60260c, this.f60260c) && AbstractC6492s.d(aVar.f60261d, this.f60261d) && aVar.f60263f == this.f60263f) {
                    return true;
                }
            }
            return false;
        }

        public final EnumC2104a f() {
            return this.f60263f;
        }

        public final S8.g g() {
            return this.f60262e;
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "A2A Speedtest Endpoint - " + this.f60260c + "(id:" + a() + ",host:" + this.f60258a + ",port:" + this.f60259b + ",type:" + this.f60263f + ")";
        }
    }

    gg.i a();
}
