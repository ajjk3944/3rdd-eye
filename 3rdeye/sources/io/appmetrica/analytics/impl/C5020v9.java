package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5020v9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C5020v9[] f41843c;

    /* renamed from: a, reason: collision with root package name */
    public int f41844a;

    /* renamed from: b, reason: collision with root package name */
    public String f41845b;

    public C5020v9() {
        a();
    }

    public static C5020v9[] b() {
        if (f41843c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41843c == null) {
                        f41843c = new C5020v9[0];
                    }
                } finally {
                }
            }
        }
        return f41843c;
    }

    public final C5020v9 a() {
        this.f41844a = 2;
        this.f41845b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f41844a;
        if (i != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return !this.f41845b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f41845b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f41844a;
        if (i != 2) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!this.f41845b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f41845b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5020v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 24) {
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f41844a = int32;
                            break;
                    }
                } else if (tag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f41845b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C5020v9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5020v9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5020v9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5020v9) MessageNano.mergeFrom(new C5020v9(), bArr);
    }
}
