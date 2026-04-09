package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4883q extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4883q[] f41442c;

    /* renamed from: a, reason: collision with root package name */
    public long f41443a;

    /* renamed from: b, reason: collision with root package name */
    public int f41444b;

    public C4883q() {
        a();
    }

    public static C4883q[] b() {
        if (f41442c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41442c == null) {
                        f41442c = new C4883q[0];
                    }
                } finally {
                }
            }
        }
        return f41442c;
    }

    public final C4883q a() {
        this.f41443a = 0L;
        this.f41444b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j4 = this.f41443a;
        if (j4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        int i = this.f41444b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f41443a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        int i = this.f41444b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4883q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f41443a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41444b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C4883q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4883q().mergeFrom(codedInputByteBufferNano);
    }

    public static C4883q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4883q) MessageNano.mergeFrom(new C4883q(), bArr);
    }
}
