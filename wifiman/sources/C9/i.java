package C9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f2380a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f2381b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f2382c;

    /* renamed from: d, reason: collision with root package name */
    private final a f2383d;

    /* renamed from: e, reason: collision with root package name */
    private final b f2384e;

    public interface a {

        /* renamed from: C9.i$a$a, reason: collision with other inner class name */
        public static final class C0108a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC7929a f2385a;

            public C0108a(InterfaceC7929a icon) {
                AbstractC6492s.i(icon, "icon");
                this.f2385a = icon;
            }

            public final InterfaceC7929a a() {
                return this.f2385a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0108a) && AbstractC6492s.d(this.f2385a, ((C0108a) obj).f2385a);
            }

            public int hashCode() {
                return this.f2385a.hashCode();
            }

            public String toString() {
                return "Icon(icon=" + this.f2385a + ")";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final s9.d f2386a;

            public b(s9.d text) {
                AbstractC6492s.i(text, "text");
                this.f2386a = text;
            }

            public final s9.d a() {
                return this.f2386a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f2386a, ((b) obj).f2386a);
            }

            public int hashCode() {
                return this.f2386a.hashCode();
            }

            public String toString() {
                return "Text(text=" + this.f2386a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Regular = new b("Regular", 0);
        public static final b Expandable = new b("Expandable", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{Regular, Expandable};
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

    public i(String id2, InterfaceC7929a icon, s9.d message, a aVar, b notificationType) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(icon, "icon");
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(notificationType, "notificationType");
        this.f2380a = id2;
        this.f2381b = icon;
        this.f2382c = message;
        this.f2383d = aVar;
        this.f2384e = notificationType;
    }

    public final a a() {
        return this.f2383d;
    }

    public final InterfaceC7929a b() {
        return this.f2381b;
    }

    public final s9.d c() {
        return this.f2382c;
    }

    public final b d() {
        return this.f2384e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC6492s.d(this.f2380a, iVar.f2380a) && AbstractC6492s.d(this.f2381b, iVar.f2381b) && AbstractC6492s.d(this.f2382c, iVar.f2382c) && AbstractC6492s.d(this.f2383d, iVar.f2383d) && this.f2384e == iVar.f2384e;
    }

    public int hashCode() {
        int iHashCode = ((((this.f2380a.hashCode() * 31) + this.f2381b.hashCode()) * 31) + this.f2382c.hashCode()) * 31;
        a aVar = this.f2383d;
        return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f2384e.hashCode();
    }

    public String toString() {
        return "UiNotificationData(id=" + this.f2380a + ", icon=" + this.f2381b + ", message=" + this.f2382c + ", action=" + this.f2383d + ", notificationType=" + this.f2384e + ")";
    }

    public /* synthetic */ i(String str, InterfaceC7929a interfaceC7929a, s9.d dVar, a aVar, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC7929a, dVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? b.Regular : bVar);
    }
}
