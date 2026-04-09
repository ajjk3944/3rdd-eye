package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4498b2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f40562c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40563d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40564e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40565f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40566g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f40567h = 5;
    public static final int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f40568j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f40569k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static volatile C4498b2[] f40570l;

    /* renamed from: a, reason: collision with root package name */
    public int f40571a;

    /* renamed from: b, reason: collision with root package name */
    public int f40572b;

    public C4498b2() {
        a();
    }

    public static C4498b2[] b() {
        if (f40570l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40570l == null) {
                        f40570l = new C4498b2[0];
                    }
                } finally {
                }
            }
        }
        return f40570l;
    }

    public final C4498b2 a() {
        this.f40571a = 0;
        this.f40572b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f40572b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f40571a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f40571a);
        codedOutputByteBufferNano.writeInt32(3, this.f40572b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4498b2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4 || int32 == 5) {
                    this.f40571a = int32;
                }
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int322 = codedInputByteBufferNano.readInt32();
                if (int322 == -1 || int322 == 0 || int322 == 1) {
                    this.f40572b = int322;
                }
            }
        }
        return this;
    }

    public static C4498b2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4498b2().mergeFrom(codedInputByteBufferNano);
    }

    public static C4498b2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4498b2) MessageNano.mergeFrom(new C4498b2(), bArr);
    }
}
