package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4812n6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4812n6[] f41302c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41303a;

    /* renamed from: b, reason: collision with root package name */
    public C4915r6 f41304b;

    public C4812n6() {
        a();
    }

    public static C4812n6[] b() {
        if (f41302c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41302c == null) {
                        f41302c = new C4812n6[0];
                    }
                } finally {
                }
            }
        }
        return f41302c;
    }

    public final C4812n6 a() {
        this.f41303a = WireFormatNano.EMPTY_BYTES;
        this.f41304b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f41303a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f41303a);
        }
        C4915r6 c4915r6 = this.f41304b;
        return c4915r6 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c4915r6) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f41303a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f41303a);
        }
        C4915r6 c4915r6 = this.f41304b;
        if (c4915r6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4915r6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4812n6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41303a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f41304b == null) {
                    this.f41304b = new C4915r6();
                }
                codedInputByteBufferNano.readMessage(this.f41304b);
            }
        }
        return this;
    }

    public static C4812n6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4812n6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4812n6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4812n6) MessageNano.mergeFrom(new C4812n6(), bArr);
    }
}
