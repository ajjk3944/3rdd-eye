package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class G7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile G7[] f39486k;

    /* renamed from: a, reason: collision with root package name */
    public int f39487a;

    /* renamed from: b, reason: collision with root package name */
    public double f39488b;

    /* renamed from: c, reason: collision with root package name */
    public double f39489c;

    /* renamed from: d, reason: collision with root package name */
    public int f39490d;

    /* renamed from: e, reason: collision with root package name */
    public int f39491e;

    /* renamed from: f, reason: collision with root package name */
    public int f39492f;

    /* renamed from: g, reason: collision with root package name */
    public int f39493g;

    /* renamed from: h, reason: collision with root package name */
    public long f39494h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f39495j;

    public G7() {
        a();
    }

    public static G7[] b() {
        if (f39486k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39486k == null) {
                        f39486k = new G7[0];
                    }
                } finally {
                }
            }
        }
        return f39486k;
    }

    public final G7 a() {
        this.f39487a = -1;
        this.f39488b = -1.0d;
        this.f39489c = -1.0d;
        this.f39490d = -1;
        this.f39491e = -1;
        this.f39492f = -1;
        this.f39493g = -1;
        this.f39494h = -1L;
        this.i = "";
        this.f39495j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f39487a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (Double.doubleToLongBits(this.f39488b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f39488b);
        }
        if (Double.doubleToLongBits(this.f39489c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f39489c);
        }
        int i10 = this.f39490d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        int i11 = this.f39491e;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i11);
        }
        int i12 = this.f39492f;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i12);
        }
        int i13 = this.f39493g;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        long j4 = this.f39494h;
        if (j4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j4);
        }
        if (!this.i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        return !this.f39495j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f39495j) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f39487a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (Double.doubleToLongBits(this.f39488b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f39488b);
        }
        if (Double.doubleToLongBits(this.f39489c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f39489c);
        }
        int i10 = this.f39490d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        int i11 = this.f39491e;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i11);
        }
        int i12 = this.f39492f;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i12);
        }
        int i13 = this.f39493g;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        long j4 = this.f39494h;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j4);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        if (!this.f39495j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f39495j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static G7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f39487a = int32;
                        break;
                    }
                    break;
                case 17:
                    this.f39488b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f39489c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f39490d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f39491e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f39492f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f39493g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f39494h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f39495j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static G7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (G7) MessageNano.mergeFrom(new G7(), bArr);
    }
}
