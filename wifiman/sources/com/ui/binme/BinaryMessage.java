package com.ui.binme;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class BinaryMessage {

    /* renamed from: c, reason: collision with root package name */
    public static final a f41053c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d.b f41054a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a f41055b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ui/binme/BinaryMessage$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "Compression", "InvalidFormat", "Lcom/ui/binme/BinaryMessage$Error$Compression;", "Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;", "binme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/binme/BinaryMessage$Error$Compression;", "Lcom/ui/binme/BinaryMessage$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "binme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Compression extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public Compression(String str, Throwable th2) {
                super(null);
                this.message = str;
                this.cause = th2;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;", "Lcom/ui/binme/BinaryMessage$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "binme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidFormat extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ InvalidFormat(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public InvalidFormat(String str, Throwable th2) {
                super(null);
                this.message = str;
                this.cause = th2;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ByteOrder a() {
            ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
            AbstractC6492s.h(BIG_ENDIAN, "BIG_ENDIAN");
            return BIG_ENDIAN;
        }

        public final Charset b() {
            return C6510d.f52215b;
        }

        private a() {
        }
    }

    public enum b {
        DISABLED((byte) 0),
        ENABLED((byte) 1);


        /* renamed from: id, reason: collision with root package name */
        private final byte f41060id;

        b(byte b10) {
            this.f41060id = b10;
        }

        public final byte getId$binme_release() {
            return this.f41060id;
        }
    }

    public enum c {
        JSON((byte) 1),
        STRING((byte) 2),
        BINARY((byte) 3);


        /* renamed from: id, reason: collision with root package name */
        private final byte f41061id;

        c(byte b10) {
            this.f41061id = b10;
        }

        public final byte getId$binme_release() {
            return this.f41061id;
        }
    }

    public static abstract class d {

        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            private final c f41062a;

            /* renamed from: b, reason: collision with root package name */
            private final b f41063b;

            /* renamed from: c, reason: collision with root package name */
            private final byte[] f41064c;

            /* renamed from: d, reason: collision with root package name */
            private final f f41065d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c format, b compression, byte[] content) {
                super(null);
                AbstractC6492s.i(format, "format");
                AbstractC6492s.i(compression, "compression");
                AbstractC6492s.i(content, "content");
                this.f41062a = format;
                this.f41063b = compression;
                this.f41064c = content;
                this.f41065d = f.BODY;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public b a() {
                return this.f41063b;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public byte[] b() {
                return this.f41064c;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public c c() {
                return this.f41062a;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public f d() {
                return this.f41065d;
            }
        }

        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            private final c f41066a;

            /* renamed from: b, reason: collision with root package name */
            private final b f41067b;

            /* renamed from: c, reason: collision with root package name */
            private final byte[] f41068c;

            /* renamed from: d, reason: collision with root package name */
            private final f f41069d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c format, b compression, byte[] content) {
                super(null);
                AbstractC6492s.i(format, "format");
                AbstractC6492s.i(compression, "compression");
                AbstractC6492s.i(content, "content");
                this.f41066a = format;
                this.f41067b = compression;
                this.f41068c = content;
                this.f41069d = f.HEADER;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public b a() {
                return this.f41067b;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public byte[] b() {
                return this.f41068c;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public c c() {
                return this.f41066a;
            }

            @Override // com.ui.binme.BinaryMessage.d
            public f d() {
                return this.f41069d;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract b a();

        public abstract byte[] b();

        public abstract c c();

        public abstract f d();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC6492s.d(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.binme.BinaryMessage.Fragment");
            d dVar = (d) obj;
            return d() == dVar.d() && c() == dVar.c() && a() == dVar.a() && Arrays.equals(b(), dVar.b());
        }

        public int hashCode() {
            return (((((d().hashCode() * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + Arrays.hashCode(b());
        }

        private d() {
        }
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41070a = a.f41071a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f41071a = new a();

            private a() {
            }

            public final e a() {
                return new com.ui.binme.a(new com.ui.binme.compress.a());
            }
        }

        byte[] a(BinaryMessage binaryMessage);

        BinaryMessage b(byte[] bArr);
    }

    public enum f {
        HEADER((byte) 1),
        BODY((byte) 2);


        /* renamed from: id, reason: collision with root package name */
        private final byte f41072id;

        f(byte b10) {
            this.f41072id = b10;
        }

        public final byte getId$binme_release() {
            return this.f41072id;
        }
    }

    public BinaryMessage(d.b header, d.a body) {
        AbstractC6492s.i(header, "header");
        AbstractC6492s.i(body, "body");
        this.f41054a = header;
        this.f41055b = body;
    }

    public final d.a a() {
        return this.f41055b;
    }

    public final d.b b() {
        return this.f41054a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BinaryMessage)) {
            return false;
        }
        BinaryMessage binaryMessage = (BinaryMessage) obj;
        return AbstractC6492s.d(this.f41054a, binaryMessage.f41054a) && AbstractC6492s.d(this.f41055b, binaryMessage.f41055b);
    }

    public int hashCode() {
        return (this.f41054a.hashCode() * 31) + this.f41055b.hashCode();
    }

    public String toString() {
        return "BinaryMessage(header=" + this.f41054a + ", body=" + this.f41055b + ")";
    }
}
