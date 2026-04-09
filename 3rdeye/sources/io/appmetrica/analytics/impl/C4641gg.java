package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4641gg extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f40938e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40939f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40940g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C4641gg[] f40941h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40942a;

    /* renamed from: b, reason: collision with root package name */
    public long f40943b;

    /* renamed from: c, reason: collision with root package name */
    public long f40944c;

    /* renamed from: d, reason: collision with root package name */
    public int f40945d;

    public C4641gg() {
        a();
    }

    public static C4641gg[] b() {
        if (f40941h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40941h == null) {
                        f40941h = new C4641gg[0];
                    }
                } finally {
                }
            }
        }
        return f40941h;
    }

    public final C4641gg a() {
        this.f40942a = WireFormatNano.EMPTY_BYTES;
        this.f40943b = 0L;
        this.f40944c = 0L;
        this.f40945d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f40942a) + super.computeSerializedSize();
        long j4 = this.f40943b;
        if (j4 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        long j10 = this.f40944c;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i = this.f40945d;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f40942a);
        long j4 = this.f40943b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        long j10 = this.f40944c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i = this.f40945d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4641gg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40942a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f40943b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f40944c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f40945d = int32;
                }
            }
        }
        return this;
    }

    public static C4641gg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4641gg().mergeFrom(codedInputByteBufferNano);
    }

    public static C4641gg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4641gg) MessageNano.mergeFrom(new C4641gg(), bArr);
    }
}
