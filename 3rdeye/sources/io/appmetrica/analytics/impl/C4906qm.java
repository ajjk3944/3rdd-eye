package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4906qm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4906qm[] f41493c;

    /* renamed from: a, reason: collision with root package name */
    public String f41494a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f41495b;

    public C4906qm() {
        a();
    }

    public static C4906qm[] b() {
        if (f41493c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41493c == null) {
                        f41493c = new C4906qm[0];
                    }
                } finally {
                }
            }
        }
        return f41493c;
    }

    public final C4906qm a() {
        this.f41494a = "";
        this.f41495b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f41494a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f41494a);
        }
        return !Arrays.equals(this.f41495b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f41495b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f41494a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41494a);
        }
        if (!Arrays.equals(this.f41495b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f41495b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4906qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41494a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41495b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C4906qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4906qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4906qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4906qm) MessageNano.mergeFrom(new C4906qm(), bArr);
    }
}
