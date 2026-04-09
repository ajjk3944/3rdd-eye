package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5101yf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C5101yf[] f42138d;

    /* renamed from: a, reason: collision with root package name */
    public String f42139a;

    /* renamed from: b, reason: collision with root package name */
    public String f42140b;

    /* renamed from: c, reason: collision with root package name */
    public int f42141c;

    public C5101yf() {
        a();
    }

    public static C5101yf[] b() {
        if (f42138d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42138d == null) {
                        f42138d = new C5101yf[0];
                    }
                } finally {
                }
            }
        }
        return f42138d;
    }

    public final C5101yf a() {
        this.f42139a = "";
        this.f42140b = "";
        this.f42141c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f42139a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f42139a);
        }
        if (!this.f42140b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f42140b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f42141c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f42139a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f42139a);
        }
        if (!this.f42140b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f42140b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f42141c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5101yf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f42139a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f42140b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f42141c = int32;
                }
            }
        }
        return this;
    }

    public static C5101yf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5101yf().mergeFrom(codedInputByteBufferNano);
    }

    public static C5101yf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5101yf) MessageNano.mergeFrom(new C5101yf(), bArr);
    }
}
