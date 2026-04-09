package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4479a9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4479a9[] f40512c;

    /* renamed from: a, reason: collision with root package name */
    public String f40513a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f40514b;

    public C4479a9() {
        a();
    }

    public static C4479a9[] b() {
        if (f40512c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40512c == null) {
                        f40512c = new C4479a9[0];
                    }
                } finally {
                }
            }
        }
        return f40512c;
    }

    public final C4479a9 a() {
        this.f40513a = "";
        this.f40514b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f40513a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f40513a);
        }
        return !Arrays.equals(this.f40514b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f40514b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f40513a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f40513a);
        }
        if (!Arrays.equals(this.f40514b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f40514b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4479a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40513a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40514b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C4479a9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4479a9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4479a9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4479a9) MessageNano.mergeFrom(new C4479a9(), bArr);
    }
}
