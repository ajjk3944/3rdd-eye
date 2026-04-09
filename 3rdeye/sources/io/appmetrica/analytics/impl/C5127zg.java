package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5127zg extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f42188e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42189f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42190g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C5127zg[] f42191h;

    /* renamed from: a, reason: collision with root package name */
    public String f42192a;

    /* renamed from: b, reason: collision with root package name */
    public long f42193b;

    /* renamed from: c, reason: collision with root package name */
    public long f42194c;

    /* renamed from: d, reason: collision with root package name */
    public int f42195d;

    public C5127zg() {
        a();
    }

    public static C5127zg[] b() {
        if (f42191h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42191h == null) {
                        f42191h = new C5127zg[0];
                    }
                } finally {
                }
            }
        }
        return f42191h;
    }

    public final C5127zg a() {
        this.f42192a = "";
        this.f42193b = 0L;
        this.f42194c = 0L;
        this.f42195d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f42192a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f42192a);
        }
        long j4 = this.f42193b;
        if (j4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        long j10 = this.f42194c;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i = this.f42195d;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f42192a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f42192a);
        }
        long j4 = this.f42193b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        long j10 = this.f42194c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i = this.f42195d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5127zg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f42192a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f42193b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f42194c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f42195d = int32;
                }
            }
        }
        return this;
    }

    public static C5127zg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5127zg().mergeFrom(codedInputByteBufferNano);
    }

    public static C5127zg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5127zg) MessageNano.mergeFrom(new C5127zg(), bArr);
    }
}
