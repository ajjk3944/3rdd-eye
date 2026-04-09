package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Zn extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f40492e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40493f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40494g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f40495h = 3;
    public static volatile Zn[] i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40496a;

    /* renamed from: b, reason: collision with root package name */
    public int f40497b;

    /* renamed from: c, reason: collision with root package name */
    public C4494ao f40498c;

    /* renamed from: d, reason: collision with root package name */
    public C4520bo f40499d;

    public Zn() {
        a();
    }

    public static Zn[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new Zn[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final Zn a() {
        this.f40496a = WireFormatNano.EMPTY_BYTES;
        this.f40497b = 0;
        this.f40498c = null;
        this.f40499d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f40497b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f40496a) + super.computeSerializedSize();
        C4494ao c4494ao = this.f40498c;
        if (c4494ao != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c4494ao);
        }
        C4520bo c4520bo = this.f40499d;
        return c4520bo != null ? CodedOutputByteBufferNano.computeMessageSize(4, c4520bo) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f40496a);
        codedOutputByteBufferNano.writeInt32(2, this.f40497b);
        C4494ao c4494ao = this.f40498c;
        if (c4494ao != null) {
            codedOutputByteBufferNano.writeMessage(3, c4494ao);
        }
        C4520bo c4520bo = this.f40499d;
        if (c4520bo != null) {
            codedOutputByteBufferNano.writeMessage(4, c4520bo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Zn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40496a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f40497b = int32;
                }
            } else if (tag == 26) {
                if (this.f40498c == null) {
                    this.f40498c = new C4494ao();
                }
                codedInputByteBufferNano.readMessage(this.f40498c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f40499d == null) {
                    this.f40499d = new C4520bo();
                }
                codedInputByteBufferNano.readMessage(this.f40499d);
            }
        }
        return this;
    }

    public static Zn b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Zn().mergeFrom(codedInputByteBufferNano);
    }

    public static Zn a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Zn) MessageNano.mergeFrom(new Zn(), bArr);
    }
}
