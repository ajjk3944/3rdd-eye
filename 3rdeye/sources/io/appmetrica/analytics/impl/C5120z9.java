package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5120z9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C5120z9[] f42170e;

    /* renamed from: a, reason: collision with root package name */
    public int f42171a;

    /* renamed from: b, reason: collision with root package name */
    public int f42172b;

    /* renamed from: c, reason: collision with root package name */
    public String f42173c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42174d;

    public C5120z9() {
        a();
    }

    public static C5120z9[] b() {
        if (f42170e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42170e == null) {
                        f42170e = new C5120z9[0];
                    }
                } finally {
                }
            }
        }
        return f42170e;
    }

    public final C5120z9 a() {
        this.f42171a = 0;
        this.f42172b = 0;
        this.f42173c = "";
        this.f42174d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f42171a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i10 = this.f42172b;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i10);
        }
        if (!this.f42173c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f42173c);
        }
        boolean z10 = this.f42174d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f42171a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i10 = this.f42172b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i10);
        }
        if (!this.f42173c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f42173c);
        }
        boolean z10 = this.f42174d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5120z9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42171a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f42172b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f42173c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42174d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5120z9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5120z9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5120z9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5120z9) MessageNano.mergeFrom(new C5120z9(), bArr);
    }
}
