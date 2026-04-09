package kb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final a f51369g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f51371b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f51374e;

    /* renamed from: f, reason: collision with root package name */
    private int f51375f;

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f51370a = ByteBuffer.allocate(8);

    /* renamed from: c, reason: collision with root package name */
    private c f51372c = c.INVALID;

    /* renamed from: d, reason: collision with root package name */
    private b f51373d = b.INVALID;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final a Companion;
        private final byte value;
        public static final b INVALID = new b("INVALID", 0, (byte) 0);
        public static final b JSON = new b("JSON", 1, (byte) 1);
        public static final b STRING = new b("STRING", 2, (byte) 2);
        public static final b BINARY = new b("BINARY", 3, (byte) 3);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(byte b10) {
                return b10 == 1 ? b.JSON : b10 == 2 ? b.STRING : b10 == 3 ? b.BINARY : b.INVALID;
            }

            private a() {
            }
        }

        private static final /* synthetic */ b[] $values() {
            return new b[]{INVALID, JSON, STRING, BINARY};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
            Companion = new a(null);
        }

        private b(String str, int i10, byte b10) {
            this.value = b10;
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

        public final byte getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final a Companion;
        private final byte value;
        public static final c INVALID = new c("INVALID", 0, (byte) 0);
        public static final c HEADER = new c("HEADER", 1, (byte) 1);
        public static final c BODY = new c("BODY", 2, (byte) 2);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(byte b10) {
                return b10 == 1 ? c.HEADER : b10 == 2 ? c.BODY : c.INVALID;
            }

            private a() {
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{INVALID, HEADER, BODY};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
            Companion = new a(null);
        }

        private c(String str, int i10, byte b10) {
            this.value = b10;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public final void a(ByteBuffer buffer) {
        AbstractC6492s.i(buffer, "buffer");
        if (this.f51370a.hasRemaining()) {
            byte[] bArr = new byte[Math.min(this.f51370a.remaining(), buffer.remaining())];
            buffer.get(bArr);
            this.f51370a.put(bArr);
        }
        if (this.f51370a.hasRemaining()) {
            return;
        }
        this.f51370a.rewind();
        this.f51372c = c.Companion.a(this.f51370a.get());
        this.f51373d = b.Companion.a(this.f51370a.get());
        this.f51374e = this.f51370a.get() != 0;
        ByteBuffer byteBuffer = this.f51370a;
        byteBuffer.position(byteBuffer.position() + 1);
        this.f51375f = this.f51370a.getInt();
        this.f51371b = true;
    }

    public final int b() {
        return this.f51375f;
    }

    public final boolean c() {
        return this.f51371b;
    }

    public final boolean d() {
        return this.f51374e;
    }
}
