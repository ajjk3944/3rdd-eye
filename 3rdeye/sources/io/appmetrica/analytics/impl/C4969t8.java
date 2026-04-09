package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4969t8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4969t8[] f41673c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41674a;

    /* renamed from: b, reason: collision with root package name */
    public C5069x8 f41675b;

    public C4969t8() {
        a();
    }

    public static C4969t8[] b() {
        if (f41673c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41673c == null) {
                        f41673c = new C4969t8[0];
                    }
                } finally {
                }
            }
        }
        return f41673c;
    }

    public final C4969t8 a() {
        this.f41674a = WireFormatNano.EMPTY_BYTES;
        this.f41675b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f41674a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f41674a);
        }
        C5069x8 c5069x8 = this.f41675b;
        return c5069x8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5069x8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f41674a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f41674a);
        }
        C5069x8 c5069x8 = this.f41675b;
        if (c5069x8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5069x8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4969t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41674a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f41675b == null) {
                    this.f41675b = new C5069x8();
                }
                codedInputByteBufferNano.readMessage(this.f41675b);
            }
        }
        return this;
    }

    public static C4969t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4969t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4969t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4969t8) MessageNano.mergeFrom(new C4969t8(), bArr);
    }
}
