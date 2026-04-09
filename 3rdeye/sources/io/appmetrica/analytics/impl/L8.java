package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class L8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f39749g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f39750h = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f39751j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f39752k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f39753l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f39754m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f39755n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile L8[] f39756o;

    /* renamed from: a, reason: collision with root package name */
    public int f39757a;

    /* renamed from: b, reason: collision with root package name */
    public K8 f39758b;

    /* renamed from: c, reason: collision with root package name */
    public I8 f39759c;

    /* renamed from: d, reason: collision with root package name */
    public J8 f39760d;

    /* renamed from: e, reason: collision with root package name */
    public C4994u8 f39761e;

    /* renamed from: f, reason: collision with root package name */
    public A8 f39762f;

    public L8() {
        a();
    }

    public static L8[] b() {
        if (f39756o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39756o == null) {
                        f39756o = new L8[0];
                    }
                } finally {
                }
            }
        }
        return f39756o;
    }

    public final L8 a() {
        this.f39757a = 0;
        this.f39758b = null;
        this.f39759c = null;
        this.f39760d = null;
        this.f39761e = null;
        this.f39762f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f39757a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        K8 k82 = this.f39758b;
        if (k82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, k82);
        }
        I8 i82 = this.f39759c;
        if (i82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, i82);
        }
        J8 j82 = this.f39760d;
        if (j82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, j82);
        }
        C4994u8 c4994u8 = this.f39761e;
        if (c4994u8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4994u8);
        }
        A8 a82 = this.f39762f;
        return a82 != null ? CodedOutputByteBufferNano.computeMessageSize(6, a82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f39757a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        K8 k82 = this.f39758b;
        if (k82 != null) {
            codedOutputByteBufferNano.writeMessage(2, k82);
        }
        I8 i82 = this.f39759c;
        if (i82 != null) {
            codedOutputByteBufferNano.writeMessage(3, i82);
        }
        J8 j82 = this.f39760d;
        if (j82 != null) {
            codedOutputByteBufferNano.writeMessage(4, j82);
        }
        C4994u8 c4994u8 = this.f39761e;
        if (c4994u8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4994u8);
        }
        A8 a82 = this.f39762f;
        if (a82 != null) {
            codedOutputByteBufferNano.writeMessage(6, a82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f39757a = int32;
                            break;
                    }
                } else if (tag == 18) {
                    if (this.f39758b == null) {
                        this.f39758b = new K8();
                    }
                    codedInputByteBufferNano.readMessage(this.f39758b);
                } else if (tag == 26) {
                    if (this.f39759c == null) {
                        this.f39759c = new I8();
                    }
                    codedInputByteBufferNano.readMessage(this.f39759c);
                } else if (tag == 34) {
                    if (this.f39760d == null) {
                        this.f39760d = new J8();
                    }
                    codedInputByteBufferNano.readMessage(this.f39760d);
                } else if (tag == 42) {
                    if (this.f39761e == null) {
                        this.f39761e = new C4994u8();
                    }
                    codedInputByteBufferNano.readMessage(this.f39761e);
                } else if (tag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    if (this.f39762f == null) {
                        this.f39762f = new A8();
                    }
                    codedInputByteBufferNano.readMessage(this.f39762f);
                }
            }
        }
        return this;
    }

    public static L8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (L8) MessageNano.mergeFrom(new L8(), bArr);
    }
}
