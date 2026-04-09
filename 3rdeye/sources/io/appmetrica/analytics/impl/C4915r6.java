package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4915r6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4915r6[] f41532c;

    /* renamed from: a, reason: collision with root package name */
    public int f41533a;

    /* renamed from: b, reason: collision with root package name */
    public String f41534b;

    public C4915r6() {
        a();
    }

    public static C4915r6[] b() {
        if (f41532c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41532c == null) {
                        f41532c = new C4915r6[0];
                    }
                } finally {
                }
            }
        }
        return f41532c;
    }

    public final C4915r6 a() {
        this.f41533a = 0;
        this.f41534b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f41533a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.f41534b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f41534b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f41533a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f41534b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f41534b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4915r6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 3) {
                    this.f41533a = int32;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41534b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4915r6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4915r6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4915r6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4915r6) MessageNano.mergeFrom(new C4915r6(), bArr);
    }
}
