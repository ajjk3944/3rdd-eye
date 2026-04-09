package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5119z8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C5119z8[] f42167c;

    /* renamed from: a, reason: collision with root package name */
    public int f42168a;

    /* renamed from: b, reason: collision with root package name */
    public C5019v8 f42169b;

    public C5119z8() {
        a();
    }

    public static C5119z8[] b() {
        if (f42167c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42167c == null) {
                        f42167c = new C5119z8[0];
                    }
                } finally {
                }
            }
        }
        return f42167c;
    }

    public final C5119z8 a() {
        this.f42168a = 0;
        this.f42169b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f42168a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C5019v8 c5019v8 = this.f42169b;
        return c5019v8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5019v8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f42168a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C5019v8 c5019v8 = this.f42169b;
        if (c5019v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5019v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5119z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42168a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f42169b == null) {
                    this.f42169b = new C5019v8();
                }
                codedInputByteBufferNano.readMessage(this.f42169b);
            }
        }
        return this;
    }

    public static C5119z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5119z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5119z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5119z8) MessageNano.mergeFrom(new C5119z8(), bArr);
    }
}
