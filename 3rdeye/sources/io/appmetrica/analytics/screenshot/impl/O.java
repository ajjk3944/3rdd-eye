package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class O extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile O[] f42518c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f42519a;

    /* renamed from: b, reason: collision with root package name */
    public N f42520b;

    public O() {
        a();
    }

    public static O[] b() {
        if (f42518c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42518c == null) {
                        f42518c = new O[0];
                    }
                } finally {
                }
            }
        }
        return f42518c;
    }

    public final O a() {
        this.f42519a = true;
        this.f42520b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f42519a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        N n9 = this.f42520b;
        return n9 != null ? CodedOutputByteBufferNano.computeMessageSize(2, n9) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f42519a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        N n9 = this.f42520b;
        if (n9 != null) {
            codedOutputByteBufferNano.writeMessage(2, n9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42519a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f42520b == null) {
                    this.f42520b = new N();
                }
                codedInputByteBufferNano.readMessage(this.f42520b);
            }
        }
        return this;
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
