package com.ui.wifiman.ui.teleport.consoles;

import com.ui.wifiman.ui.teleport.z;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        private final String f45032a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC7929a f45033b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f45034c;

        /* renamed from: d, reason: collision with root package name */
        private final s9.d f45035d;

        /* renamed from: e, reason: collision with root package name */
        private final z f45036e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC1637a f45037f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f45038g;

        /* renamed from: h, reason: collision with root package name */
        private final Boolean f45039h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f45040i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f45041j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.ui.wifiman.ui.teleport.consoles.h$a$a, reason: collision with other inner class name */
        public static final class EnumC1637a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ EnumC1637a[] $VALUES;
            public static final EnumC1637a CONNECTED = new EnumC1637a("CONNECTED", 0);
            public static final EnumC1637a CONNECTABLE = new EnumC1637a("CONNECTABLE", 1);
            public static final EnumC1637a CONNECTION_NOT_POSSIBLE = new EnumC1637a("CONNECTION_NOT_POSSIBLE", 2);

            private static final /* synthetic */ EnumC1637a[] $values() {
                return new EnumC1637a[]{CONNECTED, CONNECTABLE, CONNECTION_NOT_POSSIBLE};
            }

            static {
                EnumC1637a[] enumC1637aArr$values = $values();
                $VALUES = enumC1637aArr$values;
                $ENTRIES = AbstractC5827b.a(enumC1637aArr$values);
            }

            private EnumC1637a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static EnumC1637a valueOf(String str) {
                return (EnumC1637a) Enum.valueOf(EnumC1637a.class, str);
            }

            public static EnumC1637a[] values() {
                return (EnumC1637a[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2, InterfaceC7929a image, s9.d title, s9.d dVar, z zVar, EnumC1637a enumC1637a, boolean z10, Boolean bool, boolean z11, boolean z12) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(image, "image");
            AbstractC6492s.i(title, "title");
            this.f45032a = id2;
            this.f45033b = image;
            this.f45034c = title;
            this.f45035d = dVar;
            this.f45036e = zVar;
            this.f45037f = enumC1637a;
            this.f45038g = z10;
            this.f45039h = bool;
            this.f45040i = z11;
            this.f45041j = z12;
        }

        @Override // com.ui.wifiman.ui.teleport.consoles.h
        public String a() {
            return this.f45032a;
        }

        public final EnumC1637a b() {
            return this.f45037f;
        }

        public final boolean c() {
            return this.f45041j;
        }

        public final InterfaceC7929a d() {
            return this.f45033b;
        }

        public final boolean e() {
            return this.f45040i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f45032a, aVar.f45032a) && AbstractC6492s.d(this.f45033b, aVar.f45033b) && AbstractC6492s.d(this.f45034c, aVar.f45034c) && AbstractC6492s.d(this.f45035d, aVar.f45035d) && this.f45036e == aVar.f45036e && this.f45037f == aVar.f45037f && this.f45038g == aVar.f45038g && AbstractC6492s.d(this.f45039h, aVar.f45039h) && this.f45040i == aVar.f45040i && this.f45041j == aVar.f45041j;
        }

        public final boolean f() {
            return this.f45038g;
        }

        public final z g() {
            return this.f45036e;
        }

        public final s9.d h() {
            return this.f45035d;
        }

        public int hashCode() {
            int iHashCode = ((((this.f45032a.hashCode() * 31) + this.f45033b.hashCode()) * 31) + this.f45034c.hashCode()) * 31;
            s9.d dVar = this.f45035d;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            z zVar = this.f45036e;
            int iHashCode3 = (iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
            EnumC1637a enumC1637a = this.f45037f;
            int iHashCode4 = (((iHashCode3 + (enumC1637a == null ? 0 : enumC1637a.hashCode())) * 31) + Boolean.hashCode(this.f45038g)) * 31;
            Boolean bool = this.f45039h;
            return ((((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.f45040i)) * 31) + Boolean.hashCode(this.f45041j);
        }

        public final s9.d i() {
            return this.f45034c;
        }

        public final Boolean j() {
            return this.f45039h;
        }

        public String toString() {
            return "Console(id=" + this.f45032a + ", image=" + this.f45033b + ", title=" + this.f45034c + ", subtitle=" + this.f45035d + ", reachability=" + this.f45036e + ", connectability=" + this.f45037f + ", invitedByTeleportLink=" + this.f45038g + ", tokenValid=" + this.f45039h + ", inEditMode=" + this.f45040i + ", deletableInEditMode=" + this.f45041j + ")";
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        private final String f45042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id2) {
            super(null);
            AbstractC6492s.i(id2, "id");
            this.f45042a = id2;
        }

        @Override // com.ui.wifiman.ui.teleport.consoles.h
        public String a() {
            return this.f45042a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f45042a, ((b) obj).f45042a);
        }

        public int hashCode() {
            return this.f45042a.hashCode();
        }

        public String toString() {
            return "ConsoleLoading(id=" + this.f45042a + ")";
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        private final String f45043a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f45044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id2, s9.d text) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(text, "text");
            this.f45043a = id2;
            this.f45044b = text;
        }

        @Override // com.ui.wifiman.ui.teleport.consoles.h
        public String a() {
            return this.f45043a;
        }

        public final s9.d b() {
            return this.f45044b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f45043a, cVar.f45043a) && AbstractC6492s.d(this.f45044b, cVar.f45044b);
        }

        public int hashCode() {
            return (this.f45043a.hashCode() * 31) + this.f45044b.hashCode();
        }

        public String toString() {
            return "Header(id=" + this.f45043a + ", text=" + this.f45044b + ")";
        }
    }

    public static final class d extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f45045a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final String f45046b = "account_unauthorized";

        private d() {
            super(null);
        }

        @Override // com.ui.wifiman.ui.teleport.consoles.h
        public String a() {
            return f45046b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 415254696;
        }

        public String toString() {
            return "Unauthorized";
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private h() {
    }
}
