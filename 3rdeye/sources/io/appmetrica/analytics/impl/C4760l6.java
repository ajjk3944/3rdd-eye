package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4760l6 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C4760l6[] f41172d;

    /* renamed from: a, reason: collision with root package name */
    public C4734k6 f41173a;

    /* renamed from: b, reason: collision with root package name */
    public String f41174b;

    /* renamed from: c, reason: collision with root package name */
    public int f41175c;

    public C4760l6() {
        a();
    }

    public static C4760l6[] b() {
        if (f41172d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41172d == null) {
                        f41172d = new C4760l6[0];
                    }
                } finally {
                }
            }
        }
        return f41172d;
    }

    public final C4760l6 a() {
        this.f41173a = null;
        this.f41174b = "";
        this.f41175c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4734k6 c4734k6 = this.f41173a;
        if (c4734k6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4734k6);
        }
        if (!this.f41174b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f41174b);
        }
        int i = this.f41175c;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4734k6 c4734k6 = this.f41173a;
        if (c4734k6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4734k6);
        }
        if (!this.f41174b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f41174b);
        }
        int i = this.f41175c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4760l6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f41173a == null) {
                    this.f41173a = new C4734k6();
                }
                codedInputByteBufferNano.readMessage(this.f41173a);
            } else if (tag == 18) {
                this.f41174b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f41175c = int32;
                }
            }
        }
        return this;
    }

    public static C4760l6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4760l6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4760l6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4760l6) MessageNano.mergeFrom(new C4760l6(), bArr);
    }
}
