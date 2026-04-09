package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4918r9 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f41554j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f41555k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f41556l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C4918r9[] f41557m;

    /* renamed from: a, reason: collision with root package name */
    public double f41558a;

    /* renamed from: b, reason: collision with root package name */
    public double f41559b;

    /* renamed from: c, reason: collision with root package name */
    public long f41560c;

    /* renamed from: d, reason: collision with root package name */
    public int f41561d;

    /* renamed from: e, reason: collision with root package name */
    public int f41562e;

    /* renamed from: f, reason: collision with root package name */
    public int f41563f;

    /* renamed from: g, reason: collision with root package name */
    public int f41564g;

    /* renamed from: h, reason: collision with root package name */
    public int f41565h;
    public String i;

    public C4918r9() {
        a();
    }

    public static C4918r9[] b() {
        if (f41557m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41557m == null) {
                        f41557m = new C4918r9[0];
                    }
                } finally {
                }
            }
        }
        return f41557m;
    }

    public final C4918r9 a() {
        this.f41558a = 0.0d;
        this.f41559b = 0.0d;
        this.f41560c = 0L;
        this.f41561d = 0;
        this.f41562e = 0;
        this.f41563f = 0;
        this.f41564g = 0;
        this.f41565h = 0;
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f41559b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f41558a) + super.computeSerializedSize();
        long j4 = this.f41560c;
        if (j4 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j4);
        }
        int i = this.f41561d;
        if (i != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
        }
        int i10 = this.f41562e;
        if (i10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        int i11 = this.f41563f;
        if (i11 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i11);
        }
        int i12 = this.f41564g;
        if (i12 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i12);
        }
        int i13 = this.f41565h;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i13);
        }
        return !this.i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.i) + iComputeDoubleSize : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f41558a);
        codedOutputByteBufferNano.writeDouble(2, this.f41559b);
        long j4 = this.f41560c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j4);
        }
        int i = this.f41561d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i);
        }
        int i10 = this.f41562e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        int i11 = this.f41563f;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i11);
        }
        int i12 = this.f41564g;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i12);
        }
        int i13 = this.f41565h;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i13);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4918r9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4918r9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4918r9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 9) {
                this.f41558a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f41559b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f41560c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f41561d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f41562e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f41563f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f41564g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f41565h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4918r9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4918r9) MessageNano.mergeFrom(new C4918r9(), bArr);
    }
}
