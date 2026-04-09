package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4520bo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C4520bo[] f40597e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40598a;

    /* renamed from: b, reason: collision with root package name */
    public double f40599b;

    /* renamed from: c, reason: collision with root package name */
    public double f40600c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40601d;

    public C4520bo() {
        a();
    }

    public static C4520bo[] b() {
        if (f40597e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40597e == null) {
                        f40597e = new C4520bo[0];
                    }
                } finally {
                }
            }
        }
        return f40597e;
    }

    public final C4520bo a() {
        this.f40598a = WireFormatNano.EMPTY_BYTES;
        this.f40599b = 0.0d;
        this.f40600c = 0.0d;
        this.f40601d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f40598a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f40598a);
        }
        if (Double.doubleToLongBits(this.f40599b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f40599b);
        }
        if (Double.doubleToLongBits(this.f40600c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f40600c);
        }
        boolean z10 = this.f40601d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f40598a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f40598a);
        }
        if (Double.doubleToLongBits(this.f40599b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f40599b);
        }
        if (Double.doubleToLongBits(this.f40600c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f40600c);
        }
        boolean z10 = this.f40601d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4520bo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40598a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f40599b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f40600c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40601d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C4520bo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4520bo().mergeFrom(codedInputByteBufferNano);
    }

    public static C4520bo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4520bo) MessageNano.mergeFrom(new C4520bo(), bArr);
    }
}
