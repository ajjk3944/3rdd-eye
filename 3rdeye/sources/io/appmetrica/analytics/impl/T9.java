package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class T9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f40161c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40162d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40163e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40164f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40165g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f40166h = 5;
    public static final int i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile T9[] f40167j;

    /* renamed from: a, reason: collision with root package name */
    public int f40168a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f40169b;

    public T9() {
        a();
    }

    public static T9[] b() {
        if (f40167j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40167j == null) {
                        f40167j = new T9[0];
                    }
                } finally {
                }
            }
        }
        return f40167j;
    }

    public final T9 a() {
        this.f40168a = 0;
        this.f40169b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f40168a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        return !Arrays.equals(this.f40169b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f40169b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f40168a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!Arrays.equals(this.f40169b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f40169b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                            this.f40168a = int32;
                            break;
                    }
                } else if (tag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f40169b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static T9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T9().mergeFrom(codedInputByteBufferNano);
    }

    public static T9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T9) MessageNano.mergeFrom(new T9(), bArr);
    }
}
