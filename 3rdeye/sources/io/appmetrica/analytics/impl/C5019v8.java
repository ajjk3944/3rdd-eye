package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5019v8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C5019v8[] f41838e;

    /* renamed from: a, reason: collision with root package name */
    public E8 f41839a;

    /* renamed from: b, reason: collision with root package name */
    public G8 f41840b;

    /* renamed from: c, reason: collision with root package name */
    public C5069x8 f41841c;

    /* renamed from: d, reason: collision with root package name */
    public D8 f41842d;

    public C5019v8() {
        a();
    }

    public static C5019v8[] b() {
        if (f41838e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41838e == null) {
                        f41838e = new C5019v8[0];
                    }
                } finally {
                }
            }
        }
        return f41838e;
    }

    public final C5019v8 a() {
        this.f41839a = null;
        this.f41840b = null;
        this.f41841c = null;
        this.f41842d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        E8 e82 = this.f41839a;
        if (e82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, e82);
        }
        G8 g82 = this.f41840b;
        if (g82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, g82);
        }
        C5069x8 c5069x8 = this.f41841c;
        if (c5069x8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5069x8);
        }
        D8 d82 = this.f41842d;
        return d82 != null ? CodedOutputByteBufferNano.computeMessageSize(4, d82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        E8 e82 = this.f41839a;
        if (e82 != null) {
            codedOutputByteBufferNano.writeMessage(1, e82);
        }
        G8 g82 = this.f41840b;
        if (g82 != null) {
            codedOutputByteBufferNano.writeMessage(2, g82);
        }
        C5069x8 c5069x8 = this.f41841c;
        if (c5069x8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5069x8);
        }
        D8 d82 = this.f41842d;
        if (d82 != null) {
            codedOutputByteBufferNano.writeMessage(4, d82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5019v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f41839a == null) {
                    this.f41839a = new E8();
                }
                codedInputByteBufferNano.readMessage(this.f41839a);
            } else if (tag == 18) {
                if (this.f41840b == null) {
                    this.f41840b = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f41840b);
            } else if (tag == 26) {
                if (this.f41841c == null) {
                    this.f41841c = new C5069x8();
                }
                codedInputByteBufferNano.readMessage(this.f41841c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f41842d == null) {
                    this.f41842d = new D8();
                }
                codedInputByteBufferNano.readMessage(this.f41842d);
            }
        }
        return this;
    }

    public static C5019v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5019v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5019v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5019v8) MessageNano.mergeFrom(new C5019v8(), bArr);
    }
}
