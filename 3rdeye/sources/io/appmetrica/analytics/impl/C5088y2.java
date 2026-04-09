package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5088y2 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C5088y2[] f42099f;

    /* renamed from: a, reason: collision with root package name */
    public int f42100a;

    /* renamed from: b, reason: collision with root package name */
    public String f42101b;

    /* renamed from: c, reason: collision with root package name */
    public String f42102c;

    /* renamed from: d, reason: collision with root package name */
    public long f42103d;

    /* renamed from: e, reason: collision with root package name */
    public long f42104e;

    public C5088y2() {
        a();
    }

    public static C5088y2[] b() {
        if (f42099f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42099f == null) {
                        f42099f = new C5088y2[0];
                    }
                } finally {
                }
            }
        }
        return f42099f;
    }

    public final C5088y2 a() {
        this.f42100a = 1;
        this.f42101b = "";
        this.f42102c = "";
        this.f42103d = 0L;
        this.f42104e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f42104e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f42103d) + CodedOutputByteBufferNano.computeStringSize(3, this.f42102c) + CodedOutputByteBufferNano.computeStringSize(2, this.f42101b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f42100a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f42100a);
        codedOutputByteBufferNano.writeString(2, this.f42101b);
        codedOutputByteBufferNano.writeString(3, this.f42102c);
        codedOutputByteBufferNano.writeUInt64(4, this.f42103d);
        codedOutputByteBufferNano.writeUInt64(5, this.f42104e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5088y2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5088y2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5088y2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f42100a = int32;
                }
            } else if (tag == 18) {
                this.f42101b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f42102c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f42103d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42104e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C5088y2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5088y2) MessageNano.mergeFrom(new C5088y2(), bArr);
    }
}
