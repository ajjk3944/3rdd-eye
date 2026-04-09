package com.marsounjan.icmp4a;

import Yg.A;
import Yg.J;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public abstract class IcmpMessageSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39169a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "icmp4a_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidMessageContentException extends Exception {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        public InvalidMessageContentException(String message) {
            AbstractC6492s.i(message, "message");
            this.message = message;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final byte f39171a;

        /* renamed from: b, reason: collision with root package name */
        private final byte f39172b;

        /* renamed from: c, reason: collision with root package name */
        private final short f39173c;

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f39174d;

        public /* synthetic */ b(byte b10, byte b11, short s10, ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
            this(b10, b11, s10, byteBuffer);
        }

        public final byte a() {
            return this.f39172b;
        }

        public final byte b() {
            return this.f39171a;
        }

        public final ByteBuffer c() {
            return this.f39174d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39171a == bVar.f39171a && this.f39172b == bVar.f39172b && this.f39173c == bVar.f39173c && AbstractC6492s.d(this.f39174d, bVar.f39174d);
        }

        public int hashCode() {
            return (((((A.d(this.f39171a) * 31) + A.d(this.f39172b)) * 31) + Short.hashCode(this.f39173c)) * 31) + this.f39174d.hashCode();
        }

        public String toString() {
            return "MessageHeader(type=" + ((Object) A.g(this.f39171a)) + ", code=" + ((Object) A.g(this.f39172b)) + ", checksum=" + ((int) this.f39173c) + ", typeSpecificHeaderPart=" + this.f39174d + ')';
        }

        private b(byte b10, byte b11, short s10, ByteBuffer typeSpecificHeaderPart) {
            AbstractC6492s.i(typeSpecificHeaderPart, "typeSpecificHeaderPart");
            this.f39171a = b10;
            this.f39172b = b11;
            this.f39173c = s10;
            this.f39174d = typeSpecificHeaderPart;
        }
    }

    private final b c(ByteBuffer byteBuffer) throws InvalidMessageContentException {
        byteBuffer.rewind();
        if (byteBuffer.remaining() < 8) {
            throw new InvalidMessageContentException("Incoming message doesn't match minimal length requirements. Length: " + byteBuffer.remaining() + '}');
        }
        byte b10 = A.b(byteBuffer.get());
        byte b11 = A.b(byteBuffer.get());
        short s10 = byteBuffer.getShort();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteBuffer.array(), 4, 4);
        byteBufferWrap.mark();
        J j10 = J.f24997a;
        AbstractC6492s.h(byteBufferWrap, "apply(...)");
        return new b(b10, b11, s10, byteBufferWrap, null);
    }

    public final Object a(ByteBuffer byteBuffer) throws InvalidMessageContentException {
        AbstractC6492s.i(byteBuffer, "byteBuffer");
        b bVarC = c(byteBuffer);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteBuffer.array(), 8, byteBuffer.limit() - 8);
        byteBufferWrap.mark();
        AbstractC6492s.f(byteBufferWrap);
        return b(bVarC, byteBufferWrap);
    }

    public abstract Object b(b bVar, ByteBuffer byteBuffer);

    protected final ByteBuffer d(byte[] buffer, byte b10, short s10, short s11, byte[] datagram) {
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(datagram, "datagram");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer);
        byteBufferWrap.put(b10);
        byteBufferWrap.put((byte) 0);
        byteBufferWrap.putShort((short) 0);
        byteBufferWrap.putShort(s10);
        byteBufferWrap.putShort(s11);
        byteBufferWrap.put(datagram);
        byteBufferWrap.flip();
        AbstractC6492s.f(byteBufferWrap);
        return byteBufferWrap;
    }

    public abstract ByteBuffer e(Object obj, byte[] bArr, byte[] bArr2);
}
