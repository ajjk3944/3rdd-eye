package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4957sm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4957sm[] f41649b;

    /* renamed from: a, reason: collision with root package name */
    public int f41650a;

    public C4957sm() {
        a();
    }

    public static C4957sm[] b() {
        if (f41649b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41649b == null) {
                        f41649b = new C4957sm[0];
                    }
                } finally {
                }
            }
        }
        return f41649b;
    }

    public final C4957sm a() {
        this.f41650a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f41650a;
        return i != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f41650a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4957sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41650a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C4957sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4957sm) MessageNano.mergeFrom(new C4957sm(), bArr);
    }

    public static C4957sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4957sm().mergeFrom(codedInputByteBufferNano);
    }
}
