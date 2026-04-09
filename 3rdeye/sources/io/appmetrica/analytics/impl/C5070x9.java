package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5070x9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f42056d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42057e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42058f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C5070x9[] f42059g;

    /* renamed from: a, reason: collision with root package name */
    public A9 f42060a;

    /* renamed from: b, reason: collision with root package name */
    public String f42061b;

    /* renamed from: c, reason: collision with root package name */
    public int f42062c;

    public C5070x9() {
        a();
    }

    public static C5070x9[] b() {
        if (f42059g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42059g == null) {
                        f42059g = new C5070x9[0];
                    }
                } finally {
                }
            }
        }
        return f42059g;
    }

    public final C5070x9 a() {
        this.f42060a = null;
        this.f42061b = "";
        this.f42062c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        A9 a92 = this.f42060a;
        if (a92 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, a92);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f42061b) + iComputeSerializedSize;
        int i = this.f42062c;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i) + iComputeStringSize : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        A9 a92 = this.f42060a;
        if (a92 != null) {
            codedOutputByteBufferNano.writeMessage(1, a92);
        }
        codedOutputByteBufferNano.writeString(2, this.f42061b);
        int i = this.f42062c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5070x9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f42060a == null) {
                    this.f42060a = new A9();
                }
                codedInputByteBufferNano.readMessage(this.f42060a);
            } else if (tag == 18) {
                this.f42061b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f42062c = int32;
                }
            }
        }
        return this;
    }

    public static C5070x9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5070x9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5070x9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5070x9) MessageNano.mergeFrom(new C5070x9(), bArr);
    }
}
