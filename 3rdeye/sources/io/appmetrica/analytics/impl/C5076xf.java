package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5076xf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C5076xf[] f42071f;

    /* renamed from: a, reason: collision with root package name */
    public String f42072a;

    /* renamed from: b, reason: collision with root package name */
    public String f42073b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42074c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42075d;

    /* renamed from: e, reason: collision with root package name */
    public int f42076e;

    public C5076xf() {
        a();
    }

    public static C5076xf[] b() {
        if (f42071f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42071f == null) {
                        f42071f = new C5076xf[0];
                    }
                } finally {
                }
            }
        }
        return f42071f;
    }

    public final C5076xf a() {
        this.f42072a = "";
        this.f42073b = "";
        this.f42074c = false;
        this.f42075d = false;
        this.f42076e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f42072a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f42072a);
        }
        if (!this.f42073b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f42073b);
        }
        boolean z10 = this.f42074c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z10);
        }
        boolean z11 = this.f42075d;
        if (z11) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z11);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f42076e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f42072a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f42072a);
        }
        if (!this.f42073b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f42073b);
        }
        boolean z10 = this.f42074c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(3, z10);
        }
        boolean z11 = this.f42075d;
        if (z11) {
            codedOutputByteBufferNano.writeBool(4, z11);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f42076e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5076xf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5076xf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5076xf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f42072a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f42073b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f42074c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f42075d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f42076e = int32;
                }
            }
        }
        return this;
    }

    public static C5076xf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5076xf) MessageNano.mergeFrom(new C5076xf(), bArr);
    }
}
