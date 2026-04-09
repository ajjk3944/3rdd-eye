package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Ti extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f40184c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40185d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40186e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40187f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40188g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Ti[] f40189h;

    /* renamed from: a, reason: collision with root package name */
    public int f40190a;

    /* renamed from: b, reason: collision with root package name */
    public int f40191b;

    public Ti() {
        a();
    }

    public static Ti[] b() {
        if (f40189h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40189h == null) {
                        f40189h = new Ti[0];
                    }
                } finally {
                }
            }
        }
        return f40189h;
    }

    public final Ti a() {
        this.f40190a = 0;
        this.f40191b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f40190a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i10 = this.f40191b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f40190a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i10 = this.f40191b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ti mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f40190a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f40191b = int32;
                }
            }
        }
        return this;
    }

    public static Ti b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ti().mergeFrom(codedInputByteBufferNano);
    }

    public static Ti a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ti) MessageNano.mergeFrom(new Ti(), bArr);
    }
}
