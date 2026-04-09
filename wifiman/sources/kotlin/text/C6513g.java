package kotlin.text;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;

/* renamed from: kotlin.text.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6513g {

    /* renamed from: d, reason: collision with root package name */
    public static final b f52237d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final C6513g f52238e;

    /* renamed from: f, reason: collision with root package name */
    private static final C6513g f52239f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f52240a;

    /* renamed from: b, reason: collision with root package name */
    private final a f52241b;

    /* renamed from: c, reason: collision with root package name */
    private final c f52242c;

    /* renamed from: kotlin.text.g$a */
    public static final class a {

        /* renamed from: j, reason: collision with root package name */
        public static final C1930a f52243j = new C1930a(null);

        /* renamed from: k, reason: collision with root package name */
        private static final a f52244k = new a(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID, "  ", "", "", "");

        /* renamed from: a, reason: collision with root package name */
        private final int f52245a;

        /* renamed from: b, reason: collision with root package name */
        private final int f52246b;

        /* renamed from: c, reason: collision with root package name */
        private final String f52247c;

        /* renamed from: d, reason: collision with root package name */
        private final String f52248d;

        /* renamed from: e, reason: collision with root package name */
        private final String f52249e;

        /* renamed from: f, reason: collision with root package name */
        private final String f52250f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f52251g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f52252h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f52253i;

        /* renamed from: kotlin.text.g$a$a, reason: collision with other inner class name */
        public static final class C1930a {
            public /* synthetic */ C1930a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f52244k;
            }

            private C1930a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            AbstractC6492s.i(groupSeparator, "groupSeparator");
            AbstractC6492s.i(byteSeparator, "byteSeparator");
            AbstractC6492s.i(bytePrefix, "bytePrefix");
            AbstractC6492s.i(byteSuffix, "byteSuffix");
            this.f52245a = i10;
            this.f52246b = i11;
            this.f52247c = groupSeparator;
            this.f52248d = byteSeparator;
            this.f52249e = bytePrefix;
            this.f52250f = byteSuffix;
            this.f52251g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f52252h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f52253i = AbstractC6514h.b(groupSeparator) || AbstractC6514h.b(byteSeparator) || AbstractC6514h.b(bytePrefix) || AbstractC6514h.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            AbstractC6492s.i(sb2, "sb");
            AbstractC6492s.i(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f52245a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f52246b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f52247c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f52248d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f52249e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f52250f);
            sb2.append("\"");
            return sb2;
        }

        public final String c() {
            return this.f52249e;
        }

        public final String d() {
            return this.f52248d;
        }

        public final String e() {
            return this.f52250f;
        }

        public final int f() {
            return this.f52246b;
        }

        public final int g() {
            return this.f52245a;
        }

        public final String h() {
            return this.f52247c;
        }

        public final boolean i() {
            return this.f52251g;
        }

        public final boolean j() {
            return this.f52252h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: kotlin.text.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6513g a() {
            return C6513g.f52238e;
        }

        private b() {
        }
    }

    /* renamed from: kotlin.text.g$c */
    public static final class c {

        /* renamed from: h, reason: collision with root package name */
        public static final a f52254h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        private static final c f52255i = new c("", "", false, 1);

        /* renamed from: a, reason: collision with root package name */
        private final String f52256a;

        /* renamed from: b, reason: collision with root package name */
        private final String f52257b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f52258c;

        /* renamed from: d, reason: collision with root package name */
        private final int f52259d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f52260e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f52261f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f52262g;

        /* renamed from: kotlin.text.g$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f52255i;
            }

            private a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            AbstractC6492s.i(prefix, "prefix");
            AbstractC6492s.i(suffix, "suffix");
            this.f52256a = prefix;
            this.f52257b = suffix;
            this.f52258c = z10;
            this.f52259d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f52260e = z11;
            this.f52261f = z11 && i10 == 1;
            this.f52262g = AbstractC6514h.b(prefix) || AbstractC6514h.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            AbstractC6492s.i(sb2, "sb");
            AbstractC6492s.i(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f52256a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f52257b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f52258c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f52259d);
            return sb2;
        }

        public final boolean c() {
            return this.f52262g;
        }

        public final String d() {
            return this.f52256a;
        }

        public final String e() {
            return this.f52257b;
        }

        public final boolean f() {
            return this.f52260e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C1930a c1930a = a.f52243j;
        a aVarA = c1930a.a();
        c.a aVar = c.f52254h;
        f52238e = new C6513g(false, aVarA, aVar.a());
        f52239f = new C6513g(true, c1930a.a(), aVar.a());
    }

    public C6513g(boolean z10, a bytes, c number) {
        AbstractC6492s.i(bytes, "bytes");
        AbstractC6492s.i(number, "number");
        this.f52240a = z10;
        this.f52241b = bytes;
        this.f52242c = number;
    }

    public final a b() {
        return this.f52241b;
    }

    public final c c() {
        return this.f52242c;
    }

    public final boolean d() {
        return this.f52240a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f52240a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f52241b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f52242c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
